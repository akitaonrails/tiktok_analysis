package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tJ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660260tJ2<A, B, C, D> {
    public final A LIZ;
    public final B LIZIZ;
    public final C LIZJ;
    public final D LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1660260tJ2)) {
            return false;
        }
        C1660260tJ2 c1660260tJ2 = (C1660260tJ2) obj;
        return Intrinsics.LJFF(this.LIZ, c1660260tJ2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1660260tJ2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1660260tJ2.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1660260tJ2.LIZLLL);
    }

    public C1660260tJ2(A a, B b, C c, D d) {
        this.LIZ = a;
        this.LIZIZ = b;
        this.LIZJ = c;
        this.LIZLLL = d;
    }
}
