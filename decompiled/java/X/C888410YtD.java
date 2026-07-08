package X;

import android.app.Activity;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0YtD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888410YtD extends AbstractC880120Yfq {
    public final int LLJ;
    public final int LLJI;

    @Override // X.AbstractC880120Yfq
    public final int LJ() {
        return 0;
    }

    @Override // X.AbstractC880120Yfq
    public final void LIZ() {
        SmartRouter.buildRoute(this.LL, "//im/frequency_control/prompts").open();
    }

    @Override // X.AbstractC880120Yfq
    public final boolean LJI() {
        return !(C2213981Bky.LIZIZ.isRegressionTest());
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZIZ() {
        return this.LLJI;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZLLL() {
        return this.LLJ;
    }

    public C888410YtD(Activity activity, C879540Yeu c879540Yeu) {
        super(activity, c879540Yeu, null);
        this.LLJ = 2131835692;
        this.LLJI = R.raw.icon_multiple_square;
    }
}
