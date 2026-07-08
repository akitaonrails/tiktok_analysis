package X;

import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.broadcast.GetProgressiveResultsChannel;
import com.bytedance.android.livesdk.broadcast.IsBroadcastPreviewCurrentSceneChannel;
import com.bytedance.android.livesdk.broadcast.IsSpeedTestingChannel;
import com.bytedance.android.livesdk.broadcast.OpenProbeForKeyUserChannel;
import com.bytedance.android.livesdk.broadcast.PreScheduleStreamChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveSpeedTestStart;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LEnablePreGetConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LPreGetConfigDelayMs;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LPreGetConfigUseCache;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHAndroidAdaptiveConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHProbeAppContextSwitch;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHSplitModuleRtcAppID;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.text.a0;
import org.json.JSONObject;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: renamed from: X.1D4u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250021D4u {
    public Fragment LIZ;
    public C783710Uoj LIZIZ;
    public C2249981D4q LIZJ;
    public DataChannel LIZLLL;
    public boolean LJ = true;
    public final C01GW LJFF;
    public final ARunnableS112S0100000_12 LJI;
    public final C2221961Bxq LJII;
    public C1D4C LJIIIIZZ;
    public final C01GW LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public C0UWZ LJIILJJIL;
    public long LJIILL;

    public final PreScheduleStream LIZ() {
        C783710Uoj c783710Uoj = this.LIZIZ;
        if (c783710Uoj != null) {
            return c783710Uoj.LIZ;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd A[PHI: r8
      0x00dd: PHI (r8v3 java.lang.String) = (r8v0 java.lang.String), (r8v4 java.lang.String) binds: [B:39:0x00db, B:37:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3 A[PHI: r8
      0x00e3: PHI (r8v2 java.lang.String) = (r8v0 java.lang.String), (r8v3 java.lang.String) binds: [B:39:0x00db, B:41:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1D4C LIZIZ() {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2250021D4u.LIZIZ():X.1D4C");
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0551  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 1799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2250021D4u.LIZJ():void");
    }

    public final void LJII() {
        LiveMode liveMode;
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null || !C354201Zc.LJFF(liveMode) || !this.LJ) {
            return;
        }
        C766270U4b.LIZLLL(2131843880);
    }

    public final void LJIIJJI() {
        PreScheduleStream preScheduleStreamLIZ;
        PreScheduleStream preScheduleStreamLIZ2;
        String str;
        Fragment fragment;
        Fragment fragment2;
        LifecycleCoroutineScope lifecycleScope;
        if (!this.LJ || (preScheduleStreamLIZ = LIZ()) == null) {
            return;
        }
        String str2 = preScheduleStreamLIZ.speedProbeUrl;
        boolean zLIZIZ = false;
        if (str2 == null || str2.length() == 0 || (preScheduleStreamLIZ2 = LIZ()) == null || (str = preScheduleStreamLIZ2.sdkParams) == null || str.length() == 0 || (fragment = this.LIZ) == null || fragment.getContext() == null) {
            return;
        }
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!zLIZIZ) {
            if (!this.LJIILIIL) {
                LIZIZ().LIZJ(EnumC2239251Ckd.NETWORK_ERROR);
                LJII();
                return;
            }
        }
        if ((this.LJIIL || this.LJIILIIL) && (fragment2 = this.LIZ) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment2)) != null) {
            C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C1101220elM(this, null), 2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start test, ");
        sbLIZ.append(this.LJIIIIZZ);
        C20441214yg.LIZIZ("LiveSpeedTestAdapter", C2188811AlT.LIZIZ(sbLIZ));
        System.currentTimeMillis();
        C1D4C c1d4cLIZIZ = LIZIZ();
        C783730Uol c783730Uol = new C783730Uol();
        c783730Uol.LIZ = EnumC783720Uok.AUTO;
        c783730Uol.LIZIZ = zLIZIZ;
        c1d4cLIZIZ.LJIIIIZZ(c783730Uol);
        SystemClock.elapsedRealtime();
    }

    public final void LJIIIZ() {
        LifecycleCoroutineScope lifecycleScope;
        C328040CtW c328040CtW;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProbeCache requestUrl --> ");
        PreScheduleStream preScheduleStreamLIZ = LIZ();
        sbLIZ.append(preScheduleStreamLIZ != null ? preScheduleStreamLIZ.speedProbeUrl : null);
        C20441214yg.LJIIIZ("LiveSpeedTestAdapter", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC783690Uoh interfaceC783690UohLIZ = LIZIZ().LIZ();
        long jLIZJ = interfaceC783690UohLIZ != null ? ((C2250051D4x) interfaceC783690UohLIZ).LIZJ() : System.currentTimeMillis();
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.zW(IsSpeedTestingChannel.class, Boolean.TRUE);
        }
        Fragment fragment = this.LIZ;
        if (fragment == null || fragment.getContext() == null) {
            return;
        }
        try {
            if (C036E.LIZ.LIZIZ()) {
                PreScheduleStream preScheduleStreamLIZ2 = LIZ();
                if (preScheduleStreamLIZ2 != null && (str = preScheduleStreamLIZ2.speedProbeUrl) != null && str.length() != 0) {
                    LJI(jLIZJ, "1");
                    LJFF(jLIZJ, "1");
                    LJIIJJI();
                    return;
                }
                C327950CtN c327950CtNLJFF = C771670UOv.LJFF();
                if (c327950CtNLJFF == null || (c328040CtW = c327950CtNLJFF.LIZIZ) == null) {
                    Fragment fragment2 = this.LIZ;
                    if (fragment2 == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment2)) == null) {
                        return;
                    }
                    C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C327980CtQ(jLIZJ, this, c327950CtNLJFF, null), 2);
                    return;
                }
                c327950CtNLJFF.LIZ();
                LJ(jLIZJ, c327950CtNLJFF);
                C783710Uoj c783710UojLJIIIIZZ = LJIIIIZZ(c328040CtW);
                InterfaceC783690Uoh interfaceC783690UohLIZ2 = LIZIZ().LIZ();
                if (interfaceC783690UohLIZ2 != null) {
                    ((C2250051D4x) interfaceC783690UohLIZ2).LIZ.put(EnumC2250061D4y.SPEED_TEST_RESPONSE_INFO_CODE, String.valueOf(c328040CtW.LIZJ));
                }
                this.LIZIZ = c783710UojLJIIIIZZ;
                if (c783710UojLJIIIIZZ == null) {
                    LJFF(jLIZJ, "4");
                    return;
                }
                LIZJ();
                LIZLLL(jLIZJ, c783710UojLJIIIIZZ, c327950CtNLJFF);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("preScheduleStream api result: logid=");
                sbLIZ2.append(c328040CtW.LIZIZ);
                sbLIZ2.append(" recommend level=");
                sbLIZ2.append(c783710UojLJIIIIZZ.LIZ.recommendStreamResolution);
                sbLIZ2.append("  url=");
                sbLIZ2.append(c783710UojLJIIIIZZ.LIZ.speedProbeUrl);
                C20441214yg.LIZIZ("LiveSpeedTestAdapter", C2188811AlT.LIZIZ(sbLIZ2));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_speedtest_url");
                c474500IjALIZ.LJIJJLI(this.LIZLLL);
                String str2 = c783710UojLJIIIIZZ.LIZ.speedProbeUrl;
                c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(str2 == null || str2.length() == 0)) ? 1 : 0), "is_url_empty");
                c474500IjALIZ.LIZ();
                DataChannel dataChannel2 = this.LIZLLL;
                if (dataChannel2 != null) {
                    dataChannel2.zW(PreScheduleStreamChannel.class, c783710UojLJIIIIZZ.LIZ);
                }
                DataChannel dataChannel3 = this.LIZLLL;
                if (dataChannel3 != null) {
                    dataChannel3.zW(OpenProbeForKeyUserChannel.class, Boolean.valueOf(c783710UojLJIIIIZZ.LIZIZ.LIZ));
                }
                DataChannel dataChannel4 = this.LIZLLL;
                if (dataChannel4 != null) {
                    dataChannel4.zW(GetProgressiveResultsChannel.class, Boolean.valueOf(c783710UojLJIIIIZZ.LIZIZ.LIZIZ));
                }
                C20441214yg.LJIIIZ("LiveSpeedTestAdapter", "ProbeCache startSpeedTest after subscribe PreScheduleStreamChannel data-->");
                LJIIJJI();
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZIZ().LIZJ(EnumC2239251Ckd.NETWORK_ERROR);
        LJII();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1Bxq] */
    public C2250021D4u(Fragment fragment) {
        Context context;
        Object c098200Yq;
        LifecycleCoroutineScope lifecycleScope;
        this.LIZ = fragment;
        this.LIZLLL = C475510Ikn.LJ(fragment);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(256));
        this.LJFF = c01gwLIZIZ;
        this.LJI = new ARunnableS112S0100000_12(this, 364);
        this.LJII = new InterfaceC473790Ii1() { // from class: X.1Bxq
            @Override // X.InterfaceC473790Ii1
            public final void LIZ(EnumC804620VhM enumC804620VhM) {
                Boolean bool;
                C1D4C c1d4c = this.LIZ.LJIIIIZZ;
                if (c1d4c != null) {
                    c1d4c.LJIJ(C786410Ut5.e3(GlobalContext.getApplicationContext()).getValue());
                }
                DataChannel dataChannel = this.LIZ.LIZLLL;
                if (dataChannel != null) {
                    bool = (Boolean) dataChannel.gg0(IsSpeedTestingChannel.class);
                } else {
                    bool = null;
                }
                if (!C500260Jjc.LJJJI(bool)) {
                    C473410IhP.LIZ().removeCallbacks(this.LIZ.LJI);
                    C473410IhP.LIZJ(this.LIZ.LJI, 1000L);
                }
            }
        };
        this.LJIIIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(257));
        C1273970jFz.LIZ();
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.EQ2(this.LIZ, IsBroadcastPreviewCurrentSceneChannel.class, new AwS591S0100000_12(this, 984));
            dataChannel.BQ2(this.LIZ, LiveModeChannel.class, new AwS591S0100000_12(this, 985));
            dataChannel.BQ2(this.LIZ, LiveSpeedTestStart.class, new AwS613S0100000_34(this, 126));
        }
        C0J9Y c0j9y = (C0J9Y) c01gwLIZIZ.getValue();
        Fragment fragment2 = this.LIZ;
        if (fragment2 != null && (context = fragment2.getContext()) != null) {
            c0j9y.LIZIZ(context);
            ((C0J9Y) c01gwLIZIZ.getValue()).LIZ(this.LJII);
            String strValue = TTLHAndroidAdaptiveConfig.INSTANCE.value();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initLoadStarShipEngine performance-adaptiveJsonStr: ");
            sbLIZ.append(strValue);
            C20441214yg.LIZIZ("LiveSpeedTestAdapter", C2188811AlT.LIZIZ(sbLIZ));
            try {
                C326690CrL.LIZ.loadStarShipStrategy();
                C20441214yg.LIZIZ("LiveSpeedTestAdapter", "initLoadStarShipEngine execute loadStarShipStrategy ->");
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("initLoadStarShipEngine fail: ");
                sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                C20441214yg.LJ("LiveSpeedTestAdapter", C2188811AlT.LIZIZ(sbLIZ2));
            }
            Fragment fragment3 = this.LIZ;
            if (fragment3 != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment3)) != null) {
                C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C463301rD(null), 2);
            }
            boolean zEnabled = M2LEnablePreGetConfig.INSTANCE.enabled();
            if (zEnabled) {
                String serverDeviceId = C781270Ukn.LJIIJJI().getServerDeviceId();
                String rtcAppID = TTLHSplitModuleRtcAppID.INSTANCE.getRtcAppID();
                String strJ3 = "";
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String value = LinkMicRtcAbParamsSetting.INSTANCE.getValue();
                    Map mapLJ = C2097608Jq.LJ();
                    if (C1533950q1J.LJ(value)) {
                        try {
                            mapLJ = C2348509Id.LIZIZ(new JSONObject(value == null ? "" : value));
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }
                    linkedHashMap.putAll(mapLJ);
                    strJ3 = C786410Ut5.J3(new JSONObject(linkedHashMap));
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
                IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
                C1276090jJP.LJ(zEnabled, new C1276150jJV(iHostAppContext != null ? iHostAppContext.context() : null, rtcAppID, serverDeviceId, strJ3, "video", M2LPreGetConfigDelayMs.INSTANCE.getValue(), M2LPreGetConfigUseCache.INSTANCE.getValue()));
            }
        }
        this.LJIILL = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C783710Uoj LJIIIIZZ(X.C328040CtW r47) {
        /*
            Method dump skipped, instruction units count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2250021D4u.LJIIIIZZ(X.0CtW):X.0Uoj");
    }

    public final Context LJIIJ(String str) {
        Object c098200Yq;
        Object objContext;
        Object c098200Yq2;
        Context contextN3;
        Context context;
        Context context2 = null;
        if (!TTLHProbeAppContextSwitch.INSTANCE.enableTTLHProbeAppContext()) {
            Fragment fragment = this.LIZ;
            if (fragment != null) {
                context2 = fragment.getContext();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resolveAppContext[");
            sbLIZ.append(str);
            sbLIZ.append("] switch=off, use legacy fragment.context=");
            sbLIZ.append(context2);
            C20441214yg.LIZIZ("LiveSpeedTestAdapter", C2188811AlT.LIZIZ(sbLIZ));
            return context2;
        }
        try {
            c098200Yq = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        IHostAppContext iHostAppContext = (IHostAppContext) c098200Yq;
        if (iHostAppContext == null) {
            C20441214yg.LJIIL("LiveSpeedTestAdapter", "resolveAppContext[" + str + "] IHostAppContext service is null");
        }
        if (iHostAppContext == null) {
            objContext = null;
        } else {
            try {
                objContext = iHostAppContext.context();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                objContext = new C098200Yq(th2);
                C189200o6.m2constructorimpl(objContext);
            }
        }
        C189200o6.m2constructorimpl(objContext);
        if (C189200o6.m7isFailureimpl(objContext)) {
            objContext = null;
        }
        Context context3 = (Context) objContext;
        if (context3 != null) {
            C20441214yg.LIZIZ("LiveSpeedTestAdapter", "resolveAppContext[" + str + "] use host context=" + context3);
            return context3;
        }
        try {
            c098200Yq2 = GlobalContext.getApplicationContext();
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq2 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        Context context4 = (Context) c098200Yq2;
        if (context4 != null) {
            C20441214yg.LIZIZ("LiveSpeedTestAdapter", "resolveAppContext[" + str + "] host unavailable, fallback global=" + context4);
            return context4;
        }
        Fragment fragment2 = this.LIZ;
        if (fragment2 != null && (context = fragment2.getContext()) != null) {
            contextN3 = C786410Ut5.N3(context);
        } else {
            contextN3 = null;
        }
        if (contextN3 != null) {
            C20441214yg.LIZIZ("LiveSpeedTestAdapter", "resolveAppContext[" + str + "] host+global unavailable, fallback fragment.applicationContext=" + contextN3);
            return contextN3;
        }
        C20441214yg.LJIIL("LiveSpeedTestAdapter", "resolveAppContext[" + str + "] all sources unavailable, returning null");
        return null;
    }

    public final void LJ(long j, C327950CtN c327950CtN) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Boolean boolValueOf5;
        InterfaceC1699460uKG interfaceC1699460uKGWr1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pre request state: isPreRequest = ");
        Boolean boolValueOf6 = null;
        if (c327950CtN != null) {
            boolValueOf = Boolean.valueOf(c327950CtN.LJ);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", isPreRequestFail = ");
        if (c327950CtN != null) {
            boolValueOf2 = Boolean.valueOf(c327950CtN.LJI);
        } else {
            boolValueOf2 = null;
        }
        sbLIZ.append(boolValueOf2);
        sbLIZ.append(", isPreRequestExpire = ");
        if (c327950CtN != null) {
            boolValueOf3 = Boolean.valueOf(c327950CtN.LJFF);
        } else {
            boolValueOf3 = null;
        }
        sbLIZ.append(boolValueOf3);
        C20441214yg.LIZIZ("speed_test", C2188811AlT.LIZIZ(sbLIZ));
        if (c327950CtN != null) {
            boolValueOf4 = Boolean.valueOf(c327950CtN.LJ);
        } else {
            boolValueOf4 = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf4)) {
            LJI(j, "11");
        } else {
            if (c327950CtN != null) {
                boolValueOf5 = Boolean.valueOf(c327950CtN.LJI);
            } else {
                boolValueOf5 = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf5)) {
                LJI(j, "12");
            } else {
                if (c327950CtN != null) {
                    boolValueOf6 = Boolean.valueOf(c327950CtN.LJFF);
                }
                if (C500260Jjc.LJJJI(boolValueOf6)) {
                    LJI(j, "13");
                } else {
                    LJI(j, CardStruct.IStatusCode.DEFAULT);
                }
            }
        }
        IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
        if (iPullStreamService != null && (interfaceC1699460uKGWr1 = iPullStreamService.Wr1()) != null) {
            interfaceC1699460uKGWr1.LIZ("video_pre_schedule_helper");
        }
    }

    public final void LJFF(long j, String str) {
        InterfaceC783690Uoh interfaceC783690UohLIZ = LIZIZ().LIZ();
        if (interfaceC783690UohLIZ != null) {
            C2250051D4x c2250051D4x = (C2250051D4x) interfaceC783690UohLIZ;
            c2250051D4x.LIZIZ(EnumC2250061D4y.SPEED_TEST_RESPONSE_TIME, String.valueOf(System.currentTimeMillis() - j));
            c2250051D4x.LIZIZ(EnumC2250061D4y.SPEED_TEST_RESPONSE_RESULT, str);
        }
    }

    public final void LJI(long j, String str) {
        InterfaceC783690Uoh interfaceC783690UohLIZ = LIZIZ().LIZ();
        if (interfaceC783690UohLIZ != null) {
            C2250051D4x c2250051D4x = (C2250051D4x) interfaceC783690UohLIZ;
            c2250051D4x.LIZIZ(EnumC2250061D4y.START_REQUEST_URL_TIME, String.valueOf(System.currentTimeMillis() - j));
            c2250051D4x.LIZIZ(EnumC2250061D4y.START_REQUEST_URL_RESULT, str);
        }
    }

    public final void LIZLLL(long j, C783710Uoj c783710Uoj, C327950CtN c327950CtN) {
        Boolean boolValueOf;
        String str = c783710Uoj.LIZ.speedProbeUrl;
        if (str != null && a0.LJJJIL(str)) {
            LJFF(j, "3");
            return;
        }
        String str2 = c783710Uoj.LIZ.sdkParams;
        if (str2 != null && a0.LJJJIL(str2)) {
            LJFF(j, "2");
            return;
        }
        if (c327950CtN != null) {
            boolValueOf = Boolean.valueOf(c327950CtN.LJ);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            LJFF(j, "11");
        } else {
            LJFF(j, CardStruct.IStatusCode.DEFAULT);
        }
    }
}
