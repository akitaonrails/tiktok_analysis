package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0stY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644460stY<A, B, C, D> {
    public final A LIZ;
    public final B LIZIZ;
    public final C LIZJ;
    public final D LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1644460stY)) {
            return false;
        }
        C1644460stY c1644460stY = (C1644460stY) obj;
        return Intrinsics.LJFF(this.LIZ, c1644460stY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1644460stY.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1644460stY.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1644460stY.LIZLLL);
    }

    public C1644460stY(A a, B b, C c, D d) {
        this.LIZ = a;
        this.LIZIZ = b;
        this.LIZJ = c;
        this.LIZLLL = d;
    }
}
