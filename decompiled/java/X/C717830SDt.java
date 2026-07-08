package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SDt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717830SDt implements InterfaceC0148002o {
    public final String LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final Pair<String, String> LLILZ;
    public final String LLILZIL;

    public C717830SDt() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C717830SDt)) {
            return false;
        }
        C717830SDt c717830SDt = (C717830SDt) obj;
        return Intrinsics.LJFF(this.LL, c717830SDt.LL) && this.LLILLJJLI == c717830SDt.LLILLJJLI && this.LLILLL == c717830SDt.LLILLL && Intrinsics.LJFF(this.LLILZ, c717830SDt.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c717830SDt.LLILZIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31;
        Pair<String, String> pair = this.LLILZ;
        int iHashCode2 = (iHashCode + (pair == null ? 0 : pair.hashCode())) * 31;
        String str2 = this.LLILZIL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoAuthorInfoState(titleViewText=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", titleViewVisible=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", titleViewTabletFollowVisible=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", titleVerifyInfo=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", postTimeText=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C717830SDt(int i) {
        this(null, 8, 8, null, null);
    }

    public C717830SDt(String str, int i, int i2, Pair<String, String> pair, String str2) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = pair;
        this.LLILZIL = str2;
    }
}
