package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sjk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638380sjk {
    public final C1638440sjq LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1638380sjk)) {
            return false;
        }
        C1638380sjk c1638380sjk = (C1638380sjk) obj;
        return Intrinsics.LJFF(this.LIZ, c1638380sjk.LIZ) && this.LIZIZ == c1638380sjk.LIZIZ;
    }

    public C1638380sjk(C1638440sjq c1638440sjq, boolean z) {
        this.LIZ = c1638440sjq;
        this.LIZIZ = z;
    }
}
