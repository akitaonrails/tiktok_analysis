package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zmz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C910030Zmz implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C910030Zmz)) {
            return false;
        }
        C910030Zmz c910030Zmz = (C910030Zmz) obj;
        return Intrinsics.LJFF(this.LL, c910030Zmz.LL) && Intrinsics.LJFF(this.LLILLJJLI, c910030Zmz.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditGroupNameHierarchyData(conversationId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", uiType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C910030Zmz(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
