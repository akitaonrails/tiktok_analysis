package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Yp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1881707Yp extends AbstractC1881807Yq {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1881707Yp) && Intrinsics.LJFF(this.LIZ, ((C1881707Yp) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Header(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1881707Yp(String str) {
        this.LIZ = str;
    }
}
