package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MZg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570540MZg {
    public final int LIZ;
    public final String LIZIZ;

    public /* synthetic */ C570540MZg() {
        this(0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C570540MZg)) {
            return false;
        }
        C570540MZg c570540MZg = (C570540MZg) obj;
        return this.LIZ == c570540MZg.LIZ && Intrinsics.LJFF(this.LIZIZ, c570540MZg.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MemoryMobParams(isLiveConfigMem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", liveConfigMemType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C570540MZg(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
