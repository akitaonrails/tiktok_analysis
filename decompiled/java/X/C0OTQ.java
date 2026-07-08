package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OTQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OTQ implements InterfaceC111300bX {
    public final boolean LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OTQ)) {
            return false;
        }
        C0OTQ c0otq = (C0OTQ) obj;
        return this.LL == c0otq.LL && Intrinsics.LJFF(this.LLILLJJLI, c0otq.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0otq.LLILLL);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCommentKeyboardHierarchyData(isEmojiPanel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0OTQ(boolean z, String str, String str2) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
