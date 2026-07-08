package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231801CWs implements WireEnum {
    VAR_LINK_MIC_IM_TYPE_UNKNOWN(0),
    VAR_LINK_MIC_IM_TYPE_CREATE_CHANNEL(1),
    VAR_LINK_MIC_IM_TYPE_FINISH_CHANNEL(2),
    VAR_LINK_MIC_IM_TYPE_INVITE(3),
    VAR_LINK_MIC_IM_TYPE_CANCEL_INVITE(4),
    VAR_LINK_MIC_IM_TYPE_REPLY(5),
    VAR_LINK_MIC_IM_TYPE_APPLY(6),
    VAR_LINK_MIC_IM_TYPE_CANCEL_APPLY(7),
    VAR_LINK_MIC_IM_TYPE_PERMIT(8),
    VAR_LINK_MIC_IM_TYPE_LEAVE(9),
    VAR_LINK_MIC_IM_TYPE_KICKOUT(10),
    VAR_LINK_MIC_IM_TYPE_LIST_CHANGE(11),
    VAR_LINK_MIC_IM_TYPE_JOIN_DIRECT(12),
    VAR_LINK_MIC_IM_TYPE_LINK_STATE(13),
    VAR_LINK_MIC_IM_TYPE_INVITE_GROUP(14),
    VAR_LINK_MIC_IM_TYPE_CANCEL_INVITE_GROUP(15),
    VAR_LINK_MIC_IM_TYPE_REPLY_GROUP(16),
    VAR_LINK_MIC_IM_TYPE_APPLY_GROUP(17),
    VAR_LINK_MIC_IM_TYPE_CANCEL_APPLY_GROUP(18),
    VAR_LINK_MIC_IM_TYPE_PERMIT_GROUP(19),
    VAR_LINK_MIC_IM_TYPE_LEAVE_GROUP(20),
    VAR_LINK_MIC_IM_TYPE_GROUP_LIST_CHANGE(21),
    VAR_LINK_MIC_IM_TYPE_P_TO_P_GROUP_LIST_CHANGE(22),
    VAR_LINK_MIC_IM_TYPE_JOIN_GROUP_DIRECT(23),
    VAR_LINK_MIC_IM_TYPE_JOIN_ROOM_DIRECT(24);

    public static final ProtoAdapter<EnumC2231801CWs> ADAPTER = new EnumAdapter<EnumC2231801CWs>() { // from class: X.1CYR
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2231801CWs.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2231801CWs fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_LINK_MIC_IM_TYPE_UNKNOWN;
            case 1:
                return VAR_LINK_MIC_IM_TYPE_CREATE_CHANNEL;
            case 2:
                return VAR_LINK_MIC_IM_TYPE_FINISH_CHANNEL;
            case 3:
                return VAR_LINK_MIC_IM_TYPE_INVITE;
            case 4:
                return VAR_LINK_MIC_IM_TYPE_CANCEL_INVITE;
            case 5:
                return VAR_LINK_MIC_IM_TYPE_REPLY;
            case 6:
                return VAR_LINK_MIC_IM_TYPE_APPLY;
            case 7:
                return VAR_LINK_MIC_IM_TYPE_CANCEL_APPLY;
            case 8:
                return VAR_LINK_MIC_IM_TYPE_PERMIT;
            case BdTuring.TYPE_ECAF /* 9 */:
                return VAR_LINK_MIC_IM_TYPE_LEAVE;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return VAR_LINK_MIC_IM_TYPE_KICKOUT;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return VAR_LINK_MIC_IM_TYPE_LIST_CHANGE;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return VAR_LINK_MIC_IM_TYPE_JOIN_DIRECT;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return VAR_LINK_MIC_IM_TYPE_LINK_STATE;
            case 14:
                return VAR_LINK_MIC_IM_TYPE_INVITE_GROUP;
            case 15:
                return VAR_LINK_MIC_IM_TYPE_CANCEL_INVITE_GROUP;
            case 16:
                return VAR_LINK_MIC_IM_TYPE_REPLY_GROUP;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return VAR_LINK_MIC_IM_TYPE_APPLY_GROUP;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return VAR_LINK_MIC_IM_TYPE_CANCEL_APPLY_GROUP;
            case 19:
                return VAR_LINK_MIC_IM_TYPE_PERMIT_GROUP;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return VAR_LINK_MIC_IM_TYPE_LEAVE_GROUP;
            case 21:
                return VAR_LINK_MIC_IM_TYPE_GROUP_LIST_CHANGE;
            case 22:
                return VAR_LINK_MIC_IM_TYPE_P_TO_P_GROUP_LIST_CHANGE;
            case 23:
                return VAR_LINK_MIC_IM_TYPE_JOIN_GROUP_DIRECT;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return VAR_LINK_MIC_IM_TYPE_JOIN_ROOM_DIRECT;
            default:
                return null;
        }
    }

    public static EnumC2231801CWs valueOf(String str) {
        return (EnumC2231801CWs) C08FF.LIZ(EnumC2231801CWs.class, str);
    }

    EnumC2231801CWs(int i) {
        this.LL = i;
    }
}
