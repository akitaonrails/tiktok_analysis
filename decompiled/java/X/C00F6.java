package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00F6, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00F6 {
    public final Map<Long, C442740HXs> LIZ;
    public final boolean LIZIZ;

    public C00F6() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00F6)) {
            return false;
        }
        C00F6 c00f6 = (C00F6) obj;
        return Intrinsics.LJFF(this.LIZ, c00f6.LIZ) && this.LIZIZ == c00f6.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerAnimationStatusState(tasks=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isPolling=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C00F6(int i) {
        this(C2097608Jq.LJ(), false);
    }

    public C00F6(Map<Long, C442740HXs> map, boolean z) {
        this.LIZ = map;
        this.LIZIZ = z;
    }

    public static C00F6 LIZ(C00F6 c00f6, Map map, boolean z, int i) {
        if ((i & 1) != 0) {
            map = c00f6.LIZ;
        }
        if ((i & 2) != 0) {
            z = c00f6.LIZIZ;
        }
        c00f6.getClass();
        return new C00F6(map, z);
    }
}
