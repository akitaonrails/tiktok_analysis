package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CkE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C322280CkE extends AbstractC322270CkD {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C322280CkE) && Intrinsics.LJFF(this.LIZ, ((C322280CkE) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Selected(selectWay=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C322280CkE() {
        this("");
    }

    public C322280CkE(String str) {
        this.LIZ = str;
    }
}
