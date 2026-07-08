package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01vg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C491001vg<T> extends AbstractC1623806Xk<T> {
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

    public C491001vg(Throwable th) {
        this.LIZ = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C491001vg)) {
            return false;
        }
        Throwable th = ((C491001vg) obj).LIZ;
        if (this.LIZ.getClass() != th.getClass() || !Intrinsics.LJFF(this.LIZ.getMessage(), th.getMessage()) || !Intrinsics.LJFF(this.LIZ.getStackTrace()[0], th.getStackTrace()[0])) {
            return false;
        }
        return true;
    }
}
