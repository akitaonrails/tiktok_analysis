package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06VF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06VF implements InterfaceC111300bX {
    public final String LL;
    public final int LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06VF)) {
            return false;
        }
        C06VF c06vf = (C06VF) obj;
        return Intrinsics.LJFF(this.LL, c06vf.LL) && this.LLILLJJLI == c06vf.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotSharePostPickerHierarchyData(conversationId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", maxSelectCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C06VF(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
