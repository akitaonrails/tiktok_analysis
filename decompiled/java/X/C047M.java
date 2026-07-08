package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.047M, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C047M {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C047M)) {
            return false;
        }
        C047M c047m = (C047M) obj;
        return Intrinsics.LJFF(this.LIZ, c047m.LIZ) && this.LIZIZ == c047m.LIZIZ;
    }

    public C047M(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
