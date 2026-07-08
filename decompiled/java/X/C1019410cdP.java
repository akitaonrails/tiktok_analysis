package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019410cdP extends C09AY implements Function0<C1019490cdX> {
    public C1019410cdP() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0cdX] */
    @Override // kotlin.jvm.functions.Function0
    public final C1019490cdX invoke() {
        return new AbstractC1019470cdV() { // from class: X.0cdX
            public int LJIIJJI = -1;
            public int LJIIL = -1;

            @Override // X.AbstractC1019470cdV
            public final void LJ() {
                super.LJ();
                this.LJIIJJI = -1;
                this.LJIIL = -1;
            }

            @Override // X.AbstractC1019470cdV
            public final boolean LIZ(Aweme aweme) {
                if (super.LIZ(aweme) && C2245741Cv6.LIZJ(aweme)) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC1019470cdV
            public final void LJFF(Aweme aweme) {
                AwemeRawAd awemeRawAd;
                if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && !awemeRawAd.isReshowAd() && !C2245741Cv6.LIZJ(aweme)) {
                    this.LJIIJJI = this.LJ;
                } else if (C1017070cZd.LJLL(aweme)) {
                    this.LJIIL = this.LJ;
                }
                super.LJFF(aweme);
            }

            @Override // X.AbstractC1019470cdV
            public final void LIZJ(C1022820ciu c1022820ciu, String str) {
                Integer numValueOf;
                int i;
                int i2 = -1;
                this.LJ--;
                this.LJFF--;
                super.LIZJ(c1022820ciu, str);
                C1019500cdY c1019500cdY = this.LJII.get(str);
                if (c1019500cdY != null) {
                    int i3 = this.LJIIJJI;
                    if (i3 == -1) {
                        i = -1;
                    } else {
                        i = (this.LJ - i3) - 1;
                    }
                    c1019500cdY.LJFF = i;
                    int i4 = this.LJIIL;
                    if (i4 != -1) {
                        i2 = (-1) + (this.LJ - i4);
                    }
                    c1019500cdY.LJI = i2;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onAdShow, adGapFyp: ");
                C1019500cdY c1019500cdY2 = this.LJII.get(str);
                Integer numValueOf2 = null;
                if (c1019500cdY2 != null) {
                    numValueOf = Integer.valueOf(c1019500cdY2.LJFF);
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(", adGapEcom: ");
                C1019500cdY c1019500cdY3 = this.LJII.get(str);
                if (c1019500cdY3 != null) {
                    numValueOf2 = Integer.valueOf(c1019500cdY3.LJI);
                }
                sbLIZ.append(numValueOf2);
                LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                C1019500cdY c1019500cdY4 = this.LJII.get(str);
                if (c1019500cdY4 != null) {
                    c1022820ciu.LIZIZ(Integer.valueOf(c1019500cdY4.LJFF), "ad_gap_001");
                    c1022820ciu.LIZIZ(Integer.valueOf(c1019500cdY4.LJI), "ad_gap_ecom");
                }
                this.LJ++;
                this.LJFF++;
            }
        };
    }
}
