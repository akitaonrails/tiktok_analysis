package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183820gua implements C14NM {
    public final String LL;
    public final PoiListApi.PoiMergedListItem LLILLJJLI;
    public final PoiListApi.PoiMergedListItem LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final Integer LLILZLL;
    public final Integer LLIZ;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.C14NM
    public final int getContentType() {
        return 52501;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiHeaderTopVideosSmallPairCardModel(poiId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", top=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", cellWidth=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", cellHeight=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", postBottomBarStyle=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", logicalOrder=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        String aid;
        String aid2;
        int i = (((1627531 + this.LLILZ) * 31) + this.LLILZIL) * 31;
        String str = this.LL;
        int iHashCode = 0;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        PoiListApi.PoiMergedListItem poiMergedListItem = this.LLILLJJLI;
        int iHashCode3 = (((i + iHashCode2) * 31) + poiMergedListItem.copy(poiMergedListItem.itemType, null, poiMergedListItem.review, poiMergedListItem.banners, poiMergedListItem.awemeCover, poiMergedListItem.awemeTopicTag, poiMergedListItem.mediaType, poiMergedListItem.cropAwemeCover, poiMergedListItem.awemeTopicTagEn).hashCode()) * 31;
        Aweme aweme = this.LLILLJJLI.getAweme();
        int iHashCode4 = (aweme == null || (aid2 = aweme.getAid()) == null) ? 0 : aid2.hashCode();
        PoiListApi.PoiMergedListItem poiMergedListItem2 = this.LLILLL;
        int iHashCode5 = (((iHashCode3 + iHashCode4) * 31) + poiMergedListItem2.copy(poiMergedListItem2.itemType, null, poiMergedListItem2.review, poiMergedListItem2.banners, poiMergedListItem2.awemeCover, poiMergedListItem2.awemeTopicTag, poiMergedListItem2.mediaType, poiMergedListItem2.cropAwemeCover, poiMergedListItem2.awemeTopicTagEn).hashCode()) * 31;
        Aweme aweme2 = this.LLILLL.getAweme();
        if (aweme2 != null && (aid = aweme2.getAid()) != null) {
            iHashCode = aid.hashCode();
        }
        return iHashCode5 + iHashCode;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1183820gua) && Intrinsics.LJFF(this, interfaceC1891350zJl)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String aid;
        String aid2;
        String aid3;
        if (interfaceC1891350zJl instanceof C1183820gua) {
            C1183820gua c1183820gua = (C1183820gua) interfaceC1891350zJl;
            Aweme aweme = c1183820gua.LLILLJJLI.getAweme();
            String aid4 = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            Aweme aweme2 = this.LLILLJJLI.getAweme();
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            } else {
                aid2 = null;
            }
            if (Intrinsics.LJFF(aid, aid2)) {
                Aweme aweme3 = c1183820gua.LLILLL.getAweme();
                if (aweme3 != null) {
                    aid3 = aweme3.getAid();
                } else {
                    aid3 = null;
                }
                Aweme aweme4 = this.LLILLL.getAweme();
                if (aweme4 != null) {
                    aid4 = aweme4.getAid();
                }
                if (Intrinsics.LJFF(aid3, aid4)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        String aid;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1183820gua)) {
            return false;
        }
        C1183820gua c1183820gua = (C1183820gua) obj;
        c1183820gua.getClass();
        if (this.LLILZ != c1183820gua.LLILZ || this.LLILZIL != c1183820gua.LLILZIL || !Intrinsics.LJFF(this.LL, c1183820gua.LL)) {
            return false;
        }
        PoiListApi.PoiMergedListItem poiMergedListItem = this.LLILLJJLI;
        String aid2 = null;
        String aid3 = null;
        PoiListApi.PoiMergedListItem poiMergedListItemCopy = poiMergedListItem.copy(poiMergedListItem.itemType, null, poiMergedListItem.review, poiMergedListItem.banners, poiMergedListItem.awemeCover, poiMergedListItem.awemeTopicTag, poiMergedListItem.mediaType, poiMergedListItem.cropAwemeCover, poiMergedListItem.awemeTopicTagEn);
        PoiListApi.PoiMergedListItem poiMergedListItem2 = c1183820gua.LLILLJJLI;
        PoiListApi.PoiMergedListItem poiMergedListItemCopy2 = poiMergedListItem2.copy(poiMergedListItem2.itemType, null, poiMergedListItem2.review, poiMergedListItem2.banners, poiMergedListItem2.awemeCover, poiMergedListItem2.awemeTopicTag, poiMergedListItem2.mediaType, poiMergedListItem2.cropAwemeCover, poiMergedListItem2.awemeTopicTagEn);
        PoiListApi.PoiMergedListItem poiMergedListItem3 = this.LLILLL;
        PoiListApi.PoiMergedListItem poiMergedListItemCopy3 = poiMergedListItem3.copy(poiMergedListItem3.itemType, null, poiMergedListItem3.review, poiMergedListItem3.banners, poiMergedListItem3.awemeCover, poiMergedListItem3.awemeTopicTag, poiMergedListItem3.mediaType, poiMergedListItem3.cropAwemeCover, poiMergedListItem3.awemeTopicTagEn);
        PoiListApi.PoiMergedListItem poiMergedListItem4 = c1183820gua.LLILLL;
        PoiListApi.PoiMergedListItem poiMergedListItemCopy4 = poiMergedListItem4.copy(poiMergedListItem4.itemType, null, poiMergedListItem4.review, poiMergedListItem4.banners, poiMergedListItem4.awemeCover, poiMergedListItem4.awemeTopicTag, poiMergedListItem4.mediaType, poiMergedListItem4.cropAwemeCover, poiMergedListItem4.awemeTopicTagEn);
        if (Intrinsics.LJFF(poiMergedListItemCopy, poiMergedListItemCopy2)) {
            Aweme aweme = this.LLILLJJLI.getAweme();
            String aid4 = null;
            if (aweme != null) {
                aid2 = aweme.getAid();
            }
            Aweme aweme2 = c1183820gua.LLILLJJLI.getAweme();
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid2, aid) && Intrinsics.LJFF(poiMergedListItemCopy3, poiMergedListItemCopy4)) {
                Aweme aweme3 = this.LLILLL.getAweme();
                if (aweme3 != null) {
                    aid3 = aweme3.getAid();
                }
                Aweme aweme4 = c1183820gua.LLILLL.getAweme();
                if (aweme4 != null) {
                    aid4 = aweme4.getAid();
                }
                if (Intrinsics.LJFF(aid3, aid4)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public C1183820gua(String str, PoiListApi.PoiMergedListItem poiMergedListItem, PoiListApi.PoiMergedListItem poiMergedListItem2, int i, int i2, Integer num, Integer num2) {
        this.LL = str;
        this.LLILLJJLI = poiMergedListItem;
        this.LLILLL = poiMergedListItem2;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = num;
        this.LLIZ = num2;
    }
}
