package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IAO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IAO implements C0IAQ {
    public final C869590Y9l LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0IAO) && Intrinsics.LJFF(this.LIZ, ((C0IAO) obj).LIZ);
    }

    public final int hashCode() {
        C869590Y9l c869590Y9l = this.LIZ;
        if (c869590Y9l == null) {
            return 0;
        }
        return c869590Y9l.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplyToMessage(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0IAO(C869590Y9l c869590Y9l) {
        this.LIZ = c869590Y9l;
    }
}
