package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JQ3, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JQ3 implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JQ3)) {
            return false;
        }
        C0JQ3 c0jq3 = (C0JQ3) obj;
        return Intrinsics.LJFF(this.LL, c0jq3.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0jq3.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0jq3.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0jq3.LLILZ) && this.LLILZIL == c0jq3.LLILZIL;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZ;
        return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestEmoteHierarchyData(seUid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", uploadUserType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isSheet=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0JQ3(String str, String str2, String str3, String str4, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = z;
    }
}
