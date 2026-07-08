package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vhz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752610vhz implements InterfaceC997603vC {
    public static final /* synthetic */ int LLIZ = 0;
    public final int LL;
    public final BrickStyle LLILLJJLI;
    public final String LLILLL;
    public String LLILZ;
    public final int LLILZIL;
    public final String LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1752610vhz)) {
            return false;
        }
        C1752610vhz c1752610vhz = (C1752610vhz) obj;
        return this.LL == c1752610vhz.LL && Intrinsics.LJFF(this.LLILLJJLI, c1752610vhz.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1752610vhz.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1752610vhz.LLILZ) && this.LLILZIL == c1752610vhz.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1752610vhz.LLILZLL);
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

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaLynxBrickVO(brickName=");
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

    public C1752610vhz(int i, BrickStyle brickStyle, String str, String str2, int i2, String str3) {
        this.LL = i;
        this.LLILLJJLI = brickStyle;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = i2;
        this.LLILZLL = str3;
    }
}
