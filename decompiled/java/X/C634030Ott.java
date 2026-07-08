package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ott, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634030Ott {
    public final Class<?> LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C634030Ott)) {
            return false;
        }
        C634030Ott c634030Ott = (C634030Ott) obj;
        return Intrinsics.LJFF(this.LIZ, c634030Ott.LIZ) && Intrinsics.LJFF(this.LIZIZ, c634030Ott.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public C634030Ott(Class<?> cls, String str) {
        this.LIZ = cls;
        this.LIZIZ = str;
    }
}
