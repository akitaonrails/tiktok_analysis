package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wM5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777470wM5 extends AbstractC1777520wMA {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1777470wM5) && Intrinsics.LJFF(this.LIZ, ((C1777470wM5) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IndustryVerificationSubmitFailed(errorMsg=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777470wM5(String str) {
        this.LIZ = str;
    }
}
