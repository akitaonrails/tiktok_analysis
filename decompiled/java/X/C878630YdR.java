package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YdR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878630YdR implements InterfaceC1491305sd {
    public static final int $stable = 0;
    public final String LL;

    public final C878630YdR copy(String str) {
        return new C878630YdR(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C878630YdR) && Intrinsics.LJFF(this.LL, ((C878630YdR) obj).LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestWrapperKey(conversationId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getConversationId() {
        return this.LL;
    }

    public C878630YdR(String str) {
        this.LL = str;
    }
}
