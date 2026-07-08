package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vwZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761650vwZ implements InterfaceC746802vq, C14NM {
    public final int LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final int LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1761650vwZ)) {
            return false;
        }
        C1761650vwZ c1761650vwZ = (C1761650vwZ) obj;
        return this.LL == c1761650vwZ.LL && Intrinsics.LJFF(this.LLILLJJLI, c1761650vwZ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1761650vwZ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1761650vwZ.LLILZ) && this.LLILZIL == c1761650vwZ.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselSparkPowerItem(position=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", elementId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C14NM
    public final int getContentType() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1761650vwZ) && ((C1761650vwZ) interfaceC1891350zJl).LLILZIL == this.LLILZIL) {
            return true;
        }
        return false;
    }

    public C1761650vwZ(int i, int i2, String str, String str2, String str3) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = i2;
    }
}
