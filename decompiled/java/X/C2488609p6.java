package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09p6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2488609p6 {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2488609p6)) {
            return false;
        }
        C2488609p6 c2488609p6 = (C2488609p6) obj;
        return Intrinsics.LJFF(this.LIZ, c2488609p6.LIZ) && this.LIZIZ == c2488609p6.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public C2488609p6(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
