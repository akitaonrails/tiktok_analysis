package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.033h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7811033h extends AbstractC756202xM implements InterfaceC997603vC, C04DW {
    public final float LLILZLL;
    public final boolean LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public String LLJILLL;
    public final int LLJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7811033h)) {
            return false;
        }
        C7811033h c7811033h = (C7811033h) obj;
        return Float.compare(this.LLILZLL, c7811033h.LLILZLL) == 0 && this.LLIZ == c7811033h.LLIZ && this.LLIZLLLIL == c7811033h.LLIZLLLIL && this.LLJ == c7811033h.LLJ && Intrinsics.LJFF(this.LLJI, c7811033h.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c7811033h.LLJIJIL);
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpanVO(height=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", showDivider=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", padding=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", color=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", ospGroupId=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", ospItemId=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(this.LLILZLL) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL) * 31) + this.LLJ) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode();
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLJJ;
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(C7811033h.class, interfaceC1891350zJl.getClass());
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.LLJILLL = str;
    }

    public C7811033h(float f, int i, int i2, String str, String str2, boolean z) {
        i = (i2 & 8) != 0 ? 0 : i;
        str = (i2 & 16) != 0 ? "" : str;
        str2 = (i2 & 32) != 0 ? "" : str2;
        this.LLILZLL = f;
        this.LLIZ = z;
        this.LLIZLLLIL = 0;
        this.LLJ = i;
        this.LLJI = str;
        this.LLJIJIL = str2;
        this.LLJILJIL = str;
        this.LLJILJILJ = str2;
        this.LLJILLL = "undefined";
        this.LLJJ = EnumC1752690vi7.BLANK.getValue();
    }
}
