package X;

import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0f9I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116060f9I implements InterfaceC1116090f9L {
    public InterfaceC1114220f6K LIZ;
    public boolean LIZIZ;
    public final EnumC2007607ti LIZJ = EnumC2007607ti.PTF_CREATOR_RANKING_ENTRANCE_ANIMATION_DISABLE;

    @Override // X.InterfaceC1116090f9L
    public final boolean isEnabled() {
        return LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getAdaptRankAnimDisable();
    }

    @Override // X.InterfaceC1116090f9L
    public final void release() {
        if (this.LIZIZ) {
            try {
                try {
                    ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.RANK_ANIM_DISABLE);
                    C20441214yg.LIZIZ("PTFEntranceAnimationDisableDowngradeStrategy", "Strategy unregistered successfully");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJIILIIL("PTFEntranceAnimationDisableDowngradeStrategy", "Failed to unregister strategy", e);
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
                ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.RANK_ANIM_DISABLE, new InterfaceC482090IvP() { // from class: X.0f9G
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC482090IvP
                    public final void LIZ(C0IS4 c0is4) {
                        boolean z;
                        if (((Number) c0is4.LIZ).intValue() != EnumC994630bzR.SEVERE.getValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        InterfaceC1114220f6K interfaceC1114220f6K2 = this.LIZ.LIZ;
                        if (interfaceC1114220f6K2 != null) {
                            interfaceC1114220f6K2.LIZIZ(z);
                        }
                    }
                });
                this.LIZIZ = true;
                C20441214yg.LIZIZ("PTFEntranceAnimationDisableDowngradeStrategy", "Strategy initialized successfully");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("PTFEntranceAnimationDisableDowngradeStrategy", "Failed to initialize strategy", e);
            }
        }
    }
}
