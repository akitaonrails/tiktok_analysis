package Y;

import X.C09JN;
import X.C0KVU;
import X.C0UYG;
import X.C1161920gLG;
import X.C1411910mqT;
import X.C1494690ozz;
import X.C1720106oR;
import X.C1C7U;
import X.C20441214yg;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C259800zU;
import X.C386801es;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C766520U5a;
import X.C767630U9h;
import X.C783820Uou;
import X.InterfaceC20673515v3;
import X.InterfaceC420801kM;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.ss.android.ugc.aweme.experiment.LivePodcastApiPreRequestExperiment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import webcast.api.room.LivePodcastResponse;

/* JADX INFO: loaded from: classes13.dex */
public class AfS2S1100100_12 implements C09JN {
    public final int $t;
    public long j2;
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
        }
    }

    public static final void accept$0(AfS2S1100100_12 afS2S1100100_12, Object obj) {
        Boolean boolValueOf;
        ArrayList<ImageModel> arrayList;
        C1C7U.LIZ("InsertStickerManager@1b5f.getUserInfoById$1");
        User user = (User) obj;
        C767630U9h.LLIZLLLIL.put(Long.valueOf(afS2S1100100_12.j2), new C766520U5a(C0KVU.LIZ(user), user.getAvatarThumb()));
        HashMap<String, ArrayList<ImageModel>> map = C767630U9h.LLILLL;
        ArrayList<ImageModel> arrayList2 = map.get(afS2S1100100_12.s0);
        if (arrayList2 != null) {
            boolValueOf = Boolean.valueOf(arrayList2.contains(user.getAvatarThumb()));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf) && (arrayList = map.get(afS2S1100100_12.s0)) != null) {
            arrayList.add(user.getAvatarThumb());
        }
        Function0 function0 = (Function0) afS2S1100100_12.l1;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("InsertStickerManager@1b5f.getUserInfoById$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5 A[PHI: r8
      0x00a5: PHI (r8v1 java.lang.Integer) = (r8v0 java.lang.Integer), (r8v5 java.lang.Integer) binds: [B:47:0x00a2, B:35:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9 A[PHI: r8 r9
      0x00a9: PHI (r8v2 java.lang.Integer) = (r8v1 java.lang.Integer), (r8v4 java.lang.Integer), (r8v4 java.lang.Integer) binds: [B:50:0x00a6, B:38:0x008c, B:40:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r9v1 java.util.Map<java.lang.String, java.lang.String>) = 
      (r9v0 java.util.Map<java.lang.String, java.lang.String>)
      (r9v3 java.util.Map<java.lang.String, java.lang.String>)
      (r9v3 java.util.Map<java.lang.String, java.lang.String>)
     binds: [B:50:0x00a6, B:38:0x008c, B:40:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS2S1100100_12 r12, java.lang.Object r13) {
        /*
            java.lang.String r2 = "CloseRoomHelper@fda8.onBackKeyPressed$4"
            X.C1C7U.LIZ(r2)
            com.bytedance.android.live.network.response.BaseResponse r13 = (com.bytedance.android.live.network.response.BaseResponse) r13
            if (r13 == 0) goto L36
            T r0 = r13.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            if (r0 == 0) goto L1d
            int r1 = r0.finishType
            r0 = 4
            if (r1 != r0) goto L1d
            com.bytedance.android.livesdk.rank.api.IRankService r0 = X.C781270Ukn.LJIJJLI()
            r0.It1()
            if (r13 == 0) goto L36
        L1d:
            T r0 = r13.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            if (r0 == 0) goto L36
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData$ConfirmBox r0 = r0.confirmBox
            if (r0 == 0) goto L36
            java.lang.String r4 = r0.title
            if (r4 == 0) goto L36
            java.lang.String r1 = r12.s0
            int r0 = r4.length()
            if (r0 != 0) goto L3a
            r4 = r1
            if (r1 != 0) goto L3a
        L36:
            java.lang.String r4 = r12.s0
            if (r13 == 0) goto L6a
        L3a:
            T r0 = r13.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            if (r0 == 0) goto Lac
            int r1 = r0.finishType
            r0 = 6
            if (r1 != r0) goto Lac
        L45:
            java.lang.Class<com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService> r0 = com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService r0 = (com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService) r0
            X.0KPt r0 = r0.ei()
            r0.getClass()
            T r0 = r13.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            int r0 = r0.finishType
            boolean r0 = X.C516680KOc.LIZJ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C500260Jjc.LJJIFFI(r0)
            if (r0 == 0) goto L6a
            java.lang.String r4 = r12.s0
        L6a:
            java.lang.Object r3 = r12.l1
            X.0UYG r3 = (X.C0UYG) r3
            long r5 = r12.j2
            r7 = 1
            r12 = 0
            if (r13 == 0) goto La1
            T r0 = r13.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            if (r0 == 0) goto La1
            int r0 = r0.finishType
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L80:
            T r0 = r13.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            if (r0 == 0) goto La5
            java.util.Map<java.lang.String, java.lang.String> r9 = r0.metricsMap
        L88:
            T r0 = r13.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            if (r0 == 0) goto La9
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData$ConfirmBox r0 = r0.confirmBox
            if (r0 == 0) goto La9
            long r10 = r0.value
        L94:
            if (r13 == 0) goto L9a
            T r12 = r13.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r12 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r12
        L9a:
            r3.LJFF(r4, r5, r7, r8, r9, r10, r12)
            X.C1C7U.LIZIZ(r2)
            return
        La1:
            r8 = r12
            if (r13 == 0) goto La5
            goto L80
        La5:
            r9 = r12
            if (r13 == 0) goto La9
            goto L88
        La9:
            r10 = 0
            goto L94
        Lac:
            T r0 = r13.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            if (r0 == 0) goto L6a
            int r1 = r0.finishType
            r0 = 5
            if (r1 != r0) goto L6a
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS2S1100100_12.accept$1(Y.AfS2S1100100_12, java.lang.Object):void");
    }

    public static final void accept$10(AfS2S1100100_12 afS2S1100100_12, Object obj) {
        C1C7U.LIZ("GameShortVideoAnchorTool@8f66.tryUploadKeyFrames$2");
        Throwable th = (Throwable) obj;
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) afS2S1100100_12.l1).element;
        if (interfaceC420801kM != null && (!interfaceC420801kM.isDisposed())) {
            interfaceC420801kM.dispose();
        }
        C1411910mqT.LIZ(C1411910mqT.LIZ, afS2S1100100_12.s0, CardStruct.IStatusCode.DEFAULT, System.currentTimeMillis() - afS2S1100100_12.j2, String.valueOf(th.getMessage()), null, 16);
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZJ("GameShortVideoAnchorTool", th);
        C1C7U.LIZIZ("GameShortVideoAnchorTool@8f66.tryUploadKeyFrames$2");
    }

    public static final void accept$2(AfS2S1100100_12 afS2S1100100_12, Object obj) {
        C1C7U.LIZ("CloseRoomHelper@fda8.onBackKeyPressed$5");
        ((C0UYG) afS2S1100100_12.l1).LJFF(afS2S1100100_12.s0, afS2S1100100_12.j2, false, 0, null, 0L, null);
        C1C7U.LIZIZ("CloseRoomHelper@fda8.onBackKeyPressed$5");
    }

    public static final void accept$3(AfS2S1100100_12 afS2S1100100_12, Object obj) {
        C1C7U.LIZ("LiveBroadcastFragment@d956.showAdvancedDialog$3");
        ((LiveBroadcastFragment) afS2S1100100_12.l1).YS(afS2S1100100_12.j2, afS2S1100100_12.s0);
        C1C7U.LIZIZ("LiveBroadcastFragment@d956.showAdvancedDialog$3");
    }

    public static final void accept$4(AfS2S1100100_12 afS2S1100100_12, Object obj) {
        C1C7U.LIZ("LiveBroadcastFragment@d956.showAdvancedDialog$5");
        ((LiveBroadcastFragment) afS2S1100100_12.l1).YS(afS2S1100100_12.j2, afS2S1100100_12.s0);
        C1C7U.LIZIZ("LiveBroadcastFragment@d956.showAdvancedDialog$5");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$5(Y.AfS2S1100100_12 r10, java.lang.Object r11) {
        /*
            java.lang.String r2 = "VoiceChatBroadcastFragment@4fc.showAdvancedDialog$4"
            X.C1C7U.LIZ(r2)
            com.bytedance.android.live.network.response.BaseResponse r11 = (com.bytedance.android.live.network.response.BaseResponse) r11
            if (r11 == 0) goto L36
            T r0 = r11.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            if (r0 == 0) goto L1d
            int r1 = r0.finishType
            r0 = 4
            if (r1 != r0) goto L1d
            com.bytedance.android.livesdk.rank.api.IRankService r0 = X.C781270Ukn.LJIJJLI()
            r0.It1()
            if (r11 == 0) goto L36
        L1d:
            T r0 = r11.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            if (r0 == 0) goto L36
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData$ConfirmBox r0 = r0.confirmBox
            if (r0 == 0) goto L36
            java.lang.String r4 = r0.title
            if (r4 == 0) goto L36
            java.lang.String r1 = r10.s0
            int r0 = r4.length()
            if (r0 != 0) goto L3a
            r4 = r1
            if (r1 != 0) goto L3a
        L36:
            java.lang.String r4 = r10.s0
            if (r11 == 0) goto L6a
        L3a:
            T r0 = r11.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            if (r0 == 0) goto L91
            int r1 = r0.finishType
            r0 = 6
            if (r1 != r0) goto L91
        L45:
            java.lang.Class<com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService> r0 = com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService r0 = (com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService) r0
            X.0KPt r0 = r0.ei()
            r0.getClass()
            T r0 = r11.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            int r0 = r0.finishType
            boolean r0 = X.C516680KOc.LIZJ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C500260Jjc.LJJIFFI(r0)
            if (r0 == 0) goto L6a
            java.lang.String r4 = r10.s0
        L6a:
            java.lang.Object r3 = r10.l1
            com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment r3 = (com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment) r3
            long r5 = r10.j2
            r7 = 1
            T r0 = r11.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            int r0 = r0.finishType
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            T r11 = r11.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r11 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r11
            if (r11 == 0) goto L8e
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData$ConfirmBox r0 = r11.confirmBox
            if (r0 == 0) goto L8e
            long r9 = r0.value
        L87:
            r3.NS(r4, r5, r7, r8, r9, r11)
            X.C1C7U.LIZIZ(r2)
            return
        L8e:
            r9 = 0
            goto L87
        L91:
            T r0 = r11.data
            com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData) r0
            if (r0 == 0) goto L6a
            int r1 = r0.finishType
            r0 = 5
            if (r1 != r0) goto L6a
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS2S1100100_12.accept$5(Y.AfS2S1100100_12, java.lang.Object):void");
    }

    public static final void accept$6(AfS2S1100100_12 afS2S1100100_12, Object obj) {
        C1C7U.LIZ("VoiceChatBroadcastFragment@4fc.showAdvancedDialog$5");
        ((VoiceChatBroadcastFragment) afS2S1100100_12.l1).NS(afS2S1100100_12.s0, afS2S1100100_12.j2, false, 0, 0L, null);
        C1C7U.LIZIZ("VoiceChatBroadcastFragment@4fc.showAdvancedDialog$5");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$7(AfS2S1100100_12 afS2S1100100_12, Object obj) {
        LivePodcastResponse.ResponseData responseData;
        C1C7U.LIZ("LivePodcastDataManager@2f90.getApiData$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        C20441214yg.LIZIZ("LivePodcastDataManager", "getApiData success");
        if (baseResponse != null && (responseData = (LivePodcastResponse.ResponseData) baseResponse.data) != null) {
            String str = afS2S1100100_12.s0;
            long j = afS2S1100100_12.j2;
            Function1 function1 = (Function1) afS2S1100100_12.l1;
            C783820Uou c783820Uou = C783820Uou.LIZ;
            boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(responseData.canBeLivePodcast));
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            c783820Uou.getClass();
            C783820Uou.LJI(str, 1, zLJJJI ? 1 : 0, jElapsedRealtime, null);
            if (responseData.canBeLivePodcast && LivePodcastApiPreRequestExperiment.isV2()) {
                C783820Uou.LJIIJJI(responseData);
            }
            C783820Uou.LJIIIIZZ(responseData, function1);
        } else {
            String str2 = afS2S1100100_12.s0;
            long j2 = afS2S1100100_12.j2;
            Function1 function12 = (Function1) afS2S1100100_12.l1;
            C783820Uou c783820Uou2 = C783820Uou.LIZ;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j2;
            c783820Uou2.getClass();
            C783820Uou.LJI(str2, 0, 0, jElapsedRealtime2, 1001);
            C783820Uou.LJIIIIZZ(null, function12);
        }
        C1C7U.LIZIZ("LivePodcastDataManager@2f90.getApiData$2");
    }

    public static final void accept$8(AfS2S1100100_12 afS2S1100100_12, Object obj) {
        String message;
        int iIntValue;
        C1C7U.LIZ("LivePodcastDataManager@2f90.getApiData$3");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getApiData error, ");
        Throwable cause = th.getCause();
        if (cause != null) {
            message = cause.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C20441214yg.LIZIZ("LivePodcastDataManager", C2188811AlT.LIZIZ(sbLIZ));
        C783820Uou c783820Uou = C783820Uou.LIZ;
        String str = afS2S1100100_12.s0;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - afS2S1100100_12.j2;
        c783820Uou.getClass();
        Integer numLJFF = C783820Uou.LJFF(th);
        if (numLJFF != null) {
            iIntValue = numLJFF.intValue();
        } else {
            iIntValue = C386801es.DEFAULT;
        }
        C783820Uou.LJI(str, 0, 0, jElapsedRealtime, Integer.valueOf(iIntValue));
        if (LivePodcastApiPreRequestExperiment.isV2() && !(th instanceof C501470JlZ) && !(th instanceof C1494690ozz)) {
            ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).observerNetworkChange(c783820Uou);
        }
        C783820Uou.LJIIIIZZ(null, (Function1) afS2S1100100_12.l1);
        C1C7U.LIZIZ("LivePodcastDataManager@2f90.getApiData$3");
    }

    public static final void accept$9(AfS2S1100100_12 afS2S1100100_12, Object obj) {
        C1C7U.LIZ("GameShortVideoAnchorTool@8f66.tryUploadKeyFrames$1");
        String str = (String) obj;
        C1411910mqT c1411910mqT = C1411910mqT.LIZ;
        String str2 = afS2S1100100_12.s0;
        c1411910mqT.getClass();
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        if (interfaceC20673515v3K4 != null) {
            interfaceC20673515v3K4.At(str2, str);
        }
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) afS2S1100100_12.l1).element;
        if (interfaceC420801kM != null && (!interfaceC420801kM.isDisposed())) {
            interfaceC420801kM.dispose();
        }
        C1411910mqT.LIZ(c1411910mqT, afS2S1100100_12.s0, "1", System.currentTimeMillis() - afS2S1100100_12.j2, null, str, 8);
        C1C7U.LIZIZ("GameShortVideoAnchorTool@8f66.tryUploadKeyFrames$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS2S1100100_12(long r2, X.C0UYG r4, java.lang.String r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 1 - r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.l1 = r4
            r0.s0 = r5
            r0.j2 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.s0 = r5
            r0.l1 = r4
            r0.j2 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS2S1100100_12.<init>(long, X.0UYG, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS2S1100100_12(long r2, com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment r4, java.lang.String r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 5 - r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.l1 = r4
            r0.s0 = r5
            r0.j2 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.s0 = r5
            r0.l1 = r4
            r0.j2 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS2S1100100_12.<init>(long, com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS2S1100100_12(long r2, java.lang.String r4, X.C259800zU r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 9 - r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.l1 = r5
            r0.s0 = r4
            r0.j2 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.s0 = r4
            r0.l1 = r5
            r0.j2 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS2S1100100_12.<init>(long, java.lang.String, X.00zU, int):void");
    }

    public AfS2S1100100_12(long j, String str, Object obj, int i) {
        this.$t = i;
        this.j2 = j;
        this.s0 = str;
        this.l1 = obj;
    }
}
