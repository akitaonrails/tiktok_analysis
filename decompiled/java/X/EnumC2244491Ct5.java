package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1Ct5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2244491Ct5 implements WireEnum {
    ATTACHMENT_TYPE_DEFAULT(0),
    ATTACHMENT_TYPE_STORY(1),
    ATTACHMENT_TYPE_NUDGE_LIKE(2),
    ATTACHMENT_TYPE_NUDGE_FAVOURITE(3),
    ATTACHMENT_TYPE_NUDGE_REPOST(4),
    ATTACHMENT_TYPE_SHARE_COMMENT_MENTION(5),
    ATTACHMENT_TYPE_REPLY_REPOST(6),
    ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_POST(7),
    ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_REPOST(8),
    ATTACHMENT_TYPE_STORY_REPLY(9),
    ATTACHMENT_TYPE_GAME_CHALLENGE_GAMEPLAY(10),
    ATTACHMENT_TYPE_SHARED_FEED(11),
    ATTACHMENT_TYPE_SHARED_FEED_LIKE_HISTORY(12),
    ATTACHMENT_TYPE_SHARED_REPOST(13),
    ATTACHMENT_TYPE_THOUGHT(14);

    public static final ProtoAdapter<EnumC2244491Ct5> ADAPTER = new EnumAdapter<EnumC2244491Ct5>() { // from class: X.1Ct6
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2244491Ct5.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2244491Ct5 fromValue(int i) {
        switch (i) {
            case 0:
                return ATTACHMENT_TYPE_DEFAULT;
            case 1:
                return ATTACHMENT_TYPE_STORY;
            case 2:
                return ATTACHMENT_TYPE_NUDGE_LIKE;
            case 3:
                return ATTACHMENT_TYPE_NUDGE_FAVOURITE;
            case 4:
                return ATTACHMENT_TYPE_NUDGE_REPOST;
            case 5:
                return ATTACHMENT_TYPE_SHARE_COMMENT_MENTION;
            case 6:
                return ATTACHMENT_TYPE_REPLY_REPOST;
            case 7:
                return ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_POST;
            case 8:
                return ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_REPOST;
            case BdTuring.TYPE_ECAF /* 9 */:
                return ATTACHMENT_TYPE_STORY_REPLY;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return ATTACHMENT_TYPE_GAME_CHALLENGE_GAMEPLAY;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return ATTACHMENT_TYPE_SHARED_FEED;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return ATTACHMENT_TYPE_SHARED_FEED_LIKE_HISTORY;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return ATTACHMENT_TYPE_SHARED_REPOST;
            case 14:
                return ATTACHMENT_TYPE_THOUGHT;
            default:
                return null;
        }
    }

    public static EnumC2244491Ct5 valueOf(String str) {
        return (EnumC2244491Ct5) C08FF.LIZ(EnumC2244491Ct5.class, str);
    }

    EnumC2244491Ct5(int i) {
        this.LL = i;
    }
}
