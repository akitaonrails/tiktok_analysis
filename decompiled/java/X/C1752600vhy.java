package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vhy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752600vhy implements InterfaceC997603vC, InterfaceC746802vq, C04DW {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final int LL;
    public final BrickStyle LLILLJJLI;
    public final String LLILLL;
    public String LLILZ;
    public final int LLILZIL;
    public final String LLILZLL;
    public String LLIZ = "undefined";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1752600vhy)) {
            return false;
        }
        C1752600vhy c1752600vhy = (C1752600vhy) obj;
        return this.LL == c1752600vhy.LL && Intrinsics.LJFF(this.LLILLJJLI, c1752600vhy.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1752600vhy.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1752600vhy.LLILZ) && this.LLILZIL == c1752600vhy.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1752600vhy.LLILZLL);
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
        int i = this.LL * 31;
        BrickStyle brickStyle = this.LLILLJJLI;
        int iHashCode = (i + (brickStyle == null ? 0 : brickStyle.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL) * 31;
        String str2 = this.LLILZLL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxBrickVO(brickName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", brickStyle=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", brickData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", brickSchema=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", brickType=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", brickVersion=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LL;
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return this.LLILLJJLI;
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.LLIZ = str;
    }

    public C1752600vhy(int i, BrickStyle brickStyle, String str, String str2, int i2, String str3) {
        this.LL = i;
        this.LLILLJJLI = brickStyle;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = i2;
        this.LLILZLL = str3;
    }
}
