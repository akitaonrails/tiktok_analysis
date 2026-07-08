package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiPicture;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gy7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186010gy7 implements InterfaceC1891350zJl {
    public final UrlModel LL;
    public final PoiPicture LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186010gy7)) {
            return false;
        }
        C1186010gy7 c1186010gy7 = (C1186010gy7) obj;
        return Intrinsics.LJFF(this.LL, c1186010gy7.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1186010gy7.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        PoiPicture poiPicture = this.LLILLJJLI;
        return iHashCode + (poiPicture == null ? 0 : poiPicture.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiHeaderGalleryItem(url=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", poiPicture=");
        sbLIZ.append(this.LLILLJJLI);
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

    public C1186010gy7(UrlModel urlModel, PoiPicture poiPicture) {
        this.LL = urlModel;
        this.LLILLJJLI = poiPicture;
    }
}
