package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234710iEf implements InterfaceC2753014t {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1234710iEf)) {
            return false;
        }
        C1234710iEf c1234710iEf = (C1234710iEf) obj;
        return Intrinsics.LJFF(this.LL, c1234710iEf.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1234710iEf.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1234710iEf.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1234710iEf.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1234710iEf.LLILZIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        String str2 = this.LLILZ;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkShareParamProperty(shareAwemeId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", shareLinkId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sharerUid=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", sharerRequestId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1234710iEf(String str, String str2, String str3, String str4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str2;
    }
}
