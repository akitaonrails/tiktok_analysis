package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qrA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566100qrA<T> {
    public final String LIZ;
    public final T LIZIZ;
    public C1566100qrA<T> LIZJ;
    public C1566100qrA<T> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1566100qrA)) {
            return false;
        }
        C1566100qrA c1566100qrA = (C1566100qrA) obj;
        return Intrinsics.LJFF(this.LIZ, c1566100qrA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1566100qrA.LIZIZ);
    }

    public C1566100qrA(String str, T t) {
        this.LIZ = str;
        this.LIZIZ = t;
    }
}
