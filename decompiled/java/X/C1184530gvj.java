package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gvj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184530gvj implements InterfaceC111300bX {
    public final String LL;
    public final boolean LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL;
    public final C1188530h2B LLIZ;
    public final C1185410gx9 LLIZLLLIL;
    public final C1188440h22 LLJ;
    public final Boolean LLJI;
    public final boolean LLJIJIL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1184530gvj() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        this((String) null, false, (int) (0 == true ? 1 : 0), (String) objArr, (String) objArr2, (boolean) (0 == true ? 1 : 0), (C1188530h2B) objArr3, (C1185410gx9) objArr4, (Boolean) objArr5, (boolean) (0 == true ? 1 : 0), 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1184530gvj)) {
            return false;
        }
        C1184530gvj c1184530gvj = (C1184530gvj) obj;
        return Intrinsics.LJFF(this.LL, c1184530gvj.LL) && this.LLILLJJLI == c1184530gvj.LLILLJJLI && this.LLILLL == c1184530gvj.LLILLL && Intrinsics.LJFF(this.LLILZ, c1184530gvj.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1184530gvj.LLILZIL) && this.LLILZLL == c1184530gvj.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1184530gvj.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1184530gvj.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1184530gvj.LLJ) && Intrinsics.LJFF(this.LLJI, c1184530gvj.LLJI) && this.LLJIJIL == c1184530gvj.LLJIJIL;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL) * 31;
        String str2 = this.LLILZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZIL;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        C1188530h2B c1188530h2B = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (c1188530h2B == null ? 0 : c1188530h2B.hashCode())) * 31;
        C1185410gx9 c1185410gx9 = this.LLIZLLLIL;
        int iHashCode5 = (iHashCode4 + (c1185410gx9 == null ? 0 : c1185410gx9.hashCode())) * 31;
        C1188440h22 c1188440h22 = this.LLJ;
        int iHashCode6 = (iHashCode5 + (c1188440h22 == null ? 0 : c1188440h22.hashCode())) * 31;
        Boolean bool = this.LLJI;
        return ((iHashCode6 + (bool != null ? bool.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJIJIL);
    }

    public final String toString() {
        return "PoiCollectHierarchyData(poiId=" + this.LL + ", isCollected=" + this.LLILLJJLI + ", style=" + this.LLILLL + ", poiName=" + this.LLILZ + ", poiAddress=" + this.LLILZIL + ", isReserveTableBtnShow=" + this.LLILZLL + ", poiCollectMobData=" + this.LLIZ + ", poiDetailParams=" + this.LLIZLLLIL + ", anchorData=" + this.LLJ + ", dataFromAnchor=" + this.LLJI + ", shouldShowIcon=" + this.LLJIJIL + ')';
    }

    public /* synthetic */ C1184530gvj(String str, boolean z, int i, String str2, String str3, boolean z2, C1188530h2B c1188530h2B, C1185410gx9 c1185410gx9, Boolean bool, boolean z3, int i2) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? null : c1188530h2B, (i2 & 128) != 0 ? null : c1185410gx9, (C1188440h22) null, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? true : z3);
    }

    public C1184530gvj(String str, boolean z, int i, String str2, String str3, boolean z2, C1188530h2B c1188530h2B, C1185410gx9 c1185410gx9, C1188440h22 c1188440h22, Boolean bool, boolean z3) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = z2;
        this.LLIZ = c1188530h2B;
        this.LLIZLLLIL = c1185410gx9;
        this.LLJ = c1188440h22;
        this.LLJI = bool;
        this.LLJIJIL = z3;
    }
}
