package X;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08bo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2151408bo {
    public final String LIZ;
    public final File LIZIZ;
    public final long LIZJ;
    public final List<Float> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2151408bo)) {
            return false;
        }
        C2151408bo c2151408bo = (C2151408bo) obj;
        return Intrinsics.LJFF(this.LIZ, c2151408bo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2151408bo.LIZIZ) && this.LIZJ == c2151408bo.LIZJ && Intrinsics.LJFF(this.LIZLLL, c2151408bo.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftRestoreResult(fakeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", draftFile=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", waveformData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2151408bo(String str, File file, long j, List<Float> list) {
        this.LIZ = str;
        this.LIZIZ = file;
        this.LIZJ = j;
        this.LIZLLL = list;
    }
}
