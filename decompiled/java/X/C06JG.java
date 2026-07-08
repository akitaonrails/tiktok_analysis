package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06JG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06JG implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final EnumC904370Zdr LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06JG)) {
            return false;
        }
        C06JG c06jg = (C06JG) obj;
        return Intrinsics.LJFF(this.LL, c06jg.LL) && Intrinsics.LJFF(this.LLILLJJLI, c06jg.LLILLJJLI) && this.LLILLL == c06jg.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchMediaGridHierarchyData(conversationId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", mediaType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C06JG(String str, String str2, EnumC904370Zdr enumC904370Zdr) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = enumC904370Zdr;
    }
}
