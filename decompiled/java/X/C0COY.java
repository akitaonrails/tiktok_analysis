package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0COY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0COY {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0COY)) {
            return false;
        }
        C0COY c0coy = (C0COY) obj;
        return Intrinsics.LJFF(this.LIZ, c0coy.LIZ) && this.LIZIZ == c0coy.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public C0COY(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
