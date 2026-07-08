package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M3S, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M3S extends C561950M2f {
    public final int LIZLLL;
    public final String LJ;

    public C0M3S() {
        this(null, 3);
    }

    @Override // X.C561950M2f
    public final int LIZ() {
        return this.LIZLLL;
    }

    public final int hashCode() {
        return this.LIZLLL;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0M3S)) {
            return false;
        }
        C0M3S c0m3s = (C0M3S) obj;
        if (c0m3s.LIZLLL != this.LIZLLL || !Intrinsics.LJFF(c0m3s.LJ, this.LJ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M3S(String str, int i) {
        int i2;
        super(0, 7);
        if ((i & 1) != 0) {
            i2 = 117;
        } else {
            i2 = 0;
        }
        str = (i & 2) != 0 ? "" : str;
        this.LIZLLL = i2;
        this.LJ = str;
    }
}
