package X;

import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadActionConfig;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadStrategyConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0efc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097660efc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1097650efb LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1097660efc(C1097650efb c1097650efb) {
        super(0);
        this.LL = c1097650efb;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        Map<String, ? extends Object> mapLJ;
        PreloadActionConfig preloadActionConfig;
        C1097650efb c1097650efb = this.LL;
        PreloadStrategyConfig preloadStrategyConfig = c1097650efb.LIZ;
        if (preloadStrategyConfig == null || (preloadActionConfig = preloadStrategyConfig.preloadAction) == null || (str = preloadActionConfig.apiPath) == null) {
            str = "";
        }
        InterfaceC1097470efJ interfaceC1097470efJ = c1097650efb.LIZIZ;
        if (interfaceC1097470efJ == null || (mapLJ = interfaceC1097470efJ.LJII()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C1106750euH.LIZ.LIZ(str, mapLJ);
        return Unit.LIZ;
    }
}
