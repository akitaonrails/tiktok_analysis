package Y;

import X.C1239450iMJ;
import X.C1551940qUK;
import X.C1BCA;
import X.C2184781Aey;
import X.C2184901AfA;
import X.C2188381Akm;
import X.C797990VSb;
import X.C821000WIo;
import X.InterfaceC2188371Akl;
import X.InterfaceC2217461Bqa;
import com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxAssem;
import com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxAssemV2;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.actionbar.viewmodel.ActionBarViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.viewmodel.MessageDraftViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.CommonChatDepAssem;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.live.LiveBroadcastActivity;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellFeaturedVideosIconAssem;
import com.ss.android.ugc.aweme.music.search.cell.SearchMusicCellFeaturedVideoIconAssem;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.camera.record.TakoRecordCoreViewModel;
import com.ss.android.ugc.aweme.tako.camera.record.pageui.TakoSurfaceCoreAssem;
import com.ss.android.ugc.aweme.viewmodel.TypingRecommendationVM;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public class AObjectS80S0000000_33 implements Function0 {
    public final int $t;

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            default:
                return null;
        }
    }

    public AObjectS80S0000000_33(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS80S0000000_33 aObjectS80S0000000_33) {
        return new C821000WIo();
    }

    public static final Object invoke$1(AObjectS80S0000000_33 aObjectS80S0000000_33) {
        C2188381Akm.LIZ.getClass();
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        c1551940qUK.LJIILLIIL("occasion_high_priority");
        c1551940qUK.LJIILLIIL("occasion_normal");
        return null;
    }

    public static final Object invoke$10(AObjectS80S0000000_33 aObjectS80S0000000_33) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SearchMusicCellFeaturedVideoIconAssem.LLJLLIL;
        return new MusicPlayViewModel();
    }

    public static final Object invoke$11(AObjectS80S0000000_33 aObjectS80S0000000_33) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MUFQuickDMBoxAssem.LLLIIL;
        return new MessageDraftViewModelImpl();
    }

    public static final Object invoke$12(AObjectS80S0000000_33 aObjectS80S0000000_33) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MUFQuickDMBoxAssemV2.LLLI;
        return new MessageDraftViewModelImpl();
    }

    public static final Object invoke$13(AObjectS80S0000000_33 aObjectS80S0000000_33) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicCellFeaturedVideosIconAssem.LLJLLL;
        return new MusicPlayViewModel();
    }

    public static final Object invoke$2(AObjectS80S0000000_33 aObjectS80S0000000_33) {
        InterfaceC2188371Akl heavyJobControlService;
        C2188381Akm.LIZ.getClass();
        IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class);
        if (iIMService != null && (heavyJobControlService = iIMService.getHeavyJobControlService()) != null) {
            heavyJobControlService.LIZ();
            return null;
        }
        return null;
    }

    public static final Object invoke$3(AObjectS80S0000000_33 aObjectS80S0000000_33) {
        C2188381Akm.LIZ.getClass();
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        c1551940qUK.LIZ("occasion_high_priority");
        c1551940qUK.LIZ("occasion_normal");
        return null;
    }

    public static final Object invoke$4(AObjectS80S0000000_33 aObjectS80S0000000_33) {
        InterfaceC2188371Akl heavyJobControlService;
        C2188381Akm.LIZ.getClass();
        IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class);
        if (iIMService != null && (heavyJobControlService = iIMService.getHeavyJobControlService()) != null) {
            heavyJobControlService.LIZIZ();
            return null;
        }
        return null;
    }

    public static final Object invoke$5(AObjectS80S0000000_33 aObjectS80S0000000_33) {
        String str = LiveBroadcastActivity._pnsPageId;
        return new C1239450iMJ();
    }

    public static final Object invoke$6(AObjectS80S0000000_33 aObjectS80S0000000_33) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TakoSurfaceCoreAssem.LLILZ;
        return new TakoRecordCoreViewModel();
    }

    public static final Object invoke$7(AObjectS80S0000000_33 aObjectS80S0000000_33) {
        C1BCA.LJJIIZI((C2184901AfA) C2184781Aey.LJFF.getValue());
        return null;
    }

    public static final Object invoke$8(AObjectS80S0000000_33 aObjectS80S0000000_33) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommonChatDepAssem.LLJILJIL;
        return new ActionBarViewModelImpl();
    }

    public static final Object invoke$9(AObjectS80S0000000_33 aObjectS80S0000000_33) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommonChatDepAssem.LLJILJIL;
        return new TypingRecommendationVM();
    }

    public AObjectS80S0000000_33(MUFQuickDMBoxAssem mUFQuickDMBoxAssem, int i) {
        this.$t = i;
    }

    public AObjectS80S0000000_33(MUFQuickDMBoxAssemV2 mUFQuickDMBoxAssemV2, int i) {
        this.$t = i;
    }

    public AObjectS80S0000000_33(CommonChatDepAssem commonChatDepAssem, int i) {
        this.$t = i;
    }

    public AObjectS80S0000000_33(MusicCellFeaturedVideosIconAssem musicCellFeaturedVideosIconAssem, int i) {
        this.$t = i;
    }

    public AObjectS80S0000000_33(SearchMusicCellFeaturedVideoIconAssem searchMusicCellFeaturedVideoIconAssem, int i) {
        this.$t = i;
    }

    public AObjectS80S0000000_33(TakoSurfaceCoreAssem takoSurfaceCoreAssem, int i) {
        this.$t = i;
    }
}
