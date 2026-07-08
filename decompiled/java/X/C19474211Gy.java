package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11Gy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19474211Gy<A, B> {
    public final A LIZ;
    public final B LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19474211Gy)) {
            return false;
        }
        C19474211Gy c19474211Gy = (C19474211Gy) obj;
        return Intrinsics.LJFF(this.LIZ, c19474211Gy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c19474211Gy.LIZIZ);
    }

    public C19474211Gy(A a, B b) {
        this.LIZ = a;
        this.LIZIZ = b;
    }
}
