package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0Y5Z, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0Y5Z implements WireEnum {
    NotUsed(0),
    MarkConversationRead(1),
    DeleteMessage(2),
    DeleteConversation(3),
    UpdateConversationSetting(4),
    UpdateConversationCoreInfo(5),
    UpdateConversationParticipant(6),
    UpdateMessageExt(7),
    DissolveConversation(8),
    ModeChange(9),
    RefreshMessage(10),
    RecallMessage(11),
    HideViolativeMessage(12),
    ReFetchMessage(13),
    UpdateMessageProperty(14),
    RefreshAllMessage(15),
    FirstMessage(16),
    MultiPushModeChange(17);

    public static final ProtoAdapter<C0Y5Z> ADAPTER = new EnumAdapter<C0Y5Z>() { // from class: X.0Y5f
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0Y5Z.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0Y5Z fromValue(int i) {
        switch (i) {
            case 0:
                return NotUsed;
            case 1:
                return MarkConversationRead;
            case 2:
                return DeleteMessage;
            case 3:
                return DeleteConversation;
            case 4:
                return UpdateConversationSetting;
            case 5:
                return UpdateConversationCoreInfo;
            case 6:
                return UpdateConversationParticipant;
            case 7:
                return UpdateMessageExt;
            case 8:
                return DissolveConversation;
            case BdTuring.TYPE_ECAF /* 9 */:
                return ModeChange;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return RefreshMessage;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return RecallMessage;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return HideViolativeMessage;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return ReFetchMessage;
            case 14:
                return UpdateMessageProperty;
            case 15:
                return RefreshAllMessage;
            case 16:
                return FirstMessage;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return MultiPushModeChange;
            default:
                return null;
        }
    }

    public static C0Y5Z valueOf(String str) {
        return (C0Y5Z) C08FF.LIZ(C0Y5Z.class, str);
    }

    C0Y5Z(int i) {
        this.LL = i;
    }
}
