package X;

import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadActionConfig;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadStrategyConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0efa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097640efa extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1097650efb LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1097640efa(C1097650efb c1097650efb) {
        super(0);
        this.LL = c1097650efb;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        Map<String, ? extends Object> mapLJ;
        PreloadActionConfig preloadActionConfig;
        PreloadActionConfig preloadActionConfig2;
        Integer num;
        PreloadActionConfig preloadActionConfig3;
        Boolean bool;
        C1097650efb c1097650efb = this.LL;
        c1097650efb.getClass();
        c1097650efb.LIZLLL = System.currentTimeMillis();
        PreloadStrategyConfig preloadStrategyConfig = this.LL.LIZ;
        boolean zBooleanValue = (preloadStrategyConfig == null || (preloadActionConfig3 = preloadStrategyConfig.preloadAction) == null || (bool = preloadActionConfig3.forceFetch) == null) ? false : bool.booleanValue();
        PreloadStrategyConfig preloadStrategyConfig2 = this.LL.LIZ;
        int iIntValue = (preloadStrategyConfig2 == null || (preloadActionConfig2 = preloadStrategyConfig2.preloadAction) == null || (num = preloadActionConfig2.cacheDuration) == null) ? 0 : num.intValue();
        C1097650efb c1097650efb2 = this.LL;
        PreloadStrategyConfig preloadStrategyConfig3 = c1097650efb2.LIZ;
        if (preloadStrategyConfig3 == null || (preloadActionConfig = preloadStrategyConfig3.preloadAction) == null || (str = preloadActionConfig.apiPath) == null) {
            str = "";
        }
        InterfaceC1097470efJ interfaceC1097470efJ = c1097650efb2.LIZIZ;
        if (interfaceC1097470efJ == null || (mapLJ = interfaceC1097470efJ.LJII()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C0KA2 c0ka1 = iIntValue > 0 ? new C0KA1(iIntValue) : C0KA3.LIZ;
        InterfaceC1097470efJ interfaceC1097470efJ2 = this.LL.LIZIZ;
        C1106750euH.LIZ.LIZIZ(new C1100630ekP(zBooleanValue, c0ka1, interfaceC1097470efJ2 != null ? interfaceC1097470efJ2.LIZ() : false), str, mapLJ, new C1097600efW(this.LL), new C1097590efV(this.LL));
        super/*X.0efQ*/.execute();
        return Unit.LIZ;
    }
}
