package X;

import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.187g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212326187g extends AbstractC19677111yj {
    public boolean LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public AtmosphereTag LJIILJJIL;
    public float LJIILL;
    public final float LJIILLIIL;
    public boolean LJIIZILJ;
    public final int LJIJ;

    @Override // X.C187K
    public final int LJIILIIL() {
        return 3;
    }

    @Override // X.C187K
    public final boolean LJIILLIIL() {
        return this.LJIIJ && C185J.LJI(LJJII()) && !LJIIZILJ();
    }

    public final LinearLayout LJJII() {
        return (LinearLayout) this.LJIIJJI.getValue();
    }

    @Override // X.C187K
    public final Animator LJIIJJI() {
        return AnonymousClass1889.LIZIZ(LJJII(), this.LJIJ);
    }

    @Override // X.C187K
    public final Animator LJIIL() {
        return LJJ(LJJII(), (TuxTextView) this.LJIIL.getValue(), (TuxTextView) this.LJIILIIL.getValue());
    }

    @Override // X.AbstractC19677111yj
    public final int LJJIFFI() {
        return this.LJIJ;
    }

    @Override // X.C187K
    public final void LJIJJ(boolean z) {
        if (this.LJIIJ) {
            C185J.LJIIIIZZ(LJJII(), z);
        }
        if (!z) {
            this.LJIILJJIL = null;
        }
    }

    public C212326187g(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.LJIIJJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 558));
        this.LJIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 556));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 554));
        this.LJIILL = C418440Gaw.LIZIZ(56);
        this.LJIILLIIL = C418440Gaw.LIZIZ(26);
        this.LJIIZILJ = true;
        this.LJIIJ = LJIILJJIL(R.id.ns5);
        this.LJIJ = this.LIZJ.getResources().getDimensionPixelOffset(R.dimen.uj);
    }

    @Override // X.C187K
    public final C187X LJIJJLI(long j, List<Animator> list) {
        long j2;
        int marginStart;
        AtmosphereTag atmosphereTag = this.LJ;
        if (atmosphereTag != null) {
            j2 = atmosphereTag.count;
        } else {
            j2 = 0;
        }
        C187X c187x = new C187X();
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LowStockTag show leftCount = ");
        sbLIZ.append(j2);
        sbLIZ.append(", isShow = ");
        sbLIZ.append(LJIILLIIL());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (j2 > 0) {
            if (!LJIILLIIL()) {
                if (this.LJIIZILJ) {
                    int marginEnd = 0;
                    this.LJIIZILJ = false;
                    LinearLayout linearLayoutLJJII = LJJII();
                    int paddingStart = linearLayoutLJJII.getPaddingStart() + linearLayoutLJJII.getPaddingEnd();
                    ViewGroup.LayoutParams layoutParams = linearLayoutLJJII.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                    } else {
                        marginStart = 0;
                    }
                    int i = paddingStart + marginStart;
                    ViewGroup.LayoutParams layoutParams2 = linearLayoutLJJII.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                    }
                    this.LJIILL = (this.LJFF - (i + marginEnd)) - this.LJIILLIIL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("showLowStockTag lowStockTagTextMaxWidth = ");
                    sbLIZ2.append(this.LJIILL);
                    C2341109Fh.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                }
                C786410Ut5.LJZL(4, LJJII());
                LinearLayout linearLayoutLJJII2 = LJJII();
                TuxTextView tuxTextView = (TuxTextView) this.LJIIL.getValue();
                TuxTextView tuxTextView2 = (TuxTextView) this.LJIILIIL.getValue();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(j2);
                sbLIZ3.append((char) 160);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append((String) this.LJIIIZ.getValue());
                sbLIZ4.append("  ");
                LJIL(linearLayoutLJJII2, tuxTextView, tuxTextView2, strLIZIZ2, C2188811AlT.LIZIZ(sbLIZ4), this.LJIILL, 12, 9);
                LJIJI(0L);
                this.LJIILJJIL = this.LJ;
                c187x.LIZIZ = true;
            } else if (!C187K.LJIIJ(this.LJ, this.LJIILJJIL)) {
                TextView textView = (TextView) this.LJIILIIL.getValue();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(j2);
                sbLIZ5.append((char) 160);
                textView.setText(C2188811AlT.LIZIZ(sbLIZ5));
                LJJII().requestLayout();
                AbstractC19677111yj.LJJI((TuxTextView) this.LJIILIIL.getValue()).start();
                this.LJIILJJIL = this.LJ;
                c187x.LIZIZ = true;
            }
            c187x.LIZ = true;
            return c187x;
        }
        if (this.LJIIJ) {
            LJIJ(true);
        }
        this.LJ = null;
        this.LJIILJJIL = null;
        return c187x;
    }
}
