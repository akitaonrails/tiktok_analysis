package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.ApplyGuideViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.guest.GuestTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.ApplyGuideResponse;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllGetContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateGuestSettingResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.game.model.BetStats;
import com.ss.android.ugc.aweme.ecommerce.publish.aidubbing.GetProductTranslationAbilityResponse;
import com.ss.android.ugc.aweme.ecommerce.publish.aidubbing.GetProductTranslationAbilityResponseData;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import webcast.api.game.RevenueGuessGetSettleDataResponse;
import webcast.data.multi_guest_play.CountdownForAllContent;

/* JADX INFO: renamed from: X.01zq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C516801zq implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;

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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(C516801zq c516801zq, Object obj) {
        CountdownForAllContent countdownForAllContent;
        C1C7U.LIZ("BaseCountDownForAllV2Model@d337.requestGetCountDownForAllContent$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (countdownForAllContent = ((CountdownForAllGetContentResponse.ResponseData) c470590Icr.data).playContent) != null) {
            ((C01IS) c516801zq.l1).LJFF(countdownForAllContent, c516801zq.s0);
        }
        C1C7U.LIZIZ("BaseCountDownForAllV2Model@d337.requestGetCountDownForAllContent$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(C516801zq c516801zq, Object obj) {
        C1C7U.LIZ("ApplyGuideViewModel@7f7.handleTrigger$1$2");
        C470590Icr c470590Icr = (C470590Icr) obj;
        ApplyGuideResponse.ResponseData responseData = (ApplyGuideResponse.ResponseData) c470590Icr.data;
        if (responseData != null) {
            ApplyGuideViewModel applyGuideViewModel = (ApplyGuideViewModel) c516801zq.l1;
            String str = c516801zq.s0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("applyGuide, display:");
            sbLIZ.append(responseData.isDisplay);
            sbLIZ.append(" strategy:");
            sbLIZ.append(responseData.displayStrategy);
            sbLIZ.append(" triggerAgain:");
            sbLIZ.append(responseData.triggerAgain);
            C20441214yg.LJIIIZ("ApplyLinkMicHandler", C2188811AlT.LIZIZ(sbLIZ));
            if (responseData.isDisplay && responseData.displayStrategy == 1) {
                applyGuideViewModel.setState(new C112600bk(str, c470590Icr, responseData));
            }
            C924810aAp.LJ().LJJJJJL = responseData.triggerAgain;
        }
        C1C7U.LIZIZ("ApplyGuideViewModel@7f7.handleTrigger$1$2");
    }

    public static final void accept$10(C516801zq c516801zq, Object obj) {
        List<BetStats> list;
        C1C7U.LIZ("PreviewGameLiveGuessBoardManager@613d.getSettleDataAndUpdateBoard$1$2");
        RevenueGuessGetSettleDataResponse.ResponseData responseData = ((RevenueGuessGetSettleDataResponse) obj).data;
        if (responseData != null && (list = responseData.userStats) != null) {
            long j = 0;
            for (BetStats betStats : list) {
                j += betStats.winPoints - betStats.betPoints;
            }
            Map<String, Object> map = C1338270kvh.LIZ;
            C258000zC.LJ((C258000zC) c516801zq.l1, c516801zq.s0, null, null, Long.valueOf(j / 100), 44);
        }
        C1C7U.LIZIZ("PreviewGameLiveGuessBoardManager@613d.getSettleDataAndUpdateBoard$1$2");
    }

    public static final void accept$11(C516801zq c516801zq, Object obj) {
        List<BetStats> list;
        C1C7U.LIZ("GameLiveGuessBoardManager@1365.getSettleDataAndUpdateBoard$2");
        RevenueGuessGetSettleDataResponse.ResponseData responseData = ((RevenueGuessGetSettleDataResponse) obj).data;
        if (responseData != null && (list = responseData.userStats) != null) {
            long j = 0;
            for (BetStats betStats : list) {
                j += betStats.winPoints - betStats.betPoints;
            }
            Map<String, Object> map = C1338270kvh.LIZ;
            C258100zD.LJII((C258100zD) c516801zq.l1, c516801zq.s0, null, null, Long.valueOf(j / 100), 44);
        }
        C1C7U.LIZIZ("GameLiveGuessBoardManager@1365.getSettleDataAndUpdateBoard$2");
    }

    public static final void accept$2(C516801zq c516801zq, Object obj) {
        Boolean boolValueOf;
        C1C7U.LIZ("GuestSettingHelper@280f.syncGuestSetting$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncGuestSetting, source=");
        sbLIZ.append(c516801zq.s0);
        sbLIZ.append(", ");
        UpdateGuestSettingResponse.ResponseData responseData = ((UpdateGuestSettingResponse) obj).data;
        if (responseData != null) {
            boolValueOf = Boolean.valueOf(responseData.updateResult);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C20441214yg.LIZIZ("GuestSettingHelper", C2188811AlT.LIZIZ(sbLIZ));
        ((C924310aA1) c516801zq.l1).LIZIZ();
        C1C7U.LIZIZ("GuestSettingHelper@280f.syncGuestSetting$1");
    }

    public static final void accept$3(C516801zq c516801zq, Object obj) {
        C1C7U.LIZ("GuestSettingHelper@280f.syncGuestSetting$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncGuestSetting, source=");
        sbLIZ.append(c516801zq.s0);
        sbLIZ.append(", ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LJ("GuestSettingHelper", C2188811AlT.LIZIZ(sbLIZ));
        ((C924310aA1) c516801zq.l1).LIZIZ();
        C1C7U.LIZIZ("GuestSettingHelper@280f.syncGuestSetting$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(C516801zq c516801zq, Object obj) {
        C1C7U.LIZ("GuestTextHeaderViewModel@ebbe.recordInfoObserver$1$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchSingleEffect success effect:");
        sbLIZ.append(C20424314vx.LIZJ(c516801zq.s0));
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "GuestTextHeaderViewModel", 2);
        GuestTextHeaderViewModel guestTextHeaderViewModel = (GuestTextHeaderViewModel) c516801zq.l1;
        guestTextHeaderViewModel.FQ2((C01ZA) guestTextHeaderViewModel.LLILZ.getValue());
        C1C7U.LIZIZ("GuestTextHeaderViewModel@ebbe.recordInfoObserver$1$1");
    }

    public static final void accept$5(C516801zq c516801zq, Object obj) {
        String str;
        C1C7U.LIZ("TriggerApi$Companion@49bb.request$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        String str2 = (String) C13LP.LJJJLL((List) c516801zq.l1);
        String str3 = c516801zq.s0;
        if (baseResponse != null) {
            str = baseResponse.LIZIZ;
        } else {
            str = null;
        }
        C206400qs.LIZ(true, str2, str3, 0, null, str, 24);
        C1C7U.LIZIZ("TriggerApi$Companion@49bb.request$1");
    }

    public static final void accept$6(C516801zq c516801zq, Object obj) {
        String strLIZIZ;
        int statusCode;
        C1C7U.LIZ("TriggerApi$Companion@49bb.request$2");
        Throwable th = (Throwable) obj;
        if (th instanceof C501520Jle) {
            C501520Jle c501520Jle = (C501520Jle) th;
            statusCode = c501520Jle.getErrorCode();
            strLIZIZ = c501520Jle.getMessage();
        } else if (th instanceof C1494450ozb) {
            C1494450ozb c1494450ozb = (C1494450ozb) th;
            statusCode = c1494450ozb.getCronetInternalErrorCode();
            strLIZIZ = c1494450ozb.getMessage();
        } else if (th instanceof C1811850xFX) {
            C1811850xFX c1811850xFX = (C1811850xFX) th;
            statusCode = c1811850xFX.statusCode;
            strLIZIZ = c1811850xFX.getMessage();
        } else if (th instanceof C1494690ozz) {
            C1494690ozz c1494690ozz = (C1494690ozz) th;
            statusCode = c1494690ozz.getStatusCode();
            strLIZIZ = c1494690ozz.getMessage();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th.getClass().getName());
            sbLIZ.append(" : [");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            statusCode = 0;
        }
        C206400qs.LIZ(false, (String) C13LP.LJJJLL((List) c516801zq.l1), c516801zq.s0, statusCode, strLIZIZ, null, 32);
        C1C7U.LIZIZ("TriggerApi$Companion@49bb.request$2");
    }

    public static final void accept$7(C516801zq c516801zq, Object obj) {
        int iIntValue;
        C1C7U.LIZ("AIDubbingSheetLayout@4825.fetchProductTranslationAbility$1");
        GetProductTranslationAbilityResponse getProductTranslationAbilityResponse = (GetProductTranslationAbilityResponse) obj;
        ((C127R) c516801zq.l1).LLILZLL = false;
        GetProductTranslationAbilityResponseData getProductTranslationAbilityResponseData = getProductTranslationAbilityResponse.data;
        Integer num = getProductTranslationAbilityResponse.statusCode;
        if (num != null && num.intValue() == 0 && getProductTranslationAbilityResponseData != null) {
            Integer num2 = getProductTranslationAbilityResponseData.enableEcVideoAiTranslateType;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = ((C127R) c516801zq.l1).LLJI;
            }
            C127R c127r = (C127R) c516801zq.l1;
            c127r.LLJI = iIntValue;
            C1420670n4b.LIZ(c127r.LL, iIntValue, getProductTranslationAbilityResponseData.layoutType, getProductTranslationAbilityResponseData.shouldEnableAiVideoTranslateOption, c516801zq.s0);
            ((C127R) c516801zq.l1).LIZ(iIntValue);
        } else {
            C127R c127r2 = (C127R) c516801zq.l1;
            c127r2.LIZ(c127r2.LLJI);
        }
        ((C127R) c516801zq.l1).LIZJ();
        C1C7U.LIZIZ("AIDubbingSheetLayout@4825.fetchProductTranslationAbility$1");
    }

    public static final void accept$8(C516801zq c516801zq, Object obj) {
        C1C7U.LIZ("RemoveTemplateApi@60ba.requestRemoveTemplate$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("templateId ");
        sbLIZ.append(c516801zq.s0);
        sbLIZ.append(" remove anchor fail response ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C201955140j.LJI("requestRemoveTemplate error", new Throwable(C2188811AlT.LIZIZ(sbLIZ)));
        Activity activityLIZ = C1388190mED.LIZ((Context) c516801zq.l1);
        if (activityLIZ != null) {
            Context context = (Context) c516801zq.l1;
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(context.getString(2131835702));
            c1389890mGx.LJIIJJI();
        }
        C1C7U.LIZIZ("RemoveTemplateApi@60ba.requestRemoveTemplate$2");
    }

    public static final void accept$9(C516801zq c516801zq, Object obj) {
        C1C7U.LIZ("FeedApiManager@9905.realFetchFeedData$7");
        Throwable th = (Throwable) obj;
        if (th instanceof C477520Io2) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            C467110ITl.LIZ(Integer.valueOf(c501470JlZ.getErrorCode()), c516801zq.s0, c501470JlZ.getLogId(), "", (Map) c516801zq.l1);
        } else {
            C467110ITl.LIZ(-1, c516801zq.s0, "", th.getMessage(), (Map) c516801zq.l1);
        }
        C1C7U.LIZIZ("FeedApiManager@9905.realFetchFeedData$7");
    }

    public C516801zq(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }

    public C516801zq(C258000zC c258000zC, EnumC259000zM enumC259000zM, String str, int i) {
        this.$t = i;
        this.l1 = c258000zC;
        this.s0 = str;
    }

    public C516801zq(C258100zD c258100zD, EnumC258900zL enumC258900zL, String str, int i) {
        this.$t = i;
        this.l1 = c258100zD;
        this.s0 = str;
    }
}
