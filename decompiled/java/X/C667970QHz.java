package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QHz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C667970QHz implements InterfaceC663970Q2p {
    public final boolean LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;

    public C667970QHz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C667970QHz)) {
            return false;
        }
        C667970QHz c667970QHz = (C667970QHz) obj;
        return this.LIZ == c667970QHz.LIZ && this.LIZIZ == c667970QHz.LIZIZ && this.LIZJ == c667970QHz.LIZJ && this.LIZLLL == c667970QHz.LIZLLL && Intrinsics.LJFF(this.LJ, c667970QHz.LJ);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchIntermediateDurationState(isBackFromSearch=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", refreshBlankPageTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", endBlankPageTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C667970QHz(int i) {
        this(0L, 0L, "", 0L, false);
    }

    public C667970QHz(long j, long j2, String str, long j3, boolean z) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = str;
    }

    public static C667970QHz LIZ(C667970QHz c667970QHz, boolean z, long j, long j2, long j3, String str, int i) {
        String str2 = str;
        long j4 = j2;
        long j5 = j;
        long j6 = j3;
        boolean z2 = z;
        if ((i & 1) != 0) {
            z2 = c667970QHz.LIZ;
        }
        if ((i & 2) != 0) {
            j5 = c667970QHz.LIZIZ;
        }
        if ((i & 4) != 0) {
            j4 = c667970QHz.LIZJ;
        }
        if ((i & 8) != 0) {
            j6 = c667970QHz.LIZLLL;
        }
        if ((i & 16) != 0) {
            str2 = c667970QHz.LJ;
        }
        c667970QHz.getClass();
        return new C667970QHz(j5, j4, str2, j6, z2);
    }
}
