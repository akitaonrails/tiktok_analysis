package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0amR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948130amR {
    public final C948300ami LIZ;
    public final int LIZIZ;
    public final C946340ajY LIZJ;

    public C948130amR() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C948130amR)) {
            return false;
        }
        C948130amR c948130amR = (C948130amR) obj;
        return Intrinsics.LJFF(this.LIZ, c948130amR.LIZ) && this.LIZIZ == c948130amR.LIZIZ && Intrinsics.LJFF(this.LIZJ, c948130amR.LIZJ);
    }

    public /* synthetic */ C948130amR(int i) {
        this(new C948300ami(0), 0, new C946340ajY(0));
    }

    public C948130amR(C948300ami c948300ami, int i, C946340ajY c946340ajY) {
        this.LIZ = c948300ami;
        this.LIZIZ = i;
        this.LIZJ = c946340ajY;
    }

    public static C948130amR LIZ(C948130amR c948130amR, C948300ami c948300ami, int i, int i2) {
        C946340ajY c946340ajY;
        if ((i2 & 1) != 0) {
            c948300ami = c948130amR.LIZ;
        }
        if ((i2 & 2) != 0) {
            i = c948130amR.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            c946340ajY = c948130amR.LIZJ;
        } else {
            c946340ajY = null;
        }
        c948130amR.getClass();
        return new C948130amR(c948300ami, i, c946340ajY);
    }
}
