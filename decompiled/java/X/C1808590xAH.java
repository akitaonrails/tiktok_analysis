package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xAH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808590xAH {
    public final String LIZ;
    public final long LIZIZ;
    public long LIZJ;
    public final C0YM0 LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1808590xAH)) {
            return false;
        }
        C1808590xAH c1808590xAH = (C1808590xAH) obj;
        return Intrinsics.LJFF(this.LIZ, c1808590xAH.LIZ) && this.LIZIZ == c1808590xAH.LIZIZ && this.LIZJ == c1808590xAH.LIZJ && this.LIZLLL == c1808590xAH.LIZLLL;
    }

    public C1808590xAH(String str, long j, long j2, C0YM0 c0ym0) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = c0ym0;
    }
}
