package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.187h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212327187h extends AbstractC19677111yj {
    public final int LJIIJ;
    public boolean LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public AtmosphereTag LJIILLIIL;
    public float LJIIZILJ;
    public boolean LJIJ;

    @Override // X.C187K
    public final int LJIILIIL() {
        return 3;
    }

    @Override // X.C187K
    public final boolean LJIILLIIL() {
        return this.LJIIJJI && C185J.LJI(LJJII()) && !LJIIZILJ();
    }

    public final FrameLayout LJJII() {
        return (FrameLayout) this.LJIIL.getValue();
    }

    @Override // X.C187K
    public final Animator LJIIJJI() {
        return AnonymousClass1889.LIZIZ(LJJII(), this.LJIIJ);
    }

    @Override // X.C187K
    public final Animator LJIIL() {
        return LJJ(LJJII(), (TuxTextView) this.LJIILJJIL.getValue(), (TuxTextView) this.LJIILL.getValue());
    }

    @Override // X.AbstractC19677111yj
    public final int LJJIFFI() {
        return this.LJIIJ;
    }

    @Override // X.C187K
    public final void LJIJJ(boolean z) {
        if (this.LJIIJJI) {
            C185J.LJIIIIZZ(LJJII(), z);
        }
        if (!z) {
            this.LJIILLIIL = null;
        }
    }

    public C212327187h(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.LJIIJ = this.LIZJ.getResources().getDimensionPixelOffset(R.dimen.ui);
        this.LJIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 551));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 547));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 550));
        this.LJIILL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 548));
        this.LJIIZILJ = C418440Gaw.LIZIZ(56);
        this.LJIJ = true;
        this.LJIIJJI = LJIILJJIL(R.id.ns4);
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
                if (this.LJIJ) {
                    int marginEnd = 0;
                    this.LJIJ = false;
                    View view = (View) this.LJIILIIL.getValue();
                    int paddingStart = view.getPaddingStart() + view.getPaddingEnd();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                    } else {
                        marginStart = 0;
                    }
                    int i = paddingStart + marginStart;
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                    }
                    this.LJIIZILJ = this.LJFF - (i + marginEnd);
                }
                C786410Ut5.LJZ(4, LJJII());
                C0H9H.LJI(this.LJI.getMarginTop(), LJJII());
                ViewGroup viewGroup = (ViewGroup) this.LJIILIIL.getValue();
                TuxTextView tuxTextView = (TuxTextView) this.LJIILJJIL.getValue();
                TuxTextView tuxTextView2 = (TuxTextView) this.LJIILL.getValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(j2);
                sbLIZ2.append((char) 160);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append((String) this.LJIIIZ.getValue());
                sbLIZ3.append("  ");
                LJIL(viewGroup, tuxTextView, tuxTextView2, strLIZIZ2, C2188811AlT.LIZIZ(sbLIZ3), this.LJIIZILJ, 13, 9);
                LJIJI(0L);
                this.LJIILLIIL = this.LJ;
                c187x.LIZIZ = true;
            } else if (!C187K.LJIIJ(this.LJ, this.LJIILLIIL)) {
                TextView textView = (TextView) this.LJIILL.getValue();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(j2);
                sbLIZ4.append((char) 160);
                textView.setText(C2188811AlT.LIZIZ(sbLIZ4));
                AbstractC19677111yj.LJJI((TuxTextView) this.LJIILL.getValue()).start();
                this.LJIILLIIL = this.LJ;
                c187x.LIZIZ = true;
            }
            c187x.LIZ = true;
            return c187x;
        }
        LJIJ(true);
        this.LJ = null;
        this.LJIILLIIL = null;
        return c187x;
    }
}
