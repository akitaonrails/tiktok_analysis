package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.setting.FlashListItemViewComponentConfig;
import com.bytedance.android.livesdk.game.model.PlayTogetherMember;
import com.bytedance.android.livesdk.gift.model.GiftHintInfo;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.android.livesdk.model.message.UserPlayInfo;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.android.livesdkapi.depend.model.live.HighlightToolbarComInfo;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.ogccampaign.OgcLynxCache;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;
import webcast.data.LinkedUserInfo;
import webcast.data.multi_guest_play.CountdownForAllUser;
import webcast.data.multi_guest_play.GuestShowdownUser;
import webcast.data.multi_guest_play.ShowListUser;
import webcast.data.multi_guest_play.WallpaperContext;

/* JADX INFO: renamed from: X.01z8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C512401z8 implements Comparator {
    public final int $t;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            case 2:
                return compare$2(this, t, t2);
            case 3:
                return compare$3(this, t, t2);
            case 4:
                return compare$4(this, t, t2);
            case 5:
                return compare$5(this, t, t2);
            case 6:
                return compare$6(this, t, t2);
            case 7:
                return compare$7(this, t, t2);
            case 8:
                return compare$8(this, t, t2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return compare$9(this, t, t2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return compare$10(this, t, t2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return compare$11(this, t, t2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return compare$12(this, t, t2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return compare$13(this, t, t2);
            case 14:
                return compare$14(this, t, t2);
            case 15:
                return compare$15(this, t, t2);
            case 16:
                return compare$16(this, t, t2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return compare$17(this, t, t2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return compare$18(this, t, t2);
            case 19:
                return compare$19(this, t, t2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return compare$20(this, t, t2);
            case 21:
                return compare$21(this, t, t2);
            case 22:
                return compare$22(this, t, t2);
            case 23:
                return compare$23(this, t, t2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return compare$24(this, t, t2);
            case 25:
                return compare$25(this, t, t2);
            case 26:
                return compare$26(this, t, t2);
            case 27:
                return compare$27(this, t, t2);
            case 28:
                return compare$28(this, t, t2);
            case 29:
                return compare$29(this, t, t2);
            case 30:
                return compare$30(this, t, t2);
            case 31:
                return compare$31(this, t, t2);
            case 32:
                return compare$32(this, t, t2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return compare$33(this, t, t2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return compare$34(this, t, t2);
            case 35:
                return compare$35(this, t, t2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return compare$36(this, t, t2);
            case 37:
                return compare$37(this, t, t2);
            case 38:
                return compare$38(this, t, t2);
            case 39:
                return compare$39(this, t, t2);
            case 40:
                return compare$40(this, t, t2);
            case 41:
                return compare$41(this, t, t2);
            case 42:
                return compare$42(this, t, t2);
            case 43:
                return compare$43(this, t, t2);
            case 44:
                return compare$44(this, t, t2);
            case 45:
                return compare$45(this, t, t2);
            case 46:
                return compare$46(this, t, t2);
            case 47:
                return compare$47(this, t, t2);
            case 48:
                return compare$48(this, t, t2);
            case 49:
                return compare$49(this, t, t2);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return compare$50(this, t, t2);
            case 51:
                return compare$51(this, t, t2);
            case 52:
                return compare$52(this, t, t2);
            case 53:
                return compare$53(this, t, t2);
            case 54:
                return compare$54(this, t, t2);
            case 55:
                return compare$55(this, t, t2);
            case 56:
                return compare$56(this, t, t2);
            case 57:
                return compare$57(this, t, t2);
            case 58:
                return compare$58(this, t, t2);
            case 59:
                return compare$59(this, t, t2);
            case 60:
                return compare$60(this, t, t2);
            case 61:
                return compare$61(this, t, t2);
            case BaseNotice.CREATOR /* 62 */:
                return compare$62(this, t, t2);
            case 63:
                return compare$63(this, t, t2);
            case 64:
                return compare$64(this, t, t2);
            case 65:
                return compare$65(this, t, t2);
            case 66:
                return compare$66(this, t, t2);
            case 67:
                return compare$67(this, t, t2);
            case 68:
                return compare$68(this, t, t2);
            case 69:
                return compare$69(this, t, t2);
            case 70:
                return compare$70(this, t, t2);
            case 71:
                return compare$71(this, t, t2);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return compare$72(this, t, t2);
            case 73:
                return compare$73(this, t, t2);
            case 74:
                return compare$74(this, t, t2);
            case 75:
                return compare$75(this, t, t2);
            case 76:
                return compare$76(this, t, t2);
            case 77:
                return compare$77(this, t, t2);
            case 78:
                return compare$78(this, t, t2);
            case 79:
                return compare$79(this, t, t2);
            case 80:
                return compare$80(this, t, t2);
            case 81:
                return compare$81(this, t, t2);
            default:
                return 0;
        }
    }

    public C512401z8(int i) {
        this.$t = i;
    }

    public static final int compare$0(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((GuestShowdownUser) obj).rank), Integer.valueOf(((GuestShowdownUser) obj2).rank));
    }

    public static final int compare$1(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((GuestApplyStillInLineResponse.GuestApplyItem) obj).permitTime), Long.valueOf(((GuestApplyStillInLineResponse.GuestApplyItem) obj2).permitTime));
    }

    public static final int compare$10(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((String) ((Pair) obj).getFirst(), (String) ((Pair) obj2).getFirst());
    }

    public static final int compare$11(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((OgcLynxCache.CacheEntry) obj).serverTimeSec), Long.valueOf(((OgcLynxCache.CacheEntry) obj2).serverTimeSec));
    }

    public static final int compare$12(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Long) ((Pair) obj).getFirst(), (Long) ((Pair) obj2).getFirst());
    }

    public static final int compare$13(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((File) obj).getName(), ((File) obj2).getName());
    }

    public static final int compare$14(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((StoryHighlightAwemePreview) obj).createTime), Long.valueOf(((StoryHighlightAwemePreview) obj2).createTime));
    }

    public static final int compare$15(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((StoryHighlightAwemePreview) obj).createTime), Long.valueOf(((StoryHighlightAwemePreview) obj2).createTime));
    }

    public static final int compare$16(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Pair) obj).getSecond(), (Integer) ((Pair) obj2).getSecond());
    }

    public static final int compare$17(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((String) obj2).length()), Integer.valueOf(((String) obj).length()));
    }

    public static final int compare$18(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Float) ((Pair) obj).getSecond(), (Float) ((Pair) obj2).getSecond());
    }

    public static final int compare$19(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Pair) obj).getSecond(), (Integer) ((Pair) obj2).getSecond());
    }

    public static final int compare$2(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((GuestApplyStillInLineResponse.GuestInvitedItem) obj).inviteTime), Long.valueOf(((GuestApplyStillInLineResponse.GuestInvitedItem) obj2).inviteTime));
    }

    public static final int compare$20(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(CastLongProtector.parseLong((String) obj2)), Long.valueOf(CastLongProtector.parseLong((String) obj)));
    }

    public static final int compare$21(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
    }

    public static final int compare$22(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Comparable) ((Map.Entry) obj2).getValue(), (Comparable) ((Map.Entry) obj).getValue());
    }

    public static final int compare$23(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Float) ((Pair) obj).getSecond(), (Float) ((Pair) obj2).getSecond());
    }

    public static final int compare$24(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Boolean.valueOf(Intrinsics.LJFF(obj, "default")), Boolean.valueOf(Intrinsics.LJFF(obj2, "default")));
    }

    public static final int compare$25(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Boolean.valueOf(!Intrinsics.LJFF(obj, "default")), Boolean.valueOf(!Intrinsics.LJFF(obj2, "default")));
    }

    public static final int compare$26(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Map.Entry) obj).getValue(), (Integer) ((Map.Entry) obj2).getValue());
    }

    public static final int compare$27(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((Number) ((Pair) obj2).getSecond()).longValue()), Long.valueOf(((Number) ((Pair) obj).getSecond()).longValue()));
    }

    public static final int compare$28(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Long) ((Map.Entry) obj2).getValue(), (Long) ((Map.Entry) obj).getValue());
    }

    public static final int compare$29(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((String) ((Pair) obj2).getFirst()).length()), Integer.valueOf(((String) ((Pair) obj).getFirst()).length()));
    }

    public static final int compare$3(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Pair) obj).getSecond(), (Integer) ((Pair) obj2).getSecond());
    }

    public static final int compare$30(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Comparable) ((Pair) obj).getSecond(), (Comparable) ((Pair) obj2).getSecond());
    }

    public static final int compare$31(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((ShowListUser) obj).order), Integer.valueOf(((ShowListUser) obj2).order));
    }

    public static final int compare$32(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((Aweme) obj2).getAid(), ((Aweme) obj).getAid());
    }

    public static final int compare$33(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Map.Entry) obj).getValue(), (Integer) ((Map.Entry) obj2).getValue());
    }

    public static final int compare$34(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Float) ((Pair) obj2).getSecond(), (Float) ((Pair) obj).getSecond());
    }

    public static final int compare$35(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((CountdownForAllUser) obj).rank), Integer.valueOf(((CountdownForAllUser) obj2).rank));
    }

    public static final int compare$36(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((PlayTogetherMember) obj2).acceptTime), Long.valueOf(((PlayTogetherMember) obj).acceptTime));
    }

    public static final int compare$37(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((String) ((Pair) obj).getFirst(), (String) ((Pair) obj2).getFirst());
    }

    public static final int compare$38(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Double) ((Pair) obj2).getSecond(), (Double) ((Pair) obj).getSecond());
    }

    public static final int compare$39(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((JSONObject) obj2).optLong("time_ts", 0L)), Long.valueOf(((JSONObject) obj).optLong("time_ts", 0L)));
    }

    public static final int compare$4(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Double) ((Pair) obj2).getSecond(), (Double) ((Pair) obj).getSecond());
    }

    public static final int compare$40(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((String) ((Pair) obj).getFirst(), (String) ((Pair) obj2).getFirst());
    }

    public static final int compare$41(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((GuestShowdownUser) obj).rank), Integer.valueOf(((GuestShowdownUser) obj2).rank));
    }

    public static final int compare$42(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Float) ((Map.Entry) obj2).getValue(), (Float) ((Map.Entry) obj).getValue());
    }

    public static final int compare$43(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((LinkedUserInfo) obj).linkmicId, ((LinkedUserInfo) obj2).linkmicId);
    }

    public static final int compare$44(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((SeiRegion) obj).uidStr, ((SeiRegion) obj2).uidStr);
    }

    public static final int compare$45(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((LinkedUserInfo) obj).linkmicId, ((LinkedUserInfo) obj2).linkmicId);
    }

    public static final int compare$46(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
    }

    public static final int compare$47(C512401z8 c512401z8, Object obj, Object obj2) {
        Integer numValueOf;
        UserPlayInfo userPlayInfo = ((UserFanTicket) obj).playInfo;
        Integer numValueOf2 = null;
        if (userPlayInfo != null) {
            numValueOf = Integer.valueOf(userPlayInfo.rank);
        } else {
            numValueOf = null;
        }
        UserPlayInfo userPlayInfo2 = ((UserFanTicket) obj2).playInfo;
        if (userPlayInfo2 != null) {
            numValueOf2 = Integer.valueOf(userPlayInfo2.rank);
        }
        return C20085613iQ.LIZIZ(numValueOf, numValueOf2);
    }

    public static final int compare$48(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((UserPlayInfo) ((Pair) obj).getSecond()).rank), Integer.valueOf(((UserPlayInfo) ((Pair) obj2).getSecond()).rank));
    }

    public static final int compare$49(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((GuestShowdownUser) obj).rank), Integer.valueOf(((GuestShowdownUser) obj2).rank));
    }

    public static final int compare$5(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Long) ((Map.Entry) obj).getValue(), (Long) ((Map.Entry) obj2).getValue());
    }

    public static final int compare$50(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Long) ((Map.Entry) obj2).getValue(), (Long) ((Map.Entry) obj).getValue());
    }

    public static final int compare$51(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Pair) obj).getSecond(), (Integer) ((Pair) obj2).getSecond());
    }

    public static final int compare$52(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Pair) obj).getSecond(), (Integer) ((Pair) obj2).getSecond());
    }

    public static final int compare$53(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C440101nT) obj).LJ), Long.valueOf(((C440101nT) obj2).LJ));
    }

    public static final int compare$54(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C440101nT) obj).LJ), Long.valueOf(((C440101nT) obj2).LJ));
    }

    public static final int compare$55(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C440101nT) obj).LJ), Long.valueOf(((C440101nT) obj2).LJ));
    }

    public static final int compare$56(C512401z8 c512401z8, Object obj, Object obj2) {
        double dDoubleValue;
        Double dLJII = C2327809Ae.LJII((String) obj);
        double dDoubleValue2 = 0.0d;
        if (dLJII != null) {
            dDoubleValue = dLJII.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        Double dValueOf = Double.valueOf(dDoubleValue);
        Double dLJII2 = C2327809Ae.LJII((String) obj2);
        if (dLJII2 != null) {
            dDoubleValue2 = dLJII2.doubleValue();
        }
        return C20085613iQ.LIZIZ(dValueOf, Double.valueOf(dDoubleValue2));
    }

    public static final int compare$57(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(C475760IlC.LJFF((Integer) obj)), Integer.valueOf(C475760IlC.LJFF((Integer) obj2)));
    }

    public static final int compare$58(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Comparable) ((Map.Entry) obj).getValue(), (Comparable) ((Map.Entry) obj2).getValue());
    }

    public static final int compare$59(C512401z8 c512401z8, Object obj, Object obj2) {
        int i;
        int i2 = 0;
        if (a0.LJJIIZI((String) obj, "search", false)) {
            i = -1;
        } else {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (a0.LJJIIZI((String) obj2, "search", false)) {
            i2 = -1;
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(i2));
    }

    public static final int compare$6(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((WallpaperContext) obj).wallpaperStartTime), Long.valueOf(((WallpaperContext) obj2).wallpaperStartTime));
    }

    public static final int compare$60(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Pair) obj2).getSecond(), (Integer) ((Pair) obj).getSecond());
    }

    public static final int compare$61(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Map.Entry) obj).getValue(), (Integer) ((Map.Entry) obj2).getValue());
    }

    public static final int compare$62(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((GiftHintInfo) obj).hintShowDelayMs), Long.valueOf(((GiftHintInfo) obj2).hintShowDelayMs));
    }

    public static final int compare$63(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((String) ((Pair) obj).getSecond(), (String) ((Pair) obj2).getSecond());
    }

    public static final int compare$64(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
    }

    public static final int compare$65(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Float) ((Pair) ((Pair) obj).getSecond()).getSecond(), (Float) ((Pair) ((Pair) obj2).getSecond()).getSecond());
    }

    public static final int compare$66(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Float) ((Pair) ((Pair) obj2).getSecond()).getSecond(), (Float) ((Pair) ((Pair) obj).getSecond()).getSecond());
    }

    public static final int compare$67(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Float) ((Pair) ((Pair) obj2).getSecond()).getSecond(), (Float) ((Pair) ((Pair) obj).getSecond()).getSecond());
    }

    public static final int compare$68(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Float) ((Pair) ((Pair) obj2).getSecond()).getSecond(), (Float) ((Pair) ((Pair) obj).getSecond()).getSecond());
    }

    public static final int compare$69(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Float) ((Pair) ((Pair) obj2).getSecond()).getSecond(), (Float) ((Pair) ((Pair) obj).getSecond()).getSecond());
    }

    public static final int compare$7(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((PollOptionInfo) obj2).votes), Long.valueOf(((PollOptionInfo) obj).votes));
    }

    public static final int compare$70(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((HighlightToolbarComInfo) obj).priority), Long.valueOf(((HighlightToolbarComInfo) obj2).priority));
    }

    public static final int compare$71(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((C443120HZe) obj).getFirst(), (Integer) ((C443120HZe) obj2).getFirst());
    }

    public static final int compare$72(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((EmoteModel) obj2).createTime), Long.valueOf(((EmoteModel) obj).createTime));
    }

    public static final int compare$73(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((EmoteModel) obj2).createTime), Long.valueOf(((EmoteModel) obj).createTime));
    }

    public static final int compare$74(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Long) ((C443120HZe) obj).getThird(), (Long) ((C443120HZe) obj2).getThird());
    }

    public static final int compare$75(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
    }

    public static final int compare$76(C512401z8 c512401z8, Object obj, Object obj2) {
        int i;
        int followStatus = ((User) obj).getFollowStatus();
        int i2 = 0;
        if (followStatus != 0) {
            if (followStatus != 1) {
                if (followStatus != 4) {
                    i = 2;
                } else {
                    i = 0;
                }
            } else {
                i = 1;
            }
        } else {
            i = -1;
        }
        Integer numValueOf = Integer.valueOf(i);
        int followStatus2 = ((User) obj2).getFollowStatus();
        if (followStatus2 != 0) {
            if (followStatus2 != 1) {
                if (followStatus2 != 4) {
                    i2 = 2;
                }
            } else {
                i2 = 1;
            }
        } else {
            i2 = -1;
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(i2));
    }

    public static final int compare$77(C512401z8 c512401z8, Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return C20085613iQ.LIZIZ(0, 0);
    }

    public static final int compare$78(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((String) obj).length()), Integer.valueOf(((String) obj2).length()));
    }

    public static final int compare$79(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((String) obj2).length()), Integer.valueOf(((String) obj).length()));
    }

    public static final int compare$8(C512401z8 c512401z8, Object obj, Object obj2) {
        int iIntValue;
        Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) ((Map.Entry) obj).getKey());
        int iIntValue2 = 0;
        if (numLJIIJJI != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numLJIIJJI2 = C2095008Iq.LJIIJJI((String) ((Map.Entry) obj2).getKey());
        if (numLJIIJJI2 != null) {
            iIntValue2 = numLJIIJJI2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$80(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((FlashListItemViewComponentConfig) obj).op), Integer.valueOf(((FlashListItemViewComponentConfig) obj2).op));
    }

    public static final int compare$81(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((FlashListItemViewComponentConfig) obj).op), Integer.valueOf(((FlashListItemViewComponentConfig) obj2).op));
    }

    public static final int compare$9(C512401z8 c512401z8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((List) ((Map.Entry) obj2).getValue()).size()), Integer.valueOf(((List) ((Map.Entry) obj).getValue()).size()));
    }
}
