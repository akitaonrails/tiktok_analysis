package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0in8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1256080in8 implements Serializable {
    public static final int $stable = 0;
    public final String adItemId;
    public final int count;
    public final Integer createAssistantBannerEnable;
    public final String enterFrom;
    public final Integer filterPrivate;
    public final int isChunk;
    public final String locateItemId;
    public final Boolean locateNewStyle;
    public final Long maxCursor;
    public final Long minCursor;
    public final Boolean reverse;
    public final Boolean screenReaderEnable;
    public final String secUserId;
    public final Integer sortType;
    public final Integer source;
    public final Integer sovClientEnable;
    public final String userAvatarShrink;
    public final String userId;
    public final String videoCoverShrink;

    public C1256080in8() {
        this(null, null, Boolean.FALSE, 0, 0, null, null, "", "", 9, 0, "", 0, null, null, null, Boolean.FALSE, Boolean.FALSE, 0);
    }

    public final int isChunk() {
        return this.isChunk;
    }

    public C1256080in8(String str, String str2, Boolean bool, Integer num, Integer num2, Long l, Long l2, String str3, String str4, int i, Integer num3, String str5, Integer num4, String str6, String str7, Integer num5, Boolean bool2, Boolean bool3, int i2) {
        this.userAvatarShrink = str;
        this.videoCoverShrink = str2;
        this.screenReaderEnable = bool;
        this.createAssistantBannerEnable = num;
        this.sovClientEnable = num2;
        this.minCursor = l;
        this.maxCursor = l2;
        this.userId = str3;
        this.secUserId = str4;
        this.count = i;
        this.source = num3;
        this.locateItemId = str5;
        this.sortType = num4;
        this.enterFrom = str6;
        this.adItemId = str7;
        this.filterPrivate = num5;
        this.locateNewStyle = bool2;
        this.reverse = bool3;
        this.isChunk = i2;
    }
}
