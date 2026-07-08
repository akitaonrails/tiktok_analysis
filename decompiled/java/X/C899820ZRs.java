package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C899820ZRs {
    public final List<Float> LIZ;
    public final C899830ZRt LIZIZ;
    public final C899720ZRi LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C899820ZRs)) {
            return false;
        }
        C899820ZRs c899820ZRs = (C899820ZRs) obj;
        return Intrinsics.LJFF(this.LIZ, c899820ZRs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c899820ZRs.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c899820ZRs.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SoundWaveState(volumeLevels=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", audioFile=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C899820ZRs(List<Float> list, C899830ZRt c899830ZRt, C899720ZRi c899720ZRi) {
        this.LIZ = list;
        this.LIZIZ = c899830ZRt;
        this.LIZJ = c899720ZRi;
    }
}
