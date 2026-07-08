package Y;

import X.AbstractC316870CbV;
import X.C09AJ;
import X.C09JN;
import X.C0X52;
import X.C0XQ7;
import X.C1159480gHK;
import X.C1160990gJl;
import X.C1161000gJm;
import X.C1161040gJq;
import X.C1165310gQj;
import X.C1165690gRL;
import X.C1167410gU7;
import X.C1167740gUe;
import X.C1167750gUf;
import X.C1168620gW4;
import X.C1168650gW7;
import X.C1169380gXI;
import X.C1170730gZT;
import X.C1171330gaR;
import X.C1171530gal;
import X.C1171910gbN;
import X.C1171960gbS;
import X.C1172580gcS;
import X.C11NZ;
import X.C11S5;
import X.C1206780hVc;
import X.C1344550l5p;
import X.C1367960lha;
import X.C1440005kM;
import X.C189200o6;
import X.C19EG;
import X.C1C7U;
import X.C20684815ws;
import X.C2365509Or;
import X.C259800zU;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C317290CcB;
import X.C323380Cm0;
import X.C438720HIg;
import X.C445550HdZ;
import X.C742510TAr;
import X.EnumC1159500gHM;
import X.EnumC1160870gJZ;
import X.InterfaceC1160790gJR;
import X.InterfaceC1181380gqe;
import X.InterfaceC1364105Vn;
import X.InterfaceC1685420txc;
import X.InterfaceC1891350zJl;
import X.InterfaceC420801kM;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.hybrid.spark.raven.data.RavenPage;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.comment.photocomment.CommentInnerPagerAssem;
import com.ss.android.ugc.aweme.favorites.business.collection.ChooseCollectionSheetFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel;
import com.ss.android.ugc.aweme.mix.api.response.ManageResponse;
import com.ss.android.ugc.aweme.mix.api.response.MixDetailResponse;
import com.ss.android.ugc.aweme.mix.model.MixCandidateVideosResponse;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel;
import com.ss.android.ugc.aweme.mix.viewallplaylist.ViewAllPlaylistFragment;
import com.ss.android.ugc.aweme.ogc.news.managetopics.ManageTopicsContentVM;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public class AfS154S0200000_18 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    public static final void accept$0(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("CommentInnerPagerAssem@d4d7.listConfig$1$onLoadMore$disposable$2");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS154S0200000_18.l0;
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        Exception exc = new Exception("comment load error");
        c317290CcB.getClass();
        C316650Cb9 c316650Cb9 = new C316650Cb9(exc);
        C189200o6.m2constructorimpl(c316650Cb9);
        interfaceC1364105Vn.resumeWith(c316650Cb9);
        C1344550l5p c1344550l5pGo = ((CommentInnerPagerAssem) afS154S0200000_18.l1).Go();
        if (c1344550l5pGo != null) {
            c1344550l5pGo.setRequesting(Boolean.FALSE);
        }
        C1C7U.LIZIZ("CommentInnerPagerAssem@d4d7.listConfig$1$onLoadMore$disposable$2");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS154S0200000_18 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS154S0200000_18.accept$1(Y.AfS154S0200000_18, java.lang.Object):void");
    }

    public static final void accept$10(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("MultiVideoViewModel@bf62.config$2$1$onLoadMore$result$1");
        MixCandidateVideosResponse mixCandidateVideosResponse = (MixCandidateVideosResponse) obj;
        ((MultiVideoViewModel) afS154S0200000_18.l0).LLJILJIL = false;
        List<Aweme> mixVideos = mixCandidateVideosResponse.getMixVideos();
        if (mixVideos != null) {
            MultiVideoViewModel multiVideoViewModel = (MultiVideoViewModel) afS154S0200000_18.l0;
            Iterator<Aweme> it2 = mixVideos.iterator();
            while (it2.hasNext()) {
                ((ArrayList) multiVideoViewModel.LL).add(it2.next());
            }
        }
        ((ArrayList) ((MultiVideoViewModel) afS154S0200000_18.l0).LLILLJJLI).addAll(((MultiVideoViewModel) afS154S0200000_18.l0).vQ2(mixCandidateVideosResponse.getMixVideos()));
        ((MultiVideoViewModel) afS154S0200000_18.l0).LLILZLL = mixCandidateVideosResponse.getHasMore();
        if (mixCandidateVideosResponse.getHasMore()) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS154S0200000_18.l1;
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            List<C1165690gRL> listVQ2 = ((MultiVideoViewModel) afS154S0200000_18.l0).vQ2(mixCandidateVideosResponse.getMixVideos());
            c317290CcB.getClass();
            C323380Cm0 c323380Cm0 = new C323380Cm0(null, mixCandidateVideosResponse, listVQ2);
            C189200o6.m2constructorimpl(c323380Cm0);
            interfaceC1364105Vn.resumeWith(c323380Cm0);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) afS154S0200000_18.l1;
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            List<C1165690gRL> listVQ22 = ((MultiVideoViewModel) afS154S0200000_18.l0).vQ2(mixCandidateVideosResponse.getMixVideos());
            c317290CcB2.getClass();
            C316640Cb8 c316640Cb8 = new C316640Cb8(listVQ22);
            C189200o6.m2constructorimpl(c316640Cb8);
            interfaceC1364105Vn2.resumeWith(c316640Cb8);
        }
        C1C7U.LIZIZ("MultiVideoViewModel@bf62.config$2$1$onLoadMore$result$1");
    }

    public static final void accept$11(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("MultiVideoViewModel@bf62.config$2$1$onLoadMore$result$2");
        ((MultiVideoViewModel) afS154S0200000_18.l0).LLJILJIL = false;
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS154S0200000_18.l1;
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        Exception exc = new Exception(((Throwable) obj).getMessage());
        c317290CcB.getClass();
        C316650Cb9 c316650Cb9 = new C316650Cb9(exc);
        C189200o6.m2constructorimpl(c316650Cb9);
        interfaceC1364105Vn.resumeWith(c316650Cb9);
        C1C7U.LIZIZ("MultiVideoViewModel@bf62.config$2$1$onLoadMore$result$2");
    }

    public static final void accept$12(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        int status;
        C1C7U.LIZ("MultiVideoViewModel@bf62.config$2$1$onRefresh$result$1");
        MixCandidateVideosResponse mixCandidateVideosResponse = (MixCandidateVideosResponse) obj;
        List<Aweme> mixVideos = mixCandidateVideosResponse.getMixVideos();
        if (mixVideos != null) {
            MultiVideoViewModel multiVideoViewModel = (MultiVideoViewModel) afS154S0200000_18.l0;
            Iterator<Aweme> it2 = mixVideos.iterator();
            while (it2.hasNext()) {
                ((ArrayList) multiVideoViewModel.LL).add(it2.next());
            }
        }
        List<C1165690gRL> listVQ2 = ((MultiVideoViewModel) afS154S0200000_18.l0).vQ2(mixCandidateVideosResponse.getMixVideos());
        ((ArrayList) ((MultiVideoViewModel) afS154S0200000_18.l0).LLILLJJLI).addAll(listVQ2);
        ((MultiVideoViewModel) afS154S0200000_18.l0).LLILZLL = mixCandidateVideosResponse.getHasMore();
        if (mixCandidateVideosResponse.getHasMore()) {
            ((MultiVideoViewModel) afS154S0200000_18.l0).LLILZIL.postValue(Integer.valueOf(EnumC1160870gJZ.SUCCESS.getStatus()));
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS154S0200000_18.l1;
            AbstractC316870CbV.LIZ.getClass();
            C323380Cm0 c323380Cm0 = new C323380Cm0(null, mixCandidateVideosResponse, listVQ2);
            C189200o6.m2constructorimpl(c323380Cm0);
            interfaceC1364105Vn.resumeWith(c323380Cm0);
        } else {
            if (mixCandidateVideosResponse.getMixVideos() != null && (!r0.isEmpty())) {
                status = EnumC1160870gJZ.SUCCESS.getStatus();
            } else {
                status = EnumC1160870gJZ.EMPTY.getStatus();
            }
            ((MultiVideoViewModel) afS154S0200000_18.l0).LLILZIL.postValue(Integer.valueOf(status));
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) afS154S0200000_18.l1;
            AbstractC316870CbV.LIZ.getClass();
            C316640Cb8 c316640Cb8 = new C316640Cb8(listVQ2);
            C189200o6.m2constructorimpl(c316640Cb8);
            interfaceC1364105Vn2.resumeWith(c316640Cb8);
        }
        C1C7U.LIZIZ("MultiVideoViewModel@bf62.config$2$1$onRefresh$result$1");
    }

    public static final void accept$13(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("MultiVideoViewModel@bf62.config$2$1$onRefresh$result$2");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS154S0200000_18.l0;
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        Exception exc = new Exception(((Throwable) obj).getMessage());
        c317290CcB.getClass();
        C316650Cb9 c316650Cb9 = new C316650Cb9(exc);
        C189200o6.m2constructorimpl(c316650Cb9);
        interfaceC1364105Vn.resumeWith(c316650Cb9);
        ((MultiVideoViewModel) afS154S0200000_18.l1).LLILZIL.postValue(Integer.valueOf(EnumC1160870gJZ.ERROR.getStatus()));
        C1C7U.LIZIZ("MultiVideoViewModel@bf62.config$2$1$onRefresh$result$2");
    }

    public static final void accept$14(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("ViewAllPlaylistFragment@d44b.config$2$1$onLoadMore$1$1");
        MixListResponse mixListResponse = (MixListResponse) obj;
        List<C445550HdZ> listSR = ((ViewAllPlaylistFragment) afS154S0200000_18.l0).SR(mixListResponse);
        if (!listSR.isEmpty() && mixListResponse.getHasMore()) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS154S0200000_18.l1;
            AbstractC316870CbV.LIZ.getClass();
            C323380Cm0 c323380Cm0 = new C323380Cm0(null, mixListResponse, listSR);
            C189200o6.m2constructorimpl(c323380Cm0);
            interfaceC1364105Vn.resumeWith(c323380Cm0);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) afS154S0200000_18.l1;
            AbstractC316870CbV.LIZ.getClass();
            C316640Cb8 c316640Cb8 = new C316640Cb8(listSR);
            C189200o6.m2constructorimpl(c316640Cb8);
            interfaceC1364105Vn2.resumeWith(c316640Cb8);
        }
        ((ViewAllPlaylistFragment) afS154S0200000_18.l0).LLJI = 0;
        C1C7U.LIZIZ("ViewAllPlaylistFragment@d44b.config$2$1$onLoadMore$1$1");
    }

    public static final void accept$15(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("ViewAllPlaylistFragment@d44b.config$2$1$onRefresh$1$1");
        MixListResponse mixListResponse = (MixListResponse) obj;
        List<C445550HdZ> listSR = ((ViewAllPlaylistFragment) afS154S0200000_18.l0).SR(mixListResponse);
        if (!listSR.isEmpty() && mixListResponse.getHasMore()) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS154S0200000_18.l1;
            AbstractC316870CbV.LIZ.getClass();
            C323380Cm0 c323380Cm0 = new C323380Cm0(null, mixListResponse, listSR);
            C189200o6.m2constructorimpl(c323380Cm0);
            interfaceC1364105Vn.resumeWith(c323380Cm0);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) afS154S0200000_18.l1;
            AbstractC316870CbV.LIZ.getClass();
            C316640Cb8 c316640Cb8 = new C316640Cb8(listSR);
            C189200o6.m2constructorimpl(c316640Cb8);
            interfaceC1364105Vn2.resumeWith(c316640Cb8);
        }
        C1C7U.LIZIZ("ViewAllPlaylistFragment@d44b.config$2$1$onRefresh$1$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$16(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("RavenDataProcessor@25d7.realRequest$1$3");
        Throwable th = (Throwable) obj;
        C1161040gJq c1161040gJq = (C1161040gJq) ((C259800zU) afS154S0200000_18.l0).element;
        if (c1161040gJq != null) {
            ((C09AJ) afS154S0200000_18.l1).onNext(C1161040gJq.LIZLLL(c1161040gJq, null, true, null, false, null, null, 125));
        }
        ((C09AJ) afS154S0200000_18.l1).onError(th);
        C1C7U.LIZIZ("RavenDataProcessor@25d7.realRequest$1$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$17(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("RavenDataProcessor@25d7.submitFirstScreenResponse$1$3");
        Throwable th = (Throwable) obj;
        C1161040gJq c1161040gJq = (C1161040gJq) ((C259800zU) afS154S0200000_18.l0).element;
        if (c1161040gJq != null) {
            ((C09AJ) afS154S0200000_18.l1).onNext(C1161040gJq.LIZLLL(c1161040gJq, null, true, null, false, null, null, 125));
        }
        ((C09AJ) afS154S0200000_18.l1).onError(th);
        C1C7U.LIZIZ("RavenDataProcessor@25d7.submitFirstScreenResponse$1$3");
    }

    public static final void accept$18(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("RavenVm@b7c8.loadMore$2");
        InterfaceC1160790gJR interfaceC1160790gJR = (InterfaceC1160790gJR) afS154S0200000_18.l0;
        if (interfaceC1160790gJR != null) {
            interfaceC1160790gJR.LJIIIZ((C1160990gJl) afS154S0200000_18.l1, null);
        }
        C1C7U.LIZIZ("RavenVm@b7c8.loadMore$2");
    }

    public static final void accept$19(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("RavenVm@b7c8.request$2");
        InterfaceC1160790gJR interfaceC1160790gJR = (InterfaceC1160790gJR) afS154S0200000_18.l0;
        if (interfaceC1160790gJR != null) {
            interfaceC1160790gJR.LJIIIZ((C1160990gJl) afS154S0200000_18.l1, null);
        }
        C1C7U.LIZIZ("RavenVm@b7c8.request$2");
    }

    public static final void accept$2(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        Integer num;
        String string6;
        String string7;
        String string8;
        Integer num2;
        Integer num3;
        Integer num4;
        C1C7U.LIZ("ChooseCollectionSheetFragment@36b3.onClickViewHolderToCreateAndAddCollection$ignore$1");
        CollectionManageResponse collectionManageResponse = (CollectionManageResponse) obj;
        C1367960lha.LIZ.getClass();
        IPoiService iPoiServiceLIZ = C1367960lha.LIZ();
        Boolean boolValueOf = Boolean.valueOf(((ChooseCollectionSheetFragment) afS154S0200000_18.l0).RR());
        String str = collectionManageResponse.collectionId;
        String str2 = ((CollectionDetail) afS154S0200000_18.l1).name;
        Bundle arguments = ((ChooseCollectionSheetFragment) afS154S0200000_18.l0).getArguments();
        if (arguments != null) {
            string = arguments.getString("awemeId");
        } else {
            string = null;
        }
        iPoiServiceLIZ.onVideoAddToCollection(boolValueOf, str, str2, "1", string);
        Bundle arguments2 = ((ChooseCollectionSheetFragment) afS154S0200000_18.l0).getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("enterMethod");
        } else {
            string2 = null;
        }
        C1171330gaR c1171330gaR = new C1171330gaR();
        Bundle arguments3 = ((ChooseCollectionSheetFragment) afS154S0200000_18.l0).getArguments();
        if (arguments3 != null) {
            string3 = arguments3.getString("enterFrom");
        } else {
            string3 = null;
        }
        c1171330gaR.LIZLLL = string3;
        int iIntValue = 0;
        c1171330gaR.LJIIZILJ(0);
        CollectionDetail.Status status = ((CollectionDetail) afS154S0200000_18.l1).status;
        if (status != null && (num4 = status.state) != null) {
            iIntValue = num4.intValue();
        }
        c1171330gaR.LJIJ(iIntValue);
        c1171330gaR.LJIL = string2;
        Bundle arguments4 = ((ChooseCollectionSheetFragment) afS154S0200000_18.l0).getArguments();
        if (arguments4 != null) {
            string4 = arguments4.getString("awemeId");
        } else {
            string4 = null;
        }
        c1171330gaR.LJJI = string4;
        c1171330gaR.LJIJI = collectionManageResponse.collectionId;
        CollectionDetail collectionDetail = (CollectionDetail) afS154S0200000_18.l1;
        c1171330gaR.LJJIFFI = collectionDetail.name;
        Integer num5 = collectionDetail.type;
        if (num5 != null) {
            string5 = num5.toString();
        } else {
            string5 = null;
        }
        c1171330gaR.LJJII = string5;
        CollectionDetail.Status status2 = ((CollectionDetail) afS154S0200000_18.l1).status;
        if (status2 != null) {
            num = status2.state;
        } else {
            num = null;
        }
        c1171330gaR.LJIILLIIL(num);
        c1171330gaR.LJIILJJIL();
        C1170730gZT c1170730gZT = new C1170730gZT();
        Bundle arguments5 = ((ChooseCollectionSheetFragment) afS154S0200000_18.l0).getArguments();
        if (arguments5 != null) {
            string6 = arguments5.getString("enterFrom");
        } else {
            string6 = null;
        }
        c1170730gZT.LIZLLL = string6;
        c1170730gZT.LJIIZILJ = "create";
        Bundle arguments6 = ((ChooseCollectionSheetFragment) afS154S0200000_18.l0).getArguments();
        if (arguments6 != null) {
            string7 = arguments6.getString("awemeId");
        } else {
            string7 = null;
        }
        c1170730gZT.LJIL = string7;
        c1170730gZT.LJJ = 1;
        c1170730gZT.LJIJI = collectionManageResponse.collectionId;
        CollectionDetail collectionDetail2 = (CollectionDetail) afS154S0200000_18.l1;
        c1170730gZT.LJIJJ = collectionDetail2.name;
        Integer num6 = collectionDetail2.type;
        if (num6 != null) {
            string8 = num6.toString();
        } else {
            string8 = null;
        }
        c1170730gZT.LJJIFFI = string8;
        CollectionDetail.Status status3 = ((CollectionDetail) afS154S0200000_18.l1).status;
        if (status3 != null) {
            num2 = status3.state;
        } else {
            num2 = null;
        }
        c1170730gZT.LJIILLIIL(num2);
        CollectionDetail.Status status4 = ((CollectionDetail) afS154S0200000_18.l1).status;
        if (status4 != null) {
            num3 = status4.state;
        } else {
            num3 = null;
        }
        c1170730gZT.LJIJJLI = C1172580gcS.LIZ(num3);
        c1170730gZT.LJIILJJIL();
        C1440005kM.LIZ(new C742510TAr(new CollectionManageRequest(1, null, null, null, null, null, null, null, null, null, null, null), null));
        C1C7U.LIZIZ("ChooseCollectionSheetFragment@36b3.onClickViewHolderToCreateAndAddCollection$ignore$1");
    }

    public static final void accept$20(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("RavenDataProcessor@25d7.processManualLoadMoreAndInsert$1");
        InterfaceC1160790gJR interfaceC1160790gJR = (InterfaceC1160790gJR) afS154S0200000_18.l0;
        if (interfaceC1160790gJR != null) {
            interfaceC1160790gJR.LJIIIZ((C1160990gJl) afS154S0200000_18.l1, null);
        }
        C1C7U.LIZIZ("RavenDataProcessor@25d7.processManualLoadMoreAndInsert$1");
    }

    public static final void accept$21(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        List<MixStruct> mixList;
        List<MixStruct> mixList2;
        List<MixStruct> mixList3;
        List<MixStruct> mixList4;
        C1C7U.LIZ("PlayListViewHolder@2393.searchScenarioLoadMore$result$1");
        MixListResponse mixListResponse = (MixListResponse) obj;
        if (mixListResponse != null && (mixList2 = mixListResponse.getMixList()) != null) {
            C1169380gXI c1169380gXI = (C1169380gXI) afS154S0200000_18.l1;
            c1169380gXI.LLILZLL.addAll(mixList2);
            MixListResponse mixListResponse2 = c1169380gXI.LLJJIJIIJIL;
            if (mixListResponse2 != null) {
                mixList3 = mixListResponse2.getMixList();
            } else {
                mixList3 = null;
            }
            if (mixList3 instanceof ArrayList) {
                MixListResponse mixListResponse3 = c1169380gXI.LLJJIJIIJIL;
                if (mixListResponse3 != null) {
                    mixList4 = mixListResponse3.getMixList();
                } else {
                    mixList4 = null;
                }
                ((ArrayList) mixList4).addAll(mixList2);
            }
        }
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS154S0200000_18.l0;
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        C1169380gXI c1169380gXI2 = (C1169380gXI) afS154S0200000_18.l1;
        if (mixListResponse != null) {
            mixList = mixListResponse.getMixList();
        } else {
            mixList = null;
        }
        List<InterfaceC1891350zJl> listI5 = c1169380gXI2.I5(mixList);
        c317290CcB.getClass();
        C323380Cm0 c323380Cm0 = new C323380Cm0(null, mixListResponse, listI5);
        C189200o6.m2constructorimpl(c323380Cm0);
        interfaceC1364105Vn.resumeWith(c323380Cm0);
        ((C1169380gXI) afS154S0200000_18.l1).LLJILJILJ.invalidateItemDecorations();
        C1C7U.LIZIZ("PlayListViewHolder@2393.searchScenarioLoadMore$result$1");
    }

    public static final void accept$22(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("PoiReviewsLandingViewModel@ad2c.submitNps$1");
        PoiReviewsApi.PoiReviewNpsResponse poiReviewNpsResponse = (PoiReviewsApi.PoiReviewNpsResponse) obj;
        if (poiReviewNpsResponse.status_code == 0) {
            ((PoiReviewsApi.PoiNpsInfo) afS154S0200000_18.l0).getStoreNpsInfo().setRecordId(poiReviewNpsResponse.getRecordId());
            Function0 function0 = (Function0) afS154S0200000_18.l1;
            if (function0 != null) {
                function0.invoke();
            }
        }
        C1C7U.LIZIZ("PoiReviewsLandingViewModel@ad2c.submitNps$1");
    }

    public static final void accept$23(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("PlaylistCreateRepo@1760.createPlaylist$1");
        ManageResponse manageResponse = (ManageResponse) obj;
        if (manageResponse.status_code == 0) {
            Function1 function1 = (Function1) afS154S0200000_18.l0;
            if (function1 != null) {
                function1.invoke(manageResponse);
            }
            C1167750gUf.LIZ.getClass();
            C1167750gUf.LJ(Keva.getRepo("keva_mixlist_repo_name").getInt(C1167750gUf.LIZIZ(), 0) + 1);
            C1440005kM.LIZ(new C1167740gUe(manageResponse.mixId));
        } else {
            Function1 function12 = (Function1) afS154S0200000_18.l1;
            if (function12 != null) {
                function12.invoke(new Exception(manageResponse.message));
            }
        }
        C1C7U.LIZIZ("PlaylistCreateRepo@1760.createPlaylist$1");
    }

    public static final void accept$24(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("PlaylistManageRepo@fa57.getPlaylistDetail$1");
        MixDetailResponse mixDetailResponse = (MixDetailResponse) obj;
        Function1 function1 = (Function1) afS154S0200000_18.l0;
        if (function1 != null) {
            function1.invoke(mixDetailResponse.mixDetail);
        }
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) afS154S0200000_18.l1).element;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        C1C7U.LIZIZ("PlaylistManageRepo@fa57.getPlaylistDetail$1");
    }

    public static final void accept$25(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        String strLJ;
        C1C7U.LIZ("PoiServiceImpl@62a1.isReviewEligible$1");
        PoiReviewsApi.PoiReviewEligibleResponse poiReviewEligibleResponse = (PoiReviewsApi.PoiReviewEligibleResponse) obj;
        if (poiReviewEligibleResponse != null && poiReviewEligibleResponse.status_code == 0) {
            InterfaceC1685420txc interfaceC1685420txc = (InterfaceC1685420txc) afS154S0200000_18.l1;
            if (interfaceC1685420txc != null) {
                Boolean bool = poiReviewEligibleResponse.eligible;
                String str = poiReviewEligibleResponse.poiName;
                String str2 = poiReviewEligibleResponse.eligibleExtraInfo;
                String str3 = poiReviewEligibleResponse.collectInfo;
                PoiReviewsApi.PoiReviewEntrance poiReviewEntrance = poiReviewEligibleResponse.postReviewEntrance;
                if (poiReviewEntrance != null) {
                    strLJ = C2365509Or.LJ(poiReviewEntrance);
                } else {
                    strLJ = null;
                }
                interfaceC1685420txc.invoke(bool, str, str2, str3, strLJ);
            }
        } else {
            Function0 function0 = (Function0) afS154S0200000_18.l0;
            if (function0 != null) {
                function0.invoke();
            }
        }
        C1C7U.LIZIZ("PoiServiceImpl@62a1.isReviewEligible$1");
    }

    public static final void accept$26(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("SlashVm@ffe6.loadMore$2");
        InterfaceC1181380gqe interfaceC1181380gqe = (InterfaceC1181380gqe) afS154S0200000_18.l0;
        if (interfaceC1181380gqe != null) {
            interfaceC1181380gqe.Ag((SlashRequestParam) afS154S0200000_18.l1, null);
        }
        C1C7U.LIZIZ("SlashVm@ffe6.loadMore$2");
    }

    public static final void accept$27(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("SlashVm@ffe6.request$2");
        InterfaceC1181380gqe interfaceC1181380gqe = (InterfaceC1181380gqe) afS154S0200000_18.l0;
        if (interfaceC1181380gqe != null) {
            interfaceC1181380gqe.Ag((SlashRequestParam) afS154S0200000_18.l1, null);
        }
        C1C7U.LIZIZ("SlashVm@ffe6.request$2");
    }

    public static final void accept$28(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("ManageTopicsContentVM@4b1f.maybeTriggerGuideShow$2");
        Integer num = (Integer) obj;
        if (num != null && num.intValue() == 0) {
            if (((C1159480gHK) afS154S0200000_18.l0).LLILZIL.getServerValue() != EnumC1159500gHM.DEFAULT.getServerValue()) {
                ManageTopicsContentVM manageTopicsContentVM = (ManageTopicsContentVM) afS154S0200000_18.l1;
                manageTopicsContentVM.getClass();
                manageTopicsContentVM.disposeOnClear(C11NZ.LJJJJI(new ACallableS423S0100000_18(manageTopicsContentVM, 2)).LJL(C11S5.LIZ()).LJJLJ());
            } else {
                ((ManageTopicsContentVM) afS154S0200000_18.l1).setState(AFwS256S0000000_18.get$arr$(1026));
            }
        }
        C1C7U.LIZIZ("ManageTopicsContentVM@4b1f.maybeTriggerGuideShow$2");
    }

    public static final void accept$29(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("PlaylistEditCacheRepo@c1c4.commitPlaylistEdit$5");
        ((C1167410gU7) afS154S0200000_18.l0).LJIIJ = true;
        Function1 function1 = (Function1) afS154S0200000_18.l1;
        if (function1 != null) {
            function1.invoke(obj);
        }
        C1C7U.LIZIZ("PlaylistEditCacheRepo@c1c4.commitPlaylistEdit$5");
    }

    public static final void accept$3(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        long jLongValue;
        CollectionDetail.Statistic statistic;
        Long l;
        C1C7U.LIZ("CollectionContentFragment@3f31.onClickItemViewHolderToRemoveUnableVideos$1$1$1$invoke$1");
        C0XQ7.LJ();
        C20684815ws.LJIJI("cancel_favourite_video", new Pair("collection_video", "enter_from"), new Pair("unavailable_popup", "enter_method"), new Pair(AwemeExtKt.getAuthorUid((Aweme) afS154S0200000_18.l0), "author_id"), new Pair(((Aweme) afS154S0200000_18.l0).getAid(), "aweme_id"), new Pair(C0XQ7.LIZ.LJIIJ().getCurUserId(), "user_id"));
        CollectionDetail collectionDetailQS = ((CollectionContentFragment) afS154S0200000_18.l1).qS();
        if (collectionDetailQS != null && (statistic = collectionDetailQS.statistic) != null && (l = statistic.total) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        CollectionDetail.Statistic statistic2 = ((CollectionContentFragment) afS154S0200000_18.l1).qS().statistic;
        if (statistic2 != null) {
            statistic2.total = Long.valueOf(jLongValue - 1);
        }
        C1440005kM.LIZ(new C438720HIg(((CollectionContentFragment) afS154S0200000_18.l1).qS()));
        ((CollectionContentFragment) afS154S0200000_18.l1).mS().vQ2(true);
        C1440005kM.LIZ(new C742510TAr(new CollectionManageRequest(3, null, null, null, null, null, null, null, null, null, null, null), null));
        C1C7U.LIZIZ("CollectionContentFragment@3f31.onClickItemViewHolderToRemoveUnableVideos$1$1$1$invoke$1");
    }

    public static final void accept$30(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("PlaylistManageCacheRepo@3757.commitPlaylistReorder$2");
        ((C1165310gQj) afS154S0200000_18.l0).LJFF = true;
        Function1 function1 = (Function1) afS154S0200000_18.l1;
        if (function1 != null) {
            function1.invoke(obj);
        }
        C1C7U.LIZIZ("PlaylistManageCacheRepo@3757.commitPlaylistReorder$2");
    }

    public static final void accept$4(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        boolean z;
        C1C7U.LIZ("FeedAddToFavoritesPopToast@bc43.showToastWithoutContentView$4$doClick$1");
        CollectionListResponse collectionListResponse = (CollectionListResponse) obj;
        C1206780hVc.LIZ("popup favorite collections dialog");
        List<CollectionDetail> list = collectionListResponse.items;
        int size = 0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C1171530gal.LJI((C1171530gal) afS154S0200000_18.l0, (C19EG) afS154S0200000_18.l1, null, 6);
        } else {
            C1171530gal c1171530gal = (C1171530gal) afS154S0200000_18.l0;
            C19EG c19eg = (C19EG) afS154S0200000_18.l1;
            List<CollectionDetail> list2 = collectionListResponse.items;
            if (list2 != null) {
                size = list2.size();
            }
            c1171530gal.LJFF(c19eg, size, null);
        }
        C1C7U.LIZIZ("FeedAddToFavoritesPopToast@bc43.showToastWithoutContentView$4$doClick$1");
    }

    public static final void accept$5(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("FeedRevisitPopupToast@d7e3.showAt$1$5");
        ((C1171910gbN) afS154S0200000_18.l0).LIZIZ();
        ((C1171960gbS) afS154S0200000_18.l1).LIZJ();
        C1C7U.LIZIZ("FeedRevisitPopupToast@d7e3.showAt$1$5");
    }

    public static final void accept$6(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        boolean z;
        C1C7U.LIZ("FeedAddToFavoritesPopToast@bc43.showAt$4$doClick$1");
        CollectionListResponse collectionListResponse = (CollectionListResponse) obj;
        C1206780hVc.LIZ("popup favorite collections dialog");
        List<CollectionDetail> list = collectionListResponse.items;
        int size = 0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C1171530gal.LJI((C1171530gal) afS154S0200000_18.l0, (C19EG) afS154S0200000_18.l1, null, 6);
        } else {
            C1171530gal c1171530gal = (C1171530gal) afS154S0200000_18.l0;
            C19EG c19eg = (C19EG) afS154S0200000_18.l1;
            List<CollectionDetail> list2 = collectionListResponse.items;
            if (list2 != null) {
                size = list2.size();
            }
            c1171530gal.LJFF(c19eg, size, null);
        }
        C1C7U.LIZIZ("FeedAddToFavoritesPopToast@bc43.showAt$4$doClick$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$7(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("MusicCollectionRavenRequest@a733.request$1$1");
        C0X52 c0x52 = (C0X52) obj;
        ((C09AJ) afS154S0200000_18.l0).onNext(new C1161000gJm((RavenPage) c0x52.LIZIZ, c0x52.LIZ.LIZLLL, (C1160990gJl) afS154S0200000_18.l1));
        C1C7U.LIZIZ("MusicCollectionRavenRequest@a733.request$1$1");
    }

    public static final void accept$8(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("GetMixListViewModel@864a.config$2$1$onLoadMore$result$1");
        MixListResponse mixListResponse = (MixListResponse) obj;
        if (mixListResponse != null) {
            GetMixListViewModel getMixListViewModel = (GetMixListViewModel) afS154S0200000_18.l0;
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS154S0200000_18.l1;
            List<C1168650gW7> listVQ2 = getMixListViewModel.vQ2(mixListResponse.getMixList(), true);
            List<C1168620gW4> list = getMixListViewModel.LLILZIL;
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.addAll(listVQ2);
            if (mixListResponse.getHasMore()) {
                C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                List<C1168650gW7> listVQ22 = getMixListViewModel.vQ2(mixListResponse.getMixList(), true);
                c317290CcB.getClass();
                C323380Cm0 c323380Cm0 = new C323380Cm0(null, mixListResponse, listVQ22);
                C189200o6.m2constructorimpl(c323380Cm0);
                interfaceC1364105Vn.resumeWith(c323380Cm0);
            } else {
                C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
                List<C1168650gW7> listVQ23 = getMixListViewModel.vQ2(mixListResponse.getMixList(), true);
                c317290CcB2.getClass();
                C316640Cb8 c316640Cb8 = new C316640Cb8(listVQ23);
                C189200o6.m2constructorimpl(c316640Cb8);
                interfaceC1364105Vn.resumeWith(c316640Cb8);
            }
        }
        C1C7U.LIZIZ("GetMixListViewModel@864a.config$2$1$onLoadMore$result$1");
    }

    public static final void accept$9(AfS154S0200000_18 afS154S0200000_18, Object obj) {
        C1C7U.LIZ("GetMixListViewModel@864a.config$2$1$onRefresh$result$1");
        MixListResponse mixListResponse = (MixListResponse) obj;
        if (mixListResponse != null) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS154S0200000_18.l0;
            GetMixListViewModel getMixListViewModel = (GetMixListViewModel) afS154S0200000_18.l1;
            List<MixStruct> mixList = mixListResponse.getMixList();
            if (mixList != null && mixList.isEmpty()) {
                C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                List<C1168650gW7> listVQ2 = getMixListViewModel.vQ2(mixListResponse.getMixList(), false);
                c317290CcB.getClass();
                C316640Cb8 c316640Cb8 = new C316640Cb8(listVQ2);
                C189200o6.m2constructorimpl(c316640Cb8);
                interfaceC1364105Vn.resumeWith(c316640Cb8);
            } else if (mixListResponse.getHasMore()) {
                C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
                List<C1168650gW7> listVQ22 = getMixListViewModel.vQ2(mixListResponse.getMixList(), false);
                c317290CcB2.getClass();
                C323380Cm0 c323380Cm0 = new C323380Cm0(null, mixListResponse, listVQ22);
                C189200o6.m2constructorimpl(c323380Cm0);
                interfaceC1364105Vn.resumeWith(c323380Cm0);
            } else {
                C317290CcB c317290CcB3 = AbstractC316870CbV.LIZ;
                List<C1168650gW7> listVQ23 = getMixListViewModel.vQ2(mixListResponse.getMixList(), false);
                c317290CcB3.getClass();
                C316640Cb8 c316640Cb82 = new C316640Cb8(listVQ23);
                C189200o6.m2constructorimpl(c316640Cb82);
                interfaceC1364105Vn.resumeWith(c316640Cb82);
            }
        }
        C1C7U.LIZIZ("GetMixListViewModel@864a.config$2$1$onRefresh$result$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS154S0200000_18(com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel r2, com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel r3, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<com.ss.android.ugc.aweme.mix.model.MixCandidateVideosResponse>> r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 10: goto Le;
                case 11: goto Le;
                case 12: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS154S0200000_18.<init>(com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel, X.05Vn, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS154S0200000_18(com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel r2, com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel r3, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<com.ss.android.ugc.aweme.mix.model.MixListResponse>> r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 8 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS154S0200000_18.<init>(com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel, X.05Vn, int):void");
    }

    public AfS154S0200000_18(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
