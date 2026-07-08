package X;

import Y.ARunnableS128S0100000_28;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.play.core.appupdate.b;
import com.google.android.play.core.appupdate.c;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.journey.INUJPushService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.awemepushapi.IPushApi;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10Xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19261310Xb {
    public static boolean LIZIZ;
    public static long LIZJ;
    public static boolean LIZLLL;
    public static final C19261310Xb LIZ = new C19261310Xb();
    public static final IMSAdaptionService LJ = (IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class);
    public static boolean LJFF = true;

    public static void LIZ(BaseActivity baseActivity, Bundle bundle) {
        Bundle extras;
        Bundle extras2;
        LIZJ = System.currentTimeMillis();
        C0X35.LIZ("main_helper_assem_oncreate_part_2_1", false);
        if (((Boolean) C283050B7n.LIZ.getValue()).booleanValue()) {
            C19261410Xc c19261410Xc = C19261410Xc.LJI;
            c19261410Xc.getClass();
            if (Intrinsics.LJFF(baseActivity.getClass().getCanonicalName(), "com.ss.android.ugc.aweme.main.MainActivity")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = jCurrentTimeMillis - c19261410Xc.LJFF;
                if (bundle == null || j <= 0 || j >= TimeUnit.SECONDS.toMillis(2L)) {
                    c19261410Xc.LJFF = jCurrentTimeMillis;
                    if (c19261410Xc.LIZLLL) {
                        c19261410Xc.LJII(new C2344009Gk(), null, EnumC19261510Xd.MAIN.getValue());
                    } else {
                        String value = EnumC19261510Xd.MAIN.getValue();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJ(Boolean.TRUE, "is_invalid_report");
                        c19261410Xc.LJII(c2344009Gk, Boolean.valueOf(c19261410Xc.LIZ), value);
                    }
                    c19261410Xc.LIZLLL = false;
                    c19261410Xc.LJ = null;
                }
            }
        }
        C0X35.LJIIJJI("main_helper_assem_oncreate_part_2_1", false);
        C0X35.LIZ("main_helper_assem_oncreate_part_2_2", false);
        Intent intent = baseActivity.getIntent();
        if (intent != null) {
            try {
                if (intent.getExtras() != null) {
                    C1380890m2R.LJIIIZ(intent);
                    try {
                        extras = intent.getExtras();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        extras = null;
                    }
                    String string = extras.getString("payload");
                    try {
                        extras2 = intent.getExtras();
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        extras2 = null;
                    }
                    String string2 = extras2.getString("from");
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        ((IPushApi) ServiceManager.get().getService(IPushApi.class)).onGcmNotificationClick(jSONObject, baseActivity, jSONObject.optInt(FollowStatusChangeMethod.PARAM_UID, 0), string2, jSONObject.optInt("pass_through", 1), null);
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
        C0X35.LJIIJJI("main_helper_assem_oncreate_part_2_2", false);
        if (((Boolean) C2274271E0b.LIZJ.getValue()).booleanValue()) {
            ((ArrayList) C1590040rTm.LIZ).add(new ARunnableS128S0100000_28(baseActivity, 67));
        } else {
            C0X35.LIZ("main_helper_assem_oncreate_part_2_3", false);
            C19261910Xh.LIZ.getClass();
            C813020Vuu c813020VuuLJIIL = C813020Vuu.LJIIL();
            C844470XAv.LIZ.getClass();
            if (c813020VuuLJIIL.LIZIZ(C844470XAv.LIZ(), "KEY_UPDATE_IN_PROGRESS", false)) {
                if (C19261910Xh.LIZIZ == null) {
                    C19261910Xh.LIZIZ = c.LIZ(C786410Ut5.L3(baseActivity));
                }
                C19262110Xj c19262110Xj = C19262110Xj.LIZ;
                b bVar = C19261910Xh.LIZIZ;
                if (bVar != null) {
                    bVar.LIZ();
                }
                C19261910Xh.LIZJ = c19262110Xj;
            }
            ((ShareService) ServiceManager.get().getService(ShareService.class)).LJJJJJL().LIZ();
            LJ.LJI(baseActivity);
            C0X35.LJIIJJI("main_helper_assem_oncreate_part_2_3", false);
        }
        INUJPushService iNUJPushService = (INUJPushService) PluggableExtentionKt.pluggableSpi$default(INUJPushService.class, false, false, false, 14, null);
        if (iNUJPushService != null && iNUJPushService.LJIIJJI()) {
            iNUJPushService.LIZLLL(baseActivity, "compensate", false, true, null);
        }
    }
}
