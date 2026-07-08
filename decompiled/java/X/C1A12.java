package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.TPText;

/* JADX INFO: renamed from: X.1A12, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A12 {
    public TPText LIZ;
    public int LIZIZ;

    public C1A12() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1A12)) {
            return false;
        }
        C1A12 c1a12 = (C1A12) obj;
        return Intrinsics.LJFF(this.LIZ, c1a12.LIZ) && this.LIZIZ == c1a12.LIZIZ;
    }

    public C1A12(int i) {
        this.LIZ = null;
        this.LIZIZ = 0;
    }
}
