package X;

import Y.AAListenerS317S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import irm.AkS78S0100000_6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS153S0400000_25;
import kotlin.jvm.internal.AwS250S0300000_6;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: renamed from: X.0HTv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C441730HTv extends AbstractC1662050tLv {
    public final View LL;
    public final View LLILLJJLI;
    public boolean LLILLL;
    public C0P0T LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public AnimatorSet LLIZ;
    public EnumC441770HTz LLIZLLLIL;

    private final TuxTextView getButton() {
        return (TuxTextView) this.LLILZLL.getValue();
    }

    private final TuxTextView getTvTitle() {
        return (TuxTextView) this.LLILZIL.getValue();
    }

    @Override // X.AbstractC1662050tLv
    public final boolean isShowing() {
        C0P0T c0p0t;
        return this.LLILLL || ((c0p0t = this.LLILZ) != null && c0p0t.isShowing());
    }

    public final C0P0T getTooltip() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1662050tLv
    public final void j0(String str) {
        int i = C441740HTw.LIZ[this.LLIZLLLIL.ordinal()];
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    long jLIZIZ = (C545810Lat.LIZIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / ((long) 60);
                    Resources resources = getContext().getResources();
                    if (jLIZIZ <= 1) {
                        i2 = 1;
                    }
                    str = resources.getQuantityString(2131755021, i2, Long.valueOf(jLIZIZ));
                } else {
                    throw new C1954807lC();
                }
            } else {
                str = getContext().getResources().getString(2131820720);
            }
        }
        getTvTitle().setText(str);
        C0P0T c0p0t = this.LLILZ;
        if (c0p0t != null) {
            c0p0t.LJ();
        }
    }

    public final void setTooltip(C0P0T c0p0t) {
        this.LLILZ = c0p0t;
    }

    @Override // X.AbstractC1662050tLv
    public final void h0(Function0 function0, boolean z) {
        if (!isShowing()) {
            ((AwS153S0400000_25) function0).invoke();
            return;
        }
        if (z) {
            C0P0T c0p0t = this.LLILZ;
            if (c0p0t != null) {
                c0p0t.dismiss();
            }
            l0(new AwS550S0100000_6((AwS153S0400000_25) function0, 1264), false);
            return;
        }
        C0P0T c0p0t2 = this.LLILZ;
        if (c0p0t2 != null) {
            c0p0t2.LJIILJJIL(AFwS289S0000000_6.get$arr$(47));
        }
        C0P0T c0p0t3 = this.LLILZ;
        if (c0p0t3 != null) {
            c0p0t3.dismiss();
        }
        ((AwS153S0400000_25) function0).invoke();
    }

    @Override // X.AbstractC1662050tLv
    public final void i0(C1662100tM0 c1662100tM0, View view) {
        if (isShowing()) {
            return;
        }
        this.LLILLL = true;
        j0(c1662100tM0.LIZIZ);
        l0(new AwS250S0300000_6(this, c1662100tM0, view, 16), true);
    }

    public final void l0(Function0 function0, boolean z) {
        AnimatorSet animatorSet = this.LLIZ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLIZ = new AnimatorSet();
        if (z) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LL, "scaleX", 1.0f, 0.3f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LL, "scaleY", 1.0f, 0.3f);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIIIZ());
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LL, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat3.setDuration(300L);
            objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
            View view = this.LLILLJJLI;
            if (view != null) {
                C786410Ut5.T4(view, 1.0f);
                C786410Ut5.Ob(view, 0.0f);
                C786410Ut5.pc(view, 0.0f);
            }
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LLILLJJLI, "scaleX", 0.0f, 1.0f);
            objectAnimatorOfFloat4.setDuration(400L);
            objectAnimatorOfFloat4.setInterpolator(C1619980sG4.LJIIIZ());
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.LLILLJJLI, "scaleY", 0.0f, 1.0f);
            objectAnimatorOfFloat5.setDuration(400L);
            objectAnimatorOfFloat5.setInterpolator(C1619980sG4.LJIIIZ());
            AnimatorSet animatorSet2 = this.LLIZ;
            if (animatorSet2 != null) {
                animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.LLILLJJLI, "scaleX", 1.0f, 0.0f);
            objectAnimatorOfFloat6.setDuration(200L);
            objectAnimatorOfFloat6.setInterpolator(C1619980sG4.LJIIIZ());
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.LLILLJJLI, "scaleY", 1.0f, 0.0f);
            objectAnimatorOfFloat7.setDuration(200L);
            objectAnimatorOfFloat7.setInterpolator(C1619980sG4.LJIIIZ());
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.LLILLJJLI, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat8.setDuration(200L);
            objectAnimatorOfFloat8.setInterpolator(new LinearInterpolator());
            C786410Ut5.T4(this.LL, 1.0f);
            ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.LL, "scaleX", 0.0f, 1.0f);
            objectAnimatorOfFloat9.setDuration(500L);
            objectAnimatorOfFloat9.setInterpolator(C1619980sG4.LJIIIZ());
            ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.LL, "scaleY", 0.0f, 1.0f);
            objectAnimatorOfFloat10.setDuration(500L);
            objectAnimatorOfFloat10.setInterpolator(C1619980sG4.LJIILJJIL());
            AnimatorSet animatorSet3 = this.LLIZ;
            if (animatorSet3 != null) {
                animatorSet3.playTogether(objectAnimatorOfFloat6, objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat10);
            }
        }
        AnimatorSet animatorSet4 = this.LLIZ;
        if (animatorSet4 != null) {
            animatorSet4.addListener(new AAListenerS317S0100000_6(function0, 55));
        }
        AnimatorSet animatorSet5 = this.LLIZ;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    public final void n0(C1662100tM0 c1662100tM0, View view) {
        if (getParent() != null) {
            C786410Ut5.LJJJLZIJ(this, (ViewGroup) getParent());
        }
        Function0<Boolean> function0 = c1662100tM0.LJII;
        if (function0 != null && !function0.invoke().booleanValue()) {
            this.LLILLL = false;
            return;
        }
        C786410Ut5.I7(new AkS78S0100000_6(this, 20), getButton());
        C1391550mJd c1391550mJd = new C1391550mJd(getContext());
        C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LIZLLL = EnumC1235690iGF.START;
        c1391600mJi.LJIIZILJ = this;
        c1391550mJd.LLILLJJLI.LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c1391550mJd.LJI(C960203pA.LIZ(R.attr.zh, getContext()));
        c1391550mJd.LJIIIZ(true, null);
        C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
        c1391600mJi2.LJIJJ = true;
        c1391600mJi2.LJIJJLI = false;
        c1391600mJi2.LJII = -1001L;
        c1391600mJi2.LJIIJJI = true;
        C0P0T c0p0tLIZIZ = c1391550mJd.LIZIZ();
        this.LLILZ = c0p0tLIZIZ;
        c0p0tLIZIZ.LJIILJJIL(new AwS620S0100000_6(c1662100tM0, 140));
        C0P0T c0p0t = this.LLILZ;
        if (c0p0t != null) {
            c0p0t.LJIIIZ(new InterfaceC1340660kzY() { // from class: X.0HTx
                @Override // X.InterfaceC1340660kzY
                public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                    this.LIZ.setTooltip(null);
                    this.LIZ.LLILLL = false;
                }
            });
        }
        C0P0T c0p0t2 = this.LLILZ;
        if (c0p0t2 != null) {
            c0p0t2.show();
        }
    }

    public C441730HTv(View view, View view2, Context context) {
        EnumC441770HTz enumC441770HTz;
        super(context, null, 0);
        this.LL = view;
        this.LLILLJJLI = view2;
        this.LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1265));
        this.LLILZLL = C452501pT.LIZIZ(new AwS402S0200000_1(this, context, 72));
        if (C545810Lat.LIZ()) {
            enumC441770HTz = EnumC441770HTz.ESTIMATING;
        } else {
            enumC441770HTz = EnumC441770HTz.UPDATE_REMAIN_TIME;
        }
        this.LLIZLLLIL = enumC441770HTz;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.wz, this, true);
    }

    @Override // X.AbstractC1662050tLv
    public final void e0(ViewGroup viewGroup, C1662100tM0 c1662100tM0, View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
    }
}
