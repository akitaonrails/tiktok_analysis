package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YPU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YPU implements C0YHT {
    public final C869590Y9l LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0YPU) && Intrinsics.LJFF(this.LIZ, ((C0YPU) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RetryMediaMsg(msg=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0YHT
    public final String LIZ() {
        return this.LIZ.getConversationId();
    }

    public C0YPU(C869590Y9l c869590Y9l) {
        this.LIZ = c869590Y9l;
    }
}
