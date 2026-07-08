package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hoz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218790hoz implements InterfaceC111300bX {
    public final String LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1218790hoz)) {
            return false;
        }
        C1218790hoz c1218790hoz = (C1218790hoz) obj;
        return Intrinsics.LJFF(this.LL, c1218790hoz.LL) && this.LLILLJJLI == c1218790hoz.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1218790hoz.LLILLL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        String str2 = this.LLILLL;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IntelligentBoardForYouHierarchyData(boardEntrance=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isPreview=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1218790hoz(String str, boolean z, String str2) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = str2;
    }
}
