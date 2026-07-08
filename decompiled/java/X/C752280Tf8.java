package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tf8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752280Tf8 extends AbstractC752290Tf9 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C752280Tf8) && Intrinsics.LJFF(this.LIZ, ((C752280Tf8) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowError(errorMsg=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C752280Tf8(String str) {
        this.LIZ = str;
    }
}
