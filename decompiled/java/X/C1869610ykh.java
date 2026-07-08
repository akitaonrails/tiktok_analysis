package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ykh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869610ykh implements C164B {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final int LJI;

    @Override // X.C164B
    public final String b5() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869610ykh)) {
            return false;
        }
        C1869610ykh c1869610ykh = (C1869610ykh) obj;
        return Intrinsics.LJFF(this.LIZ, c1869610ykh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1869610ykh.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1869610ykh.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1869610ykh.LIZLLL) && this.LJ == c1869610ykh.LJ && Intrinsics.LJFF(this.LJFF, c1869610ykh.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        String str = this.LJFF;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizCompTranslationCacheValue(originalText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", originalLanguage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", translatedText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", translationLang=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isPreload=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", variant=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C164B
    public final Integer c5() {
        return Integer.valueOf(this.LJI);
    }

    @Override // X.C164B
    public final boolean a5() {
        return this.LJ;
    }

    @Override // X.C164B
    public final String getVariant() {
        return this.LJFF;
    }

    public C1869610ykh(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = z;
        this.LJFF = str5;
        this.LJI = str3.length();
    }
}
