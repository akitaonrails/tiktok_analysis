package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ykj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869630ykj implements C164B {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final int LJFF;

    @Override // X.C164B
    public final String b5() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869630ykj)) {
            return false;
        }
        C1869630ykj c1869630ykj = (C1869630ykj) obj;
        return Intrinsics.LJFF(this.LIZ, c1869630ykj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1869630ykj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1869630ykj.LIZJ) && this.LIZLLL == c1869630ykj.LIZLLL && Intrinsics.LJFF(this.LJ, c1869630ykj.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        String str = this.LJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StringTranslationCacheValue(srcContent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", translatedContent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", targetLang=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isPreload=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", variant=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C164B
    public final Integer c5() {
        return Integer.valueOf(this.LJFF);
    }

    @Override // X.C164B
    public final boolean a5() {
        return this.LIZLLL;
    }

    @Override // X.C164B
    public final String getVariant() {
        return this.LJ;
    }

    public C1869630ykj(String str, String str2, String str3, boolean z, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
        this.LJ = str4;
        this.LJFF = str2.length();
    }
}
