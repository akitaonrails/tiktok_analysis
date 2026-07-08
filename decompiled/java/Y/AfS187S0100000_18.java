package Y;

import X.AbstractC1159440gHG;
import X.AbstractC1623806Xk;
import X.AbstractC1625770sPP;
import X.AbstractC21673619ry;
import X.AbstractC471570IeR;
import X.AnonymousClass0206;
import X.C05P0;
import X.C094D;
import X.C09AJ;
import X.C09JN;
import X.C0XIR;
import X.C1043010dFT;
import X.C1157620gEK;
import X.C1159180gGq;
import X.C1159190gGr;
import X.C1159240gGw;
import X.C1159250gGx;
import X.C1159430gHF;
import X.C1159450gHH;
import X.C1159460gHI;
import X.C1159480gHK;
import X.C1159810gHr;
import X.C1159820gHs;
import X.C1159850gHv;
import X.C1160360gIk;
import X.C1161000gJm;
import X.C1161040gJq;
import X.C1161140gK0;
import X.C1167750gUf;
import X.C1171960gbS;
import X.C1172580gcS;
import X.C1180620gpQ;
import X.C1181290gqV;
import X.C1183520gu6;
import X.C1183600guE;
import X.C1185440gxC;
import X.C1185580gxQ;
import X.C11NZ;
import X.C11S5;
import X.C1201620hNI;
import X.C1204900hSa;
import X.C1206780hVc;
import X.C1245240iVe;
import X.C1258160iqU;
import X.C1367960lha;
import X.C1389890mGx;
import X.C1389910mGz;
import X.C13BV;
import X.C13LP;
import X.C1440005kM;
import X.C1577560r9e;
import X.C1631480sYc;
import X.C1632520saI;
import X.C1632540saK;
import X.C1889907aj;
import X.C189200o6;
import X.C18Z8;
import X.C1954807lC;
import X.C197039127h;
import X.C19EG;
import X.C1C7U;
import X.C20600815jK;
import X.C20603715jn;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C443120HZe;
import X.C491001vg;
import X.C5182020e;
import X.C606810Nr5;
import X.C614900O9w;
import X.C742100T9c;
import X.C786410Ut5;
import X.EnumC1155090gAF;
import X.EnumC1159500gHM;
import X.EnumC1159860gHw;
import X.EnumC1179630gnp;
import X.EnumC1181510gqr;
import X.InterfaceC1159800gHq;
import X.InterfaceC1160790gJR;
import X.InterfaceC1167830gUn;
import X.InterfaceC1167840gUo;
import X.InterfaceC1181380gqe;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC332260D0u;
import Y.ARunnableS8S1100000_2;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetailResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionNameCheckResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.InputNameSheetFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.collaborative.EditCollectionFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.favorites.business.music.raven.RavenMusicCollectionFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minidrama.tab.v2.DramaTopTabMainViewModel;
import com.ss.android.ugc.aweme.mix.api.response.CheckPlayResponse;
import com.ss.android.ugc.aweme.mix.api.response.ManageResponse;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.model.PaidCollectionListResponse;
import com.ss.android.ugc.aweme.model.PaidContentCreatorStatus;
import com.ss.android.ugc.aweme.model.PaidSeriesLiveListResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.ogc.news.managetopics.ManageTopicsContentVM;
import com.ss.android.ugc.aweme.ogc.news.managetopics.repo.ManageTopicsResponse;
import com.ss.android.ugc.aweme.ogc.news.managetopics.repo.TopicPreference;
import com.ss.android.ugc.aweme.ogc.news.managetopics.repo.TopicUpdatePreference;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.viewmodel.PaidSeriesAddedSeriesViewModel;
import com.ss.android.ugc.aweme.paidseries.consumer.viewmodel.PaidSeriesConfirmationPanelViewModel;
import com.ss.android.ugc.aweme.paidseries.consumer.viewmodel.PaidSeriesShopPanelViewModel;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import com.ss.android.ugc.aweme.poi.map.PoiMapViewModel;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailMapAssem;
import com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeMapAssem;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsFoldedReviewsSheetViewModel;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsLandingViewModel;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsUserLevelSheetViewModel;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM;
import com.ss.android.ugc.aweme.setting.serverpush.model.ShouldShowEdmPopup;
import com.ss.android.ugc.aweme.setting.serverpush.model.ShouldShowEdmPopupResp;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.page.SlashFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.nearby.container.NearbyContentAssem;
import com.ss.android.ugc.nearby.roaming.RegionSearchViewModel;
import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HiddenAccountsResponse;
import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HiddenItem;
import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HideAccountViewModel;
import com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderListViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS126S0101000_18;
import kotlin.jvm.internal.AwS142S0101000_2;
import kotlin.jvm.internal.AwS14S1100100_18;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS5S1010000_18;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS69S1000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class AfS187S0100000_18 implements C09JN {
    public final int $t;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                accept$18(this, obj);
                break;
            case 19:
                accept$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                accept$20(this, obj);
                break;
            case 21:
                accept$21(this, obj);
                break;
            case 22:
                accept$22(this, obj);
                break;
            case 23:
                accept$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                accept$24(this, obj);
                break;
            case 25:
                accept$25(this, obj);
                break;
            case 26:
                accept$26(this, obj);
                break;
            case 27:
                accept$27(this, obj);
                break;
            case 28:
                accept$28(this, obj);
                break;
            case 29:
                accept$29(this, obj);
                break;
            case 30:
                accept$30(this, obj);
                break;
            case 31:
                accept$31(this, obj);
                break;
            case 32:
                accept$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                accept$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                accept$34(this, obj);
                break;
            case 35:
                accept$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                accept$36(this, obj);
                break;
            case 37:
                accept$37(this, obj);
                break;
            case 38:
                accept$38(this, obj);
                break;
            case 39:
                accept$39(this, obj);
                break;
            case 40:
                accept$40(this, obj);
                break;
            case 41:
                accept$41(this, obj);
                break;
            case 42:
                accept$42(this, obj);
                break;
            case 43:
                accept$43(this, obj);
                break;
            case 44:
                accept$44(this, obj);
                break;
            case 45:
                accept$45(this, obj);
                break;
            case 46:
                accept$46(this, obj);
                break;
            case 47:
                accept$47(this, obj);
                break;
            case 48:
                accept$48(this, obj);
                break;
            case 49:
                accept$49(this, obj);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                accept$50(this, obj);
                break;
            case 51:
                accept$51(this, obj);
                break;
            case 52:
                accept$52(this, obj);
                break;
            case 53:
                accept$53(this, obj);
                break;
            case 54:
                accept$54(this, obj);
                break;
            case 55:
                accept$55(this, obj);
                break;
            case 56:
                accept$56(this, obj);
                break;
            case 57:
                accept$57(this, obj);
                break;
            case 58:
                accept$58(this, obj);
                break;
            case 59:
                accept$59(this, obj);
                break;
            case 60:
                accept$60(this, obj);
                break;
            case 61:
                accept$61(this, obj);
                break;
            case BaseNotice.CREATOR /* 62 */:
                accept$62(this, obj);
                break;
            case 63:
                accept$63(this, obj);
                break;
            case 64:
                accept$64(this, obj);
                break;
            case 65:
                accept$65(this, obj);
                break;
            case 66:
                accept$66(this, obj);
                break;
            case 67:
                accept$67(this, obj);
                break;
            case 68:
                accept$68(this, obj);
                break;
            case 69:
                accept$69(this, obj);
                break;
            case 70:
                accept$70(this, obj);
                break;
            case 71:
                accept$71(this, obj);
                break;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                accept$72(this, obj);
                break;
            case 73:
                accept$73(this, obj);
                break;
            case 74:
                accept$74(this, obj);
                break;
            case 75:
                accept$75(this, obj);
                break;
            case 76:
                accept$76(this, obj);
                break;
            case 77:
                accept$77(this, obj);
                break;
            case 78:
                accept$78(this, obj);
                break;
            case 79:
                accept$79(this, obj);
                break;
            case 80:
                accept$80(this, obj);
                break;
            case 81:
                accept$81(this, obj);
                break;
            case 82:
                accept$82(this, obj);
                break;
            case 83:
                accept$83(this, obj);
                break;
            case 84:
                accept$84(this, obj);
                break;
            case 85:
                accept$85(this, obj);
                break;
            case 86:
                accept$86(this, obj);
                break;
            case 87:
                accept$87(this, obj);
                break;
            case 88:
                accept$88(this, obj);
                break;
            case 89:
                accept$89(this, obj);
                break;
            case 90:
                accept$90(this, obj);
                break;
            case 91:
                accept$91(this, obj);
                break;
            case 92:
                accept$92(this, obj);
                break;
            case 93:
                accept$93(this, obj);
                break;
            case 94:
                accept$94(this, obj);
                break;
            case 95:
                accept$95(this, obj);
                break;
            case 96:
                accept$96(this, obj);
                break;
            case 97:
                accept$97(this, obj);
                break;
            case 98:
                accept$98(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS187S0100000_18(Object obj, C05P0<Boolean> c05p0) {
        this.$t = c05p0;
        this.l0 = obj;
    }

    public static final void accept$0(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiMapDetailMapAssem@dde8.subscribe$8$4");
        ((PoiMapDetailMapAssem) afS187S0100000_18.l0).uD0(((Integer) obj).intValue());
        C1C7U.LIZIZ("PoiMapDetailMapAssem@dde8.subscribe$8$4");
    }

    public static final void accept$1(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiMapDetailMapAssem@dde8.subscribe$8$5");
        ((PoiMapDetailMapAssem) afS187S0100000_18.l0).uD0(((Integer) obj).intValue());
        C1C7U.LIZIZ("PoiMapDetailMapAssem@dde8.subscribe$8$5");
    }

    public static final void accept$10(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$manageCollection$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/tiktok/collection/item_archive/manage/v1 operation is ");
        sbLIZ.append(((CollectionManageRequest) afS187S0100000_18.l0).operation);
        C1206780hVc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), (Throwable) obj);
        C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$manageCollection$3");
    }

    public static final void accept$11(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        int i;
        C1C7U.LIZ("InputNameSheetFragment@199e.checkNameFromServer$1");
        CollectionNameCheckResponse collectionNameCheckResponse = (CollectionNameCheckResponse) obj;
        C197039127h c197039127h = ((InputNameSheetFragment) afS187S0100000_18.l0).LLILZIL;
        TextView textView = null;
        if (c197039127h == null) {
            c197039127h = null;
        }
        Boolean bool = collectionNameCheckResponse.isValid;
        Boolean bool2 = Boolean.TRUE;
        c197039127h.setEnabled(Intrinsics.LJFF(bool, bool2));
        ImageView imageView = ((InputNameSheetFragment) afS187S0100000_18.l0).LLILLL;
        if (imageView == null) {
            imageView = null;
        }
        boolean z = false;
        C786410Ut5.LJZI(0, imageView);
        TextView textView2 = ((InputNameSheetFragment) afS187S0100000_18.l0).LLILZ;
        if (textView2 == null) {
            textView2 = null;
        }
        if (Intrinsics.LJFF(collectionNameCheckResponse.isValid, bool2)) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LLIL(textView2, i);
        InputNameSheetFragment inputNameSheetFragment = (InputNameSheetFragment) afS187S0100000_18.l0;
        TextView textView3 = inputNameSheetFragment.LLILZ;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setText(inputNameSheetFragment.getText(2131834463));
        TuxSpinner tuxSpinner = ((InputNameSheetFragment) afS187S0100000_18.l0).LL;
        if (tuxSpinner == null) {
            tuxSpinner = null;
        }
        C786410Ut5.LLZILL(tuxSpinner, 8);
        InputNameSheetFragment inputNameSheetFragment2 = (InputNameSheetFragment) afS187S0100000_18.l0;
        AwS589S0100000_10 awS589S0100000_10 = inputNameSheetFragment2.LLJJ;
        if (awS589S0100000_10 != null) {
            TextView textView4 = inputNameSheetFragment2.LLILZ;
            if (textView4 != null) {
                textView = textView4;
            }
            if (textView.getVisibility() == 0) {
                z = true;
            }
            awS589S0100000_10.invoke(Boolean.valueOf(z));
        }
        C1C7U.LIZIZ("InputNameSheetFragment@199e.checkNameFromServer$1");
    }

    public static final void accept$12(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("InputNameSheetFragment@199e.checkNameFromServer$3");
        Throwable th = (Throwable) obj;
        C197039127h c197039127h = ((InputNameSheetFragment) afS187S0100000_18.l0).LLILZIL;
        String string = null;
        if (c197039127h == null) {
            c197039127h = null;
        }
        c197039127h.setEnabled(false);
        ImageView imageView = ((InputNameSheetFragment) afS187S0100000_18.l0).LLILLL;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.LJZI(0, imageView);
        TuxSpinner tuxSpinner = ((InputNameSheetFragment) afS187S0100000_18.l0).LL;
        if (tuxSpinner == null) {
            tuxSpinner = null;
        }
        C786410Ut5.LLZILL(tuxSpinner, 8);
        C1389890mGx c1389890mGx = new C1389890mGx((InputNameSheetFragment) afS187S0100000_18.l0);
        c1389890mGx.LJIIIZ(2131848597);
        c1389890mGx.LJIIJJI();
        Bundle arguments = ((InputNameSheetFragment) afS187S0100000_18.l0).getArguments();
        if (arguments != null) {
            string = arguments.getString("enterFrom");
        }
        C1172580gcS.LIZIZ(string, th);
        C1C7U.LIZIZ("InputNameSheetFragment@199e.checkNameFromServer$3");
    }

    public static final void accept$13(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("VideoCollectionContentViewModel@f4ab.getNextPageVideosInCollection$1$3");
        ((VideoCollectionContentViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 109));
        C1C7U.LIZIZ("VideoCollectionContentViewModel@f4ab.getNextPageVideosInCollection$1$3");
    }

    public static final void accept$14(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("FeedAddToFavoritesPopToast$FavoriteToastSession@c5b9.onShow$1");
        C1389910mGz c1389910mGz = ((C1171960gbS) afS187S0100000_18.l0).LLILLJJLI;
        if (c1389910mGz != null) {
            c1389910mGz.LIZJ();
        }
        ((C1171960gbS) afS187S0100000_18.l0).LIZJ();
        C1C7U.LIZIZ("FeedAddToFavoritesPopToast$FavoriteToastSession@c5b9.onShow$1");
    }

    public static final void accept$15(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("MusicCollectionRavenRequest@a733.request$1$2");
        ((C09AJ) afS187S0100000_18.l0).onError((Throwable) obj);
        C1C7U.LIZIZ("MusicCollectionRavenRequest@a733.request$1$2");
    }

    public static final void accept$16(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("DramaTopTabMainViewModel@c9d0.loadData$3");
        C189200o6 c189200o6 = (C189200o6) obj;
        Object objM10unboximpl = c189200o6.m10unboximpl();
        if (C189200o6.m7isFailureimpl(objM10unboximpl)) {
            objM10unboximpl = null;
        }
        C1577560r9e c1577560r9e = (C1577560r9e) objM10unboximpl;
        if (C189200o6.m8isSuccessimpl(c189200o6.m10unboximpl())) {
            ((DramaTopTabMainViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18(c1577560r9e, 118));
        } else {
            ((DramaTopTabMainViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18(c189200o6, (C189200o6<? extends C1577560r9e>) 119));
        }
        C1C7U.LIZIZ("DramaTopTabMainViewModel@c9d0.loadData$3");
    }

    public static final void accept$17(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("DramaTopTabMainViewModel@c9d0.loadData$4");
        ((DramaTopTabMainViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 120));
        C1C7U.LIZIZ("DramaTopTabMainViewModel@c9d0.loadData$4");
    }

    public static final void accept$18(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("EditPlayListNameEditTextVM@688c.changePlaylistName$1$3");
        ((EditPlayListNameEditTextVM) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 132));
        C1C7U.LIZIZ("EditPlayListNameEditTextVM@688c.changePlaylistName$1$3");
    }

    public static final void accept$19(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("EditPlayListNameEditTextVM@688c.checkPlaylistName$1$2");
        ((EditPlayListNameEditTextVM) afS187S0100000_18.l0).setState(new AwS597S0100000_18((CheckPlayResponse) obj, 135));
        C1C7U.LIZIZ("EditPlayListNameEditTextVM@688c.checkPlaylistName$1$2");
    }

    public static final void accept$2(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PaidSeriesConfirmationPanelViewModel@b728.getPurchasedPaidSeries$1");
        ((PaidSeriesConfirmationPanelViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((PaidCollectionListResponse) obj, 41));
        C1C7U.LIZIZ("PaidSeriesConfirmationPanelViewModel@b728.getPurchasedPaidSeries$1");
    }

    public static final void accept$20(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("EditPlayListNameEditTextVM@688c.checkPlaylistName$1$3");
        ((EditPlayListNameEditTextVM) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 137));
        C1C7U.LIZIZ("EditPlayListNameEditTextVM@688c.checkPlaylistName$1$3");
    }

    public static final void accept$21(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("MixVideosViewModel@67cc.removePlaylist$1");
        if (((BaseResponse) obj).status_code == 0) {
            MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) afS187S0100000_18.l0;
            mixVideosViewModel.getClass();
            mixVideosViewModel.setState(new AwS32S0010000_18(true, 15));
        }
        C1C7U.LIZIZ("MixVideosViewModel@67cc.removePlaylist$1");
    }

    public static final void accept$22(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("MixVideosViewModel@67cc.removePlaylist$2");
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) afS187S0100000_18.l0;
        mixVideosViewModel.getClass();
        mixVideosViewModel.setState(new AwS32S0010000_18(false, 15));
        C1C7U.LIZIZ("MixVideosViewModel@67cc.removePlaylist$2");
    }

    public static final void accept$23(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("MusicDetailService@ecb.findSimilarMusic$1$suggestedMusicList$1$1");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS187S0100000_18.l0;
        C443120HZe c443120HZe = new C443120HZe(obj, null, null);
        C189200o6.m2constructorimpl(c443120HZe);
        interfaceC1364105Vn.resumeWith(c443120HZe);
        C1C7U.LIZIZ("MusicDetailService@ecb.findSimilarMusic$1$suggestedMusicList$1$1");
    }

    public static final void accept$24(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("MusicDetailService@ecb.findSimilarMusic$1$suggestedMusicList$1$2");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS187S0100000_18.l0;
        C443120HZe c443120HZe = new C443120HZe(new SuggestMusicList(), -2, ((Throwable) obj).getMessage());
        C189200o6.m2constructorimpl(c443120HZe);
        interfaceC1364105Vn.resumeWith(c443120HZe);
        C1C7U.LIZIZ("MusicDetailService@ecb.findSimilarMusic$1$suggestedMusicList$1$2");
    }

    public static final void accept$25(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        String str;
        List<TopicPreference> list;
        ManageTopicsResponse.Data data;
        Integer num;
        ManageTopicsResponse.Data data2;
        ManageTopicsResponse.Data data3;
        C1C7U.LIZ("ManageTopicsContentVM@4b1f.handleLoadData$2");
        ManageTopicsResponse manageTopicsResponse = (ManageTopicsResponse) obj;
        ManageTopicsContentVM manageTopicsContentVM = (ManageTopicsContentVM) afS187S0100000_18.l0;
        String str2 = null;
        if (manageTopicsResponse != null && (data3 = manageTopicsResponse.data) != null) {
            str = data3.helpLink;
        } else {
            str = null;
        }
        manageTopicsContentVM.LLILLL = str;
        if (manageTopicsResponse != null && (data2 = manageTopicsResponse.data) != null) {
            list = data2.preferenceList;
        } else {
            list = null;
        }
        List<C1159480gHK> listZQ2 = manageTopicsContentVM.zQ2(list);
        if (listZQ2 != null && !listZQ2.isEmpty()) {
            ((ManageTopicsContentVM) afS187S0100000_18.l0).setState(new AwS597S0100000_18(listZQ2, (List<String>) 202));
            ManageTopicsContentVM manageTopicsContentVM2 = (ManageTopicsContentVM) afS187S0100000_18.l0;
            C1159480gHK c1159480gHK = (C1159480gHK) C13LP.LJJJLL(listZQ2);
            manageTopicsContentVM2.getClass();
            if (c1159480gHK != null) {
                manageTopicsContentVM2.disposeOnClear(C11NZ.LJJJJI(new ACallableS423S0100000_18(manageTopicsContentVM2, 1)).LJJI(300L, TimeUnit.MILLISECONDS).LJJIJIIJIL(new AfS154S0200000_18(manageTopicsContentVM2, c1159480gHK, 28)).LJL(C11S5.LIZ()).LJJLJ());
            }
            if (manageTopicsResponse != null && (data = manageTopicsResponse.data) != null && (num = data.version) != null) {
                ManageTopicsContentVM manageTopicsContentVM3 = (ManageTopicsContentVM) afS187S0100000_18.l0;
                int iIntValue = num.intValue();
                ManageTopicsResponse.Data data4 = manageTopicsResponse.data;
                if (data4 != null) {
                    str2 = data4.versionAlert;
                }
                manageTopicsContentVM3.vQ2(iIntValue, str2);
            }
        } else {
            ((ManageTopicsContentVM) afS187S0100000_18.l0).setState(AFwS256S0000000_18.get$arr$(232));
        }
        C1C7U.LIZIZ("ManageTopicsContentVM@4b1f.handleLoadData$2");
    }

    public static final void accept$26(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("ManageTopicsContentVM@4b1f.handleLoadData$3");
        ((ManageTopicsContentVM) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 203));
        C1C7U.LIZIZ("ManageTopicsContentVM@4b1f.handleLoadData$3");
    }

    public static final void accept$27(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PaidSeriesAddedSeriesViewModel@10d0.onPinClick$1");
        ((PaidSeriesAddedSeriesViewModel) afS187S0100000_18.l0).setState(AFwS256S0000000_18.get$arr$(233));
        C1C7U.LIZIZ("PaidSeriesAddedSeriesViewModel@10d0.onPinClick$1");
    }

    public static final void accept$28(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PaidSeriesAddedSeriesViewModel@10d0.onPinClick$3");
        ((PaidSeriesAddedSeriesViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 204));
        C1C7U.LIZIZ("PaidSeriesAddedSeriesViewModel@10d0.onPinClick$3");
    }

    public static final void accept$29(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PaidSeriesAddedSeriesViewModel@10d0.onRemoveClick$1");
        ((PaidSeriesAddedSeriesViewModel) afS187S0100000_18.l0).setState(AFwS256S0000000_18.get$arr$(234));
        C1C7U.LIZIZ("PaidSeriesAddedSeriesViewModel@10d0.onRemoveClick$1");
    }

    public static final void accept$3(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PaidSeriesConfirmationPanelViewModel@b728.getPurchasedPaidSeries$2");
        ((PaidSeriesConfirmationPanelViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 42));
        C1C7U.LIZIZ("PaidSeriesConfirmationPanelViewModel@b728.getPurchasedPaidSeries$2");
    }

    public static final void accept$30(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PaidSeriesAddedSeriesViewModel@10d0.onRemoveClick$3");
        ((PaidSeriesAddedSeriesViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 205));
        C1C7U.LIZIZ("PaidSeriesAddedSeriesViewModel@10d0.onRemoveClick$3");
    }

    public static final void accept$31(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PaidSeriesAddedSeriesViewModel@10d0.onTopClick$1");
        ((PaidSeriesAddedSeriesViewModel) afS187S0100000_18.l0).setState(AFwS256S0000000_18.get$arr$(235));
        C1C7U.LIZIZ("PaidSeriesAddedSeriesViewModel@10d0.onTopClick$1");
    }

    public static final void accept$32(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PaidSeriesAddedSeriesViewModel@10d0.onTopClick$3");
        ((PaidSeriesAddedSeriesViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 206));
        C1C7U.LIZIZ("PaidSeriesAddedSeriesViewModel@10d0.onTopClick$3");
    }

    public static final void accept$33(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PaidSeriesAddedSeriesViewModel@10d0.onUnpinClick$1");
        ((PaidSeriesAddedSeriesViewModel) afS187S0100000_18.l0).setState(AFwS256S0000000_18.get$arr$(236));
        C1C7U.LIZIZ("PaidSeriesAddedSeriesViewModel@10d0.onUnpinClick$1");
    }

    public static final void accept$34(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PaidSeriesAddedSeriesViewModel@10d0.onUnpinClick$3");
        ((PaidSeriesAddedSeriesViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 207));
        C1C7U.LIZIZ("PaidSeriesAddedSeriesViewModel@10d0.onUnpinClick$3");
    }

    public static final void accept$35(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PaidSeriesShopPanelViewModel@826c.getLivePaidSeriesList$1");
        ((PaidSeriesShopPanelViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((PaidSeriesLiveListResponse) obj, 214));
        C1C7U.LIZIZ("PaidSeriesShopPanelViewModel@826c.getLivePaidSeriesList$1");
    }

    public static final void accept$36(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiActivityViewModel@6aee.fetchAddLocationActivityInfo$1$res$1");
        PoiActivityApi.PoiActivityBaseResponse poiActivityBaseResponse = (PoiActivityApi.PoiActivityBaseResponse) obj;
        PoiActivityApi.PoiActivityResponse poiActivityResponse = poiActivityBaseResponse.data;
        if (poiActivityResponse != null && poiActivityResponse.bannersList != null) {
            ((PoiActivityViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18(poiActivityBaseResponse, 220));
        }
        C1C7U.LIZIZ("PoiActivityViewModel@6aee.fetchAddLocationActivityInfo$1$res$1");
    }

    public static final void accept$37(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiDetailSlashFragment@9df6.onCreate$3");
        if (((C606810Nr5) obj).LIZIZ) {
            ((PoiDetailSlashFragment) afS187S0100000_18.l0).ZW(true);
            PoiDetailSlashFragment poiDetailSlashFragment = (PoiDetailSlashFragment) afS187S0100000_18.l0;
            C1185580gxQ.LIZ(poiDetailSlashFragment.LLLLZLLIL, new AwS597S0100000_18(poiDetailSlashFragment, 324));
            ((PoiDetailSlashFragment) afS187S0100000_18.l0).LLLLZ = System.currentTimeMillis();
            ((PoiDetailSlashFragment) afS187S0100000_18.l0).LLLZZIL = System.currentTimeMillis();
            ((PoiDetailSlashFragment) afS187S0100000_18.l0).LLLLLZL = 0L;
        } else if (((PoiDetailSlashFragment) afS187S0100000_18.l0).LLLLZ != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            PoiDetailSlashFragment poiDetailSlashFragment2 = (PoiDetailSlashFragment) afS187S0100000_18.l0;
            if (jCurrentTimeMillis > poiDetailSlashFragment2.LLLLZ) {
                poiDetailSlashFragment2.LLLLLZL += System.currentTimeMillis() - ((PoiDetailSlashFragment) afS187S0100000_18.l0).LLLLZ;
            }
        }
        C1C7U.LIZIZ("PoiDetailSlashFragment@9df6.onCreate$3");
    }

    public static final void accept$38(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiReviewsFoldedReviewsSheetViewModel@7c66.fetchFoldedReviews$2");
        PoiReviewsApi.PoiReviewsFoldedReviewsResponse poiReviewsFoldedReviewsResponse = (PoiReviewsApi.PoiReviewsFoldedReviewsResponse) obj;
        if (poiReviewsFoldedReviewsResponse != null && poiReviewsFoldedReviewsResponse.status_code == 0) {
            ((PoiReviewsFoldedReviewsSheetViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18(poiReviewsFoldedReviewsResponse, 476));
        }
        C1C7U.LIZIZ("PoiReviewsFoldedReviewsSheetViewModel@7c66.fetchFoldedReviews$2");
    }

    public static final void accept$39(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiReviewsFoldedReviewsSheetViewModel@7c66.fetchFoldedReviews$3");
        ((PoiReviewsFoldedReviewsSheetViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 477));
        C1C7U.LIZIZ("PoiReviewsFoldedReviewsSheetViewModel@7c66.fetchFoldedReviews$3");
    }

    public static final void accept$4(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        int size;
        List<MixStruct> mixList;
        C1C7U.LIZ("AddFeedVideoToMixHelper@fc03.getFirstMixList$result$2");
        InterfaceC1167830gUn interfaceC1167830gUn = (InterfaceC1167830gUn) afS187S0100000_18.l0;
        C1167750gUf.LIZ.getClass();
        MixListResponse mixListResponse = C1167750gUf.LIZIZ;
        if (mixListResponse != null && (mixList = mixListResponse.getMixList()) != null) {
            size = mixList.size();
        } else {
            size = 0;
        }
        interfaceC1167830gUn.LIZ(size, false);
        C1C7U.LIZIZ("AddFeedVideoToMixHelper@fc03.getFirstMixList$result$2");
    }

    public static final void accept$40(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PushSettingsLoginVM@db7f.sendRequest$4");
        Throwable th = (Throwable) obj;
        C1245240iVe c1245240iVe = C1245240iVe.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch push data fail ");
        sbLIZ.append(th);
        sbLIZ.append(", show error page");
        C2188811AlT.LIZIZ(sbLIZ);
        c1245240iVe.getClass();
        ((PushSettingsLoginVM) afS187S0100000_18.l0).setState(new AwS609S0100000_30(th, 83));
        C1C7U.LIZIZ("PushSettingsLoginVM@db7f.sendRequest$4");
    }

    public static final void accept$41(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("SlashDataProcessor@f64e.preload$1$1");
        SlashApiResponse slashApiResponse = (SlashApiResponse) obj;
        if (slashApiResponse != null) {
            ((C09AJ) afS187S0100000_18.l0).onNext(C1181290gqV.LIZ(slashApiResponse, false));
        }
        C1C7U.LIZIZ("SlashDataProcessor@f64e.preload$1$1");
    }

    public static final void accept$42(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("SlashDataProcessor@f64e.preload$1$2");
        ((C09AJ) afS187S0100000_18.l0).onError((Throwable) obj);
        C1C7U.LIZIZ("SlashDataProcessor@f64e.preload$1$2");
    }

    public static final void accept$43(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("SlashFragment@ca1a.startPreload$1$1");
        C1180620gpQ c1180620gpQ = (C1180620gpQ) obj;
        ((SlashFragment) afS187S0100000_18.l0).XU(c1180620gpQ);
        SlashFragment.rU((SlashFragment) afS187S0100000_18.l0, c1180620gpQ, false, false, false, false, 28, null);
        C1C7U.LIZIZ("SlashFragment@ca1a.startPreload$1$1");
    }

    public static final void accept$44(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("CameraLogicVisibilityBridge@3330.onCreate$1$1");
        EnumC1159860gHw enumC1159860gHw = (EnumC1159860gHw) obj;
        if (enumC1159860gHw != null) {
            int i = C1159820gHs.LIZ[enumC1159860gHw.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3 || i == 4) {
                    InterfaceC332260D0u<C1632540saK> interfaceC332260D0u = ((C1632520saI) afS187S0100000_18.l0).LLILZIL;
                    interfaceC332260D0u.LIZJ(C1632540saK.LIZ(interfaceC332260D0u.getValue(), false, false, 1));
                }
            } else {
                InterfaceC332260D0u<C1632540saK> interfaceC332260D0u2 = ((C1632520saI) afS187S0100000_18.l0).LLILZIL;
                interfaceC332260D0u2.LIZJ(C1632540saK.LIZ(interfaceC332260D0u2.getValue(), false, true, 1));
            }
            C1C7U.LIZIZ("CameraLogicVisibilityBridge@3330.onCreate$1$1");
            return;
        }
        throw new C1954807lC();
    }

    public static final void accept$45(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("ChildEffectButtonComponent@45ab.onCreate$5$1");
        EnumC1159860gHw enumC1159860gHw = (EnumC1159860gHw) obj;
        if (enumC1159860gHw != null) {
            int i = C1159850gHv.LIZ[enumC1159860gHw.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ((C1631480sYc) afS187S0100000_18.l0).T2();
                }
            } else {
                ((C1631480sYc) afS187S0100000_18.l0).W2();
            }
        }
        C1C7U.LIZIZ("ChildEffectButtonComponent@45ab.onCreate$5$1");
    }

    public static final void accept$46(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("NearbyContentAssem@bf9f.onViewCreated$1");
        if (((C606810Nr5) obj).LIZIZ) {
            if (((NearbyContentAssem) afS187S0100000_18.l0).No()) {
                C1204900hSa.LIZ.getClass();
                if (C1204900hSa.LIZLLL) {
                    C1204900hSa.LIZ();
                    C1204900hSa.LJ(null);
                }
            }
        } else if (((NearbyContentAssem) afS187S0100000_18.l0).No()) {
            C1204900hSa c1204900hSa = C1204900hSa.LIZ;
            Long lValueOf = Long.valueOf(System.currentTimeMillis());
            c1204900hSa.getClass();
            C1204900hSa.LJ(lValueOf);
        }
        C1C7U.LIZIZ("NearbyContentAssem@bf9f.onViewCreated$1");
    }

    public static final void accept$47(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("NearbyRepository@94f4.operator$1$fetchNearbyDataChunk$1$dispose$2");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchNearbyDataChunk error2: ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        ((C094D) afS187S0100000_18.l0).LJIIJJI(th);
        C1C7U.LIZIZ("NearbyRepository@94f4.operator$1$fetchNearbyDataChunk$1$dispose$2");
    }

    public static final void accept$48(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("RegionSearchViewModel@e768.fetchNearbyRegionList$3");
        C1201620hNI c1201620hNI = C1201620hNI.LIZ;
        c1201620hNI.getClass();
        c1201620hNI.LIZJ("nearby_revamp_change_region", new C1183600guE(false, -1, 0));
        ((RegionSearchViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 615));
        C1C7U.LIZIZ("RegionSearchViewModel@e768.fetchNearbyRegionList$3");
    }

    public static final void accept$49(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("HideAccountViewModel@96be.refreshHiddenAccounts$2");
        HiddenAccountsResponse hiddenAccountsResponse = (HiddenAccountsResponse) obj;
        ((HideAccountViewModel) afS187S0100000_18.l0).LLILLL = hiddenAccountsResponse.getHasMore();
        ((HideAccountViewModel) afS187S0100000_18.l0).LLILLJJLI = hiddenAccountsResponse.getNextPageToken();
        List<HiddenItem> hiddenItems = hiddenAccountsResponse.getHiddenItems();
        if (hiddenItems == null) {
            hiddenItems = C13BV.INSTANCE;
        }
        if (!hiddenItems.isEmpty()) {
            ((HideAccountViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18(hiddenItems, (List<String>) 629));
        } else {
            ((HideAccountViewModel) afS187S0100000_18.l0).setState(AFwS256S0000000_18.get$arr$(829));
        }
        C1C7U.LIZIZ("HideAccountViewModel@96be.refreshHiddenAccounts$2");
    }

    public static final void accept$5(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("AddFeedVideoToMixHelper@fc03.getMixListNumber$result$2");
        InterfaceC1167840gUo interfaceC1167840gUo = (InterfaceC1167840gUo) afS187S0100000_18.l0;
        C1167750gUf.LIZ.getClass();
        ((C1258160iqU) interfaceC1167840gUo).LIZ(false, C1167750gUf.LIZIZ);
        C1C7U.LIZIZ("AddFeedVideoToMixHelper@fc03.getMixListNumber$result$2");
    }

    public static final void accept$50(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("HideAccountViewModel@96be.refreshHiddenAccounts$3");
        HideAccountViewModel hideAccountViewModel = (HideAccountViewModel) afS187S0100000_18.l0;
        hideAccountViewModel.LLILLL = false;
        hideAccountViewModel.setState(new AwS597S0100000_18((Throwable) obj, 630));
        C1C7U.LIZIZ("HideAccountViewModel@96be.refreshHiddenAccounts$3");
    }

    public static final void accept$51(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("InfoStickerProviderListViewModel$SearchListViewModel@17aa.requestDataActual$2");
        ((InfoStickerProviderListViewModel.SearchListViewModel) afS187S0100000_18.l0).LLJI.setValue(((Pair) obj).getSecond());
        ((InfoStickerProviderListViewModel.SearchListViewModel) afS187S0100000_18.l0).getClass();
        C1C7U.LIZIZ("InfoStickerProviderListViewModel$SearchListViewModel@17aa.requestDataActual$2");
    }

    public static final void accept$52(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("InfoStickerProviderListViewModel$SearchListViewModel@17aa.requestMoreDataActual$1");
        ((InfoStickerProviderListViewModel.SearchListViewModel) afS187S0100000_18.l0).LLJI.setValue(((Pair) obj).getSecond());
        C1C7U.LIZIZ("InfoStickerProviderListViewModel$SearchListViewModel@17aa.requestMoreDataActual$1");
    }

    public static final void accept$53(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("InfoStickerProviderListViewModel$TrendListViewModel@2de.requestDataActual$2");
        ((InfoStickerProviderListViewModel.TrendListViewModel) afS187S0100000_18.l0).LLIZ.setValue(((Pair) obj).getSecond());
        ((InfoStickerProviderListViewModel.TrendListViewModel) afS187S0100000_18.l0).getClass();
        C1C7U.LIZIZ("InfoStickerProviderListViewModel$TrendListViewModel@2de.requestDataActual$2");
    }

    public static final void accept$54(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("InfoStickerProviderListViewModel$TrendListViewModel@2de.requestMoreDataActual$1");
        ((InfoStickerProviderListViewModel.TrendListViewModel) afS187S0100000_18.l0).LLIZ.setValue(((Pair) obj).getSecond());
        C1C7U.LIZIZ("InfoStickerProviderListViewModel$TrendListViewModel@2de.requestMoreDataActual$1");
    }

    public static final void accept$55(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiRevisitViewModel@2086.updateCollectStatusToServer$1$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.status_code == 0) {
            C614900O9w c614900O9w = (C614900O9w) afS187S0100000_18.l0;
            c614900O9w.getClass();
            C1440005kM.LIZ(c614900O9w);
        }
        C1C7U.LIZIZ("PoiRevisitViewModel@2086.updateCollectStatusToServer$1$1");
    }

    public static final void accept$56(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        InterfaceC1160790gJR interfaceC1160790gJR;
        C1C7U.LIZ("RavenDataProcessor@25d7.realRequest$1$1");
        C1161000gJm c1161000gJm = (C1161000gJm) obj;
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenDataProcessor", new AwS562S0100000_18(c1161000gJm, 2530));
        InterfaceC1160790gJR interfaceC1160790gJR2 = (InterfaceC1160790gJR) afS187S0100000_18.l0;
        if (interfaceC1160790gJR2 != null) {
            interfaceC1160790gJR2.LJIIIIZZ(c1161000gJm);
        }
        if (c1161000gJm != null && (interfaceC1160790gJR = (InterfaceC1160790gJR) afS187S0100000_18.l0) != null) {
            interfaceC1160790gJR.LJ(c1161000gJm);
        }
        C1C7U.LIZIZ("RavenDataProcessor@25d7.realRequest$1$1");
    }

    public static final void accept$57(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        InterfaceC1160790gJR interfaceC1160790gJR;
        C1C7U.LIZ("RavenDataProcessor@25d7.submitFirstScreenResponse$1$1");
        C1161000gJm c1161000gJm = (C1161000gJm) obj;
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenDataProcessor", new AwS562S0100000_18(c1161000gJm, 2531));
        InterfaceC1160790gJR interfaceC1160790gJR2 = (InterfaceC1160790gJR) afS187S0100000_18.l0;
        if (interfaceC1160790gJR2 != null) {
            interfaceC1160790gJR2.LJIIIIZZ(c1161000gJm);
        }
        if (c1161000gJm != null && (interfaceC1160790gJR = (InterfaceC1160790gJR) afS187S0100000_18.l0) != null) {
            interfaceC1160790gJR.LJ(c1161000gJm);
        }
        C1C7U.LIZIZ("RavenDataProcessor@25d7.submitFirstScreenResponse$1$1");
    }

    public static final void accept$58(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("RavenVm@b7c8.loadMore$3");
        C1161040gJq c1161040gJq = (C1161040gJq) obj;
        InterfaceC1160790gJR interfaceC1160790gJR = (InterfaceC1160790gJR) afS187S0100000_18.l0;
        if (interfaceC1160790gJR != null) {
            interfaceC1160790gJR.LIZLLL(c1161040gJq);
        }
        C1C7U.LIZIZ("RavenVm@b7c8.loadMore$3");
    }

    public static final void accept$59(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("RavenVm@b7c8.loadMore$4");
        Throwable th = (Throwable) obj;
        InterfaceC1160790gJR interfaceC1160790gJR = (InterfaceC1160790gJR) afS187S0100000_18.l0;
        if (interfaceC1160790gJR != null) {
            interfaceC1160790gJR.onError(th);
        }
        C1C7U.LIZIZ("RavenVm@b7c8.loadMore$4");
    }

    public static final void accept$6(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        String strLIZIZ;
        C1C7U.LIZ("AdsPreviewFragment@968c.showPreviewSuccessView$1");
        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).clearCache();
        Context context = ((AdsPreviewFragment) afS187S0100000_18.l0).getContext();
        String str = ((AdsPreviewFragment) afS187S0100000_18.l0).MR().LLIZ;
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("//search?keyword=");
            sbLIZ.append(str);
            sbLIZ.append("&enter_method=click_preview&enter_from=scan_preview");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "//main";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, strLIZIZ);
        smartRouteBuildRoute.addFlags(268468224);
        smartRouteBuildRoute.open();
        C19EG activity = ((AdsPreviewFragment) afS187S0100000_18.l0).getActivity();
        if (activity != null) {
            activity.finish();
        }
        C1C7U.LIZIZ("AdsPreviewFragment@968c.showPreviewSuccessView$1");
    }

    public static final void accept$60(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("RavenVm@b7c8.processManualLoadMoreAndInsert$2");
        C1161040gJq c1161040gJq = (C1161040gJq) obj;
        InterfaceC1160790gJR interfaceC1160790gJR = (InterfaceC1160790gJR) afS187S0100000_18.l0;
        if (interfaceC1160790gJR != null) {
            interfaceC1160790gJR.LIZLLL(c1161040gJq);
        }
        C1C7U.LIZIZ("RavenVm@b7c8.processManualLoadMoreAndInsert$2");
    }

    public static final void accept$61(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        InterfaceC1160790gJR interfaceC1160790gJR;
        C1C7U.LIZ("RavenDataProcessor@25d7.processManualLoadMoreAndInsert$2");
        C1161000gJm c1161000gJm = (C1161000gJm) obj;
        InterfaceC1160790gJR interfaceC1160790gJR2 = (InterfaceC1160790gJR) afS187S0100000_18.l0;
        if (interfaceC1160790gJR2 != null) {
            interfaceC1160790gJR2.LJIIIIZZ(c1161000gJm);
        }
        if (c1161000gJm != null && (interfaceC1160790gJR = (InterfaceC1160790gJR) afS187S0100000_18.l0) != null) {
            interfaceC1160790gJR.LJ(c1161000gJm);
        }
        C1C7U.LIZIZ("RavenDataProcessor@25d7.processManualLoadMoreAndInsert$2");
    }

    public static final void accept$62(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("RavenDataProcessor@25d7.processManualLoadMoreAndInsert$4");
        Throwable th = (Throwable) obj;
        InterfaceC1160790gJR interfaceC1160790gJR = (InterfaceC1160790gJR) afS187S0100000_18.l0;
        if (interfaceC1160790gJR != null) {
            interfaceC1160790gJR.onError(th);
        }
        C1C7U.LIZIZ("RavenDataProcessor@25d7.processManualLoadMoreAndInsert$4");
    }

    public static final void accept$63(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("HideAccountViewModel@96be.loadMoreHiddenAccounts$2");
        HiddenAccountsResponse hiddenAccountsResponse = (HiddenAccountsResponse) obj;
        ((HideAccountViewModel) afS187S0100000_18.l0).LLILLL = hiddenAccountsResponse.getHasMore();
        ((HideAccountViewModel) afS187S0100000_18.l0).LLILLJJLI = hiddenAccountsResponse.getNextPageToken();
        List<HiddenItem> hiddenItems = hiddenAccountsResponse.getHiddenItems();
        if (hiddenItems == null) {
            hiddenItems = C13BV.INSTANCE;
        }
        if (!hiddenItems.isEmpty()) {
            ((HideAccountViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18(hiddenItems, (List<String>) 809));
        } else {
            ((HideAccountViewModel) afS187S0100000_18.l0).setState(AFwS256S0000000_18.get$arr$(901));
        }
        C1C7U.LIZIZ("HideAccountViewModel@96be.loadMoreHiddenAccounts$2");
    }

    public static final void accept$64(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("HideAccountViewModel@96be.loadMoreHiddenAccounts$3");
        HideAccountViewModel hideAccountViewModel = (HideAccountViewModel) afS187S0100000_18.l0;
        hideAccountViewModel.LLILLL = false;
        hideAccountViewModel.setState(new AwS597S0100000_18((Throwable) obj, 810));
        C1C7U.LIZIZ("HideAccountViewModel@96be.loadMoreHiddenAccounts$3");
    }

    public static final void accept$65(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        String string;
        C1C7U.LIZ("HideAccountViewModel@96be.hideOrUnHideAccount$2$2");
        Throwable th = (Throwable) obj;
        if (th instanceof C0XIR) {
            string = ((C0XIR) th).getErrorMsg();
        } else {
            string = ((HideAccountViewModel) afS187S0100000_18.l0).vQ2().getString(R.string.m25);
        }
        ((HideAccountViewModel) afS187S0100000_18.l0).setState(new AwS69S1000000_18(string, 14));
        C1C7U.LIZIZ("HideAccountViewModel@96be.hideOrUnHideAccount$2$2");
    }

    public static final void accept$66(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiMapDetailPageVM@b8ac.updateCollectStatusToServer$1$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.status_code == 0) {
            C614900O9w c614900O9w = (C614900O9w) afS187S0100000_18.l0;
            c614900O9w.getClass();
            C1440005kM.LIZ(c614900O9w);
        }
        C1C7U.LIZIZ("PoiMapDetailPageVM@b8ac.updateCollectStatusToServer$1$1");
    }

    public static final void accept$67(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiReviewsLandingViewModel@ad2c.fetchEligible$1");
        PoiReviewsApi.PoiReviewEligibleResponse poiReviewEligibleResponse = (PoiReviewsApi.PoiReviewEligibleResponse) obj;
        if (poiReviewEligibleResponse != null && poiReviewEligibleResponse.status_code == 0) {
            PoiReviewsLandingViewModel poiReviewsLandingViewModel = (PoiReviewsLandingViewModel) afS187S0100000_18.l0;
            if (poiReviewsLandingViewModel.LLJJI == null) {
                poiReviewsLandingViewModel.LLJJI = poiReviewEligibleResponse.collectInfo;
            }
            poiReviewsLandingViewModel.setState(new AwS384S0200000_18(poiReviewEligibleResponse, poiReviewsLandingViewModel, 224));
        }
        C1C7U.LIZIZ("PoiReviewsLandingViewModel@ad2c.fetchEligible$1");
    }

    public static final void accept$68(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiReviewsLandingViewModel@ad2c.fetchReviewStatistics$1");
        PoiReviewsApi.PoiReviewStatisticsResponse poiReviewStatisticsResponse = (PoiReviewsApi.PoiReviewStatisticsResponse) obj;
        if (poiReviewStatisticsResponse != null && poiReviewStatisticsResponse.status_code == 0) {
            ((PoiReviewsLandingViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18(poiReviewStatisticsResponse, 851));
        }
        C1C7U.LIZIZ("PoiReviewsLandingViewModel@ad2c.fetchReviewStatistics$1");
    }

    public static final void accept$69(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiReviewsLandingViewModel@ad2c.fetchReviews$1$3");
        ((PoiReviewsLandingViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 853));
        C1C7U.LIZIZ("PoiReviewsLandingViewModel@ad2c.fetchReviews$1$3");
    }

    public static final void accept$7(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        int i;
        C1C7U.LIZ("EditCollectionFragment@5201.checkNameFromServer$1");
        CollectionNameCheckResponse collectionNameCheckResponse = (CollectionNameCheckResponse) obj;
        EditCollectionFragment editCollectionFragment = (EditCollectionFragment) afS187S0100000_18.l0;
        Boolean bool = collectionNameCheckResponse.isValid;
        Boolean bool2 = Boolean.TRUE;
        editCollectionFragment.NR(Intrinsics.LJFF(bool, bool2));
        TuxIconView tuxIconView = ((EditCollectionFragment) afS187S0100000_18.l0).LLILLL;
        boolean z = false;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
        TuxTextView tuxTextView = ((EditCollectionFragment) afS187S0100000_18.l0).LLILZIL;
        if (tuxTextView != null) {
            if (Intrinsics.LJFF(collectionNameCheckResponse.isValid, bool2)) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
        }
        EditCollectionFragment editCollectionFragment2 = (EditCollectionFragment) afS187S0100000_18.l0;
        TuxTextView tuxTextView2 = editCollectionFragment2.LLILZIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(editCollectionFragment2.getText(2131834463));
        }
        TuxSpinner tuxSpinner = ((EditCollectionFragment) afS187S0100000_18.l0).LL;
        if (tuxSpinner != null) {
            C786410Ut5.LLZILL(tuxSpinner, 8);
        }
        EditCollectionFragment editCollectionFragment3 = (EditCollectionFragment) afS187S0100000_18.l0;
        AwS589S0100000_10 awS589S0100000_10 = editCollectionFragment3.LLJJJIL;
        if (awS589S0100000_10 != null) {
            TuxTextView tuxTextView3 = editCollectionFragment3.LLILZIL;
            if (tuxTextView3 != null && tuxTextView3.getVisibility() == 0) {
                z = true;
            }
            awS589S0100000_10.invoke(Boolean.valueOf(z));
        }
        C1C7U.LIZIZ("EditCollectionFragment@5201.checkNameFromServer$1");
    }

    public static final void accept$70(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiReviewsUserLevelSheetViewModel@a074.fetchUserLevelPerksPanel$1");
        PoiReviewsApi.PoiReviewUserLevelPerksPanelResponse poiReviewUserLevelPerksPanelResponse = (PoiReviewsApi.PoiReviewUserLevelPerksPanelResponse) obj;
        if (poiReviewUserLevelPerksPanelResponse != null && poiReviewUserLevelPerksPanelResponse.status_code == 0) {
            ((PoiReviewsUserLevelSheetViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18(poiReviewUserLevelPerksPanelResponse, 855));
        }
        C1C7U.LIZIZ("PoiReviewsUserLevelSheetViewModel@a074.fetchUserLevelPerksPanel$1");
    }

    public static final void accept$71(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiMapModeMapAssem@efdc.subscribe$9$disposable$1");
        PoiMapModeMapAssem poiMapModeMapAssem = (PoiMapModeMapAssem) afS187S0100000_18.l0;
        poiMapModeMapAssem.LLJI.LIZLLL(Collections.singletonList("map_init"), new AwS126S0101000_18(poiMapModeMapAssem, ((Integer) obj).intValue(), 7));
        C1C7U.LIZIZ("PoiMapModeMapAssem@efdc.subscribe$9$disposable$1");
    }

    public static final void accept$72(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        int iLJIIIIZZ;
        AbstractC21673619ry adapter;
        C20600815jK<InterfaceC1891350zJl> state;
        C1C7U.LIZ("RavenFragment@d0e1.submitBodyResponse$8");
        C1161040gJq c1161040gJq = (C1161040gJq) obj;
        final RavenFragment ravenFragment = (RavenFragment) afS187S0100000_18.l0;
        ravenFragment.getClass();
        if (c1161040gJq != null) {
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS419S0200000_18(ravenFragment, (RavenFragment<Object>) c1161040gJq, (C1161040gJq) 144));
            C1160360gIk c1160360gIk = ravenFragment.LLJJIJIL;
            if (c1160360gIk != null) {
                c1160360gIk.LJIIIZ = null;
            }
            C18Z8 c18z8 = ravenFragment.LLJILJIL;
            if (c18z8 != null) {
                c18z8.LJIIIIZZ();
            }
            ravenFragment.FT(c1161040gJq);
            ravenFragment.MR(c1161040gJq, true);
            C1889907aj c1889907aj = c1161040gJq.LLILZLL;
            if (c1889907aj != null) {
                ((C20603715jn) ravenFragment.LLLLJI.getValue()).LJIIJ = c1889907aj.LIZ;
                ravenFragment.LLJJL = c1889907aj.LIZIZ;
                ravenFragment.LLJJLIIIJLLLLLLLZ = false;
                ravenFragment.LLJL = false;
                ravenFragment.LLJLIL = false;
                ravenFragment.zT("applyBodyLoadMoreConfig");
            }
            List<C1161140gK0> listLIZIZ = c1161040gJq.LIZIZ();
            if (listLIZIZ != null) {
                iLJIIIIZZ = listLIZIZ.size();
            } else {
                iLJIIIIZZ = 0;
            }
            ravenFragment.LLLFZ = false;
            C18Z8 c18z82 = ravenFragment.LLJILJIL;
            if (c18z82 != null && (state = c18z82.getState()) != null) {
                iLJIIIIZZ = state.LJIIIIZZ();
            }
            if (ravenFragment.LLLFF && !(ravenFragment instanceof RavenMusicCollectionFragment) && ravenFragment.GT(iLJIIIIZZ) && !ravenFragment.LLLF) {
                new C1043010dFT();
                C1043010dFT.LIZIZ("RavenFragment", new AwS142S0101000_2(iLJIIIIZZ, (int) ravenFragment, 11));
            }
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS562S0100000_18(ravenFragment, 2637));
            List<C1161140gK0> listLIZIZ2 = c1161040gJq.LIZIZ();
            if (listLIZIZ2 != null && !listLIZIZ2.isEmpty()) {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                AbstractC471570IeR abstractC471570IeR = new AbstractC471570IeR() { // from class: X.0gIq
                    @Override // X.AbstractC471570IeR
                    public final void LIZ() {
                        LJII("onChanged");
                    }

                    public final void LJII(String str) {
                        Unit unit;
                        AbstractC21673619ry adapter2;
                        new C1043010dFT();
                        C1043010dFT.LIZIZ("RavenFragment", new AwS14S1100100_18(str, (String) jCurrentTimeMillis, (long) ravenFragment, (RavenFragment<Object>) 1));
                        try {
                            C18Z8 c18z83 = ravenFragment.LLJILJIL;
                            if (c18z83 != null && (adapter2 = c18z83.getAdapter()) != null) {
                                adapter2.unregisterAdapterDataObserver(this);
                                unit = Unit.LIZ;
                            } else {
                                unit = null;
                            }
                            C189200o6.m2constructorimpl(unit);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                        RavenFragment<Object> ravenFragment2 = ravenFragment;
                        ravenFragment2.LLLFFI = true;
                        C18Z8 c18z84 = ravenFragment2.LLJILJIL;
                        if (c18z84 != null) {
                            HandlerHook.viewPost(c18z84, new ARunnableS8S1100000_2(ravenFragment2, str, 3));
                        }
                    }

                    @Override // X.AbstractC471570IeR
                    public final void LIZIZ(int i, int i2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onItemRangeChanged(pos=");
                        sbLIZ.append(i);
                        sbLIZ.append(",count=");
                        sbLIZ.append(i2);
                        sbLIZ.append(')');
                        LJII(C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.AbstractC471570IeR
                    public final void LIZLLL(int i, int i2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onItemRangeInserted(pos=");
                        sbLIZ.append(i);
                        sbLIZ.append(",count=");
                        sbLIZ.append(i2);
                        sbLIZ.append(')');
                        LJII(C2188811AlT.LIZIZ(sbLIZ));
                    }
                };
                C18Z8 c18z83 = ravenFragment.LLJILJIL;
                if (c18z83 != null && (adapter = c18z83.getAdapter()) != null) {
                    adapter.registerAdapterDataObserver(abstractC471570IeR);
                }
                new C1043010dFT();
                C1043010dFT.LIZIZ("RavenFragment", AnonymousClass0206.get$arr$(431));
            } else {
                ravenFragment.LLLFFI = true;
                new C1043010dFT();
                C1043010dFT.LIZIZ("RavenFragment", new AwS546S0100000_2(ravenFragment, 1131));
                ravenFragment.hT("empty body");
            }
        }
        C1C7U.LIZIZ("RavenFragment@d0e1.submitBodyResponse$8");
    }

    public static final void accept$73(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("RavenFragment@d0e1.submitBodyResponse$9");
        Throwable th = (Throwable) obj;
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS562S0100000_18((RavenFragment) afS187S0100000_18.l0, 2645));
        ((RavenFragment) afS187S0100000_18.l0).oS();
        RavenFragment ravenFragment = (RavenFragment) afS187S0100000_18.l0;
        ravenFragment.getClass();
        ravenFragment.IT("submitBodyResponse error");
        ((RavenFragment) afS187S0100000_18.l0).xT();
        ((RavenFragment) afS187S0100000_18.l0).ZS();
        ((RavenFragment) afS187S0100000_18.l0).oT(th, false);
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new C5182020e(th, 466));
        C1C7U.LIZIZ("RavenFragment@d0e1.submitBodyResponse$9");
    }

    public static final void accept$74(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        int size;
        int size2;
        List<C1161140gK0> listLIZ;
        List<C1161140gK0> listLIZIZ;
        C1C7U.LIZ("RavenFragment@d0e1.submitFirstScreenResponse$5");
        C1161040gJq c1161040gJq = (C1161040gJq) obj;
        RavenFragment ravenFragment = (RavenFragment) afS187S0100000_18.l0;
        Pair[] pairArr = new Pair[2];
        if (c1161040gJq != null && (listLIZIZ = c1161040gJq.LIZIZ()) != null) {
            size = listLIZIZ.size();
        } else {
            size = 0;
        }
        pairArr[0] = new Pair("body_component_count", Integer.valueOf(size));
        if (c1161040gJq != null && (listLIZ = c1161040gJq.LIZ()) != null) {
            size2 = listLIZ.size();
        } else {
            size2 = 0;
        }
        pairArr[1] = new Pair("all_component_count", Integer.valueOf(size2));
        ravenFragment.lT(System.currentTimeMillis(), "components_ready", C2097608Jq.LJIIIIZZ(pairArr));
        ((RavenFragment) afS187S0100000_18.l0).US(c1161040gJq, false);
        ((RavenFragment) afS187S0100000_18.l0).LLLLLJIL = false;
        C1C7U.LIZIZ("RavenFragment@d0e1.submitFirstScreenResponse$5");
    }

    public static final void accept$75(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PurchaseButtonComponentKt@c391.PurchaseButtonComponent$1$1$disposable$1");
        if (obj instanceof C1159250gGx) {
            ((C05P0) afS187S0100000_18.l0).setValue(Boolean.TRUE);
        } else if (!(obj instanceof C1159180gGq) && ((obj instanceof C1159240gGw) || (obj instanceof C1159190gGr))) {
            ((C05P0) afS187S0100000_18.l0).setValue(Boolean.FALSE);
        }
        C1C7U.LIZIZ("PurchaseButtonComponentKt@c391.PurchaseButtonComponent$1$1$disposable$1");
    }

    public static final void accept$76(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiMapViewModel@c49e.fetchPoiDetails$1$2");
        PoiMapViewModel poiMapViewModel = (PoiMapViewModel) afS187S0100000_18.l0;
        C491001vg c491001vg = new C491001vg(new Exception("network error"));
        poiMapViewModel.getClass();
        poiMapViewModel.setState(new AwS597S0100000_18(c491001vg, (AbstractC1623806Xk<PoiListApi.PoiDetailResponse>) 1005));
        ((PoiMapViewModel) afS187S0100000_18.l0).vQ2(EnumC1179630gnp.STATUS_POI_DETAIL_FAIL);
        C1C7U.LIZIZ("PoiMapViewModel@c49e.fetchPoiDetails$1$2");
    }

    public static final void accept$77(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("SlashVm@ffe6.loadMore$3");
        C1180620gpQ c1180620gpQ = (C1180620gpQ) obj;
        InterfaceC1181380gqe interfaceC1181380gqe = (InterfaceC1181380gqe) afS187S0100000_18.l0;
        if (interfaceC1181380gqe != null) {
            interfaceC1181380gqe.iM(c1180620gpQ, null);
        }
        C1C7U.LIZIZ("SlashVm@ffe6.loadMore$3");
    }

    public static final void accept$78(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("SlashVm@ffe6.loadMore$4");
        Throwable th = (Throwable) obj;
        InterfaceC1181380gqe interfaceC1181380gqe = (InterfaceC1181380gqe) afS187S0100000_18.l0;
        if (interfaceC1181380gqe != null) {
            interfaceC1181380gqe.JC(th, EnumC1181510gqr.LOAD_MORE, null);
        }
        C1C7U.LIZIZ("SlashVm@ffe6.loadMore$4");
    }

    public static final void accept$79(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("VideoCollectionContentViewModel@f4ab.getNextPageVideosInAllFavorites$1$3");
        ((VideoCollectionContentViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 1031));
        C1C7U.LIZIZ("VideoCollectionContentViewModel@f4ab.getNextPageVideosInAllFavorites$1$3");
    }

    public static final void accept$8(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        String string;
        C1C7U.LIZ("EditCollectionFragment@5201.checkNameFromServer$3");
        Throwable th = (Throwable) obj;
        ((EditCollectionFragment) afS187S0100000_18.l0).NR(false);
        TuxIconView tuxIconView = ((EditCollectionFragment) afS187S0100000_18.l0).LLILLL;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
        TuxSpinner tuxSpinner = ((EditCollectionFragment) afS187S0100000_18.l0).LL;
        if (tuxSpinner != null) {
            C786410Ut5.LLZILL(tuxSpinner, 8);
        }
        C1389890mGx c1389890mGx = new C1389890mGx((EditCollectionFragment) afS187S0100000_18.l0);
        c1389890mGx.LJIIIZ(2131848597);
        c1389890mGx.LJIIJJI();
        Bundle arguments = ((EditCollectionFragment) afS187S0100000_18.l0).getArguments();
        if (arguments != null) {
            string = arguments.getString("enterFrom");
        } else {
            string = null;
        }
        C1172580gcS.LIZIZ(string, th);
        C1C7U.LIZIZ("EditCollectionFragment@5201.checkNameFromServer$3");
    }

    public static final void accept$80(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("VideoCollectionContentViewModel@f4ab.getNextPageVideosInCandidate$1$4");
        ((VideoCollectionContentViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 1032));
        C1C7U.LIZIZ("VideoCollectionContentViewModel@f4ab.getNextPageVideosInCandidate$1$4");
    }

    public static final void accept$81(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("VideoCollectionContentViewModel@f4ab.getVideoCollectionDetail$2");
        CollectionDetailResponse collectionDetailResponse = (CollectionDetailResponse) obj;
        if (collectionDetailResponse.collectionDetail == null) {
            ((VideoCollectionContentViewModel) afS187S0100000_18.l0).setState(AFwS256S0000000_18.get$arr$(1012));
        } else {
            ((VideoCollectionContentViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18(collectionDetailResponse, 1033));
        }
        C1C7U.LIZIZ("VideoCollectionContentViewModel@f4ab.getVideoCollectionDetail$2");
    }

    public static final void accept$82(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("VideoCollectionContentViewModel@f4ab.getVideoCollectionDetail$3");
        ((VideoCollectionContentViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 1034));
        C1C7U.LIZIZ("VideoCollectionContentViewModel@f4ab.getVideoCollectionDetail$3");
    }

    public static final void accept$83(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiDetailSlashApiRequest@17b.requestSlash$1$2");
        C1183520gu6 c1183520gu6 = C1183520gu6.LIZ;
        c1183520gu6.getClass();
        c1183520gu6.LIZJ("poi_detail_request_result", new AwS5S1010000_18(false, (String) null, 0));
        ((C09AJ) afS187S0100000_18.l0).onError((Throwable) obj);
        C1C7U.LIZIZ("PoiDetailSlashApiRequest@17b.requestSlash$1$2");
    }

    public static final void accept$84(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiDetailSlashApiRequest@17b.requestSlashByChunk$1$2");
        C1183520gu6 c1183520gu6 = C1183520gu6.LIZ;
        c1183520gu6.getClass();
        c1183520gu6.LIZJ("poi_detail_request_result", new AwS5S1010000_18(false, (String) null, 0));
        ((C09AJ) afS187S0100000_18.l0).onError((Throwable) obj);
        C1C7U.LIZIZ("PoiDetailSlashApiRequest@17b.requestSlashByChunk$1$2");
    }

    public static final void accept$85(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("BaseStickerViewImpl@2dcc.stickerView$2$1$2");
        EnumC1159860gHw enumC1159860gHw = (EnumC1159860gHw) obj;
        if (enumC1159860gHw != null) {
            int i = C1159810gHr.LIZ[enumC1159860gHw.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            ((AbstractC1625770sPP) afS187S0100000_18.l0).LLILLL.setValue(8);
                            Iterator it2 = ((ArrayList) ((AbstractC1625770sPP) afS187S0100000_18.l0).LLIZ).iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC1159800gHq) it2.next()).LJIIZILJ(EnumC1155090gAF.AFTER_ANIMATE);
                            }
                        }
                    } else {
                        Iterator it3 = ((ArrayList) ((AbstractC1625770sPP) afS187S0100000_18.l0).LLIZ).iterator();
                        while (it3.hasNext()) {
                            ((InterfaceC1159800gHq) it3.next()).LJIIZILJ(EnumC1155090gAF.BEFORE_ANIMATE);
                        }
                    }
                } else {
                    Iterator it4 = ((ArrayList) ((AbstractC1625770sPP) afS187S0100000_18.l0).LLIZ).iterator();
                    while (it4.hasNext()) {
                        ((InterfaceC1159800gHq) it4.next()).LIZLLL(EnumC1155090gAF.AFTER_ANIMATE);
                    }
                }
            } else {
                ((AbstractC1625770sPP) afS187S0100000_18.l0).LLILLL.setValue(0);
                Iterator it5 = ((ArrayList) ((AbstractC1625770sPP) afS187S0100000_18.l0).LLIZ).iterator();
                while (it5.hasNext()) {
                    ((InterfaceC1159800gHq) it5.next()).LIZLLL(EnumC1155090gAF.BEFORE_ANIMATE);
                }
            }
            C1C7U.LIZIZ("BaseStickerViewImpl@2dcc.stickerView$2$1$2");
            return;
        }
        throw new C1954807lC();
    }

    public static final void accept$86(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiStayTimeEvent@2b67.<init>$1");
        if (((C606810Nr5) obj).LIZIZ) {
            ((C1185440gxC) afS187S0100000_18.l0).LIZ(true);
            ((C1185440gxC) afS187S0100000_18.l0).LIZLLL = 0L;
        }
        C1C7U.LIZIZ("PoiStayTimeEvent@2b67.<init>$1");
    }

    public static final void accept$87(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PoiMapModePageVM@49e4.updateCollectStatusToServer$1$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.status_code == 0) {
            C614900O9w c614900O9w = (C614900O9w) afS187S0100000_18.l0;
            c614900O9w.getClass();
            C1440005kM.LIZ(c614900O9w);
        }
        C1C7U.LIZIZ("PoiMapModePageVM@49e4.updateCollectStatusToServer$1$1");
    }

    public static final void accept$88(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("ManageTopicsContentVM@4b1f.handleSaveClicked$2");
        ManageTopicsContentVM manageTopicsContentVM = (ManageTopicsContentVM) afS187S0100000_18.l0;
        manageTopicsContentVM.withState(new AwS384S0200000_18(manageTopicsContentVM, (ManageTopicsContentVM) obj, (C443120HZe<? extends List<TopicUpdatePreference>, ? extends Map<Integer, ? extends EnumC1159500gHM>, ? extends Map<Integer, ? extends EnumC1159500gHM>>) 289));
        C1C7U.LIZIZ("ManageTopicsContentVM@4b1f.handleSaveClicked$2");
    }

    public static final void accept$89(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        boolean z;
        List<TopicPreference> list;
        Integer num;
        String str;
        C1C7U.LIZ("ManageTopicsContentVM@4b1f.subscribeUpdateTask$1$1");
        AbstractC1159440gHG abstractC1159440gHG = (AbstractC1159440gHG) obj;
        if (((ManageTopicsContentVM) afS187S0100000_18.l0).LLILZIL.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (abstractC1159440gHG instanceof C1159460gHI) {
            C1159460gHI c1159460gHI = (C1159460gHI) abstractC1159440gHG;
            if (c1159460gHI.LIZIZ == ((ManageTopicsContentVM) afS187S0100000_18.l0).hashCode()) {
                ((ManageTopicsContentVM) afS187S0100000_18.l0).setState(AFwS256S0000000_18.get$arr$(1028));
            } else {
                ManageTopicsResponse.Data data = c1159460gHI.LIZ.data;
                if (data != null && (str = data.helpLink) != null) {
                    ((ManageTopicsContentVM) afS187S0100000_18.l0).LLILLL = str;
                }
                ManageTopicsContentVM manageTopicsContentVM = (ManageTopicsContentVM) afS187S0100000_18.l0;
                if (data != null) {
                    list = data.preferenceList;
                } else {
                    list = null;
                }
                List<C1159480gHK> listZQ2 = manageTopicsContentVM.zQ2(list);
                if (listZQ2 != null && !listZQ2.isEmpty()) {
                    ((ManageTopicsContentVM) afS187S0100000_18.l0).setState(new AwS597S0100000_18(listZQ2, (List<String>) 1057));
                    if (data != null && (num = data.version) != null) {
                        ((ManageTopicsContentVM) afS187S0100000_18.l0).vQ2(num.intValue(), data.versionAlert);
                    }
                    ManageTopicsContentVM manageTopicsContentVM2 = (ManageTopicsContentVM) afS187S0100000_18.l0;
                    manageTopicsContentVM2.LLILZLL.clear();
                    manageTopicsContentVM2.setState(AFwS256S0000000_18.get$arr$(1027));
                } else if (z) {
                    ((ManageTopicsContentVM) afS187S0100000_18.l0).setState(AFwS256S0000000_18.get$arr$(1029));
                } else {
                    ((ManageTopicsContentVM) afS187S0100000_18.l0).setState(AFwS256S0000000_18.get$arr$(1030));
                }
                C742100T9c.LIZ.getClass();
                ((LiveData) C742100T9c.LIZIZ.getValue()).postValue(C1159450gHH.LIZ);
            }
        } else if (abstractC1159440gHG instanceof C1159430gHF) {
            if (z) {
                ((ManageTopicsContentVM) afS187S0100000_18.l0).setState(new AwS597S0100000_18(abstractC1159440gHG, 1058));
            } else {
                ManageTopicsContentVM manageTopicsContentVM3 = (ManageTopicsContentVM) afS187S0100000_18.l0;
                manageTopicsContentVM3.withState(new AwS384S0200000_18(manageTopicsContentVM3, abstractC1159440gHG, 291));
            }
            C742100T9c.LIZ.getClass();
            ((LiveData) C742100T9c.LIZIZ.getValue()).postValue(C1159450gHH.LIZ);
        } else if (!(abstractC1159440gHG instanceof C1159450gHH)) {
            throw new C1954807lC();
        }
        C1C7U.LIZIZ("ManageTopicsContentVM@4b1f.subscribeUpdateTask$1$1");
    }

    public static final void accept$9(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$manageCollection$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (((CollectionManageRequest) afS187S0100000_18.l0).operation == 2) {
            C1367960lha.LIZ.getClass();
            C1367960lha.LIZ().onCollectionDelete(((CollectionManageRequest) afS187S0100000_18.l0).collectionId);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/tiktok/collection/item_archive/manage/v1 operation is ");
        sbLIZ.append(((CollectionManageRequest) afS187S0100000_18.l0).operation);
        C1206780hVc.LIZJ(C2188811AlT.LIZIZ(sbLIZ), "net", baseResponse);
        C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$manageCollection$2");
    }

    public static final void accept$90(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PushSettingsLoginVM@db7f.requestPushOffReasons$3");
        ((PushSettingsLoginVM) afS187S0100000_18.l0).setState(AFwS274S0000000_30.get$arr$(341));
        C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestPushOffReasons$3");
    }

    public static final void accept$91(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PushSettingsLoginVM@db7f.requestVoiceCallSettingChange$3");
        C1245240iVe c1245240iVe = C1245240iVe.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestVoiceCallSettingChange error: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
        c1245240iVe.getClass();
        ((PushSettingsLoginVM) afS187S0100000_18.l0).setState(AFwS274S0000000_30.get$arr$(342));
        C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestVoiceCallSettingChange$3");
    }

    public static final void accept$92(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        ShouldShowEdmPopup data;
        C1C7U.LIZ("PushSettingsLoginVM@db7f.requestShouldShowEdmPopup$4");
        ShouldShowEdmPopupResp shouldShowEdmPopupResp = (ShouldShowEdmPopupResp) obj;
        if (shouldShowEdmPopupResp != null) {
            data = shouldShowEdmPopupResp.getData();
        } else {
            data = null;
        }
        C1245240iVe c1245240iVe = C1245240iVe.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGetShouldShowSuccess(");
        sbLIZ.append(data);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        c1245240iVe.getClass();
        ((PushSettingsLoginVM) afS187S0100000_18.l0).setState(new AwS609S0100000_30(data, 340));
        C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestShouldShowEdmPopup$4");
    }

    public static final void accept$93(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PushSettingsLoginVM@db7f.requestShouldShowEdmPopup$5");
        C1245240iVe c1245240iVe = C1245240iVe.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGetShouldShowFailed(");
        sbLIZ.append(obj);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        c1245240iVe.getClass();
        ((PushSettingsLoginVM) afS187S0100000_18.l0).setState(AFwS274S0000000_30.get$arr$(345));
        C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestShouldShowEdmPopup$5");
    }

    public static final void accept$94(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PushSettingsLoginVM@db7f.requestUpdatePushSetting$3");
        ((PushSettingsLoginVM) afS187S0100000_18.l0).setState(AFwS274S0000000_30.get$arr$(346));
        C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestUpdatePushSetting$3");
    }

    public static final void accept$95(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        int i;
        C1C7U.LIZ("PaidSeriesAddedSeriesViewModel@10d0.getLivePaidSeriesList$1");
        PaidSeriesLiveListResponse paidSeriesLiveListResponse = (PaidSeriesLiveListResponse) obj;
        PaidContentCreatorStatus paidContentCreatorStatus = paidSeriesLiveListResponse.creatorStatus;
        if (paidContentCreatorStatus != null && (i = C1157620gEK.LIZ[paidContentCreatorStatus.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        throw new C1954807lC();
                    }
                } else {
                    ((PaidSeriesAddedSeriesViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18(paidSeriesLiveListResponse, 1075));
                }
            } else {
                ((PaidSeriesAddedSeriesViewModel) afS187S0100000_18.l0).setState(AFwS256S0000000_18.get$arr$(1040));
            }
        }
        C1C7U.LIZIZ("PaidSeriesAddedSeriesViewModel@10d0.getLivePaidSeriesList$1");
    }

    public static final void accept$96(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("PaidSeriesAddedSeriesViewModel@10d0.getLivePaidSeriesList$2");
        ((PaidSeriesAddedSeriesViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 1076));
        C1C7U.LIZIZ("PaidSeriesAddedSeriesViewModel@10d0.getLivePaidSeriesList$2");
    }

    public static final void accept$97(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("MixCreateViewModel@4174.uploadMixChange$1$11");
        ((MixCreateViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((ManageResponse) obj, 1082));
        C1C7U.LIZIZ("MixCreateViewModel@4174.uploadMixChange$1$11");
    }

    public static final void accept$98(AfS187S0100000_18 afS187S0100000_18, Object obj) {
        C1C7U.LIZ("MixCreateViewModel@4174.uploadMixChange$1$12");
        ((MixCreateViewModel) afS187S0100000_18.l0).setState(new AwS597S0100000_18((Throwable) obj, 1083));
        C1C7U.LIZIZ("MixCreateViewModel@4174.uploadMixChange$1$12");
    }
}
