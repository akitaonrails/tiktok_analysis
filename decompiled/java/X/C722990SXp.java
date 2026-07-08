package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SXp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722990SXp {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C722990SXp)) {
            return false;
        }
        C722990SXp c722990SXp = (C722990SXp) obj;
        return Intrinsics.LJFF(this.LIZ, c722990SXp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c722990SXp.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public C722990SXp(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
