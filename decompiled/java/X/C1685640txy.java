package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0txy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685640txy {
    public final C05P1<Boolean> LIZ;
    public final C05P1<Boolean> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1685640txy)) {
            return false;
        }
        C1685640txy c1685640txy = (C1685640txy) obj;
        return Intrinsics.LJFF(this.LIZ, c1685640txy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1685640txy.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SoundState(isSilentModeEnable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isVolumeLow=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1685640txy(C05P0 c05p0, C05P0 c05p02) {
        this.LIZ = c05p0;
        this.LIZIZ = c05p02;
    }
}
