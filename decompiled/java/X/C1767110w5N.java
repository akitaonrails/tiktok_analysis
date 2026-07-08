package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w5N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767110w5N implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1767110w5N)) {
            return false;
        }
        C1767110w5N c1767110w5N = (C1767110w5N) obj;
        return Intrinsics.LJFF(this.LL, c1767110w5N.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1767110w5N.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1767110w5N.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1767110w5N.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1767110w5N.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1767110w5N.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLILZLL;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MovePartialAssetsDataItem(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", lightImageUrl=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", darkImageUrl=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", schemaLink=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1767110w5N(String str, String str2, String str3, String str4, String str5, String str6) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
    }
}
