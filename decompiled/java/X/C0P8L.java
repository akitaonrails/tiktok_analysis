package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P8L, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P8L implements C0P8K {
    public final C640160P9a LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0P8L) && Intrinsics.LJFF(this.LIZ, ((C0P8L) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConfigActivityBackgroundForVisibility(searchSkinInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0P8L(C640160P9a c640160P9a) {
        this.LIZ = c640160P9a;
    }
}
