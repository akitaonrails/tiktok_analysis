package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426450nDv {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1426450nDv)) {
            return false;
        }
        C1426450nDv c1426450nDv = (C1426450nDv) obj;
        return Intrinsics.LJFF(this.LIZ, c1426450nDv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1426450nDv.LIZIZ) && this.LIZJ == c1426450nDv.LIZJ;
    }

    public C1426450nDv(String str, String str2, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
    }
}
