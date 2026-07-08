package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vmU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755400vmU implements InterfaceC1059904Cn, C14NM, C04DW {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;
    public final C1549130qPn LLILZIL;
    public final String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1755400vmU)) {
            return false;
        }
        C1755400vmU c1755400vmU = (C1755400vmU) obj;
        return Intrinsics.LJFF(this.LL, c1755400vmU.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1755400vmU.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1755400vmU.LLILLL) && this.LLILZ == c1755400vmU.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1755400vmU.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1755400vmU.LLILZLL);
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ) * 31;
        C1549130qPn c1549130qPn = this.LLILZIL;
        return ((iHashCode2 + (c1549130qPn != null ? c1549130qPn.hashCode() : 0)) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpLynxVO(schema=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", json=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", viewType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", brickName=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", lynxRenderMode=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", responseSubscribeId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C14NM
    public final int getContentType() {
        Integer num = C1158380gFY.LIZ.get(this.LLILLL);
        if (num != null) {
            return num.intValue();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unsupported viewType: ");
        sbLIZ.append(this.LLILLL);
        C1326490kch.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR_PDP_ASSEM_LYNX_UNSUPPORTED_VIEW_TYPE;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("view type not supported: ");
        sbLIZ2.append(this.LLILLL);
        C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2)), null);
        return 50000;
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLILZ;
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1755400vmU) || ((C1755400vmU) interfaceC1891350zJl).getContentType() != getContentType()) {
            return false;
        }
        return true;
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
        this.LLIZ = str;
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.LLIZLLLIL = str;
    }

    public C1755400vmU(String str, String str2, String str3, int i, C1549130qPn c1549130qPn, String str4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = i;
        this.LLILZIL = c1549130qPn;
        this.LLILZLL = str4;
        this.LLIZ = "undefined";
        this.LLIZLLLIL = "undefined";
    }

    public /* synthetic */ C1755400vmU(String str, String str2, String str3, int i, C1549130qPn c1549130qPn, String str4, int i2) {
        this(str, (i2 & 2) != 0 ? null : str2, str3, (i2 & 8) != 0 ? EnumC1752690vi7.UNSET.getValue() : i, (i2 & 16) == 0 ? c1549130qPn : null, (i2 & 32) != 0 ? "" : str4);
    }
}
