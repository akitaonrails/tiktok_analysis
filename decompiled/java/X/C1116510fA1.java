package X;

import Y.AAListenerS328S0100000_17;
import Y.ACListenerS152S0100000_17;
import Y.ARunnableS50S0300000_17;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0fA1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116510fA1 extends AbstractC1116530fA3 {
    public final View LL;
    public final InterfaceC1116540fA4 LLILLJJLI;
    public final LinearLayout LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public final C1088810eRL LLILZLL;
    public final ImageView LLIZ;
    public final View LLIZLLLIL;
    public ObjectAnimator LLJ;

    public final void N5(C1116450f9v c1116450f9v) {
        String strLJIJI;
        C1088810eRL c1088810eRL = this.LLILZLL;
        if (c1088810eRL != null) {
            c1088810eRL.setText$liverevenue_impl_release(String.valueOf(c1116450f9v.LIZ));
        }
        if (c1116450f9v.LIZLLL) {
            LinearLayout linearLayout = this.LLILLL;
            if (linearLayout != null) {
                C786410Ut5.hd(linearLayout, (int) C497740JfY.LIZIZ(0.0f));
            }
            View view = this.LLIZLLLIL;
            if (view != null) {
                view.setBackground(C800330VaR.LIZIZ(view.getContext(), R.drawable.e7s));
            }
            C16F5 c16f5 = this.LLILZ;
            if (c16f5 != null) {
                long j = c1116450f9v.LIZJ;
                if (j > 0) {
                    strLJIJI = C497740JfY.LJIJJ(2131844102, String.valueOf(j));
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131844103);
                }
                c16f5.setText(strLJIJI);
            }
        } else {
            LinearLayout linearLayout2 = this.LLILLL;
            if (linearLayout2 != null) {
                C786410Ut5.hd(linearLayout2, (int) C497740JfY.LIZIZ(16.0f));
            }
            View view2 = this.LLIZLLLIL;
            if (view2 != null) {
                view2.setBackground(C800330VaR.LIZIZ(view2.getContext(), R.drawable.e7r));
            }
        }
        if (c1116450f9v.LJ == EnumC1088820eRM.HIGH) {
            C16F5 c16f52 = this.LLILZIL;
            if (c16f52 != null) {
                AbstractC1116530fA3.L5(c16f52);
            }
            C16F5 c16f53 = this.LLILZIL;
            if (c16f53 != null) {
                c16f53.setText(C497740JfY.LJIJJ(2131844111, String.valueOf(c1116450f9v.LIZIZ)));
            }
            ImageView imageView = this.LLIZ;
            if (imageView != null) {
                imageView.setImageDrawable(C800330VaR.LIZIZ(imageView.getContext(), R.drawable.fb6));
                return;
            }
            return;
        }
        C16F5 c16f54 = this.LLILZIL;
        if (c16f54 != null) {
            c16f54.setText(C497740JfY.LJIJJ(2131844104, String.valueOf(c1116450f9v.LIZIZ)));
        }
        ImageView imageView2 = this.LLIZ;
        if (imageView2 == null) {
            return;
        }
        imageView2.setImageDrawable(C800330VaR.LIZIZ(imageView2.getContext(), R.drawable.fb5));
    }

    public C1116510fA1(View view, InterfaceC1116540fA4 interfaceC1116540fA4) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = interfaceC1116540fA4;
        this.LLILLL = (LinearLayout) view.findViewById(R.id.vxf);
        this.LLILZ = (C16F5) view.findViewById(R.id.jok);
        this.LLILZIL = (C16F5) view.findViewById(R.id.title);
        this.LLILZLL = (C1088810eRL) view.findViewById(R.id.e3y);
        this.LLIZ = (ImageView) view.findViewById(R.id.jxe);
        view.findViewById(R.id.time);
        this.LLIZLLLIL = view.findViewById(R.id.bnu);
        C786410Ut5.I7(new ACListenerS152S0100000_17(this, 78), view);
    }

    @Override // X.AbstractC1116530fA3
    public final void I5(C1116450f9v c1116450f9v, List<? extends Object> list) {
        C1088810eRL c1088810eRL;
        C16F5 c16f5;
        String strLJIJI;
        if (list.isEmpty()) {
            N5(c1116450f9v);
            return;
        }
        String str = (String) ListProtector.get(list, 0);
        int iHashCode = str.hashCode();
        if (iHashCode != -1493396774) {
            if (iHashCode != 58000620) {
                if (iHashCode != 280566824 || !str.equals("RefreshTime") || (c16f5 = this.LLILZ) == null) {
                    return;
                }
                long j = c1116450f9v.LIZJ;
                if (j > 0) {
                    strLJIJI = C497740JfY.LJIJJ(2131844102, String.valueOf(j));
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131844103);
                }
                c16f5.setText(strLJIJI);
                return;
            }
            if (!str.equals("ChangeSelect")) {
                return;
            }
            N5(c1116450f9v);
            if (c1116450f9v.LIZLLL) {
                ObjectAnimator objectAnimator = this.LLJ;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILLL, (Property<LinearLayout, Float>) View.TRANSLATION_Y, (int) C497740JfY.LIZIZ(16.0f), 0.0f);
                this.LLJ = objectAnimatorOfFloat;
                if (objectAnimatorOfFloat != null) {
                    objectAnimatorOfFloat.addListener(new AAListenerS328S0100000_17(this, 12));
                }
                ObjectAnimator objectAnimator2 = this.LLJ;
                if (objectAnimator2 != null) {
                    objectAnimator2.setDuration(100L);
                }
                ObjectAnimator objectAnimator3 = this.LLJ;
                if (objectAnimator3 != null) {
                    objectAnimator3.setInterpolator(new LinearInterpolator());
                }
                ObjectAnimator objectAnimator4 = this.LLJ;
                if (objectAnimator4 == null) {
                    return;
                }
                C786410Ut5.Pd(objectAnimator4);
                return;
            }
            ObjectAnimator objectAnimator5 = this.LLJ;
            if (objectAnimator5 != null) {
                objectAnimator5.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLILLL, (Property<LinearLayout, Float>) View.TRANSLATION_Y, 0.0f, (int) C497740JfY.LIZIZ(16.0f));
            this.LLJ = objectAnimatorOfFloat2;
            if (objectAnimatorOfFloat2 != null) {
                objectAnimatorOfFloat2.addListener(new AAListenerS328S0100000_17(this, 13));
            }
            ObjectAnimator objectAnimator6 = this.LLJ;
            if (objectAnimator6 != null) {
                objectAnimator6.setDuration(100L);
            }
            ObjectAnimator objectAnimator7 = this.LLJ;
            if (objectAnimator7 != null) {
                objectAnimator7.setInterpolator(new LinearInterpolator());
            }
            ObjectAnimator objectAnimator8 = this.LLJ;
            if (objectAnimator8 == null) {
                return;
            }
            C786410Ut5.Pd(objectAnimator8);
            return;
        }
        if (!str.equals("AdjustPrice") || (c1088810eRL = this.LLILZLL) == null) {
            return;
        }
        String strValueOf = String.valueOf(c1116450f9v.LIZ);
        EnumC1088820eRM enumC1088820eRM = c1116450f9v.LJ;
        if (enumC1088820eRM == null) {
            enumC1088820eRM = EnumC1088820eRM.LOW;
        }
        c1088810eRL.postOnAnimation(new ARunnableS50S0300000_17(c1088810eRL, strValueOf, enumC1088820eRM, 7));
    }
}
