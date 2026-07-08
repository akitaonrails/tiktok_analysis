package X;

import X.InterfaceC2753014t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554820qYy<T extends InterfaceC2753014t> {
    public final String LIZ;
    public final Class<T> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1554820qYy)) {
            return false;
        }
        C1554820qYy c1554820qYy = (C1554820qYy) obj;
        return Intrinsics.LJFF(this.LIZ, c1554820qYy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1554820qYy.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public C1554820qYy(Class cls, String str) {
        this.LIZ = str;
        this.LIZIZ = cls;
    }
}
