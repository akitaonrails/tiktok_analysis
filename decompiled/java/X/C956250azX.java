package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0azX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C956250azX {
    public final Class<?> LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;

    public C956250azX() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C956250azX)) {
            return false;
        }
        C956250azX c956250azX = (C956250azX) obj;
        return Intrinsics.LJFF(this.LIZ, c956250azX.LIZ) && this.LIZIZ == c956250azX.LIZIZ && this.LIZJ == c956250azX.LIZJ;
    }

    public C956250azX(Class cls, long j) {
        this.LIZ = cls;
        this.LIZIZ = j;
        this.LIZJ = false;
    }
}
