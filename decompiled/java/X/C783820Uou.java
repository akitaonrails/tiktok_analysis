package X;

import Y.AfS2S1100100_12;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.LivePodcastHotStartPreRequestSetting;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.api.ILivePermissionApi;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import webcast.api.room.LivePodcastResponse;
import webcast.api.room.LiveScenario;

/* JADX INFO: renamed from: X.0Uou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783820Uou implements InterfaceC784190UpV {
    public static final C783820Uou LIZ = new C783820Uou();
    public static final Map<Long, LivePodcastResponse.ResponseData> LIZIZ = new LinkedHashMap();
    public static Boolean LIZJ;

    public static void LIZIZ() {
        IUserService iUserService;
        if (LIZJ != null || (iUserService = (IUserService) ServiceManager.get().getService(IUserService.class)) == null) {
            return;
        }
        LIZ.getClass();
        LivePodcastResponse.ResponseData responseDataLJ = LJ(iUserService);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchPermissionFromCache, memoryCacheData = ");
        sbLIZ.append(responseDataLJ);
        C20441214yg.LIZIZ("LivePodcastDataManager", C2188811AlT.LIZIZ(sbLIZ));
        if (responseDataLJ == null) {
            responseDataLJ = LIZLLL();
            if (responseDataLJ != null) {
                LJIIJJI(responseDataLJ);
            } else {
                responseDataLJ = null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetchPermissionFromCache, fileCacheData = ");
            sbLIZ2.append(responseDataLJ);
            C20441214yg.LIZIZ("LivePodcastDataManager", C2188811AlT.LIZIZ(sbLIZ2));
            if (responseDataLJ == null) {
                LIZJ = Boolean.FALSE;
                return;
            }
        }
        LiveScenario liveScenario = responseDataLJ.liveScenario;
        if (!C500260Jjc.LJJJI(liveScenario != null ? Boolean.valueOf(liveScenario.enableLiveVideo) : null)) {
            LiveScenario liveScenario2 = responseDataLJ.liveScenario;
            if (!C500260Jjc.LJJJI(liveScenario2 != null ? Boolean.valueOf(liveScenario2.enableLiveScreenshot) : null)) {
                LIZJ = Boolean.FALSE;
                return;
            }
        }
        C20441214yg.LIZIZ("LivePodcastDataManager", "fetchPermissionFromCache, hasLivePermission = true");
        LIZJ = Boolean.TRUE;
    }

    public static LivePodcastResponse.ResponseData LIZLLL() {
        LivePodcastResponse.ResponseData responseData;
        LivePodcastResponse.ResponseData responseData2 = (LivePodcastResponse.ResponseData) C2355009Kq.LJIILIIL(-1, LivePodcastResponse.ResponseData.class, "live_podcast_response");
        if (responseData2 != null && responseData2.canBeLivePodcast) {
            return responseData2;
        }
        LivePodcastResponse livePodcastResponse = (LivePodcastResponse) C2355009Kq.LJIILIIL(-1, LivePodcastResponse.class, "live_podcast_response");
        if (livePodcastResponse == null || (responseData = livePodcastResponse.data) == null || !responseData.canBeLivePodcast) {
            return null;
        }
        return responseData;
    }

    public static LivePodcastResponse.ResponseData LJ(IUserService iUserService) {
        Long lLJIILIIL = C2095008Iq.LJIILIIL(iUserService.getCurrentUserID());
        if (lLJIILIIL != null) {
            long jLongValue = lLJIILIIL.longValue();
            return (LivePodcastResponse.ResponseData) ((LinkedHashMap) LIZIZ).get(Long.valueOf(jLongValue));
        }
        return null;
    }

    public static Integer LJFF(Throwable th) {
        boolean z;
        JSONObject jSONObjectOptJSONObject;
        try {
            if (th instanceof C1494430ozZ) {
                return Integer.valueOf(((C1494430ozZ) th).getStatusCode());
            }
            if (th instanceof C1494690ozz) {
                String requestLog = ((C1494690ozz) th).getRequestLog();
                if (requestLog.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z && (jSONObjectOptJSONObject = new JSONObject(requestLog).optJSONObject("base")) != null) {
                    return Integer.valueOf(jSONObjectOptJSONObject.optInt("net_error", ((C1494690ozz) th).getStatusCode()));
                }
                return null;
            }
            if (th instanceof C501470JlZ) {
                return Integer.valueOf(((C501470JlZ) th).getErrorCode());
            }
            if (th instanceof C1494450ozb) {
                return -106;
            }
            return null;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return null;
        }
    }

    public static final void LJII(String str) {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null) {
            C01KE.LIZ(C817503Hh.LL, new C482910Iwj(null));
            if (!iUserService.isLogin() || iUserService.getCurrentUser().getFollowerCount() < 50) {
                return;
            }
        }
        LIZ.getClass();
        if (LivePodcastHotStartPreRequestSetting.INSTANCE.isEnable()) {
            C1906580ziK.LIZJ().LIZ().LJLLLLLL(new C09JN() { // from class: X.0Up5
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LivePodcastDataManager@2f90.initBackgroundObserver$1");
                    C606810Nr5 c606810Nr5 = (C606810Nr5) obj;
                    IUserService iUserService2 = (IUserService) ServiceManager.get().getService(IUserService.class);
                    if (iUserService2 != null && iUserService2.isLogin() && iUserService2.getCurrentUser().getFollowerCount() >= 50 && !c606810Nr5.LIZIZ) {
                        C783820Uou.LIZ.getClass();
                        LivePodcastHotStartPreRequestSetting livePodcastHotStartPreRequestSetting = LivePodcastHotStartPreRequestSetting.INSTANCE;
                        int interval = livePodcastHotStartPreRequestSetting.getInterval();
                        if (interval > 0) {
                            Long lLIZ = InterfaceC772190UQv.i4.LIZ();
                            long jLIZ = 0;
                            if (lLIZ != null) {
                                Long lValueOf = Long.valueOf(lLIZ.longValue());
                                if (lValueOf.longValue() > 0) {
                                    jLIZ = C783940Up6.LIZ(lValueOf.longValue());
                                }
                            }
                            long jLIZ2 = C783940Up6.LIZ(System.currentTimeMillis());
                            Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
                            calendar.setTimeInMillis(jLIZ);
                            calendar.add(5, interval);
                            long timeInMillis = calendar.getTimeInMillis();
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd Z", Locale.US);
                            simpleDateFormat.setTimeZone(TimeZone.getDefault());
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("\n                |Date Check Debug:\n                |Last request day: ");
                            sbLIZ.append(simpleDateFormat.format(new Date(jLIZ)));
                            sbLIZ.append("\n                |Current day: ");
                            sbLIZ.append(simpleDateFormat.format(new Date(jLIZ2)));
                            sbLIZ.append("\n                |Allowed day: ");
                            sbLIZ.append(simpleDateFormat.format(new Date(timeInMillis)));
                            sbLIZ.append("\n                |Interval days: ");
                            sbLIZ.append(livePodcastHotStartPreRequestSetting.getInterval());
                            sbLIZ.append("\n            ");
                            C20441214yg.LIZIZ("LivePodcastDataManager", C09AZ.LIZLLL(C2188811AlT.LIZIZ(sbLIZ)));
                            if (jLIZ2 >= timeInMillis) {
                                C783820Uou.LJIIIZ("pre_request_hot", null);
                                InterfaceC772190UQv.i4.LIZJ(Long.valueOf(System.currentTimeMillis()));
                                C20441214yg.LIZIZ("LivePodcastDataManager", "return foreground");
                            }
                        }
                    }
                    C1C7U.LIZIZ("LivePodcastDataManager@2f90.initBackgroundObserver$1");
                }
            });
        }
        LJIIIZ(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIJ(C470590Icr c470590Icr) {
        LivePodcastResponse.ResponseData responseData;
        C20441214yg.LIZIZ("LivePodcastDataManager", "storeFileCacheData");
        if (c470590Icr != null && (responseData = (LivePodcastResponse.ResponseData) c470590Icr.data) != null && responseData.canBeLivePodcast) {
            C2355009Kq.LJIILLIIL(responseData, "live_podcast_response");
        } else {
            C2355009Kq.LIZIZ("live_podcast_response");
        }
    }

    public static void LJIIJJI(LivePodcastResponse.ResponseData responseData) {
        String currentUserID;
        Long lLJIILIIL;
        C20441214yg.LIZIZ("LivePodcastDataManager", "storeMemoryCacheData");
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && (currentUserID = iUserService.getCurrentUserID()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(currentUserID)) != null) {
            LIZIZ.put(Long.valueOf(lLJIILIIL.longValue()), responseData);
        }
    }

    @Override // X.InterfaceC784190UpV
    public final void LIZ(EnumC784160UpS enumC784160UpS) {
        if (enumC784160UpS == EnumC784160UpS.STRONG) {
            C11IR.LL.LJJI(100L, TimeUnit.MILLISECONDS).LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.0Up3
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).removeNetworkChangeObserver(C783820Uou.LIZ);
                    C783820Uou.LJII("network_strong");
                }
            }).LJJLJ();
        }
    }

    public static void LIZJ(String str, Function1 function1) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C480460Ism.LIZ().getClass();
        ((ILivePermissionApi) C480460Ism.LIZLLL(ILivePermissionApi.class)).getLivePodCast(0).LJJIJIIJIL(new C09JN() { // from class: X.0Uoy
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LivePodcastDataManager@2f90.getApiData$1");
                C783820Uou.LIZ.getClass();
                C783820Uou.LJIIJ((C470590Icr) obj);
                C1C7U.LIZIZ("LivePodcastDataManager@2f90.getApiData$1");
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS2S1100100_12(jElapsedRealtime, str, function1, 7), new AfS2S1100100_12(jElapsedRealtime, str, function1, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(webcast.api.room.LivePodcastResponse.ResponseData r9, kotlin.jvm.functions.Function1 r10) {
        /*
            X.C464601rQ.LIZ(r9)
            if (r10 == 0) goto L8
            r10.invoke(r9)
        L8:
            if (r9 == 0) goto Laa
            webcast.api.room.LiveScenario r0 = r9.liveScenario
            r1 = 0
            if (r0 == 0) goto La1
            boolean r0 = r0.enableLiveVideo
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L15:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 != 0) goto L9c
            webcast.api.room.LiveScenario r0 = r9.liveScenario
            if (r0 == 0) goto L25
            boolean r0 = r0.enableLiveScreenshot
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L25:
            boolean r0 = X.C500260Jjc.LJJJI(r1)
            if (r0 != 0) goto L9c
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.C783820Uou.LIZJ = r0
        L2f:
            webcast.api.room.LiveScenario r0 = r9.liveScenario
            if (r0 == 0) goto L94
            com.bytedance.android.livesdkapi.user.DetailLivePermission r2 = new com.bytedance.android.livesdkapi.user.DetailLivePermission
            boolean r3 = r0.enableLiveVideo
            boolean r4 = r0.enableLiveScreenshot
            boolean r5 = r0.enableLiveThirdParty
            boolean r6 = r0.enableLiveStudio
            boolean r7 = r9.showLiveStudio
            boolean r8 = r0.enableLiveVoice
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.168F> r0 = X.C168F.class
            r1.JQ2(r0, r2)
        L4b:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r3 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0fzS> r2 = X.C1148400fzS.class
            X.0UpA r1 = new X.0UpA
            webcast.api.room.TryMode r0 = r9.tryMode
            if (r0 == 0) goto L92
            int r0 = r0.hasCreatedRoom
        L57:
            r1.<init>(r0)
            r3.JQ2(r2, r1)
            webcast.api.room.LivePermissionApply r0 = r9.livePermissionApply
            if (r0 == 0) goto L8c
            java.lang.Class<X.168D> r5 = X.C168D.class
            com.bytedance.android.livesdkapi.user.ApplyLivePermission r4 = new com.bytedance.android.livesdkapi.user.ApplyLivePermission
            boolean r2 = r0.enableLiveVideo
            boolean r1 = r0.enableScreenshot
            boolean r0 = r0.enableThirdParty
            r4.<init>(r2, r1, r0)
            r3.JQ2(r5, r4)
        L71:
            webcast.api.room.AnchorLevelPermission r1 = r9.anchorLevelPermission
            if (r1 == 0) goto La4
            java.lang.Class<X.0aLK> r0 = X.C931320aLK.class
            X.0Ti0 r4 = new X.0Ti0
            int r5 = r1.effects
            int r6 = r1.liveIntro
            int r7 = r1.liveGoal
            int r8 = r1.promote
            int r9 = r1.poll
            int r10 = r1.playTogether
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3.JQ2(r0, r4)
            return
        L8c:
            java.lang.Class<X.168D> r0 = X.C168D.class
            r3.IQ2(r0)
            goto L71
        L92:
            r0 = 1
            goto L57
        L94:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.168F> r0 = X.C168F.class
            r1.IQ2(r0)
            goto L4b
        L9c:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            X.C783820Uou.LIZJ = r0
            goto L2f
        La1:
            r0 = r1
            goto L15
        La4:
            java.lang.Class<X.0aLK> r0 = X.C931320aLK.class
            r3.IQ2(r0)
            return
        Laa:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.168F> r0 = X.C168F.class
            r1.IQ2(r0)
            java.lang.Class<X.0fzS> r0 = X.C1148400fzS.class
            r1.IQ2(r0)
            java.lang.Class<X.168D> r0 = X.C168D.class
            r1.IQ2(r0)
            java.lang.Class<X.0aLK> r0 = X.C931320aLK.class
            r1.IQ2(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C783820Uou.LJIIIIZZ(webcast.api.room.LivePodcastResponse$ResponseData, kotlin.jvm.functions.Function1):void");
    }

    public static final void LJIIIZ(String str, Function1<? super LivePodcastResponse.ResponseData, Unit> function1) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C783870Uoz(str, function1, null), 2);
    }

    public static void LJI(String str, int i, int i2, long j, Integer num) {
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_broadcast_path_get_live_podcast_response", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
        c474500IjALIZIZ.LJIL();
        c474500IjALIZIZ.LJJII(str, "source");
        c474500IjALIZIZ.LJJII(Integer.valueOf(i), "is_success");
        c474500IjALIZIZ.LJJII(Integer.valueOf(i2), "can_live");
        c474500IjALIZIZ.LJJII(Long.valueOf(j), "duration");
        c474500IjALIZIZ.LJJII(num, "error_code");
        c474500IjALIZIZ.LJJIJL();
    }
}
