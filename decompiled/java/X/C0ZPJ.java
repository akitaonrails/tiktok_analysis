package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZPJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZPJ {
    public final boolean LIZ;
    public final C894700Z8a LIZIZ;

    public C0ZPJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZPJ)) {
            return false;
        }
        C0ZPJ c0zpj = (C0ZPJ) obj;
        return this.LIZ == c0zpj.LIZ && Intrinsics.LJFF(this.LIZIZ, c0zpj.LIZIZ);
    }

    public C0ZPJ(int i) {
        this(C894700Z8a.LJI, false);
    }

    public C0ZPJ(C894700Z8a c894700Z8a, boolean z) {
        this.LIZ = z;
        this.LIZIZ = c894700Z8a;
    }
}
