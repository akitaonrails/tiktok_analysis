package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ine, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477280Ine {
    public final boolean LIZ;
    public final EnumC477310Inh LIZIZ;
    public final Long LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C477280Ine)) {
            return false;
        }
        C477280Ine c477280Ine = (C477280Ine) obj;
        return this.LIZ == c477280Ine.LIZ && this.LIZIZ == c477280Ine.LIZIZ && Intrinsics.LJFF(this.LIZJ, c477280Ine.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c477280Ine.LIZLLL) && Intrinsics.LJFF(this.LJ, c477280Ine.LJ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        EnumC477310Inh enumC477310Inh = this.LIZIZ;
        int iHashCode = (iZ2 + (enumC477310Inh == null ? 0 : enumC477310Inh.hashCode())) * 31;
        Long l = this.LIZJ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestBannerShowInfo(bannerShow=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bannerType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", contentText=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", joinText=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C477280Ine(boolean z, EnumC477310Inh enumC477310Inh, Long l, String str, int i) {
        this(z, (i & 2) != 0 ? null : enumC477310Inh, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str, (String) null);
    }

    public C477280Ine(boolean z, EnumC477310Inh enumC477310Inh, Long l, String str, String str2) {
        this.LIZ = z;
        this.LIZIZ = enumC477310Inh;
        this.LIZJ = l;
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
