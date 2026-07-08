package X;

import Y.ACListenerS141S0100000_6;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS9S0210000_6;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0GiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423150GiX extends C214906198m {
    public int LL;
    public float LLILLJJLI;
    public float LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public final long LLILZLL;
    public boolean LLIZ;
    public C418580GbA LLIZLLLIL;
    public C19518211Xw LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public AnimatorSet LLJILJIL;
    public final Activity LLJILJILJ;
    public final ARunnableS106S0100000_6 LLJILLL;

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        if (this.LLJI) {
            return;
        }
        LJJIIJ(false);
        HandlerHook.viewRemoveCallbacks(getContentView(), this.LLJILLL);
        this.LLILZIL = 0;
    }

    public final void onDestroy() {
        AnimatorSet animatorSet = this.LLJILJIL;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.LLJILJIL;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.LLJILJIL = null;
        if (this.LLJILJILJ.isFinishing() || !isShowing()) {
            return;
        }
        super.dismiss();
    }

    public C423150GiX(C423160GiY c423160GiY) {
        int i = 1;
        this.LLILZLL = Mp4ScreenVideoLoadTimeout.CONTROL;
        Activity activity = c423160GiY.LIZ;
        this.LLJILJILJ = activity;
        this.LL = 0;
        this.LLILLL = 0.0f;
        this.LLILZ = false;
        this.LLILZIL = 0;
        this.LLILZLL = c423160GiY.LIZIZ;
        int i2 = c423160GiY.LIZJ;
        boolean z = c423160GiY.LIZLLL;
        C11VU.LIZIZ(3.0f, activity);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(z);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        C19518211Xw c19518211Xw = new C19518211Xw(this.LLJILJILJ, null);
        this.LLJ = c19518211Xw;
        c19518211Xw.setTextColor(activity.getResources().getColor(R.color.zc));
        C19518211Xw c19518211Xw2 = this.LLJ;
        (c19518211Xw2 == null ? null : c19518211Xw2).setTextSize(1, 13.0f);
        C19518211Xw c19518211Xw3 = this.LLJ;
        (c19518211Xw3 == null ? null : c19518211Xw3).setTextAlignment(5);
        C19518211Xw c19518211Xw4 = this.LLJ;
        C786410Ut5.g6(c19518211Xw4 == null ? null : c19518211Xw4, new ViewGroup.LayoutParams(-2, -2));
        C19518211Xw c19518211Xw5 = this.LLJ;
        (c19518211Xw5 == null ? null : c19518211Xw5).setGravity(17);
        C19518211Xw c19518211Xw6 = this.LLJ;
        (c19518211Xw6 == null ? null : c19518211Xw6).setMaxWidth((int) C11VU.LIZIZ(197.0f, activity));
        C19518211Xw c19518211Xw7 = this.LLJ;
        (c19518211Xw7 == null ? null : c19518211Xw7).setMaxLines(2);
        C19518211Xw c19518211Xw8 = this.LLJ;
        c19518211Xw8 = c19518211Xw8 == null ? null : c19518211Xw8;
        C418580GbA c418580GbA = new C418580GbA(activity);
        this.LLIZLLLIL = c418580GbA;
        c418580GbA.setBackgroundColor(0);
        C418580GbA c418580GbA2 = this.LLIZLLLIL;
        (c418580GbA2 == null ? null : c418580GbA2).addView(c19518211Xw8);
        C418580GbA c418580GbA3 = this.LLIZLLLIL;
        (c418580GbA3 == null ? null : c418580GbA3).setGravity(17);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        C418580GbA c418580GbA4 = this.LLIZLLLIL;
        c418580GbA4 = c418580GbA4 == null ? null : c418580GbA4;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c418580GbA4);
        c418580GbA4.setLayoutParams(marginLayoutParams);
        C418580GbA c418580GbA5 = this.LLIZLLLIL;
        c418580GbA5 = c418580GbA5 == null ? null : c418580GbA5;
        int visibility = c418580GbA5.getVisibility();
        c418580GbA5.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c418580GbA5);
        C418580GbA c418580GbA6 = this.LLIZLLLIL;
        (c418580GbA6 == null ? null : c418580GbA6).setMNeedPath(true);
        C418580GbA c418580GbA7 = this.LLIZLLLIL;
        (c418580GbA7 == null ? null : c418580GbA7).setMNeedArrow(true);
        C418580GbA c418580GbA8 = this.LLIZLLLIL;
        (c418580GbA8 == null ? null : c418580GbA8).setMNeedPressFade(false);
        C418580GbA c418580GbA9 = this.LLIZLLLIL;
        (c418580GbA9 == null ? null : c418580GbA9).setMNeedShadow(false);
        C418580GbA c418580GbA10 = this.LLIZLLLIL;
        (c418580GbA10 == null ? null : c418580GbA10).setMShadowColor(0);
        C418580GbA c418580GbA11 = this.LLIZLLLIL;
        c418580GbA11 = c418580GbA11 == null ? null : c418580GbA11;
        View.OnClickListener aCListenerS141S0100000_6 = new ACListenerS141S0100000_6(this, 109);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS141S0100000_6) : aCListenerS141S0100000_6);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c418580GbA11);
        }
        c418580GbA11.setOnClickListener(aVar);
        C418580GbA c418580GbA12 = this.LLIZLLLIL;
        setContentView(c418580GbA12 == null ? null : c418580GbA12);
        getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.LLILZ = true;
        if (!TextUtils.isEmpty("")) {
            C19518211Xw c19518211Xw9 = this.LLJ;
            (c19518211Xw9 == null ? null : c19518211Xw9).setText("");
        }
        if (i2 != 0) {
            C19518211Xw c19518211Xw10 = this.LLJ;
            (c19518211Xw10 == null ? null : c19518211Xw10).setText(i2);
        }
        C19518211Xw c19518211Xw11 = this.LLJ;
        (c19518211Xw11 == null ? null : c19518211Xw11).setTextSize(1, 13.0f);
        getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
        if (this.LLILZ) {
            getContentView().setSystemUiVisibility(4102);
        }
        C418580GbA c418580GbA13 = this.LLIZLLLIL;
        (c418580GbA13 == null ? null : c418580GbA13).setMNeedPath(true);
        C418580GbA c418580GbA14 = this.LLIZLLLIL;
        c418580GbA14 = c418580GbA14 == null ? null : c418580GbA14;
        int i3 = this.LL;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 48) {
                    if (i3 == 80) {
                        i = 0;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 2;
        }
        c418580GbA14.setBubbleOrientation(i);
        C418580GbA c418580GbA15 = this.LLIZLLLIL;
        (c418580GbA15 != null ? c418580GbA15 : null).setMPadding(12.0f);
        this.LLJILLL = new ARunnableS106S0100000_6(this, 176);
    }

    public final void LJJIIJ(boolean z) {
        C418580GbA c418580GbA = this.LLIZLLLIL;
        if (c418580GbA == null) {
            c418580GbA = null;
        }
        if (!z) {
            this.LLJI = true;
        }
        this.LLJILJIL = new AnimatorSet();
        HandlerHook.viewPost(c418580GbA, new ARunnableS9S0210000_6(this, c418580GbA, z, 1));
    }

    public final void LJJIIJZLJL(float f, int i, View view) {
        this.LLILZIL = i;
        this.LLILLJJLI = f;
        if (!this.LLJILJILJ.isFinishing() && view != null && view.getWindowToken() != null) {
            view.getMeasuredHeight();
            view.getMeasuredWidth();
            HandlerHook.viewRemoveCallbacks(getContentView(), this.LLJILLL);
            this.LL = 48;
            C418580GbA c418580GbA = this.LLIZLLLIL;
            C418580GbA c418580GbA2 = null;
            if (c418580GbA == null) {
                c418580GbA = null;
            }
            this.LLJIJIL = c418580GbA.getPADDING();
            if (isShowing()) {
                super.dismiss();
                return;
            }
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
            if (!this.LLIZ) {
                this.LLILLL += this.LLJIJIL * 8;
                this.LLIZ = true;
            }
            C418580GbA c418580GbA3 = this.LLIZLLLIL;
            if (c418580GbA3 != null) {
                c418580GbA2 = c418580GbA3;
            }
            c418580GbA2.LLJJIJI = this.LLILLJJLI + this.LLILLL;
            c418580GbA2.LLJJIJIIJIL = 3;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int iLIZIZ = iArr[0] + this.LLILZIL + ((int) C11VU.LIZIZ(1.4f, this.LLJILJILJ));
            int i2 = iArr[1];
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
            C786410Ut5.m3(this, view, iLIZIZ, (i2 - getContentView().getMeasuredHeight()) + ((int) C11VU.LIZIZ(1.3f, this.LLJILJILJ)));
            this.LLJI = false;
            if (this.LLILZLL <= 0) {
                return;
            }
            HandlerHook.viewPostDelay(getContentView(), this.LLJILLL, this.LLILZLL);
        }
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        LJJIIJ(true);
    }
}
