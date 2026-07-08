package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jyi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509620Jyi {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C509620Jyi)) {
            return false;
        }
        C509620Jyi c509620Jyi = (C509620Jyi) obj;
        return Intrinsics.LJFF(this.LIZ, c509620Jyi.LIZ) && this.LIZIZ == c509620Jyi.LIZIZ && Intrinsics.LJFF(this.LIZJ, c509620Jyi.LIZJ) && this.LIZLLL == c509620Jyi.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public C509620Jyi(long j, String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
        this.LIZLLL = j;
    }
}
