package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DsC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C352700DsC {
    public final long LIZ;
    public final long LIZIZ;
    public final NLETrackSlot LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C352700DsC)) {
            return false;
        }
        C352700DsC c352700DsC = (C352700DsC) obj;
        return this.LIZ == c352700DsC.LIZ && this.LIZIZ == c352700DsC.LIZIZ && Intrinsics.LJFF(this.LIZJ, c352700DsC.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotInterval(startTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", slot=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C352700DsC(long j, NLETrackSlot nLETrackSlot, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = nLETrackSlot;
    }
}
