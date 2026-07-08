package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434520H2c extends AbstractC434530H2d {
    public final int LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;

    @Override // X.AbstractC434530H2d
    public final int LIZ() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C434520H2c)) {
            return false;
        }
        C434520H2c c434520H2c = (C434520H2c) obj;
        return this.LL == c434520H2c.LL && Intrinsics.LJFF(this.LLILLJJLI, c434520H2c.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c434520H2c.LLILLL) && Intrinsics.LJFF(this.LLILZ, c434520H2c.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c434520H2c.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c434520H2c.LLILZLL) && this.LLIZ == c434520H2c.LLIZ;
    }

    public final int hashCode() {
        int i = this.LL * 31;
        String str = this.LLILLJJLI;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZLL;
        return ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.LLIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReferenceWebLinkRenderItem(index=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", webTitle=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", webName=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", webSummary=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", webLink=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", webIcon=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", itemCount=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC434580H2i
    public final int getIndex() {
        return this.LL;
    }

    @Override // X.InterfaceC434580H2i
    public final int getItemCount() {
        return this.LLIZ;
    }

    public C434520H2c(String str, int i, int i2, String str2, String str3, String str4, String str5) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = i2;
    }
}
