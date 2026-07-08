package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dmu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349420Dmu {
    public final String LIZ;
    public final boolean LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C349420Dmu)) {
            return false;
        }
        C349420Dmu c349420Dmu = (C349420Dmu) obj;
        return Intrinsics.LJFF(this.LIZ, c349420Dmu.LIZ) && this.LIZIZ == c349420Dmu.LIZIZ && this.LIZJ == c349420Dmu.LIZJ && this.LIZLLL == c349420Dmu.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioDurationSlot(originSlotUUID=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isNullSlot=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C349420Dmu() {
        this(0L, 0L, "", false);
    }

    public C349420Dmu(long j, long j2, String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = j2;
    }
}
