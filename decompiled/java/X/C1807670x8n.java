package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Layout;
import android.util.LruCache;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.WalletRechargeService;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.data.api.IRechargeApi;
import com.bytedance.android.live.wallet.data.api.IWalletApi;
import com.bytedance.android.live.walletclean.presentation.assem.header.viewmodel.RechargePanelHeaderViewModel;
import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.o;
import com.ss.android.ugc.aweme.effects.aigroupshot.selecttemplate.TemplateSelectionViewModelImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.callroom.platform.RTCMediaAdapter;
import com.ss.android.ugc.aweme.im.callroom.viewmodel.CallViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeRecordModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMGameCameraInfo;
import com.ss.android.ugc.aweme.im.creative.record.impl.framework.IMRecordFragment;
import com.ss.android.ugc.aweme.im.creative.record.impl.playground.IMRecordPlaygroundVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.cover.IMRecordSpecChangeVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.beauty.IMRecordBeautyPanelViewModel;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.button.IMRecordButtonViewModel;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.controller.gesture.IMRecordGestureVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.dock.album.IMRecordAlbumEntranceVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.dock.album.IMRecordAlbumPanelVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.dock.effect.IMRecordEffectEntranceVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.dock.effect.IMRecordEffectsPanelVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.dock.effect.discover.IMEffectDiscoverVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.dock.effect.effectcarousel.IMFullWidthEffectCarouselVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.dock.effect.effectcarousel.bottomfunc.IMFullWidthCarouselBottomVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.dock.effect.effectcarousel.prefetcher.IMEffectPrefetcherProvider;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.dock.effect.effectcarousel.stickerbar.IMEffectBarWidgetVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.title.IMRecordTitleVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.tns.IMRecordTnsVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.tools.beauty.logic.IMRecordBeautyToolVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.tools.beauty.logic.IMRecordGameBeautyVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.tools.beauty.logic.IMRecordOneClickBeautyVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.tools.filter.IMFilterPanelVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.tools.filter.IMFilterToolVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.tools.flash.IMFrontFlashPanelVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.tools.flash.IMRecordFlashToolVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.tools.flip.IMRecordSwitchToolVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.def.tools.toolsbar.IMRecordToolbarVM;
import com.ss.android.ugc.aweme.im.creative.record.impl.record.game.player.controller.GamePlayControllerVM;
import com.ss.android.ugc.aweme.im.messagelist.perf.MessageListCLSTracker;
import com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel.MessageListOperatorVM;
import com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel.SocialIMSDKMessageListOperatorVM;
import com.ss.android.ugc.aweme.im.perf.cls.EmptyMessageListCLSTrackerImpl;
import com.ss.android.ugc.aweme.im.perf.cls.MessageListCLSTrackerImpl;
import com.ss.android.ugc.aweme.im.perf.fmp.IMMessageListFMPTrackerImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.IGroupMediaVMFactory;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.ISingleMediaVMFactory;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.GroupMediaGridViewModel;
import com.ss.android.ugc.aweme.im.sticker.df.stickerstore.favsticker.RecentStickersCache;
import com.ss.android.ugc.aweme.record.def.controller.IMRecordCoreViewModel;
import com.ss.android.ugc.aweme.search.pages.result.aigc.protocol.Top1AnswerAIGCCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.newwholepagesurvey.firstlevel.SearchWholePageSurveyCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.satisfactionsurvey.core.ui.SearchSatisfactionSurveyPhotoProtocol;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.usefulness.core.ui.SearchSatisfactionSurveyCard;
import com.ss.android.ugc.aweme.search.pages.result.nimble.SearchNimbleCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.nimble.SearchNimbleMixRankCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.nimble.Top1SimpleCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.pov.SearchOnlineCardLoadingOptProtocol;
import com.ss.android.ugc.aweme.search.pages.result.pov.SearchOnlinePovCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.pov.SearchPovCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.pov.Top1OnlineStreamingCardLoadingOptProtocol;
import com.ss.android.ugc.aweme.search.pages.result.pov.Top1OnlineStreamingCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.expand.Top1AnswerExpandCardProtocol;
import com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.tabs.aicard.VisualSearchAiCardProtocol;
import com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.tabs.generaltab.tryon.VisualSearchTryOnCardProtocol;
import com.ss.android.ugc.aweme.search.pages.visualsearch.smartsearch.resultpage.findsimilar.info.FindSimilarDetailsInfoEmptyProtocol;
import com.ss.android.ugc.aweme.search.pages.visualsearch.smartsearch.resultpage.findsimilar.info.FindSimilarDetailsInfoLoadingProtocol;
import com.ss.android.ugc.aweme.search.pages.visualsearch.smartsearch.resultpage.findsimilar.info.FindSimilarDetailsInfoSuccessProtocol;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContainerVM;
import com.ss.android.ugc.tools.chat.input.model.ActionBarButtonConfBusiness;
import detailpage.vm.SingleMediaGridViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807670x8n {
    public static final C1807670x8n LIZ = new C1807670x8n();
    public static volatile C862840Xt4 LIZIZ;
    public static volatile C875090YUp LIZJ;
    public static volatile C1809320xBS LIZLLL;
    public static volatile C0YUW LJ;
    public static volatile C1094290eaB LJFF;
    public static volatile C1786080wZy LJI;
    public static volatile C1785440wYw LJII;
    public static volatile C1785800wZW LJIIIIZZ;
    public static volatile C1785350wYn LJIIIZ;
    public static volatile C1785860wZc LJIIJ;
    public static volatile C1777200wLe LJIIJJI;
    public static volatile C1785340wYm LJIIL;
    public static volatile C1785810wZX LJIILIIL;
    public static volatile C1158180gFE LJIILJJIL;
    public static volatile C1777950wMr LJIILL;
    public static volatile C1785360wYo LJIILLIIL;
    public static volatile C1785600wZC LJIIZILJ;
    public static volatile C1781130wRz LJIJ;
    public static volatile C1785820wZY LJIJI;
    public static volatile C1781060wRs LJIJJ;
    public static volatile C1785830wZZ LJIJJLI;
    public static volatile C1804610x3r LJIL;
    public static volatile C0YM9 LJJ;
    public static volatile C0YHV LJJI;
    public static volatile C2214241BlO LJJIFFI;
    public static volatile C0XJN LJJII;
    public static volatile C452610Hox LJJIII;
    public static volatile C1807730x8t LJJIIJ;
    public static volatile C1600980rlQ LJJIIJZLJL;
    public static volatile C584800Mwg LJJIIZ;
    public static volatile C1019570cdf LJJIIZI;
    public static volatile C1048080dNe LJJIJ;
    public static volatile C581800Mrq LJJIJIIJI;
    public static volatile C1055340dZM LJJIJIIJIL;
    public static volatile C0DYT LJJIJIL;
    public static volatile C1003530cDn LJJIJL;
    public static volatile C1011220cQC LJJIJLIJ;
    public static volatile C1048100dNg LJJIL;
    public static volatile C1808100x9U LJJIZ;
    public static volatile C1808110x9V LJJJ;
    public static volatile C452540Hoq LJJJI;
    public static volatile C452530Hop LJJJIL;
    public static volatile C2452609jI LJJJJ;
    public static volatile C1053550dWT LJJJJI;
    public static volatile C1053730dWl LJJJJIZL;
    public static volatile C2452409jG LJJJJJ;
    public static volatile C1053740dWm LJJJJJL;
    public static volatile C1053650dWd LJJJJL;
    public static volatile C901740ZZc LJJJJLI;
    public static volatile C898570ZMx LJJJJLL;
    public static volatile Object LJJJJZ;
    public static volatile Object LJJJJZI;
    public static volatile Object LJJJLIIL;
    public static volatile C1BGS LJJJLL;
    public static volatile Object LJJJLZIJ;
    public static volatile C1807780x8y LJJJZ;
    public static volatile C904750ZeT LJJL;
    public static volatile C1807750x8v LJJLI;
    public static volatile C905110Zf3 LJJLIIIIJ;
    public static volatile C21512719Gz LJJLIIIJ;
    public static volatile C19H0 LJJLIIIJILLIZJL;
    public static volatile C1807710x8r LJJLIIIJJI;
    public static volatile C2194108ih LJJLIIIJJIZ;
    public static volatile C19H1 LJJLIIIJL;
    public static volatile C1598406Nq LJJLIIIJLJLI;
    public static volatile C1761006v2 LJJLIIIJLLLLLLLZ;
    public static volatile C1756306uH LJJLIIJ;
    public static volatile C1807760x8w LJJLIL;
    public static volatile C1807770x8x LJJLJ;
    public static volatile C1808210x9f LJJLJLI;
    public static volatile C15607069d LJJLL;
    public static volatile C904360Zdq LJJZ;
    public static volatile C1607330rvf LJJZZI;
    public static volatile C0ZSZ LJJZZIII;
    public static volatile C1808790xAb LJL;
    public static volatile C450300HlE LJLI;
    public static volatile C1839970xyt LJLIIIL;
    public static volatile C1ETJ LJLIIL;
    public static volatile C1808690xAR LJLIL;
    public static volatile C1808630xAL LJLILLLLZI;
    public static volatile C1808740xAW LJLJI;
    public static volatile C1808710xAT LJLJJI;
    public static volatile C450160Hl0 LJLJJL;
    public static volatile C450100Hku LJLJJLL;
    public static volatile C1834340xpo LJLJL;
    public static volatile Object LJLJLJ;
    public static volatile Object LJLJLLL;
    public static volatile Object LJLL;
    public static volatile C0YVE LJLLI;
    public static volatile C906660ZhY LJLLILLLL;
    public static volatile C906700Zhc LJLLJ;
    public static volatile C688320QzG LJLLL;
    public static volatile C0SKH LJLLLL;
    public static volatile C452680Hp4 LJLLLLLL;
    public static volatile C09U0 LJLZ;
    public static volatile C12856051i LJZ;
    public static volatile C1888480zF8 LJZI;
    public static volatile C1888500zFA LJZL;
    public static volatile C904350Zdp LL;

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0Xt4, java.lang.Object] */
    public static Object LIZ() {
        C862840Xt4 c862840Xt4 = LIZIZ;
        if (c862840Xt4 == null) {
            synchronized (C862840Xt4.class) {
                try {
                    c862840Xt4 = LIZIZ;
                    if (c862840Xt4 == null) {
                        ?? r1 = new InterfaceC862830Xt3() { // from class: X.0Xt4
                            public final Map<C861890XrX, C1785380wYq> LIZ = new LinkedHashMap();

                            @Override // X.InterfaceC862830Xt3
                            public final void clearAll() {
                                C20441214yg.LIZIZ("LocalCreatorRankingPageDataSourceImpl", "clearAll");
                                ((LinkedHashMap) this.LIZ).clear();
                            }

                            @Override // X.InterfaceC862830Xt3
                            public final C1785380wYq LIZ(C861890XrX c861890XrX) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("get, key=");
                                sbLIZ.append(c861890XrX);
                                C20441214yg.LIZIZ("LocalCreatorRankingPageDataSourceImpl", C2188811AlT.LIZIZ(sbLIZ));
                                return (C1785380wYq) ((LinkedHashMap) this.LIZ).get(c861890XrX);
                            }

                            @Override // X.InterfaceC862830Xt3
                            public final void LIZIZ(C861890XrX c861890XrX, C1785380wYq c1785380wYq) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("put, key=");
                                sbLIZ.append(c861890XrX);
                                C20441214yg.LIZIZ("LocalCreatorRankingPageDataSourceImpl", C2188811AlT.LIZIZ(sbLIZ));
                                this.LIZ.put(c861890XrX, c1785380wYq);
                            }
                        };
                        LIZIZ = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c862840Xt4;
    }

    public static Object LIZIZ() {
        C875090YUp c875090YUp = LIZJ;
        if (c875090YUp == null) {
            synchronized (C875090YUp.class) {
                try {
                    c875090YUp = LIZJ;
                    if (c875090YUp == null) {
                        C875090YUp c875090YUp2 = new C875090YUp();
                        LIZJ = c875090YUp2;
                        return c875090YUp2;
                    }
                } finally {
                }
            }
        }
        return c875090YUp;
    }

    public static Object LIZJ() {
        C1809320xBS c1809320xBS = LIZLLL;
        if (c1809320xBS == null) {
            synchronized (C1809320xBS.class) {
                try {
                    c1809320xBS = LIZLLL;
                    if (c1809320xBS == null) {
                        C1809320xBS c1809320xBS2 = new C1809320xBS();
                        LIZLLL = c1809320xBS2;
                        return c1809320xBS2;
                    }
                } finally {
                }
            }
        }
        return c1809320xBS;
    }

    public static Object LIZLLL(C862840Xt4 c862840Xt4, C875090YUp c875090YUp, C1809320xBS c1809320xBS) {
        C0YUW c0yuw = LJ;
        if (c0yuw == null) {
            synchronized (C0YUW.class) {
                try {
                    c0yuw = LJ;
                    if (c0yuw == null) {
                        C0YUW c0yuw2 = new C0YUW(c862840Xt4, c875090YUp, c1809320xBS);
                        LJ = c0yuw2;
                        return c0yuw2;
                    }
                } finally {
                }
            }
        }
        return c0yuw;
    }

    public static Object LJ() {
        C1094290eaB c1094290eaB = LJFF;
        if (c1094290eaB == null) {
            synchronized (C1094290eaB.class) {
                try {
                    c1094290eaB = LJFF;
                    if (c1094290eaB == null) {
                        C1094290eaB c1094290eaB2 = new C1094290eaB();
                        LJFF = c1094290eaB2;
                        return c1094290eaB2;
                    }
                } finally {
                }
            }
        }
        return c1094290eaB;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0wZy, java.lang.Object] */
    public static Object LJFF() {
        C1786080wZy c1786080wZy = LJI;
        if (c1786080wZy == null) {
            synchronized (C1786080wZy.class) {
                try {
                    c1786080wZy = LJI;
                    if (c1786080wZy == null) {
                        ?? r1 = new Object() { // from class: X.0wZy
                        };
                        LJI = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c1786080wZy;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0wYw, java.lang.Object] */
    public static Object LJI() {
        C1785440wYw c1785440wYw = LJII;
        if (c1785440wYw == null) {
            synchronized (C1785440wYw.class) {
                try {
                    c1785440wYw = LJII;
                    if (c1785440wYw == null) {
                        ?? r1 = new Object() { // from class: X.0wYw
                        };
                        LJII = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c1785440wYw;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0wZW, java.lang.Object] */
    public static Object LJII() {
        C1785800wZW c1785800wZW = LJIIIIZZ;
        if (c1785800wZW == null) {
            synchronized (C1785800wZW.class) {
                try {
                    c1785800wZW = LJIIIIZZ;
                    if (c1785800wZW == null) {
                        ?? r1 = new Object() { // from class: X.0wZW
                        };
                        LJIIIIZZ = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c1785800wZW;
    }

    public static Object LJIIIIZZ(C0YUW c0yuw, C1094290eaB c1094290eaB, C1785440wYw c1785440wYw) {
        C1785350wYn c1785350wYn = LJIIIZ;
        if (c1785350wYn == null) {
            synchronized (C1785350wYn.class) {
                try {
                    c1785350wYn = LJIIIZ;
                    if (c1785350wYn == null) {
                        C1785350wYn c1785350wYn2 = new C1785350wYn(c0yuw, c1094290eaB, c1785440wYw);
                        LJIIIZ = c1785350wYn2;
                        return c1785350wYn2;
                    }
                } finally {
                }
            }
        }
        return c1785350wYn;
    }

    public static Object LJIIIZ() {
        C1785860wZc c1785860wZc = LJIIJ;
        if (c1785860wZc == null) {
            synchronized (C1785860wZc.class) {
                try {
                    c1785860wZc = LJIIJ;
                    if (c1785860wZc == null) {
                        C1785860wZc c1785860wZc2 = new C1785860wZc();
                        LJIIJ = c1785860wZc2;
                        return c1785860wZc2;
                    }
                } finally {
                }
            }
        }
        return c1785860wZc;
    }

    public static Object LJIIJ() {
        C1777200wLe c1777200wLe = LJIIJJI;
        if (c1777200wLe == null) {
            synchronized (C1777200wLe.class) {
                try {
                    c1777200wLe = LJIIJJI;
                    if (c1777200wLe == null) {
                        C1777200wLe c1777200wLe2 = new C1777200wLe();
                        LJIIJJI = c1777200wLe2;
                        return c1777200wLe2;
                    }
                } finally {
                }
            }
        }
        return c1777200wLe;
    }

    public static Object LJIIJJI() {
        C1785340wYm c1785340wYm = LJIIL;
        if (c1785340wYm == null) {
            synchronized (C1785340wYm.class) {
                try {
                    c1785340wYm = LJIIL;
                    if (c1785340wYm == null) {
                        C1785340wYm c1785340wYm2 = new C1785340wYm();
                        LJIIL = c1785340wYm2;
                        return c1785340wYm2;
                    }
                } finally {
                }
            }
        }
        return c1785340wYm;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0wZX, java.lang.Object] */
    public static Object LJIIL() {
        C1785810wZX c1785810wZX = LJIILIIL;
        if (c1785810wZX == null) {
            synchronized (C1785810wZX.class) {
                try {
                    c1785810wZX = LJIILIIL;
                    if (c1785810wZX == null) {
                        ?? r1 = new Object() { // from class: X.0wZX
                        };
                        LJIILIIL = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c1785810wZX;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0gFE, java.lang.Object] */
    public static Object LJIILIIL() {
        C1158180gFE c1158180gFE = LJIILJJIL;
        if (c1158180gFE == null) {
            synchronized (C1158180gFE.class) {
                try {
                    c1158180gFE = LJIILJJIL;
                    if (c1158180gFE == null) {
                        ?? r1 = new Object() { // from class: X.0gFE
                        };
                        LJIILJJIL = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c1158180gFE;
    }

    public static Object LJIILJJIL() {
        C1777950wMr c1777950wMr = LJIILL;
        if (c1777950wMr == null) {
            synchronized (C1777950wMr.class) {
                try {
                    c1777950wMr = LJIILL;
                    if (c1777950wMr == null) {
                        C1777950wMr c1777950wMr2 = new C1777950wMr();
                        LJIILL = c1777950wMr2;
                        return c1777950wMr2;
                    }
                } finally {
                }
            }
        }
        return c1777950wMr;
    }

    public static Object LJIILL(C1785860wZc c1785860wZc, C1777950wMr c1777950wMr) {
        C1785360wYo c1785360wYo = LJIILLIIL;
        if (c1785360wYo == null) {
            synchronized (C1785360wYo.class) {
                try {
                    c1785360wYo = LJIILLIIL;
                    if (c1785360wYo == null) {
                        C1785360wYo c1785360wYo2 = new C1785360wYo(c1785860wZc, c1777950wMr);
                        LJIILLIIL = c1785360wYo2;
                        return c1785360wYo2;
                    }
                } finally {
                }
            }
        }
        return c1785360wYo;
    }

    public static Object LJIILLIIL(C1781060wRs c1781060wRs, C1785830wZZ c1785830wZZ, C1785820wZY c1785820wZY) {
        C1785600wZC c1785600wZC = LJIIZILJ;
        if (c1785600wZC == null) {
            synchronized (C1785600wZC.class) {
                try {
                    c1785600wZC = LJIIZILJ;
                    if (c1785600wZC == null) {
                        C1785600wZC c1785600wZC2 = new C1785600wZC(c1781060wRs, c1785830wZZ, c1785820wZY);
                        LJIIZILJ = c1785600wZC2;
                        return c1785600wZC2;
                    }
                } finally {
                }
            }
        }
        return c1785600wZC;
    }

    public static Object LJIIZILJ(C1785600wZC c1785600wZC, C1785360wYo c1785360wYo, C1781060wRs c1781060wRs, C1158180gFE c1158180gFE) {
        C1781130wRz c1781130wRz = LJIJ;
        if (c1781130wRz == null) {
            synchronized (C1781130wRz.class) {
                try {
                    c1781130wRz = LJIJ;
                    if (c1781130wRz == null) {
                        C1781130wRz c1781130wRz2 = new C1781130wRz(c1785600wZC, c1785360wYo, c1781060wRs, c1158180gFE);
                        LJIJ = c1781130wRz2;
                        return c1781130wRz2;
                    }
                } finally {
                }
            }
        }
        return c1781130wRz;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0wZY, java.lang.Object] */
    public static Object LJIJ() {
        C1785820wZY c1785820wZY = LJIJI;
        if (c1785820wZY == null) {
            synchronized (C1785820wZY.class) {
                try {
                    c1785820wZY = LJIJI;
                    if (c1785820wZY == null) {
                        ?? r1 = new Object() { // from class: X.0wZY
                        };
                        LJIJI = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c1785820wZY;
    }

    public static Object LJIJI() {
        C1781060wRs c1781060wRs = LJIJJ;
        if (c1781060wRs == null) {
            synchronized (C1781060wRs.class) {
                try {
                    c1781060wRs = LJIJJ;
                    if (c1781060wRs == null) {
                        C1781060wRs c1781060wRs2 = new C1781060wRs();
                        LJIJJ = c1781060wRs2;
                        return c1781060wRs2;
                    }
                } finally {
                }
            }
        }
        return c1781060wRs;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0wZZ, java.lang.Object] */
    public static Object LJIJJ() {
        C1785830wZZ c1785830wZZ = LJIJJLI;
        if (c1785830wZZ == null) {
            synchronized (C1785830wZZ.class) {
                try {
                    c1785830wZZ = LJIJJLI;
                    if (c1785830wZZ == null) {
                        ?? r1 = new Object() { // from class: X.0wZZ
                        };
                        LJIJJLI = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c1785830wZZ;
    }

    public static C1804310x3N LJJIFFI(C1804410x3X c1804410x3X, C1804340x3Q c1804340x3Q, C1804330x3P c1804330x3P, C1796830wrJ c1796830wrJ, C1804220x3E c1804220x3E, C1804590x3p c1804590x3p, C1807890x99 c1807890x99, C1803570x2B c1803570x2B) {
        return new C1804310x3N(c1804410x3X, c1804340x3Q, c1804330x3P, c1796830wrJ, c1804220x3E, c1804590x3p, c1807890x99, c1803570x2B);
    }

    public static C1804300x3M LJJII(C1804410x3X c1804410x3X, C1804430x3Z c1804430x3Z, C1804320x3O c1804320x3O, C1796830wrJ c1796830wrJ, C1804220x3E c1804220x3E, C1804590x3p c1804590x3p, C1807890x99 c1807890x99, C1803570x2B c1803570x2B) {
        return new C1804300x3M(c1804410x3X, c1804430x3Z, c1804320x3O, c1796830wrJ, c1804220x3E, c1804590x3p, c1807890x99, c1803570x2B);
    }

    public static Object LJJIII(C1805070x4b c1805070x4b, IRechargeApi iRechargeApi, WalletRechargeService walletRechargeService, IWalletService iWalletService, IWalletApi iWalletApi) {
        C1804610x3r c1804610x3r = LJIL;
        if (c1804610x3r == null) {
            synchronized (C1804610x3r.class) {
                try {
                    c1804610x3r = LJIL;
                    if (c1804610x3r == null) {
                        C1804610x3r c1804610x3r2 = new C1804610x3r(c1805070x4b, iRechargeApi, walletRechargeService, iWalletService, iWalletApi);
                        LJIL = c1804610x3r2;
                        return c1804610x3r2;
                    }
                } finally {
                }
            }
        }
        return c1804610x3r;
    }

    public static RechargePanelHeaderViewModel LJJIIJ(C1566230qrN c1566230qrN, C1568590qvB c1568590qvB, C1796830wrJ c1796830wrJ, C1570060qxY c1570060qxY, IapService iapService) {
        return new RechargePanelHeaderViewModel(c1566230qrN, c1568590qvB, c1796830wrJ, c1570060qxY, iapService);
    }

    public static Object LJJIIZ(C0YM2 c0ym2) {
        C0YM9 c0ym9 = LJJ;
        if (c0ym9 == null) {
            synchronized (C0YM9.class) {
                try {
                    c0ym9 = LJJ;
                    if (c0ym9 == null) {
                        C0YM9 c0ym92 = new C0YM9(c0ym2);
                        LJJ = c0ym92;
                        return c0ym92;
                    }
                } finally {
                }
            }
        }
        return c0ym9;
    }

    public static Object LJJIIZI() {
        C0YHV c0yhv = LJJI;
        if (c0yhv == null) {
            synchronized (C0YHV.class) {
                try {
                    c0yhv = LJJI;
                    if (c0yhv == null) {
                        C0YHV c0yhv2 = new C0YHV();
                        LJJI = c0yhv2;
                        return c0yhv2;
                    }
                } finally {
                }
            }
        }
        return c0yhv;
    }

    public static Object LJJIJ() {
        C2214241BlO c2214241BlO = LJJIFFI;
        if (c2214241BlO == null) {
            synchronized (C2214241BlO.class) {
                try {
                    c2214241BlO = LJJIFFI;
                    if (c2214241BlO == null) {
                        C2214241BlO c2214241BlO2 = new C2214241BlO();
                        LJJIFFI = c2214241BlO2;
                        return c2214241BlO2;
                    }
                } finally {
                }
            }
        }
        return c2214241BlO;
    }

    public static Object LJJIJIIJI() {
        C0XJN c0xjn = LJJII;
        if (c0xjn == null) {
            synchronized (C0XJN.class) {
                try {
                    c0xjn = LJJII;
                    if (c0xjn == null) {
                        C0XJN c0xjn2 = new C0XJN();
                        LJJII = c0xjn2;
                        return c0xjn2;
                    }
                } finally {
                }
            }
        }
        return c0xjn;
    }

    public static Object LJJIJIIJIL() {
        C452610Hox c452610Hox = LJJIII;
        if (c452610Hox == null) {
            synchronized (C452610Hox.class) {
                try {
                    c452610Hox = LJJIII;
                    if (c452610Hox == null) {
                        C452610Hox c452610Hox2 = new C452610Hox();
                        LJJIII = c452610Hox2;
                        return c452610Hox2;
                    }
                } finally {
                }
            }
        }
        return c452610Hox;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0x8t, java.lang.Object] */
    public static Object LJJIJIL() {
        C1807730x8t c1807730x8t = LJJIIJ;
        if (c1807730x8t == null) {
            synchronized (C1807730x8t.class) {
                try {
                    c1807730x8t = LJJIIJ;
                    if (c1807730x8t == null) {
                        ?? r1 = new Object() { // from class: X.0x8t
                        };
                        LJJIIJ = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c1807730x8t;
    }

    public static Object LJJIJL() {
        C584800Mwg c584800Mwg = LJJIIZ;
        if (c584800Mwg == null) {
            synchronized (C584800Mwg.class) {
                try {
                    c584800Mwg = LJJIIZ;
                    if (c584800Mwg == null) {
                        C584800Mwg c584800Mwg2 = new C584800Mwg();
                        LJJIIZ = c584800Mwg2;
                        return c584800Mwg2;
                    }
                } finally {
                }
            }
        }
        return c584800Mwg;
    }

    public static Object LJJIJLIJ() {
        C0DYT c0dyt = LJJIJIL;
        if (c0dyt == null) {
            synchronized (C0DYT.class) {
                try {
                    c0dyt = LJJIJIL;
                    if (c0dyt == null) {
                        C0DYT c0dyt2 = new C0DYT();
                        LJJIJIL = c0dyt2;
                        return c0dyt2;
                    }
                } finally {
                }
            }
        }
        return c0dyt;
    }

    public static Object LJJIL() {
        C1003530cDn c1003530cDn = LJJIJL;
        if (c1003530cDn == null) {
            synchronized (C1003530cDn.class) {
                try {
                    c1003530cDn = LJJIJL;
                    if (c1003530cDn == null) {
                        C1003530cDn c1003530cDn2 = new C1003530cDn();
                        LJJIJL = c1003530cDn2;
                        return c1003530cDn2;
                    }
                } finally {
                }
            }
        }
        return c1003530cDn;
    }

    public static Object LJJIZ() {
        C1011220cQC c1011220cQC = LJJIJLIJ;
        if (c1011220cQC == null) {
            synchronized (C1011220cQC.class) {
                try {
                    c1011220cQC = LJJIJLIJ;
                    if (c1011220cQC == null) {
                        C1011220cQC c1011220cQC2 = new C1011220cQC();
                        LJJIJLIJ = c1011220cQC2;
                        return c1011220cQC2;
                    }
                } finally {
                }
            }
        }
        return c1011220cQC;
    }

    public static Object LJJJ() {
        C452540Hoq c452540Hoq = LJJJI;
        if (c452540Hoq == null) {
            synchronized (C452540Hoq.class) {
                try {
                    c452540Hoq = LJJJI;
                    if (c452540Hoq == null) {
                        C452540Hoq c452540Hoq2 = new C452540Hoq();
                        LJJJI = c452540Hoq2;
                        return c452540Hoq2;
                    }
                } finally {
                }
            }
        }
        return c452540Hoq;
    }

    public static Object LJJJI() {
        C452530Hop c452530Hop = LJJJIL;
        if (c452530Hop == null) {
            synchronized (C452530Hop.class) {
                try {
                    c452530Hop = LJJJIL;
                    if (c452530Hop == null) {
                        C452530Hop c452530Hop2 = new C452530Hop();
                        LJJJIL = c452530Hop2;
                        return c452530Hop2;
                    }
                } finally {
                }
            }
        }
        return c452530Hop;
    }

    public static Object LJJJIL() {
        return new TemplateSelectionViewModelImpl();
    }

    public static Object LJJJJ() {
        C2452609jI c2452609jI = LJJJJ;
        if (c2452609jI == null) {
            synchronized (C2452609jI.class) {
                try {
                    c2452609jI = LJJJJ;
                    if (c2452609jI == null) {
                        C2452609jI c2452609jI2 = new C2452609jI();
                        LJJJJ = c2452609jI2;
                        return c2452609jI2;
                    }
                } finally {
                }
            }
        }
        return c2452609jI;
    }

    public static Object LJJJJI() {
        C1053550dWT c1053550dWT = LJJJJI;
        if (c1053550dWT == null) {
            synchronized (C1053550dWT.class) {
                try {
                    c1053550dWT = LJJJJI;
                    if (c1053550dWT == null) {
                        C1053550dWT c1053550dWT2 = new C1053550dWT();
                        LJJJJI = c1053550dWT2;
                        return c1053550dWT2;
                    }
                } finally {
                }
            }
        }
        return c1053550dWT;
    }

    public static Object LJJJJIZL() {
        C1053730dWl c1053730dWl = LJJJJIZL;
        if (c1053730dWl == null) {
            synchronized (C1053730dWl.class) {
                try {
                    c1053730dWl = LJJJJIZL;
                    if (c1053730dWl == null) {
                        C1053730dWl c1053730dWl2 = new C1053730dWl();
                        LJJJJIZL = c1053730dWl2;
                        return c1053730dWl2;
                    }
                } finally {
                }
            }
        }
        return c1053730dWl;
    }

    public static Object LJJJJJ() {
        C2452409jG c2452409jG = LJJJJJ;
        if (c2452409jG == null) {
            synchronized (C2452409jG.class) {
                try {
                    c2452409jG = LJJJJJ;
                    if (c2452409jG == null) {
                        C2452409jG c2452409jG2 = new C2452409jG();
                        LJJJJJ = c2452409jG2;
                        return c2452409jG2;
                    }
                } finally {
                }
            }
        }
        return c2452409jG;
    }

    public static Object LJJJJJL() {
        C1053740dWm c1053740dWm = LJJJJJL;
        if (c1053740dWm == null) {
            synchronized (C1053740dWm.class) {
                try {
                    c1053740dWm = LJJJJJL;
                    if (c1053740dWm == null) {
                        C1053740dWm c1053740dWm2 = new C1053740dWm();
                        LJJJJJL = c1053740dWm2;
                        return c1053740dWm2;
                    }
                } finally {
                }
            }
        }
        return c1053740dWm;
    }

    public static Object LJJJJL(C1053740dWm c1053740dWm, C1053730dWl c1053730dWl, C2452609jI c2452609jI) {
        C1053650dWd c1053650dWd = LJJJJL;
        if (c1053650dWd == null) {
            synchronized (C1053650dWd.class) {
                try {
                    c1053650dWd = LJJJJL;
                    if (c1053650dWd == null) {
                        C1053650dWd c1053650dWd2 = new C1053650dWd(c1053740dWm, c1053730dWl, c2452609jI);
                        LJJJJL = c1053650dWd2;
                        return c1053650dWd2;
                    }
                } finally {
                }
            }
        }
        return c1053650dWd;
    }

    public static Object LJJJJLI() {
        C901740ZZc c901740ZZc = LJJJJLI;
        if (c901740ZZc == null) {
            synchronized (C901740ZZc.class) {
                try {
                    c901740ZZc = LJJJJLI;
                    if (c901740ZZc == null) {
                        C901740ZZc c901740ZZc2 = new C901740ZZc();
                        LJJJJLI = c901740ZZc2;
                        return c901740ZZc2;
                    }
                } finally {
                }
            }
        }
        return c901740ZZc;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0ZMx, java.lang.Object] */
    public static Object LJJJJLL() {
        C898570ZMx c898570ZMx = LJJJJLL;
        if (c898570ZMx == null) {
            synchronized (C898570ZMx.class) {
                try {
                    c898570ZMx = LJJJJLL;
                    if (c898570ZMx == null) {
                        ?? r1 = new Object() { // from class: X.0ZMx
                        };
                        LJJJJLL = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c898570ZMx;
    }

    public static Object LJJJJZ(Object obj) {
        return new 1HiK((1HJm) obj);
    }

    public static Object LJJJJZI() {
        return new 1HiL();
    }

    public static Object LJJJLIIL(InterfaceC212800ru interfaceC212800ru, InterfaceC1807820x92 interfaceC1807820x92, InterfaceC0219005h interfaceC0219005h, Object obj) {
        return new 1HiM(interfaceC212800ru, interfaceC1807820x92, interfaceC0219005h, (1Hgo) obj);
    }

    public static Object LJJJLL(Object obj) {
        return new 1HiO((Context) obj);
    }

    public static Object LJJJLZIJ() {
        return new 1HiP();
    }

    public static Object LJJJZ() {
        Object obj = LJJJJZ;
        if (obj == null) {
            synchronized (1HUg.class) {
                try {
                    obj = LJJJJZ;
                    if (obj == null) {
                        1HUg r1 = new 1HUg();
                        LJJJJZ = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return obj;
    }

    public static Object LJJL() {
        Object obj = LJJJJZI;
        if (obj == null) {
            synchronized (1HUq.class) {
                try {
                    obj = LJJJJZI;
                    if (obj == null) {
                        1HUq r1 = new 1HUq();
                        LJJJJZI = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return obj;
    }

    public static Object LJJLI() {
        Object obj = LJJJLIIL;
        if (obj == null) {
            synchronized (1H9h.class) {
                try {
                    obj = LJJJLIIL;
                    if (obj == null) {
                        1H9h r1 = new 1H9h();
                        LJJJLIIL = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return obj;
    }

    public static Object LJJLIIIIJ() {
        return new 1HkO();
    }

    public static Object LJJLIIIJ(Object obj, C01IX c01ix, C054G c054g) {
        return new 1HkP((1H7L) obj, c01ix, c054g);
    }

    public static Object LJJLIIIJILLIZJL(Object obj, Object obj2, InterfaceC1807810x91 interfaceC1807810x91, Object obj3, Object obj4) {
        return new 1HS8((1HSA) obj, (1HSD) obj2, interfaceC1807810x91, (InterfaceC1807830x93) obj3, (1HJm) obj4);
    }

    public static Object LJJLIIIJJI() {
        return new 1HSA();
    }

    public static Object LJJLIIIJJIZ(InterfaceC1807790x8z interfaceC1807790x8z, Object obj) {
        return new 1HSD(interfaceC1807790x8z, (1HRu) obj);
    }

    public static Object LJJLIIIJL() {
        return new 1HUx();
    }

    public static Object LJJLIIIJLJLI(Object obj, InterfaceC1807820x92 interfaceC1807820x92) {
        return new RTCMediaAdapter((Context) obj, interfaceC1807820x92);
    }

    public static Object LJJLIIIJLLLLLLLZ(C0135002b c0135002b) {
        return new 1HUy(c0135002b);
    }

    public static Object LJJLIIJ() {
        return new 1He4();
    }

    public static Object LJJLIL(Object obj) {
        return new 1He5((1HJm) obj);
    }

    public static Object LJJLJ(Object obj, C054G c054g, Object obj2) {
        return new 1HeP((1HJm) obj, c054g, (1H7O) obj2);
    }

    public static Object LJJLJLI(C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4) {
        return new CallViewModel(c01gw, c01gw2, c01gw3, c01gw4);
    }

    public static Object LJJLL(C01IX c01ix, Object obj, C054G c054g) {
        return new 1Hgh(c01ix, (1HRh) obj, c054g);
    }

    public static Object LJJZ(Object obj, Object obj2, C054G c054g) {
        return new 1Hgn((1H7L) obj, (1HJm) obj2, c054g);
    }

    public static Object LJJZZI(Object obj, Object obj2, C0135002b c0135002b) {
        return new 1Hgp((1HJm) obj, (1H7N) obj2, c0135002b);
    }

    public static Object LJJZZIII(Object obj, Object obj2, C0135002b c0135002b, Object obj3, Object obj4) {
        return new 1Hgs((1HRh) obj, (1H7O) obj2, c0135002b, (1H7N) obj3, (1H9i) obj4);
    }

    public static Object LJL(C054G c054g, Object obj, C00GF c00gf, InterfaceC1807820x92 interfaceC1807820x92, Object obj2, InterfaceC0219005h interfaceC0219005h, C0135002b c0135002b) {
        return new 1HgZ(c054g, (1HS8) obj, c00gf, interfaceC1807820x92, (1HJm) obj2, interfaceC0219005h, c0135002b);
    }

    public static Object LJLI(InterfaceC212800ru interfaceC212800ru, Object obj, InterfaceC1807820x92 interfaceC1807820x92, C054G c054g, Object obj2) {
        return new 1Hgb(interfaceC212800ru, interfaceC1807820x92, c054g, (1H7L) obj2);
    }

    public static Object LJLIIIL(C01IX c01ix, Object obj, InterfaceC1807820x92 interfaceC1807820x92, C054G c054g) {
        return new 1Hgf(c01ix, (1HS8) obj, interfaceC1807820x92, c054g);
    }

    public static Object LJLIIL(Object obj, Object obj2, Object obj3, C01IX c01ix, InterfaceC1807790x8z interfaceC1807790x8z, InterfaceC0219005h interfaceC0219005h) {
        return new 1Hgl((1H7L) obj, (1HJm) obj2, (1H7N) obj3, c01ix, interfaceC1807790x8z, interfaceC0219005h);
    }

    public static Object LJLIL() {
        C1BGS c1bgs = LJJJLL;
        if (c1bgs == null) {
            synchronized (C1BGS.class) {
                try {
                    c1bgs = LJJJLL;
                    if (c1bgs == null) {
                        C1BGS c1bgs2 = new C1BGS();
                        LJJJLL = c1bgs2;
                        return c1bgs2;
                    }
                } finally {
                }
            }
        }
        return c1bgs;
    }

    public static Object LJLILLLLZI() {
        Object obj = LJJJLZIJ;
        if (obj == null) {
            synchronized (1HhS.class) {
                try {
                    obj = LJJJLZIJ;
                    if (obj == null) {
                        1HhS r1 = new 1HhS();
                        LJJJLZIJ = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return obj;
    }

    public static Object LJLJI() {
        return new 1Hi6();
    }

    public static Object LJLJJI() {
        return new 1HiV();
    }

    public static Object LJLJJL(C19EG c19eg) {
        return new 1HiW(c19eg);
    }

    public static Object LJLJJLL(C19EG c19eg) {
        return new 1HiX(c19eg);
    }

    public static Object LJLJL(C19EG c19eg) {
        return new 1HiY(c19eg);
    }

    public static Object LJLJLJ() {
        return new 1HjO();
    }

    public static Object LJLJLLL(IMCreativeRecordModel iMCreativeRecordModel) {
        return new 1Hi7(iMCreativeRecordModel);
    }

    public static Object LJLL() {
        return new 1Hi8();
    }

    public static Object LJLLI(C1807680x8o c1807680x8o, Fragment fragment) {
        return new 1HQB(c1807680x8o, fragment);
    }

    public static Object LJLLILLLL(Function0 function0) {
        return new 1Hiu(function0);
    }

    public static Object LJLLJ() {
        return new IMRecordFragment();
    }

    public static Object LJLLL() {
        return new 1Hiv();
    }

    public static Object LJLLLL() {
        return new 1Hiw();
    }

    public static Object LJLLLLLL(IMCreativeRecordModel iMCreativeRecordModel) {
        return new 1HjQ(iMCreativeRecordModel);
    }

    public static Object LJLZ(IMCreativeRecordModel iMCreativeRecordModel) {
        return new 1Hjr(iMCreativeRecordModel);
    }

    public static Object LJZ(C19EG c19eg, InterfaceC1445330niN interfaceC1445330niN, InterfaceC1445250niF interfaceC1445250niF) {
        return new 1Ii8(c19eg, interfaceC1445330niN, interfaceC1445250niF);
    }

    public static Object LJZI(IMCreativeRecordModel iMCreativeRecordModel, InterfaceC119400cq interfaceC119400cq) {
        return new 1HRx(iMCreativeRecordModel, interfaceC119400cq);
    }

    public static Object LJZL(Object obj, Object obj2, Object obj3) {
        return new 1HRy((1HQB) obj, (1HJE) obj2, (1HS3) obj3);
    }

    public static Object LL(C19EG c19eg, InterfaceC1807740x8u interfaceC1807740x8u, IMCreativeRecordModel iMCreativeRecordModel) {
        return new 1HkV(c19eg, interfaceC1807740x8u, iMCreativeRecordModel);
    }

    public static Object LLD(Object obj, Object obj2) {
        return new 1HSN((1HQB) obj, (1HJE) obj2);
    }

    public static Object LLF(C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4) {
        return new IMRecordPlaygroundVM(c01gw, c01gw2, c01gw3, c01gw4);
    }

    public static Object LLFF(IMCreativeRecordModel iMCreativeRecordModel, Object obj, Object obj2) {
        return new 1H7C(iMCreativeRecordModel, (1Hhq) obj, (1HT8) obj2);
    }

    public static Object LLFFF() {
        return new 1HT8();
    }

    public static Object LLFII(Object obj, Object obj2, C1445030nht c1445030nht) {
        return new 1H7v((1HQB) obj, (1HRy) obj2, c1445030nht);
    }

    public static Object LLFZ(InterfaceC2253911DJt interfaceC2253911DJt) {
        return new 1HdH(interfaceC2253911DJt);
    }

    public static Object LLI() {
        return new 1HJD();
    }

    public static Object LLIFFJFJJ(Object obj) {
        return new 1HJE((1HQB) obj);
    }

    public static Object LLII(C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4) {
        return new IMRecordSpecChangeVM(c01gw, c01gw2, c01gw3, c01gw4);
    }

    public static Object LLIIII(C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4) {
        return new IMRecordBeautyPanelViewModel(c01gw, c01gw2, c01gw3, c01gw4);
    }

    public static Object LLIIIILZ(InterfaceC1445170ni7 interfaceC1445170ni7) {
        return new 1HfX(interfaceC1445170ni7);
    }

    public static Object LLIIIJ() {
        return new 1HfY();
    }

    public static Object LLIIIL(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return new 1HMT((1HQB) obj, (1H7v) obj2, (1HJE) obj3, (1HRy) obj4, (1HAs) obj5, (1HNJ) obj6);
    }

    public static Object LLIIIZ(Object obj, C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4, C01GW c01gw5, C01GW c01gw6, C01GW c01gw7, C01GW c01gw8, C01GW c01gw9, C01GW c01gw10) {
        return new IMRecordButtonViewModel((Context) obj, c01gw, c01gw2, c01gw3, c01gw4, c01gw5, c01gw6, c01gw7, c01gw8, c01gw9, c01gw10);
    }

    public static Object LLIIJI(C1DK3 c1dk3, InterfaceC1445170ni7 interfaceC1445170ni7) {
        return new 1HgA(c1dk3, interfaceC1445170ni7);
    }

    public static Object LLIIJLIL() {
        return new 1HgM();
    }

    public static Object LLIIL(Object obj, Object obj2) {
        return new 1HNJ((1H7v) obj, (1HQB) obj2);
    }

    public static Object LLIILII() {
        return new 1HVa();
    }

    public static Object LLIILZL(C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4) {
        return new IMRecordGestureVM(c01gw, c01gw2, c01gw3, c01gw4);
    }

    public static Object LLIIZ(IMCreativeRecordModel iMCreativeRecordModel, C19EG c19eg) {
        return new 1Hh9(iMCreativeRecordModel, c19eg);
    }

    public static Object LLIL(Object obj, Object obj2) {
        return new 1HO9((1HQB) obj, (1HJE) obj2);
    }

    public static Object LLILII(C01GW c01gw) {
        return new IMRecordAlbumEntranceVM(c01gw);
    }

    public static Object LLILIL(C01GW c01gw, C01GW c01gw2, C01GW c01gw3) {
        return new IMRecordAlbumPanelVM(c01gw, c01gw2, c01gw3);
    }

    public static Object LLILL(Fragment fragment, C01GW c01gw, InterfaceC1624480sNK interfaceC1624480sNK) {
        return new 1HOR(fragment, c01gw, interfaceC1624480sNK);
    }

    public static Object LLILLIZIL() {
        return new 1HOS();
    }

    public static Object LLILLJJLI(Object obj, Object obj2, Object obj3, C1445030nht c1445030nht) {
        return new 1HAs((1HQB) obj, (1HJE) obj2, (1H7v) obj3, c1445030nht);
    }

    public static Object LLILLL(IMCreativeRecordModel iMCreativeRecordModel, Object obj, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp, Object obj2, Fragment fragment, C01GW c01gw, InterfaceC1625220sOW interfaceC1625220sOW, Object obj3, C01GW c01gw2, C2252321DDq c2252321DDq) {
        return new 1ItZ(iMCreativeRecordModel, (Bundle) obj, interfaceC1624480sNK, interfaceC1625410sOp, (1Hhi) obj2, fragment, c01gw, interfaceC1625220sOW, (1HOR) obj3, c01gw2, c2252321DDq);
    }

    public static Object LLILZ(IMCreativeRecordModel iMCreativeRecordModel, C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4, C01GW c01gw5, C01GW c01gw6) {
        return new IMRecordEffectEntranceVM(c01gw, c01gw2, c01gw3, c01gw4, c01gw5, c01gw6);
    }

    public static Object LLILZIL(IMCreativeRecordModel iMCreativeRecordModel, C19EG c19eg, C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4, C01GW c01gw5, C01GW c01gw6, C01GW c01gw7, C01GW c01gw8, C01GW c01gw9, C01GW c01gw10, C01GW c01gw11, C01GW c01gw12, C01GW c01gw13, C01GW c01gw14, C01GW c01gw15, C01GW c01gw16) {
        return new IMRecordEffectsPanelVM(c01gw, c01gw2, c01gw3, c01gw4, c01gw5, c01gw6, c01gw7, c01gw8, c01gw9, c01gw10, c01gw11, c01gw12, c01gw13, c01gw14, c01gw15, c01gw16);
    }

    public static Object LLILZLL(C01GW c01gw, C01GW c01gw2) {
        return new 1Hhi(c01gw, c01gw2);
    }

    public static Object LLIZ(C19EG c19eg) {
        return new 1Hhk(c19eg);
    }

    public static Object LLIZLLLIL(AbstractC1445320niM abstractC1445320niM) {
        return new 1HPP(abstractC1445320niM);
    }

    public static Object LLJ(C01GW c01gw, C01GW c01gw2, C01GW c01gw3) {
        return new IMEffectDiscoverVM(c01gw, c01gw2, c01gw3);
    }

    public static Object LLJI() {
        return new 1HQL();
    }

    public static Object LLJIJIL(C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4, C01GW c01gw5, C01GW c01gw6, C01GW c01gw7, C01GW c01gw8, C01GW c01gw9, C01GW c01gw10, C01GW c01gw11, C01GW c01gw12) {
        return new IMFullWidthEffectCarouselVM(c01gw, c01gw2, c01gw3, c01gw4, c01gw5, c01gw6, c01gw7, c01gw8, c01gw9, c01gw10, c01gw11, c01gw12);
    }

    public static Object LLJILJIL() {
        return new 1HQM();
    }

    public static Object LLJILJILJ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, C1445030nht c1445030nht) {
        return new 1HQQ((1HQB) obj, (1HJE) obj2, (1HAs) obj3, (1HMT) obj4, (1HLT) obj5, (1H7v) obj6, c1445030nht);
    }

    public static Object LLJILLL(C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4, C01GW c01gw5, C01GW c01gw6, C01GW c01gw7, C01GW c01gw8, C01GW c01gw9, C01GW c01gw10, C01GW c01gw11) {
        return new IMFullWidthCarouselBottomVM(c01gw, c01gw2, c01gw3, c01gw4, c01gw5, c01gw6, c01gw7, c01gw8, c01gw9, c01gw10, c01gw11);
    }

    public static Object LLJJ(C01GW c01gw, Fragment fragment) {
        return new IMEffectPrefetcherProvider(c01gw, fragment);
    }

    public static Object LLJJI(C01GW c01gw) {
        return new 1HRf(c01gw);
    }

    public static Object LLJJIII(C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4, C01GW c01gw5) {
        return new IMEffectBarWidgetVM(c01gw, c01gw2, c01gw3, c01gw4, c01gw5);
    }

    public static Object LLJJIJI(IMCreativeRecordModel iMCreativeRecordModel, C19EG c19eg, InterfaceC2281111EQj interfaceC2281111EQj, InterfaceC1445170ni7 interfaceC1445170ni7, InterfaceC1445250niF interfaceC1445250niF) {
        return new 1HkW(iMCreativeRecordModel, c19eg, interfaceC2281111EQj, interfaceC1445170ni7, interfaceC1445250niF);
    }

    public static Object LLJJIJIIJIL(Object obj) {
        return new 1HS3((1HQB) obj);
    }

    public static Object LLJJIJIL(IMCreativeRecordModel iMCreativeRecordModel) {
        return new 1Hkq(iMCreativeRecordModel);
    }

    public static Object LLJJJ(C01GW c01gw) {
        return new IMRecordTitleVM(c01gw);
    }

    public static Object LLJJJIL(Object obj, Object obj2) {
        return new 1H7y((1HQB) obj, (1HJE) obj2);
    }

    public static Object LLJJJJ(C01GW c01gw) {
        return new IMRecordTnsVM(c01gw);
    }

    public static Object LLJJJJJIL(Object obj, Object obj2) {
        return new 1H8Q((1HQB) obj, (1HJE) obj2);
    }

    public static Object LLJJJJLIIL(InterfaceC1444620nhE interfaceC1444620nhE) {
        return new 1HI4(interfaceC1444620nhE);
    }

    public static Object LLJJL(C19EG c19eg) {
        return new 1Hc0(c19eg);
    }

    public static Object LLJJLIIIJLLLLLLLZ(C19EG c19eg) {
        return new 1Hc1(c19eg);
    }

    public static Object LLJL(C19EG c19eg, InterfaceC1642310sq5 interfaceC1642310sq5, InterfaceC1635410sex interfaceC1635410sex, C19731412Hw c19731412Hw, Object obj) {
        return new 1HIT(c19eg, interfaceC1642310sq5, interfaceC1635410sex, c19731412Hw, (1HI4) obj);
    }

    public static Object LLJLIL(Object obj, Object obj2, Object obj3) {
        return new 1HJ4((1HQB) obj, (1H7v) obj2, (1HJE) obj3);
    }

    public static Object LLJLILLLLZIIL(C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4) {
        return new IMRecordBeautyToolVM(c01gw, c01gw2, c01gw3, c01gw4);
    }

    public static Object LLJLL(C01GW c01gw, C01GW c01gw2) {
        return new IMRecordGameBeautyVM(c01gw, c01gw2);
    }

    public static Object LLJLLIL(C01GW c01gw, C01GW c01gw2) {
        return new IMRecordOneClickBeautyVM(c01gw, c01gw2);
    }

    public static Object LLJLLL(InterfaceC1639870sm9 interfaceC1639870sm9, Object obj) {
        return new 1HK1(interfaceC1639870sm9, (1HMV) obj);
    }

    public static Object LLJZ(Object obj, Object obj2, Object obj3) {
        return new 1HK2((1HQB) obj, (1H7v) obj2, (1HJE) obj3);
    }

    public static Object LLJZIJLIL(C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4, C01GW c01gw5, C01GW c01gw6) {
        return new IMFilterPanelVM(c01gw, c01gw2, c01gw3, c01gw4, c01gw5, c01gw6);
    }

    public static Object LLL(C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4, C01GW c01gw5, C01GW c01gw6) {
        return new IMFilterToolVM(c01gw, c01gw2, c01gw3, c01gw4, c01gw5, c01gw6);
    }

    public static Object LLLF(C19EG c19eg) {
        return new 1HeH(c19eg);
    }

    public static Object LLLFF(Object obj, Object obj2, Object obj3, Object obj4) {
        return new 1HLT((1HQB) obj, (1H7v) obj2, (1HJE) obj3, (1HSw) obj4);
    }

    public static Object LLLFFI(InterfaceC2253911DJt interfaceC2253911DJt) {
        return new 1HLV(interfaceC2253911DJt);
    }

    public static Object LLLFZ(C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4) {
        return new IMFrontFlashPanelVM(c01gw, c01gw2, c01gw3, c01gw4);
    }

    public static Object LLLI(C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4) {
        return new IMRecordFlashToolVM(c01gw, c01gw2, c01gw3, c01gw4);
    }

    public static Object LLLII(C19EG c19eg) {
        return new 1Hf0(c19eg);
    }

    public static Object LLLIIII(C19EG c19eg) {
        return new 1Hfb(c19eg);
    }

    public static Object LLLIIIIL(C01GW c01gw, C01GW c01gw2) {
        return new IMRecordSwitchToolVM(c01gw, c01gw2);
    }

    public static Object LLLIIIL(Object obj, Object obj2) {
        return new 1HMW((1H7v) obj, (1HLT) obj2);
    }

    public static Object LLLIIL(C19EG c19eg) {
        return new 1HgB(c19eg);
    }

    public static Object LLLIILIL(C19EG c19eg) {
        return new 1HgO(c19eg);
    }

    public static Object LLLIL(Object obj, InterfaceC119400cq interfaceC119400cq, InterfaceC1445170ni7 interfaceC1445170ni7) {
        return new 1HgP((List) obj, interfaceC119400cq, interfaceC1445170ni7);
    }

    public static Object LLLILZ(Object obj, Object obj2, Object obj3) {
        return new 1HNS((1HQB) obj, (1HRy) obj2, (1HJE) obj3);
    }

    public static Object LLLILZJ(C01GW c01gw, C01GW c01gw2, C01GW c01gw3) {
        return new IMRecordToolbarVM(c01gw, c01gw2, c01gw3);
    }

    public static Object LLLILZLLLI() {
        return new 1Hhq();
    }

    public static Object LLLIZZ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return new 1HOu((1HQB) obj, (1H7v) obj2, (1HRy) obj3, (1HJE) obj4, (1HNJ) obj5, (1HS3) obj6);
    }

    public static Object LLLJ(IMGameCameraInfo iMGameCameraInfo, C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4) {
        return new GamePlayControllerVM(iMGameCameraInfo, c01gw, c01gw2, c01gw3, c01gw4);
    }

    public static Object LLLJIL(Object obj, Object obj2) {
        return new 1HRs((1HQB) obj, (1HJE) obj2);
    }

    public static Object LLLJL(Object obj, Object obj2) {
        return new 1HSQ((1HQB) obj, (1HJE) obj2);
    }

    public static Object LLLL() {
        return new 1Hkz();
    }

    public static Object LLLLII(Object obj, Object obj2) {
        return new 1HSu((1HQB) obj, (1HJE) obj2);
    }

    public static Object LLLLIIIILLL(Object obj, Object obj2, Object obj3) {
        return new 1Hl1((1HQB) obj, (1HJE) obj2, (1HMT) obj3);
    }

    public static Object LLLLIIL(Object obj, Object obj2) {
        return new 1H80((1HQB) obj, (1HNJ) obj2);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0x8y, java.lang.Object] */
    public static Object LLLLIILL() {
        C1807780x8y c1807780x8y = LJJJZ;
        if (c1807780x8y == null) {
            synchronized (C1807780x8y.class) {
                try {
                    c1807780x8y = LJJJZ;
                    if (c1807780x8y == null) {
                        ?? r1 = new Object() { // from class: X.0x8y
                        };
                        LJJJZ = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c1807780x8y;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0ZeT, java.lang.Object] */
    public static Object LLLLIILLL() {
        C904750ZeT c904750ZeT = LJJL;
        if (c904750ZeT == null) {
            synchronized (C904750ZeT.class) {
                try {
                    c904750ZeT = LJJL;
                    if (c904750ZeT == null) {
                        ?? r1 = new Object() { // from class: X.0ZeT
                        };
                        LJJL = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c904750ZeT;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0x8v, java.lang.Object] */
    public static Object LLLLIL() {
        C1807750x8v c1807750x8v = LJJLI;
        if (c1807750x8v == null) {
            synchronized (C1807750x8v.class) {
                try {
                    c1807750x8v = LJJLI;
                    if (c1807750x8v == null) {
                        ?? r1 = new Object() { // from class: X.0x8v
                        };
                        LJJLI = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c1807750x8v;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0Zf3, java.lang.Object] */
    public static Object LLLLILI() {
        C905110Zf3 c905110Zf3 = LJJLIIIIJ;
        if (c905110Zf3 == null) {
            synchronized (C905110Zf3.class) {
                try {
                    c905110Zf3 = LJJLIIIIJ;
                    if (c905110Zf3 == null) {
                        ?? r1 = new ViewModelProvider.Factory() { // from class: X.0Zf3
                            @Override // androidx.lifecycle.ViewModelProvider.Factory
                            public final /* synthetic */ ViewModel create(Class cls) {
                                return C19566311gr.LIZIZ(this, cls);
                            }

                            @Override // androidx.lifecycle.ViewModelProvider.Factory
                            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                            }

                            @Override // androidx.lifecycle.ViewModelProvider.Factory
                            public final <T extends ViewModel> T create(C13IQ<T> c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                                C905120Zf4 c905120Zf4 = (C905120Zf4) abstractC903280Zc6.LIZ(C905130Zf5.LIZ);
                                if (c905120Zf4 != null) {
                                    if (C09R7.LIZ(c13iq).isAssignableFrom(MessageListOperatorVM.class)) {
                                        return new SocialIMSDKMessageListOperatorVM(c905120Zf4.LIZJ, (InterfaceC1755906uD) c905120Zf4.LJIIIZ.getValue(), c905120Zf4.LIZLLL);
                                    }
                                    throw new IllegalArgumentException();
                                }
                                throw new IllegalArgumentException();
                            }
                        };
                        LJJLIIIIJ = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c905110Zf3;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.19Gz, java.lang.Object] */
    public static Object LLLLJ() {
        C21512719Gz c21512719Gz = LJJLIIIJ;
        if (c21512719Gz == null) {
            synchronized (C21512719Gz.class) {
                try {
                    c21512719Gz = LJJLIIIJ;
                    if (c21512719Gz == null) {
                        ?? r1 = new InterfaceC21512619Gy<MessageListCLSTracker>() { // from class: X.19Gz
                            @Override // X.InterfaceC21512619Gy
                            public final MessageListCLSTracker LIZ() {
                                return new MessageListCLSTrackerImpl();
                            }

                            @Override // X.InterfaceC21512619Gy
                            public final MessageListCLSTracker LIZIZ() {
                                return EmptyMessageListCLSTrackerImpl.LL;
                            }
                        };
                        LJJLIIIJ = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c21512719Gz;
    }

    public static Object LLLLJI(C21512719Gz c21512719Gz) {
        C19H0 c19h0 = LJJLIIIJILLIZJL;
        if (c19h0 == null) {
            synchronized (C19H0.class) {
                try {
                    c19h0 = LJJLIIIJILLIZJL;
                    if (c19h0 == null) {
                        C19H0 c19h02 = new C19H0(c21512719Gz);
                        LJJLIIIJILLIZJL = c19h02;
                        return c19h02;
                    }
                } finally {
                }
            }
        }
        return c19h0;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0x8r, java.lang.Object] */
    public static Object LLLLL() {
        C1807710x8r c1807710x8r = LJJLIIIJJI;
        if (c1807710x8r == null) {
            synchronized (C1807710x8r.class) {
                try {
                    c1807710x8r = LJJLIIIJJI;
                    if (c1807710x8r == null) {
                        ?? r1 = new Object() { // from class: X.0x8r
                            public static final /* synthetic */ int LIZ = 0;
                        };
                        LJJLIIIJJI = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c1807710x8r;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.08ih, java.lang.Object] */
    public static Object LLLLLIL(final C1807710x8r c1807710x8r) {
        C2194108ih c2194108ih = LJJLIIIJJIZ;
        if (c2194108ih == null) {
            synchronized (C2194108ih.class) {
                try {
                    c2194108ih = LJJLIIIJJIZ;
                    if (c2194108ih == null) {
                        ?? r1 = new InterfaceC21512619Gy<InterfaceC911210Zot>(c1807710x8r) { // from class: X.08ih
                            public final C1807710x8r LIZ;

                            @Override // X.InterfaceC21512619Gy
                            public final InterfaceC911210Zot LIZ() {
                                return new IMMessageListFMPTrackerImpl(this.LIZ);
                            }

                            @Override // X.InterfaceC21512619Gy
                            public final InterfaceC911210Zot LIZIZ() {
                                return new InterfaceC911210Zot() { // from class: X.08ig
                                    @Override // X.InterfaceC911210Zot
                                    public final void LIZ() {
                                    }

                                    @Override // X.InterfaceC911210Zot
                                    public final void LIZIZ(Map<String, String> map) {
                                    }

                                    @Override // X.InterfaceC911210Zot
                                    public final void LIZJ(String str, InterfaceC2187708hf interfaceC2187708hf) {
                                    }

                                    @Override // X.InterfaceC911210Zot
                                    public final void LIZLLL(String str, InterfaceC2187608he interfaceC2187608he) {
                                    }

                                    @Override // X.InterfaceC911210Zot
                                    public final void LJ(List<String> list) {
                                    }

                                    @Override // X.InterfaceC911210Zot
                                    public final void LJFF(String str) {
                                    }

                                    @Override // X.InterfaceC911210Zot
                                    public final void onPause() {
                                    }
                                };
                            }

                            {
                                this.LIZ = c1807710x8r;
                            }
                        };
                        LJJLIIIJJIZ = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c2194108ih;
    }

    public static Object LLLLLILLIL(C2194108ih c2194108ih) {
        C19H1 c19h1 = LJJLIIIJL;
        if (c19h1 == null) {
            synchronized (C19H1.class) {
                try {
                    c19h1 = LJJLIIIJL;
                    if (c19h1 == null) {
                        C19H1 c19h12 = new C19H1(c2194108ih);
                        LJJLIIIJL = c19h12;
                        return c19h12;
                    }
                } finally {
                }
            }
        }
        return c19h1;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.06v2, java.lang.Object] */
    public static Object LLLLLJLJLL() {
        C1761006v2 c1761006v2 = LJJLIIIJLLLLLLLZ;
        if (c1761006v2 == null) {
            synchronized (C1761006v2.class) {
                try {
                    c1761006v2 = LJJLIIIJLLLLLLLZ;
                    if (c1761006v2 == null) {
                        ?? r1 = new Object() { // from class: X.06v2
                        };
                        LJJLIIIJLLLLLLLZ = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c1761006v2;
    }

    public static Object LLLLLL() {
        C1756306uH c1756306uH = LJJLIIJ;
        if (c1756306uH == null) {
            synchronized (C1756306uH.class) {
                try {
                    c1756306uH = LJJLIIJ;
                    if (c1756306uH == null) {
                        C1756306uH c1756306uH2 = new C1756306uH();
                        LJJLIIJ = c1756306uH2;
                        return c1756306uH2;
                    }
                } finally {
                }
            }
        }
        return c1756306uH;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0x8w, java.lang.Object] */
    public static Object LLLLLLIL() {
        C1807760x8w c1807760x8w = LJJLIL;
        if (c1807760x8w == null) {
            synchronized (C1807760x8w.class) {
                try {
                    c1807760x8w = LJJLIL;
                    if (c1807760x8w == null) {
                        ?? r1 = new Object() { // from class: X.0x8w
                        };
                        LJJLIL = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c1807760x8w;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0x8x, java.lang.Object] */
    public static Object LLLLLLJ() {
        C1807770x8x c1807770x8x = LJJLJ;
        if (c1807770x8x == null) {
            synchronized (C1807770x8x.class) {
                try {
                    c1807770x8x = LJJLJ;
                    if (c1807770x8x == null) {
                        ?? r1 = new Object() { // from class: X.0x8x
                        };
                        LJJLJ = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c1807770x8x;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.069d, java.lang.Object] */
    public static Object LLLLLLLLL() {
        C15607069d c15607069d = LJJLL;
        if (c15607069d == null) {
            synchronized (C15607069d.class) {
                try {
                    c15607069d = LJJLL;
                    if (c15607069d == null) {
                        ?? r1 = new InterfaceC15608069e() { // from class: X.069d
                            public final InterfaceC1710106mp LIZ;

                            {
                                IMContactApi.LIZ.getClass();
                                this.LIZ = C069P.LIZ().LJ();
                            }

                            @Override // X.InterfaceC15608069e
                            public final IMUser LIZ(SessionInfo sessionInfo) {
                                IMUser singleChatFromUser = sessionInfo.getSingleChatFromUser();
                                if (singleChatFromUser == null) {
                                    return null;
                                }
                                IMUser iMUserLJIIL = this.LIZ.LJIIL(singleChatFromUser.getUid(), singleChatFromUser.getSecUid(), "im_local_db");
                                if (iMUserLJIIL != null) {
                                    return iMUserLJIIL;
                                }
                                return singleChatFromUser;
                            }
                        };
                        LJJLL = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c15607069d;
    }

    public static SingleChatInputViewModel LLLLLLLLLL(IInputFieldAbility iInputFieldAbility, InterfaceC456460HvA interfaceC456460HvA, C0I20 c0i20, InterfaceC456500HvE interfaceC456500HvE, SessionInfo sessionInfo, InterfaceC441960HUs interfaceC441960HUs, InterfaceC456680HvW interfaceC456680HvW, InterfaceC456690HvX interfaceC456690HvX) {
        return new SingleChatInputViewModel(iInputFieldAbility, interfaceC456460HvA, c0i20, interfaceC456500HvE, sessionInfo, interfaceC441960HUs, interfaceC456680HvW, interfaceC456690HvX);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0Zdq, java.lang.Object] */
    public static Object LLLLLLLZIL() {
        C904360Zdq c904360Zdq = LJJZ;
        if (c904360Zdq == null) {
            synchronized (C904360Zdq.class) {
                try {
                    c904360Zdq = LJJZ;
                    if (c904360Zdq == null) {
                        ?? r1 = new IGroupMediaVMFactory() { // from class: X.0Zdq
                            @Override // androidx.lifecycle.ViewModelProvider.Factory
                            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                            }

                            @Override // androidx.lifecycle.ViewModelProvider.Factory
                            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                            }

                            @Override // androidx.lifecycle.ViewModelProvider.Factory
                            public final <T extends ViewModel> T create(Class<T> cls) {
                                return new GroupMediaGridViewModel();
                            }
                        };
                        LJJZ = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c904360Zdq;
    }

    public static Object LLLLZLLIL() {
        C450160Hl0 c450160Hl0 = LJLJJL;
        if (c450160Hl0 == null) {
            synchronized (C450160Hl0.class) {
                try {
                    c450160Hl0 = LJLJJL;
                    if (c450160Hl0 == null) {
                        C450160Hl0 c450160Hl02 = new C450160Hl0();
                        LJLJJL = c450160Hl02;
                        return c450160Hl02;
                    }
                } finally {
                }
            }
        }
        return c450160Hl0;
    }

    public static Object LLLLZLLLI(C450160Hl0 c450160Hl0) {
        C450100Hku c450100Hku = LJLJJLL;
        if (c450100Hku == null) {
            synchronized (C450100Hku.class) {
                try {
                    c450100Hku = LJLJJLL;
                    if (c450100Hku == null) {
                        C450100Hku c450100Hku2 = new C450100Hku(c450160Hl0);
                        LJLJJLL = c450100Hku2;
                        return c450100Hku2;
                    }
                } finally {
                }
            }
        }
        return c450100Hku;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0xpo, java.lang.Object] */
    public static Object LLLZ() {
        C1834340xpo c1834340xpo = LJLJL;
        if (c1834340xpo == null) {
            synchronized (C1834340xpo.class) {
                try {
                    c1834340xpo = LJLJL;
                    if (c1834340xpo == null) {
                        ?? r1 = new InterfaceC1808720xAU() { // from class: X.0xpo
                            public final Set<String> LIZ;

                            {
                                new LruCache(100);
                                this.LIZ = new LinkedHashSet();
                            }

                            @Override // X.InterfaceC1808720xAU
                            public final AbstractC19875112pZ<String> getCurrentBlockIds() {
                                C19875212pa c19875212paBuilder = AbstractC19875112pZ.builder();
                                c19875212paBuilder.LJII(this.LIZ);
                                return c19875212paBuilder.LJIIIZ();
                            }

                            @Override // X.InterfaceC1808720xAU
                            public final void block(String str) {
                                this.LIZ.add(str);
                            }

                            @Override // X.InterfaceC1808720xAU
                            public final void resetBlockList(List<String> list) {
                                this.LIZ.clear();
                                this.LIZ.addAll(list);
                            }
                        };
                        LJLJL = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c1834340xpo;
    }

    public static Object LLLZI() {
        return new 1HSh();
    }

    public static Object LLLZIIL() {
        Object obj = LJLJLJ;
        if (obj == null) {
            synchronized (1Hkv.class) {
                try {
                    obj = LJLJLJ;
                    if (obj == null) {
                        1Hkv r1 = new 1Hkv();
                        LJLJLJ = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return obj;
    }

    public static Object LLLZIL() {
        return new 1Hbl();
    }

    public static Object LLLZL() {
        return new 1HcO();
    }

    public static Object LLLZLL() {
        return new 1HXk();
    }

    public static Object LLLZLZ() {
        Object obj = LJLJLLL;
        if (obj == null) {
            synchronized (1HPE.class) {
                try {
                    obj = LJLJLLL;
                    if (obj == null) {
                        1HPE r1 = new 1HPE();
                        LJLJLLL = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return obj;
    }

    public static Object LLLZZ() {
        return new 1HYn();
    }

    public static Object LLLZZIL() {
        return new 1HYx();
    }

    public static Object LLZ() {
        return new 1HZ2();
    }

    public static Object LLZIL() {
        return new RecentStickersCache();
    }

    public static Object LLZILL() {
        Object obj = LJLL;
        if (obj == null) {
            synchronized (1HZ6.class) {
                try {
                    obj = LJLL;
                    if (obj == null) {
                        1HZ6 r1 = new 1HZ6();
                        LJLL = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return obj;
    }

    public static Object LLZL() {
        C0YVE c0yve = LJLLI;
        if (c0yve == null) {
            synchronized (C0YVE.class) {
                try {
                    c0yve = LJLLI;
                    if (c0yve == null) {
                        C0YVE c0yve2 = new C0YVE();
                        LJLLI = c0yve2;
                        return c0yve2;
                    }
                } finally {
                }
            }
        }
        return c0yve;
    }

    public static Object LLZLI(C906700Zhc c906700Zhc) {
        C906660ZhY c906660ZhY = LJLLILLLL;
        if (c906660ZhY == null) {
            synchronized (C906660ZhY.class) {
                try {
                    c906660ZhY = LJLLILLLL;
                    if (c906660ZhY == null) {
                        C906660ZhY c906660ZhY2 = new C906660ZhY(c906700Zhc);
                        LJLLILLLL = c906660ZhY2;
                        return c906660ZhY2;
                    }
                } finally {
                }
            }
        }
        return c906660ZhY;
    }

    public static Object LLZLL() {
        C906700Zhc c906700Zhc = LJLLJ;
        if (c906700Zhc == null) {
            synchronized (C906700Zhc.class) {
                try {
                    c906700Zhc = LJLLJ;
                    if (c906700Zhc == null) {
                        C906700Zhc c906700Zhc2 = new C906700Zhc();
                        LJLLJ = c906700Zhc2;
                        return c906700Zhc2;
                    }
                } finally {
                }
            }
        }
        return c906700Zhc;
    }

    public static Object LLZLLIL(C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C01GW c01gw4, C01GW c01gw5, C01GW c01gw6, C01GW c01gw7, C01GW c01gw8, C01GW c01gw9) {
        return new IMRecordCoreViewModel(c01gw, c01gw2, c01gw3, c01gw4, c01gw5, c01gw6, c01gw7, c01gw8, c01gw9);
    }

    public static Object LLZZ() {
        return new Top1AnswerAIGCCardProtocol();
    }

    public static Object LLZZJLIL() {
        return new SearchWholePageSurveyCardProtocol();
    }

    public static Object LLZZLLIL() {
        return new SearchSatisfactionSurveyPhotoProtocol();
    }

    public static Object LLZZZIL() {
        return new SearchSatisfactionSurveyCard();
    }

    public static Object LLZZZZ() {
        return new SearchNimbleCardProtocol();
    }

    public static Object a() {
        return new SearchNimbleMixRankCardProtocol();
    }

    public static Object b() {
        return new Top1SimpleCardProtocol();
    }

    public static Object c() {
        return new SearchOnlineCardLoadingOptProtocol();
    }

    public static Object d() {
        return new SearchOnlinePovCardProtocol();
    }

    public static Object e() {
        return new SearchPovCardProtocol();
    }

    public static Object f() {
        return new Top1OnlineStreamingCardLoadingOptProtocol();
    }

    public static Object g() {
        return new Top1OnlineStreamingCardProtocol();
    }

    public static Object h() {
        return new Top1AnswerExpandCardProtocol();
    }

    public static Object i() {
        return new VisualSearchAiCardProtocol();
    }

    public static Object j() {
        return new VisualSearchTryOnCardProtocol();
    }

    public static Object k() {
        return new FindSimilarDetailsInfoEmptyProtocol();
    }

    public static Object l() {
        return new FindSimilarDetailsInfoLoadingProtocol();
    }

    public static Object m() {
        return new FindSimilarDetailsInfoSuccessProtocol();
    }

    public static Object o() {
        C452680Hp4 c452680Hp4 = LJLLLLLL;
        if (c452680Hp4 == null) {
            synchronized (C452680Hp4.class) {
                try {
                    c452680Hp4 = LJLLLLLL;
                    if (c452680Hp4 == null) {
                        C452680Hp4 c452680Hp42 = new C452680Hp4();
                        LJLLLLLL = c452680Hp42;
                        return c452680Hp42;
                    }
                } finally {
                }
            }
        }
        return c452680Hp4;
    }

    public static Object p() {
        C09U0 c09u0 = LJLZ;
        if (c09u0 == null) {
            synchronized (C09U0.class) {
                try {
                    c09u0 = LJLZ;
                    if (c09u0 == null) {
                        C09U0 c09u0LIZ = C2153208c6.LIZ();
                        LJLZ = c09u0LIZ;
                        return c09u0LIZ;
                    }
                } finally {
                }
            }
        }
        return c09u0;
    }

    public static SelectorContainerVM q(InterfaceC1224320hxu interfaceC1224320hxu, InterfaceC1224360hxy interfaceC1224360hxy, InterfaceC1224370hxz interfaceC1224370hxz, InterfaceC1224310hxt interfaceC1224310hxt, InterfaceC1224160hxe interfaceC1224160hxe) {
        return new SelectorContainerVM(interfaceC1224320hxu, interfaceC1224360hxy, interfaceC1224370hxz, interfaceC1224310hxt, interfaceC1224160hxe);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.051i, java.lang.Object] */
    public static Object r() {
        C12856051i c12856051i = LJZ;
        if (c12856051i == null) {
            synchronized (C12856051i.class) {
                try {
                    c12856051i = LJZ;
                    if (c12856051i == null) {
                        ?? r1 = new InterfaceC1888450zF5() { // from class: X.051i
                            public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1064));

                            @Override // X.InterfaceC1888450zF5
                            public final boolean LIZIZ() {
                                Keva keva = (Keva) this.LIZ.getValue();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("ai_chat_action_bar_first_time_notice");
                                sbLIZ.append(C461720I8s.LIZIZ());
                                return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
                            }

                            @Override // X.InterfaceC1888450zF5
                            public final void LIZJ() {
                                Keva keva = (Keva) this.LIZ.getValue();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("ai_chat_action_bar_first_time_notice");
                                sbLIZ.append(C461720I8s.LIZIZ());
                                keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
                            }

                            @Override // X.InterfaceC1888450zF5
                            public final List<ActionBarButtonConfBusiness> get() {
                                Object objLIZIZ;
                                Keva keva = (Keva) this.LIZ.getValue();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("ai_chat_action_bar");
                                sbLIZ.append(C461720I8s.LIZIZ());
                                String[] stringArray = keva.getStringArray(C2188811AlT.LIZIZ(sbLIZ), null);
                                if (stringArray == null) {
                                    return null;
                                }
                                ArrayList arrayList = new ArrayList();
                                for (String str : stringArray) {
                                    try {
                                        C1227904rF.LIZ.getClass();
                                        objLIZIZ = C1227904rF.LIZIZ(str, ActionBarButtonConfBusiness.class);
                                    } catch (o e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        objLIZIZ = null;
                                    }
                                    if (objLIZIZ != null) {
                                        arrayList.add(objLIZIZ);
                                    }
                                }
                                return arrayList;
                            }

                            @Override // X.InterfaceC1888450zF5
                            public final void LIZ(List<ActionBarButtonConfBusiness> list) {
                                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                                for (ActionBarButtonConfBusiness actionBarButtonConfBusiness : list) {
                                    C1227904rF.LIZ.getClass();
                                    arrayList.add(C1227904rF.LJI(actionBarButtonConfBusiness));
                                }
                                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                                Keva keva = (Keva) this.LIZ.getValue();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("ai_chat_action_bar");
                                sbLIZ.append(C461720I8s.LIZIZ());
                                keva.storeStringArray(C2188811AlT.LIZIZ(sbLIZ), strArr);
                            }
                        };
                        LJZ = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c12856051i;
    }

    public static Object s(C12856051i c12856051i, C1888500zFA c1888500zFA) {
        C1888480zF8 c1888480zF8 = LJZI;
        if (c1888480zF8 == null) {
            synchronized (C1888480zF8.class) {
                try {
                    c1888480zF8 = LJZI;
                    if (c1888480zF8 == null) {
                        C1888480zF8 c1888480zF82 = new C1888480zF8(c12856051i, c1888500zFA);
                        LJZI = c1888480zF82;
                        return c1888480zF82;
                    }
                } finally {
                }
            }
        }
        return c1888480zF8;
    }

    public static Object t() {
        C1888500zFA c1888500zFA = LJZL;
        if (c1888500zFA == null) {
            synchronized (C1888500zFA.class) {
                try {
                    c1888500zFA = LJZL;
                    if (c1888500zFA == null) {
                        C1888500zFA c1888500zFA2 = new C1888500zFA();
                        LJZL = c1888500zFA2;
                        return c1888500zFA2;
                    }
                } finally {
                }
            }
        }
        return c1888500zFA;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0Zdp, java.lang.Object] */
    public static Object u() {
        C904350Zdp c904350Zdp = LL;
        if (c904350Zdp == null) {
            synchronized (C904350Zdp.class) {
                try {
                    c904350Zdp = LL;
                    if (c904350Zdp == null) {
                        ?? r1 = new ISingleMediaVMFactory() { // from class: X.0Zdp
                            @Override // androidx.lifecycle.ViewModelProvider.Factory
                            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                            }

                            @Override // androidx.lifecycle.ViewModelProvider.Factory
                            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                            }

                            @Override // androidx.lifecycle.ViewModelProvider.Factory
                            public final <T extends ViewModel> T create(Class<T> cls) {
                                return new SingleMediaGridViewModel();
                            }
                        };
                        LL = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c904350Zdp;
    }

    public static WalletRechargeService LJIJJLI() {
        return (WalletRechargeService) PluggableExtentionKt.pluggableSpi$default(WalletRechargeService.class, false, false, false, 14, null);
    }

    public static IWalletService LJJI() {
        return (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
    }

    public static Object LLLLLJIL() {
        C1598406Nq c1598406Nq = LJJLIIIJLJLI;
        if (c1598406Nq == null) {
            synchronized (C1598406Nq.class) {
                try {
                    c1598406Nq = LJJLIIIJLJLI;
                    if (c1598406Nq == null) {
                        C2232408os c2232408os = new C2232408os(C823050WQl.LIZLLL());
                        new C2232408os(C823050WQl.LIZJ());
                        C2238608ps c2238608psLIZJ = C2151808bs.LIZJ("fast-main", AnonymousClass0850.LIZ(Looper.getMainLooper(), true));
                        C1DFH c1dfh = C0PEM.LIZ;
                        C1598406Nq c1598406Nq2 = new C1598406Nq(c2232408os, c2238608psLIZJ);
                        LJJLIIIJLJLI = c1598406Nq2;
                        return c1598406Nq2;
                    }
                } finally {
                }
            }
        }
        return c1598406Nq;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0x9f, java.lang.Object] */
    public static Object LLLLLLL() {
        C1808210x9f c1808210x9f = LJJLJLI;
        if (c1808210x9f == null) {
            synchronized (InterfaceC452460Hoi.class) {
                try {
                    c1808210x9f = LJJLJLI;
                    if (c1808210x9f == null) {
                        ?? r1 = new InterfaceC452460Hoi() { // from class: X.0x9f
                            public long LIZLLL;
                            public final C01GW LIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(120));
                            public Pair<? extends EnumC1808220x9g, Long> LIZIZ = new Pair<>(EnumC1808220x9g.LL, 0L);
                            public String LIZJ = "";
                            public final CopyOnWriteArrayList<Pair<String, Map<String, String>>> LJ = new CopyOnWriteArrayList<>();
                            public final ConcurrentHashMap<String, C1808230x9h> LJFF = new ConcurrentHashMap<>();

                            @Override // X.InterfaceC452460Hoi
                            public final void LIZIZ() {
                                EnumC1808220x9g enumC1808220x9g = EnumC1808220x9g.LLILLJJLI;
                                if (this.LIZIZ.getFirst() != enumC1808220x9g) {
                                    LJIIJ();
                                }
                                if (this.LIZIZ.getFirst() == enumC1808220x9g) {
                                    this.LJ.add(new Pair<>("typing_reco_client_processing_time", C2097608Jq.LJIIJ(new Pair("duration", String.valueOf((SystemClock.elapsedRealtime() - this.LIZIZ.getSecond().longValue()) / 1000.0f)))));
                                }
                            }

                            @Override // X.InterfaceC452460Hoi
                            public final void LIZLLL() {
                                if (this.LIZIZ.getFirst() == EnumC1808220x9g.LLILZ) {
                                    this.LJ.add(new Pair<>("typing_reco_server_processing_time", C2097608Jq.LJIIJ(new Pair("duration", String.valueOf((SystemClock.elapsedRealtime() - this.LIZIZ.getSecond().longValue()) / 1000.0f)), new Pair("result", "cancelled"))));
                                }
                                LJIIJ();
                            }

                            @Override // X.InterfaceC452460Hoi
                            public final void LJI() {
                                if (this.LIZIZ.getFirst() != EnumC1808220x9g.LLILLJJLI) {
                                    LJIIJ();
                                }
                                this.LIZIZ = new Pair<>(EnumC1808220x9g.LLILZ, Long.valueOf(SystemClock.elapsedRealtime()));
                            }

                            @Override // X.InterfaceC452460Hoi
                            public final void LJII() {
                                if (this.LIZIZ.getFirst() != EnumC1808220x9g.LL) {
                                    LJIIJ();
                                }
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                this.LIZLLL = jElapsedRealtime;
                                this.LIZIZ = new Pair<>(EnumC1808220x9g.LLILLJJLI, Long.valueOf(jElapsedRealtime));
                            }

                            public final void LJIIJ() {
                                for (Pair<String, Map<String, String>> pair : this.LJ) {
                                    if (this.LIZJ.length() > 0) {
                                        pair.getSecond().put("type", this.LIZJ);
                                    }
                                    ((InterfaceC1493105sv) this.LIZ.getValue()).sendEvent(pair.getFirst(), pair.getSecond());
                                }
                                this.LIZIZ = new Pair<>(EnumC1808220x9g.LL, 0L);
                                this.LIZLLL = 0L;
                                this.LJ.clear();
                                this.LIZJ = "";
                                this.LJFF.clear();
                            }

                            @Override // X.InterfaceC452460Hoi
                            public final void LIZ(boolean z) {
                                String str;
                                if (this.LIZIZ.getFirst() == EnumC1808220x9g.LLILZ) {
                                    long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LIZIZ.getSecond().longValue();
                                    CopyOnWriteArrayList<Pair<String, Map<String, String>>> copyOnWriteArrayList = this.LJ;
                                    Pair[] pairArr = new Pair[2];
                                    pairArr[0] = new Pair("duration", String.valueOf(jElapsedRealtime / 1000.0f));
                                    if (z) {
                                        str = "success";
                                    } else {
                                        str = "failed";
                                    }
                                    pairArr[1] = new Pair("result", str);
                                    copyOnWriteArrayList.add(new Pair<>("typing_reco_server_processing_time", C2097608Jq.LJIIJ(pairArr)));
                                    if (!z) {
                                        LJIIJ();
                                    }
                                }
                            }

                            @Override // X.InterfaceC452460Hoi
                            public final void LJ(boolean z) {
                                Pair<String, Map<String, String>> next;
                                String str;
                                if (this.LIZIZ.getFirst() != EnumC1808220x9g.LLILLJJLI) {
                                    LJIIJ();
                                }
                                if (z) {
                                    this.LIZIZ = new Pair<>(EnumC1808220x9g.LLILLL, Long.valueOf(SystemClock.elapsedRealtime()));
                                }
                                Iterator<Pair<String, Map<String, String>>> it2 = this.LJ.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (Intrinsics.LJFF(next.getFirst(), "typing_reco_client_processing_time")) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                Pair<String, Map<String, String>> pair = next;
                                if (pair != null) {
                                    Map<String, String> second = pair.getSecond();
                                    if (z) {
                                        str = "1";
                                    } else {
                                        str = CardStruct.IStatusCode.DEFAULT;
                                    }
                                    second.put("is_cache_hit", str);
                                }
                            }

                            @Override // X.InterfaceC452460Hoi
                            public final void LJIIIZ(String str) {
                                String str2;
                                this.LIZJ = str;
                                this.LJFF.clear();
                                EnumC1808220x9g first = this.LIZIZ.getFirst();
                                EnumC1808220x9g enumC1808220x9g = EnumC1808220x9g.LLILLL;
                                if ((first == enumC1808220x9g || this.LIZIZ.getFirst() == EnumC1808220x9g.LLILZ) && this.LIZLLL != 0) {
                                    long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LIZLLL;
                                    CopyOnWriteArrayList<Pair<String, Map<String, String>>> copyOnWriteArrayList = this.LJ;
                                    Pair[] pairArr = new Pair[3];
                                    pairArr[0] = new Pair("duration", String.valueOf(jElapsedRealtime / 1000.0f));
                                    pairArr[1] = new Pair("type", str);
                                    if (this.LIZIZ.getFirst() == enumC1808220x9g) {
                                        str2 = "1";
                                    } else {
                                        str2 = CardStruct.IStatusCode.DEFAULT;
                                    }
                                    pairArr[2] = new Pair("is_cache_hit", str2);
                                    copyOnWriteArrayList.add(new Pair<>("typing_reco_panel_display", C2097608Jq.LJIIJ(pairArr)));
                                }
                                this.LIZIZ = new Pair<>(EnumC1808220x9g.LLILZIL, Long.valueOf(SystemClock.elapsedRealtime()));
                            }

                            @Override // X.InterfaceC452460Hoi
                            public final void LJFF(String str, boolean z) {
                                String str2;
                                String str3;
                                C1808230x9h c1808230x9hRemove = this.LJFF.remove(str);
                                if (c1808230x9hRemove != null) {
                                    long jElapsedRealtime = SystemClock.elapsedRealtime() - c1808230x9hRemove.LIZJ;
                                    if (jElapsedRealtime <= 0) {
                                        return;
                                    }
                                    InterfaceC1493105sv interfaceC1493105sv = (InterfaceC1493105sv) this.LIZ.getValue();
                                    Pair[] pairArr = new Pair[4];
                                    pairArr[0] = new Pair("duration", String.valueOf(jElapsedRealtime / 1000.0f));
                                    if (c1808230x9hRemove.LIZ) {
                                        str2 = "1";
                                    } else {
                                        str2 = CardStruct.IStatusCode.DEFAULT;
                                    }
                                    pairArr[1] = new Pair("is_first_page", str2);
                                    pairArr[2] = new Pair("source", String.valueOf(c1808230x9hRemove.LIZIZ));
                                    if (z) {
                                        str3 = "success";
                                    } else {
                                        str3 = "failed";
                                    }
                                    pairArr[3] = new Pair("result", str3);
                                    interfaceC1493105sv.sendEvent("typing_reco_panel_content_item_loading_duration", C2097608Jq.LJIIIIZZ(pairArr));
                                }
                                ConcurrentHashMap<String, C1808230x9h> concurrentHashMap = this.LJFF;
                                if (!concurrentHashMap.isEmpty()) {
                                    Iterator<Map.Entry<String, C1808230x9h>> it2 = concurrentHashMap.entrySet().iterator();
                                    while (it2.hasNext()) {
                                        if (it2.next().getValue().LIZ) {
                                            return;
                                        }
                                    }
                                }
                                if (this.LIZIZ.getFirst() == EnumC1808220x9g.LLILZIL) {
                                    this.LJ.add(new Pair<>("typing_reco_panel_content_loading_duration_100", C2097608Jq.LJIIJ(new Pair("duration", String.valueOf((SystemClock.elapsedRealtime() - this.LIZIZ.getSecond().longValue()) / 1000.0f)))));
                                }
                                LJIIJ();
                            }

                            @Override // X.InterfaceC452460Hoi
                            public final void LJIIIIZZ(String str, boolean z) {
                                this.LJFF.put(str, new C1808230x9h(SystemClock.elapsedRealtime(), z));
                            }

                            @Override // X.InterfaceC452460Hoi
                            public final void LIZJ(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, InterfaceC1493105sv interfaceC1493105sv) {
                                C830490Whz c830490Whz = new C830490Whz();
                                c830490Whz.put("to_user_id", str2);
                                c830490Whz.put("from_user_id", str3);
                                c830490Whz.put("chat_type", str4);
                                c830490Whz.put("conversation_id", str);
                                c830490Whz.put("type", str5);
                                c830490Whz.put("source", str6);
                                c830490Whz.put("has_stored_sticker", str7);
                                c830490Whz.put("delay_time", String.valueOf(j));
                                interfaceC1493105sv.sendEvent("matched_keyword_response", c830490Whz);
                            }
                        };
                        LJJLJLI = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c1808210x9f;
    }

    public static Object LLLLLLZ() {
        C0ZSZ c0zsz = LJJZZIII;
        if (c0zsz == null) {
            synchronized (C0ZSY.class) {
                try {
                    c0zsz = LJJZZIII;
                    if (c0zsz == null) {
                        C1808640xAM.LIZ.getClass();
                        C0ZSZ c0zsz2 = (C0ZSZ) C1808640xAM.LIZLLL.getValue();
                        LJJZZIII = c0zsz2;
                        return c0zsz2;
                    }
                } finally {
                }
            }
        }
        return c0zsz;
    }

    public static Object LLLLLLZZ() {
        C1808790xAb c1808790xAb = LJL;
        if (c1808790xAb == null) {
            synchronized (InterfaceC1808780xAa.class) {
                try {
                    c1808790xAb = LJL;
                    if (c1808790xAb == null) {
                        C1808640xAM.LIZ.getClass();
                        C1808790xAb c1808790xAb2 = (C1808790xAb) C1808640xAM.LJ.getValue();
                        LJL = c1808790xAb2;
                        return c1808790xAb2;
                    }
                } finally {
                }
            }
        }
        return c1808790xAb;
    }

    public static Object LLLLLZ() {
        C450300HlE c450300HlE = LJLI;
        if (c450300HlE == null) {
            synchronized (InterfaceC450290HlD.class) {
                try {
                    c450300HlE = LJLI;
                    if (c450300HlE == null) {
                        C1808640xAM.LIZ.getClass();
                        C450300HlE c450300HlE2 = (C450300HlE) C1808640xAM.LJI.getValue();
                        LJLI = c450300HlE2;
                        return c450300HlE2;
                    }
                } finally {
                }
            }
        }
        return c450300HlE;
    }

    public static Object LLLLLZIL() {
        C1839970xyt c1839970xyt = LJLIIIL;
        if (c1839970xyt == null) {
            synchronized (InterfaceC1839980xyu.class) {
                try {
                    c1839970xyt = LJLIIIL;
                    if (c1839970xyt == null) {
                        C1808640xAM.LIZ.getClass();
                        C1839970xyt c1839970xyt2 = (C1839970xyt) C1808640xAM.LJIIJJI.getValue();
                        LJLIIIL = c1839970xyt2;
                        return c1839970xyt2;
                    }
                } finally {
                }
            }
        }
        return c1839970xyt;
    }

    public static Object LLLLLZL() {
        C1ETJ c1etj = LJLIIL;
        if (c1etj == null) {
            synchronized (C1ETI.class) {
                try {
                    c1etj = LJLIIL;
                    if (c1etj == null) {
                        C1808640xAM.LIZ.getClass();
                        C1ETJ c1etj2 = (C1ETJ) C1808640xAM.LJIIIZ.getValue();
                        LJLIIL = c1etj2;
                        return c1etj2;
                    }
                } finally {
                }
            }
        }
        return c1etj;
    }

    public static Object LLLLZ() {
        C1808690xAR c1808690xAR = LJLIL;
        if (c1808690xAR == null) {
            synchronized (InterfaceC1808700xAS.class) {
                try {
                    c1808690xAR = LJLIL;
                    if (c1808690xAR == null) {
                        C1808640xAM.LIZ.getClass();
                        C1808690xAR c1808690xAR2 = (C1808690xAR) C1808640xAM.LJIIJ.getValue();
                        LJLIL = c1808690xAR2;
                        return c1808690xAR2;
                    }
                } finally {
                }
            }
        }
        return c1808690xAR;
    }

    public static Object LLLLZI() {
        C1808630xAL c1808630xAL = LJLILLLLZI;
        if (c1808630xAL == null) {
            synchronized (InterfaceC1808360x9u.class) {
                try {
                    c1808630xAL = LJLILLLLZI;
                    if (c1808630xAL == null) {
                        C1808640xAM.LIZ.getClass();
                        C1808630xAL c1808630xAL2 = (C1808630xAL) C1808640xAM.LJII.getValue();
                        LJLILLLLZI = c1808630xAL2;
                        return c1808630xAL2;
                    }
                } finally {
                }
            }
        }
        return c1808630xAL;
    }

    public static Object LLLLZIL() {
        C1808740xAW c1808740xAW = LJLJI;
        if (c1808740xAW == null) {
            synchronized (InterfaceC1808750xAX.class) {
                try {
                    c1808740xAW = LJLJI;
                    if (c1808740xAW == null) {
                        C1808640xAM.LIZ.getClass();
                        C1808740xAW c1808740xAW2 = (C1808740xAW) C1808640xAM.LJIIIIZZ.getValue();
                        LJLJI = c1808740xAW2;
                        return c1808740xAW2;
                    }
                } finally {
                }
            }
        }
        return c1808740xAW;
    }

    public static Object LLLLZLL() {
        C1808710xAT c1808710xAT = LJLJJI;
        if (c1808710xAT == null) {
            synchronized (InterfaceC1808720xAU.class) {
                try {
                    c1808710xAT = LJLJJI;
                    if (c1808710xAT == null) {
                        C1808640xAM.LIZ.getClass();
                        C1808710xAT c1808710xAT2 = (C1808710xAT) C1808640xAM.LJFF.getValue();
                        LJLJJI = c1808710xAT2;
                        return c1808710xAT2;
                    }
                } finally {
                }
            }
        }
        return c1808710xAT;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0QzG, java.lang.Object] */
    public static Object LLZLLLL() {
        C688320QzG c688320QzG = LJLLL;
        if (c688320QzG == null) {
            synchronized (InterfaceC688340QzI.class) {
                try {
                    c688320QzG = LJLLL;
                    if (c688320QzG == null) {
                        ?? r1 = new InterfaceC688340QzI() { // from class: X.0QzG
                            @Override // X.InterfaceC688340QzI
                            public final void LIZ(TuxTextView tuxTextView, String str, boolean z) {
                                if (z) {
                                    C337180DJs.LIZJ(tuxTextView);
                                    if (tuxTextView != null) {
                                        if (str == null) {
                                            str = "";
                                        }
                                        tuxTextView.setText(str);
                                        return;
                                    }
                                    return;
                                }
                                C337180DJs.LIZ(tuxTextView);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
                            
                                if (r1 <= r0) goto L34;
                             */
                            @Override // X.InterfaceC688340QzI
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final X.C688350QzJ LIZIZ(com.ss.android.ugc.aweme.feed.model.search.WordStruct r9, boolean r10, com.ss.android.ugc.aweme.feed.model.Aweme r11) {
                                /*
                                    Method dump skipped, instruction units count: 222
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C688320QzG.LIZIZ(com.ss.android.ugc.aweme.feed.model.search.WordStruct, boolean, com.ss.android.ugc.aweme.feed.model.Aweme):X.0QzJ");
                            }
                        };
                        LJLLL = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c688320QzG;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0SKH, java.lang.Object] */
    public static Object n() {
        C0SKH c0skh = LJLLLL;
        if (c0skh == null) {
            synchronized (InterfaceC718660SGy.class) {
                try {
                    c0skh = LJLLLL;
                    if (c0skh == null) {
                        ?? r1 = new InterfaceC718660SGy() { // from class: X.0SKH
                            @Override // X.InterfaceC718660SGy
                            public final boolean LIZ(Context context, Aweme aweme, BannerCommonStruct bannerCommonStruct, CharSequence charSequence, CharSequence charSequence2) {
                                String aid;
                                Integer numValueOf;
                                int iLIZLLL;
                                if (aweme != null) {
                                    aid = aweme.getAid();
                                } else {
                                    aid = null;
                                }
                                boolean z = false;
                                if (aweme != null && Integer.valueOf(aweme.getAwemeType()) != null) {
                                    numValueOf = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLILLIZIL().LJJJIL(context, aweme.getAwemeType(), Boolean.FALSE, null, null);
                                } else {
                                    numValueOf = Integer.valueOf(C418440Gaw.LIZLLL(context));
                                }
                                if (numValueOf != null) {
                                    iLIZLLL = numValueOf.intValue();
                                } else {
                                    iLIZLLL = C418440Gaw.LIZLLL(context);
                                }
                                C418440Gaw.LIZLLL(context);
                                C444830HcP c444830HcP = new C444830HcP();
                                c444830HcP.LJIILIIL(charSequence);
                                c444830HcP.LJII(62);
                                Layout layoutLIZIZ = c444830HcP.LIZIZ();
                                C444830HcP c444830HcP2 = new C444830HcP();
                                c444830HcP2.LJIILIIL(charSequence2);
                                c444830HcP2.LJII(62);
                                if (layoutLIZIZ.getWidth() + c444830HcP2.LIZIZ().getWidth() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) >= iLIZLLL) {
                                    z = true;
                                }
                                C719550SKj.LIZ(bannerCommonStruct).LIZIZ(aid, !z);
                                return C719550SKj.LIZ(bannerCommonStruct).LIZLLL(aid, String.valueOf(charSequence2));
                            }
                        };
                        LJLLLL = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c0skh;
    }

    public static IRechargeApi LJIL() {
        C480460Ism.LIZ().getClass();
        return (IRechargeApi) C480460Ism.LIZLLL(IRechargeApi.class);
    }

    public static IWalletApi LJJ() {
        C480460Ism.LIZ().getClass();
        return (IWalletApi) C480460Ism.LIZLLL(IWalletApi.class);
    }

    public static PcsApi LJJIIJZLJL() {
        C480460Ism.LIZ().getClass();
        return (PcsApi) C480460Ism.LIZLLL(PcsApi.class);
    }
}
