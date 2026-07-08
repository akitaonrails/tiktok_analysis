package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadBffVO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04FS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FS implements InterfaceC997603vC {
    public final SeaPdpHeadBffVO LL;
    public final C04CV LLILLJJLI;
    public final int LLILLL = EnumC1752690vi7.HEADER.getValue();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04FS)) {
            return false;
        }
        C04FS c04fs = (C04FS) obj;
        return Intrinsics.LJFF(this.LL, c04fs.LL) && Intrinsics.LJFF(this.LLILLJJLI, c04fs.LLILLJJLI);
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaGodaV1HeadBffVO(vo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", dataContext=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLILLL;
    }

    public C04FS(SeaPdpHeadBffVO seaPdpHeadBffVO, C04CV c04cv) {
        this.LL = seaPdpHeadBffVO;
        this.LLILLJJLI = c04cv;
    }
}
