package X;

import com.bytedance.android.starship.engine.strategy.IStarShipStrategy;
import com.bytedance.android.starship.strategy.CancelableJob;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.0k6F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306370k6F implements IStarShipStrategy {
    public static final C1306370k6F LIZ = new C1306370k6F();

    @Override // com.bytedance.android.starship.engine.strategy.IStarShipStrategy
    @InterfaceC1294060jmO
    public final void LJIIJ(EnumC1306820k6y enumC1306820k6y, AFwS245S0000000_12 aFwS245S0000000_12) {
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final boolean addDataProvider(InterfaceC1307050k7L interfaceC1307050k7L) {
        return false;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final String getStrategyVersion(String str) {
        return "EmptyContainer. maybe not init.";
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void loadStarShipStrategy() {
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final CancelableJob registerStrategyCallback(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
        return null;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final boolean removeDataProvider(String str) {
        return false;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void sendEvent(String str, Map<String, ? extends Object> map) {
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final boolean isStrategyLoaded(String str) {
        C1306510k6T.LIZ.getClass();
        if (C1306480k6Q.LIZLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("strategy is not pulled, check whether the strategy configuration is hit");
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("EmptyContainer isStrategyLoaded:");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        return false;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final C1306060k5k runStrategySync(C1306400k6I c1306400k6I) {
        String strLIZIZ;
        C1306510k6T.LIZ.getClass();
        if (C1306480k6Q.LIZLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1306400k6I.LIZ);
            sbLIZ.append("strategy is not pulled, check whether the strategy configuration is hit");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "EmptyContainer.";
        }
        C1306060k5k c1306060k5k = new C1306060k5k();
        c1306060k5k.LIZIZ = strLIZIZ;
        return c1306060k5k;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final C1306060k5k runStrategyWithEvent(C1306400k6I c1306400k6I) {
        String strLIZIZ;
        C1306510k6T.LIZ.getClass();
        if (C1306480k6Q.LIZLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1306400k6I.LIZ);
            sbLIZ.append("strategy is not pulled, check whether the strategy configuration is hit");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "EmptyContainer.";
        }
        C1306060k5k c1306060k5k = new C1306060k5k();
        c1306060k5k.LIZIZ = strLIZIZ;
        return c1306060k5k;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void getStrategyResult(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
        String strLIZIZ;
        C1306510k6T.LIZ.getClass();
        if (C1306480k6Q.LIZLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1306400k6I.LIZ);
            sbLIZ.append("strategy is not pulled, check whether the strategy configuration is hit");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "EmptyContainer.";
        }
        C1306060k5k c1306060k5k = new C1306060k5k();
        c1306060k5k.LIZIZ = strLIZIZ;
        function1.invoke(c1306060k5k);
    }

    @Override // com.bytedance.android.starship.engine.strategy.IStarShipStrategy
    public final C1306390k6H<Map<String, Object>> gf(String str, String str2) {
        return C1306380k6G.LIZ(-4, "Container not found.");
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void runStrategy(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
        String strLIZIZ;
        C1306510k6T.LIZ.getClass();
        if (C1306480k6Q.LIZLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1306400k6I.LIZ);
            sbLIZ.append("strategy is not pulled, check whether the strategy configuration is hit");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "EmptyContainer.";
        }
        C1306060k5k c1306060k5k = new C1306060k5k();
        c1306060k5k.LIZIZ = strLIZIZ;
        function1.invoke(c1306060k5k);
    }

    @Override // com.bytedance.android.starship.engine.strategy.IStarShipStrategy
    public final <T> C1306390k6H<T> LIZJ(String str, String str2, Type type) {
        return C1306380k6G.LIZ(-4, "Container not found.");
    }
}
