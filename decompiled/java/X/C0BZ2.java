package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BZ2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BZ2 extends C09AY implements Function0<Map<String, ? extends String>> {
    public C0BZ2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends String> invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Map<String, String> map = C0BZ3.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("ecom_search_bff_card_header", Map.class, map);
        return LJIIIIZZ != 0 ? LJIIIIZZ : map;
    }
}
