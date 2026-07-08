package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672200tcI {
    public final String LIZ;
    public final String LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1672200tcI)) {
            return false;
        }
        C1672200tcI c1672200tcI = (C1672200tcI) obj;
        return Intrinsics.LJFF(this.LIZ, c1672200tcI.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1672200tcI.LIZIZ) && C1668650tWZ.LIZJ(this.LIZJ, c1672200tcI.LIZJ) && C1668650tWZ.LIZJ(this.LIZLLL, c1672200tcI.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmallBannerProperties(bgUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bgWidth=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZJ));
        sbLIZ.append(", bgHeight=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZLLL));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public C1672200tcI(float f, float f2, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = f;
        this.LIZLLL = f2;
    }
}
