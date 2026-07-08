package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04xJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1265504xJ implements InterfaceC1265604xK {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1265504xJ) && Intrinsics.LJFF(this.LIZ, ((C1265504xJ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Conversation(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1265504xJ(String str) {
        this.LIZ = str;
        if (str.length() > 0) {
            return;
        }
        "MessageTarget.Conversation.conversationId must not be empty".toString();
        throw new IllegalArgumentException("MessageTarget.Conversation.conversationId must not be empty");
    }
}
