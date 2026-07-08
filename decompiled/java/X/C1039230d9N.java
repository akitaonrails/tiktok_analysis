package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.bullet.business.WalletBusiness;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0d9N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039230d9N implements C1ER0 {
    public final /* synthetic */ C1039050d95 LIZ;

    @Override // X.C1ER0
    public final Context LIZJ(Context context) {
        return context;
    }

    @Override // X.C1ER0
    public final void LIZLLL() {
    }

    @Override // X.C1ER0
    public final void LJ() {
    }

    @Override // X.C1ER0
    public final void LJFF() {
    }

    @Override // X.C1ER0
    public final void LJIIIIZZ() {
    }

    @Override // X.C1ER0
    public final void LJIIIZ() {
    }

    @Override // X.C1ER0
    public final void LJIIJJI() {
    }

    @Override // X.C1ER0
    public final void LJIIL() {
    }

    @Override // X.C1ER0
    public final void LJIILIIL() {
    }

    @Override // X.C1ER0
    public final void LJIJI() {
    }

    @Override // X.C1ER0
    public final void LJJ() {
    }

    @Override // X.C1ER0
    public final void LJJI() {
    }

    @Override // X.C1ER0
    public final void finish() {
    }

    @Override // X.C1ER0
    public final void onBackPressed() {
    }

    @Override // X.C1ER0
    public final void onContentChanged() {
    }

    @Override // X.C1ER0
    public final void LJI() {
        this.LIZ.LJZ("onStop");
    }

    @Override // X.C1ER0
    public final void LJII() {
        this.LIZ.LJZ("onStart");
    }

    public C1039230d9N(C1039050d95 c1039050d95) {
        this.LIZ = c1039050d95;
    }

    @Override // X.C1ER0
    public final void LJJIFFI(Activity activity) {
        this.LIZ.LL.LJIIIZ(activity);
        this.LIZ.LLLILZJ();
        this.LIZ.getClass();
        this.LIZ.LJZ("onCreate");
    }

    @Override // X.C1ER0
    public final void onActivityPostDestroyed(Activity activity) {
        this.LIZ.LLLILZ();
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZ() != null) {
            C1028210crb.LIZLLL(this.LIZ.LLIZ);
        }
        this.LIZ.LJZI();
        this.LIZ.LJZ("onDestroy");
    }

    @Override // X.C1ER0
    public final void onActivityPostPaused(Activity activity) throws JSONException {
        this.LIZ.LJZ("onPause");
        C1039050d95 c1039050d95 = this.LIZ;
        WebKitView webKitView = c1039050d95.LLIZ;
        if (webKitView != null) {
            webKitView.onPause();
            if (c1039050d95.LJLLLLLL()) {
                webKitView.pauseTimers();
            }
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.LIZ.LL.LIZIZ(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.LIZ();
        }
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZ() != null) {
            C1039050d95 c1039050d952 = this.LIZ;
            C1028210crb.LJJIJIIJIL(c1039050d952.LLJJI, c1039050d952.LLIZ);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1039050d95 c1039050d953 = this.LIZ;
        long j = jCurrentTimeMillis - c1039050d953.LLJJIJIL;
        c1039050d953.LLJJIJIL = 0L;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "duration");
        C20684815ws.LJIILLIIL("h5_stay_time", c2344009Gk.LIZ);
        this.LIZ.LJZL(activity);
    }

    @Override // X.C1ER0
    public final void onActivityPostResumed(Activity activity) {
        this.LIZ.LJZ("onResume");
        WebKitView webKitView = this.LIZ.LLIZ;
        if (webKitView != null) {
            webKitView.onResume();
            webKitView.resumeTimers();
        }
        this.LIZ.LL.LIZIZ(WalletBusiness.class);
        this.LIZ.LLJJIJIL = System.currentTimeMillis();
        C1039050d95 c1039050d95 = this.LIZ;
        c1039050d95.getClass();
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZ() != null) {
            C1028210crb.LIZIZ(c1039050d95, c1039050d95.LLIZ);
        }
    }

    @Override // X.C1ER0
    public final void onConfigurationChanged(Activity activity, Configuration configuration) throws Exception {
        C1039050d95 c1039050d95 = this.LIZ;
        if (Build.VERSION.SDK_INT >= 30) {
            C0IKF.LIZ.getClass();
            C465320IMo.LIZ();
            C19738412Ko c19738412KoLIZ = C19738212Km.LIZ(activity);
            C20244914Jj c20244914JjLIZIZ = c19738412KoLIZ.LIZIZ.LIZIZ(WindowInsets.Type.systemBars());
            Rect rectLIZ = c19738412KoLIZ.LIZ();
            int iWidth = (rectLIZ.width() - c20244914JjLIZIZ.LIZ) - c20244914JjLIZIZ.LIZJ;
            int iHeight = (rectLIZ.height() - c20244914JjLIZIZ.LIZIZ) - c20244914JjLIZIZ.LIZLLL;
            ViewOnClickListenerC1041980dDo viewOnClickListenerC1041980dDo = c1039050d95.LLILZLL;
            if (viewOnClickListenerC1041980dDo != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iWidth, iHeight);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnClickListenerC1041980dDo);
                viewOnClickListenerC1041980dDo.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        ViewOnClickListenerC1041980dDo viewOnClickListenerC1041980dDo2 = c1039050d95.LLILZLL;
        if (viewOnClickListenerC1041980dDo2 == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C12ES.LIZJ(configuration.screenWidthDp, activity), (int) C12ES.LIZJ(configuration.screenHeightDp, activity));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnClickListenerC1041980dDo2);
        viewOnClickListenerC1041980dDo2.setLayoutParams(layoutParams2);
    }

    @Override // X.C1ER0
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.LIZ.LL.LIZIZ(WalletBusiness.class) != null) {
            WalletBusiness.LIZ(this.LIZ.LLJIJIL, i, i2, intent);
        }
    }

    @Override // X.C1ER0
    public final void LJJII(Activity activity, int i, String[] strArr, int[] iArr) {
        C1886700zCG.LIZ(activity, i, iArr);
    }
}
