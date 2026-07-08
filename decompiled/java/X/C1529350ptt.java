package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ptt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529350ptt {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public EnumC1507260pKG LIZLLL;
    public boolean LJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1529350ptt() {
        String str = null;
        this(str, str, 7);
    }

    public final boolean LIZIZ() {
        return a0.LJJJIL(this.LIZIZ) || a0.LJJJIL(this.LIZJ);
    }

    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('/');
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return LIZ().hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('-');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('-');
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1529350ptt)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C1529350ptt c1529350ptt = (C1529350ptt) obj;
        if (!Intrinsics.LJFF(c1529350ptt.LIZ, this.LIZ) || !Intrinsics.LJFF(c1529350ptt.LIZIZ, this.LIZIZ) || !Intrinsics.LJFF(c1529350ptt.LIZJ, this.LIZJ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1529350ptt(String str, String str2, int i) {
        String str3;
        if ((i & 1) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        this(str3, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }

    public C1529350ptt(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = EnumC1507260pKG.INJECT_PREFIX;
    }
}
