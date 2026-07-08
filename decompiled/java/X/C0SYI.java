package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SYI, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SYI {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SYI)) {
            return false;
        }
        C0SYI c0syi = (C0SYI) obj;
        return Intrinsics.LJFF(this.LIZ, c0syi.LIZ) && this.LIZIZ == c0syi.LIZIZ && this.LIZJ == c0syi.LIZJ;
    }

    public C0SYI(String str, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
