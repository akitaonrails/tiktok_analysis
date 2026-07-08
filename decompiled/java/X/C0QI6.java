package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QI6, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QI6 implements InterfaceC663970Q2p {
    public final String LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final int LJ;

    public C0QI6() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QI6)) {
            return false;
        }
        C0QI6 c0qi6 = (C0QI6) obj;
        return Intrinsics.LJFF(this.LIZ, c0qi6.LIZ) && this.LIZIZ == c0qi6.LIZIZ && this.LIZJ == c0qi6.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0qi6.LIZLLL) && this.LJ == c0qi6.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchBoxSignalState(contentBeforeClear=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clearedTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isClickSearchBarInResult=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lastSug=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0QI6(int i) {
        this(0L, 0, "", "", false);
    }

    public C0QI6(long j, int i, String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = z;
        this.LIZLLL = str2;
        this.LJ = i;
    }

    public static C0QI6 LIZ(C0QI6 c0qi6, String str, long j, boolean z, String str2, int i, int i2) {
        String str3 = str2;
        boolean z2 = z;
        long j2 = j;
        int i3 = i;
        String str4 = str;
        if ((i2 & 1) != 0) {
            str4 = c0qi6.LIZ;
        }
        if ((i2 & 2) != 0) {
            j2 = c0qi6.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            z2 = c0qi6.LIZJ;
        }
        if ((i2 & 8) != 0) {
            str3 = c0qi6.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            i3 = c0qi6.LJ;
        }
        c0qi6.getClass();
        return new C0QI6(j2, i3, str4, str3, z2);
    }
}
