package X;

import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xDD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810410xDD {
    public static final C1810410xDD LJI;
    public final EnumC1811400xEo LIZ;
    public final RankTypeV2 LIZIZ;
    public final RankTypeV2 LIZJ;
    public final RankTypeV2 LIZLLL;
    public final boolean LJ;
    public int LJFF;

    static {
        EnumC1811400xEo enumC1811400xEo = EnumC1811400xEo.DEFAULT;
        RankTypeV2 rankTypeV2 = RankTypeV2.LJJIJIIJI;
        LJI = new C1810410xDD(enumC1811400xEo, rankTypeV2, rankTypeV2, rankTypeV2, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C1810410xDD c1810410xDD = (C1810410xDD) obj;
        if (this.LIZ == c1810410xDD.LIZ && Intrinsics.LJFF(this.LIZIZ, c1810410xDD.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1810410xDD.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1810410xDD.LIZLLL) && this.LJ == c1810410xDD.LJ && this.LJFF == c1810410xDD.LJFF) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C1810410xDD(EnumC1811400xEo enumC1811400xEo, int i, int i2, int i3, boolean z) {
        this(enumC1811400xEo, i, i2, i3, z, 0);
    }

    public /* synthetic */ C1810410xDD(EnumC1811400xEo enumC1811400xEo, RankTypeV2 rankTypeV2, RankTypeV2 rankTypeV22, RankTypeV2 rankTypeV23, boolean z) {
        this(enumC1811400xEo, rankTypeV2, rankTypeV22, rankTypeV23, z, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1810410xDD(EnumC1811400xEo enumC1811400xEo, int i, int i2, int i3, boolean z, int i4) {
        this(enumC1811400xEo, C235000vU.LIZ(i, 0), C235000vU.LIZ(i3, 0), C235000vU.LIZ(i2, 0), z, i4);
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
    }

    public C1810410xDD(EnumC1811400xEo enumC1811400xEo, RankTypeV2 rankTypeV2, RankTypeV2 rankTypeV22, RankTypeV2 rankTypeV23, boolean z, int i) {
        this.LIZ = enumC1811400xEo;
        this.LIZIZ = rankTypeV2;
        this.LIZJ = rankTypeV22;
        this.LIZLLL = rankTypeV23;
        this.LJ = z;
        this.LJFF = i;
    }
}
