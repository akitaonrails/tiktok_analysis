package X;

import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.186n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212307186n extends AbstractC212220183e<ViewGroup, AnonymousClass1877> {
    public final TuxTextView LJ;
    public final TuxTextView LJFF;
    public final TuxTextView LJI;
    public final SmartImageView LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public String LJIIJ;
    public C1217030hm9 LJIIJJI;

    public final void LJIIJJI() {
        TuxTextView tuxTextView = this.LJFF;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, 1.0f);
        }
        TuxTextView tuxTextView2 = this.LJI;
        if (tuxTextView2 != null) {
            C786410Ut5.B5(tuxTextView2, 1.0f);
        }
    }

    public C212307186n(ViewGroup viewGroup) {
        super(viewGroup, "AuctionLabelCountdownController");
        this.LJ = (TuxTextView) viewGroup.findViewById(R.id.hib);
        this.LJFF = (TuxTextView) viewGroup.findViewById(R.id.yb9);
        this.LJI = (TuxTextView) viewGroup.findViewById(R.id.yb7);
        this.LJII = (SmartImageView) viewGroup.findViewById(R.id.bzi);
        this.LJIIIIZZ = "";
        this.LJIIJ = "";
    }

    public final void LJIIL(String str) {
        T t = this.LIZ;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        if (str != null && str.length() > 0) {
            C01GW c01gw = C2248361CzK.LIZ;
            Integer numLJ = C2248361CzK.LJ(this.LIZLLL, str);
            if (numLJ != null) {
                c384050F3z.LIZ = Integer.valueOf(numLJ.intValue());
            }
        }
        t.setBackground(c384050F3z.LIZ(this.LIZLLL));
    }

    public final void LJIILIIL(AnonymousClass1877 anonymousClass1877) {
        this.LJIIJJI = new C1217030hm9(this.LJ);
        String str = anonymousClass1877.LIZ;
        if (str == null) {
            str = "";
        }
        this.LJIIJ = str;
        TuxTextView tuxTextView = this.LJFF;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        C19411510wz.LIZ.LJ(EnumC1769850w9n.LIVE_SURPRISE_AUCTION_CARD_ICON, this.LJII, anonymousClass1877.LIZIZ);
    }

    public final void LJIILJJIL(long j, boolean z) {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        if (z) {
            String strLIZIZ = C1868470yir.LIZIZ(j);
            this.LJIIIIZZ = strLIZIZ;
            if (!this.LJIIIZ) {
                TuxTextView tuxTextView3 = this.LJFF;
                if (tuxTextView3 != null && (tuxTextView2 = this.LJI) != null) {
                    C994600bzO.LIZ(tuxTextView3, tuxTextView2, new AwS576S0100000_32(this, 647), new AwS576S0100000_32(this, 648)).start();
                }
                this.LJIIIZ = true;
                return;
            }
            TuxTextView tuxTextView4 = this.LJFF;
            if (tuxTextView4 == null) {
                return;
            }
            tuxTextView4.setText(strLIZIZ);
            return;
        }
        if (this.LJIIIZ) {
            TuxTextView tuxTextView5 = this.LJFF;
            if (tuxTextView5 != null && (tuxTextView = this.LJI) != null) {
                C994600bzO.LIZ(tuxTextView5, tuxTextView, new AwS576S0100000_32(this, 645), new AwS576S0100000_32(this, 646)).start();
            }
            this.LJIIIZ = false;
            return;
        }
        LJIIJJI();
        TuxTextView tuxTextView6 = this.LJFF;
        if (tuxTextView6 == null) {
            return;
        }
        tuxTextView6.setText(this.LJIIJ);
    }
}
