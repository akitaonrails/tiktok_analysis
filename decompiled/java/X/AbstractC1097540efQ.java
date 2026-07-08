package X;

import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadStrategyConfig;

/* JADX INFO: renamed from: X.0efQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1097540efQ implements InterfaceC1097480efK {
    public PreloadStrategyConfig LIZ;
    public InterfaceC1097470efJ LIZIZ;
    public String LIZJ = "";
    public long LIZLLL;

    public final void LJ() {
        C1097450efH.LIZ(this, true, null, null, System.currentTimeMillis() - this.LIZLLL);
    }

    @Override // X.InterfaceC1097480efK
    public void destroy() {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = "";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy ");
        sbLIZ.append(getClass().getSimpleName());
        C1096330edT.LIZ("AbsPreloadAction", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1097480efK
    public void execute() {
        InterfaceC1097470efJ interfaceC1097470efJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("execute ");
        sbLIZ.append(getClass().getSimpleName());
        C1096330edT.LIZ("AbsPreloadAction", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZ == null || (interfaceC1097470efJ = this.LIZIZ) == null) {
            return;
        }
        interfaceC1097470efJ.LJ();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("action=");
        sbLIZ.append(LIZLLL());
        sbLIZ.append(", config=");
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1097480efK
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1097480efK
    public final PreloadStrategyConfig getConfig() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1097480efK
    public final InterfaceC1097470efJ getScene() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1097480efK
    public final void LIZJ(PreloadStrategyConfig preloadStrategyConfig, InterfaceC1097470efJ interfaceC1097470efJ, String str) {
        this.LIZ = preloadStrategyConfig;
        this.LIZIZ = interfaceC1097470efJ;
        this.LIZJ = str;
        interfaceC1097470efJ.LIZIZ(preloadStrategyConfig);
    }
}
