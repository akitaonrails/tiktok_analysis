package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OiT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626950OiT implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL = "book_detail_page";
    public final C0O4X LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C626950OiT)) {
            return false;
        }
        C626950OiT c626950OiT = (C626950OiT) obj;
        return Intrinsics.LJFF(this.LL, c626950OiT.LL) && Intrinsics.LJFF(this.LLILLJJLI, c626950OiT.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c626950OiT.LLILLL) && this.LLILZ == c626950OiT.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopicDetailHierarchyData(topicId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pageId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", topicType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C626950OiT(String str, String str2, C0O4X c0o4x) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILZ = c0o4x;
    }
}
