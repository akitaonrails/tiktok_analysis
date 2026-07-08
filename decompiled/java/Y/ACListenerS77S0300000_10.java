package Y;

import X.C07GK;
import X.C0BR5;
import X.C0H46;
import X.C0HBA;
import X.C0OBG;
import X.C0P9N;
import X.C0PCY;
import X.C0PM7;
import X.C0PNW;
import X.C0PRC;
import X.C0PVM;
import X.C0Q00;
import X.C0Q3E;
import X.C0Q6K;
import X.C0Q96;
import X.C0QXR;
import X.C1012300cRw;
import X.C123100dR;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1389910mGz;
import X.C1391190mJ3;
import X.C1440005kM;
import X.C15IK;
import X.C18127078b;
import X.C1826520xdC;
import X.C1949307kJ;
import X.C1ER1;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2189821An6;
import X.C343970De7;
import X.C486180J4u;
import X.C644560PPy;
import X.C645940PVg;
import X.C649960PeU;
import X.C651580Ph6;
import X.C652310PiH;
import X.C653660PkS;
import X.C654500Plo;
import X.C654510Plp;
import X.C654740PmC;
import X.C657450PqZ;
import X.C658210Prn;
import X.C658220Pro;
import X.C658240Prq;
import X.C658280Pru;
import X.C661460Px2;
import X.C661470Px3;
import X.C661490Px5;
import X.C661510Px7;
import X.C661550PxB;
import X.C663990Q2r;
import X.C667750QHd;
import X.C669800QPa;
import X.C672700Qa4;
import X.C672710Qa5;
import X.C672730Qa7;
import X.C672770QaB;
import X.C675840Qf8;
import X.C679990Qlp;
import X.C680990QnR;
import X.C681000QnS;
import X.C681050QnX;
import X.C681320Qny;
import X.C681700Qoa;
import X.C681730Qod;
import X.C681870Qor;
import X.C681880Qos;
import X.C683760Qru;
import X.C786410Ut5;
import X.EnumC669620QOi;
import X.EnumC672720Qa6;
import X.EnumC683800Qry;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC672780QaC;
import X.InterfaceC676430Qg5;
import X.InterfaceC682870QqT;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.components.personalizedtoast.EcomPersonalizedToastAssem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.EComPhotoSearchServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.DetailFeedSearchHelper;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui.SearchMusicHistoryCell;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui.SearchMusicHistoryCellNew;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.ui.SearchMusicSugHistoryCell;
import com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.ui.SearchBarEllipsisAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.viewmodel.FeedbackHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo.UserPhotoHolder;
import com.ss.android.ugc.aweme.search.pages.result.livelist.core.ui.SearchLiveListActivity;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedEcSearchBottomBarAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ACListenerS77S0300000_10 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onClick$13(this, view);
                break;
            case 14:
                onClick$14(this, view);
                break;
            case 15:
                onClick$15(this, view);
                break;
            case 16:
                onClick$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onClick$17(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) {
        String str = TuxSheet._pnsPageId;
        View view2 = ((SearchBarEllipsisAssem) aCListenerS77S0300000_10.l0).LLIZLLLIL;
        if (view2 == null) {
            view2 = null;
        }
        C1391190mJ3.LJ(view2, C343970De7.LIZ);
        FeedbackHelper feedbackHelper = FeedbackHelper.LIZ;
        Context context = ((SearchBarEllipsisAssem) aCListenerS77S0300000_10.l0).getContext();
        View viewLJJIJL = ((SearchBarEllipsisAssem) aCListenerS77S0300000_10.l0).LJJIJL();
        String str2 = ((C0Q96) aCListenerS77S0300000_10.l1).LIZ;
        Map map = (Map) aCListenerS77S0300000_10.l2;
        feedbackHelper.getClass();
        FeedbackHelper.LIZ(context, viewLJJIJL, str2, false, map, null);
    }

    public static final void onClick$1(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) {
        C1389910mGz c1389910mGz = ((EcomPersonalizedToastAssem) aCListenerS77S0300000_10.l0).LL;
        if (c1389910mGz != null) {
            c1389910mGz.LIZJ();
        }
        EnumC683800Qry enumC683800Qry = EnumC683800Qry.TT_DSA_SEARCH_CONSENT;
        Pair[] pairArr = new Pair[2];
        Object obj = ((Map) aCListenerS77S0300000_10.l1).get("enter_from");
        if (obj == null) {
            obj = "";
        }
        pairArr[0] = new Pair("enter_from", obj);
        pairArr[1] = new Pair("enter_method", "click_toast");
        C683760Qru.LIZJ(null, enumC683800Qry, C2097608Jq.LJIIJ(pairArr), new AwS411S0200000_10((EcomPersonalizedToastAssem) aCListenerS77S0300000_10.l0, (EcomPersonalizedToastAssem) aCListenerS77S0300000_10.l2, (Function1<? super Integer, Unit>) 6), new AwS411S0200000_10((EcomPersonalizedToastAssem) aCListenerS77S0300000_10.l0, (EcomPersonalizedToastAssem) aCListenerS77S0300000_10.l2, (Function1<? super Integer, Unit>) 7), false);
    }

    public static final void onClick$10(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) {
        String id;
        String str;
        SearchMusicSugHistoryCell searchMusicSugHistoryCell = (SearchMusicSugHistoryCell) aCListenerS77S0300000_10.l0;
        SearchSugEntity searchSugEntity = (SearchSugEntity) aCListenerS77S0300000_10.l1;
        int layoutPosition = searchMusicSugHistoryCell.getLayoutPosition();
        ((C681000QnS) aCListenerS77S0300000_10.l2).LLILLJJLI.qa(searchMusicSugHistoryCell.getLayoutPosition());
        C681730Qod.LJIILIIL().LIZIZ(new MusicSearchHistory(searchSugEntity.content, 1));
        C680990QnR c680990QnR = new C680990QnR();
        c680990QnR.LIZJ("action_type", "clear");
        c680990QnR.LIZJ("enter_method", "sug");
        Word word = searchSugEntity.mWord;
        if (word == null || (id = word.getId()) == null) {
            id = "";
        }
        c680990QnR.LIZJ("group_id", id);
        Map<String, String> map = searchSugEntity.LJ;
        String str2 = null;
        if (map != null) {
            str = (String) ((ConcurrentHashMap) map).get("raw_query");
        } else {
            str = null;
        }
        c680990QnR.LIZJ("input_keyword", str);
        c680990QnR.LIZ(layoutPosition, "order");
        Map<String, String> map2 = searchSugEntity.LJ;
        if (map2 != null) {
            str2 = (String) ((ConcurrentHashMap) map2).get("impr_id");
        }
        c680990QnR.LIZJ("query_id", str2);
        c680990QnR.LIZJ("search_keyword", searchSugEntity.content);
        c680990QnR.LIZJ("search_type", "video_music");
        c680990QnR.LIZJ("words_type", "history");
        c680990QnR.LIZJ("new_sug_session_id", C681050QnX.LIZ);
        c680990QnR.LIZJ("words_horder", "other");
        C20684815ws.LJIILLIIL("search_trending_click", c680990QnR.LIZ);
    }

    public static final void onClick$11(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) {
        C1826520xdC c1826520xdC = (C1826520xdC) aCListenerS77S0300000_10.l0;
        if (c1826520xdC != null && c1826520xdC.getVisibility() == 8) {
            C1826520xdC c1826520xdC2 = (C1826520xdC) aCListenerS77S0300000_10.l0;
            if (c1826520xdC2 != null) {
                C786410Ut5.LLLZI(c1826520xdC2, 0);
            }
            View view2 = (View) aCListenerS77S0300000_10.l1;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            TuxIconView tuxIconView = (TuxIconView) aCListenerS77S0300000_10.l2;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_chevron_up_thin);
                return;
            }
            return;
        }
        C1826520xdC c1826520xdC3 = (C1826520xdC) aCListenerS77S0300000_10.l0;
        if (c1826520xdC3 != null) {
            C786410Ut5.LLLZI(c1826520xdC3, 8);
        }
        View view3 = (View) aCListenerS77S0300000_10.l1;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        TuxIconView tuxIconView2 = (TuxIconView) aCListenerS77S0300000_10.l2;
        if (tuxIconView2 == null) {
            return;
        }
        tuxIconView2.setIconRes(R.raw.icon_chevron_down_thin);
    }

    public static final void onClick$12(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) {
        boolean z;
        TuxIconView tuxIconView;
        if (C0P9N.LIZ()) {
            return;
        }
        new C667750QHd(((C661470Px3) aCListenerS77S0300000_10.l1).getContext(), C651580Ph6.LIZLLL(((C658280Pru) aCListenerS77S0300000_10.l0).itemView)).LJ();
        C661490Px5 dataProvider = ((C661470Px3) aCListenerS77S0300000_10.l2).getDataProvider();
        if (dataProvider != null && dataProvider.LIZJ != null) {
            C661490Px5 dataProvider2 = ((C661470Px3) aCListenerS77S0300000_10.l2).getDataProvider();
            if (dataProvider2 == null) {
                return;
            }
            if (!C658210Prn.LIZ()) {
                C661510Px7 c661510Px7 = C661510Px7.LIZ;
                boolean zLIZ = C0PNW.LIZ();
                c661510Px7.getClass();
                C661510Px7.LIZ(dataProvider2, zLIZ, false);
            }
        }
        ((C658280Pru) aCListenerS77S0300000_10.l0).X5();
        C658280Pru c658280Pru = (C658280Pru) aCListenerS77S0300000_10.l0;
        Aweme aweme = c658280Pru.LLJJJIL;
        if (aweme != null) {
            C658220Pro.LLJIJIL = aweme.getAid();
            if (C07GK.LIZ() && C0Q6K.LIZ(c658280Pru.LLJJJIL)) {
                z = true;
            } else {
                z = false;
            }
            InterfaceC1631630sYr<? super View, ? super Integer, ? super Aweme, ? super Boolean, Unit> interfaceC1631630sYr = c658280Pru.LLJJJJ;
            if (interfaceC1631630sYr != null) {
                interfaceC1631630sYr.invoke(c658280Pru.itemView, Integer.valueOf(c658280Pru.LLJJJ), aweme, Boolean.valueOf(z));
            }
            C1012300cRw c1012300cRw = c658280Pru.LLJJJJJIL;
            if (c1012300cRw != null) {
                C786410Ut5.r1(c1012300cRw, 8);
            }
            if (C0PNW.LIZ() && (tuxIconView = c658280Pru.LLJJJJLIIL) != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
        }
    }

    public static final void onClick$13(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) {
        TuxIconView tuxIconView;
        boolean z;
        int position;
        new C667750QHd(((C661460Px2) aCListenerS77S0300000_10.l1).getContext(), C651580Ph6.LIZLLL(((UserPhotoHolder) aCListenerS77S0300000_10.l0).itemView)).LJ();
        if (C0P9N.LIZ()) {
            return;
        }
        C661490Px5 dataProvider = ((C661460Px2) aCListenerS77S0300000_10.l2).getDataProvider();
        if (dataProvider != null && dataProvider.LIZJ != null) {
            C661490Px5 dataProvider2 = ((C661460Px2) aCListenerS77S0300000_10.l2).getDataProvider();
            if (dataProvider2 == null) {
                return;
            }
            C661550PxB c661550PxBLJ = dataProvider2.LJ();
            if (c661550PxBLJ != null) {
                C661460Px2 c661460Px2 = ((UserPhotoHolder) aCListenerS77S0300000_10.l0).LLJI;
                if (c661460Px2 != null) {
                    position = c661460Px2.getPosition();
                } else {
                    position = -1;
                }
                c661550PxBLJ.LJ = position;
            }
            if (C658210Prn.LIZ()) {
                ((C661460Px2) aCListenerS77S0300000_10.l2).LJIIIZ();
            } else {
                if (C0PNW.LIZ() && C18127078b.LIZ()) {
                    z = true;
                } else {
                    z = false;
                }
                C661510Px7.LIZ.getClass();
                C661510Px7.LIZ(dataProvider2, z, false);
            }
        }
        UserPhotoHolder userPhotoHolder = (UserPhotoHolder) aCListenerS77S0300000_10.l0;
        Aweme aweme = userPhotoHolder.LLJILJIL;
        if (aweme != null) {
            C1949307kJ.LIZ.LIZJ(aweme);
            C658220Pro.LLJIJIL = aweme.getAid();
            InterfaceC1631620sYq<? super View, ? super Integer, ? super Aweme, Unit> interfaceC1631620sYq = userPhotoHolder.LLJILJILJ;
            if (interfaceC1631620sYq != null) {
                interfaceC1631620sYq.invoke(userPhotoHolder.itemView, Integer.valueOf(userPhotoHolder.LLJJIJI), aweme);
            }
            C1012300cRw c1012300cRw = userPhotoHolder.LLJILLL;
            if (c1012300cRw != null) {
                C786410Ut5.r1(c1012300cRw, 8);
            }
            if (C0PNW.LIZ() && (tuxIconView = userPhotoHolder.LLJJ) != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
        }
    }

    public static final void onClick$14(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) {
        String imprId;
        int i;
        String str;
        String imprId2;
        Context context;
        LogPbBean logPbBean;
        String imprId3;
        C2189821An6 c2189821An6;
        C672700Qa4 c672700Qa4 = InterfaceC672780QaC.LJJJLZIJ;
        String str2 = ((C672770QaB) aCListenerS77S0300000_10.l0).LIZ;
        String str3 = ((VideoItemParams) aCListenerS77S0300000_10.l1).mEventType;
        String str4 = ((C672770QaB) aCListenerS77S0300000_10.l0).LIZIZ;
        LogPbBean logPbBean2 = ((VideoItemParams) aCListenerS77S0300000_10.l1).getAweme().getLogPbBean();
        if (logPbBean2 == null || (imprId = logPbBean2.getImprId()) == null) {
            imprId = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL;
        }
        String groupId = ((VideoItemParams) aCListenerS77S0300000_10.l1).getAweme().getGroupId();
        EnumC672720Qa6 enumC672720Qa6 = ((C672770QaB) aCListenerS77S0300000_10.l0).LIZLLL;
        if (enumC672720Qa6 == null) {
            i = -1;
        } else {
            i = C672710Qa5.LIZ[enumC672720Qa6.ordinal()];
        }
        if (i == 1) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c672700Qa4.getClass();
        C672700Qa4.LIZ("related_search_anchor_v2", str2, str3, str4, imprId, groupId, str);
        FeedEcSearchBottomBarAssem feedEcSearchBottomBarAssem = (FeedEcSearchBottomBarAssem) aCListenerS77S0300000_10.l2;
        VideoItemParams videoItemParams = (VideoItemParams) aCListenerS77S0300000_10.l1;
        C672770QaB c672770QaB = (C672770QaB) aCListenerS77S0300000_10.l0;
        feedEcSearchBottomBarAssem.getClass();
        EnumC672720Qa6 enumC672720Qa62 = c672770QaB.LIZLLL;
        if (enumC672720Qa62 != null) {
            int i2 = C672730Qa7.LIZ[enumC672720Qa62.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    C1ER1 c1er1 = C1ER1.LIZIZ;
                    LogPbBean logPbBean3 = videoItemParams.getAweme().getLogPbBean();
                    if (logPbBean3 == null || (imprId2 = logPbBean3.getImprId()) == null) {
                        imprId2 = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL;
                    }
                    c1er1.LJLLLLLL(imprId2);
                    ConstraintLayout constraintLayout = feedEcSearchBottomBarAssem.LLJLLIL;
                    String tabName = null;
                    if (constraintLayout != null) {
                        context = constraintLayout.getContext();
                    } else {
                        context = null;
                    }
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//search");
                    smartRouteBuildRoute.withParam("in_single_stack", true);
                    smartRouteBuildRoute.withParam("keyword", c672770QaB.LIZ);
                    smartRouteBuildRoute.withParam("is_feed_liked", videoItemParams.getAweme().isLike());
                    smartRouteBuildRoute.withParam("is_feed_collected", AwemeExtKt.isCollected(videoItemParams.getAweme()));
                    smartRouteBuildRoute.withParam("is_feed_comment_clicked", AwemeBizExtKt.isCommentClicked(videoItemParams.getAweme()));
                    smartRouteBuildRoute.withParam("is_feed_forward_clicked", AwemeBizExtKt.isForwardClicked(videoItemParams.getAweme()));
                    smartRouteBuildRoute.withParam("search_position", videoItemParams.mEventType);
                    smartRouteBuildRoute.withParam("back_flag", 1);
                    BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
                    if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
                        tabName = c2189821An6.getTabName();
                    }
                    smartRouteBuildRoute.withParam("tab_name", tabName);
                    if (!c1er1.LLIIIILZ(videoItemParams.mEventType)) {
                        smartRouteBuildRoute.withParam("is_from_video", "1");
                    }
                    smartRouteBuildRoute.withParam("group_id", videoItemParams.getAweme().getAid());
                    Aweme aweme = videoItemParams.getAweme();
                    if (aweme != null && (logPbBean = aweme.getLogPbBean()) != null && (imprId3 = logPbBean.getImprId()) != null) {
                        smartRouteBuildRoute.withParam("preClickImprId", imprId3);
                    }
                    smartRouteBuildRoute.withParam("enter_from", videoItemParams.mEventType);
                    smartRouteBuildRoute.withParam("enter_method", "related_search_anchor_v2");
                    smartRouteBuildRoute.open();
                    return;
                }
            } else {
                feedEcSearchBottomBarAssem.Bp(videoItemParams, c672770QaB);
                return;
            }
        }
        feedEcSearchBottomBarAssem.Bp(videoItemParams, c672770QaB);
    }

    public static final void onClick$15(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) {
        long jLIZ;
        String uid;
        Object objValueOf;
        String uid2;
        int i;
        User author;
        String uid3;
        User author2;
        User author3;
        User author4;
        User author5;
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        Aweme aweme = (Aweme) aCListenerS77S0300000_10.l0;
        if (aweme != null && (author5 = aweme.getAuthor()) != null) {
            jLIZ = C486180J4u.LIZ(author5);
        } else {
            jLIZ = 0;
        }
        C653660PkS c653660PkS = (C653660PkS) aCListenerS77S0300000_10.l1;
        String str = c653660PkS.LJIIJ;
        String str2 = c653660PkS.LJFF;
        String strValueOf = String.valueOf(c653660PkS.LIZLLL);
        Aweme aweme2 = (Aweme) aCListenerS77S0300000_10.l0;
        String str3 = "";
        if (aweme2 == null || (author4 = aweme2.getAuthor()) == null || (uid = author4.getUid()) == null) {
            uid = "";
        }
        Aweme aweme3 = (Aweme) aCListenerS77S0300000_10.l0;
        if (aweme3 == null || (author3 = aweme3.getAuthor()) == null) {
            objValueOf = "";
        } else {
            objValueOf = Long.valueOf(C486180J4u.LIZ(author3));
        }
        String strValueOf2 = String.valueOf(objValueOf);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(jLIZ));
        ArrayList arrayList2 = new ArrayList();
        Aweme aweme4 = (Aweme) aCListenerS77S0300000_10.l0;
        if (aweme4 == null || (author2 = aweme4.getAuthor()) == null || (uid2 = author2.getUid()) == null) {
            uid2 = "";
        }
        arrayList2.add(new RoomInfo(jLIZ, uid2));
        C0Q00 c0q00 = C0Q00.LIZ;
        Context context = GlobalContext.getContext();
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        Aweme aweme5 = (Aweme) aCListenerS77S0300000_10.l0;
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        logData.search_id = str;
        logData.search_keyword = str2;
        logData.search_type = strValueOf;
        logData.search_result_id = uid;
        logData.list_item_id = strValueOf2;
        logData.requestId = str;
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        if (aweme5 != null && (author = aweme5.getAuthor()) != null && (uid3 = author.getUid()) != null) {
            str3 = uid3;
        }
        roomsData.userId = str3;
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        User author6 = aweme5.getAuthor();
        if (author6 != null && author6.isAccuratePrivateAccount()) {
            i = 1;
        } else {
            i = 0;
        }
        roomsData2.isSecret = i;
        enterRoomConfig.mRoomsData.enterMethod = "live_cover";
        String str4 = ((C653660PkS) aCListenerS77S0300000_10.l1).LJIIIIZZ;
        c0q00.getClass();
        C0Q00.LIZIZ(jLIZ, context, enterRoomConfig, str4, arrayList, arrayList2);
        C658240Prq c658240Prq = (C658240Prq) aCListenerS77S0300000_10.l2;
        InterfaceC1631620sYq<View, Integer, Aweme, Unit> interfaceC1631620sYq = c658240Prq.LLILLJJLI;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(view, Integer.valueOf(c658240Prq.LLILZLL), (Aweme) aCListenerS77S0300000_10.l0);
        }
    }

    public static final void onClick$16(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) throws JSONException {
        String wordSource;
        Integer numValueOf;
        String word;
        String str;
        String str2;
        String id;
        String str3;
        String str4;
        Integer numValueOf2;
        Map<String, String> map;
        Integer numValueOf3;
        String id2;
        String id3;
        String str5;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        C0PCY<C0PRC> c0pcyPh12;
        C0PRC c0prc2;
        int iIndexOfChild = ((ViewGroup) aCListenerS77S0300000_10.l0).indexOfChild((View) aCListenerS77S0300000_10.l1);
        C0H46 c0h46 = (C0H46) aCListenerS77S0300000_10.l2;
        RelatedWord relatedWord = (RelatedWord) ListProtector.get(c0h46.LLILLJJLI, iIndexOfChild);
        ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
        C0HBA c0hba = c0h46.LLILLL;
        C0PVM c0pvm = new C0PVM();
        Word word2 = relatedWord.wordRecord;
        String str6 = null;
        if (word2 != null) {
            wordSource = word2.getWordSource();
        } else {
            wordSource = null;
        }
        c0pvm.LJIIZILJ("words_source", wordSource);
        Word word3 = relatedWord.wordRecord;
        if (word3 != null) {
            numValueOf = Integer.valueOf(word3.getWordPosition());
        } else {
            numValueOf = null;
        }
        c0pvm.LJJJJL(numValueOf);
        Word word4 = relatedWord.wordRecord;
        if (word4 != null) {
            word = word4.getWord();
        } else {
            word = null;
        }
        c0pvm.LJIIZILJ("words_content", word);
        if (iSearchContextAbilityLJI != null && (c0pcyPh12 = iSearchContextAbilityLJI.Ph1()) != null && (c0prc2 = (C0PRC) c0pcyPh12.LIZJ()) != null) {
            str = c0prc2.LLIZLLLIL;
        } else {
            str = null;
        }
        c0pvm.LJIIZILJ("raw_query", str);
        if (c0hba != null) {
            str2 = c0hba.searchPosition;
        } else {
            str2 = null;
        }
        c0pvm.LJIIZILJ("search_position", str2);
        Word word5 = relatedWord.wordRecord;
        if (word5 != null) {
            id = word5.getId();
        } else {
            id = null;
        }
        c0pvm.LJIIZILJ("group_id", id);
        if (c0hba != null) {
            str3 = c0hba.imprId;
        } else {
            str3 = null;
        }
        c0pvm.LJIIZILJ("impr_id", str3);
        if (iSearchContextAbilityLJI != null && (c0pcyPh1 = iSearchContextAbilityLJI.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null) {
            str4 = c0prc.LLILLL;
        } else {
            str4 = null;
        }
        c0pvm.LJIIZILJ("search_id", str4);
        if (c0hba != null) {
            numValueOf2 = Integer.valueOf(c0hba.groupPosition);
        } else {
            numValueOf2 = null;
        }
        c0pvm.LJJIL(numValueOf2);
        if (c0hba != null) {
            map = c0hba.extraParams;
        } else {
            map = null;
        }
        c0pvm.LIZIZ(map);
        c0pvm.LJIILJJIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClick pos:");
        Word word6 = relatedWord.wordRecord;
        if (word6 != null) {
            numValueOf3 = Integer.valueOf(word6.getWordPosition());
        } else {
            numValueOf3 = null;
        }
        sbLIZ.append(numValueOf3);
        sbLIZ.append(' ');
        sbLIZ.append(relatedWord.text);
        C2188811AlT.LIZIZ(sbLIZ);
        JSONObject jSONObject = new JSONObject();
        Word word7 = relatedWord.wordRecord;
        if (word7 != null) {
            id2 = word7.getId();
        } else {
            id2 = null;
        }
        JSONObject jSONObjectPut = jSONObject.put("trending_words_group_id", id2);
        Word word8 = relatedWord.wordRecord;
        if (word8 != null) {
            id3 = word8.getId();
        } else {
            id3 = null;
        }
        String strJ3 = C786410Ut5.J3(jSONObjectPut.put("group_id", id3));
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "aweme://search/");
        smartRouteBuildRoute.withParam("keyword", relatedWord.text);
        C0HBA c0hba2 = c0h46.LLILLL;
        if (c0hba2 != null) {
            str5 = c0hba2.searchType;
        } else {
            str5 = null;
        }
        smartRouteBuildRoute.withParam("search_type", str5);
        C0HBA c0hba3 = c0h46.LLILLL;
        if (c0hba3 != null) {
            str6 = c0hba3.imprId;
        }
        smartRouteBuildRoute.withParam("preClickImprId", str6);
        smartRouteBuildRoute.withParam("enter_method", "related_search_keyword");
        smartRouteBuildRoute.withParam("from", "related_search_keyword");
        smartRouteBuildRoute.withParam("previous_page", ((C663990Q2r) iSearchContextAbilityLJI.Ww1().LIZJ()).LL);
        smartRouteBuildRoute.withParam("enter_from", ((C663990Q2r) iSearchContextAbilityLJI.Ww1().LIZJ()).LL);
        smartRouteBuildRoute.withParam("search_session_id", ((C0PM7) iSearchContextAbilityLJI.ak0().LIZJ()).LL);
        smartRouteBuildRoute.withParam("extraLogParams", strJ3);
        String str7 = ((C663990Q2r) iSearchContextAbilityLJI.Ww1().LIZJ()).LLILLJJLI;
        if (C123100dR.LIZ(str7)) {
            smartRouteBuildRoute.withParam("enter_from_sub", str7);
        }
        smartRouteBuildRoute.withParam("penetrate_info", relatedWord.penetrateInfo);
        smartRouteBuildRoute.open();
    }

    public static final void onClick$17(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) {
        InterfaceC682870QqT interfaceC682870QqT = (InterfaceC682870QqT) aCListenerS77S0300000_10.l0;
        if (interfaceC682870QqT != null) {
            interfaceC682870QqT.LJIJJ("1");
        }
        C657450PqZ c657450PqZ = C657450PqZ.LIZ;
        Context context = (Context) aCListenerS77S0300000_10.l1;
        User user = (User) aCListenerS77S0300000_10.l2;
        c657450PqZ.getClass();
        C657450PqZ.LIZ(context, user);
    }

    public static final void onClick$2(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) {
        String strLIZLLL;
        IFamilyPairingService iFamilyPairingServiceLJIIL = ComplianceServiceProvider.LJIIL();
        if (iFamilyPairingServiceLJIIL != null && iFamilyPairingServiceLJIIL.LJIIIZ()) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIIZ(2131834392);
            c1389890mGx.LJIIJJI();
            return;
        }
        String strLLJLILLLLZIIL = C1ER1.LIZIZ.LLJLILLLLZIIL();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((View) aCListenerS77S0300000_10.l0).getContext(), "//search");
        smartRouteBuildRoute.withParam("set_hint_by_sug_word", true);
        smartRouteBuildRoute.withParam("is_from_video", "1");
        smartRouteBuildRoute.withParam("in_single_stack", true);
        smartRouteBuildRoute.withParam("group_id", (String) ((Map) aCListenerS77S0300000_10.l1).get("group_id"));
        smartRouteBuildRoute.withParam("search_session_id", (String) ((Map) aCListenerS77S0300000_10.l1).get("search_session_id"));
        if (((Map) aCListenerS77S0300000_10.l1).containsKey("isTrending")) {
            strLIZLLL = "trending_inflow";
        } else {
            DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LL;
            Map map = (Map) aCListenerS77S0300000_10.l1;
            detailFeedSearchHelper.getClass();
            strLIZLLL = DetailFeedSearchHelper.LIZLLL(map);
            if (Intrinsics.LJFF(strLIZLLL, EnumC669620QOi.PHOTO.getTabName())) {
                strLIZLLL = "search_result";
            }
        }
        smartRouteBuildRoute.withParam("blankpage_enter_from", strLIZLLL);
        Map map2 = (Map) aCListenerS77S0300000_10.l1;
        if (strLLJLILLLLZIIL != null) {
            smartRouteBuildRoute.withParam("enter_blank_page_id", strLLJLILLLLZIIL);
        }
        String str = (String) map2.get("is_from_photo");
        if (str != null) {
            if (Intrinsics.LJFF(str, "1")) {
                smartRouteBuildRoute.withParam("is_from_video", (String) map2.get("is_from_video"));
            }
            smartRouteBuildRoute.withParam("is_from_photo", str);
        }
        String str2 = (String) map2.get("is_enter_graphic_detail");
        if (str2 != null) {
            smartRouteBuildRoute.withParam("is_enter_graphic_detail", str2);
        }
        smartRouteBuildRoute.withParam("blankpage_enter_method", "enter");
        smartRouteBuildRoute.withParam("source_btm_token", BtmSDK.INSTANCE.createJumpSourceBtmToken("c4790.d0", PageFinder.via((View) aCListenerS77S0300000_10.l2), null));
        Map map3 = (Map) aCListenerS77S0300000_10.l1;
        DetailFeedSearchHelper.LL.getClass();
        DetailFeedSearchHelper.LJIIIIZZ(smartRouteBuildRoute, map3);
        String str3 = (String) ((Map) aCListenerS77S0300000_10.l1).get("school_innerfeed_entrance_group_id");
        if (str3 != null) {
            smartRouteBuildRoute.withParam("school_innerfeed_entrance_group_id", str3);
        }
        smartRouteBuildRoute.open();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll((Map) aCListenerS77S0300000_10.l1);
        if (strLLJLILLLLZIIL != null) {
            linkedHashMap.put("blankpage_id", strLLJLILLLLZIIL);
        }
        DetailFeedSearchHelper.LJIILLIIL(linkedHashMap);
    }

    public static final void onClick$3(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) {
        C654740PmC c654740PmCLIZ = C645940PVg.LIZ((C653660PkS) aCListenerS77S0300000_10.l0);
        c654740PmCLIZ.LJIIZILJ("token_type", "live_card");
        c654740PmCLIZ.LJIIZILJ("list_result_type", "live");
        c654740PmCLIZ.LJ("aladdin_words", "live");
        c654740PmCLIZ.LJIJI("search_result_id", ((C653660PkS) aCListenerS77S0300000_10.l0).LJIJI);
        c654740PmCLIZ.LJIIZILJ("aladdin_button_type", "click_more_button");
        c654740PmCLIZ.LJIIZILJ("list_item_id", ((C653660PkS) aCListenerS77S0300000_10.l0).LJIJI);
        c654740PmCLIZ.LJJIIZ(0);
        c654740PmCLIZ.LJJIJL(0);
        c654740PmCLIZ.LJIILJJIL();
        if (!C0BR5.LIZ() || C654510Plp.LIZJ(C1388190mED.LIZIZ(((C652310PiH) aCListenerS77S0300000_10.l1).getContext()))) {
            SearchSecurityControlConfig.LIZ.getClass();
            if (!SearchSecurityControlConfig.LIZIZ().disableLiveTab) {
                String str = SearchLiveListActivity._pnsPageId;
                Context context = GlobalContext.getContext();
                C654500Plo c654500Plo = new C654500Plo();
                C653660PkS c653660PkS = (C653660PkS) aCListenerS77S0300000_10.l0;
                SearchMixFeed searchMixFeed = (SearchMixFeed) aCListenerS77S0300000_10.l2;
                c654500Plo.setSearchKeyword(c653660PkS.LJFF);
                c654500Plo.setEnterFrom(c653660PkS.LJIIIIZZ);
                c654500Plo.setSearchId("searchId");
                c654500Plo.setSearchType("general");
                C0Q00 c0q00 = C0Q00.LIZ;
                List<Aweme> list = searchMixFeed.getCollectionLive().lives;
                c0q00.getClass();
                c654500Plo.setRoomIdList(C0Q00.LJFF(list));
                c654500Plo.setEnterMethod("click_more_general_list");
                C669800QPa.LIZ(context, c654500Plo, C1ER1.LIZIZ.LJJLJ());
                return;
            }
        }
        C644560PPy.LIZ.getClass();
        C1440005kM.LIZ(new C649960PeU(C644560PPy.LJIIL()));
    }

    public static final void onClick$4(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) {
        ((EComPhotoSearchServiceImpl) aCListenerS77S0300000_10.l0).LJII((Context) aCListenerS77S0300000_10.l1, (InterfaceC676430Qg5) aCListenerS77S0300000_10.l2);
        C675840Qf8.LIZLLL(PageFinder.via(BtmSDK.INSTANCE.getCurrentResumedPage()), Integer.valueOf(C0QXR.MALL.getValue()), "mall", "homepage", "", "", null, "c3886.d7767", null);
    }

    public static final void onClick$5(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) {
        C1440005kM.LIZ(new C681700Qoa("clear", C2097608Jq.LJIIIIZZ(new Pair("search_keyword", ((C681870Qor) aCListenerS77S0300000_10.l0).LL.keyword), new Pair("order", String.valueOf(((SearchMusicHistoryCell) aCListenerS77S0300000_10.l1).getLayoutPosition())))));
        C681730Qod.LJIILIIL().LIZIZ((MusicSearchHistory) aCListenerS77S0300000_10.l2);
    }

    public static final void onClick$6(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) {
        C1440005kM.LIZ(new C681700Qoa("click", C2097608Jq.LJIIIIZZ(new Pair("search_keyword", ((C681870Qor) aCListenerS77S0300000_10.l0).LL.keyword), new Pair("order", String.valueOf(((SearchMusicHistoryCell) aCListenerS77S0300000_10.l1).getLayoutPosition())))));
        C679990Qlp c679990Qlp = new C679990Qlp();
        c679990Qlp.LIZ = "search_history";
        c679990Qlp.LIZIZ = ((MusicSearchHistory) aCListenerS77S0300000_10.l2).keyword;
        c679990Qlp.LJIIIIZZ = "other";
        C1440005kM.LIZ(new C681320Qny(c679990Qlp));
    }

    public static final void onClick$7(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) {
        C1440005kM.LIZ(new C681700Qoa("clear", C2097608Jq.LJIIIIZZ(new Pair("search_keyword", ((C681880Qos) aCListenerS77S0300000_10.l0).LL.keyword), new Pair("order", String.valueOf(((SearchMusicHistoryCellNew) aCListenerS77S0300000_10.l1).getLayoutPosition())))));
        C681730Qod.LJIILIIL().LIZIZ((MusicSearchHistory) aCListenerS77S0300000_10.l2);
    }

    public static final void onClick$8(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) {
        C1440005kM.LIZ(new C681700Qoa("click", C2097608Jq.LJIIIIZZ(new Pair("search_keyword", ((C681880Qos) aCListenerS77S0300000_10.l0).LL.keyword), new Pair("order", String.valueOf(((SearchMusicHistoryCellNew) aCListenerS77S0300000_10.l1).getLayoutPosition())))));
        C679990Qlp c679990Qlp = new C679990Qlp();
        c679990Qlp.LIZ = "search_history";
        c679990Qlp.LIZIZ = ((MusicSearchHistory) aCListenerS77S0300000_10.l2).keyword;
        C1440005kM.LIZ(new C681320Qny(c679990Qlp));
    }

    public static final void onClick$9(ACListenerS77S0300000_10 aCListenerS77S0300000_10, View view) {
        String id;
        String str;
        C679990Qlp c679990Qlp = new C679990Qlp();
        c679990Qlp.LIZ = "search_sug";
        c679990Qlp.LIZIZ = ((SearchSugEntity) aCListenerS77S0300000_10.l0).content;
        c679990Qlp.LJIIIIZZ = "other";
        C1440005kM.LIZ(new C681320Qny(c679990Qlp));
        int layoutPosition = ((SearchMusicSugHistoryCell) aCListenerS77S0300000_10.l1).getLayoutPosition();
        SearchSugEntity searchSugEntity = (SearchSugEntity) aCListenerS77S0300000_10.l0;
        C680990QnR c680990QnR = new C680990QnR();
        c680990QnR.LIZJ("words_source", "sug");
        c680990QnR.LIZJ("search_position", "video_music");
        c680990QnR.LIZ(layoutPosition, "words_position");
        c680990QnR.LIZJ("words_content", searchSugEntity.content);
        Word word = searchSugEntity.mWord;
        String id2 = "";
        if (word == null || (id = word.getId()) == null) {
            id = "";
        }
        c680990QnR.LIZJ("group_id", id);
        c680990QnR.LIZJ("creation_id", C15IK.LJ);
        c680990QnR.LIZJ("words_horder", "other");
        c680990QnR.LIZIZ(searchSugEntity.LJ);
        c680990QnR.LIZJ("new_sug_session_id", C681050QnX.LIZ);
        C20684815ws.LJIILLIIL("trending_words_click", c680990QnR.LIZ);
        C680990QnR c680990QnR2 = new C680990QnR();
        c680990QnR2.LIZJ("action_type", "search");
        c680990QnR2.LIZJ("enter_method", "sug");
        Word word2 = searchSugEntity.mWord;
        if (word2 != null) {
            id2 = word2.getId();
        }
        c680990QnR2.LIZJ("group_id", id2);
        Map<String, String> map = searchSugEntity.LJ;
        String str2 = null;
        if (map != null) {
            str = (String) ((ConcurrentHashMap) map).get("raw_query");
        } else {
            str = null;
        }
        c680990QnR2.LIZJ("input_keyword", str);
        c680990QnR2.LIZ(layoutPosition, "order");
        Map<String, String> map2 = searchSugEntity.LJ;
        if (map2 != null) {
            str2 = (String) ((ConcurrentHashMap) map2).get("impr_id");
        }
        c680990QnR2.LIZJ("query_id", str2);
        c680990QnR2.LIZJ("search_keyword", searchSugEntity.content);
        c680990QnR2.LIZJ("search_type", "video_music");
        c680990QnR2.LIZJ("words_type", "history");
        c680990QnR2.LIZJ("new_sug_session_id", C681050QnX.LIZ);
        c680990QnR2.LIZJ("words_horder", "other");
        C20684815ws.LJIILLIIL("search_trending_click", c680990QnR2.LIZ);
        ((C681000QnS) aCListenerS77S0300000_10.l2).LLILLJJLI.x7(((SearchMusicSugHistoryCell) aCListenerS77S0300000_10.l1).getLayoutPosition(), ((SearchSugEntity) aCListenerS77S0300000_10.l0).content);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS77S0300000_10(com.ss.android.ugc.aweme.search.model.SearchSugEntity r2, com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.ui.SearchMusicSugHistoryCell r3, X.C681000QnS r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 9 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            r0.l2 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS77S0300000_10.<init>(com.ss.android.ugc.aweme.search.model.SearchSugEntity, com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.ui.SearchMusicSugHistoryCell, X.0QnS, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS77S0300000_10(Object obj, View view, Map<String, String> map, View view2) {
        this.$t = view2;
        this.l0 = obj;
        this.l1 = view;
        this.l2 = map;
    }
}
