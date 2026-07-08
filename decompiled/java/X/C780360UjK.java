package X;

import Y.ARunnableS4S1000000_7;
import com.bytedance.android.live.broadcast.api.LiveHostClearMemTrigger;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.dataChannel.BroadcastBgClearMemory;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostEnableNetControlSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostNetControlConfig;
import com.bytedance.android.livesdkapi.host.IHostBridge;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.android.livesdkapi.host.LiveDispatchConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.e;
import java.util.HashSet;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0UjK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780360UjK {
    public static final Map<String, C0UZU> LIZ = C2097608Jq.LJIIIIZZ(new Pair("mem_relief_light", new C0UZU() { // from class: X.0UaW
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            C1618340sDQ.LIZ();
        }
    }), new Pair("clear_record_filter_cache", new C0UZU() { // from class: X.0KaX
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            ((IHostBridge) C1161920gLG.LIZJ(IHostBridge.class)).clearCameraFilterCache();
        }
    }), new Pair("clear_search_cache", new C0UZU() { // from class: X.0KaZ
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            ((IHostBridge) C1161920gLG.LIZJ(IHostBridge.class)).clearSearchCache();
        }
    }), new Pair("pause_fresco", new C0UZU() { // from class: X.0LJb
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
            if (!c1325540kbALIZ.LJIILL()) {
                c1325540kbALIZ.LJIILLIIL();
            }
        }
    }), new Pair("pause_gecko", new C0UZU() { // from class: X.0Kaa
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).OP(false);
        }
    }), new Pair("clear_fresco_anim_cache", new C0UZU() { // from class: X.0L5E
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0L5D(null), 2);
        }
    }), new Pair("clear_broadcast_effect_cache", new C0UZU() { // from class: X.0UZ5
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).releaseResourceInBackground();
        }
    }), new Pair("close_broadcast_dialog", new C0UZU() { // from class: X.0UZR
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            dataChannel.FQ2(BroadcastBgClearMemory.class);
        }
    }), new Pair("clear_multi_guest_dsl", new C0UZU() { // from class: X.0kso
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            C1303170k15 c1303170k15Y22;
            ILinkMicService iLinkMicService = (ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class);
            if (iLinkMicService != null && (c1303170k15Y22 = iLinkMicService.y22()) != null) {
                c1303170k15Y22.LIZ();
            }
        }
    }), new Pair("suspend_lego_tasks", new C0UZU() { // from class: X.0UYn
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            C13BV c13bv = C13BV.INSTANCE;
            C799900VZk c799900VZk = C799900VZk.LIZ;
            C800250VaJ c800250VaJ = new C800250VaJ(c13bv);
            c799900VZk.getClass();
            C800240VaI.LIZ = C799900VZk.LIZ(c800250VaJ);
        }
    }), new Pair("gc", new C0UZU() { // from class: X.0UjQ
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            System.gc();
        }
    }), new Pair("clear_sticker_viewmodel_cache", new C0UZU() { // from class: X.0UaU
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).clearStickerViewModelCache();
        }
    }), new Pair("clear_live_center_view", new C0UZU() { // from class: X.1AHR
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            dataChannel.LC0(LiveHostClearMemTrigger.class, new Pair(EnumC1783030wV3.SCHEDULED, EnumC2177591AKf.CRITICAL));
        }
    }), new Pair("clear_effect_aes_cache", new C0UZU() { // from class: X.0UjJ
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).clearEffectAesCache();
        }
    }), new Pair("clear_model_config_cache", new C0UZU() { // from class: X.0UjN
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).clearModelConfigArbiterCache();
        }
    }), new Pair("clear_font_effect_cache", new C0UZU() { // from class: X.0UjP
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).clearFontEffectPlatformCache();
        }
    }), new Pair("clear_gecko_cache", new C0UZU() { // from class: X.0UjU
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            ((C098J) C1143780fs0.LIZ.getValue()).LIZIZ();
            ((HashSet) C1143780fs0.LIZIZ.getValue()).clear();
            ARunnableS4S1000000_7 aRunnableS4S1000000_7 = C1143780fs0.LJIIIZ;
            if (aRunnableS4S1000000_7 != null) {
                C473410IhP.LJ(aRunnableS4S1000000_7);
            }
        }
    }), new Pair("cpu_suppress", new C0UZU() { // from class: X.0UZm
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            if (!C774430UZl.LIZ) {
                C774430UZl.LIZ = true;
                IPerformanceService iPerformanceService = (IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class);
                if (iPerformanceService != null) {
                    try {
                        iPerformanceService.Cl1();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("slowDownLowPriorityThreads failed: ");
                        sbLIZ.append(th.getMessage());
                        C20441214yg.LJ("BgGovernor", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                C20441214yg.LIZIZ("BgGovernor", "suppress: low-priority threads slowed down (nice raised + little core bound)");
                if (iPerformanceService != null) {
                    try {
                        iPerformanceService.Qk1();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("pauseBackgroundExecutors failed: ");
                        sbLIZ2.append(th2.getMessage());
                        C20441214yg.LJ("BgGovernor", C2188811AlT.LIZIZ(sbLIZ2));
                        return;
                    }
                }
                C20441214yg.LIZIZ("BgGovernor", "suppress: background executors paused");
            }
        }
    }), new Pair("register_bg_net_control", new C0UZU() { // from class: X.0UZA
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            LiveDispatchConfig configByScene;
            if (LiveHostEnableNetControlSetting.INSTANCE.enable() && (configByScene = LiveHostNetControlConfig.INSTANCE.getConfigByScene("biz_live_broadcast_background")) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("bg governor: ");
                sbLIZ.append(GsonProtectorUtils.toJson(new e().LIZ(), configByScene));
                C20441214yg.LIZIZ("BgGovernor", C2188811AlT.LIZIZ(sbLIZ));
                ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).registerNetworkControl(configByScene.getSceneName(), configByScene);
            }
        }
    }), new Pair("clear_net_data_pipeline", new C0UZU() { // from class: X.0UjO
        @Override // X.C0UZU
        public final void LIZ(DataChannel dataChannel) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C780430UjR(null), 2);
        }
    }), new Pair("finish_other_page", new C0UZU() { // from class: X.0KaW
        /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
        @Override // X.C0UZU
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZ(com.bytedance.ies.sdk.datachannel.DataChannel r8) {
            /*
                r7 = this;
                X.0mCc[] r5 = X.C1906580ziK.LJII()
                java.lang.Class<com.bytedance.android.livesdkapi.host.IHostBridge> r0 = com.bytedance.android.livesdkapi.host.IHostBridge.class
                X.006A r6 = X.C1161920gLG.LIZJ(r0)
                com.bytedance.android.livesdkapi.host.IHostBridge r6 = (com.bytedance.android.livesdkapi.host.IHostBridge) r6
                int r3 = r5.length
                r4 = 0
            Le:
                r2 = 1
                if (r4 >= r3) goto L88
                r1 = r5[r4]
                if (r6 == 0) goto L7f
                android.app.Activity r0 = r1.LIZIZ()
                if (r0 == 0) goto L7d
                android.app.Activity r0 = X.C1388190mED.LIZ(r0)
            L1f:
                boolean r0 = r6.isSAAActivity(r0)
                if (r0 == r2) goto L2d
                java.lang.Object r0 = r1.LIZ
                boolean r0 = r6.isLiveRootPage(r0)
                if (r0 != r2) goto L7f
            L2d:
                if (r4 <= 0) goto L88
                r3 = 0
            L30:
                r2 = r5[r3]
                boolean r0 = r2 instanceof X.C1397950mTx
                if (r0 == 0) goto L4e
                r1 = r2
                X.0mTx r1 = (X.C1397950mTx) r1
                android.app.Activity r0 = r1.LIZLLL
                boolean r0 = r0.isFinishing()
                if (r0 != 0) goto L49
                android.app.Activity r0 = r1.LIZLLL
                boolean r0 = r0.isDestroyed()
                if (r0 == 0) goto L73
            L49:
                int r3 = r3 + 1
                if (r3 < r4) goto L30
                return
            L4e:
                boolean r0 = r2 instanceof X.C1844400y62
                if (r0 == 0) goto L66
                r0 = r2
                X.0y62 r0 = (X.C1844400y62) r0
                F extends androidx.fragment.app.Fragment & X.198i r1 = r0.LIZLLL
                X.198i r1 = (X.InterfaceC214902198i) r1
                boolean r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIIZILJ(r1)
                if (r0 != 0) goto L49
                boolean r0 = r1.SL()
                if (r0 == 0) goto L73
                goto L49
            L66:
                boolean r0 = r2 instanceof X.C198S
                if (r0 == 0) goto L82
                r0 = r2
                X.198S r0 = (X.C198S) r0
                com.bytedance.scene.Scene r0 = r0.LIZLLL
                boolean r0 = r0.mViewDestroyed
                if (r0 != 0) goto L49
            L73:
                java.lang.Object r0 = r2.LIZ
                boolean r0 = r0 instanceof X.InterfaceC1711206n0
                if (r0 != 0) goto L49
                r2.LIZ()
                goto L49
            L7d:
                r0 = 0
                goto L1f
            L7f:
                int r4 = r4 + 1
                goto Le
            L82:
                X.07lC r0 = new X.07lC
                r0.<init>()
                throw r0
            L88:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C520100KaW.LIZ(com.bytedance.ies.sdk.datachannel.DataChannel):void");
        }
    }));
}
