package X;

import X.C2020007vi;
import X.C2021607vy;
import X.C20441214yg;
import X.C500260Jjc;
import X.C776510Ud7;
import X.C776540UdA;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.livesdk.dataChannel.BroadcastClickConfirmContinueLiveEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastClickStartLiveEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewBroadcastBlockChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LEnablePreGetConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LPreGetConfigUseCache;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHSplitModuleRtcAppID;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS256S0300000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ud7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776510Ud7 implements InterfaceC773740UWu {
    public boolean LIZIZ;
    public C776540UdA LIZJ;
    public final C2250031D4v LIZ = new C2250031D4v();
    public String LIZLLL = "";

    public static final String LIZLLL() {
        C20441214yg.LIZIZ("GameStreamQualityCenterAdapterImpl", "getMonitorManagerId ");
        return null;
    }

    public static final String LJ() {
        C20441214yg.LIZIZ("GameStreamQualityCenterAdapterImpl", "getMonitorSessionId ");
        return null;
    }

    public final PushStreamInfo.Quality LJFF() {
        this.LIZ.getClass();
        PushStreamInfo.Quality qualityLIZIZ = (PushStreamInfo.Quality) DataChannelGlobal.LLILZ.gg0(BroadcastShareScreenDefinition.class);
        if (qualityLIZIZ == null) {
            Map<String, Object> map = C1338270kvh.LIZ;
        } else if (C776390Ucv.LIZ(qualityLIZIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getCurStreamQualityResult -> ");
            sbLIZ.append(qualityLIZIZ);
            C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            qualityLIZIZ = C776390Ucv.LIZIZ(qualityLIZIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getCurStreamQualityResult :");
        sbLIZ2.append(qualityLIZIZ);
        C20441214yg.LIZIZ("GameStreamQualityCenterAdapterImpl", C2188811AlT.LIZIZ(sbLIZ2));
        return qualityLIZIZ;
    }

    public final C1D47 LJI() {
        C2250031D4v c2250031D4v = this.LIZ;
        C1D47 c1d47 = c2250031D4v.LIZJ;
        if (c1d47 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getVideoQualityResult cacheVideoQualityResult=");
            sbLIZ.append(c1d47);
            C20441214yg.LJIIIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ));
            return c1d47;
        }
        String value = C19370910qR.LIZ().getValue();
        c2250031D4v.LIZLLL = value;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getVideoQualityResult lastGearIdentifier=");
        sbLIZ2.append(value);
        C20441214yg.LJIIIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ2));
        C1D4C c1d4cLIZLLL = c2250031D4v.LIZLLL();
        C776580UdE c776580UdE = new C776580UdE();
        if (c2250031D4v.LIZIZ) {
            c776580UdE.LIZ = false;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("gear_identifier", value);
            c776580UdE.LIZIZ = linkedHashMap;
        }
        return c1d4cLIZLLL.LJ(c776580UdE);
    }

    public final boolean LJIIIZ() {
        EnumC776530Ud9 enumC776530Ud9 = this.LIZ.LJIIJJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get speed runningState ");
        sbLIZ.append(enumC776530Ud9);
        C20441214yg.LIZIZ("GameStreamQualityCenterAdapterImpl", C2188811AlT.LIZIZ(sbLIZ));
        return enumC776530Ud9 == EnumC776530Ud9.AUTO_TEST_RUNNING || enumC776530Ud9 == EnumC776530Ud9.MANUAL_TEST_RUNNING;
    }

    public final PushStreamInfo.Quality LIZJ() {
        return C2250031D4v.LIZJ();
    }

    public final void LIZIZ(String str) {
        int i;
        C20441214yg.LIZIZ("GameStreamQualityCenterAdapterImpl", "destroy ");
        C776840Ude.LIZ = null;
        C776540UdA c776540UdA = this.LIZJ;
        if (c776540UdA != null) {
            i = c776540UdA.LIZ;
        } else {
            i = 0;
        }
        this.LIZ.LIZ(i, str, "active_exit", "exit_live_page", this.LIZLLL);
        this.LIZIZ = false;
        this.LIZJ = null;
        this.LIZLLL = "";
    }

    public final void LJIIJJI(PushStreamInfo.Quality quality) {
        this.LIZ.LJIIJJI(quality, EnumC2249781D3w.USER_SELECT);
    }

    public final void LJII(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        Context context;
        final C2250031D4v c2250031D4v = this.LIZ;
        c2250031D4v.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initStreamQualityCenter cur state -> ");
        sbLIZ.append(c2250031D4v.LJIIJJI);
        C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ));
        c2250031D4v.LJIIIIZZ = dataChannel;
        c2250031D4v.LJIIIZ = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.android.livesdk.game.broadcast.stream.quality.core.GameStreamQualityCenterImpl$initStreamQualityCenter$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (C2021607vy.LIZ[event.ordinal()] == 1) {
                    c2250031D4v.LJIIIZ = null;
                }
            }
        });
        c2250031D4v.LJIIZILJ(EnumC776530Ud9.INITIALIZED);
        c2250031D4v.LIZLLL();
        boolean zEnabled = M2LEnablePreGetConfig.INSTANCE.enabled();
        if (zEnabled) {
            String serverDeviceId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getServerDeviceId();
            String rtcAppID = TTLHSplitModuleRtcAppID.INSTANCE.getRtcAppID();
            String strLIZIZ = C2250031D4v.LIZIZ();
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext != null) {
                context = iHostAppContext.context();
            } else {
                context = null;
            }
            C1276090jJP.LJ(zEnabled, new C1276150jJV(context, rtcAppID, serverDeviceId, strLIZIZ, M2LPreGetConfigUseCache.INSTANCE.getValue(), "game"));
        }
    }

    public final void LJIIIIZZ(final LifecycleOwner lifecycleOwner, final DataChannel dataChannel) {
        C20441214yg.LIZIZ("GameStreamQualityCenterAdapterImpl", "start initSpeedConfiguration");
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.android.livesdk.game.broadcast.stream.quality.adapter.GameStreamQualityCenterAdapterImpl$initSpeedConfiguration$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                String string;
                int i = C2020007vi.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (this.LL.LIZIZ) {
                            C20441214yg.LIZIZ("GameStreamQualityCenterAdapterImpl", "stop speed test hadExecuteCreateRoom");
                            C776510Ud7 c776510Ud7 = this.LL;
                            c776510Ud7.LIZJ = C776540UdA.LJFF;
                            c776510Ud7.LIZ.LJIILJJIL("go_live", "click_go_live");
                            return;
                        }
                        C20441214yg.LIZIZ("GameStreamQualityCenterAdapterImpl", "destroy speed test ON_DESTROY");
                        C776510Ud7 c776510Ud72 = this.LL;
                        if (c776510Ud72.LIZJ == null) {
                            c776510Ud72.LIZJ = C776540UdA.LJII;
                        }
                        c776510Ud72.LIZ.LJIILJJIL("active_exit", "exit_live_page");
                        C776510Ud7 c776510Ud73 = this.LL;
                        DataChannel dataChannel2 = dataChannel;
                        if (dataChannel2 != null) {
                            string = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel2)).toString();
                        } else {
                            string = null;
                        }
                        c776510Ud73.LIZIZ(string);
                        return;
                    }
                    return;
                }
                C20441214yg.LIZIZ("GameStreamQualityCenterAdapterImpl", "initSpeedConfiguration ON_CREATE");
                this.LL.LJII(lifecycleOwner, dataChannel);
                C776510Ud7 c776510Ud74 = this.LL;
                DataChannel dataChannel3 = dataChannel;
                LifecycleOwner lifecycleOwner3 = lifecycleOwner;
                c776510Ud74.getClass();
                if (dataChannel3 != null) {
                    dataChannel3.EQ2(lifecycleOwner3, LiveModeChannel.class, new AwS378S0200000_12(c776510Ud74, dataChannel3, 113));
                    dataChannel3.EQ2(lifecycleOwner3, BroadcastClickStartLiveEvent.class, new AwS591S0100000_12(c776510Ud74, 1197));
                }
                C776510Ud7 c776510Ud75 = this.LL;
                DataChannel dataChannel4 = dataChannel;
                LifecycleOwner lifecycleOwner4 = lifecycleOwner;
                c776510Ud75.getClass();
                if (dataChannel4 == null) {
                    return;
                }
                dataChannel4.BQ2(lifecycleOwner4, PreviewBroadcastBlockChannel.class, new AwS591S0100000_12(c776510Ud75, 1194));
                dataChannel4.BQ2(lifecycleOwner4, LiveAccessTipsShowChannel.class, new AwS591S0100000_12(c776510Ud75, 1195));
                dataChannel4.BQ2(lifecycleOwner4, BroadcastClickConfirmContinueLiveEvent.class, new AwS591S0100000_12(c776510Ud75, 1196));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x012a A[PHI: r2
      0x012a: PHI (r2v6 java.util.Map<java.lang.String, java.lang.String>) = (r2v3 java.util.Map<java.lang.String, java.lang.String>), (r2v2 java.util.Map<java.lang.String, java.lang.String>) binds: [B:64:0x0128, B:61:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C776510Ud7.LJIIJ(java.lang.String, boolean):void");
    }

    public final void LJIILIIL(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        C1D49 c1d49;
        LJII(lifecycleOwner, dataChannel);
        C2250031D4v c2250031D4v = this.LIZ;
        if (c2250031D4v.LIZIZ) {
            String value = C19370910qR.LIZ().getValue();
            String str = c2250031D4v.LIZLLL;
            if (str != null && !Intrinsics.LJFF(str, value)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("refreshQualityResultIfNeeded: gear changed ");
                sbLIZ.append(c2250031D4v.LIZLLL);
                sbLIZ.append(" -> ");
                sbLIZ.append(value);
                sbLIZ.append(", fetch final and apply");
                C20441214yg.LJIIIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ));
                c2250031D4v.LIZLLL = value;
                C1D4C c1d4cLIZLLL = c2250031D4v.LIZLLL();
                C776580UdE c776580UdE = new C776580UdE();
                c776580UdE.LIZ = false;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("gear_identifier", value);
                c776580UdE.LIZIZ = linkedHashMap;
                C1D47 c1d47LJ = c1d4cLIZLLL.LJ(c776580UdE);
                PushStreamInfo.Quality qualityLJFF = C2250031D4v.LJFF(c1d47LJ);
                if (c1d47LJ != null) {
                    c1d49 = c1d47LJ.LJIIIIZZ;
                } else {
                    c1d49 = null;
                }
                if (qualityLJFF != null && c1d49 != null) {
                    C500260Jjc.LJJLIIIJJIZ(new AwS256S0300000_12(qualityLJFF, c2250031D4v, c1d49, 19));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("refreshQualityResultIfNeeded applied: quality=");
                    sbLIZ2.append(qualityLJFF);
                    C20441214yg.LJIIIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("refreshQualityResultIfNeeded cannot apply: quality=");
                sbLIZ3.append(qualityLJFF);
                sbLIZ3.append(", probeResult=");
                sbLIZ3.append(c1d49);
                C20441214yg.LJIIL("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("refreshQualityResultIfNeeded skip: last=");
            sbLIZ4.append(c2250031D4v.LIZLLL);
            sbLIZ4.append(", cur=");
            sbLIZ4.append(value);
            C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public final void LIZ(int i, String str, EnumC779450Uhr enumC779450Uhr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopSpeedDetector code:");
        sbLIZ.append(i);
        sbLIZ.append(", message:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("GameStreamQualityCenterAdapterImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC779450Uhr == EnumC779450Uhr.SCENE_TIKTOK_GAME_LIVE_MANUAL) {
            this.LIZ.LJIILLIIL("exit_test_page");
            if (!Intrinsics.LJFF(this.LIZJ, C776540UdA.LIZJ) && !Intrinsics.LJFF(this.LIZJ, C776540UdA.LJ)) {
                this.LIZJ = C776540UdA.LJIIL;
                return;
            }
            return;
        }
        this.LIZJ = C776540UdA.LJII;
        this.LIZ.LJIILJJIL("active_exit", "");
    }

    public final void LJIIL(final EnumC776480Ud4 enumC776480Ud4, final EnumC779450Uhr enumC779450Uhr, final InterfaceC776660UdM interfaceC776660UdM) {
        InterfaceC773540UWa interfaceC773540UWa = new InterfaceC773540UWa() { // from class: X.0Ud8
            @Override // X.InterfaceC773540UWa
            public final void LIZ(C1D49 c1d49) {
                int iValueOf;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C20337914i1<Integer> c20337914i1 = InterfaceC772390URp.x;
                Integer numLIZIZ = c20337914i1.LIZIZ();
                C20337914i1<Long> c20337914i12 = InterfaceC772390URp.u;
                Long lLIZIZ = c20337914i12.LIZIZ();
                if (C776730UdT.LIZ(jCurrentTimeMillis, lLIZIZ.longValue(), TimeZone.getDefault())) {
                    iValueOf = Integer.valueOf(numLIZIZ.intValue() + 1);
                } else {
                    iValueOf = 1;
                }
                Map<String, Object> map = C1338270kvh.LIZ;
                c20337914i1.LJFF(iValueOf);
                c20337914i12.LJFF(Long.valueOf(jCurrentTimeMillis));
                C500260Jjc.LJJLIIIJJIZ(new AwS256S0300000_12(interfaceC776660UdM, c1d49, enumC776480Ud4, 17));
                C776510Ud7 c776510Ud7 = this.LIZ;
                c776510Ud7.LIZJ = C776540UdA.LIZIZ;
                if (enumC779450Uhr == EnumC779450Uhr.SCENE_TIKTOK_GAME_LIVE_MANUAL) {
                    c776510Ud7.LIZJ = C776540UdA.LIZJ;
                }
            }

            @Override // X.InterfaceC773540UWa
            public final void LIZIZ(C2249361D2g c2249361D2g) {
                C500260Jjc.LJJLIIIJJIZ(new AwS413S0200000_12(interfaceC776660UdM, c2249361D2g, 75));
            }

            @Override // X.InterfaceC773540UWa
            public final void LIZJ(C776550UdB c776550UdB) {
                C500260Jjc.LJJLIIIJJIZ(new AwS256S0300000_12(interfaceC776660UdM, c776550UdB, enumC776480Ud4, 16));
                if (Intrinsics.LJFF(c776550UdB, C776550UdB.LJIILL)) {
                    C776510Ud7 c776510Ud7 = this.LIZ;
                    c776510Ud7.LIZJ = C776540UdA.LJIIJJI;
                    if (enumC776480Ud4 == EnumC776480Ud4.PAGE_PREPARATION) {
                        c776510Ud7.LIZJ = C776540UdA.LJIILIIL;
                        return;
                    }
                    return;
                }
                if (c776550UdB.LIZ > 2000) {
                    C776510Ud7 c776510Ud72 = this.LIZ;
                    c776510Ud72.LIZJ = C776540UdA.LIZLLL;
                    if (enumC779450Uhr == EnumC779450Uhr.SCENE_TIKTOK_GAME_LIVE_MANUAL) {
                        c776510Ud72.LIZJ = C776540UdA.LJ;
                    }
                }
            }
        };
        this.LIZLLL = "screen_share_preview_page";
        if (enumC776480Ud4 == EnumC776480Ud4.PAGE_PREPARATION) {
            this.LIZLLL = "screen_share_rehearsal_page";
        }
        if (enumC779450Uhr == EnumC779450Uhr.SCENE_TIKTOK_GAME_LIVE_AUTO) {
            C2250031D4v c2250031D4v = this.LIZ;
            c2250031D4v.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startAutoStreamQualityDecision before ");
            sbLIZ.append(c2250031D4v.LJIIJJI);
            C20441214yg.LJIIIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ));
            c2250031D4v.LJFF = interfaceC773540UWa;
            EnumC776530Ud9 enumC776530Ud9 = c2250031D4v.LJIIJJI;
            if (enumC776530Ud9 == EnumC776530Ud9.IDLE) {
                interfaceC773540UWa.LIZJ(C776550UdB.LIZLLL);
                return;
            }
            if (enumC776530Ud9 == EnumC776530Ud9.MANUAL_TEST_RUNNING) {
                interfaceC773540UWa.LIZJ(C776550UdB.LJ);
                return;
            }
            EnumC776530Ud9 enumC776530Ud92 = EnumC776530Ud9.AUTO_TEST_RUNNING;
            if (enumC776530Ud9 == enumC776530Ud92) {
                interfaceC773540UWa.LIZJ(C776550UdB.LJI);
                return;
            }
            c2250031D4v.LJIIZILJ(enumC776530Ud92);
            c2250031D4v.LJIIL(EnumC783720Uok.AUTO);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startAutoStreamQualityDecision after ");
            sbLIZ2.append(c2250031D4v.LJIIJJI);
            C20441214yg.LJIIIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (enumC779450Uhr == EnumC779450Uhr.SCENE_TIKTOK_GAME_LIVE_MANUAL) {
            this.LIZJ = null;
            C2250031D4v c2250031D4v2 = this.LIZ;
            c2250031D4v2.getClass();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("startManualStreamQualityDecision before ");
            sbLIZ3.append(c2250031D4v2.LJIIJJI);
            C20441214yg.LJIIIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ3));
            c2250031D4v2.LJI = interfaceC773540UWa;
            EnumC776530Ud9 enumC776530Ud93 = c2250031D4v2.LJIIJJI;
            if (enumC776530Ud93 == EnumC776530Ud9.IDLE) {
                interfaceC773540UWa.LIZJ(C776550UdB.LIZLLL);
                return;
            }
            EnumC776530Ud9 enumC776530Ud94 = EnumC776530Ud9.MANUAL_TEST_RUNNING;
            if (enumC776530Ud93 == enumC776530Ud94) {
                interfaceC773540UWa.LIZJ(C776550UdB.LJI);
                return;
            }
            if (enumC776530Ud93 == EnumC776530Ud9.AUTO_TEST_RUNNING) {
                interfaceC773540UWa.LIZJ(C776550UdB.LJFF);
                return;
            }
            c2250031D4v2.LJIIZILJ(enumC776530Ud94);
            EnumC783720Uok enumC783720Uok = EnumC783720Uok.MANUAL;
            c2250031D4v2.LJIIL(enumC783720Uok);
            C11JF c11jf = c2250031D4v2.LJII;
            if (c11jf != null) {
                c11jf.dispose();
            }
            c2250031D4v2.LJII = (C11JF) C19490011Na.LIZLLL(0L, ((Number) c2250031D4v2.LJIILIIL.getValue()).intValue() + 1, 0L, 1L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJIIJZLJL(new C786160Usg(enumC783720Uok, c2250031D4v2, 5)).LJJLJLI(new C09JN() { // from class: X.00Qw
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GameStreamQualityCenterImpl@d868.startEndSpeedTestCountDown$2");
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("startEndSpeedTestCountDown conut -> ");
                    sbLIZ4.append(obj);
                    C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ4));
                    C1C7U.LIZIZ("GameStreamQualityCenterImpl@d868.startEndSpeedTestCountDown$2");
                }
            });
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("startManualStreamQualityDecision after ");
            sbLIZ4.append(c2250031D4v2.LJIIJJI);
            C20441214yg.LJIIIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ4));
        }
    }
}
