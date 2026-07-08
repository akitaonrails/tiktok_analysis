package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.187i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212328187i extends AbstractC19676911yh {
    public boolean LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public AtmosphereTag LJIILLIIL;
    public float LJIIZILJ;
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
        return (TuxTextView) this.LJIILL.getValue();
    }

    public final FrameLayout LJJIJ() {
        return (FrameLayout) this.LJIIL.getValue();
    }

    @Override // X.C187K
    public final Animator LJIIJJI() {
        return AnonymousClass1889.LIZIZ(LJJIJ(), this.LJIJI);
    }

    @Override // X.C187K
    public final Animator LJIIL() {
        return LJJIII(LJJIJ(), (TuxTextView) this.LJIILJJIL.getValue(), LJJIIZI());
    }

    @Override // X.AbstractC19676911yh
    public final int LJJII() {
        return this.LJIJI;
    }

    @Override // X.C187K
    public final void LJIJJ(boolean z) {
        int i;
        if (this.LJIIJJI) {
            FrameLayout frameLayoutLJJIJ = LJJIJ();
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJZ(i, frameLayoutLJJIJ);
        }
        if (!z) {
            this.LJIILLIIL = null;
        }
    }

    public C212328187i(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.LJIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 538));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 534));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 540));
        this.LJIILL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 536));
        this.LJIIZILJ = C418440Gaw.LIZIZ(56);
        this.LJIJ = true;
        this.LJIIJJI = LJIILJJIL(R.id.jsj);
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
        sbLIZ.append("HotSaleTagV2 show hotCount = ");
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
                C786410Ut5.LJZ(4, LJJIJ());
                C0H9H.LJI(this.LJI.getMarginTop(), LJJIJ());
                if (j2 > 0) {
                    strLJJI = AbstractC19676911yh.LJJI(j2);
                } else {
                    strLJJI = "";
                }
                ViewGroup viewGroup = (ViewGroup) this.LJIILIIL.getValue();
                TuxTextView tuxTextView = (TuxTextView) this.LJIILJJIL.getValue();
                TuxTextView tuxTextViewLJJIIZI = LJJIIZI();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(LJJIIJ());
                sbLIZ2.append((char) 160);
                LJIL(viewGroup, tuxTextView, tuxTextViewLJJIIZI, C2188811AlT.LIZIZ(sbLIZ2), strLJJI, this.LJIIZILJ, 13, 9);
                LJIJI(0L);
                this.LJIILLIIL = this.LJ;
                c187x.LIZIZ = true;
            } else if (!C187K.LJIIJ(this.LJ, this.LJIILLIIL)) {
                if (j2 > 0) {
                    AtmosphereTag atmosphereTag2 = this.LJIILLIIL;
                    if (atmosphereTag2 != null) {
                        if (atmosphereTag2.count > 0) {
                            ViewGroup viewGroup2 = (ViewGroup) this.LJIILIIL.getValue();
                            TuxTextView tuxTextView2 = (TuxTextView) this.LJIILJJIL.getValue();
                            TuxTextView tuxTextViewLJJIIZI2 = LJJIIZI();
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(LJJIIJ());
                            sbLIZ3.append((char) 160);
                            LJIL(viewGroup2, tuxTextView2, tuxTextViewLJJIIZI2, C2188811AlT.LIZIZ(sbLIZ3), AbstractC19676911yh.LJJI(j2), this.LJIIZILJ, 13, 9);
                            AbstractC19676911yh.LJJIFFI(LJJIIZI()).start();
                        } else {
                            ViewGroup viewGroup3 = (ViewGroup) this.LJIILIIL.getValue();
                            TuxTextView tuxTextView3 = (TuxTextView) this.LJIILJJIL.getValue();
                            TuxTextView tuxTextViewLJJIIZI3 = LJJIIZI();
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(LJJIIJ());
                            sbLIZ4.append((char) 160);
                            LJJIIJZLJL(viewGroup3, tuxTextView3, tuxTextViewLJJIIZI3, C2188811AlT.LIZIZ(sbLIZ4), AbstractC19676911yh.LJJI(j2), this.LJIIZILJ, 13, 9, C418440Gaw.LIZIZ(15));
                        }
                    }
                } else {
                    AtmosphereTag atmosphereTag3 = this.LJIILLIIL;
                    if (atmosphereTag3 != null && atmosphereTag3.count > 0) {
                        ViewGroup viewGroup4 = (ViewGroup) this.LJIILIIL.getValue();
                        TuxTextView tuxTextView4 = (TuxTextView) this.LJIILJJIL.getValue();
                        TuxTextView tuxTextViewLJJIIZI4 = LJJIIZI();
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(LJJIIJ());
                        sbLIZ5.append("  ");
                        LJJIIJZLJL(viewGroup4, tuxTextView4, tuxTextViewLJJIIZI4, C2188811AlT.LIZIZ(sbLIZ5), "", this.LJIIZILJ, 13, 9, C418440Gaw.LIZIZ(15));
                    }
                }
                c187x.LIZIZ = true;
                this.LJIILLIIL = this.LJ;
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
