package X;

import com.ss.android.ugc.aweme.poi.detail.dishes.PoiInnerPageMobData;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiPicture;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186260gyW implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final PoiPicture LLILLL;
    public final int LLILZ;
    public final PoiInnerPageMobData LLILZIL;
    public final String LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186260gyW)) {
            return false;
        }
        C1186260gyW c1186260gyW = (C1186260gyW) obj;
        return Intrinsics.LJFF(this.LL, c1186260gyW.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1186260gyW.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1186260gyW.LLILLL) && this.LLILZ == c1186260gyW.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1186260gyW.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1186260gyW.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        PoiPicture poiPicture = this.LLILLL;
        int iHashCode2 = (((iHashCode + (poiPicture == null ? 0 : poiPicture.hashCode())) * 31) + this.LLILZ) * 31;
        PoiInnerPageMobData poiInnerPageMobData = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (poiInnerPageMobData == null ? 0 : poiInnerPageMobData.hashCode())) * 31;
        String str = this.LLILZLL;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiGalleryItem(poiId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", image=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", poiPictureInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", initPageIndex=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", mobDat=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", cropUrl=");
        sbLIZ.append(this.LLILZLL);
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

    public C1186260gyW(String str, String str2, PoiPicture poiPicture, int i, PoiInnerPageMobData poiInnerPageMobData, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = poiPicture;
        this.LLILZ = i;
        this.LLILZIL = poiInnerPageMobData;
        this.LLILZLL = str3;
    }
}
