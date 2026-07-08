package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xI5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1813430xI5<T> {
    public final EnumC1813400xI2 LIZ;
    public final T LIZIZ;

    public C1813430xI5() {
        this((EnumC1813400xI2) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1813430xI5)) {
            return false;
        }
        C1813430xI5 c1813430xI5 = (C1813430xI5) obj;
        return this.LIZ == c1813430xI5.LIZ && Intrinsics.LJFF(this.LIZIZ, c1813430xI5.LIZIZ);
    }

    public /* synthetic */ C1813430xI5(EnumC1813400xI2 enumC1813400xI2, int i) {
        this((i & 1) != 0 ? EnumC1813400xI2.UNKNOWN : enumC1813400xI2, (Object) null);
    }

    public C1813430xI5(EnumC1813400xI2 enumC1813400xI2, T t) {
        this.LIZ = enumC1813400xI2;
        this.LIZIZ = t;
    }
}
