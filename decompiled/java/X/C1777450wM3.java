package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wM3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777450wM3 extends AbstractC1777520wMA {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1777450wM3) && Intrinsics.LJFF(this.LIZ, ((C1777450wM3) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubmitFailed(errorMsg=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777450wM3(String str) {
        this.LIZ = str;
    }
}
