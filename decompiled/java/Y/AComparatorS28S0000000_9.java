package Y;

import X.C0N9K;
import X.C0NCB;
import X.C0NCD;
import X.C0NYK;
import X.C0OJT;
import X.C1249580ice;
import X.C1562980qm8;
import X.C20085613iQ;
import X.C443120HZe;
import X.C607840Nsk;
import X.C611000Nxq;
import X.C621500OZg;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinEmojiItem;
import com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoicePlayedStore;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.vibefeed.clientai.cache.VibeIntentScoreIndex;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class AComparatorS28S0000000_9 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS28S0000000_9(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C0NCB) obj).LIZ), Integer.valueOf(((C0NCB) obj2).LIZ));
    }

    public static final int compare$1(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Boolean) ((Pair) obj2).getSecond(), (Boolean) ((Pair) obj).getSecond());
    }

    public static final int compare$10(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return ((Integer) ((android.util.Pair) obj2).second).intValue() - ((Integer) ((android.util.Pair) obj).second).intValue();
    }

    public static final int compare$11(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        long j;
        MusicReleaseInfo musicReleaseInfo;
        MusicReleaseInfo musicReleaseInfo2;
        Music sourceMusic = ((MusicGroup) obj2).getSourceMusic();
        long j2 = 0;
        if (sourceMusic != null && (musicReleaseInfo2 = sourceMusic.getMusicReleaseInfo()) != null) {
            j = musicReleaseInfo2.groupReleaseDate;
        } else {
            j = 0;
        }
        Long lValueOf = Long.valueOf(j);
        Music sourceMusic2 = ((MusicGroup) obj).getSourceMusic();
        if (sourceMusic2 != null && (musicReleaseInfo = sourceMusic2.getMusicReleaseInfo()) != null) {
            j2 = musicReleaseInfo.groupReleaseDate;
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(j2));
    }

    public static final int compare$12(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1249580ice) obj2).LLIZ), Integer.valueOf(((C1249580ice) obj).LLIZ));
    }

    public static final int compare$13(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1249580ice) obj2).LLIZ), Integer.valueOf(((C1249580ice) obj).LLIZ));
    }

    public static final int compare$14(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C611000Nxq) obj).LIZJ), Long.valueOf(((C611000Nxq) obj2).LIZJ));
    }

    public static final int compare$15(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C621500OZg) obj).LLILZIL), Integer.valueOf(((C621500OZg) obj2).LLILZIL));
    }

    public static final int compare$16(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Comparable) ((Map.Entry) obj).getKey(), (Comparable) ((Map.Entry) obj2).getKey());
    }

    public static final int compare$17(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((VibeIntentScoreIndex.IndexItem) obj).timestamp), Long.valueOf(((VibeIntentScoreIndex.IndexItem) obj2).timestamp));
    }

    public static final int compare$18(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Float.valueOf(((C0NCD) obj).LIZ), Float.valueOf(((C0NCD) obj2).LIZ));
    }

    public static final int compare$19(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((BulletinVoicePlayedStore.Entry) obj).updatedAt), Long.valueOf(((BulletinVoicePlayedStore.Entry) obj2).updatedAt));
    }

    public static final int compare$2(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return ((Integer) ((android.util.Pair) obj2).second).intValue() - ((Integer) ((android.util.Pair) obj).second).intValue();
    }

    public static final int compare$20(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C0OJT) obj2).LIZIZ), Long.valueOf(((C0OJT) obj).LIZIZ));
    }

    public static final int compare$21(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C0NYK) ((Map.Entry) obj2).getValue()).LJIIJ.size()), Integer.valueOf(((C0NYK) ((Map.Entry) obj).getValue()).LJIIJ.size()));
    }

    public static final int compare$22(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((OAuthScope) obj).scopeRequired, ((OAuthScope) obj2).scopeRequired);
    }

    public static final int compare$23(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1562980qm8) obj).LIZIZ.ordinal()), Integer.valueOf(((C1562980qm8) obj2).LIZIZ.ordinal()));
    }

    public static final int compare$24(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C607840Nsk) obj2).LIZIZ), Integer.valueOf(((C607840Nsk) obj).LIZIZ));
    }

    public static final int compare$25(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
    }

    public static final int compare$26(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
    }

    public static final int compare$27(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
    }

    public static final int compare$28(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
    }

    public static final int compare$29(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((IMUser) obj2).getFollowTime()), Long.valueOf(((IMUser) obj).getFollowTime()));
    }

    public static final int compare$3(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((Number) obj).intValue()), Integer.valueOf(((Number) obj2).intValue()));
    }

    public static final int compare$30(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Double) ((C443120HZe) obj2).getThird(), (Double) ((C443120HZe) obj).getThird());
    }

    public static final int compare$31(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Double) ((C443120HZe) obj).getThird(), (Double) ((C443120HZe) obj2).getThird());
    }

    public static final int compare$32(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Double) ((C443120HZe) obj2).getSecond(), (Double) ((C443120HZe) obj).getSecond());
    }

    public static final int compare$33(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        Boolean bool = ((OAuthScope) obj).scopeRequired;
        Boolean bool2 = Boolean.FALSE;
        return C20085613iQ.LIZIZ(Boolean.valueOf(!Intrinsics.LJFF(bool, bool2)), Boolean.valueOf(!Intrinsics.LJFF(((OAuthScope) obj2).scopeRequired, bool2)));
    }

    public static final int compare$4(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        C0N9K c0n9k = (C0N9K) obj2;
        C0N9K c0n9k2 = (C0N9K) obj;
        return C20085613iQ.LIZIZ(Long.valueOf(c0n9k.LIZIZ - c0n9k.LIZ), Long.valueOf(c0n9k2.LIZIZ - c0n9k2.LIZ));
    }

    public static final int compare$5(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Double.valueOf(((FollowFeed) obj2).getScore()), Double.valueOf(((FollowFeed) obj).getScore()));
    }

    public static final int compare$6(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((BulletinEmojiItem) obj).LLILLJJLI), Integer.valueOf(((BulletinEmojiItem) obj2).LLILLJJLI));
    }

    public static final int compare$7(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((BulletinBaseItem) obj).LJIIZILJ()), Long.valueOf(((BulletinBaseItem) obj2).LJIIZILJ()));
    }

    public static final int compare$8(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((BulletinBaseItem) obj2).LJIIZILJ()), Long.valueOf(((BulletinBaseItem) obj).LJIIZILJ()));
    }

    public static final int compare$9(AComparatorS28S0000000_9 aComparatorS28S0000000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((View) obj2).getBottom()), Integer.valueOf(((View) obj).getBottom()));
    }
}
