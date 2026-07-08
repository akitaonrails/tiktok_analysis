package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mi5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406710mi5 implements InterfaceC1406670mi1 {
    public final Image LL;
    public final boolean LLILLJJLI;
    public final Float LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406710mi5)) {
            return false;
        }
        C1406710mi5 c1406710mi5 = (C1406710mi5) obj;
        return Intrinsics.LJFF(this.LL, c1406710mi5.LL) && this.LLILLJJLI == c1406710mi5.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1406710mi5.LLILLL) && this.LLILZ == c1406710mi5.LLILZ;
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
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
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        Float f = this.LLILLL;
        return ((iHashCode + (f == null ? 0 : f.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaProductImageVO(image=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showViewMore=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", lastHeight=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isSizeGuide=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    public /* synthetic */ C1406710mi5(Image image, boolean z, int i) {
        this(image, false, null, (i & 8) != 0 ? false : z);
    }

    public C1406710mi5(Image image, boolean z, Float f, boolean z2) {
        this.LL = image;
        this.LLILLJJLI = z;
        this.LLILLL = f;
        this.LLILZ = z2;
        this.LLILZIL = EnumC1752690vi7.DESCRIPTION.getValue();
    }
}
