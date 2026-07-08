package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.04y6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1270404y6 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final String LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1270404y6() {
        String str = null;
        this(str, str, str, str, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1270404y6)) {
            return false;
        }
        C1270404y6 c1270404y6 = (C1270404y6) obj;
        return Intrinsics.LJFF(this.LIZ, c1270404y6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1270404y6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1270404y6.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1270404y6.LIZLLL) && this.LJ == c1270404y6.LJ && Intrinsics.LJFF(this.LJFF, c1270404y6.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        if (this.LJ) {
            String str = this.LJFF;
            return (!(true ^ a0.LJJJIL(str)) || str == null) ? "" : str;
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI(this.LIZLLL, this.LIZJ, this.LIZIZ, this.LIZ);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIIJJI) {
            if (!a0.LJJJIL((String) obj)) {
                arrayList.add(obj);
            }
        }
        return C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, null, 62);
    }

    public /* synthetic */ C1270404y6(String str, String str2, String str3, String str4, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, false, (i & 32) == 0 ? null : "");
    }

    public C1270404y6(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = z;
        this.LJFF = str5;
    }
}
