package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0Y5b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC868450Y5b implements WireEnum {
    MESSAGE_TYPE_NOT_USED(0),
    LEGACY_MESSAGE_TYPE_SYSTEM(1),
    LEGACY_MESSAGE_TYPE_EMOJI(5),
    LEGACY_MESSAGE_TYPE_TEXT(7),
    LEGACY_MESSAGE_TYPE_USER_CARD(8),
    MsgTypeShareSubOnlyVideo(11),
    MsgTypeHelloSticker(15),
    MsgTypeForwardComment(16),
    MsgTypeShareChallenge(19),
    MsgTypeShareLiveMsg(21),
    MsgTypeShareVideoBGM(22),
    MsgTypeShareProfile(25),
    MsgTypeH5Card(26),
    MsgTypeShareQnA(33),
    MsgTypeShareComment(40),
    MsgTypeShareProduct(43),
    MsgTypeShareMixVideo(71),
    MsgTypeShareEffect(72),
    MsgTypeFile(101),
    MsgTypeSystemNotice(1006),
    MsgTypeStrongSystemNotice(1007),
    MsgTypeShareLive(1021),
    MsgTypeShareStory(1025),
    MsgTypeGroupWelcomeAvatar(1030),
    MsgTypeGroupNotice(1031),
    MsgTypeSystemCardMsg(1032),
    MsgTypeShareGroupInvite(1033),
    MsgTypeShareLiveEvent(1034),
    MsgTypeSharedSearch(1036),
    MsgTypeSmallSystemCardMsg(1037),
    MsgTypeShareSubscribeInvite(1038),
    MsgTypeTemplateImageCard(1801),
    MsgTypeTemplatePictureCard(1802),
    MsgTypeTemplateVideoCard(1803),
    MsgTypeTemplateInfoCard(1804),
    MsgTypeTemplateStickerCard(1805),
    MsgTypeTemplatePortraitCard(1806),
    MsgTypeTemplateBotAnswerCard(1807),
    MsgTypeTemplateInteractiveNoticeCard(1808),
    MsgTypeTemplateShareVideo(1809),
    MsgTypeTemplateBubbleCard(1810),
    MsgTypeTemplateShareCommentCard(1811),
    MsgTypeTemplateAIGroupShotCard(1812),
    MsgTypeTemplateAudioCard(1813),
    MsgTypeTemplateInteractionCard(1814),
    MsgTypeAvatarDuoInvitation(1815),
    MsgTypeGameCard(1816),
    MsgTypeTemplateShareRepostCard(1817),
    MsgTypeVideoReactionCard(1818),
    MsgTypeVisualPoetUserCard(1819),
    MsgTypeVisualPoetBotCard(1820),
    MsgTypeVisualPoetErrorCard(1821),
    MsgTypeMarkdownCard(1822),
    MsgTypeCallLogCard(1823),
    MsgTypeTemplatePublicGroupOnboardingCard(1824),
    MsgTypeTemplateCommonCard(1900),
    MsgTypeTemplateDynamicCard(2000),
    MsgTypeTemplatePlaylistImageCard(3001),
    LEGACY_MESSAGE_TYPE_IMAGE(2),
    LEGACY_MESSAGE_TYPE_AUDIO(3),
    LEGACY_MESSAGE_TYPE_VIDEO(4),
    LEGACY_MESSAGE_TYPE_FILE(6),
    LEGACY_MESSAGE_TYPE_TOAST(9),
    LEGACY_MESSAGE_TYPE_GROUP_CARD(10),
    LEGACY_MESSAGE_TYPE_SHARE_PLAYLIST(81),
    MESSAGE_TYPE_TEXT(10001),
    MESSAGE_TYPE_STICKER(10002),
    MESSAGE_TYPE_IMAGE(10003),
    MESSAGE_TYPE_VIDEO(10004),
    MESSAGE_TYPE_FILE(10005),
    MESSAGE_TYPE_AUDIO(10006),
    MESSAGE_TYPE_LOCATION(10007),
    MESSAGE_TYPE_SYSTEM(10008),
    MESSAGE_TYPE_LINK(10009),
    MESSAGE_TYPE_GSDK_AUDIO(10011),
    MESSAGE_TYPE_STATUS(50000),
    MESSAGE_TYPE_COMMAND(50001),
    MESSAGE_TYPE_UPDATE_MESSAGE_EXT(50002),
    MESSAGE_TYPE_CONVERSATION_DESTROY(50005),
    MESSAGE_TYPE_MODE_CHANGE(50010),
    MESSAGE_TYPE_READ_COMMAND(50013),
    MESSAGE_TYPE_REFRESH_MESSAGE(50020),
    MESSAGE_TYPE_RECALL_MESSAGE(50021),
    MESSAGE_TYPE_HIDE_VIOLATIVE_MESSAGE(50022),
    MESSAGE_TYPE_RE_FETCH_MESSAGE(50023),
    MESSAGE_TYPE_RESET_ALL_MESSAGES(50024),
    MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY(70002),
    MESSAGE_TYPE_UPDATE_MIN_INDEX(50003),
    MESSAGE_TYPE_USER_ACTION(50004),
    MESSAGE_TYPE_BLOCK_COMMAND(50011),
    MESSAGE_TYPE_MARK_COMMAND(50012),
    MESSAGE_TYPE_SEND_FAILED_RESP(50014),
    MESSAGE_TYPE_NOTIFY_STRANGER(50015),
    MESSAGE_TYPE_BATCH_UNMARK_COMMAND(50016),
    MESSAGE_TYPE_VISIBLE_MESSAGE_COMMAND(50017),
    MESSAGE_TYPE_NOTIFY_COMMAND(60001),
    MESSAGE_TYPE_MESSAGE_PROPERTY(70001),
    MESSAGE_TYPE_VOIP_COMMAND(80001),
    MESSAGE_TYPE_VOIP_CARD_COMMAND(80002),
    MESSAGE_TYPE_VOIP_SINGLE_CHAT_STATUS_COMMAND(80003),
    MESSAGE_TYPE_VOIP_CALLEE_LIST_UPDATE_NOTIFY(80004),
    MESSAGE_TYPE_VOIP_ROOM_DISMISS_NOTIFY(80005),
    MESSAGE_TYPE_CONVERSATION_APPLY_NOTIFY(90001),
    MESSAGE_TYPE_CONVERSATION_AUDIT_ACK_NOTIFY(90002),
    MESSAGE_TYPE_BIZ_COMMAND(100000),
    MsgTypeStreakCommandMessage(100001),
    MsgTypeStreakPetCommandMessage(100002),
    MsgTypeB2CActionBarRefresh(100003);

    public static final ProtoAdapter<EnumC868450Y5b> ADAPTER = new EnumAdapter<EnumC868450Y5b>() { // from class: X.0Y5e
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC868450Y5b.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC868450Y5b fromValue(int i) {
        if (i != 15) {
            if (i != 16) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 25) {
                            if (i != 26) {
                                if (i != 71) {
                                    if (i != 72) {
                                        if (i != 1006) {
                                            if (i != 1007) {
                                                switch (i) {
                                                    case 0:
                                                        return MESSAGE_TYPE_NOT_USED;
                                                    case 1:
                                                        return LEGACY_MESSAGE_TYPE_SYSTEM;
                                                    case 2:
                                                        return LEGACY_MESSAGE_TYPE_IMAGE;
                                                    case 3:
                                                        return LEGACY_MESSAGE_TYPE_AUDIO;
                                                    case 4:
                                                        return LEGACY_MESSAGE_TYPE_VIDEO;
                                                    case 5:
                                                        return LEGACY_MESSAGE_TYPE_EMOJI;
                                                    case 6:
                                                        return LEGACY_MESSAGE_TYPE_FILE;
                                                    case 7:
                                                        return LEGACY_MESSAGE_TYPE_TEXT;
                                                    case 8:
                                                        return LEGACY_MESSAGE_TYPE_USER_CARD;
                                                    case BdTuring.TYPE_ECAF /* 9 */:
                                                        return LEGACY_MESSAGE_TYPE_TOAST;
                                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                        return LEGACY_MESSAGE_TYPE_GROUP_CARD;
                                                    case BdTuring.TYPE_EMAIL /* 11 */:
                                                        return MsgTypeShareSubOnlyVideo;
                                                    default:
                                                        switch (i) {
                                                            case 19:
                                                                return MsgTypeShareChallenge;
                                                            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                                                return MsgTypeShareQnA;
                                                            case 40:
                                                                return MsgTypeShareComment;
                                                            case 43:
                                                                return MsgTypeShareProduct;
                                                            case 81:
                                                                return LEGACY_MESSAGE_TYPE_SHARE_PLAYLIST;
                                                            case 101:
                                                                return MsgTypeFile;
                                                            case 1021:
                                                                return MsgTypeShareLive;
                                                            case 1025:
                                                                return MsgTypeShareStory;
                                                            case 1801:
                                                                return MsgTypeTemplateImageCard;
                                                            case 1802:
                                                                return MsgTypeTemplatePictureCard;
                                                            case 1803:
                                                                return MsgTypeTemplateVideoCard;
                                                            case 1804:
                                                                return MsgTypeTemplateInfoCard;
                                                            case 1805:
                                                                return MsgTypeTemplateStickerCard;
                                                            case 1806:
                                                                return MsgTypeTemplatePortraitCard;
                                                            case 1807:
                                                                return MsgTypeTemplateBotAnswerCard;
                                                            case 1808:
                                                                return MsgTypeTemplateInteractiveNoticeCard;
                                                            case 1809:
                                                                return MsgTypeTemplateShareVideo;
                                                            case 1810:
                                                                return MsgTypeTemplateBubbleCard;
                                                            case 1811:
                                                                return MsgTypeTemplateShareCommentCard;
                                                            case 1812:
                                                                return MsgTypeTemplateAIGroupShotCard;
                                                            case 1813:
                                                                return MsgTypeTemplateAudioCard;
                                                            case 1814:
                                                                return MsgTypeTemplateInteractionCard;
                                                            case 1815:
                                                                return MsgTypeAvatarDuoInvitation;
                                                            case 1816:
                                                                return MsgTypeGameCard;
                                                            case 1817:
                                                                return MsgTypeTemplateShareRepostCard;
                                                            case 1818:
                                                                return MsgTypeVideoReactionCard;
                                                            case 1819:
                                                                return MsgTypeVisualPoetUserCard;
                                                            case 1820:
                                                                return MsgTypeVisualPoetBotCard;
                                                            case 1821:
                                                                return MsgTypeVisualPoetErrorCard;
                                                            case 1822:
                                                                return MsgTypeMarkdownCard;
                                                            case 1823:
                                                                return MsgTypeCallLogCard;
                                                            case 1824:
                                                                return MsgTypeTemplatePublicGroupOnboardingCard;
                                                            case 1900:
                                                                return MsgTypeTemplateCommonCard;
                                                            case 2000:
                                                                return MsgTypeTemplateDynamicCard;
                                                            case 3001:
                                                                return MsgTypeTemplatePlaylistImageCard;
                                                            case 10011:
                                                                return MESSAGE_TYPE_GSDK_AUDIO;
                                                            case 50000:
                                                                return MESSAGE_TYPE_STATUS;
                                                            case 50001:
                                                                return MESSAGE_TYPE_COMMAND;
                                                            case 50002:
                                                                return MESSAGE_TYPE_UPDATE_MESSAGE_EXT;
                                                            case 50003:
                                                                return MESSAGE_TYPE_UPDATE_MIN_INDEX;
                                                            case 50004:
                                                                return MESSAGE_TYPE_USER_ACTION;
                                                            case 50005:
                                                                return MESSAGE_TYPE_CONVERSATION_DESTROY;
                                                            case 50010:
                                                                return MESSAGE_TYPE_MODE_CHANGE;
                                                            case 50011:
                                                                return MESSAGE_TYPE_BLOCK_COMMAND;
                                                            case 50012:
                                                                return MESSAGE_TYPE_MARK_COMMAND;
                                                            case 50013:
                                                                return MESSAGE_TYPE_READ_COMMAND;
                                                            case 50014:
                                                                return MESSAGE_TYPE_SEND_FAILED_RESP;
                                                            case 50015:
                                                                return MESSAGE_TYPE_NOTIFY_STRANGER;
                                                            case 50016:
                                                                return MESSAGE_TYPE_BATCH_UNMARK_COMMAND;
                                                            case 50017:
                                                                return MESSAGE_TYPE_VISIBLE_MESSAGE_COMMAND;
                                                            case 50020:
                                                                return MESSAGE_TYPE_REFRESH_MESSAGE;
                                                            case 50021:
                                                                return MESSAGE_TYPE_RECALL_MESSAGE;
                                                            case 50022:
                                                                return MESSAGE_TYPE_HIDE_VIOLATIVE_MESSAGE;
                                                            case 50023:
                                                                return MESSAGE_TYPE_RE_FETCH_MESSAGE;
                                                            case 50024:
                                                                return MESSAGE_TYPE_RESET_ALL_MESSAGES;
                                                            case 60001:
                                                                return MESSAGE_TYPE_NOTIFY_COMMAND;
                                                            case 70001:
                                                                return MESSAGE_TYPE_MESSAGE_PROPERTY;
                                                            case 70002:
                                                                return MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY;
                                                            case 80001:
                                                                return MESSAGE_TYPE_VOIP_COMMAND;
                                                            case 80002:
                                                                return MESSAGE_TYPE_VOIP_CARD_COMMAND;
                                                            case 80003:
                                                                return MESSAGE_TYPE_VOIP_SINGLE_CHAT_STATUS_COMMAND;
                                                            case 80004:
                                                                return MESSAGE_TYPE_VOIP_CALLEE_LIST_UPDATE_NOTIFY;
                                                            case 80005:
                                                                return MESSAGE_TYPE_VOIP_ROOM_DISMISS_NOTIFY;
                                                            case 90001:
                                                                return MESSAGE_TYPE_CONVERSATION_APPLY_NOTIFY;
                                                            case 90002:
                                                                return MESSAGE_TYPE_CONVERSATION_AUDIT_ACK_NOTIFY;
                                                            case 100000:
                                                                return MESSAGE_TYPE_BIZ_COMMAND;
                                                            case 100001:
                                                                return MsgTypeStreakCommandMessage;
                                                            case 100002:
                                                                return MsgTypeStreakPetCommandMessage;
                                                            case 100003:
                                                                return MsgTypeB2CActionBarRefresh;
                                                            default:
                                                                switch (i) {
                                                                    case 1030:
                                                                        return MsgTypeGroupWelcomeAvatar;
                                                                    case 1031:
                                                                        return MsgTypeGroupNotice;
                                                                    case 1032:
                                                                        return MsgTypeSystemCardMsg;
                                                                    case 1033:
                                                                        return MsgTypeShareGroupInvite;
                                                                    case 1034:
                                                                        return MsgTypeShareLiveEvent;
                                                                    default:
                                                                        switch (i) {
                                                                            case 1036:
                                                                                return MsgTypeSharedSearch;
                                                                            case 1037:
                                                                                return MsgTypeSmallSystemCardMsg;
                                                                            case 1038:
                                                                                return MsgTypeShareSubscribeInvite;
                                                                            default:
                                                                                switch (i) {
                                                                                    case 10001:
                                                                                        return MESSAGE_TYPE_TEXT;
                                                                                    case 10002:
                                                                                        return MESSAGE_TYPE_STICKER;
                                                                                    case 10003:
                                                                                        return MESSAGE_TYPE_IMAGE;
                                                                                    case 10004:
                                                                                        return MESSAGE_TYPE_VIDEO;
                                                                                    case 10005:
                                                                                        return MESSAGE_TYPE_FILE;
                                                                                    case 10006:
                                                                                        return MESSAGE_TYPE_AUDIO;
                                                                                    case 10007:
                                                                                        return MESSAGE_TYPE_LOCATION;
                                                                                    case 10008:
                                                                                        return MESSAGE_TYPE_SYSTEM;
                                                                                    case 10009:
                                                                                        return MESSAGE_TYPE_LINK;
                                                                                    default:
                                                                                        return null;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                            }
                                            return MsgTypeStrongSystemNotice;
                                        }
                                        return MsgTypeSystemNotice;
                                    }
                                    return MsgTypeShareEffect;
                                }
                                return MsgTypeShareMixVideo;
                            }
                            return MsgTypeH5Card;
                        }
                        return MsgTypeShareProfile;
                    }
                    return MsgTypeShareVideoBGM;
                }
                return MsgTypeShareLiveMsg;
            }
            return MsgTypeForwardComment;
        }
        return MsgTypeHelloSticker;
    }

    public static EnumC868450Y5b valueOf(String str) {
        return (EnumC868450Y5b) C08FF.LIZ(EnumC868450Y5b.class, str);
    }

    EnumC868450Y5b(int i) {
        this.LL = i;
    }
}
