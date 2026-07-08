package X;

import com.lynx.tasm.LynxError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740670T3p implements C006Y {
    public final LynxError LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C740670T3p) && Intrinsics.LJFF(this.LIZ, ((C740670T3p) obj).LIZ);
    }

    public final int hashCode() {
        LynxError lynxError = this.LIZ;
        if (lynxError == null) {
            return 0;
        }
        return lynxError.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ErrorPayload(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C740670T3p(LynxError lynxError) {
        this.LIZ = lynxError;
    }
}
