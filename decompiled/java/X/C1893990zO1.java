package X;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zO1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893990zO1 {
    public final C1894010zO3 LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final HashSet<String> LJI;
    public final HashSet<EnumC1893950zNx> LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1893990zO1)) {
            return false;
        }
        C1893990zO1 c1893990zO1 = (C1893990zO1) obj;
        return Intrinsics.LJFF(this.LIZ, c1893990zO1.LIZ) && this.LIZIZ == c1893990zO1.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1893990zO1.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1893990zO1.LIZLLL) && this.LJ == c1893990zO1.LJ && this.LJFF == c1893990zO1.LJFF && Intrinsics.LJFF(this.LJI, c1893990zO1.LJI) && Intrinsics.LJFF(this.LJII, c1893990zO1.LJII);
    }

    public final int hashCode() {
        C1894010zO3 c1894010zO3 = this.LIZ;
        return ((((((((((((((c1894010zO3 == null ? 0 : c1894010zO3.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IncentiveHeadlessJSConfig(jsTaskConfig=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isPrefetch=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", apiCacheUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", apiCacheUrlPath=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", prePreDecodeEnable=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", needRemoveExpiredApiCache=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", pidTimingSet=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", timing=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1893990zO1(C1894010zO3 c1894010zO3, boolean z, String str, String str2, boolean z2, boolean z3, HashSet<String> hashSet, HashSet<EnumC1893950zNx> hashSet2) {
        this.LIZ = c1894010zO3;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = hashSet;
        this.LJII = hashSet2;
    }
}
