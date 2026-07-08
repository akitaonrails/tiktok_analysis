package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R96, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R96 implements InterfaceC111300bX {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0R96) && Intrinsics.LJFF(this.LL, ((C0R96) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditJoinQuestionHierarchyData(conversationId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0R96(String str) {
        this.LL = str;
    }
}
