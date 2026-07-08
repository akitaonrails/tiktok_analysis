package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762070vxF implements InterfaceC746802vq {
    public final String LL;
    public final int LLILLJJLI;
    public final Image LLILLL;
    public final String LLILZ = "pdp_head";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1762070vxF)) {
            return false;
        }
        C1762070vxF c1762070vxF = (C1762070vxF) obj;
        return Intrinsics.LJFF(this.LL, c1762070vxF.LL) && this.LLILLJJLI == c1762070vxF.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1762070vxF.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1762070vxF.LLILZ);
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
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselImageItem(elementId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", image=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1762070vxF) {
            C1762070vxF c1762070vxF = (C1762070vxF) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LL, c1762070vxF.LL) && Intrinsics.LJFF(this.LLILLL.getUri(), c1762070vxF.LLILLL.getUri())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1762070vxF;
    }

    public C1762070vxF(String str, int i, Image image) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = image;
    }
}
