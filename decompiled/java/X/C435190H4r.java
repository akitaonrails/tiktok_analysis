package X;

import Y.ACListenerS141S0100000_6;
import Y.ARunnableS0S0211000_6;
import Y.ARunnableS106S0100000_6;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435190H4r extends C214906198m {
    public static int LLJJI;
    public final Activity LL;
    public C418600GbC LLILLJJLI;
    public TuxTextView LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public final boolean LLJI;
    public long LLJIJIL;
    public AnimatorSet LLJILJIL;
    public final ARunnableS106S0100000_6 LLJILJILJ;
    public long LLJILLL;
    public long LLJJ;

    public final void LJJIIJZLJL() {
        if (this.LLIZ) {
            return;
        }
        C418600GbC c418600GbC = this.LLILLJJLI;
        int visibility = c418600GbC.getVisibility();
        c418600GbC.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c418600GbC);
        onDestroy();
        HandlerHook.viewRemoveCallbacks(getContentView(), this.LLJILJILJ);
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        if (this.LLIZ) {
            return;
        }
        LJJIIJ(this.LLIZLLLIL, false);
        HandlerHook.viewRemoveCallbacks(getContentView(), this.LLJILJILJ);
    }

    public final void onDestroy() {
        AnimatorSet animatorSet = this.LLJILJIL;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.LLJILJIL.cancel();
            this.LLJILJIL = null;
        }
        if (this.LL.isFinishing() || !isShowing()) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            C2344809Gs.LIZ(e);
        }
    }

    public C435190H4r(Activity activity) {
        super(activity);
        this.LL = activity;
        this.LLJI = true;
        this.LLJIJIL = 7000L;
        this.LLJILJILJ = new ARunnableS106S0100000_6(this, 199);
        this.LLJILLL = 800L;
        this.LLJJ = 200L;
        LLJJI = (int) ((activity.getResources().getDisplayMetrics().density * 3.0f) + 0.5f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        TuxTextView tuxTextView = new TuxTextView(activity, null, 6, 0);
        this.LLILLL = tuxTextView;
        tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1h, activity));
        this.LLILLL.setTuxFont(61);
        C786410Ut5.R6(this.LLILLL, new ViewGroup.LayoutParams(-2, -2));
        this.LLILLL.setMaxLines(2);
        this.LLILLL.setGravity(17);
        LJJIIZ(this.LLILLL);
        this.LLILZLL = true;
        getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final void LJJIIZ(View view) {
        C418600GbC c418600GbC = new C418600GbC(this.LL);
        this.LLILLJJLI = c418600GbC;
        c418600GbC.setBackgroundColor(0);
        this.LLILLJJLI.addView(view);
        this.LLILLJJLI.setGravity(17);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        C418600GbC c418600GbC2 = this.LLILLJJLI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c418600GbC2);
        c418600GbC2.setLayoutParams(marginLayoutParams);
        C418600GbC c418600GbC3 = this.LLILLJJLI;
        int visibility = c418600GbC3.getVisibility();
        c418600GbC3.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c418600GbC3);
        int i = this.LLJ;
        if (i != 0) {
            this.LLILLJJLI.setBgColor(i);
        }
        this.LLILLJJLI.setNeedPath(this.LLJI);
        this.LLILLJJLI.setNeedPressFade(false);
        C786410Ut5.db(this.LLILLJJLI, new ACListenerS141S0100000_6(this, 114));
        setContentView(this.LLILLJJLI);
    }

    public static void LJJIJ(C435190H4r c435190H4r, TuxTextView tuxTextView) {
        if (!c435190H4r.LL.isFinishing() && tuxTextView != null && tuxTextView.getWindowToken() != null) {
            HandlerHook.viewRemoveCallbacks(c435190H4r.getContentView(), c435190H4r.LLJILJILJ);
            c435190H4r.LLIZLLLIL = 80;
            if (!c435190H4r.isShowing()) {
                int i = c435190H4r.LLILZ;
                if (i != 0 && c435190H4r.LLILZIL != 0) {
                    c435190H4r.getContentView().measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(c435190H4r.LLILZIL, 1073741824));
                } else {
                    c435190H4r.getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
                }
                float measuredWidth = c435190H4r.getContentView().getMeasuredWidth() / 2;
                C418600GbC c418600GbC = c435190H4r.LLILLJJLI;
                c418600GbC.LLJJ = measuredWidth + 0;
                c418600GbC.LLJJI = 0;
                tuxTextView.getLocationOnScreen(new int[2]);
                if (c435190H4r.LLILZLL) {
                    c435190H4r.getContentView().setSystemUiVisibility(4102);
                }
                c435190H4r.showAsDropDown(tuxTextView, (tuxTextView.getMeasuredWidth() - c435190H4r.getContentView().getMeasuredWidth()) / 2, LLJJI);
                c435190H4r.LJJIIJ(80, true);
                c435190H4r.LLIZ = false;
                if (c435190H4r.LLJIJIL > 0) {
                    HandlerHook.viewPostDelay(c435190H4r.getContentView(), c435190H4r.LLJILJILJ, c435190H4r.LLJIJIL);
                    return;
                }
                return;
            }
            super.dismiss();
        }
    }

    public final void LJJIIJ(int i, boolean z) {
        C418600GbC c418600GbC = this.LLILLJJLI;
        if (!z) {
            this.LLIZ = true;
        }
        AnimatorSet animatorSet = this.LLJILJIL;
        if (animatorSet == null) {
            this.LLJILJIL = new AnimatorSet();
        } else {
            animatorSet.removeAllListeners();
            this.LLJILJIL.cancel();
        }
        HandlerHook.viewPost(c418600GbC, new ARunnableS0S0211000_6(this, i, c418600GbC, z, 0));
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void showAtLocation(View view, int i, int i2, int i3) {
        try {
            super.showAtLocation(view, i, i2, i3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            C2344809Gs.LIZ(e);
        }
    }
}
