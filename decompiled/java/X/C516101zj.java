package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestMemoryInfoChannel;
import com.bytedance.android.live.liveinteract.multilive.model.GetMemoryInfoResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS29S0001000_15;

/* JADX INFO: renamed from: X.01zj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C516101zj implements C09JN {
    public final int $t;
    public int i1;
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
        }
    }

    public static final void accept$0(C516101zj c516101zj, Object obj) {
        C1C7U.LIZ("MatchFallbackManager@1bb5.fetchMatchInfo$2");
        String str = ((C976400bW2) c516101zj.l0).LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error polling attempt=");
        sbLIZ.append(c516101zj.i1);
        C20441214yg.LJFF(str, C2188811AlT.LIZIZ(sbLIZ), (Throwable) obj);
        C1C7U.LIZIZ("MatchFallbackManager@1bb5.fetchMatchInfo$2");
    }

    public static final void accept$1(C516101zj c516101zj, Object obj) {
        Object objValueOf;
        C1C7U.LIZ("MultiGuestPreviewLiveSettingViewModel@4186.updateGuestCanUseMicSlotCount$2");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (!C930480aJy.LJJIFFI(c470590Icr)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateGuestCanUseMicSlotCount fail, statusCode: ");
            if (c470590Icr != null) {
                objValueOf = Integer.valueOf(c470590Icr.statusCode);
            } else {
                objValueOf = "null";
            }
            sbLIZ.append(objValueOf);
            C20441214yg.LJ("MultiGuestPreviewLiveSettingViewModel", C2188811AlT.LIZIZ(sbLIZ));
            C1813460xI8.LIZIZ(((MultiGuestPreviewLiveSettingViewModel) c516101zj.l0).LLILZ, new AwS29S0001000_15(c516101zj.i1, 3));
        }
        C1C7U.LIZIZ("MultiGuestPreviewLiveSettingViewModel@4186.updateGuestCanUseMicSlotCount$2");
    }

    public static final void accept$10(C516101zj c516101zj, Object obj) {
        C1C7U.LIZ("BulletinBoardProfileRepository@428d._operator$1$setShowOnProfileRx$2");
        ((Function0) c516101zj.l0).invoke();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setShowOnProfileRx status: {");
        sbLIZ.append(c516101zj.i1);
        sbLIZ.append("} ,error: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("BulletinBoardProfileRepository@428d._operator$1$setShowOnProfileRx$2");
    }

    public static final void accept$11(C516101zj c516101zj, Object obj) {
        C1C7U.LIZ("MultiGuestPreviewLiveSettingViewModel@4186.updateAutoApproval$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        C930480aJy.LIZ.getClass();
        if (baseResponse.statusCode != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateAutoApproval fail, statusCode: ");
            sbLIZ.append(Integer.valueOf(baseResponse.statusCode));
            C20441214yg.LJ("MultiGuestPreviewLiveSettingViewModel", C2188811AlT.LIZIZ(sbLIZ));
            C1813460xI8.LIZIZ(((MultiGuestPreviewLiveSettingViewModel) c516101zj.l0).LLILZ, new AwS29S0001000_15(c516101zj.i1, 11));
        }
        C1C7U.LIZIZ("MultiGuestPreviewLiveSettingViewModel@4186.updateAutoApproval$2");
    }

    public static final void accept$12(C516101zj c516101zj, Object obj) {
        C1C7U.LIZ("MultiGuestPreviewLiveSettingViewModel@4186.updateAutoApproval$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAutoApproval error: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LJ("MultiGuestPreviewLiveSettingViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C1813460xI8.LIZIZ(((MultiGuestPreviewLiveSettingViewModel) c516101zj.l0).LLILZ, new AwS29S0001000_15(c516101zj.i1, 12));
        C1C7U.LIZIZ("MultiGuestPreviewLiveSettingViewModel@4186.updateAutoApproval$3");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0013, B:6:0x0017, B:8:0x001d, B:10:0x0025, B:11:0x002a, B:26:0x005c, B:13:0x0030, B:15:0x0033, B:17:0x003b, B:18:0x003d, B:23:0x004d, B:24:0x004f, B:25:0x0059), top: B:34:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$13(X.C516101zj r8, java.lang.Object r9) {
        /*
            java.lang.String r7 = "EcSearchCoinManager@697c.finishTaskRequest$2"
            X.C1C7U.LIZ(r7)
            com.ss.android.ugc.aweme.ecommerce.search.pendant.coin.api.EcSearchCoinResponse r9 = (com.ss.android.ugc.aweme.ecommerce.search.pendant.coin.api.EcSearchCoinResponse) r9
            X.0QxN r5 = X.C687150QxN.LL
            int r6 = r8.i1
            java.lang.Object r4 = r8.l0
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L30
            java.lang.Integer r0 = r9.errNo     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L30
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L30
            X.0QxT r0 = X.EnumC687210QxT.COMPLETE     // Catch: java.lang.Throwable -> L62
            int r1 = r0.getValue()     // Catch: java.lang.Throwable -> L62
            if (r4 == 0) goto L2e
            java.lang.String r0 = "is_success"
            r4.put(r0, r2)     // Catch: java.lang.Throwable -> L62
        L2a:
            r5.LJFF(r1, r4)     // Catch: java.lang.Throwable -> L62
            goto L5c
        L2e:
            r4 = r3
            goto L2a
        L30:
            int r6 = r6 - r2
            if (r4 == 0) goto L4b
            java.lang.String r2 = "msg"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto L46
            java.lang.Integer r0 = r9.errNo     // Catch: java.lang.Throwable -> L62
        L3d:
            r1.append(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = ": "
            r1.append(r0)     // Catch: java.lang.Throwable -> L62
            goto L48
        L46:
            r0 = r3
            goto L3d
        L48:
            if (r9 == 0) goto L4f
            goto L4d
        L4b:
            r4 = r3
            goto L59
        L4d:
            java.lang.String r3 = r9.debugMsg     // Catch: java.lang.Throwable -> L62
        L4f:
            r1.append(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L62
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> L62
        L59:
            r5.LIZJ(r6, r4)     // Catch: java.lang.Throwable -> L62
        L5c:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L62
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L62
            goto L6e
        L62:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L6e:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r0 == 0) goto L77
            X.C1AF0.LJ(r0)
        L77:
            X.C1C7U.LIZIZ(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C516101zj.accept$13(X.01zj, java.lang.Object):void");
    }

    public static final void accept$14(C516101zj c516101zj, Object obj) {
        C1C7U.LIZ("MultiGuestPermissionManager@6f0.checkVideoShotPluginInstall$1$onSuccess$1");
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                C930480aJy.LJJIJIIJI(2131855725, "ttlive_res_copy_failed", "");
            } else {
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).init();
                ((Function1) c516101zj.l0).invoke(Integer.valueOf(c516101zj.i1));
            }
        } else {
            C930480aJy.LJJIJIIJI(2131855726, "ttlive_res_copy_tip", "");
        }
        C1C7U.LIZIZ("MultiGuestPermissionManager@6f0.checkVideoShotPluginInstall$1$onSuccess$1");
    }

    public static final void accept$2(C516101zj c516101zj, Object obj) {
        C1C7U.LIZ("MultiGuestPreviewLiveSettingViewModel@4186.updateGuestCanUseMicSlotCount$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGuestCanUseMicSlotCount error: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LJ("MultiGuestPreviewLiveSettingViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C1813460xI8.LIZIZ(((MultiGuestPreviewLiveSettingViewModel) c516101zj.l0).LLILZ, new AwS29S0001000_15(c516101zj.i1, 4));
        C1C7U.LIZIZ("MultiGuestPreviewLiveSettingViewModel@4186.updateGuestCanUseMicSlotCount$3");
    }

    public static final void accept$3(C516101zj c516101zj, Object obj) {
        C1C7U.LIZ("MultiGuestV3Manager@4508.updateGuestMirrorStatus$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGuestMirrorStatus mirrorStatus:");
        sbLIZ.append(c516101zj.i1);
        sbLIZ.append(" t:");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LIZIZ("OneVn_MultiGuestV3Manager", C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = (Function1) c516101zj.l0;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        C1C7U.LIZIZ("MultiGuestV3Manager@4508.updateGuestMirrorStatus$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(C516101zj c516101zj, Object obj) {
        Map<String, String> map;
        C1C7U.LIZ("MultiGuestV3Manager@4508.fetchAndDistributeMemoryInfoIfNeed$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get_memory_info success memoryFlag:");
        sbLIZ.append(c516101zj.i1);
        sbLIZ.append(" failed_memory_map:");
        GetMemoryInfoResponse.ResponseData responseData = (GetMemoryInfoResponse.ResponseData) baseResponse.data;
        GetMemoryInfoResponse.ResponseData.MemoryInfo memoryInfo = null;
        if (responseData != null) {
            map = responseData.failedMemoryMap;
        } else {
            map = null;
        }
        sbLIZ.append(map);
        C919310a1x.LIZ("OneVn_MultiGuestV3Manager", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = (DataChannel) c516101zj.l0;
        GetMemoryInfoResponse.ResponseData responseData2 = (GetMemoryInfoResponse.ResponseData) baseResponse.data;
        if (responseData2 != null) {
            memoryInfo = responseData2.memoryInfo;
        }
        dataChannel.zW(MultiGuestMemoryInfoChannel.class, memoryInfo);
        C1C7U.LIZIZ("MultiGuestV3Manager@4508.fetchAndDistributeMemoryInfoIfNeed$2");
    }

    public static final void accept$5(C516101zj c516101zj, Object obj) {
        C1C7U.LIZ("MultiGuestV3Manager@4508.updateGuestEarFeedbackStatus$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGuestEarFeedbackStatus earFeedbackStatus:");
        sbLIZ.append(c516101zj.i1);
        sbLIZ.append(" t:");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LJ("OneVn_MultiGuestV3Manager", C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = (Function1) c516101zj.l0;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        C1C7U.LIZIZ("MultiGuestV3Manager@4508.updateGuestEarFeedbackStatus$2");
    }

    public static final void accept$6(C516101zj c516101zj, Object obj) {
        C1C7U.LIZ("TaskApiUtilsKt@ac6a.requestTaskInfoInternal$2");
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C322401Mw((InterfaceC1631620sYq) c516101zj.l0, c516101zj.i1, (C470590Icr) obj, null), 3);
        C1C7U.LIZIZ("TaskApiUtilsKt@ac6a.requestTaskInfoInternal$2");
    }

    public static final void accept$7(C516101zj c516101zj, Object obj) {
        C1C7U.LIZ("TaskApiUtilsKt@ac6a.requestTaskInfoInternal$3");
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C322201Mu((InterfaceC1631620sYq) c516101zj.l0, c516101zj.i1, (Throwable) obj, null), 3);
        C1C7U.LIZIZ("TaskApiUtilsKt@ac6a.requestTaskInfoInternal$3");
    }

    public static final void accept$8(C516101zj c516101zj, Object obj) {
        C1C7U.LIZ("GameLinkPermissionManager@2602.checkVideoShotPluginInstall$1$onSuccess$1");
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                C766270U4b.LIZLLL(2131855725);
            } else {
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).init();
                ((Function1) c516101zj.l0).invoke(Integer.valueOf(c516101zj.i1));
            }
        } else {
            C766270U4b.LIZLLL(2131855726);
        }
        C1C7U.LIZIZ("GameLinkPermissionManager@2602.checkVideoShotPluginInstall$1$onSuccess$1");
    }

    public static final void accept$9(C516101zj c516101zj, Object obj) {
        Function1 function1;
        Integer numValueOf;
        C1C7U.LIZ("SkylightMultiGuestApplyController@1f6b.tryStartCountdownBanner$2");
        long jLongValue = ((long) c516101zj.i1) - ((Long) obj).longValue();
        if (jLongValue > 0) {
            function1 = (Function1) c516101zj.l0;
            numValueOf = Integer.valueOf((int) jLongValue);
        } else {
            function1 = (Function1) c516101zj.l0;
            numValueOf = null;
        }
        function1.invoke(numValueOf);
        C1C7U.LIZIZ("SkylightMultiGuestApplyController@1f6b.tryStartCountdownBanner$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C516101zj(int r2, int r3, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 3 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.i1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.i1 = r2
            r0.l0 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C516101zj.<init>(int, kotlin.jvm.functions.Function1, int):void");
    }

    public C516101zj(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
