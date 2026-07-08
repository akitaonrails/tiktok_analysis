package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898490ZMp {
    public final C869590Y9l LIZ;
    public final String LIZIZ;
    public final C869590Y9l LIZJ;
    public final String LIZLLL;

    public C898490ZMp() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C898490ZMp)) {
            return false;
        }
        C898490ZMp c898490ZMp = (C898490ZMp) obj;
        return Intrinsics.LJFF(this.LIZ, c898490ZMp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c898490ZMp.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c898490ZMp.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c898490ZMp.LIZLLL);
    }

    public C898490ZMp(C869590Y9l c869590Y9l, String str, C869590Y9l c869590Y9l2, String str2) {
        this.LIZ = c869590Y9l;
        this.LIZIZ = str;
        this.LIZJ = c869590Y9l2;
        this.LIZLLL = str2;
    }

    public static C898490ZMp LIZ(C898490ZMp c898490ZMp, C869590Y9l c869590Y9l, String str, int i) {
        C869590Y9l c869590Y9l2;
        if ((i & 1) != 0) {
            c869590Y9l = c898490ZMp.LIZ;
        }
        if ((i & 2) != 0) {
            str = c898490ZMp.LIZIZ;
        }
        String str2 = null;
        if ((i & 4) != 0) {
            c869590Y9l2 = c898490ZMp.LIZJ;
        } else {
            c869590Y9l2 = null;
        }
        if ((i & 8) != 0) {
            str2 = c898490ZMp.LIZLLL;
        }
        return new C898490ZMp(c869590Y9l, str, c869590Y9l2, str2);
    }
}
