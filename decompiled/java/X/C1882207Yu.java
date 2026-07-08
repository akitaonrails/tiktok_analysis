package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Yu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1882207Yu extends AbstractC1882307Yv {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1882207Yu) && Intrinsics.LJFF(this.LIZ, ((C1882207Yu) obj).LIZ);
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

    public C1882207Yu(String str) {
        this.LIZ = str;
    }
}
