package Y;

import X.C09JN;
import X.C0IJT;
import X.C0J1R;
import X.C0UO0;
import X.C0UQX;
import X.C0UVZ;
import X.C1161920gLG;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import X.C477520Io2;
import X.C480460Ism;
import X.C486790J7d;
import X.C501520Jle;
import X.C743540TEq;
import X.C751910TeX;
import X.C773300UVc;
import X.C774330UZb;
import X.C781890Uln;
import X.C784490Upz;
import X.InterfaceC750130Tbf;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.MergeApiResponseEvent;
import com.bytedance.android.live.broadcast.api.MergeApiResponseFailEvent;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.api.LiveCaptchaCheckApi;
import com.bytedance.android.livesdk.broadcast.interaction.function.BroadcastMessagePresenter;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.android.livesdk.broadcast.preview.onetap.OneTapGoLiveManager;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.dataChannel.CaptchaCheckFailedChannel;
import com.bytedance.android.livesdk.dataChannel.CaptchaLivePauseTimeChannel;
import com.bytedance.android.livesdk.dataChannel.FeaturedHashTagCountDownRemindEvent;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoFailEvent;
import com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceQRCodeFragment;
import com.bytedance.android.livesdk.game.chatroom.ui.GamePreparationFragment;
import com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostEnableNetControlSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import tikcast.api.anchor.DelHostRelationResponse;
import tikcast.api.eco.CaptchaCheckResponse;
import webcast.api.creator.RoomCreatorBizInfoResponse;

