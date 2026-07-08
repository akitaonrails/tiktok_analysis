package X;

import c1b.m;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mi4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406700mi4 implements InterfaceC1059904Cn {
    public final Image LL;
    public final boolean LLILLJJLI;
    public final Float LLILLL;
    public final boolean LLILZ;
    public final m LLILZIL;
    public String LLILZLL;
    public final int LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406700mi4)) {
            return false;
        }
        C1406700mi4 c1406700mi4 = (C1406700mi4) obj;
        return Intrinsics.LJFF(this.LL, c1406700mi4.LL) && this.LLILLJJLI == c1406700mi4.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1406700mi4.LLILLL) && this.LLILZ == c1406700mi4.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1406700mi4.LLILZIL);
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
        int iHashCode2 = (((iHashCode + (f == null ? 0 : f.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        m mVar = this.LLILZIL;
        return iHashCode2 + (mVar != null ? mVar.hashCode() : 0);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductImageVO(image=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showViewMore=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", lastHeight=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isSizeGuide=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", descStyle=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLIZ;
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLILZLL;
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
        this.LLILZLL = str;
    }

    public /* synthetic */ C1406700mi4(Image image, boolean z, m mVar, int i) {
        this(image, false, null, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : mVar);
    }

    public C1406700mi4(Image image, boolean z, Float f, boolean z2, m mVar) {
        this.LL = image;
        this.LLILLJJLI = z;
        this.LLILLL = f;
        this.LLILZ = z2;
        this.LLILZIL = mVar;
        this.LLILZLL = "undefined";
        this.LLIZ = EnumC1752690vi7.DESCRIPTION.getValue();
    }
}
