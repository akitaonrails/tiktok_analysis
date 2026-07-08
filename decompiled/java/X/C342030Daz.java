package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Daz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342030Daz {
    public final String LIZ;
    public final C21419418s4 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C342030Daz)) {
            return false;
        }
        C342030Daz c342030Daz = (C342030Daz) obj;
        return Intrinsics.LJFF(this.LIZ, c342030Daz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c342030Daz.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C21419418s4 c21419418s4 = this.LIZIZ;
        return iHashCode + (c21419418s4 == null ? 0 : c21419418s4.hashCode());
    }

    public C342030Daz(C21419418s4 c21419418s4, String str) {
        this.LIZ = str;
        this.LIZIZ = c21419418s4;
    }
}
