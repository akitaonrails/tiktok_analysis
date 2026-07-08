package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cdR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019430cdR extends C09AY implements Function0<C1019480cdW> {
    public C1019430cdR() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0cdW] */
    @Override // kotlin.jvm.functions.Function0
    public final C1019480cdW invoke() {
        return new AbstractC1019470cdV() { // from class: X.0cdW
            public HashSet<String> LJIIJJI = new HashSet<>();
            public int LJIIL = -1;
            public int LJIILIIL = -1;
            public long LJIILJJIL = -1;
            public long LJIILL = -1;
            public long LJIILLIIL = -1;
            public long LJIIZILJ = -1;

            @Override // X.AbstractC1019470cdV
            public final void LJ() {
                super.LJ();
                this.LJIIL = -1;
                this.LJIILIIL = -1;
                this.LJIILJJIL = System.currentTimeMillis();
                this.LJIILL = -1L;
                this.LJIILLIIL = -1L;
                this.LJIIZILJ = -1L;
                this.LJIIJJI = new HashSet<>();
            }

            @Override // X.AbstractC1019470cdV
            public final boolean LIZ(Aweme aweme) {
                String creativeIdStr;
                AwemeRawAd awemeRawAdLJJIJL;
                AwemeRawAd awemeRawAdLJJIJL2 = C1017070cZd.LJJIJL(aweme);
                if (awemeRawAdLJJIJL2 == null || (creativeIdStr = awemeRawAdLJJIJL2.getCreativeIdStr()) == null || (awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme)) == null || !Intrinsics.LJFF(awemeRawAdLJJIJL.getIsROI2(), Boolean.TRUE) || this.LJII.containsKey(creativeIdStr) || Intrinsics.LJFF(this.LJIIJ, aweme.getAid())) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC1019470cdV
            public final void LIZLLL(List<? extends Aweme> list) {
                String creativeIdStr;
                for (Aweme aweme : list) {
                    AwemeRawAd awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme);
                    if (awemeRawAdLJJIJL != null && Intrinsics.LJFF(awemeRawAdLJJIJL.getIsROI2(), Boolean.TRUE)) {
                        HashSet<String> hashSet = this.LJIIIZ;
                        AwemeRawAd awemeRawAdLJJIJL2 = C1017070cZd.LJJIJL(aweme);
                        if (awemeRawAdLJJIJL2 == null || (creativeIdStr = awemeRawAdLJJIJL2.getCreativeIdStr()) == null) {
                            creativeIdStr = "";
                        }
                        hashSet.add(creativeIdStr);
                    }
                }
            }

            @Override // X.AbstractC1019470cdV
            public final void LJFF(Aweme aweme) {
                if (aweme.isAd() && !this.LJIIJJI.contains(aweme.getAid())) {
                    this.LJIIL = this.LJ;
                    this.LJIIJJI.add(aweme.getAid());
                } else if (aweme.isSoftAd() && !this.LJIIJJI.contains(aweme.getAid())) {
                    this.LJIILIIL = this.LJ;
                    this.LJIIJJI.add(aweme.getAid());
                }
                super.LJFF(aweme);
            }

            @Override // X.AbstractC1019470cdV
            public final void LIZJ(C1022820ciu c1022820ciu, String str) {
                int i;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.LJIILL == -1) {
                    this.LJIILL = jCurrentTimeMillis;
                }
                this.LJIILLIIL = jCurrentTimeMillis;
                super.LIZJ(c1022820ciu, str);
                C1019500cdY c1019500cdY = this.LJII.get(str);
                if (c1019500cdY != null && !c1019500cdY.LJIIIZ) {
                    int i2 = this.LJIIL;
                    int i3 = -1;
                    if (i2 == -1) {
                        i = -1;
                    } else {
                        i = (this.LJ - i2) - 1;
                    }
                    c1019500cdY.LJFF = i;
                    int i4 = this.LJIILIIL;
                    if (i4 != -1) {
                        i3 = (this.LJ - i4) - 1;
                    }
                    c1019500cdY.LJII = i3;
                    c1019500cdY.LJIIIZ = true;
                }
                C1019500cdY c1019500cdY2 = this.LJII.get(str);
                if (c1019500cdY2 != null) {
                    c1022820ciu.LIZIZ(Integer.valueOf(c1019500cdY2.LJFF), "ad_gap");
                    c1022820ciu.LIZIZ(Integer.valueOf(c1019500cdY2.LJII), "ad_gap_spark_plus");
                    c1022820ciu.LIZIZ(Integer.valueOf(c1019500cdY2.LJ), "ad_gap_roi2");
                    c1022820ciu.LIZIZ(Long.valueOf(this.LJIILJJIL), "first_timestamp_of_enter_session");
                    c1022820ciu.LIZIZ(Long.valueOf(this.LJIILL), "timestamp_of_first_ad_with_show");
                    c1022820ciu.LIZIZ(Long.valueOf(this.LJIIZILJ), "last_timestamp_of_ad_with_show");
                    c1022820ciu.LIZIZ(Integer.valueOf(c1019500cdY2.LJ), "last_relative_position_of_ad_with_show");
                }
                long j = this.LJIILLIIL;
                if (j != -1) {
                    this.LJIIZILJ = j;
                    this.LJIILLIIL = -1L;
                }
            }
        };
    }
}
