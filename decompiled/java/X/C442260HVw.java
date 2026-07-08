package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C442260HVw {
    public final String LIZ;
    public final InterfaceC1685750ty9 LIZIZ;
    public final InterfaceC1685750ty9 LIZJ;

    public C442260HVw() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C442260HVw)) {
            return false;
        }
        C442260HVw c442260HVw = (C442260HVw) obj;
        return Intrinsics.LJFF(this.LIZ, c442260HVw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c442260HVw.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c442260HVw.LIZJ);
    }

    public C442260HVw(String str, InterfaceC1685750ty9 interfaceC1685750ty9, int i) {
        C1685760tyA c1685760tyA;
        str = (i & 1) != 0 ? "" : str;
        interfaceC1685750ty9 = (i & 2) != 0 ? InterfaceC1685750ty9.LIZ : interfaceC1685750ty9;
        if ((i & 4) != 0) {
            c1685760tyA = InterfaceC1685750ty9.LIZ;
        } else {
            c1685760tyA = null;
        }
        this.LIZ = str;
        this.LIZIZ = interfaceC1685750ty9;
        this.LIZJ = c1685760tyA;
    }
}
