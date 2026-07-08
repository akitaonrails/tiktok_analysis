package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YPW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YPW implements InterfaceC873710YPh {
    public final C869590Y9l LIZ;

    @Override // X.InterfaceC873710YPh
    public final boolean LJIIIIZZ() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0YPW) && Intrinsics.LJFF(this.LIZ, ((C0YPW) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Existing(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC873710YPh
    public final String getConversationId() {
        String conversationId = this.LIZ.getConversationId();
        return conversationId == null ? "" : conversationId;
    }

    public C0YPW(C869590Y9l c869590Y9l) {
        this.LIZ = c869590Y9l;
    }
}
