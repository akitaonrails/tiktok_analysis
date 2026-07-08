package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.187O, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C187O extends AbstractC19676711yf {
    public boolean LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public C184F LJIILLIIL;
    public float LJIIZILJ;
    public final float LJIJ;
    public boolean LJIJI;
    public final int LJIJJ;

    @Override // X.C187I
    public final int LJIILJJIL() {
        return 2;
    }

    @Override // X.C187I
    public final boolean LJIIZILJ() {
        return this.LJIIL && AbstractC212220183e.LJII(LJJIIJ()) && !LJIJ();
    }

    public final TuxTextView LJJIII() {
        return (TuxTextView) this.LJIILL.getValue();
    }

    public final LinearLayout LJJIIJ() {
        return (LinearLayout) this.LJIILIIL.getValue();
    }

    @Override // X.C187I
    public final Animator LJIIL() {
        return AnonymousClass1888.LIZIZ(LJJIIJ(), this.LJIJJ);
    }

    @Override // X.C187I
    public final Animator LJIILIIL() {
        LinearLayout linearLayoutLJJIIJ = LJJIIJ();
        TuxTextView tuxTextView = (TuxTextView) this.LJIILJJIL.getValue();
        TuxTextView tuxTextViewLJJIII = LJJIII();
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderPlay = animatorSet.play(AnonymousClass1888.LIZ(linearLayoutLJJIIJ, this.LJIJJ, null, 12));
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        C786410Ut5.B5(tuxTextView, 0.0f);
        ObjectAnimator objectAnimatorLJI = AnonymousClass1888.LJI(tuxTextView, null, 14);
        C184F c184f = this.LJFF;
        Animator animator = objectAnimatorLJI;
        if (c184f != null) {
            animator = objectAnimatorLJI;
            if (c184f.LIZ() > 0) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(objectAnimatorLJI).with(AbstractC19676711yf.LJJIFFI(tuxTextViewLJJIII));
                animator = animatorSet2;
            }
        }
        builderPlay.before(animator);
        return animatorSet;
    }

    @Override // X.C187I
    public final void LJIJJLI(boolean z) {
        if (this.LJIIL) {
            AbstractC212220183e.LJIIIZ(LJJIIJ(), z);
        }
        if (!z) {
            this.LJIILLIIL = null;
        }
    }

    public C187O(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.LJIILIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 681));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 682));
        this.LJIILL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 680));
        this.LJIIZILJ = C418440Gaw.LIZIZ(54);
        this.LJIJ = C418440Gaw.LIZIZ(30);
        this.LJIJI = true;
        this.LJIIL = LJIILL(R.id.jsi);
        this.LJIJJ = this.LIZLLL.getResources().getDimensionPixelOffset(R.dimen.uj);
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
        sbLIZ.append("showHotSaleTag show hotCount = ");
        sbLIZ.append(jLIZ);
        sbLIZ.append(", isShow = ");
        sbLIZ.append(LJIIZILJ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (jLIZ >= 0) {
            if (!LJIIZILJ()) {
                if (this.LJIJI) {
                    int marginEnd = 0;
                    this.LJIJI = false;
                    LinearLayout linearLayoutLJJIIJ = LJJIIJ();
                    int paddingStart = linearLayoutLJJIIJ.getPaddingStart() + linearLayoutLJJIIJ.getPaddingEnd();
                    ViewGroup.LayoutParams layoutParams = linearLayoutLJJIIJ.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                    } else {
                        marginStart = 0;
                    }
                    int i = paddingStart + marginStart;
                    ViewGroup.LayoutParams layoutParams2 = linearLayoutLJJIIJ.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                    }
                    this.LJIIZILJ = (this.LJI - (i + marginEnd)) - this.LJIJ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("showHotSaleTag hotSaleTagTextMaxWidth = ");
                    sbLIZ2.append(this.LJIIZILJ);
                    C2341109Fh.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                }
                C786410Ut5.LJZL(4, LJJIIJ());
                if (jLIZ > 0) {
                    strLJJI = AbstractC19676711yf.LJJI(jLIZ);
                } else {
                    strLJJI = "";
                }
                LinearLayout linearLayoutLJJIIJ2 = LJJIIJ();
                TuxTextView tuxTextView = (TuxTextView) this.LJIILJJIL.getValue();
                TuxTextView tuxTextViewLJJIII = LJJIII();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append((String) this.LJIIJ.getValue());
                sbLIZ3.append((char) 160);
                LJJ(linearLayoutLJJIIJ2, tuxTextView, tuxTextViewLJJIII, C2188811AlT.LIZIZ(sbLIZ3), strLJJI, this.LJIIZILJ, 12, 9);
                LJIJJ(0L);
                this.LJIILLIIL = this.LJFF;
                c187n.LIZIZ = true;
            } else if (!C187I.LJIIJJI(this.LJFF, this.LJIILLIIL)) {
                if (jLIZ > 0) {
                    C184F c184f2 = this.LJIILLIIL;
                    if (c184f2 != null) {
                        if (c184f2.LIZ() > 0) {
                            LinearLayout linearLayoutLJJIIJ3 = LJJIIJ();
                            TuxTextView tuxTextView2 = (TuxTextView) this.LJIILJJIL.getValue();
                            TuxTextView tuxTextViewLJJIII2 = LJJIII();
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append((String) this.LJIIJ.getValue());
                            sbLIZ4.append((char) 160);
                            LJJ(linearLayoutLJJIIJ3, tuxTextView2, tuxTextViewLJJIII2, C2188811AlT.LIZIZ(sbLIZ4), AbstractC19676711yf.LJJI(jLIZ), this.LJIIZILJ, 12, 9);
                            AbstractC19676711yf.LJJIFFI(LJJIII()).start();
                        } else {
                            LinearLayout linearLayoutLJJIIJ4 = LJJIIJ();
                            TuxTextView tuxTextView3 = (TuxTextView) this.LJIILJJIL.getValue();
                            TuxTextView tuxTextViewLJJIII3 = LJJIII();
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append((String) this.LJIIJ.getValue());
                            sbLIZ5.append((char) 160);
                            LJJII(linearLayoutLJJIIJ4, tuxTextView3, tuxTextViewLJJIII3, C2188811AlT.LIZIZ(sbLIZ5), AbstractC19676711yf.LJJI(jLIZ), this.LJIIZILJ, 12, 9, this.LJIJ);
                        }
                    }
                } else {
                    C184F c184f3 = this.LJIILLIIL;
                    if (c184f3 != null && c184f3.LIZ() > 0) {
                        LinearLayout linearLayoutLJJIIJ5 = LJJIIJ();
                        TuxTextView tuxTextView4 = (TuxTextView) this.LJIILJJIL.getValue();
                        TuxTextView tuxTextViewLJJIII4 = LJJIII();
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append((String) this.LJIIJ.getValue());
                        sbLIZ6.append("  ");
                        LJJII(linearLayoutLJJIIJ5, tuxTextView4, tuxTextViewLJJIII4, C2188811AlT.LIZIZ(sbLIZ6), "", this.LJIIZILJ, 12, 9, this.LJIJ);
                    }
                }
                c187n.LIZIZ = true;
                this.LJIILLIIL = this.LJFF;
            }
            c187n.LIZ = true;
            return c187n;
        }
        LJIJI(true, null);
        this.LJFF = null;
        this.LJIILLIIL = null;
        return c187n;
    }
}
