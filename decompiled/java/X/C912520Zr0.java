package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0Zr0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912520Zr0 implements Serializable {
    public final int chatType;
    public final long convShortId;
    public final String conversationId;
    public final String conversationName;
    public final int defaultMsgSelectedNumber;
    public final UrlModel displayAvatar;
    public final String enterFrom;
    public final String enterMethod;
    public final String entrance;
    public final Integer followStatus;
    public final Integer followerCount;
    public final Integer followingCount;
    public final Boolean isBlocked;
    public final boolean isHighRiskConversation;
    public final boolean isMediaMsgMasking;
    public final String nickName;
    public final String objectId;
    public final String ownerId;
    public final String recType;
    public final String reportType;
    public final String scene;
    public final String uniqueId;

    public final Boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isHighRiskConversation() {
        return this.isHighRiskConversation;
    }

    public final boolean isMediaMsgMasking() {
        return this.isMediaMsgMasking;
    }

    public C912520Zr0(String str, String str2, String str3, long j, String str4, Boolean bool, String str5, int i, String str6, String str7, int i2, boolean z, boolean z2, String str8, UrlModel urlModel, Integer num, Integer num2, Integer num3, String str9, String str10, String str11, String str12) {
        this.objectId = str;
        this.ownerId = str2;
        this.conversationId = str3;
        this.convShortId = j;
        this.uniqueId = str4;
        this.isBlocked = bool;
        this.reportType = str5;
        this.chatType = i;
        this.enterMethod = str6;
        this.conversationName = str7;
        this.defaultMsgSelectedNumber = i2;
        this.isHighRiskConversation = z;
        this.isMediaMsgMasking = z2;
        this.nickName = str8;
        this.displayAvatar = urlModel;
        this.followingCount = num;
        this.followerCount = num2;
        this.followStatus = num3;
        this.recType = str9;
        this.entrance = str10;
        this.enterFrom = str11;
        this.scene = str12;
    }
}
