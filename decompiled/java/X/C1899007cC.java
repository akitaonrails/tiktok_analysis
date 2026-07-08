package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07cC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1899007cC {
    public final Object LIZ;

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AsyncTypefaceResult(result=");
        sbLIZ.append(obj);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.LIZ;
        if (!(obj instanceof C1899007cC) || !Intrinsics.LJFF(obj2, ((C1899007cC) obj).LIZ)) {
            return false;
        }
        return true;
    }
}
