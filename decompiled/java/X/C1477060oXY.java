package X;

import com.ss.android.ugc.playerkit.model.DashAutoBitrateSet;

/* JADX INFO: renamed from: X.0oXY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477060oXY implements InterfaceC1475360oUo {
    public final /* synthetic */ DashAutoBitrateSet LIZ;

    @Override // X.InterfaceC1475360oUo
    public final double LIZ() {
        return this.LIZ.minBitrate;
    }

    @Override // X.InterfaceC1475360oUo
    public final double LIZIZ() {
        return this.LIZ.fourthParam;
    }

    @Override // X.InterfaceC1475360oUo
    public final double LIZJ() {
        return this.LIZ.secondParam;
    }

    @Override // X.InterfaceC1475360oUo
    public final double LIZLLL() {
        return this.LIZ.firstParam;
    }

    @Override // X.InterfaceC1475360oUo
    public final double LJ() {
        return this.LIZ.thirdParam;
    }

    public C1477060oXY(DashAutoBitrateSet dashAutoBitrateSet) {
        this.LIZ = dashAutoBitrateSet;
    }
}
