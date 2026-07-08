package X;

import com.bytedance.retrofit2.mime.DigestUtil;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchForceInterveneCard;
import java.io.Serializable;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0QdX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674850QdX implements Serializable {
    public static final int $stable = 8;
    public String apiVersion;
    public String attachProducts;
    public Integer correctType;
    public Integer count;
    public Long cursor;
    public String ecPageFeatureParams;
    public String ecSearchSessionId;
    public Long endToEndSearchSessionId;
    public String enterFrom;
    public String enterFromSecond;
    public List<PhotoSearchForceInterveneCard> forceInterveneCard;
    public boolean forceRequest;
    public Integer hotSearch;
    public String imageKey;
    public String keyword;
    public String lastSearchId;
    public String passThroughParams;
    public String personalContextInfo;
    public String photoProductInfo;
    public C676050QfT photoSearch;
    public String photoSearchExtra;
    public String productDetailUri;
    public Integer recallShield;
    public Integer rootEnterFromType;
    public String searchChannel;
    public String searchContext;
    public String searchId;
    public String searchSessionId;
    public String searchSource;
    public String source;
    public String trafficSourceList;
    public String userRtActs;

    public C674850QdX() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final String getImageByteHash() {
        TypedByteArray typedByteArray;
        C676050QfT c676050QfT = this.photoSearch;
        return DigestUtil.md5Hex((c676050QfT == null || (typedByteArray = c676050QfT.image) == null) ? null : typedByteArray.getBytes());
    }

    public final String getKey() {
        String str = null;
        String str2 = null;
        String str3 = null;
        C674850QdX c674850QdX = new C674850QdX(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        c674850QdX.keyword = this.keyword;
        c674850QdX.searchSource = this.searchSource;
        c674850QdX.source = this.source;
        c674850QdX.hotSearch = this.hotSearch;
        c674850QdX.correctType = this.correctType;
        c674850QdX.searchId = this.searchId;
        c674850QdX.lastSearchId = this.lastSearchId;
        c674850QdX.cursor = this.cursor;
        c674850QdX.count = this.count;
        c674850QdX.enterFrom = this.enterFrom;
        c674850QdX.searchContext = this.searchContext;
        c674850QdX.searchChannel = this.searchChannel;
        c674850QdX.attachProducts = this.attachProducts;
        c674850QdX.trafficSourceList = this.trafficSourceList;
        c674850QdX.personalContextInfo = this.personalContextInfo;
        C676050QfT c676050QfT = this.photoSearch;
        if (c676050QfT != null) {
            str2 = c676050QfT.imageTosUri;
            str = c676050QfT.detection;
            str3 = c676050QfT.detectionIdx;
        }
        c674850QdX.photoSearch = new C676050QfT(null, str2, str, str3, null, null, null);
        c674850QdX.productDetailUri = this.productDetailUri;
        c674850QdX.recallShield = this.recallShield;
        c674850QdX.searchSessionId = this.searchSessionId;
        c674850QdX.ecSearchSessionId = this.ecSearchSessionId;
        c674850QdX.photoSearchExtra = this.photoSearchExtra;
        c674850QdX.imageKey = this.imageKey;
        c674850QdX.endToEndSearchSessionId = this.endToEndSearchSessionId;
        return DigestUtil.md5Hex(u.LJIILLIIL(c674850QdX.toString()));
    }

    public final boolean isReady() {
        C676050QfT c676050QfT = this.photoSearch;
        if (c676050QfT != null) {
            return c676050QfT.isReady();
        }
        return false;
    }

    public final void setApiVersion(String str) {
        this.apiVersion = str;
    }

    public final void setAttachProducts(String str) {
        this.attachProducts = str;
    }

    public final void setCorrectType(Integer num) {
        this.correctType = num;
    }

    public final void setCount(Integer num) {
        this.count = num;
    }

    public final void setCursor(Long l) {
        this.cursor = l;
    }

    public final void setEcPageFeatureParams(String str) {
        this.ecPageFeatureParams = str;
    }

    public final void setEcSearchSessionId(String str) {
        this.ecSearchSessionId = str;
    }

    public final void setEndToEndSearchSessionId(Long l) {
        this.endToEndSearchSessionId = l;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterFromSecond(String str) {
        this.enterFromSecond = str;
    }

    public final void setForceInterveneCard(List<PhotoSearchForceInterveneCard> list) {
        this.forceInterveneCard = list;
    }

    public final void setForceRequest(boolean z) {
        this.forceRequest = z;
    }

    public final void setHotSearch(Integer num) {
        this.hotSearch = num;
    }

    public final void setImageKey(String str) {
        this.imageKey = str;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLastSearchId(String str) {
        this.lastSearchId = str;
    }

    public final void setPassThroughParams(String str) {
        this.passThroughParams = str;
    }

    public final void setPersonalContextInfo(String str) {
        this.personalContextInfo = str;
    }

    public final void setPhotoProductInfo(String str) {
        this.photoProductInfo = str;
    }

    public final void setPhotoSearch(C676050QfT c676050QfT) {
        this.photoSearch = c676050QfT;
    }

    public final void setPhotoSearchExtra(String str) {
        this.photoSearchExtra = str;
    }

    public final void setProductDetailUri(String str) {
        this.productDetailUri = str;
    }

    public final void setRecallShield(Integer num) {
        this.recallShield = num;
    }

    public final void setRootEnterFromType(Integer num) {
        this.rootEnterFromType = num;
    }

    public final void setSearchChannel(String str) {
        this.searchChannel = str;
    }

    public final void setSearchContext(String str) {
        this.searchContext = str;
    }

    public final void setSearchId(String str) {
        this.searchId = str;
    }

    public final void setSearchSessionId(String str) {
        this.searchSessionId = str;
    }

    public final void setSearchSource(String str) {
        this.searchSource = str;
    }

    public final void setSource(String str) {
        this.source = str;
    }

    public final void setTrafficSourceList(String str) {
        this.trafficSourceList = str;
    }

    public final void setUserRtActs(String str) {
        this.userRtActs = str;
    }

    public C674850QdX(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, Long l, Integer num3, String str6, String str7, String str8, String str9, String str10, String str11, C676050QfT c676050QfT, String str12, Integer num4, String str13, String str14, String str15, String str16, List<PhotoSearchForceInterveneCard> list, Long l2, String str17, String str18, String str19, String str20, String str21, Integer num5, String str22) {
        this.keyword = str;
        this.searchSource = str2;
        this.source = str3;
        this.hotSearch = num;
        this.correctType = num2;
        this.searchId = str4;
        this.lastSearchId = str5;
        this.cursor = l;
        this.count = num3;
        this.enterFrom = str6;
        this.searchContext = str7;
        this.searchChannel = str8;
        this.attachProducts = str9;
        this.trafficSourceList = str10;
        this.personalContextInfo = str11;
        this.photoSearch = c676050QfT;
        this.productDetailUri = str12;
        this.recallShield = num4;
        this.searchSessionId = str13;
        this.ecSearchSessionId = str14;
        this.photoSearchExtra = str15;
        this.imageKey = str16;
        this.forceInterveneCard = list;
        this.endToEndSearchSessionId = l2;
        this.apiVersion = str17;
        this.userRtActs = str18;
        this.passThroughParams = str19;
        this.photoProductInfo = str20;
        this.enterFromSecond = str21;
        this.rootEnterFromType = num5;
        this.ecPageFeatureParams = str22;
    }
}
