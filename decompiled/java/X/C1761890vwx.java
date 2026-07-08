package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.VideoConfig;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761890vwx implements InterfaceC746802vq {
    public final String LL;
    public final int LLILLJJLI;
    public final Video LLILLL;
    public final Image LLILZ;
    public final boolean LLILZIL = false;
    public final VideoConfig LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1761890vwx)) {
            return false;
        }
        C1761890vwx c1761890vwx = (C1761890vwx) obj;
        return Intrinsics.LJFF(this.LL, c1761890vwx.LL) && this.LLILLJJLI == c1761890vwx.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1761890vwx.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1761890vwx.LLILZ) && this.LLILZIL == c1761890vwx.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1761890vwx.LLILZLL);
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
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31;
        Image image = this.LLILZ;
        int iHashCode2 = (((iHashCode + (image == null ? 0 : image.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        VideoConfig videoConfig = this.LLILZLL;
        return iHashCode2 + (videoConfig != null ? videoConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselVideoItem(elementId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", video=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", image=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", allVideoAreaClick=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", videoConfig=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1761890vwx) && Intrinsics.LJFF(this.LL, ((C1761890vwx) interfaceC1891350zJl).LL)) {
            return true;
        }
        return false;
    }

    public C1761890vwx(String str, int i, Video video, Image image, VideoConfig videoConfig) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = video;
        this.LLILZ = image;
        this.LLILZLL = videoConfig;
    }
}
