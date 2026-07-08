package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rcx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595730rcx {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1595730rcx)) {
            return false;
        }
        C1595730rcx c1595730rcx = (C1595730rcx) obj;
        return Intrinsics.LJFF(this.LIZ, c1595730rcx.LIZ) && this.LIZIZ == c1595730rcx.LIZIZ && this.LIZJ == c1595730rcx.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1595730rcx.LIZLLL);
    }

    public C1595730rcx(String str, boolean z, boolean z2, String str2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = str2;
    }
}
