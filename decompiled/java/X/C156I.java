package X;

import Y.ARunnableS119S0100000_19;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS275S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.text.u;
import wh6.AbS710S0100000_31;

/* JADX INFO: renamed from: X.156I, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C156I extends C156W {
    public final View LIZLLL;
    public final View LJ;
    public final Function0<Unit> LJFF;
    public View LJI;
    public TuxTextView LJII;
    public View LJIIIIZZ;
    public View LJIIIZ;
    public TuxTextView LJIIJ;
    public ValueAnimator LJIIJJI;

    @Override // X.C156W
    public final void LIZLLL() {
    }

    @Override // X.C156W
    public final void LJ(boolean z) {
        View viewFindViewById;
        if (z) {
            View view = this.LJI;
            if (view != null) {
                C337180DJs.LIZJ(view);
            }
            View view2 = this.LJI;
            if (view2 != null && (viewFindViewById = view2.findViewById(R.id.lut)) != null) {
                C19659111vp c19659111vp = new C19659111vp();
                c19659111vp.LIZIZ(0);
                viewFindViewById.setBackground(c19659111vp.LIZ(this.LIZ.LJJIIJZLJL));
                return;
            }
            return;
        }
        View view3 = this.LJI;
        if (view3 == null) {
            return;
        }
        C337180DJs.LIZ(view3);
    }

    @Override // X.C156W
    public final void LJFF(boolean z) {
        if (!z) {
            this.LJFF.invoke();
        }
    }

    @Override // X.C156W
    public final void LJI(boolean z) {
        if (z) {
            View view = this.LJIIIIZZ;
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS119S0100000_19(this, 174));
            }
            ValueAnimator valueAnimator = this.LJIIJJI;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJIIIZ, "rotation", 0.0f, 360.0f);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat.setRepeatCount(-1);
            C786410Ut5.Pd(objectAnimatorOfFloat);
            this.LJIIJJI = objectAnimatorOfFloat;
            return;
        }
        View view2 = this.LJIIIIZZ;
        if (view2 != null) {
            C337180DJs.LIZ(view2);
        }
        ValueAnimator valueAnimator2 = this.LJIIJJI;
        if (valueAnimator2 == null) {
            return;
        }
        valueAnimator2.cancel();
    }

    @Override // X.C156W
    public final void LJII(int i) {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2 = this.LJIIJ;
        if (tuxTextView2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append('%');
            tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (LIZ().LIZ.LJ.LIZ == C156O.STRIPPING) {
            C155H c155h = this.LIZ;
            if (c155h.LJJII.LIZIZ == 3 && (tuxTextView = this.LJII) != null) {
                tuxTextView.setText(u.LJJIFFI(c155h.LJJIIJZLJL.getString(2131857895), "%1$s", String.valueOf(i), false));
            }
        }
    }

    @Override // X.C156W
    public final void LJIIIZ(CharSequence charSequence) {
        TuxTextView tuxTextView = this.LJII;
        if (tuxTextView != null) {
            tuxTextView.setText(charSequence);
        }
    }

    @Override // X.C156W
    public final void LJIIJ(boolean z) {
        TuxTextView tuxTextView = this.LJII;
        if (tuxTextView != null) {
            tuxTextView.setClickable(z);
        }
    }

    public C156I(C155H c155h, AbstractC204621154x abstractC204621154x, View view, View view2, AwS575S0100000_31 awS575S0100000_31) {
        TuxTextView tuxTextView;
        View viewFindViewById;
        View viewFindViewById2;
        super(c155h, abstractC204621154x);
        this.LIZLLL = view;
        this.LJ = view2;
        this.LJFF = awS575S0100000_31;
        View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) view.findViewById(R.id.vs_bottom_strip_banner));
        this.LJI = viewLJLLLL;
        if (viewLJLLLL != null) {
            tuxTextView = (TuxTextView) viewLJLLLL.findViewById(R.id.tv_recover_message);
        } else {
            tuxTextView = null;
        }
        this.LJII = tuxTextView;
        View view3 = this.LJI;
        if (view3 != null) {
            viewFindViewById = view3.findViewById(R.id.s8q);
        } else {
            viewFindViewById = null;
        }
        this.LJIIIIZZ = viewFindViewById;
        View view4 = this.LJI;
        if (view4 != null) {
            viewFindViewById2 = view4.findViewById(R.id.vu9);
        } else {
            viewFindViewById2 = null;
        }
        this.LJIIIZ = viewFindViewById2;
        View view5 = this.LJI;
        this.LJIIJ = view5 != null ? (TuxTextView) view5.findViewById(R.id.s8j) : null;
        TuxTextView tuxTextView2 = this.LJII;
        if (tuxTextView2 != null) {
            C786410Ut5.I7(new AbS710S0100000_31(this, 14), tuxTextView2);
        }
        LIZIZ();
        C155G c155g = c155h.LJJII;
        if (c155g.LIZ) {
            if (c155g.LIZIZ == 1) {
                LIZ().LIZLLL(new AwS275S0000000_31(2), true);
                TuxTextView tuxTextView3 = this.LJII;
                if (tuxTextView3 != null) {
                    C426750GoL.LJIIIZ(tuxTextView3, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), false, 21);
                }
            }
            if (c155h.LJJII.LIZIZ == 2) {
                LIZ().LIZLLL(new AwS275S0000000_31(3), true);
                TuxTextView tuxTextView4 = this.LJII;
                if (tuxTextView4 != null) {
                    C426750GoL.LJIIIZ(tuxTextView4, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), false, 21);
                }
            }
            if (c155h.LJJII.LIZIZ == 3) {
                LIZ().LIZLLL(AFwS276S0000000_31.get$arr$(318), true);
                TuxTextView tuxTextView5 = this.LJII;
                if (tuxTextView5 != null) {
                    C426750GoL.LJIIIZ(tuxTextView5, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), false, 21);
                }
            }
            if (abstractC204621154x.LJIJJ().LJIIJJI) {
                LIZ().LIZLLL(AFwS276S0000000_31.get$arr$(319), true);
                c155h.LJIIL.LJIIL();
            } else {
                c155h.LJIIL.LJIILJJIL(LJIIJJI());
            }
        }
    }
}
