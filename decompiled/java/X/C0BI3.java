package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BI3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BI3 extends C09AY implements Function0<Map<String, ? extends Double>> {
    public C0BI3() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Double>] */
    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends Double> invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Map<String, Double> map = C0BI4.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("resource_dispatch_priority_config", Map.class, map);
        return LJIIIIZZ != 0 ? LJIIIIZZ : map;
    }
}
