package X;

import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUltraLiteModeSetting;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0f9H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116050f9H implements InterfaceC1116090f9L {
    public InterfaceC1114220f6K LIZ;
    public boolean LIZIZ;
    public final EnumC2007607ti LIZJ = EnumC2007607ti.PTF_CREATOR_RANKING_ENTRANCE_LOOP_ANIMATION_INTERVAL;

    @Override // X.InterfaceC1116090f9L
    public final boolean isEnabled() {
        return LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getAdaptRankAnimInterval();
    }

    @Override // X.InterfaceC1116090f9L
    public final void release() {
        if (this.LIZIZ) {
            try {
                try {
                    ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.RANK_ANIM_INTERVAL);
                    C20441214yg.LIZIZ("PTFEntranceLoopAnimationIntervalDowngradeStrategy", "Strategy unregistered successfully");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJIILIIL("PTFEntranceLoopAnimationIntervalDowngradeStrategy", "Failed to unregister strategy", e);
                }
                this.LIZ = null;
                this.LIZIZ = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZ = null;
                this.LIZIZ = false;
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1116090f9L
    public final EnumC2007607ti getType() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1116090f9L
    public final void LIZ(InterfaceC1114220f6K interfaceC1114220f6K, DataChannel dataChannel) {
        if (!this.LIZIZ && isEnabled()) {
            this.LIZ = interfaceC1114220f6K;
            try {
                if (!C500260Jjc.LJIIZILJ(dataChannel)) {
                    ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.RANK_ANIM_INTERVAL, new InterfaceC482090IvP() { // from class: X.0f9F
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC482090IvP
                        public final void LIZ(C0IS4 c0is4) {
                            boolean z;
                            long rankAnimInterval;
                            if (((Number) c0is4.LIZ).intValue() != EnumC994630bzR.NORMAL.getValue()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean enable = LiveUltraLiteModeSetting.INSTANCE.getValue().getEnable();
                            if (z) {
                                if (enable && ((Number) c0is4.LIZ).intValue() >= 0) {
                                    rankAnimInterval = ((Number) c0is4.LIZ).longValue() * 1000;
                                } else {
                                    this.LIZ.getClass();
                                    rankAnimInterval = LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getRankAnimInterval();
                                }
                            } else {
                                rankAnimInterval = 0;
                            }
                            InterfaceC1114220f6K interfaceC1114220f6K2 = this.LIZ.LIZ;
                            if (interfaceC1114220f6K2 != null) {
                                interfaceC1114220f6K2.LIZ(rankAnimInterval);
                            }
                        }
                    });
                }
                this.LIZIZ = true;
                C20441214yg.LIZIZ("PTFEntranceLoopAnimationIntervalDowngradeStrategy", "Strategy initialized successfully");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("PTFEntranceLoopAnimationIntervalDowngradeStrategy", "Failed to initialize strategy", e);
            }
        }
    }
}
