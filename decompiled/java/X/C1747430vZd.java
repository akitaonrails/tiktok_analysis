package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vZd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1747430vZd {
    public final C1177960gl8 LIZ;
    public final boolean LIZIZ;

    public C1747430vZd() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1747430vZd)) {
            return false;
        }
        C1747430vZd c1747430vZd = (C1747430vZd) obj;
        return Intrinsics.LJFF(this.LIZ, c1747430vZd.LIZ) && this.LIZIZ == c1747430vZd.LIZIZ;
    }

    public C1747430vZd(C1177960gl8 c1177960gl8, boolean z) {
        this.LIZ = c1177960gl8;
        this.LIZIZ = z;
    }
}
