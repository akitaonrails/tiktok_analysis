package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sg1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727350Sg1 implements Serializable {
    public static final int $stable = 0;
    public final String enterMethod;
    public final String enterPosition;
    public final String feedEnterFrom;
    public final String feedFrom;
    public final int feedPageType;
    public final String gdLabel;
    public final int inboxNoticeSubType;
    public final int inboxNoticeType;
    public final int innerPushType;

    public final C727350Sg1 copy(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, String str5) {
        return new C727350Sg1(str, str2, str3, str4, i, i2, i3, i4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C727350Sg1)) {
            return false;
        }
        C727350Sg1 c727350Sg1 = (C727350Sg1) obj;
        return Intrinsics.LJFF(this.feedEnterFrom, c727350Sg1.feedEnterFrom) && Intrinsics.LJFF(this.enterMethod, c727350Sg1.enterMethod) && Intrinsics.LJFF(this.enterPosition, c727350Sg1.enterPosition) && Intrinsics.LJFF(this.feedFrom, c727350Sg1.feedFrom) && this.feedPageType == c727350Sg1.feedPageType && this.inboxNoticeType == c727350Sg1.inboxNoticeType && this.inboxNoticeSubType == c727350Sg1.inboxNoticeSubType && this.innerPushType == c727350Sg1.innerPushType && Intrinsics.LJFF(this.gdLabel, c727350Sg1.gdLabel);
    }

    public C727350Sg1(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, String str5) {
        this.feedEnterFrom = str;
        this.enterMethod = str2;
        this.enterPosition = str3;
        this.feedFrom = str4;
        this.feedPageType = i;
        this.inboxNoticeType = i2;
        this.inboxNoticeSubType = i3;
        this.innerPushType = i4;
        this.gdLabel = str5;
    }
}
