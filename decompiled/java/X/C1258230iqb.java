package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258230iqb implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final EnumC993680bxu LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1258230iqb)) {
            return false;
        }
        C1258230iqb c1258230iqb = (C1258230iqb) obj;
        return Intrinsics.LJFF(this.LL, c1258230iqb.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1258230iqb.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1258230iqb.LLILLL) && this.LLILZ == c1258230iqb.LLILZ;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostedListInitData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", userUniqueId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1258230iqb() {
        this(null, null, null, EnumC993680bxu.PROFILE_TAB_REPOSTED_LIST);
    }

    public C1258230iqb(String str, String str2, String str3, EnumC993680bxu enumC993680bxu) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = enumC993680bxu;
    }
}
