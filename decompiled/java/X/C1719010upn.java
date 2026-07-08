package X;

import com.ss.android.ugc.aweme.biz.wallet.network.model.ProcessItemList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0upn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719010upn implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final ProcessItemList LLILZLL;
    public final String LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1719010upn)) {
            return false;
        }
        C1719010upn c1719010upn = (C1719010upn) obj;
        return Intrinsics.LJFF(this.LL, c1719010upn.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1719010upn.LLILLJJLI) && this.LLILLL == c1719010upn.LLILLL && Intrinsics.LJFF(this.LLILZ, c1719010upn.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1719010upn.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1719010upn.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1719010upn.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
        ProcessItemList processItemList = this.LLILZLL;
        return ((iHashCode + (processItemList == null ? 0 : processItemList.hashCode())) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProcessPageData(scene=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", previousPageId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", autoClose=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", eventParam=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", processItemList=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", hashId=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1719010upn(String str, String str2, boolean z, String str3, String str4, ProcessItemList processItemList, String str5) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = processItemList;
        this.LLIZ = str5;
    }
}
