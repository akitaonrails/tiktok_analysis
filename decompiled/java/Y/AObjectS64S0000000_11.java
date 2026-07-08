package Y;

import X.C005V;
import X.C0RLI;
import X.C2097608Jq;
import X.C702980Rho;
import X.C703170Ri7;
import X.C709450RsF;
import X.InterfaceC2217461Bqa;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.ss.android.ugc.aweme.feed.assem.unreadshare.ShareUnreadVideoQuickDMAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.viewmodel.MessageDraftViewModelImpl;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui.AbsTakoRightBottomEntrance;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui.TakoRightBottomEntranceTrigger;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.videmodel.TakoFeedRightBottomEntranceViewModel;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerAssem;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.aigc.AIGCOverLabelBannerAssem;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AObjectS64S0000000_11 implements Function0 {
    public final int $t;

    public static final Object invoke$0(AObjectS64S0000000_11 aObjectS64S0000000_11) {
        int i = TagLayout.LLILLL;
        return null;
    }

    public static final Object invoke$4(AObjectS64S0000000_11 aObjectS64S0000000_11) {
        return 0L;
    }

    public static final Object invoke$6(AObjectS64S0000000_11 aObjectS64S0000000_11) {
        return 0L;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            default:
                return null;
        }
    }

    public AObjectS64S0000000_11(int i) {
        this.$t = i;
    }

    public static final Object invoke$1(AObjectS64S0000000_11 aObjectS64S0000000_11) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ShareUnreadVideoQuickDMAssem.LLLFF;
        return new MessageDraftViewModelImpl();
    }

    public static final Object invoke$10(AObjectS64S0000000_11 aObjectS64S0000000_11) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoExposeSharerInformationAssem.LLLF;
        return new MessageDraftViewModelImpl();
    }

    public static final Object invoke$11(AObjectS64S0000000_11 aObjectS64S0000000_11) {
        C0RLI c0rli = FeedAvatarDefaultAssem.LLLJIL;
        return new MessageDraftViewModelImpl();
    }

    public static final Object invoke$2(AObjectS64S0000000_11 aObjectS64S0000000_11) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = FeedCommonBannerAssem.LLLFF;
        return new TakoFeedRightBottomEntranceViewModel();
    }

    public static final Object invoke$3(AObjectS64S0000000_11 aObjectS64S0000000_11) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = AIGCOverLabelBannerAssem.LLLFF;
        return new TakoFeedRightBottomEntranceViewModel();
    }

    public static final Object invoke$5(AObjectS64S0000000_11 aObjectS64S0000000_11) {
        return C702980Rho.LIZIZ(new C005V("interaction_root_container", C2097608Jq.LJIIIIZZ(new Pair("interaction_root_container", C703170Ri7.LIZ), new Pair("left_container", C703170Ri7.LIZIZ))));
    }

    public static final Object invoke$7(AObjectS64S0000000_11 aObjectS64S0000000_11) {
        return new ArrayList();
    }

    public static final Object invoke$8(AObjectS64S0000000_11 aObjectS64S0000000_11) {
        C709450RsF c709450RsF = AbsTakoRightBottomEntrance.LLL;
        return new TakoFeedRightBottomEntranceViewModel();
    }

    public static final Object invoke$9(AObjectS64S0000000_11 aObjectS64S0000000_11) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TakoRightBottomEntranceTrigger.LLJLILLLLZIIL;
        return new TakoFeedRightBottomEntranceViewModel();
    }

    public AObjectS64S0000000_11(FeedAvatarDefaultAssem feedAvatarDefaultAssem, int i) {
        this.$t = i;
    }

    public AObjectS64S0000000_11(VideoExposeSharerInformationAssem videoExposeSharerInformationAssem, int i) {
        this.$t = i;
    }

    public AObjectS64S0000000_11(ShareUnreadVideoQuickDMAssem shareUnreadVideoQuickDMAssem, int i) {
        this.$t = i;
    }

    public AObjectS64S0000000_11(AbsTakoRightBottomEntrance absTakoRightBottomEntrance, int i) {
        this.$t = i;
    }

    public AObjectS64S0000000_11(TakoRightBottomEntranceTrigger takoRightBottomEntranceTrigger, int i) {
        this.$t = i;
    }

    public AObjectS64S0000000_11(FeedCommonBannerAssem feedCommonBannerAssem, int i) {
        this.$t = i;
    }

    public AObjectS64S0000000_11(AIGCOverLabelBannerAssem aIGCOverLabelBannerAssem, int i) {
        this.$t = i;
    }
}
