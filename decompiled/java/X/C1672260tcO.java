package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tcO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672260tcO {
    public final InterfaceC1670590tZh LIZ;
    public final C1668880tWw LIZIZ;
    public final boolean LIZJ;

    public C1672260tcO() {
        this(null, null, false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1672260tcO)) {
            return false;
        }
        C1672260tcO c1672260tcO = (C1672260tcO) obj;
        return Intrinsics.LJFF(this.LIZ, c1672260tcO.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1672260tcO.LIZIZ) && this.LIZJ == c1672260tcO.LIZJ;
    }

    public C1672260tcO(C1175304il c1175304il, C1668880tWw c1668880tWw, boolean z, int i) {
        c1175304il = (i & 1) != 0 ? null : c1175304il;
        c1668880tWw = (i & 2) != 0 ? C1668100tVg.LIZ : c1668880tWw;
        z = (i & 4) != 0 ? false : z;
        this.LIZ = c1175304il;
        this.LIZIZ = c1668880tWw;
        this.LIZJ = z;
    }
}
