package X;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012790cSj implements InterfaceC1026740cpE {
    public final String LIZ;
    public final String LIZIZ;

    @Override // X.InterfaceC1026740cpE
    public final void LIZ(C1026830cpN c1026830cpN, C1026670cp7 c1026670cp7) {
    }

    @Override // X.InterfaceC1026740cpE
    public final void LIZIZ(C1025880cnq c1025880cnq, C1025520cnG c1025520cnG) {
    }

    @Override // X.InterfaceC1026740cpE
    public final void LIZLLL(C1026830cpN c1026830cpN) {
    }

    @C14EU
    public final void onEvent(C1034540d1o c1034540d1o) {
        Object obj;
        if (c1034540d1o.LIZIZ != 1) {
            return;
        }
        try {
            if (Intrinsics.LJFF(c1034540d1o.LIZ, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(this.LIZ), "product_id"))) {
                Uri.Builder builderBuildUpon = UriProtector.parse(this.LIZ).buildUpon();
                builderBuildUpon.appendQueryParameter("init_question", this.LIZIZ);
                builderBuildUpon.appendQueryParameter("start_click_time", String.valueOf(System.currentTimeMillis()));
                String string = builderBuildUpon.toString();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("top activity -> ");
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                Activity activityLIZIZ = null;
                if (abstractC1387200mCcLJ != null) {
                    obj = abstractC1387200mCcLJ.LIZ;
                } else {
                    obj = null;
                }
                sbLIZ.append(obj);
                C2188811AlT.LIZIZ(sbLIZ);
                AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ2 != null) {
                    activityLIZIZ = abstractC1387200mCcLJ2.LIZIZ();
                }
                SmartRouter.buildRoute(activityLIZIZ, string).open();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C622680Oba.LIZLLL(this);
    }

    public C1012790cSj(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    @Override // X.InterfaceC1026740cpE
    public final void LIZJ(C1026830cpN c1026830cpN, C1026670cp7 c1026670cp7) {
        if (!Intrinsics.LJFF(c1026830cpN.LIZ, "in_app")) {
            return;
        }
        C622680Oba.LIZJ(this);
    }
}
