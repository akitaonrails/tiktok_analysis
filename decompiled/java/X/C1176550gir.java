package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176550gir {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1176550gir)) {
            return false;
        }
        C1176550gir c1176550gir = (C1176550gir) obj;
        return this.LIZ == c1176550gir.LIZ && Intrinsics.LJFF(this.LIZIZ, c1176550gir.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public C1176550gir(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
