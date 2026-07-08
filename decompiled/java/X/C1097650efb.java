package X;

import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadActionConfig;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadStrategyConfig;
import java.util.Map;

/* JADX INFO: renamed from: X.0efb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097650efb extends AbstractC1097540efQ {
    @Override // X.InterfaceC1097480efK
    public final int LIZLLL() {
        return 4;
    }

    @Override // X.InterfaceC1097480efK
    public final boolean LIZIZ() {
        Map<String, Object> mapLJ;
        Integer num;
        int iIntValue;
        String str;
        boolean zLIZLLL;
        PreloadStrategyConfig preloadStrategyConfig = this.LIZ;
        if (preloadStrategyConfig == null) {
            return false;
        }
        InterfaceC1097470efJ interfaceC1097470efJ = this.LIZIZ;
        if (interfaceC1097470efJ == null || (mapLJ = interfaceC1097470efJ.LJII()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        PreloadActionConfig preloadActionConfig = preloadStrategyConfig.preloadAction;
        if (preloadActionConfig == null || (num = preloadActionConfig.actionCombineValue) == null || (iIntValue = num.intValue()) <= 0 || (iIntValue & 4) == 0) {
            return false;
        }
        PreloadActionConfig preloadActionConfig2 = preloadStrategyConfig.preloadAction;
        if (preloadActionConfig2 == null || (str = preloadActionConfig2.apiPath) == null) {
            str = "";
        }
        synchronized (C1106750euH.LIZ) {
            zLIZLLL = C1106750euH.LJ().LIZLLL(C1106750euH.LJIIJ(str, mapLJ));
        }
        return !zLIZLLL;
    }

    @Override // X.AbstractC1097540efQ, X.InterfaceC1097480efK
    public final void destroy() {
        C1097660efc c1097660efc = new C1097660efc(this);
        if (this.LIZ != null && this.LIZIZ != null) {
            c1097660efc.invoke();
        }
        super.destroy();
    }

    @Override // X.AbstractC1097540efQ, X.InterfaceC1097480efK
    public final void execute() {
        C1097640efa c1097640efa = new C1097640efa(this);
        if (this.LIZ == null || this.LIZIZ == null) {
            return;
        }
        c1097640efa.invoke();
    }
}