/* JADX INFO: loaded from: classes13.dex */
public class AfS4S0100100_12 implements C09JN {
    public final int $t;
    public long j1;
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
        }
    }

    public static final void accept$0(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        C1C7U.LIZ("GameDualDeviceQRCodeFragment@4acc.initView$4$3");
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            ImageView imageView = (ImageView) ((GameDualDeviceQRCodeFragment) afS4S0100100_12.l0).LLILZ.getValue();
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
            C743540TEq.LJII(String.valueOf(afS4S0100100_12.j1));
        }
        C1C7U.LIZIZ("GameDualDeviceQRCodeFragment@4acc.initView$4$3");
    }

    public static final void accept$1(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        BroadcastMessagePresenter broadcastMessagePresenter = (BroadcastMessagePresenter) afS4S0100100_12.l0;
        long j = afS4S0100100_12.j1;
        broadcastMessagePresenter.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestAndPopCaptchaDialog failed, captchaId=");
        sbLIZ.append(j);
        sbLIZ.append(", roomId=");
        sbLIZ.append(broadcastMessagePresenter.LLILZ.getId());
        C20441214yg.LJFF("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ), (Throwable) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$10(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        RoomCreateInfo roomCreateInfo;
        C1C7U.LIZ("LiveBroadcastPreviewFragment@146.requestCreateInfoInPreview$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        C20441214yg.LIZIZ("HostNetCtrl", "preview suc");
        if (LiveHostEnableNetControlSetting.INSTANCE.enable()) {
            ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).unRegisterNetworkControl("biz_live_broadcast_preview");
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LiveBroadcastPreviewFragment liveBroadcastPreviewFragment = (LiveBroadcastPreviewFragment) afS4S0100100_12.l0;
        if (baseResponse != null) {
            roomCreateInfo = (RoomCreateInfo) baseResponse.data;
        } else {
            roomCreateInfo = null;
        }
        liveBroadcastPreviewFragment.ZR(roomCreateInfo);
        ((LiveBroadcastPreviewFragment) afS4S0100100_12.l0).getContext();
        C0UQX.LJIILLIIL(1, "", jElapsedRealtime - afS4S0100100_12.j1);
        C1C7U.LIZIZ("LiveBroadcastPreviewFragment@146.requestCreateInfoInPreview$2");
    }

    public static final void accept$11(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        C1C7U.LIZ("LiveBroadcastPreviewFragment@146.requestCreateInfoInPreview$3");
        Throwable th = (Throwable) obj;
        C20441214yg.LIZIZ("HostNetCtrl", "preview fail");
        if (LiveHostEnableNetControlSetting.INSTANCE.enable()) {
            ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).unRegisterNetworkControl("biz_live_broadcast_preview");
        }
        C486790J7d.LIZ(new ARunnableS112S0100000_12(th, 242));
        C486790J7d.LIZ(new ARunnableS12S0200100_7(th, afS4S0100100_12.j1, (LiveBroadcastPreviewFragment) afS4S0100100_12.l0, 4));
        DataChannel dataChannel = ((LiveBroadcastPreviewFragment) afS4S0100100_12.l0).LLILZLL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.FQ2(RoomCreateInfoFailEvent.class);
        C1C7U.LIZIZ("LiveBroadcastPreviewFragment@146.requestCreateInfoInPreview$3");
    }

    public static final void accept$12(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        C1C7U.LIZ("GenerateTask@b0b7.cancel$1$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancel id:");
        sbLIZ.append(afS4S0100100_12.j1);
        sbLIZ.append(" suc");
        C20441214yg.LIZIZ("GenerateTask", C2188811AlT.LIZIZ(sbLIZ));
        Function0 function0 = (Function0) afS4S0100100_12.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("GenerateTask@b0b7.cancel$1$1");
    }

    public static final void accept$13(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        C1C7U.LIZ("GenerateTask@b0b7.cancel$1$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancel id:");
        sbLIZ.append(afS4S0100100_12.j1);
        sbLIZ.append(" failed");
        C20441214yg.LJ("GenerateTask", C2188811AlT.LIZIZ(sbLIZ));
        Function0 function0 = (Function0) afS4S0100100_12.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("GenerateTask@b0b7.cancel$1$2");
    }

    public static final void accept$14(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        C1C7U.LIZ("OneTapGoLiveManager@c582.handleCanLiveVideo$3");
        ((OneTapGoLiveManager) afS4S0100100_12.l0).LJJIFFI(afS4S0100100_12.j1, "fetch_create_info");
        ((OneTapGoLiveManager) afS4S0100100_12.l0).LJIIL("fetch_create_info_failed");
        C20441214yg.LJFF("OneTapGoLiveManager", "oneTapGoLive failed,zipRequest failed for,", (Throwable) obj);
        C1C7U.LIZIZ("OneTapGoLiveManager@c582.handleCanLiveVideo$3");
    }

    public static final void accept$15(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        C1C7U.LIZ("AdminManager@fd5f.deleteHostIModerator$1");
        DelHostRelationResponse delHostRelationResponse = (DelHostRelationResponse) obj;
        InterfaceC750130Tbf interfaceC750130Tbf = (InterfaceC750130Tbf) ((WeakReference) afS4S0100100_12.l0).get();
        if (interfaceC750130Tbf != null) {
            interfaceC750130Tbf.LIZIZ(afS4S0100100_12.j1, delHostRelationResponse, null);
        }
        C1C7U.LIZIZ("AdminManager@fd5f.deleteHostIModerator$1");
    }

    public static final void accept$16(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        Exception exc;
        C1C7U.LIZ("AdminManager@fd5f.deleteHostIModerator$2");
        Throwable th = (Throwable) obj;
        InterfaceC750130Tbf interfaceC750130Tbf = (InterfaceC750130Tbf) ((WeakReference) afS4S0100100_12.l0).get();
        if (interfaceC750130Tbf != null) {
            long j = afS4S0100100_12.j1;
            if (th instanceof Exception) {
                exc = (Exception) th;
            } else {
                exc = null;
            }
            interfaceC750130Tbf.LIZIZ(j, null, exc);
        }
        C1C7U.LIZIZ("AdminManager@fd5f.deleteHostIModerator$2");
    }

    public static final void accept$17(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        C1C7U.LIZ("MultiGuestFollowStatusObserver@9a16.queryFollowStatus$disposable$1");
        C20441214yg.LJIIIZ("MultiGuestFollowStatusObserver", "queryUserWithId success.");
        FollowInfo followInfo = ((User) obj).getFollowInfo();
        if (followInfo != null) {
            long followStatus = followInfo.getFollowStatus();
            C751910TeX c751910TeX = (C751910TeX) afS4S0100100_12.l0;
            c751910TeX.LIZ.put(Long.valueOf(afS4S0100100_12.j1), Long.valueOf(followStatus));
        }
        C1C7U.LIZIZ("MultiGuestFollowStatusObserver@9a16.queryFollowStatus$disposable$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$18(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        RoomCreatorBizInfoResponse.BizInfoData bizInfoData;
        int i;
        C1C7U.LIZ("LiveBroadcastFragment@d956.requestMergeApiData$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        DataChannel dataChannel = ((LiveBroadcastFragment) afS4S0100100_12.l0).getDataChannel();
        String str = null;
        if (baseResponse != null) {
            bizInfoData = (RoomCreatorBizInfoResponse.BizInfoData) baseResponse.data;
        } else {
            bizInfoData = null;
        }
        long j = afS4S0100100_12.j1;
        if (baseResponse != null) {
            i = baseResponse.statusCode;
        } else {
            i = 0;
        }
        if (baseResponse != null) {
            str = baseResponse.LIZIZ;
        }
        dataChannel.LC0(MergeApiResponseEvent.class, new C774330UZb(bizInfoData, new C784490Upz(i, j, str, null)));
        C1C7U.LIZIZ("LiveBroadcastFragment@d956.requestMergeApiData$2");
    }

    public static final void accept$19(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        C1C7U.LIZ("LiveBroadcastFragment@d956.requestMergeApiData$3");
        ((LiveBroadcastFragment) afS4S0100100_12.l0).getDataChannel().LC0(MergeApiResponseFailEvent.class, new C784490Upz(-100, afS4S0100100_12.j1, "", (Throwable) obj));
        C1C7U.LIZIZ("LiveBroadcastFragment@d956.requestMergeApiData$3");
    }

    public static final void accept$2(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        BroadcastMessagePresenter broadcastMessagePresenter = (BroadcastMessagePresenter) afS4S0100100_12.l0;
        long j = afS4S0100100_12.j1;
        broadcastMessagePresenter.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestCaptchaForGameMode failed, captchaId=");
        sbLIZ.append(j);
        sbLIZ.append(", roomId=");
        sbLIZ.append(broadcastMessagePresenter.LLILZ.getId());
        C20441214yg.LJFF("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ), (Throwable) obj);
    }

    public static final void accept$3(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        BroadcastMessagePresenter broadcastMessagePresenter = (BroadcastMessagePresenter) afS4S0100100_12.l0;
        long j = afS4S0100100_12.j1;
        broadcastMessagePresenter.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scheduleGameCaptchaTimeout timeout, captchaId=");
        sbLIZ.append(j);
        sbLIZ.append(", roomId=");
        sbLIZ.append(broadcastMessagePresenter.LLILZ.getId());
        sbLIZ.append(", checkSuccess=");
        sbLIZ.append(broadcastMessagePresenter.LLILZLL);
        C20441214yg.LJIIIZ("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (!broadcastMessagePresenter.LLILZLL) {
            DataChannelGlobal.LLILZ.HQ2(CaptchaCheckFailedChannel.class, Boolean.TRUE);
            ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).dismissCaptcha();
            broadcastMessagePresenter.LLJ = true;
            broadcastMessagePresenter.LLILZIL.zW(CaptchaLivePauseTimeChannel.class, 0L);
            C480460Ism.LIZ().getClass();
            ((LiveCaptchaCheckApi) C480460Ism.LIZLLL(LiveCaptchaCheckApi.class)).getCaptchaCheckResponse(j, broadcastMessagePresenter.LLILZ.getId(), true).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(broadcastMessagePresenter.LL)).LJJLL(new AfS2S0000100_12(j, 0), new AfS2S0000100_12(j, 1));
            if (!broadcastMessagePresenter.LLIZLLLIL) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_captcha_popup_result");
                c474500IjALIZ.LJIJJLI(broadcastMessagePresenter.LLILZIL);
                c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() / 1000) - broadcastMessagePresenter.LLILZ.getCreateTime()), "duration_after_live_take");
                c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() - broadcastMessagePresenter.LLJI.longValue()) / 1000), "duration_after_popup");
                c474500IjALIZ.LJJII("fail", "result");
                c474500IjALIZ.LJJII("no_response", "failure_reason");
                c474500IjALIZ.LIZ();
                broadcastMessagePresenter.LLIZLLLIL = true;
                broadcastMessagePresenter.LLIZ = true;
                C773300UVc c773300UVcLIZ = C0UVZ.LIZ();
                if (c773300UVcLIZ != null) {
                    c773300UVcLIZ.LIZLLL(true, true);
                }
            }
        }
    }

    public static final void accept$4(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        CaptchaCheckResponse.ResponseData responseData;
        C781890Uln c781890Uln = (C781890Uln) afS4S0100100_12.l0;
        long j = afS4S0100100_12.j1;
        CaptchaCheckResponse captchaCheckResponse = (CaptchaCheckResponse) obj;
        c781890Uln.getClass();
        if (captchaCheckResponse != null && (responseData = captchaCheckResponse.data) != null) {
            if (responseData.checkApproved) {
                c781890Uln.LJ.LLILZLL = true;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("popCaptchaDialog onSuccess checkApproved=true, captchaId=");
                sbLIZ.append(j);
                C20441214yg.LJIIIZ("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("popCaptchaDialog onSuccess checkApproved=false, captchaId=");
            sbLIZ2.append(j);
            C20441214yg.LJIIIZ("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("popCaptchaDialog onSuccess callback data is null, captchaId=");
        sbLIZ3.append(j);
        C20441214yg.LJIIL("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static final void accept$5(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        C781890Uln c781890Uln = (C781890Uln) afS4S0100100_12.l0;
        long j = afS4S0100100_12.j1;
        c781890Uln.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("popCaptchaDialog onShowSuccessfully timer timeout, captchaId=");
        sbLIZ.append(j);
        sbLIZ.append(", roomId=");
        sbLIZ.append(c781890Uln.LJ.LLILZ.getId());
        sbLIZ.append(", isCheckSuccess=");
        sbLIZ.append(c781890Uln.LJ.LLILZLL);
        C20441214yg.LJIIIZ("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (!c781890Uln.LJ.LLILZLL) {
            DataChannelGlobal.LLILZ.HQ2(CaptchaCheckFailedChannel.class, Boolean.TRUE);
            ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).dismissCaptcha();
            BroadcastMessagePresenter broadcastMessagePresenter = c781890Uln.LJ;
            broadcastMessagePresenter.LLJ = true;
            broadcastMessagePresenter.LLILZIL.zW(CaptchaLivePauseTimeChannel.class, 0L);
            C480460Ism.LIZ().getClass();
            ((LiveCaptchaCheckApi) C480460Ism.LIZLLL(LiveCaptchaCheckApi.class)).getCaptchaCheckResponse(j, c781890Uln.LJ.LLILZ.getId(), true).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(c781890Uln.LJ.LL)).LJJLL(new AfS2S0000100_12(j, 2), new AfS2S0000100_12(j, 3));
            if (!c781890Uln.LJ.LLIZLLLIL) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_captcha_popup_result");
                c474500IjALIZ.LJIJJLI(c781890Uln.LJ.LLILZIL);
                c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() / 1000) - c781890Uln.LJ.LLILZ.getCreateTime()), "duration_after_live_take");
                c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() - c781890Uln.LJ.LLJI.longValue()) / 1000), "duration_after_popup");
                c474500IjALIZ.LJJII("fail", "result");
                c474500IjALIZ.LJJII("no_response", "failure_reason");
                c474500IjALIZ.LIZ();
                BroadcastMessagePresenter broadcastMessagePresenter2 = c781890Uln.LJ;
                broadcastMessagePresenter2.LLIZLLLIL = true;
                broadcastMessagePresenter2.LLIZ = true;
                C773300UVc c773300UVc = c781890Uln.LIZ;
                if (c773300UVc != null) {
                    c773300UVc.LIZLLL(true, true);
                }
            }
        }
        c781890Uln.LJ.LLILZLL = false;
    }

    public static final void accept$6(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        C1C7U.LIZ("OneTapGoLiveManager@c582.startOneTapGoLive$1");
        ((OneTapGoLiveManager) afS4S0100100_12.l0).LJJIFFI(afS4S0100100_12.j1, "upsert_visible_scope");
        C20441214yg.LJIIIZ("OneTapGoLiveManager", "preRequest success");
        ((OneTapGoLiveManager) afS4S0100100_12.l0).LJII();
        C1C7U.LIZIZ("OneTapGoLiveManager@c582.startOneTapGoLive$1");
    }

    public static final void accept$7(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        C501520Jle c501520Jle;
        C1C7U.LIZ("OneTapGoLiveManager@c582.startOneTapGoLive$2");
        Throwable th = (Throwable) obj;
        ((OneTapGoLiveManager) afS4S0100100_12.l0).LJJIFFI(afS4S0100100_12.j1, "pre_request");
        OneTapGoLiveManager oneTapGoLiveManager = (OneTapGoLiveManager) afS4S0100100_12.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pre_request_failed_");
        Object simpleName = null;
        if ((th instanceof C477520Io2) && (c501520Jle = (C501520Jle) th) != null) {
            simpleName = Integer.valueOf(c501520Jle.getErrorCode());
        } else if (th != null) {
            simpleName = th.getClass().getSimpleName();
        }
        sbLIZ.append(simpleName);
        oneTapGoLiveManager.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        C20441214yg.LJFF("OneTapGoLiveManager", "oneTapGoLive failed, preRequest failed", th);
        C1C7U.LIZIZ("OneTapGoLiveManager@c582.startOneTapGoLive$2");
    }

    public static final void accept$8(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        C1C7U.LIZ("GamePreparationFragment@98ca.startGoLiveCountDown$2");
        ((GamePreparationFragment) afS4S0100100_12.l0).OR(afS4S0100100_12.j1 - ((Long) obj).longValue());
        C1C7U.LIZIZ("GamePreparationFragment@98ca.startGoLiveCountDown$2");
    }

    public static final void accept$9(AfS4S0100100_12 afS4S0100100_12, Object obj) {
        C1C7U.LIZ("BroadcastHashTagWidget@2985.startCountdown$1");
        Long l = (Long) obj;
        long j = afS4S0100100_12.j1;
        if (l != null && l.longValue() == j) {
            ((BroadcastHashTagWidget) afS4S0100100_12.l0).dataChannel.FQ2(FeaturedHashTagCountDownRemindEvent.class);
            C20441214yg.LIZIZ("featured-tag", "Countdown finish, send event");
            ((BroadcastHashTagWidget) afS4S0100100_12.l0).J1();
            ((BroadcastHashTagWidget) afS4S0100100_12.l0).M1();
        }
        C1C7U.LIZIZ("BroadcastHashTagWidget@2985.startCountdown$1");
    }

    public AfS4S0100100_12(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
