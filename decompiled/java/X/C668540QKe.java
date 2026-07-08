package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0QKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668540QKe implements Serializable {
    public static final int $stable = 0;
    public final String enterFrom;
    public final String gid;
    public final String historyJson;
    public final String historyTimestampJson;
    public final String isBeginningOfSession;
    public final Integer isNonPersonalizedSearch;
    public final int isPreRequest;
    public final String keywords;
    public final Integer miniChunkVer;
    public final String newSugSessionId;
    public final String preInfoId;
    public final String prefParams;
    public final Long requestOrder;
    public final String requestParams;
    public final Integer richSugCount;
    public final String searchContext;
    public final String searchPosition;
    public final String sessionParams;
    public final String source;
    public final String srcAnchorProductId;
    public final String srcMaterialId;
    public final int sugCostDegradation;
    public final Integer totalCount;

    public final String isBeginningOfSession() {
        return this.isBeginningOfSession;
    }

    public final Integer isNonPersonalizedSearch() {
        return this.isNonPersonalizedSearch;
    }

    public final int isPreRequest() {
        return this.isPreRequest;
    }

    public C668540QKe(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, Integer num2, Long l, String str9, int i, String str10, String str11, String str12, String str13, Integer num3, String str14, String str15, Integer num4, String str16, int i2) {
        this.keywords = str;
        this.source = str2;
        this.gid = str3;
        this.historyJson = str4;
        this.historyTimestampJson = str5;
        this.totalCount = num;
        this.sessionParams = str6;
        this.requestParams = str7;
        this.prefParams = str8;
        this.richSugCount = num2;
        this.requestOrder = l;
        this.enterFrom = str9;
        this.sugCostDegradation = i;
        this.newSugSessionId = str10;
        this.srcMaterialId = str11;
        this.srcAnchorProductId = str12;
        this.searchPosition = str13;
        this.isNonPersonalizedSearch = num3;
        this.searchContext = str14;
        this.preInfoId = str15;
        this.miniChunkVer = num4;
        this.isBeginningOfSession = str16;
        this.isPreRequest = i2;
    }
}
