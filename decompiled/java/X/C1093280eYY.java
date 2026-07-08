package X;

import webcast.api.room.StrategyTriggerEvent;

/* JADX INFO: renamed from: X.0eYY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093280eYY implements InterfaceC1093320eYc {
    public final StrategyTriggerEvent LIZ;
    public boolean LIZIZ = false;

    @Override // X.InterfaceC1093320eYc
    public final void stop() {
        this.LIZIZ = true;
    }

    @Override // X.InterfaceC1093320eYc
    public final EnumC1093260eYW LIZ() {
        return EnumC1093260eYW.APPLOG;
    }

    @Override // X.InterfaceC1093320eYc
    public final boolean isFrozen() {
        return this.LIZIZ;
    }

    public C1093280eYY(StrategyTriggerEvent strategyTriggerEvent) {
        this.LIZ = strategyTriggerEvent;
    }

    @Override // X.InterfaceC1093320eYc
    public final boolean LIZIZ(C473440IhS c473440IhS) {
        if (!this.LIZIZ && c473440IhS.LIZIZ == EnumC1093260eYW.APPLOG && this.LIZ.values.contains(c473440IhS.LJ)) {
            return true;
        }
        return false;
    }
}
