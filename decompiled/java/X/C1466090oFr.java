package X;

import android.os.Build;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras;
import com.ss.android.ugc.aweme.creative.model.stickers.MentionStickerParam;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesRecordParam;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesResponseStickerStruct;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesStickerStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.comment.CommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.emojislider.EmojiSliderStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.interactiveemoji.InteractiveEmojiStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.link.LinkStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.live.LiveCountDownStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.LiveEventCountDownStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory.LiveEventStoryStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveshare.LiveShareStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.music.MusicStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.poll.PollStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesResponseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.hashtag.HashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.SharedCommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.socialavatar.SocialAvatarStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.MemeSongTextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1466090oFr {
    public static final void LJ(StickerNewEngineModel stickerNewEngineModel) {
        for (EnumC1466150oFx enumC1466150oFx : EnumC1466150oFx.values()) {
            LIZLLL(stickerNewEngineModel, enumC1466150oFx);
        }
    }

    public static final List<StickerModel> LJFF(StickerNewEngineModel stickerNewEngineModel) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(stickerNewEngineModel.addYoursStickerModels);
        arrayList.addAll(stickerNewEngineModel.liveShareStickerModels);
        arrayList.addAll(stickerNewEngineModel.donationStickers);
        arrayList.addAll(stickerNewEngineModel.textStickerModels);
        arrayList.addAll(stickerNewEngineModel.aiCaptionTagStickers);
        arrayList.addAll(stickerNewEngineModel.liveCountDownStickerModel);
        arrayList.addAll(stickerNewEngineModel.liveEventCountDownStickerModel);
        arrayList.addAll(stickerNewEngineModel.pollStickers);
        arrayList.addAll(stickerNewEngineModel.articleStickers);
        arrayList.addAll(stickerNewEngineModel.locationStickerModels);
        arrayList.addAll(stickerNewEngineModel.interactiveEmojiStickerModels);
        arrayList.addAll(stickerNewEngineModel.memeSongTextStickerModels);
        arrayList.addAll(stickerNewEngineModel.lyricStickerModels);
        arrayList.addAll(stickerNewEngineModel.mentionStickerModel);
        arrayList.addAll(stickerNewEngineModel.hashtagStickerModel);
        arrayList.addAll(stickerNewEngineModel.musicStickerModels);
        arrayList.addAll(stickerNewEngineModel.commentStickerModels);
        arrayList.addAll(stickerNewEngineModel.emojiSliderStickerModels);
        arrayList.addAll(stickerNewEngineModel.linkStickerModels);
        arrayList.addAll(stickerNewEngineModel.sharedCommentStickerModels);
        arrayList.addAll(stickerNewEngineModel.secretRepliesStickerModel);
        arrayList.addAll(stickerNewEngineModel.secretRepliesResponseStickerModel);
        arrayList.addAll(stickerNewEngineModel.socialAvatarStickerModels);
        arrayList.addAll(stickerNewEngineModel.liveEventStoryStickerModel);
        arrayList.addAll(stickerNewEngineModel.dmGroupChatStickerModel);
        return arrayList;
    }

    public static final Integer LJI(StickerNewEngineModel stickerNewEngineModel) {
        ArrayList arrayList = new ArrayList(stickerNewEngineModel.textStickerModels);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((TextStickerModel) obj).isVERenderSticker()) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(((TextStickerModel) it2.next()).getBaseStickerModel().getZIndex() + 2000);
        while (it2.hasNext()) {
            Integer numValueOf2 = Integer.valueOf(((TextStickerModel) it2.next()).getBaseStickerModel().getZIndex() + 2000);
            if (numValueOf.compareTo(numValueOf2) < 0) {
                numValueOf = numValueOf2;
            }
        }
        return numValueOf;
    }

    public static final boolean LJII(StickerNewEngineModel stickerNewEngineModel) {
        return !stickerNewEngineModel.addYoursStickerModels.isEmpty();
    }

    public static final boolean LJIIIZ(StickerNewEngineModel stickerNewEngineModel) {
        return !stickerNewEngineModel.lyricStickerModels.isEmpty();
    }

    public static final boolean LJIIJ(StickerNewEngineModel stickerNewEngineModel) {
        return !stickerNewEngineModel.musicStickerModels.isEmpty();
    }

    public static final boolean LJIIJJI(StickerNewEngineModel stickerNewEngineModel) {
        if ((!stickerNewEngineModel.locationStickerModels.isEmpty()) || (!stickerNewEngineModel.donationStickers.isEmpty()) || (!stickerNewEngineModel.pollStickers.isEmpty()) || (!stickerNewEngineModel.articleStickers.isEmpty()) || (!stickerNewEngineModel.commentStickerModels.isEmpty()) || (!stickerNewEngineModel.mentionStickerModel.isEmpty()) || (!stickerNewEngineModel.hashtagStickerModel.isEmpty()) || (!stickerNewEngineModel.liveCountDownStickerModel.isEmpty()) || (!stickerNewEngineModel.liveEventCountDownStickerModel.isEmpty()) || (!stickerNewEngineModel.interactiveEmojiStickerModels.isEmpty()) || (!stickerNewEngineModel.emojiSliderStickerModels.isEmpty()) || (!stickerNewEngineModel.linkStickerModels.isEmpty()) || (!stickerNewEngineModel.sharedCommentStickerModels.isEmpty()) || (!stickerNewEngineModel.secretRepliesStickerModel.isEmpty()) || (!stickerNewEngineModel.secretRepliesResponseStickerModel.isEmpty()) || (!stickerNewEngineModel.socialAvatarStickerModels.isEmpty()) || (!stickerNewEngineModel.dmGroupChatStickerModel.isEmpty())) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIL(StickerNewEngineModel stickerNewEngineModel) {
        if ((!stickerNewEngineModel.addYoursStickerModels.isEmpty()) || (!stickerNewEngineModel.liveShareStickerModels.isEmpty()) || (!stickerNewEngineModel.donationStickers.isEmpty()) || (!stickerNewEngineModel.textStickerModels.isEmpty()) || (!stickerNewEngineModel.aiCaptionTagStickers.isEmpty()) || (!stickerNewEngineModel.pollStickers.isEmpty()) || (!stickerNewEngineModel.articleStickers.isEmpty()) || (!stickerNewEngineModel.locationStickerModels.isEmpty()) || (!stickerNewEngineModel.musicStickerModels.isEmpty()) || (!stickerNewEngineModel.mentionStickerModel.isEmpty()) || (!stickerNewEngineModel.hashtagStickerModel.isEmpty()) || (!stickerNewEngineModel.commentStickerModels.isEmpty()) || (!stickerNewEngineModel.memeSongTextStickerModels.isEmpty()) || (!stickerNewEngineModel.lyricStickerModels.isEmpty()) || (!stickerNewEngineModel.liveCountDownStickerModel.isEmpty()) || (!stickerNewEngineModel.liveEventCountDownStickerModel.isEmpty()) || (!stickerNewEngineModel.interactiveEmojiStickerModels.isEmpty()) || (!stickerNewEngineModel.emojiSliderStickerModels.isEmpty()) || (!stickerNewEngineModel.linkStickerModels.isEmpty()) || (!stickerNewEngineModel.linkStoryAnchorModels.isEmpty()) || (!stickerNewEngineModel.sharedCommentStickerModels.isEmpty()) || (!stickerNewEngineModel.secretRepliesStickerModel.isEmpty()) || (!stickerNewEngineModel.secretRepliesResponseStickerModel.isEmpty()) || (!stickerNewEngineModel.socialAvatarStickerModels.isEmpty()) || (!stickerNewEngineModel.liveEventStoryStickerModel.isEmpty()) || (!stickerNewEngineModel.dmGroupChatStickerModel.isEmpty()) || (!stickerNewEngineModel.interactStickerStructs.isEmpty())) {
            return true;
        }
        return false;
    }

    public static final void LIZ(StickerNewEngineModel stickerNewEngineModel, SecretRepliesRecordParam secretRepliesRecordParam) {
        Long baseAwemeId;
        String questionText;
        String questionText2;
        String responseText = null;
        if (secretRepliesRecordParam.getSecretRepliesStickerStruct() != null) {
            stickerNewEngineModel.secretRepliesStickerModel.clear();
            List<SecretRepliesStickerModel> list = stickerNewEngineModel.secretRepliesStickerModel;
            SecretRepliesStickerStruct secretRepliesStickerStruct = secretRepliesRecordParam.getSecretRepliesStickerStruct();
            if (secretRepliesStickerStruct != null) {
                questionText2 = secretRepliesStickerStruct.getQuestionText();
            } else {
                questionText2 = null;
            }
            list.add(new SecretRepliesStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.SECRET_REPLIES, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), true, questionText2, true));
        }
        if (secretRepliesRecordParam.getSecretRepliesResponseStickerStruct() != null) {
            stickerNewEngineModel.secretRepliesResponseStickerModel.clear();
            List<SecretRepliesResponseStickerModel> list2 = stickerNewEngineModel.secretRepliesResponseStickerModel;
            SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct = secretRepliesRecordParam.getSecretRepliesResponseStickerStruct();
            if (secretRepliesResponseStickerStruct != null) {
                baseAwemeId = secretRepliesResponseStickerStruct.getBaseAwemeId();
            } else {
                baseAwemeId = null;
            }
            SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct2 = secretRepliesRecordParam.getSecretRepliesResponseStickerStruct();
            if (secretRepliesResponseStickerStruct2 != null) {
                questionText = secretRepliesResponseStickerStruct2.getQuestionText();
            } else {
                questionText = null;
            }
            SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct3 = secretRepliesRecordParam.getSecretRepliesResponseStickerStruct();
            if (secretRepliesResponseStickerStruct3 != null) {
                responseText = secretRepliesResponseStickerStruct3.getResponseText();
            }
            list2.add(new SecretRepliesResponseStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.SECRET_REPLIES_RESPONSE, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), baseAwemeId, questionText, responseText, true));
        }
    }

    public static final void LIZIZ(StickerNewEngineModel stickerNewEngineModel, StickerModel stickerModel) {
        if (stickerModel instanceof DMGroupChatStickerModel) {
            LIZLLL(stickerNewEngineModel, ((DMGroupChatStickerModel) stickerModel).getStickerType());
            stickerNewEngineModel.dmGroupChatStickerModel.add(stickerModel);
            return;
        }
        if (stickerModel instanceof PollStickerModel) {
            LIZLLL(stickerNewEngineModel, ((PollStickerModel) stickerModel).getStickerType());
            stickerNewEngineModel.pollStickers.add(stickerModel);
            return;
        }
        if (stickerModel instanceof ArticleStickerModel) {
            LIZLLL(stickerNewEngineModel, ((ArticleStickerModel) stickerModel).getStickerType());
            stickerNewEngineModel.articleStickers.add(stickerModel);
            return;
        }
        if (stickerModel instanceof DonationStickerModel) {
            LIZLLL(stickerNewEngineModel, ((DonationStickerModel) stickerModel).getStickerType());
            stickerNewEngineModel.donationStickers.add(stickerModel);
            return;
        }
        if (stickerModel instanceof AddYoursStickerModel) {
            LIZLLL(stickerNewEngineModel, EnumC1466150oFx.ADD_YOURS);
            stickerNewEngineModel.addYoursStickerModels.add(stickerModel);
            return;
        }
        if (stickerModel instanceof LiveShareStickerModel) {
            LIZLLL(stickerNewEngineModel, EnumC1466150oFx.LIVE_SHARE);
            stickerNewEngineModel.liveShareStickerModels.add(stickerModel);
            return;
        }
        if (stickerModel instanceof LiveCountDownStickerModel) {
            LIZJ(stickerNewEngineModel, stickerModel);
            stickerNewEngineModel.liveCountDownStickerModel.add(stickerModel);
            return;
        }
        if (stickerModel instanceof LiveEventCountDownStickerModel) {
            LIZJ(stickerNewEngineModel, stickerModel);
            stickerNewEngineModel.liveEventCountDownStickerModel.add(stickerModel);
            return;
        }
        if (stickerModel instanceof LiveEventStoryStickerModel) {
            LIZLLL(stickerNewEngineModel, EnumC1466150oFx.LIVE_EVENT_STORY);
            stickerNewEngineModel.liveEventStoryStickerModel.add(stickerModel);
            return;
        }
        if (stickerModel instanceof MentionStickerModel) {
            LIZJ(stickerNewEngineModel, stickerModel);
            stickerNewEngineModel.mentionStickerModel.add(stickerModel);
            return;
        }
        if (stickerModel instanceof HashTagStickerModel) {
            LIZJ(stickerNewEngineModel, stickerModel);
            stickerNewEngineModel.hashtagStickerModel.add(stickerModel);
            return;
        }
        if (stickerModel instanceof TextStickerModel) {
            Iterator<TextStickerModel> it2 = stickerNewEngineModel.textStickerModels.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().getId() == ((TextStickerModel) stickerModel).getId()) {
                    if (i >= 0) {
                        ListProtector.set(stickerNewEngineModel.textStickerModels, i, stickerModel);
                        return;
                    }
                } else {
                    i++;
                }
            }
            stickerNewEngineModel.textStickerModels.add(stickerModel);
            return;
        }
        if (stickerModel instanceof MemeSongTextStickerModel) {
            LIZLLL(stickerNewEngineModel, ((MemeSongTextStickerModel) stickerModel).getStickerType());
            stickerNewEngineModel.memeSongTextStickerModels.add(stickerModel);
            return;
        }
        if (stickerModel instanceof LyricStickerModel) {
            LIZJ(stickerNewEngineModel, stickerModel);
            stickerNewEngineModel.lyricStickerModels.add(stickerModel);
            return;
        }
        if (stickerModel instanceof AICaptionTagStickerModel) {
            LIZLLL(stickerNewEngineModel, ((AICaptionTagStickerModel) stickerModel).getStickerType());
            stickerNewEngineModel.aiCaptionTagStickers.add(stickerModel);
            return;
        }
        if (stickerModel instanceof LocationStickerModel) {
            LIZLLL(stickerNewEngineModel, ((LocationStickerModel) stickerModel).getStickerType());
            stickerNewEngineModel.locationStickerModels.add(stickerModel);
            return;
        }
        if (stickerModel instanceof MusicStickerModel) {
            LIZLLL(stickerNewEngineModel, ((MusicStickerModel) stickerModel).getStickerType());
            stickerNewEngineModel.musicStickerModels.add(stickerModel);
            return;
        }
        if (stickerModel instanceof CommentStickerModel) {
            LIZLLL(stickerNewEngineModel, ((CommentStickerModel) stickerModel).getStickerType());
            stickerNewEngineModel.commentStickerModels.add(stickerModel);
            return;
        }
        if (stickerModel instanceof InteractiveEmojiStickerModel) {
            LIZLLL(stickerNewEngineModel, ((InteractiveEmojiStickerModel) stickerModel).getStickerType());
            stickerNewEngineModel.interactiveEmojiStickerModels.add(stickerModel);
            return;
        }
        if (stickerModel instanceof EmojiSliderStickerModel) {
            LIZJ(stickerNewEngineModel, stickerModel);
            stickerNewEngineModel.emojiSliderStickerModels.add(stickerModel);
            return;
        }
        if (stickerModel instanceof LinkStickerModel) {
            LIZJ(stickerNewEngineModel, stickerModel);
            stickerNewEngineModel.linkStickerModels.add(stickerModel);
            return;
        }
        if (stickerModel instanceof SharedCommentStickerModel) {
            LIZLLL(stickerNewEngineModel, ((SharedCommentStickerModel) stickerModel).getStickerType());
            stickerNewEngineModel.sharedCommentStickerModels.add(stickerModel);
            return;
        }
        if (stickerModel instanceof SecretRepliesStickerModel) {
            LIZJ(stickerNewEngineModel, stickerModel);
            stickerNewEngineModel.secretRepliesStickerModel.add(stickerModel);
        } else if (stickerModel instanceof SecretRepliesResponseStickerModel) {
            LIZJ(stickerNewEngineModel, stickerModel);
            stickerNewEngineModel.secretRepliesResponseStickerModel.add(stickerModel);
        } else {
            if (!(stickerModel instanceof SocialAvatarStickerModel)) {
                return;
            }
            stickerNewEngineModel.socialAvatarStickerModels.add(stickerModel);
        }
    }

    public static final void LIZJ(StickerNewEngineModel stickerNewEngineModel, StickerModel stickerModel) {
        AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(stickerModel, 837);
        switch (C1466140oFw.LIZ[stickerModel.getStickerType().ordinal()]) {
            case 1:
                LJIILJJIL(stickerNewEngineModel.pollStickers, awS601S0100000_22);
                break;
            case 2:
                LJIILJJIL(stickerNewEngineModel.articleStickers, awS601S0100000_22);
                break;
            case 3:
                LJIILJJIL(stickerNewEngineModel.donationStickers, awS601S0100000_22);
                break;
            case 4:
                LJIILJJIL(stickerNewEngineModel.addYoursStickerModels, awS601S0100000_22);
                break;
            case 5:
                LJIILJJIL(stickerNewEngineModel.linkStickerModels, awS601S0100000_22);
                break;
            case 6:
                LJIILJJIL(stickerNewEngineModel.textStickerModels, awS601S0100000_22);
                break;
            case 7:
                LJIILJJIL(stickerNewEngineModel.liveCountDownStickerModel, awS601S0100000_22);
                break;
            case 8:
                LJIILJJIL(stickerNewEngineModel.liveEventStoryStickerModel, awS601S0100000_22);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJIILJJIL(stickerNewEngineModel.liveEventCountDownStickerModel, awS601S0100000_22);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJIILJJIL(stickerNewEngineModel.aiCaptionTagStickers, awS601S0100000_22);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJIILJJIL(stickerNewEngineModel.commentStickerModels, awS601S0100000_22);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LJIILJJIL(stickerNewEngineModel.memeSongTextStickerModels, awS601S0100000_22);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LJIILJJIL(stickerNewEngineModel.lyricStickerModels, awS601S0100000_22);
                break;
            case 14:
                LJIILJJIL(stickerNewEngineModel.locationStickerModels, awS601S0100000_22);
                break;
            case 15:
                LJIILJJIL(stickerNewEngineModel.mentionStickerModel, awS601S0100000_22);
                break;
            case 16:
                LJIILJJIL(stickerNewEngineModel.hashtagStickerModel, awS601S0100000_22);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LJIILJJIL(stickerNewEngineModel.interactiveEmojiStickerModels, awS601S0100000_22);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LJIILJJIL(stickerNewEngineModel.emojiSliderStickerModels, awS601S0100000_22);
                break;
            case 19:
                LJIILJJIL(stickerNewEngineModel.musicStickerModels, awS601S0100000_22);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LJIILJJIL(stickerNewEngineModel.linkStickerModels, awS601S0100000_22);
                break;
            case 21:
                LJIILJJIL(stickerNewEngineModel.sharedCommentStickerModels, awS601S0100000_22);
                break;
            case 22:
                LJIILJJIL(stickerNewEngineModel.secretRepliesStickerModel, awS601S0100000_22);
                break;
            case 23:
                LJIILJJIL(stickerNewEngineModel.secretRepliesResponseStickerModel, awS601S0100000_22);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LJIILJJIL(stickerNewEngineModel.socialAvatarStickerModels, awS601S0100000_22);
                break;
            case 25:
                LJIILJJIL(stickerNewEngineModel.dmGroupChatStickerModel, awS601S0100000_22);
                break;
        }
    }

    public static final void LIZLLL(StickerNewEngineModel stickerNewEngineModel, EnumC1466150oFx enumC1466150oFx) {
        switch (C1466140oFw.LIZ[enumC1466150oFx.ordinal()]) {
            case 1:
                stickerNewEngineModel.pollStickers.clear();
                break;
            case 2:
                stickerNewEngineModel.articleStickers.clear();
                break;
            case 3:
                stickerNewEngineModel.donationStickers.clear();
                break;
            case 4:
                stickerNewEngineModel.addYoursStickerModels.clear();
                break;
            case 5:
                stickerNewEngineModel.liveShareStickerModels.clear();
                break;
            case 6:
                stickerNewEngineModel.textStickerModels.clear();
                break;
            case 7:
                stickerNewEngineModel.liveCountDownStickerModel.clear();
                break;
            case 8:
                stickerNewEngineModel.liveEventStoryStickerModel.clear();
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                stickerNewEngineModel.liveEventCountDownStickerModel.clear();
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                stickerNewEngineModel.aiCaptionTagStickers.clear();
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                stickerNewEngineModel.commentStickerModels.clear();
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                stickerNewEngineModel.memeSongTextStickerModels.clear();
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                stickerNewEngineModel.lyricStickerModels.clear();
                break;
            case 14:
                stickerNewEngineModel.locationStickerModels.clear();
                break;
            case 15:
                stickerNewEngineModel.mentionStickerModel.clear();
                break;
            case 16:
                stickerNewEngineModel.hashtagStickerModel.clear();
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                stickerNewEngineModel.interactiveEmojiStickerModels.clear();
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                stickerNewEngineModel.emojiSliderStickerModels.clear();
                break;
            case 19:
                stickerNewEngineModel.musicStickerModels.clear();
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                stickerNewEngineModel.linkStickerModels.clear();
                break;
            case 21:
                stickerNewEngineModel.sharedCommentStickerModels.clear();
                break;
            case 22:
                stickerNewEngineModel.secretRepliesStickerModel.clear();
                break;
            case 23:
                stickerNewEngineModel.secretRepliesResponseStickerModel.clear();
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                stickerNewEngineModel.socialAvatarStickerModels.clear();
                break;
            case 25:
                stickerNewEngineModel.dmGroupChatStickerModel.clear();
                break;
        }
    }

    public static final boolean LJIIIIZZ(List<LyricStickerModel> list, boolean z) {
        if (list.isEmpty() || list.isEmpty()) {
            return false;
        }
        Iterator<LyricStickerModel> it2 = list.iterator();
        while (it2.hasNext()) {
            if (C0EKF.LIZ(it2.next(), z)) {
                return true;
            }
        }
        return false;
    }

    public static final int LJIILIIL(StickerNewEngineModel stickerNewEngineModel, Boolean bool) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 0;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return 0;
        }
        List<AddYoursStickerModel> list = stickerNewEngineModel.addYoursStickerModels;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<AddYoursStickerModel> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (C385630FAb.LIZIZ(it2.next().getBaseStickerModel()) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        List<LiveShareStickerModel> list2 = stickerNewEngineModel.liveShareStickerModels;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<LiveShareStickerModel> it3 = list2.iterator();
            i2 = 0;
            while (it3.hasNext()) {
                if (C385630FAb.LIZIZ(it3.next().getBaseStickerModel()) && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i19 = i + i2;
        List<DonationStickerModel> list3 = stickerNewEngineModel.donationStickers;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            i3 = 0;
        } else {
            Iterator<DonationStickerModel> it4 = list3.iterator();
            i3 = 0;
            while (it4.hasNext()) {
                if (C385630FAb.LIZIZ(it4.next().getBaseStickerModel()) && (i3 = i3 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i20 = i19 + i3;
        List<LiveCountDownStickerModel> list4 = stickerNewEngineModel.liveCountDownStickerModel;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            i4 = 0;
        } else {
            Iterator<LiveCountDownStickerModel> it5 = list4.iterator();
            i4 = 0;
            while (it5.hasNext()) {
                if (C385630FAb.LIZIZ(it5.next().getBaseStickerModel()) && (i4 = i4 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i21 = i20 + i4;
        List<LiveEventCountDownStickerModel> list5 = stickerNewEngineModel.liveEventCountDownStickerModel;
        if ((list5 instanceof Collection) && list5.isEmpty()) {
            i5 = 0;
        } else {
            Iterator<LiveEventCountDownStickerModel> it6 = list5.iterator();
            i5 = 0;
            while (it6.hasNext()) {
                if (C385630FAb.LIZIZ(it6.next().getBaseStickerModel()) && (i5 = i5 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i22 = i21 + i5;
        List<PollStickerModel> list6 = stickerNewEngineModel.pollStickers;
        if ((list6 instanceof Collection) && list6.isEmpty()) {
            i6 = 0;
        } else {
            Iterator<PollStickerModel> it7 = list6.iterator();
            i6 = 0;
            while (it7.hasNext()) {
                if (C385630FAb.LIZIZ(it7.next().getBaseStickerModel()) && (i6 = i6 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i23 = i22 + i6;
        List<ArticleStickerModel> list7 = stickerNewEngineModel.articleStickers;
        if ((list7 instanceof Collection) && list7.isEmpty()) {
            i7 = 0;
        } else {
            Iterator<ArticleStickerModel> it8 = list7.iterator();
            i7 = 0;
            while (it8.hasNext()) {
                if (C385630FAb.LIZIZ(it8.next().getBaseStickerModel()) && (i7 = i7 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i24 = i23 + i7;
        List<LocationStickerModel> list8 = stickerNewEngineModel.locationStickerModels;
        if ((list8 instanceof Collection) && list8.isEmpty()) {
            i8 = 0;
        } else {
            Iterator<LocationStickerModel> it9 = list8.iterator();
            i8 = 0;
            while (it9.hasNext()) {
                if (C385630FAb.LIZIZ(it9.next().getBaseStickerModel()) && (i8 = i8 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i25 = i24 + i8;
        List<InteractiveEmojiStickerModel> list9 = stickerNewEngineModel.interactiveEmojiStickerModels;
        if ((list9 instanceof Collection) && list9.isEmpty()) {
            i9 = 0;
        } else {
            Iterator<InteractiveEmojiStickerModel> it10 = list9.iterator();
            i9 = 0;
            while (it10.hasNext()) {
                if (C385630FAb.LIZIZ(it10.next().getBaseStickerModel()) && (i9 = i9 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i26 = i25 + i9;
        List<MentionStickerModel> list10 = stickerNewEngineModel.mentionStickerModel;
        if ((list10 instanceof Collection) && list10.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<MentionStickerModel> it11 = list10.iterator();
            i10 = 0;
            while (it11.hasNext()) {
                if (C385630FAb.LIZIZ(it11.next().getBaseStickerModel()) && (i10 = i10 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i27 = i26 + i10;
        List<HashTagStickerModel> list11 = stickerNewEngineModel.hashtagStickerModel;
        if ((list11 instanceof Collection) && list11.isEmpty()) {
            i11 = 0;
        } else {
            Iterator<HashTagStickerModel> it12 = list11.iterator();
            i11 = 0;
            while (it12.hasNext()) {
                if (C385630FAb.LIZIZ(it12.next().getBaseStickerModel()) && (i11 = i11 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i28 = i27 + i11;
        List<MusicStickerModel> list12 = stickerNewEngineModel.musicStickerModels;
        if ((list12 instanceof Collection) && list12.isEmpty()) {
            i12 = 0;
        } else {
            Iterator<MusicStickerModel> it13 = list12.iterator();
            i12 = 0;
            while (it13.hasNext()) {
                if (C385630FAb.LIZIZ(it13.next().getBaseStickerModel()) && (i12 = i12 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i29 = i28 + i12;
        List<EmojiSliderStickerModel> list13 = stickerNewEngineModel.emojiSliderStickerModels;
        if ((list13 instanceof Collection) && list13.isEmpty()) {
            i13 = 0;
        } else {
            Iterator<EmojiSliderStickerModel> it14 = list13.iterator();
            i13 = 0;
            while (it14.hasNext()) {
                if (C385630FAb.LIZIZ(it14.next().getBaseStickerModel()) && (i13 = i13 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i30 = i29 + i13;
        List<LinkStickerModel> list14 = stickerNewEngineModel.linkStickerModels;
        if ((list14 instanceof Collection) && list14.isEmpty()) {
            i14 = 0;
        } else {
            Iterator<LinkStickerModel> it15 = list14.iterator();
            i14 = 0;
            while (it15.hasNext()) {
                if (C385630FAb.LIZIZ(it15.next().getBaseStickerModel()) && (i14 = i14 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i31 = i30 + i14;
        List<SecretRepliesStickerModel> list15 = stickerNewEngineModel.secretRepliesStickerModel;
        if ((list15 instanceof Collection) && list15.isEmpty()) {
            i15 = 0;
        } else {
            Iterator<SecretRepliesStickerModel> it16 = list15.iterator();
            i15 = 0;
            while (it16.hasNext()) {
                if (C385630FAb.LIZIZ(it16.next().getBaseStickerModel()) && (i15 = i15 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i32 = i31 + i15;
        List<SecretRepliesResponseStickerModel> list16 = stickerNewEngineModel.secretRepliesResponseStickerModel;
        if ((list16 instanceof Collection) && list16.isEmpty()) {
            i16 = 0;
        } else {
            Iterator<SecretRepliesResponseStickerModel> it17 = list16.iterator();
            i16 = 0;
            while (it17.hasNext()) {
                if (C385630FAb.LIZIZ(it17.next().getBaseStickerModel()) && (i16 = i16 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i33 = i32 + i16;
        List<SocialAvatarStickerModel> list17 = stickerNewEngineModel.socialAvatarStickerModels;
        if ((list17 instanceof Collection) && list17.isEmpty()) {
            i17 = 0;
        } else {
            Iterator<SocialAvatarStickerModel> it18 = list17.iterator();
            i17 = 0;
            while (it18.hasNext()) {
                if (C385630FAb.LIZIZ(it18.next().getBaseStickerModel()) && (i17 = i17 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i34 = i33 + i17;
        List<DMGroupChatStickerModel> list18 = stickerNewEngineModel.dmGroupChatStickerModel;
        if (!(list18 instanceof Collection) || !list18.isEmpty()) {
            Iterator<DMGroupChatStickerModel> it19 = list18.iterator();
            while (it19.hasNext()) {
                if (C385630FAb.LIZIZ(it19.next().getBaseStickerModel()) && (i18 = i18 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i34 + i18;
    }

    public static final <E> boolean LJIILJJIL(List<E> list, final Function1<? super E, Boolean> function1) {
        if (Build.VERSION.SDK_INT >= 24) {
            return list.removeIf(new Predicate() { // from class: X.0oFt
                @Override // java.util.function.Predicate
                public final /* synthetic */ boolean test(Object obj) {
                    return ((Boolean) function1.invoke(obj)).booleanValue();
                }
            });
        }
        Iterator<E> it2 = list.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (function1.invoke(it2.next()).booleanValue()) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    public static final void LJIILL(StickerNewEngineModel stickerNewEngineModel, AddYourRecordParam addYourRecordParam) {
        Boolean viewerInvited;
        AddYoursStickerStruct addYoursStickerStruct = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct != null) {
            stickerNewEngineModel.addYoursStickerModels.clear();
            List<AddYoursStickerModel> list = stickerNewEngineModel.addYoursStickerModels;
            AddYoursStickerModel addYoursStickerModelLIZ = C1466100oFs.LIZ(addYoursStickerStruct);
            addYoursStickerModelLIZ.setAddYoursEnterMethod(addYourRecordParam.getAddYoursEnterMethod());
            addYoursStickerModelLIZ.setOperationSet(addYourRecordParam.isOperationSet());
            addYoursStickerModelLIZ.setSourceOfTrendsAddYoursInVideo(addYourRecordParam.getSourceOfTrendsAddYoursInVideo());
            if (addYourRecordParam.isFollowAY()) {
                addYoursStickerModelLIZ.setFollowTopicText(addYoursStickerStruct.getText());
                addYoursStickerModelLIZ.setFollowTopicId(addYoursStickerStruct.getTopicId());
                addYoursStickerModelLIZ.setNeedRemindUserCanChangeTopic(true);
            }
            list.add(addYoursStickerModelLIZ);
        }
        stickerNewEngineModel.addYoursStickerExtras.clear();
        List<AddYoursStickerExtras> list2 = stickerNewEngineModel.addYoursStickerExtras;
        boolean autoEnterStickerEdit = addYourRecordParam.getAutoEnterStickerEdit();
        String enterFrom = addYourRecordParam.getEnterFrom();
        String followStatus = addYourRecordParam.getFollowStatus();
        boolean zIsFollowAY = addYourRecordParam.isFollowAY();
        boolean zIsFromQA = addYourRecordParam.isFromQA();
        AddYoursStickerStruct addYoursStickerStruct2 = addYourRecordParam.getAddYoursStickerStruct();
        Long lValueOf = null;
        if (addYoursStickerStruct2 != null) {
            viewerInvited = addYoursStickerStruct2.getViewerInvited();
        } else {
            viewerInvited = null;
        }
        String fromGroupId = addYourRecordParam.getFromGroupId();
        if (fromGroupId != null) {
            lValueOf = Long.valueOf(CastLongProtector.parseLong(fromGroupId));
        }
        list2.add(new AddYoursStickerExtras(autoEnterStickerEdit, enterFrom, addYourRecordParam.getAddYoursEnterMethod(), followStatus, zIsFollowAY, zIsFromQA, viewerInvited, lValueOf, null, 0, addYourRecordParam.getFromPhotoMode(), addYourRecordParam.getAddYoursFromGroupContent()));
        stickerNewEngineModel.isFromFollowAddYours = addYourRecordParam.isFollowAY();
        stickerNewEngineModel.trendSource = addYourRecordParam.getTrendSource();
        String enterFrom2 = addYourRecordParam.getEnterFrom();
        if (enterFrom2 == null) {
            enterFrom2 = "";
        }
        stickerNewEngineModel.addYoursEnterFrom = enterFrom2;
    }

    public static final void LJIIZILJ(StickerNewEngineModel stickerNewEngineModel, String str) {
        Object c098200Yq;
        long jLongValue;
        try {
            c098200Yq = (LiveEventStruct) ((Gson) C09E3.LIZIZ.getValue()).LJII(str, LiveEventStruct.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        LiveEventStruct liveEventStruct = (LiveEventStruct) c098200Yq;
        if (liveEventStruct == null) {
            return;
        }
        BaseStickerModel baseStickerModel = new BaseStickerModel(0, 0, EnumC1466150oFx.LIVE_EVENT_COUNTDOWN, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null);
        Long lLJIILIIL = C2095008Iq.LJIILIIL(liveEventStruct.getId());
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        LiveEventCountDownStickerModel liveEventCountDownStickerModel = new LiveEventCountDownStickerModel(baseStickerModel, liveEventStruct.getTitle(), 1000 * liveEventStruct.getStartTime(), System.currentTimeMillis(), 0L, Boolean.FALSE, "", "", "", 1, false, false, true, jLongValue, false);
        LIZJ(stickerNewEngineModel, liveEventCountDownStickerModel);
        stickerNewEngineModel.liveEventCountDownStickerModel.add(liveEventCountDownStickerModel);
    }

    public static final void LJIJ(StickerNewEngineModel stickerNewEngineModel, MentionStickerParam mentionStickerParam) {
        MentionStickerModel mentionStickerModel = new MentionStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.MENTION, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), mentionStickerParam.getUser(), mentionStickerParam.getUserId(), mentionStickerParam.getSecUid(), mentionStickerParam.getUserName(), mentionStickerParam.getAvatarUrl(), mentionStickerParam.getUserName(), mentionStickerParam.getUseNickName(), mentionStickerParam.getEditable(), mentionStickerParam.getVisible(), mentionStickerParam.getUseCapsuleStyle());
        LIZJ(stickerNewEngineModel, mentionStickerModel);
        stickerNewEngineModel.mentionStickerModel.add(mentionStickerModel);
        stickerNewEngineModel.dmEoyAYMentionStickerModel.add(mentionStickerModel);
    }

    public static final void LJIILLIIL(StickerNewEngineModel stickerNewEngineModel, DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo, String str, String str2) {
        String str3;
        if (!Intrinsics.LJFF(str, "group_onboarding_card") && !Intrinsics.LJFF(str, "group_onboarding_card_creation_guide")) {
            str3 = "";
        } else {
            str3 = str;
        }
        C13DA c13da = new C13DA();
        if (str2 != null && str2.length() > 0) {
            c13da.put("shoot_enter_from", str2);
        }
        if (str != null && str.length() > 0) {
            c13da.put("shoot_enter_method", str);
        }
        if (str3.length() > 0) {
            c13da.put("source_enter_method", str3);
        }
        stickerNewEngineModel.dmGroupChatStickerModel.add(new DMGroupChatStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.DM_GROUP_CHAT, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), dMGroupChatStickerGroupInfo, EnumC19620411pa.STICKER_WITH_BUTTON_WITH_WHITE.getValue(), true, true, c13da.build()));
    }
}
