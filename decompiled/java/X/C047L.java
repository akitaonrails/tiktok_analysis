package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.047L, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C047L {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C047L)) {
            return false;
        }
        C047L c047l = (C047L) obj;
        return Intrinsics.LJFF(this.LIZ, c047l.LIZ) && this.LIZIZ == c047l.LIZIZ;
    }

    public C047L(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
