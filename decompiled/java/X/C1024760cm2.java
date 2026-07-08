package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cm2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024760cm2 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1024760cm2)) {
            return false;
        }
        C1024760cm2 c1024760cm2 = (C1024760cm2) obj;
        return Intrinsics.LJFF(this.LIZ, c1024760cm2.LIZ) && this.LIZIZ == c1024760cm2.LIZIZ && this.LIZJ == c1024760cm2.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1024760cm2.LIZLLL);
    }

    public C1024760cm2(Long l, String str, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = l;
    }
}
