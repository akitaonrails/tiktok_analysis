package X;

import Y.ALAdapterS3S0200000_6;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.187S, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C187S extends C187I {
    public final int LJIIJ;
    public boolean LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public final C01GW LJIILLIIL;
    public final C01GW LJIIZILJ;
    public final C01GW LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;
    public Animator LJIJJLI;
    public final C01GW LJIL;
    public AtmosphereTag LJJ;
    public Animator LJJI;
    public final C01GW LJJIFFI;
    public final C01GW LJJII;

    @Override // X.C187I
    public final int LJIILJJIL() {
        return 0;
    }

    @Override // X.C187I
    public final boolean LJIIZILJ() {
        return this.LJIIJJI && AbstractC212220183e.LJII(LJJIII()) && !LJIJ();
    }

    public final View LJJI() {
        return (View) this.LJIJJ.getValue();
    }

    public final TuxTextView LJJIFFI() {
        return (TuxTextView) this.LJIILIIL.getValue();
    }

    public final TuxTextView LJJII() {
        return (TuxTextView) this.LJIILJJIL.getValue();
    }

    public final ConstraintLayout LJJIII() {
        return (ConstraintLayout) this.LJIIL.getValue();
    }

    public final TuxTextView LJJIIJ() {
        return (TuxTextView) this.LJIIZILJ.getValue();
    }

    @Override // X.C187I
    public final Animator LJIIL() {
        return AnonymousClass1888.LIZIZ(LJJIII(), this.LJIIJ);
    }

    @Override // X.C187I
    public final Animator LJIILIIL() {
        C786410Ut5.c5(LJJIII(), 0.0f);
        return AnonymousClass1888.LIZ(LJJIII(), this.LJIIJ, null, 12);
    }

    @Override // X.C187I
    public final void LJIJJLI(boolean z) {
        if (this.LJIIJJI) {
            AbstractC212220183e.LJIIIZ(LJJIII(), z);
        }
        if (!z) {
            this.LJJ = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(boolean r19) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187S.LJJIIZ(boolean):void");
    }

    public C187S(int i, ViewGroup viewGroup) {
        super(viewGroup, i);
        this.LJIIJ = this.LIZLLL.getResources().getDimensionPixelOffset(R.dimen.un);
        this.LJIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 699));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 693));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 695));
        this.LJIILL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 690));
        this.LJIILLIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 679));
        this.LJIIZILJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 674));
        this.LJIJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 675));
        this.LJIJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 697));
        this.LJIJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 692));
        this.LJIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(446));
        this.LJJIFFI = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(212));
        this.LJJII = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(213));
        this.LJIIJJI = LJIILL(R.id.ibv);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014d  */
    @Override // X.C187I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C187N LJIL(long r13, java.util.List<android.animation.Animator> r15) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187S.LJIL(long, java.util.List):X.187N");
    }

    public final boolean LJJ(List list, boolean z) {
        boolean z2;
        View view;
        View view2;
        if (z) {
            if (((View) this.LJIILLIIL.getValue()).getVisibility() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            view = (View) this.LJIILLIIL.getValue();
            view2 = (View) this.LJIILL.getValue();
            C1744700vVE.LJIIL(LJJI(), -1);
        } else {
            if (((View) this.LJIILL.getValue()).getVisibility() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            view = (View) this.LJIILL.getValue();
            view2 = (View) this.LJIILLIIL.getValue();
            C1744700vVE.LJIIL(LJJI(), LJJI().getResources().getDimensionPixelSize(R.dimen.v2));
        }
        if (z2 && list != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            float f = 20;
            animatorSet.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -C0H9H.LIZ(f)), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, C0H9H.LIZ(f), 0.0f));
            animatorSet.addListener(new ALAdapterS3S0200000_6(view2, view, 30));
            list.add(animatorSet);
            return z2;
        }
        C786410Ut5.ed(view, 0.0f);
        C786410Ut5.LJLLLLLL(0, view);
        C786410Ut5.ed(view2, 0.0f);
        C786410Ut5.LJLLLLLL(4, view2);
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIIJZLJL(long j, boolean z) {
        int iIntValue;
        int iIntValue2;
        Animator animator;
        if (j > 0 && j < 11000) {
            C187U c187u = new C187U();
            String strValueOf = String.valueOf(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, this.LIZ.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            C187W c187wLIZLLL = C187U.LIZLLL(strValueOf, 103, iIntValue, 0, 0, 3);
            if (c187wLIZLLL != null) {
                c187u.LIZ(c187wLIZLLL);
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, this.LIZ.getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            C187W c187wLIZLLL2 = C187U.LIZLLL("s", 73, iIntValue2, 0, 0, 3);
            if (c187wLIZLLL2 != null) {
                c187u.LIZ(c187wLIZLLL2);
            }
            if (z) {
                Animator animator2 = this.LJJI;
                if (animator2 != null) {
                    animator2.cancel();
                }
                C786410Ut5.LLLLZLL(LJJIFFI(), 0);
                LJJIFFI().setPivotX(0.0f);
                LJJIFFI().setPivotY(this.LIZLLL.getResources().getDimension(R.dimen.u9));
                if (LJJII().getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(LJJII(), (Property<TuxTextView, Float>) View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorOfFloat.setDuration(50L);
                    ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(LJJIFFI(), this.LJJIFFI.getValue(), this.LJJII.getValue());
                    objectAnimatorOfPropertyValuesHolder.setDuration(400L);
                    objectAnimatorOfPropertyValuesHolder.setInterpolator(C1619980sG4.LIZ());
                    animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfPropertyValuesHolder);
                    C786410Ut5.LLLLZLL(LJJII(), 8);
                    animator = animatorSet;
                } else {
                    ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(LJJIFFI(), this.LJJIFFI.getValue(), this.LJJII.getValue());
                    objectAnimatorOfPropertyValuesHolder2.setDuration(400L);
                    objectAnimatorOfPropertyValuesHolder2.setInterpolator(C1619980sG4.LIZ());
                    animator = objectAnimatorOfPropertyValuesHolder2;
                }
                animator.start();
                this.LJJI = animator;
            }
            LJJIFFI().setText(c187u.LIZJ());
            return;
        }
        if (j < 11000) {
            return;
        }
        Animator animator3 = this.LJJI;
        if (animator3 != null) {
            animator3.cancel();
        }
        this.LJJI = null;
        C786410Ut5.B5(LJJII(), 1.0f);
        C786410Ut5.LLLLZLL(LJJII(), 0);
        C786410Ut5.LLLLZLL(LJJIFFI(), 8);
        TuxTextView tuxTextViewLJJII = LJJII();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((DateFormat) this.LJIL.getValue()).format(new Date(j)));
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(53, false), 0, spannableStringBuilder.length(), 17);
        C786410Ut5.q2(spannableStringBuilder, new StyleSpan(3), 0, spannableStringBuilder.length(), 17);
        tuxTextViewLJJII.setText(spannableStringBuilder);
    }
}
