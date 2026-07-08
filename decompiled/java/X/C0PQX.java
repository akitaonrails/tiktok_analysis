package X;

import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.ClickSearchResponse;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickRecommendProductsResponse;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PQX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PQX {
    public final EnumC645610PTz LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final C0QRC<ClickSearchResponse> LJFF;
    public final C0QRC<EcClickSearchResponse> LJI;
    public final C0QRC<EcClickRecommendProductsResponse> LJII;
    public final boolean LJIIIIZZ;
    public final C0PUB LJIIIZ;
    public final int LJIIJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C0PQX() {
        int i = 0;
        this((EnumC645610PTz) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), i, (String) (0 == true ? 1 : 0), (C0QRC) (0 == true ? 1 : 0), (C0QRC) (0 == true ? 1 : 0), (C0QRC) (0 == true ? 1 : 0), (C0PUB) (0 == true ? 1 : 0), i, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PQX)) {
            return false;
        }
        C0PQX c0pqx = (C0PQX) obj;
        return this.LIZ == c0pqx.LIZ && Intrinsics.LJFF(this.LIZIZ, c0pqx.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0pqx.LIZJ) && this.LIZLLL == c0pqx.LIZLLL && Intrinsics.LJFF(this.LJ, c0pqx.LJ) && Intrinsics.LJFF(this.LJFF, c0pqx.LJFF) && Intrinsics.LJFF(this.LJI, c0pqx.LJI) && Intrinsics.LJFF(this.LJII, c0pqx.LJII) && this.LJIIIIZZ == c0pqx.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c0pqx.LJIIIZ) && this.LJIIJ == c0pqx.LJIIJ;
    }

    public final int hashCode() {
        EnumC645610PTz enumC645610PTz = this.LIZ;
        int iHashCode = (enumC645610PTz == null ? 0 : enumC645610PTz.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LIZLLL) * 31;
        String str3 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C0QRC<ClickSearchResponse> c0qrc = this.LJFF;
        int iHashCode5 = (iHashCode4 + (c0qrc == null ? 0 : c0qrc.hashCode())) * 31;
        C0QRC<EcClickSearchResponse> c0qrc2 = this.LJI;
        int iHashCode6 = (iHashCode5 + (c0qrc2 == null ? 0 : c0qrc2.hashCode())) * 31;
        C0QRC<EcClickRecommendProductsResponse> c0qrc3 = this.LJII;
        int iHashCode7 = (((iHashCode6 + (c0qrc3 == null ? 0 : c0qrc3.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        C0PUB c0pub = this.LJIIIZ;
        return ((iHashCode7 + (c0pub != null ? c0pub.hashCode() : 0)) * 31) + this.LJIIJ;
    }

    public final String toString() {
        return "ClickSearchData(scene=" + this.LIZ + ", query=" + this.LIZIZ + ", srcId=" + this.LIZJ + ", cardIndex=" + this.LIZLLL + ", productId=" + this.LJ + ", generalSearchResponse=" + this.LJFF + ", ecomSearchResponse=" + this.LJI + ", ecomSearchRecommendProductsResponse=" + this.LJII + ", isPreload=" + this.LJIIIIZZ + ", mobData=" + this.LJIIIZ + ", requestNum=" + this.LJIIJ + ')';
    }

    public static C0PQX LIZ(C0PQX c0pqx) {
        return new C0PQX(c0pqx.LIZ, c0pqx.LIZIZ, c0pqx.LIZJ, -1, c0pqx.LJ, c0pqx.LJFF, c0pqx.LJI, c0pqx.LJII, c0pqx.LJIIIIZZ, c0pqx.LJIIIZ, c0pqx.LJIIJ);
    }

    public /* synthetic */ C0PQX(EnumC645610PTz enumC645610PTz, String str, String str2, int i, String str3, C0QRC c0qrc, C0QRC c0qrc2, C0QRC c0qrc3, C0PUB c0pub, int i2, int i3) {
        this((i3 & 1) != 0 ? null : enumC645610PTz, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? -1 : i, (i3 & 16) != 0 ? null : str3, (C0QRC<ClickSearchResponse>) ((i3 & 32) != 0 ? null : c0qrc), (C0QRC<EcClickSearchResponse>) ((i3 & 64) != 0 ? null : c0qrc2), (C0QRC<EcClickRecommendProductsResponse>) ((i3 & 128) != 0 ? null : c0qrc3), false, (i3 & 512) == 0 ? c0pub : null, (i3 & 1024) != 0 ? -1 : i2);
    }

    public C0PQX(EnumC645610PTz enumC645610PTz, String str, String str2, int i, String str3, C0QRC<ClickSearchResponse> c0qrc, C0QRC<EcClickSearchResponse> c0qrc2, C0QRC<EcClickRecommendProductsResponse> c0qrc3, boolean z, C0PUB c0pub, int i2) {
        this.LIZ = enumC645610PTz;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = str3;
        this.LJFF = c0qrc;
        this.LJI = c0qrc2;
        this.LJII = c0qrc3;
        this.LJIIIIZZ = z;
        this.LJIIIZ = c0pub;
        this.LJIIJ = i2;
    }
}
