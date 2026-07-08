package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YN7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YN7 implements C0YNG {
    public final List<C869590Y9l> LIZ;
    public final C0YNC LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YN7)) {
            return false;
        }
        C0YN7 c0yn7 = (C0YN7) obj;
        return Intrinsics.LJFF(this.LIZ, c0yn7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0yn7.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuccessWithMsgInserted(insertedMessages=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", msgInConvRange=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0YN7(List<? extends C869590Y9l> list, C0YNC c0ync) {
        this.LIZ = list;
        this.LIZIZ = c0ync;
    }
}
