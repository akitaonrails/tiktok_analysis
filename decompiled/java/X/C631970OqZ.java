package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631970OqZ implements InterfaceC0148002o {
    public final boolean LL;
    public final C291001Au<String> LLILLJJLI;

    public C631970OqZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C631970OqZ)) {
            return false;
        }
        C631970OqZ c631970OqZ = (C631970OqZ) obj;
        return this.LL == c631970OqZ.LL && Intrinsics.LJFF(this.LLILLJJLI, c631970OqZ.LLILLJJLI);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        C291001Au<String> c291001Au = this.LLILLJJLI;
        return iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicCellCollectIconState(isCollect=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", toastEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C631970OqZ(int i) {
        this(null, false);
    }

    public C631970OqZ(C291001Au c291001Au, boolean z) {
        this.LL = z;
        this.LLILLJJLI = c291001Au;
    }

    public static C631970OqZ LIZ(C631970OqZ c631970OqZ, boolean z, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            z = c631970OqZ.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c631970OqZ.LLILLJJLI;
        }
        c631970OqZ.getClass();
        return new C631970OqZ(c291001Au, z);
    }
}
