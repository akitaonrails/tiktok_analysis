package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1000340c8e {
    public final String LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC1000340c8e) {
            AbstractC1000340c8e abstractC1000340c8e = (AbstractC1000340c8e) obj;
            if (Intrinsics.LJFF(this.LIZ, abstractC1000340c8e.LIZ) && Intrinsics.LJFF(this.LIZIZ, abstractC1000340c8e.LIZIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public AbstractC1000340c8e(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
