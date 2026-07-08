package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MWy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569940MWy {
    public final String LIZ;
    public final C1692220u8a LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C569940MWy)) {
            return false;
        }
        C569940MWy c569940MWy = (C569940MWy) obj;
        return Intrinsics.LJFF(this.LIZ, c569940MWy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c569940MWy.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselItem(imageUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", description=");
        sbLIZ.append((Object) this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C569940MWy(String str, C1692220u8a c1692220u8a) {
        this.LIZ = str;
        this.LIZIZ = c1692220u8a;
    }
}
