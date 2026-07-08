package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nAB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1424130nAB {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1424130nAB)) {
            return false;
        }
        C1424130nAB c1424130nAB = (C1424130nAB) obj;
        return Intrinsics.LJFF(this.LIZ, c1424130nAB.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1424130nAB.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public C1424130nAB(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
