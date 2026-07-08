package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386310FCr {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C386310FCr)) {
            return false;
        }
        C386310FCr c386310FCr = (C386310FCr) obj;
        return Intrinsics.LJFF(this.LIZ, c386310FCr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c386310FCr.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public C386310FCr(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
