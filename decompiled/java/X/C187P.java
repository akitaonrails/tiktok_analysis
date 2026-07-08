package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.187P, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C187P extends AbstractC19676811yg {
    public boolean LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public C184F LJIILL;
    public float LJIILLIIL;
    public final float LJIIZILJ;
    public boolean LJIJ;
    public final int LJIJI;

    @Override // X.C187I
    public final int LJIILJJIL() {
        return 3;
    }

    @Override // X.C187I
    public final boolean LJIIZILJ() {
        return this.LJIIJJI && AbstractC212220183e.LJII(LJJI()) && !LJIJ();
    }

    public final LinearLayout LJJI() {
        return (LinearLayout) this.LJIIL.getValue();
    }

    @Override // X.C187I
    public final Animator LJIIL() {
        return AnonymousClass1888.LIZIZ(LJJI(), this.LJIJI);
    }

    @Override // X.C187I
    public final Animator LJIILIIL() {
        LinearLayout linearLayoutLJJI = LJJI();
        TuxTextView tuxTextView = (TuxTextView) this.LJIILIIL.getValue();
        TuxTextView tuxTextView2 = (TuxTextView) this.LJIILJJIL.getValue();
        C786410Ut5.LJLZ(0, linearLayoutLJJI);
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        C786410Ut5.B5(tuxTextView, 0.0f);
        ObjectAnimator objectAnimatorLJI = AnonymousClass1888.LJI(tuxTextView, null, 14);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorLJI).with(AbstractC19676811yg.LJJ(tuxTextView2)).after(AnonymousClass1888.LIZ(linearLayoutLJJI, this.LJIJI, null, 12));
        return animatorSet;
    }

    @Override // X.C187I
    public final void LJIJJLI(boolean z) {
        if (this.LJIIJJI) {
            AbstractC212220183e.LJIIIZ(LJJI(), z);
        }
        if (!z) {
            this.LJIILL = null;
        }
    }

    public C187P(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.LJIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 685));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 684));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 683));
        this.LJIILLIIL = C418440Gaw.LIZIZ(56);
        this.LJIIZILJ = C418440Gaw.LIZIZ(26);
        this.LJIJ = true;
        this.LJIIJJI = LJIILL(R.id.ns5);
        this.LJIJI = this.LIZLLL.getResources().getDimensionPixelOffset(R.dimen.uj);
    }

    @Override // X.C187I
    public final C187N LJIL(long j, List<Animator> list) {
        long jLIZ;
        int marginStart;
        C184F c184f = this.LJFF;
        if (c184f != null) {
            jLIZ = c184f.LIZ();
        } else {
            jLIZ = 0;
        }
        C187N c187n = new C187N();
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LowStockTag show leftCount = ");
        sbLIZ.append(jLIZ);
        sbLIZ.append(", isShow = ");
        sbLIZ.append(LJIIZILJ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (jLIZ > 0) {
            if (!LJIIZILJ()) {
                if (this.LJIJ) {
                    int marginEnd = 0;
                    this.LJIJ = false;
                    LinearLayout linearLayoutLJJI = LJJI();
                    int paddingStart = linearLayoutLJJI.getPaddingStart() + linearLayoutLJJI.getPaddingEnd();
                    ViewGroup.LayoutParams layoutParams = linearLayoutLJJI.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                    } else {
                        marginStart = 0;
                    }
                    int i = paddingStart + marginStart;
                    ViewGroup.LayoutParams layoutParams2 = linearLayoutLJJI.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                    }
                    this.LJIILLIIL = (this.LJI - (i + marginEnd)) - this.LJIIZILJ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("showLowStockTag lowStockTagTextMaxWidth = ");
                    sbLIZ2.append(this.LJIILLIIL);
                    C2341109Fh.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                }
                C786410Ut5.LJZL(4, LJJI());
                LinearLayout linearLayoutLJJI2 = LJJI();
                TuxTextView tuxTextView = (TuxTextView) this.LJIILIIL.getValue();
                TuxTextView tuxTextView2 = (TuxTextView) this.LJIILJJIL.getValue();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(jLIZ);
                sbLIZ3.append((char) 160);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append((String) this.LJIIJ.getValue());
                sbLIZ4.append("  ");
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                Pair pairLIZIZ = C19676111yZ.LIZIZ(this.LIZLLL, this.LJIILLIIL, tuxTextView2, tuxTextView, strLIZIZ2, strLIZIZ3);
                tuxTextView2.LJJJJI(((Number) pairLIZIZ.getFirst()).floatValue());
                tuxTextView.LJJJJI(((Number) pairLIZIZ.getFirst()).floatValue());
                tuxTextView2.setText(strLIZIZ2);
                tuxTextView.setText(strLIZIZ3);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayoutLJJI2.requestLayout();
                LJIJJ(0L);
                this.LJIILL = this.LJFF;
                c187n.LIZIZ = true;
            } else if (!C187I.LJIIJJI(this.LJFF, this.LJIILL)) {
                TextView textView = (TextView) this.LJIILJJIL.getValue();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(jLIZ);
                sbLIZ5.append((char) 160);
                textView.setText(C2188811AlT.LIZIZ(sbLIZ5));
                LJJI().requestLayout();
                AbstractC19676811yg.LJJ((TuxTextView) this.LJIILJJIL.getValue()).start();
                this.LJIILL = this.LJFF;
                c187n.LIZIZ = true;
            }
            c187n.LIZ = true;
            return c187n;
        }
        if (this.LJIIJJI) {
            LJIJI(true, null);
        }
        this.LJFF = null;
        this.LJIILL = null;
        return c187n;
    }
}
