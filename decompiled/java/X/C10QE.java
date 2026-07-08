package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.10QE, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10QE implements C010U {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LJ;
    public static final C10QE LIZ = new C10QE();
    public static Function0<Unit> LIZLLL = AFwS217S0000000_28.get$arr$(646);

    @Override // X.C010U
    public final String getName() {
        return "open_current_deeplink";
    }

    @Override // X.C010U
    public final void LIZ(String str) throws Throwable {
        C19EG c19egLIZIZ;
        String scheme;
        Intent intent;
        C10H4 c10h4;
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        if (C10RS.LIZ().LIZ) {
            return;
        }
        C726540Sei c726540Sei = BaseActivity.Companion;
        InterfaceC21503119Dh interfaceC21503119Dh = new InterfaceC21503119Dh() { // from class: X.10PB
            @Override // X.InterfaceC21503119Dh
            public final Context LIZJ(Context context) {
                return context;
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJFF() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJII() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJIL(Activity activity, Context context) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJI(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIFFI(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJII(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIII() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIJ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIJZLJL(BaseActivity baseActivity, boolean z) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIZ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIIJI(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIIJIL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIL(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJL(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJLIJ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIL(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIZ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJ(BaseActivity baseActivity, Configuration configuration) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJI() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJIL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJ(BaseActivity baseActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJI() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJIZL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJJ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJJL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void finish() {
            }

            @Override // X.InterfaceC21503119Dh
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                return false;
            }

            @Override // X.InterfaceC21503119Dh
            public final void onRestoreInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void onUserInteraction() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void u1(int i, Intent intent2) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void onActivityResult(int i, int i2, Intent intent2) {
                if (i == 123) {
                    C10QE.LIZ.getClass();
                    C10QE.LIZIZ = false;
                    C10QE.LIZLLL.invoke();
                    if (C10QE.LIZJ) {
                        C10PO.LIZ.getClass();
                        C10P6 c10p6 = C10PO.LIZIZ;
                        if (c10p6 != null) {
                            c10p6.LIZ();
                        }
                    }
                }
            }
        };
        c726540Sei.getClass();
        C726540Sei.LIZ(interfaceC21503119Dh);
        Uri uri = C010O.LIZ;
        if (uri != null) {
            C10SW.LIZ.LJII(uri);
        }
        C10PO.LIZ.getClass();
        C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
        if (c1912470zrpLIZ != null && (c10h4 = c1912470zrpLIZ.LIZ) != null) {
            c19egLIZIZ = c10h4.LIZIZ();
        } else {
            c19egLIZIZ = null;
        }
        IDeepLinkService iDeepLinkService = (IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class);
        if (uri != null) {
            scheme = uri.getScheme();
        } else {
            scheme = null;
        }
        if (iDeepLinkService.LJJIIZI(scheme)) {
            Class<? extends Activity> clsLJIIL = C19248710Sf.LIZIZ.LJIIL("OpenLinkFunctionAbility");
            if (clsLJIIL == null) {
                return;
            } else {
                intent = new Intent(c19egLIZIZ, clsLJIIL);
            }
        } else {
            Class<? extends Activity> clsLJIIJ = C19248710Sf.LIZIZ.LJIIJ();
            if (clsLJIIJ == null) {
                return;
            } else {
                intent = new Intent(c19egLIZIZ, clsLJIIJ);
            }
        }
        intent.setFlags(536870912);
        intent.setAction("android.intent.action.VIEW");
        C0XI4 c0xi4 = new C0XI4(String.valueOf(uri));
        c0xi4.LJ("random", new Random(1000L).toString());
        intent.setData(UriProtector.parse(c0xi4.LJFF()));
        intent.putExtra("new_user_journey", true);
        intent.putExtra("inner_from", "new_user_journey");
        C10SW.LIZ.LJIIIIZZ();
        LIZIZ = true;
        if (c19egLIZIZ != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19egLIZIZ, intent, "Activity_startActivityForResult_2");
            C1701330uNH.LIZ(intent, c19egLIZIZ);
            C2204961BRm.LLJJJJJIL(123, intent, c19egLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbZnH2yd4PvattamNYBfj6Ar+WXwGCs7B2l/iPRnWuZCUHzw4gTc01LA+KV82", null));
        }
    }
}
