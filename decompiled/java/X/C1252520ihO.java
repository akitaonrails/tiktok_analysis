package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ihO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252520ihO<T> extends AbstractC1252750ihl<T> {
    public final Throwable LIZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C13LE.LIZ(this.LIZ.getClass()), this.LIZ.getMessage(), this.LIZ.getStackTrace()[0]});
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fail(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1252520ihO(Throwable th) {
        this.LIZ = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1252520ihO)) {
            return false;
        }
        Throwable th = ((C1252520ihO) obj).LIZ;
        if (!Intrinsics.LJFF(C13LE.LIZ(this.LIZ.getClass()), C13LE.LIZ(th.getClass())) || !Intrinsics.LJFF(this.LIZ.getMessage(), th.getMessage()) || !Intrinsics.LJFF(this.LIZ.getStackTrace()[0], th.getStackTrace()[0])) {
            return false;
        }
        return true;
    }
}
