package X;

import Y.ARunnableS129S0100000_29;
import Y.ATListenerS166S0000000_29;
import android.animation.Animator;
import android.content.ContentResolver;
import android.provider.Settings;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11AP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11AP implements InterfaceC2263891DjH, Animator.AnimatorListener {
    public boolean LL;
    public final InterfaceC19456211Aa LLILLJJLI;
    public final InterfaceC19456811Ag LLILLL;
    public final FrameLayout LLILZ;
    public C1295960jpS LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL = true;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // X.InterfaceC2263891DjH
    public final void LIZIZ() {
        C1295960jpS c1295960jpS = this.LLILZIL;
        if (c1295960jpS == null || this.LLILZ == null || !c1295960jpS.isAnimating()) {
            return;
        }
        C786410Ut5.LLD(8, this.LLILZIL);
        this.LLILZ.setOnTouchListener(null);
        this.LLILZIL.cancelAnimation();
    }

    @Override // X.InterfaceC2263891DjH
    public final boolean LIZ() {
        return this.LLIZ;
    }

    public static void LIZLLL(C11AP c11ap) {
        C1C7U.LIZ("CountDownViewImpl@d22.centerCountDownView$1L");
        if (c11ap.LLILZIL.getHeight() <= 0) {
            HandlerHook.viewPost(c11ap.LLILZIL, new ARunnableS129S0100000_29(c11ap, 59));
        } else {
            int screenHeight = ScreenUtils.getScreenHeight(c11ap.LLILZIL.getContext());
            c11ap.LLILZIL.getLocationOnScreen(new int[2]);
            C786410Ut5.ld(c11ap.LLILZIL, ((screenHeight - c11ap.LLILZIL.getHeight()) / 2.0f) - r2[1]);
        }
        C1C7U.LIZIZ("CountDownViewImpl@d22.centerCountDownView$1L");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.LLIZ = false;
        C201955140j.LIZJ(C201967140v.LIZIZ, "record cound down onAnimationCancel() called");
        this.LLILLJJLI.LIZIZ();
        if (this.LLIZLLLIL) {
            this.LLILLL.release();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C201955140j.LIZJ(C201967140v.LIZIZ, "record cound down onAnimationEnd() called");
        this.LLIZ = false;
        if (this.LL) {
            C786410Ut5.LJJJZ(this.LLILZIL, this.LLILZ);
            this.LLILZ.setOnTouchListener(null);
            this.LLILZIL = null;
        } else {
            C1295960jpS c1295960jpS = this.LLILZIL;
            if (c1295960jpS != null && this.LLILZ != null && c1295960jpS.isAnimating()) {
                C786410Ut5.LLD(8, this.LLILZIL);
                this.LLILZ.setOnTouchListener(null);
            }
        }
        this.LLILLJJLI.LIZ();
        if (this.LLIZLLLIL) {
            this.LLILLL.release();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.LLILLL.LIZ(this.LLILZLL);
    }

    public C11AP(FrameLayout frameLayout, InterfaceC19456211Aa interfaceC19456211Aa, InterfaceC19456811Ag interfaceC19456811Ag) {
        this.LLILZ = frameLayout;
        this.LLILLJJLI = interfaceC19456211Aa;
        this.LLILLL = interfaceC19456811Ag;
    }

    @Override // X.InterfaceC2263891DjH
    public final void LIZJ(int i, int i2, boolean z) {
        String str;
        this.LL = z;
        this.LLILZLL = i;
        this.LLIZ = true;
        this.LLILLJJLI.LIZJ();
        C1295960jpS c1295960jpS = (C1295960jpS) C786410Ut5.Td(C786410Ut5.ne(this.LLILZ.getContext()), R.layout.fvf, this.LLILZ, false);
        this.LLILZIL = c1295960jpS;
        this.LLILZ.addView(c1295960jpS);
        this.LLILZIL.setIgnoreDisabledSystemAnimations(true);
        this.LLILZIL.removeAllAnimatorListeners();
        this.LLILZIL.addAnimatorListener(this);
        C1295960jpS c1295960jpS2 = this.LLILZIL;
        if (i == 3) {
            str = "countdown_3_lottie.json";
        } else {
            str = "countdown_10_lottie.json";
        }
        c1295960jpS2.setAnimation(str);
        this.LLILZIL.setMinFrame(i2);
        this.LLILZIL.playAnimation();
        C786410Ut5.LLD(0, this.LLILZIL);
        this.LLILZ.setOnTouchListener(new ATListenerS166S0000000_29(5));
        if (C0BN7.LIZ()) {
            HandlerHook.viewPost(this.LLILZIL, new ARunnableS129S0100000_29(this, 59));
        }
        ContentResolver contentResolver = this.LLILZ.getContext().getContentResolver();
        if (contentResolver != null) {
            float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            float f2 = Settings.Global.getFloat(contentResolver, "transition_animation_scale", 1.0f);
            float f3 = Settings.Global.getFloat(contentResolver, "window_animation_scale", 1.0f);
            C201967140v c201967140v = C201967140v.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("anim_duration_scale =");
            sbLIZ.append(f);
            C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("transition_anim_scale =");
            sbLIZ2.append(f2);
            C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("window_anim_scale =");
            sbLIZ3.append(f3);
            C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ3));
        }
    }
}
