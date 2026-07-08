package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OZL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OZL implements InterfaceC111300bX {
    public final long LL;
    public final long LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OZL)) {
            return false;
        }
        C0OZL c0ozl = (C0OZL) obj;
        return this.LL == c0ozl.LL && this.LLILLJJLI == c0ozl.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0ozl.LLILLL);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LL) * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31;
        String str = this.LLILLL;
        return iY2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinEmojiDetailSheetHierarchyData(bbId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bbItemId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", emoji=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0OZL(long j, long j2, String str) {
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = str;
    }
}
