package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UVx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773510UVx {
    public final int LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        C773510UVx c773510UVx;
        if (this == obj) {
            return true;
        }
        Class<?> cls = null;
        if (obj != null) {
            cls = obj.getClass();
        }
        if (Intrinsics.LJFF(C773510UVx.class, cls) && (obj instanceof C773510UVx) && (c773510UVx = (C773510UVx) obj) != null && this.LIZ == c773510UVx.LIZ && this.LIZIZ == c773510UVx.LIZIZ) {
            return true;
        }
        return false;
    }

    public C773510UVx(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
