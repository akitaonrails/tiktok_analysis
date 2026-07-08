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

/* JADX INFO: renamed from: X.0H4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435270H4z extends C214906198m {
    public final Activity LL;
    public C418600GbC LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public long LLJILJILJ;
    public AnimatorSet LLJILLL;
    public final ARunnableS106S0100000_6 LLJJ;
    public long LLJJI;
    public final long LLJJIII;
    public C0H50 LLJJIJI;
    public C0H51 LLJJIJIIJIL;

    public final void LJJIIZ() {
        int i = this.LLILLL;
        if (i == 0 || this.LLILZ == 0) {
            getContentView().measure(View.MeasureSpec.makeMeasureSpec(C14KQ.LJIIIIZZ(getContentView().getContext()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(C14KQ.LJ(getContentView().getContext()), Integer.MIN_VALUE));
            return;
        }
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LLILZ, 1073741824));
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        if (this.LLILZLL) {
            return;
        }
        LJJIIJ(this.LLIZ, false);
        HandlerHook.viewRemoveCallbacks(getContentView(), this.LLJJ);
        this.LLILZIL = 0;
    }

    public final void onDestroy() {
        if (this.LL.isFinishing() || !isShowing()) {
            return;
        }
        AnimatorSet animatorSet = this.LLJILLL;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.LLJILLL.cancel();
            this.LLJILLL = null;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
        }
    }

    public final int LJJIIJZLJL() {
        return getContentView().getMeasuredWidth();
    }

    public C435270H4z(Activity activity) {
        super(activity);
        this.LL = activity;
        this.LLJ = true;
        this.LLJILJILJ = 7000L;
        this.LLJJ = new ARunnableS106S0100000_6(this, 202);
        this.LLJJI = 800L;
        this.LLJJIII = 200L;
        activity.getResources().getDisplayMetrics();
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
    }

    public final void LJJIJ(View view) {
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
        int i = this.LLIZLLLIL;
        if (i != 0) {
            this.LLILLJJLI.setBgColor(i);
        }
        this.LLILLJJLI.setNeedPath(this.LLJ);
        this.LLILLJJLI.setNeedPressFade(this.LLJI);
        C786410Ut5.db(this.LLILLJJLI, new ACListenerS141S0100000_6(this, 116));
        setContentView(this.LLILLJJLI);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C435270H4z.LJJIJIIJI(android.view.View):void");
    }

    public final void LJJIIJ(int i, boolean z) {
        C418600GbC c418600GbC = this.LLILLJJLI;
        if (!z) {
            this.LLILZLL = true;
        }
        AnimatorSet animatorSet = this.LLJILLL;
        if (animatorSet == null) {
            this.LLJILLL = new AnimatorSet();
        } else {
            animatorSet.removeAllListeners();
            this.LLJILLL.cancel();
        }
        HandlerHook.viewPost(c418600GbC, new ARunnableS0S0211000_6(this, i, c418600GbC, z, 1));
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void showAtLocation(View view, int i, int i2, int i3) {
        try {
            super.showAtLocation(view, i, i2, i3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
        }
    }
}
