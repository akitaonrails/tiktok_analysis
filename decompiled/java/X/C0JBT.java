package X;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JBT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JBT extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Activity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JBT(Activity activity) {
        super(0);
        this.LL = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String strLJIJJ;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        Activity activity = this.LL;
        try {
            C1589360rSg.LJFF = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
            I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
            if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null) {
                strLJIJJ = null;
            } else {
                C844470XAv.LIZ.getClass();
                strLJIJJ = i18nManagerServiceApiLIZ.LJIJJ(C844470XAv.LIZ());
            }
            C1589360rSg.LJI = strLJIJJ;
            Application application = ((C19EG) activity).getApplication();
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: X.0JBS
                public static void LIZ(Intent intent) {
                    String action;
                    String stringExtra = null;
                    if (intent != null) {
                        action = intent.getAction();
                    } else {
                        action = null;
                    }
                    if (Intrinsics.LJFF(action, "android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
                        try {
                            stringExtra = intent.getStringExtra("reason");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (Intrinsics.LJFF("recentapps", stringExtra)) {
                            C1589360rSg.LJII = Long.valueOf(System.currentTimeMillis());
                        }
                    }
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    if (!C2214201BlK.LJIIJJI && intent != null) {
                        if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                            C2188191AkT.LIZIZ();
                        }
                    }
                    if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        LIZ(intent);
                    } else {
                        C2408409cA.LIZ();
                        LIZ(intent);
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            C189200o6.m2constructorimpl(C838410Wul.LJFF(application, broadcastReceiver, intentFilter, 4));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
