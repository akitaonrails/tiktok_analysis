package X;

import Y.ALAdapterS26S0100000_32;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.187R, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C187R extends AbstractC19676611ye {
    public boolean LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public final C01GW LJIILLIIL;
    public final C01GW LJIIZILJ;
    public C184F LJIJ;
    public float LJIJI;
    public final float LJIJJ;
    public final float LJIJJLI;
    public boolean LJIL;
    public final int LJJ;

    @Override // X.C187I
    public final int LJIILJJIL() {
        return 1;
    }

    @Override // X.C187I
    public final boolean LJIIZILJ() {
        return this.LJIIL && AbstractC212220183e.LJII(LJJIIZ()) && !LJIJ();
    }

    @Override // X.AbstractC19676611ye
    public final AnimatorListenerAdapter LJJIFFI() {
        return new ALAdapterS26S0100000_32(this, 18);
    }

    public final TuxTextView LJJIIJZLJL() {
        return (TuxTextView) this.LJIILLIIL.getValue();
    }

    public final LinearLayout LJJIIZ() {
        return (LinearLayout) this.LJIILIIL.getValue();
    }

    public final TuxTextView LJJIIZI() {
        return (TuxTextView) this.LJIILL.getValue();
    }

    @Override // X.C187I
    public final Animator LJIIL() {
        return AnonymousClass1888.LIZIZ(LJJIIZ(), this.LJJ);
    }

    @Override // X.C187I
    public final Animator LJIILIIL() {
        LinearLayout linearLayoutLJJIIZ = LJJIIZ();
        TuxTextView tuxTextViewLJJIIZI = LJJIIZI();
        TuxTextView tuxTextViewLJJIIJZLJL = LJJIIJZLJL();
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderPlay = animatorSet.play(AnonymousClass1888.LIZ(linearLayoutLJJIIZ, this.LJJ, null, 12));
        C786410Ut5.LLLLZLL(tuxTextViewLJJIIZI, 0);
        C786410Ut5.B5(tuxTextViewLJJIIZI, 0.0f);
        ObjectAnimator objectAnimatorLJI = AnonymousClass1888.LJI(tuxTextViewLJJIIZI, 200L, 12);
        C184F c184f = this.LJFF;
        Animator animator = objectAnimatorLJI;
        if (c184f != null) {
            animator = objectAnimatorLJI;
            if (c184f.LIZ() > 0) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(objectAnimatorLJI).with(LJJII(tuxTextViewLJJIIJZLJL));
                animator = animatorSet2;
            }
        }
        builderPlay.before(animator);
        animatorSet.addListener(new ALAdapterS26S0100000_32(this, 17));
        return animatorSet;
    }

    @Override // X.C187I
    public final void LJIJJLI(boolean z) {
        if (this.LJIIL) {
            AbstractC212220183e.LJIIIZ(LJJIIZ(), z);
        }
        if (!z) {
            this.LJIJ = null;
        }
    }

    public C187R(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.LJIILIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 688));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 687));
        this.LJIILL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 689));
        this.LJIILLIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 686));
        this.LJIIZILJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 691));
        this.LJIJI = C418440Gaw.LIZIZ(54);
        this.LJIJJ = C418440Gaw.LIZIZ(24);
        this.LJIJJLI = C418440Gaw.LIZIZ(16);
        this.LJIL = true;
        this.LJIIL = LJIILL(R.id.pr1);
        this.LJJ = this.LIZLLL.getResources().getDimensionPixelOffset(R.dimen.uj);
    }

    @Override // X.C187I
    public final C187N LJIL(long j, List<Animator> list) {
        long jLIZ;
        String strLJJI;
        int marginStart;
        C184F c184f = this.LJFF;
        if (c184f != null) {
            jLIZ = c184f.LIZ();
        } else {
            jLIZ = -1;
        }
        C187N c187n = new C187N();
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showOrderSoldTag show soldCount = ");
        sbLIZ.append(jLIZ);
        sbLIZ.append(", isShow = ");
        sbLIZ.append(LJIIZILJ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (jLIZ >= 0) {
            if (!LJIIZILJ()) {
                if (this.LJIL) {
                    int marginEnd = 0;
                    this.LJIL = false;
                    LinearLayout linearLayoutLJJIIZ = LJJIIZ();
                    int paddingStart = linearLayoutLJJIIZ.getPaddingStart() + linearLayoutLJJIIZ.getPaddingEnd();
                    ViewGroup.LayoutParams layoutParams = linearLayoutLJJIIZ.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                    } else {
                        marginStart = 0;
                    }
                    int i = paddingStart + marginStart;
                    ViewGroup.LayoutParams layoutParams2 = linearLayoutLJJIIZ.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                    }
                    this.LJIJI = (this.LJI - (i + marginEnd)) - this.LJIJJ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("showOrderSoldTag orderSoldTagTextMaxWidth = ");
                    sbLIZ2.append(this.LJIJI);
                    C2341109Fh.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                }
                C786410Ut5.LJZL(4, LJJIIZ());
                if (jLIZ > 0) {
                    strLJJI = AbstractC19676611ye.LJJI(jLIZ);
                } else {
                    strLJJI = "";
                }
                LinearLayout linearLayoutLJJIIZ2 = LJJIIZ();
                AppCompatImageView appCompatImageView = (AppCompatImageView) this.LJIILJJIL.getValue();
                TuxTextView tuxTextViewLJJIIZI = LJJIIZI();
                TuxTextView tuxTextView = (TuxTextView) this.LJIIZILJ.getValue();
                TuxTextView tuxTextViewLJJIIJZLJL = LJJIIJZLJL();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append((String) this.LJIIJ.getValue());
                sbLIZ3.append((char) 160);
                LJJ(linearLayoutLJJIIZ2, appCompatImageView, tuxTextViewLJJIIZI, tuxTextView, tuxTextViewLJJIIJZLJL, C2188811AlT.LIZIZ(sbLIZ3), strLJJI, this.LJIJI, this.LJIJJLI);
                LJIJJ(0L);
                this.LJIJ = this.LJFF;
                c187n.LIZIZ = true;
            } else if (!C187I.LJIIJJI(this.LJFF, this.LJIJ)) {
                if (jLIZ > 0) {
                    C184F c184f2 = this.LJIJ;
                    if (c184f2 != null) {
                        if (c184f2.LIZ() > 0) {
                            LinearLayout linearLayoutLJJIIZ3 = LJJIIZ();
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.LJIILJJIL.getValue();
                            TuxTextView tuxTextViewLJJIIZI2 = LJJIIZI();
                            TuxTextView tuxTextView2 = (TuxTextView) this.LJIIZILJ.getValue();
                            TuxTextView tuxTextViewLJJIIJZLJL2 = LJJIIJZLJL();
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append((String) this.LJIIJ.getValue());
                            sbLIZ4.append((char) 160);
                            LJJ(linearLayoutLJJIIZ3, appCompatImageView2, tuxTextViewLJJIIZI2, tuxTextView2, tuxTextViewLJJIIJZLJL2, C2188811AlT.LIZIZ(sbLIZ4), AbstractC19676611ye.LJJI(jLIZ), this.LJIJI, this.LJIJJLI);
                            LJJII(LJJIIJZLJL()).start();
                        } else {
                            LinearLayout linearLayoutLJJIIZ4 = LJJIIZ();
                            TuxTextView tuxTextViewLJJIIZI3 = LJJIIZI();
                            TuxTextView tuxTextViewLJJIIJZLJL3 = LJJIIJZLJL();
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append((String) this.LJIIJ.getValue());
                            sbLIZ5.append((char) 160);
                            LJJIII(linearLayoutLJJIIZ4, tuxTextViewLJJIIZI3, tuxTextViewLJJIIJZLJL3, C2188811AlT.LIZIZ(sbLIZ5), AbstractC19676611ye.LJJI(jLIZ), this.LJIJI, this.LJIJJ);
                        }
                    }
                } else {
                    C184F c184f3 = this.LJIJ;
                    if (c184f3 != null && c184f3.LIZ() > 0) {
                        LinearLayout linearLayoutLJJIIZ5 = LJJIIZ();
                        TuxTextView tuxTextViewLJJIIZI4 = LJJIIZI();
                        TuxTextView tuxTextViewLJJIIJZLJL4 = LJJIIJZLJL();
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append((String) this.LJIIJ.getValue());
                        sbLIZ6.append((char) 160);
                        LJJIII(linearLayoutLJJIIZ5, tuxTextViewLJJIIZI4, tuxTextViewLJJIIJZLJL4, C2188811AlT.LIZIZ(sbLIZ6), "", this.LJIJI, this.LJIJJ);
                    }
                }
                c187n.LIZIZ = true;
                this.LJIJ = this.LJFF;
            }
            c187n.LIZ = true;
            return c187n;
        }
        LJIJI(true, null);
        this.LJFF = null;
        this.LJIJ = null;
        return c187n;
    }
}
