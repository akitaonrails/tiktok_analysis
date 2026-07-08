package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01gH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C395501gH extends AbstractC399701gx {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C395501gH) && Intrinsics.LJFF(this.LIZ, ((C395501gH) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchCategoryData(category=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C395501gH(String str) {
        this.LIZ = str;
    }
}
