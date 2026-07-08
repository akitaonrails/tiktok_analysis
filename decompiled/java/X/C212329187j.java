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
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.187j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212329187j extends AbstractC19676511yd {
    public boolean LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public final C01GW LJIILLIIL;
    public AtmosphereTag LJIIZILJ;
    public float LJIJ;
    public final float LJIJI;
    public final float LJIJJ;
    public boolean LJIJJLI;
    public final int LJIL;

    @Override // X.C187K
    public final int LJIILIIL() {
        return 1;
    }

    @Override // X.C187K
    public final boolean LJIILLIIL() {
        return this.LJIIJJI && C185J.LJI(LJJIIJZLJL()) && !LJIIZILJ();
    }

    @Override // X.AbstractC19676511yd
    public final AnimatorListenerAdapter LJJI() {
        return new ALAdapterS26S0100000_32(this, 10);
    }

    public final TuxTextView LJJIIJ() {
        return (TuxTextView) this.LJIILL.getValue();
    }

    public final LinearLayout LJJIIJZLJL() {
        return (LinearLayout) this.LJIIL.getValue();
    }

    public final TuxTextView LJJIIZ() {
        return (TuxTextView) this.LJIILJJIL.getValue();
    }

    @Override // X.C187K
    public final Animator LJIIJJI() {
        return AnonymousClass1889.LIZIZ(LJJIIJZLJL(), this.LJIL);
    }

    @Override // X.C187K
    public final Animator LJIIL() {
        LinearLayout linearLayoutLJJIIJZLJL = LJJIIJZLJL();
        TuxTextView tuxTextViewLJJIIZ = LJJIIZ();
        TuxTextView tuxTextViewLJJIIJ = LJJIIJ();
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderPlay = animatorSet.play(AnonymousClass1889.LIZ(linearLayoutLJJIIJZLJL, this.LJIL, null, 12));
        C786410Ut5.LLLLZLL(tuxTextViewLJJIIZ, 0);
        C786410Ut5.B5(tuxTextViewLJJIIZ, 0.0f);
        ObjectAnimator objectAnimatorLJI = AnonymousClass1889.LJI(tuxTextViewLJJIIZ, 200L, 12);
        AtmosphereTag atmosphereTag = this.LJ;
        Animator animator = objectAnimatorLJI;
        if (atmosphereTag != null) {
            animator = objectAnimatorLJI;
            if (atmosphereTag.count > 0) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(objectAnimatorLJI).with(LJJIFFI(tuxTextViewLJJIIJ));
                animator = animatorSet2;
            }
        }
        builderPlay.before(animator);
        animatorSet.addListener(new ALAdapterS26S0100000_32(this, 9));
        return animatorSet;
    }

    @Override // X.C187K
    public final void LJIJJ(boolean z) {
        if (this.LJIIJJI) {
            C185J.LJIIIIZZ(LJJIIJZLJL(), z);
        }
        if (!z) {
            this.LJIIZILJ = null;
        }
    }

    public C212329187j(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.LJIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 530));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 529));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 532));
        this.LJIILL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 528));
        this.LJIILLIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 533));
        this.LJIJ = C418440Gaw.LIZIZ(54);
        this.LJIJI = C418440Gaw.LIZIZ(24);
        this.LJIJJ = C418440Gaw.LIZIZ(16);
        this.LJIJJLI = true;
        this.LJIIJJI = LJIILJJIL(R.id.pr1);
        this.LJIL = this.LIZJ.getResources().getDimensionPixelOffset(R.dimen.uj);
    }

    @Override // X.C187K
    public final C187X LJIJJLI(long j, List<Animator> list) {
        long j2;
        String strLJJ;
        int marginStart;
        AtmosphereTag atmosphereTag = this.LJ;
        if (atmosphereTag != null) {
            j2 = atmosphereTag.count;
        } else {
            j2 = -1;
        }
        C187X c187x = new C187X();
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showOrderSoldTag show soldCount = ");
        sbLIZ.append(j2);
        sbLIZ.append(", isShow = ");
        sbLIZ.append(LJIILLIIL());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (j2 >= 0) {
            if (!LJIILLIIL()) {
                if (this.LJIJJLI) {
                    int marginEnd = 0;
                    this.LJIJJLI = false;
                    LinearLayout linearLayoutLJJIIJZLJL = LJJIIJZLJL();
                    int paddingStart = linearLayoutLJJIIJZLJL.getPaddingStart() + linearLayoutLJJIIJZLJL.getPaddingEnd();
                    ViewGroup.LayoutParams layoutParams = linearLayoutLJJIIJZLJL.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                    } else {
                        marginStart = 0;
                    }
                    int i = paddingStart + marginStart;
                    ViewGroup.LayoutParams layoutParams2 = linearLayoutLJJIIJZLJL.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                    }
                    this.LJIJ = (this.LJFF - (i + marginEnd)) - this.LJIJI;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("showOrderSoldTag orderSoldTagTextMaxWidth = ");
                    sbLIZ2.append(this.LJIJ);
                    C2341109Fh.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                }
                C786410Ut5.LJZL(4, LJJIIJZLJL());
                if (j2 > 0) {
                    strLJJ = AbstractC19676511yd.LJJ(j2);
                } else {
                    strLJJ = "";
                }
                LinearLayout linearLayoutLJJIIJZLJL2 = LJJIIJZLJL();
                AppCompatImageView appCompatImageView = (AppCompatImageView) this.LJIILIIL.getValue();
                TuxTextView tuxTextViewLJJIIZ = LJJIIZ();
                TuxTextView tuxTextView = (TuxTextView) this.LJIILLIIL.getValue();
                TuxTextView tuxTextViewLJJIIJ = LJJIIJ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append((String) this.LJIIIZ.getValue());
                sbLIZ3.append((char) 160);
                LJIL(linearLayoutLJJIIJZLJL2, appCompatImageView, tuxTextViewLJJIIZ, tuxTextView, tuxTextViewLJJIIJ, C2188811AlT.LIZIZ(sbLIZ3), strLJJ, this.LJIJ, this.LJIJJ);
                LJIJI(0L);
                this.LJIIZILJ = this.LJ;
                c187x.LIZIZ = true;
            } else if (!C187K.LJIIJ(this.LJ, this.LJIIZILJ)) {
                if (j2 > 0) {
                    AtmosphereTag atmosphereTag2 = this.LJIIZILJ;
                    if (atmosphereTag2 != null) {
                        if (atmosphereTag2.count > 0) {
                            LinearLayout linearLayoutLJJIIJZLJL3 = LJJIIJZLJL();
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.LJIILIIL.getValue();
                            TuxTextView tuxTextViewLJJIIZ2 = LJJIIZ();
                            TuxTextView tuxTextView2 = (TuxTextView) this.LJIILLIIL.getValue();
                            TuxTextView tuxTextViewLJJIIJ2 = LJJIIJ();
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append((String) this.LJIIIZ.getValue());
                            sbLIZ4.append((char) 160);
                            LJIL(linearLayoutLJJIIJZLJL3, appCompatImageView2, tuxTextViewLJJIIZ2, tuxTextView2, tuxTextViewLJJIIJ2, C2188811AlT.LIZIZ(sbLIZ4), AbstractC19676511yd.LJJ(j2), this.LJIJ, this.LJIJJ);
                            LJJIFFI(LJJIIJ()).start();
                        } else {
                            LinearLayout linearLayoutLJJIIJZLJL4 = LJJIIJZLJL();
                            TuxTextView tuxTextViewLJJIIZ3 = LJJIIZ();
                            TuxTextView tuxTextViewLJJIIJ3 = LJJIIJ();
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append((String) this.LJIIIZ.getValue());
                            sbLIZ5.append((char) 160);
                            LJJII(linearLayoutLJJIIJZLJL4, tuxTextViewLJJIIZ3, tuxTextViewLJJIIJ3, C2188811AlT.LIZIZ(sbLIZ5), AbstractC19676511yd.LJJ(j2), this.LJIJ, this.LJIJI);
                        }
                    }
                } else {
                    AtmosphereTag atmosphereTag3 = this.LJIIZILJ;
                    if (atmosphereTag3 != null && atmosphereTag3.count > 0) {
                        LinearLayout linearLayoutLJJIIJZLJL5 = LJJIIJZLJL();
                        TuxTextView tuxTextViewLJJIIZ4 = LJJIIZ();
                        TuxTextView tuxTextViewLJJIIJ4 = LJJIIJ();
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append((String) this.LJIIIZ.getValue());
                        sbLIZ6.append((char) 160);
                        LJJII(linearLayoutLJJIIJZLJL5, tuxTextViewLJJIIZ4, tuxTextViewLJJIIJ4, C2188811AlT.LIZIZ(sbLIZ6), "", this.LJIJ, this.LJIJI);
                    }
                }
                c187x.LIZIZ = true;
                this.LJIIZILJ = this.LJ;
            }
            c187x.LIZ = true;
            return c187x;
        }
        LJIJ(true);
        this.LJ = null;
        this.LJIIZILJ = null;
        return c187x;
    }
}
