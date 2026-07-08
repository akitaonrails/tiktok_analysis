package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SA3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SA3 implements C164B {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Long LIZLLL;
    public final boolean LJFF;
    public final Integer LJ = null;
    public final String LJI = null;

    @Override // X.C164B
    public final String b5() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SA3)) {
            return false;
        }
        C0SA3 c0sa3 = (C0SA3) obj;
        return Intrinsics.LJFF(this.LIZ, c0sa3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0sa3.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0sa3.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0sa3.LIZLLL) && Intrinsics.LJFF(this.LJ, c0sa3.LJ) && this.LJFF == c0sa3.LJFF && Intrinsics.LJFF(this.LJI, c0sa3.LJI);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.LJ;
        int iHashCode5 = (((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        String str3 = this.LJI;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DubbingTranslationCacheValue(targetLang=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", playUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", voiceType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", languageId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", translationSize=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isPreload=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", variant=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C164B
    public final boolean a5() {
        return this.LJFF;
    }

    @Override // X.C164B
    public final Integer c5() {
        return this.LJ;
    }

    @Override // X.C164B
    public final String getVariant() {
        return this.LJI;
    }

    public C0SA3(Long l, String str, String str2, String str3, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = l;
        this.LJFF = z;
    }
}
