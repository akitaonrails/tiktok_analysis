package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dwl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C355530Dwl {
    public final EnumC356350Dy5 LIZ;
    public final NLETrack LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C355530Dwl() {
        this((EnumC356350Dy5) null, (NLETrack) (0 == true ? 1 : 0), 0L, (String) (0 == true ? 1 : 0), 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C355530Dwl)) {
            return false;
        }
        C355530Dwl c355530Dwl = (C355530Dwl) obj;
        return this.LIZ == c355530Dwl.LIZ && Intrinsics.LJFF(this.LIZIZ, c355530Dwl.LIZIZ) && this.LIZJ == c355530Dwl.LIZJ && this.LIZLLL == c355530Dwl.LIZLLL && Intrinsics.LJFF(this.LJ, c355530Dwl.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        NLETrack nLETrack = this.LIZIZ;
        int iHashCode2 = (((((iHashCode + (nLETrack == null ? 0 : nLETrack.hashCode())) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        String str = this.LJ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProFilterState(operationType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetFilterTrack=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startPoint=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", endPoint=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enterWay=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C355530Dwl(EnumC356350Dy5 enumC356350Dy5, NLETrack nLETrack, long j, String str, int i) {
        this((i & 1) != 0 ? EnumC356350Dy5.ADD : enumC356350Dy5, (i & 2) != 0 ? null : nLETrack, 0L, (i & 8) != 0 ? 0L : j, (i & 16) == 0 ? str : null);
    }

    public C355530Dwl(EnumC356350Dy5 enumC356350Dy5, NLETrack nLETrack, long j, long j2, String str) {
        this.LIZ = enumC356350Dy5;
        this.LIZIZ = nLETrack;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = str;
    }
}
