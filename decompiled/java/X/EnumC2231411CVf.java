package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231411CVf {
    Unknown,
    ListChangeIm,
    GroupListChangeIm,
    PToPGroupListChangeIm,
    UpdateGroupUserList,
    UserManagerNotify,
    MigrateGroupReq,
    RechargeReq,
    LocalChange,
    SeiListChange,
    InnerLinkMicAction,
    CrossLinkMicAction;

    public static final C2231441CVi Companion = new Object() { // from class: X.1CVi
    };

    public static EnumC2231411CVf valueOf(String str) {
        return (EnumC2231411CVf) C08FF.LIZ(EnumC2231411CVf.class, str);
    }

    public final C1CV7 into() {
        switch (C2231421CVg.LIZ[ordinal()]) {
            case 1:
                return C1CV7.VAR_LINK_MIC_LIST_CHANGE_SOURCE_UNKNOWN;
            case 2:
                return C1CV7.VAR_LINK_MIC_LIST_CHANGE_SOURCE_LIST_CHANGE_IM;
            case 3:
                return C1CV7.VAR_LINK_MIC_LIST_CHANGE_SOURCE_GROUP_LIST_CHANGE_IM;
            case 4:
                return C1CV7.VAR_LINK_MIC_LIST_CHANGE_SOURCE_P_TO_P_GROUP_LIST_CHANGE_IM;
            case 5:
                return C1CV7.VAR_LINK_MIC_LIST_CHANGE_SOURCE_UPDATE_GROUP_USER_LIST;
            case 6:
                return C1CV7.VAR_LINK_MIC_LIST_CHANGE_SOURCE_USER_MANAGER_NOTIFY;
            case 7:
                return C1CV7.VAR_LINK_MIC_LIST_CHANGE_SOURCE_MIGRATE_GROUP_REQ;
            case 8:
                return C1CV7.VAR_LINK_MIC_LIST_CHANGE_SOURCE_RECHARGE_REQ;
            case BdTuring.TYPE_ECAF /* 9 */:
                return C1CV7.VAR_LINK_MIC_LIST_CHANGE_SOURCE_LOCAL_CHANGE;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return C1CV7.VAR_LINK_MIC_LIST_CHANGE_SOURCE_SEI_LIST_CHANGE;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return C1CV7.VAR_LINK_MIC_LIST_CHANGE_SOURCE_INNER_LINK_MIC_ACTION;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return C1CV7.VAR_LINK_MIC_LIST_CHANGE_SOURCE_CROSS_LINK_MIC_ACTION;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C2231421CVg.LIZ[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case BdTuring.TYPE_ECAF /* 9 */:
                return 8;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return 9;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return 10;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return 11;
            default:
                throw new C1954807lC();
        }
    }
}
