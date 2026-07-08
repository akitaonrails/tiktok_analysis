package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.058u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13050058u {
    public final String LIZ;
    public final long LIZIZ;
    public C09AE LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13050058u)) {
            return false;
        }
        C13050058u c13050058u = (C13050058u) obj;
        return Intrinsics.LJFF(this.LIZ, c13050058u.LIZ) && this.LIZIZ == c13050058u.LIZIZ;
    }

    public C13050058u(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
