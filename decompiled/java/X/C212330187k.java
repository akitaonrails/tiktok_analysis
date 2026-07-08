package X;

import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.187k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212330187k extends AbstractC19676911yh {
    public boolean LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public AtmosphereTag LJIILL;
    public float LJIILLIIL;
    public final float LJIIZILJ;
    public boolean LJIJ;
    public final int LJIJI;

    @Override // X.C187K
    public final int LJIILIIL() {
        return 2;
    }

    @Override // X.C187K
    public final boolean LJIILLIIL() {
        return this.LJIIJJI && C185J.LJI(LJJIJ()) && !LJIIZILJ();
    }

    public final TuxTextView LJJIIZI() {
        return (TuxTextView) this.LJIILJJIL.getValue();
    }

    public final LinearLayout LJJIJ() {
        return (LinearLayout) this.LJIIL.getValue();
    }

    @Override // X.C187K
    public final Animator LJIIJJI() {
        return AnonymousClass1889.LIZIZ(LJJIJ(), this.LJIJI);
    }

    @Override // X.C187K
    public final Animator LJIIL() {
        return LJJIII(LJJIJ(), (TuxTextView) this.LJIILIIL.getValue(), LJJIIZI());
    }

    @Override // X.AbstractC19676911yh
    public final int LJJII() {
        return this.LJIJI;
    }

    @Override // X.C187K
    public final void LJIJJ(boolean z) {
        if (this.LJIIJJI) {
            C185J.LJIIIIZZ(LJJIJ(), z);
        }
        if (!z) {
            this.LJIILL = null;
        }
    }

    public C212330187k(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.LJIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 544));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 546));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 542));
        this.LJIILLIIL = C418440Gaw.LIZIZ(54);
        this.LJIIZILJ = C418440Gaw.LIZIZ(30);
        this.LJIJ = true;
        this.LJIIJJI = LJIILJJIL(R.id.jsi);
        this.LJIJI = this.LIZJ.getResources().getDimensionPixelOffset(R.dimen.uj);
    }

    @Override // X.C187K
    public final C187X LJIJJLI(long j, List<Animator> list) {
        long j2;
        String strLJJI;
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
        sbLIZ.append("showHotSaleTag show hotCount = ");
        sbLIZ.append(j2);
        sbLIZ.append(", isShow = ");
        sbLIZ.append(LJIILLIIL());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (j2 >= 0) {
            if (!LJIILLIIL()) {
                if (this.LJIJ) {
                    int marginEnd = 0;
                    this.LJIJ = false;
                    LinearLayout linearLayoutLJJIJ = LJJIJ();
                    int paddingStart = linearLayoutLJJIJ.getPaddingStart() + linearLayoutLJJIJ.getPaddingEnd();
                    ViewGroup.LayoutParams layoutParams = linearLayoutLJJIJ.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                    } else {
                        marginStart = 0;
                    }
                    int i = paddingStart + marginStart;
                    ViewGroup.LayoutParams layoutParams2 = linearLayoutLJJIJ.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                    }
                    this.LJIILLIIL = (this.LJFF - (i + marginEnd)) - this.LJIIZILJ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("showHotSaleTag hotSaleTagTextMaxWidth = ");
                    sbLIZ2.append(this.LJIILLIIL);
                    C2341109Fh.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                }
                C786410Ut5.LJZL(4, LJJIJ());
                if (j2 > 0) {
                    strLJJI = AbstractC19676911yh.LJJI(j2);
                } else {
                    strLJJI = "";
                }
                LinearLayout linearLayoutLJJIJ2 = LJJIJ();
                TuxTextView tuxTextView = (TuxTextView) this.LJIILIIL.getValue();
                TuxTextView tuxTextViewLJJIIZI = LJJIIZI();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(LJJIIJ());
                sbLIZ3.append((char) 160);
                LJIL(linearLayoutLJJIJ2, tuxTextView, tuxTextViewLJJIIZI, C2188811AlT.LIZIZ(sbLIZ3), strLJJI, this.LJIILLIIL, 12, 9);
                LJIJI(0L);
                this.LJIILL = this.LJ;
                c187x.LIZIZ = true;
            } else if (!C187K.LJIIJ(this.LJ, this.LJIILL)) {
                if (j2 > 0) {
                    AtmosphereTag atmosphereTag2 = this.LJIILL;
                    if (atmosphereTag2 != null) {
                        if (atmosphereTag2.count > 0) {
                            LinearLayout linearLayoutLJJIJ3 = LJJIJ();
                            TuxTextView tuxTextView2 = (TuxTextView) this.LJIILIIL.getValue();
                            TuxTextView tuxTextViewLJJIIZI2 = LJJIIZI();
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(LJJIIJ());
                            sbLIZ4.append((char) 160);
                            LJIL(linearLayoutLJJIJ3, tuxTextView2, tuxTextViewLJJIIZI2, C2188811AlT.LIZIZ(sbLIZ4), AbstractC19676911yh.LJJI(j2), this.LJIILLIIL, 12, 9);
                            AbstractC19676911yh.LJJIFFI(LJJIIZI()).start();
                        } else {
                            LinearLayout linearLayoutLJJIJ4 = LJJIJ();
                            TuxTextView tuxTextView3 = (TuxTextView) this.LJIILIIL.getValue();
                            TuxTextView tuxTextViewLJJIIZI3 = LJJIIZI();
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append(LJJIIJ());
                            sbLIZ5.append((char) 160);
                            LJJIIJZLJL(linearLayoutLJJIJ4, tuxTextView3, tuxTextViewLJJIIZI3, C2188811AlT.LIZIZ(sbLIZ5), AbstractC19676911yh.LJJI(j2), this.LJIILLIIL, 12, 9, this.LJIIZILJ);
                        }
                    }
                } else {
                    AtmosphereTag atmosphereTag3 = this.LJIILL;
                    if (atmosphereTag3 != null && atmosphereTag3.count > 0) {
                        LinearLayout linearLayoutLJJIJ5 = LJJIJ();
                        TuxTextView tuxTextView4 = (TuxTextView) this.LJIILIIL.getValue();
                        TuxTextView tuxTextViewLJJIIZI4 = LJJIIZI();
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append(LJJIIJ());
                        sbLIZ6.append("  ");
                        LJJIIJZLJL(linearLayoutLJJIJ5, tuxTextView4, tuxTextViewLJJIIZI4, C2188811AlT.LIZIZ(sbLIZ6), "", this.LJIILLIIL, 12, 9, this.LJIIZILJ);
                    }
                }
                c187x.LIZIZ = true;
                this.LJIILL = this.LJ;
            }
            c187x.LIZ = true;
            return c187x;
        }
        LJIJ(true);
        this.LJ = null;
        this.LJIILL = null;
        return c187x;
    }
}
