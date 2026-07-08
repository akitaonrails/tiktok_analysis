package Y;

import X.AbstractC1604130rqV;
import X.AnonymousClass1639;
import X.C01GW;
import X.C0BJB;
import X.C0CU4;
import X.C0RT5;
import X.C0S5L;
import X.C0S5N;
import X.C0S5P;
import X.C0S5R;
import X.C0S5S;
import X.C0S5T;
import X.C0S64;
import X.C0S9P;
import X.C0SF9;
import X.C11JF;
import X.C123100dR;
import X.C161N;
import X.C161T;
import X.C163D;
import X.C19292910dr;
import X.C197039127h;
import X.C20703515zt;
import X.C207047160f;
import X.C207118162y;
import X.C207134163o;
import X.C207136163q;
import X.C207158164m;
import X.C2188811AlT;
import X.C2286608xc;
import X.C286080BJe;
import X.C288470BSj;
import X.C631370Opb;
import X.C708250RqJ;
import X.C708900RrM;
import X.C710170RtP;
import X.C710180RtQ;
import X.C710190RtR;
import X.C710200RtS;
import X.C710250RtX;
import X.C710300Rtc;
import X.C710670RuD;
import X.C718770SHj;
import X.C719880SLq;
import X.C720550SOf;
import X.C720690SOt;
import X.C734760Sry;
import X.C736680Sv4;
import X.EnumC2748014o;
import X.EnumC715590S5d;
import X.EnumC715680S5m;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment;
import com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol;
import com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeCacheViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel;
import com.ss.android.ugc.aweme.newcreatoredit.translation.NewCreatorCaptionEditTranslationFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.translation.service.IAutoDubbingService;
import com.ss.android.ugc.aweme.translation.ui.AutoDubbingConsumptionLabelAssemV1;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideViewPagerComponent;
import com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.BioTranslationViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class AgS292S0100000_11 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            case 6:
                return emit$6(this, obj, interfaceC1364105Vn);
            case 7:
                return emit$7(this, obj, interfaceC1364105Vn);
            case 8:
                return emit$8(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_ECAF /* 9 */:
                return emit$9(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return emit$10(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return emit$11(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return emit$12(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return emit$13(this, obj, interfaceC1364105Vn);
            case 14:
                return emit$14(this, obj, interfaceC1364105Vn);
            case 15:
                return emit$15(this, obj, interfaceC1364105Vn);
            case 16:
                return emit$16(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return emit$17(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return emit$18(this, obj, interfaceC1364105Vn);
            case 19:
                return emit$19(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return emit$20(this, obj, interfaceC1364105Vn);
            case 21:
                return emit$21(this, obj, interfaceC1364105Vn);
            case 22:
                return emit$22(this, obj, interfaceC1364105Vn);
            case 23:
                return emit$23(this, obj, interfaceC1364105Vn);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return emit$24(this, obj, interfaceC1364105Vn);
            case 25:
                return emit$25(this, obj, interfaceC1364105Vn);
            case 26:
                return emit$26(this, obj, interfaceC1364105Vn);
            case 27:
                return emit$27(this, obj, interfaceC1364105Vn);
            case 28:
                return emit$28(this, obj, interfaceC1364105Vn);
            case 29:
                return emit$29(this, obj, interfaceC1364105Vn);
            case 30:
                return emit$30(this, obj, interfaceC1364105Vn);
            case 31:
                return emit$31(this, obj, interfaceC1364105Vn);
            case 32:
                return emit$32(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return emit$33(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS292S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object emit$0(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((C710670RuD) agS292S0100000_11.l0).LIZIZ();
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((C710670RuD) agS292S0100000_11.l0).LIZIZ();
        return Unit.LIZ;
    }

    public static final Object emit$10(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((TranslationStatusViewModel) agS292S0100000_11.l0).setState(new C710190RtR((C0S5S) obj));
        return Unit.LIZ;
    }

    public static final Object emit$11(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((TranslationStatusViewModel) agS292S0100000_11.l0).setState(new C710200RtS((C0S5N) obj));
        return Unit.LIZ;
    }

    public static final Object emit$12(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((TranslationStatusViewModel) agS292S0100000_11.l0).setState(new AwS590S0100000_11((C0S64) obj, 278));
        return Unit.LIZ;
    }

    public static final Object emit$13(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0S5N c0s5n = (C0S5N) obj;
        PhotoSlideViewPagerComponent photoSlideViewPagerComponent = (PhotoSlideViewPagerComponent) agS292S0100000_11.l0;
        C719880SLq c719880SLq = photoSlideViewPagerComponent.LLLFFI;
        if (c719880SLq != null) {
            c719880SLq.LJJJJZ(c0s5n, photoSlideViewPagerComponent.xt0());
        }
        return Unit.LIZ;
    }

    public static final Object emit$14(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C11JF c11jf = ((BioTranslationViewModel) agS292S0100000_11.l0).LL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        ((BioTranslationViewModel) agS292S0100000_11.l0).setState(AFwS257S0000000_19.get$arr$(493));
        return Unit.LIZ;
    }

    public static final Object emit$15(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        VideoDescAssem videoDescAssem = (VideoDescAssem) agS292S0100000_11.l0;
        HandlerHook.viewRemoveCallbacks(videoDescAssem.LJJIJL(), videoDescAssem.LLLLIILLL);
        HandlerHook.viewPost(videoDescAssem.LJJIJL(), videoDescAssem.LLLLIILLL);
        return Unit.LIZ;
    }

    public static final Object emit$16(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str;
        C163D c163d = (C163D) agS292S0100000_11.l0;
        c163d.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTranslationLanguageChanged to ");
        sbLIZ.append((String) obj);
        sbLIZ.append(", id=");
        C207134163o c207134163o = c163d.LJ;
        if (c207134163o != null) {
            str = c207134163o.LIZJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        c163d.LJI = EnumC715590S5d.TARGET_LANGUAGE_CHANGED;
        c163d.onEvent(C207158164m.LIZIZ);
        return Unit.LIZ;
    }

    public static final Object emit$17(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str;
        C163D c163d = (C163D) agS292S0100000_11.l0;
        c163d.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDoNotTransCodeChanged to ");
        sbLIZ.append(obj);
        sbLIZ.append(", id=");
        C207134163o c207134163o = c163d.LJ;
        if (c207134163o != null) {
            str = c207134163o.LIZJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        c163d.LJI = EnumC715590S5d.DO_NOT_TRANSLATE_CHANGED;
        c163d.onEvent(C207158164m.LIZIZ);
        return Unit.LIZ;
    }

    public static final Object emit$18(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        AnonymousClass1639 anonymousClass1639 = (AnonymousClass1639) agS292S0100000_11.l0;
        anonymousClass1639.getClass();
        anonymousClass1639.LJFF = EnumC715590S5d.TARGET_LANGUAGE_CHANGED;
        anonymousClass1639.onEvent(C207158164m.LIZIZ);
        return Unit.LIZ;
    }

    public static final Object emit$19(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str;
        C708900RrM c708900RrM = (C708900RrM) obj;
        C163D c163d = (C163D) agS292S0100000_11.l0;
        c163d.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBizCompTranslationToggleChanged to ");
        sbLIZ.append(c708900RrM);
        sbLIZ.append(", id=");
        C207134163o c207134163o = c163d.LJ;
        if (c207134163o != null) {
            str = c207134163o.LIZJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        c163d.LJI = EnumC715590S5d.BIZ_COMP_ALL_TOGGLE;
        c163d.LJII = c708900RrM.LIZ;
        C207134163o c207134163o2 = c163d.LJ;
        if (c207134163o2 != null) {
            C161N.LIZIZ.LLIILZL(c207134163o2.LIZ);
        }
        c163d.LJIL();
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((C710670RuD) agS292S0100000_11.l0).LIZIZ();
        return Unit.LIZ;
    }

    public static final Object emit$20(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        AnonymousClass1639 anonymousClass1639 = (AnonymousClass1639) agS292S0100000_11.l0;
        anonymousClass1639.getClass();
        anonymousClass1639.LJFF = EnumC715590S5d.DO_NOT_TRANSLATE_CHANGED;
        if (C0BJB.LIZ()) {
            C161N.LIZIZ.LJJZ();
        }
        anonymousClass1639.onEvent(C207158164m.LIZIZ);
        return Unit.LIZ;
    }

    public static final Object emit$21(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String cid;
        AnonymousClass1639 anonymousClass1639 = (AnonymousClass1639) agS292S0100000_11.l0;
        anonymousClass1639.getClass();
        anonymousClass1639.LJFF = EnumC715590S5d.COMMENT_ALL_TOGGLE;
        EnumC715680S5m enumC715680S5m = EnumC715680S5m.NOT_OVERWRITTEN;
        C161N c161n = C161N.LIZIZ;
        Comment comment = anonymousClass1639.LIZLLL;
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        c161n.LJIIIZ(enumC715680S5m, cid);
        anonymousClass1639.LJIJJLI();
        return Unit.LIZ;
    }

    public static final Object emit$22(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String awemeId;
        Comment comment = ((AnonymousClass1639) agS292S0100000_11.l0).LIZLLL;
        String cid = null;
        if (comment != null) {
            awemeId = comment.getAwemeId();
        } else {
            awemeId = null;
        }
        if (Intrinsics.LJFF(obj, awemeId)) {
            AnonymousClass1639 anonymousClass1639 = (AnonymousClass1639) agS292S0100000_11.l0;
            anonymousClass1639.getClass();
            anonymousClass1639.LJFF = EnumC715590S5d.COMMENT_ALL_TOGGLE;
            EnumC715680S5m enumC715680S5m = EnumC715680S5m.NOT_OVERWRITTEN;
            C161N c161n = C161N.LIZIZ;
            Comment comment2 = anonymousClass1639.LIZLLL;
            if (comment2 != null) {
                cid = comment2.getCid();
            }
            c161n.LJIIIZ(enumC715680S5m, cid);
            anonymousClass1639.LJIJJLI();
        }
        return Unit.LIZ;
    }

    public static final Object emit$23(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C207118162y c207118162y = (C207118162y) agS292S0100000_11.l0;
        c207118162y.getClass();
        c207118162y.LJ = EnumC715590S5d.TARGET_LANGUAGE_CHANGED;
        c207118162y.LJIL();
        return Unit.LIZ;
    }

    public static final Object emit$24(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String aid;
        Aweme aweme;
        C708250RqJ c708250RqJ = (C708250RqJ) obj;
        C207118162y c207118162y = (C207118162y) agS292S0100000_11.l0;
        c207118162y.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMasterTranslSettingChanged to ");
        sbLIZ.append(c708250RqJ);
        sbLIZ.append(", aid=");
        VideoItemParams videoItemParams = c207118162y.LJI;
        Aweme aweme2 = null;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        EnumC715590S5d enumC715590S5d = EnumC715590S5d.COMBINE_ENTRANCE_MASTER_TOGGLE;
        c207118162y.LJJIIJZLJL(enumC715590S5d, c708250RqJ.LIZ);
        C207136163q c207136163qLJIJJ = c207118162y.LJIJJ();
        VideoItemParams videoItemParams2 = c207118162y.LJI;
        if (videoItemParams2 != null) {
            aweme2 = videoItemParams2.getAweme();
        }
        if (c207136163qLJIJJ.LJ(aweme2, EnumC715680S5m.NOT_OVERWRITTEN)) {
            c207118162y.LJIIIIZZ(enumC715590S5d, true);
            c207118162y.LJJI(enumC715590S5d);
        } else {
            c207118162y.LJIJJLI(enumC715590S5d);
        }
        return Unit.LIZ;
    }

    public static final Object emit$25(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Boolean) obj).booleanValue();
        ((C207118162y) agS292S0100000_11.l0).LJIL();
        return Unit.LIZ;
    }

    public static final Object emit$26(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C207118162y c207118162y = (C207118162y) agS292S0100000_11.l0;
        c207118162y.getClass();
        c207118162y.LJ = EnumC715590S5d.DO_NOT_TRANSLATE_CHANGED;
        c207118162y.LJIL();
        return Unit.LIZ;
    }

    public static final Object emit$27(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ArrayList arrayList;
        Aweme awemeLLILLL;
        BatchDetailList batchDetailList = (BatchDetailList) obj;
        Keva keva = C0CU4.LIZ;
        if (C288470BSj.LIZ) {
            C0CU4.LIZ.storeString("key_landscape_cache_data", "");
        }
        List<Aweme> list = batchDetailList.items;
        if (list != null) {
            arrayList = new ArrayList();
            for (Aweme aweme : list) {
                aweme.setRequestId(batchDetailList.requestId);
                aweme.setLogPbBean(batchDetailList.logPbBean);
                AwemeExtKt.appendMobParam(aweme, "landscape_screen_item_soure", "landscape_feed");
                IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                if (iAwemeService != null && (awemeLLILLL = iAwemeService.LLILLL(aweme)) != null) {
                    arrayList.add(awemeLLILLL);
                }
            }
        } else {
            arrayList = new ArrayList();
        }
        ((LandscapeCacheViewModel) agS292S0100000_11.l0).setState(new AwS590S0100000_11(arrayList, (List<CleanModeProtocol>) 432));
        return Unit.LIZ;
    }

    public static final Object emit$28(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zLIZ;
        IAutoDubbingService iAutoDubbingServiceLIZ;
        Integer numLJ;
        AutoDubbingConsumptionLabelAssemV1 autoDubbingConsumptionLabelAssemV1 = (AutoDubbingConsumptionLabelAssemV1) agS292S0100000_11.l0;
        IAutoDubbingService iAutoDubbingServiceLIZ2 = C0RT5.LIZ();
        if (iAutoDubbingServiceLIZ2 != null) {
            zLIZ = iAutoDubbingServiceLIZ2.LIZ(((VideoItemParams) C631370Opb.LIZ((AutoDubbingConsumptionLabelAssemV1) agS292S0100000_11.l0)).getAweme());
        } else {
            zLIZ = false;
        }
        autoDubbingConsumptionLabelAssemV1.Bp(zLIZ);
        TuxTag tuxTag = ((AutoDubbingConsumptionLabelAssemV1) agS292S0100000_11.l0).LLJZIJLIL;
        if (tuxTag != null) {
            IAutoDubbingService iAutoDubbingServiceLIZ3 = C0RT5.LIZ();
            if (iAutoDubbingServiceLIZ3 != null && iAutoDubbingServiceLIZ3.LIZLLL(((VideoItemParams) C631370Opb.LIZ((AutoDubbingConsumptionLabelAssemV1) agS292S0100000_11.l0)).getAweme())) {
                numLJ = C2286608xc.LJ(R.raw.icon_info_circle);
            } else {
                numLJ = null;
            }
            tuxTag.setTagIcon(numLJ);
        }
        IAutoDubbingService iAutoDubbingServiceLIZ4 = C0RT5.LIZ();
        if (iAutoDubbingServiceLIZ4 != null) {
            iAutoDubbingServiceLIZ4.LJ(((VideoItemParams) C631370Opb.LIZ((AutoDubbingConsumptionLabelAssemV1) agS292S0100000_11.l0)).getAweme());
        }
        if (((AutoDubbingConsumptionLabelAssemV1) agS292S0100000_11.l0).LJJIJL().getVisibility() == 0 && (iAutoDubbingServiceLIZ = C0RT5.LIZ()) != null) {
            iAutoDubbingServiceLIZ.LJFF(((VideoItemParams) C631370Opb.LIZ((AutoDubbingConsumptionLabelAssemV1) agS292S0100000_11.l0)).mEventType, EnumC2748014o.SHOW.getValue(), ((VideoItemParams) C631370Opb.LIZ((AutoDubbingConsumptionLabelAssemV1) agS292S0100000_11.l0)).getAweme().getAid());
        }
        return Unit.LIZ;
    }

    public static final Object emit$29(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C718770SHj c718770SHj = (C718770SHj) agS292S0100000_11.l0;
        c718770SHj.LJJJJZI().LJJ(null);
        c718770SHj.LJJJJZI().LJJIFFI(null);
        c718770SHj.LLLIL = null;
        c718770SHj.LLLILZJ = null;
        c718770SHj.LLLILZLLLI = null;
        c718770SHj.LLL = null;
        C0SF9 c0sf9 = ((C718770SHj) agS292S0100000_11.l0).LLLF;
        c0sf9.LJIIIIZZ = null;
        c0sf9.LJIIIZ = false;
        c0sf9.LJ = null;
        c0sf9.LJFF = null;
        c0sf9.LJI = null;
        c0sf9.LJII = null;
        return Unit.LIZ;
    }

    public static final Object emit$3(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((BaseCaptionSheetFragment) agS292S0100000_11.l0).WR((String) obj);
        return Unit.LIZ;
    }

    public static final Object emit$30(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object first;
        Aweme aweme;
        Pair pair = (Pair) obj;
        String aid = null;
        if (pair != null) {
            first = pair.getFirst();
        } else {
            first = null;
        }
        VideoItemParams item = ((C718770SHj) agS292S0100000_11.l0).LLILLJJLI.getItem();
        if (item != null && (aweme = item.getAweme()) != null) {
            aid = aweme.getAid();
        }
        if (Intrinsics.LJFF(first, aid)) {
            C718770SHj c718770SHj = (C718770SHj) agS292S0100000_11.l0;
            C710300Rtc c710300Rtc = c718770SHj.LLLIZZ;
            if (c710300Rtc != null && c710300Rtc.LIZLLL) {
                C736680Sv4.LJIJJ(c718770SHj.LLILZ, new AwS377S0200000_11(c710300Rtc, c718770SHj, 123));
            } else {
                c718770SHj.LLLLZ = true;
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$31(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        ((C720550SOf) agS292S0100000_11.l0).LIZ((C0S5S) obj);
        return Unit.LIZ;
    }

    public static final Object emit$32(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        ((C720690SOt) agS292S0100000_11.l0).LJII((C0S5R) obj);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$33(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int i;
        C0S9P c0s9p;
        C0S5N c0s5n = (C0S5N) obj;
        PostModePhotosComponent postModePhotosComponent = (PostModePhotosComponent) agS292S0100000_11.l0;
        C719880SLq c719880SLq = postModePhotosComponent.LLIZ;
        if (c719880SLq != null) {
            PostModeFullPageViewModel postModeFullPageViewModel = postModePhotosComponent.LLJI;
            if (postModeFullPageViewModel != null && (c0s9p = (C0S9P) postModeFullPageViewModel.getState()) != null) {
                i = c0s9p.LL;
            } else {
                i = 0;
            }
            c719880SLq.LJJJJZ(c0s5n, i);
        }
        return Unit.LIZ;
    }

    public static final Object emit$4(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0S5T c0s5t = (C0S5T) obj;
        C19292910dr c19292910dr = ((CaptionsPanelFragment) agS292S0100000_11.l0).LLJILJILJ;
        if (c19292910dr != null) {
            c19292910dr.LJI(new AwS590S0100000_11(c0s5t, 42));
        }
        AbstractC1604130rqV abstractC1604130rqVHS = ((CaptionsPanelFragment) agS292S0100000_11.l0).hS();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionsPanelFragment alwaysTranslateCommentToggle onCommentsTranslationToggleStatusChanged: ");
        sbLIZ.append(c0s5t.LIZ);
        sbLIZ.append(" data: ");
        sbLIZ.append(c0s5t.LIZIZ);
        abstractC1604130rqVHS.LJ(C2188811AlT.LIZIZ(sbLIZ));
        ((CaptionsPanelFragment) agS292S0100000_11.l0).getClass();
        return Unit.LIZ;
    }

    public static final Object emit$5(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Integer num = (Integer) obj;
        C01GW c01gw = C286080BJe.LIZ;
        boolean z = true;
        if (((Number) c01gw.getValue()).intValue() != 0) {
            C734760Sry c734760Sry = ((FeedRightBtnBaseViewModel) agS292S0100000_11.l0).listener;
            if (((Number) c01gw.getValue()).intValue() != 2) {
                z = false;
            }
            c734760Sry.LIZ(z);
        } else {
            C734760Sry c734760Sry2 = ((FeedRightBtnBaseViewModel) agS292S0100000_11.l0).listener;
            if (num != null && num.intValue() == 0) {
                z = false;
            }
            c734760Sry2.LIZ(z);
        }
        return Unit.LIZ;
    }

    public static final Object emit$6(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str = (String) obj;
        NewCreatorCaptionEditTranslationFragment newCreatorCaptionEditTranslationFragment = (NewCreatorCaptionEditTranslationFragment) agS292S0100000_11.l0;
        if (newCreatorCaptionEditTranslationFragment.LLILZ != null && C123100dR.LIZ(NewCreatorCaptionEditViewModel.yQ2())) {
            newCreatorCaptionEditTranslationFragment.OR();
        }
        C197039127h c197039127h = newCreatorCaptionEditTranslationFragment.LLLF;
        if (c197039127h != null) {
            C20703515zt.LIZ.getClass();
            String strLJII = C20703515zt.LJII(str);
            if (strLJII == null) {
                strLJII = "";
            }
            c197039127h.setText(strLJII);
        }
        return Unit.LIZ;
    }

    public static final Object emit$7(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0S5P c0s5p = (C0S5P) obj;
        C161T.LIZ().LJIIIIZZ(c0s5p instanceof C0S5L);
        TranslationStatusViewModel translationStatusViewModel = (TranslationStatusViewModel) agS292S0100000_11.l0;
        translationStatusViewModel.withState(new C710250RtX(c0s5p, translationStatusViewModel));
        return Unit.LIZ;
    }

    public static final Object emit$8(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((TranslationStatusViewModel) agS292S0100000_11.l0).setState(new C710170RtP((C0S5R) obj));
        return Unit.LIZ;
    }

    public static final Object emit$9(AgS292S0100000_11 agS292S0100000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((TranslationStatusViewModel) agS292S0100000_11.l0).setState(new C710180RtQ((C207047160f) obj));
        return Unit.LIZ;
    }
}
