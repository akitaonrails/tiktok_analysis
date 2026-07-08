package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376050lud {
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1376050lud)) {
            return false;
        }
        C1376050lud c1376050lud = (C1376050lud) obj;
        return Intrinsics.LJFF(this.LIZ, c1376050lud.LIZ) && this.LIZIZ == c1376050lud.LIZIZ && this.LIZJ == c1376050lud.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public C1376050lud(String str, int i, boolean z) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
    }
}
