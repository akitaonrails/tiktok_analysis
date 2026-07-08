package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0guZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183810guZ implements C14NM {
    public static final Set<Integer> LLJ = C13LQ.LJLIIL(new Integer[]{53000, 53001, 52500, 52501, 52600, 52601, 52700, 52701});
    public final String LL;
    public final PoiListApi.PoiMergedListItem LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final Integer LLILZLL;
    public final String LLIZ;
    public final Integer LLIZLLLIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiHeaderTopVideosCardModel(poiId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", cellWidth=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", cellHeight=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", postBottomBarStyle=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", categoryName=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", logicalOrder=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        String aid;
        int i = ((((this.LLILLL * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31;
        Integer num = this.LLILZLL;
        int iHashCode = 0;
        int iIntValue = (i + (num != null ? num.intValue() : 0)) * 31;
        String str = this.LLIZ;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        PoiListApi.PoiMergedListItem poiMergedListItem = this.LLILLJJLI;
        int iHashCode3 = (((iIntValue + iHashCode2) * 31) + poiMergedListItem.copy(poiMergedListItem.itemType, null, poiMergedListItem.review, poiMergedListItem.banners, poiMergedListItem.awemeCover, poiMergedListItem.awemeTopicTag, poiMergedListItem.mediaType, poiMergedListItem.cropAwemeCover, poiMergedListItem.awemeTopicTagEn).hashCode()) * 31;
        Aweme aweme = this.LLILLJJLI.getAweme();
        if (aweme != null && (aid = aweme.getAid()) != null) {
            iHashCode = aid.hashCode();
        }
        return iHashCode3 + iHashCode;
    }

    @Override // X.C14NM
    public final int getContentType() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Video video;
        if (!(interfaceC1891350zJl instanceof C1183810guZ)) {
            return false;
        }
        C1183810guZ c1183810guZ = (C1183810guZ) interfaceC1891350zJl;
        if (LLJ.contains(Integer.valueOf(c1183810guZ.LLILLL))) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }
        if (!Intrinsics.LJFF(this, interfaceC1891350zJl)) {
            return false;
        }
        Aweme aweme = this.LLILLJJLI.getAweme();
        Video video2 = null;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        Aweme aweme2 = c1183810guZ.LLILLJJLI.getAweme();
        if (aweme2 != null) {
            video2 = aweme2.getVideo();
        }
        if (!Intrinsics.LJFF(video, video2)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1183810guZ)) {
            return false;
        }
        C1183810guZ c1183810guZ = (C1183810guZ) interfaceC1891350zJl;
        int i = c1183810guZ.LLILLL;
        int i2 = this.LLILLL;
        if (i != i2) {
            return false;
        }
        if (LLJ.contains(Integer.valueOf(i2))) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }
        if (this.LLILLL == 52702) {
            return Intrinsics.LJFF(c1183810guZ.LLIZ, this.LLIZ);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1183810guZ)) {
            return false;
        }
        C1183810guZ c1183810guZ = (C1183810guZ) obj;
        if (this.LLILLL != c1183810guZ.LLILLL || this.LLILZ != c1183810guZ.LLILZ || this.LLILZIL != c1183810guZ.LLILZIL || !Intrinsics.LJFF(this.LLILZLL, c1183810guZ.LLILZLL) || !Intrinsics.LJFF(this.LLIZ, c1183810guZ.LLIZ)) {
            return false;
        }
        PoiListApi.PoiMergedListItem poiMergedListItem = this.LLILLJJLI;
        String aid = null;
        PoiListApi.PoiMergedListItem poiMergedListItemCopy = poiMergedListItem.copy(poiMergedListItem.itemType, null, poiMergedListItem.review, poiMergedListItem.banners, poiMergedListItem.awemeCover, poiMergedListItem.awemeTopicTag, poiMergedListItem.mediaType, poiMergedListItem.cropAwemeCover, poiMergedListItem.awemeTopicTagEn);
        PoiListApi.PoiMergedListItem poiMergedListItem2 = c1183810guZ.LLILLJJLI;
        if (Intrinsics.LJFF(poiMergedListItemCopy, poiMergedListItem2.copy(poiMergedListItem2.itemType, null, poiMergedListItem2.review, poiMergedListItem2.banners, poiMergedListItem2.awemeCover, poiMergedListItem2.awemeTopicTag, poiMergedListItem2.mediaType, poiMergedListItem2.cropAwemeCover, poiMergedListItem2.awemeTopicTagEn))) {
            Aweme aweme = this.LLILLJJLI.getAweme();
            String aid2 = null;
            if (aweme != null) {
                aid = aweme.getAid();
            }
            Aweme aweme2 = c1183810guZ.LLILLJJLI.getAweme();
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            }
            if (Intrinsics.LJFF(aid, aid2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        Video video;
        Video video2;
        if (interfaceC1891350zJl instanceof C1183810guZ) {
            Aweme aweme = this.LLILLJJLI.getAweme();
            if (aweme != null) {
                video = aweme.getVideo();
            } else {
                video = null;
            }
            Aweme aweme2 = ((C1183810guZ) interfaceC1891350zJl).LLILLJJLI.getAweme();
            if (aweme2 != null) {
                video2 = aweme2.getVideo();
            } else {
                video2 = null;
            }
            if (!Intrinsics.LJFF(video, video2)) {
                return "aweme_change_payload";
            }
        }
        return null;
    }

    public static C1183810guZ LIZ(C1183810guZ c1183810guZ, int i, int i2, int i3) {
        String str;
        PoiListApi.PoiMergedListItem poiMergedListItem;
        int i4;
        Integer num;
        String str2;
        int i5 = i2;
        int i6 = i;
        Integer num2 = null;
        if ((i3 & 1) != 0) {
            str = c1183810guZ.LL;
        } else {
            str = null;
        }
        if ((i3 & 2) != 0) {
            poiMergedListItem = c1183810guZ.LLILLJJLI;
        } else {
            poiMergedListItem = null;
        }
        if ((i3 & 4) != 0) {
            i6 = c1183810guZ.LLILLL;
        }
        if ((i3 & 8) != 0) {
            i5 = c1183810guZ.LLILZ;
        }
        if ((i3 & 16) != 0) {
            i4 = c1183810guZ.LLILZIL;
        } else {
            i4 = 0;
        }
        if ((i3 & 32) != 0) {
            num = c1183810guZ.LLILZLL;
        } else {
            num = null;
        }
        if ((i3 & 64) != 0) {
            str2 = c1183810guZ.LLIZ;
        } else {
            str2 = null;
        }
        if ((i3 & 128) != 0) {
            num2 = c1183810guZ.LLIZLLLIL;
        }
        c1183810guZ.getClass();
        return new C1183810guZ(str, poiMergedListItem, i6, i5, i4, num, str2, num2);
    }

    public C1183810guZ(String str, PoiListApi.PoiMergedListItem poiMergedListItem, int i, int i2, int i3, Integer num, String str2, Integer num2) {
        this.LL = str;
        this.LLILLJJLI = poiMergedListItem;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = num;
        this.LLIZ = str2;
        this.LLIZLLLIL = num2;
    }

    public /* synthetic */ C1183810guZ(String str, PoiListApi.PoiMergedListItem poiMergedListItem, int i, int i2, int i3, Integer num, String str2, Integer num2, int i4) {
        this(str, poiMergedListItem, i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3, (i4 & 32) != 0 ? null : num, (i4 & 64) != 0 ? null : str2, (i4 & 128) == 0 ? num2 : null);
    }
}
