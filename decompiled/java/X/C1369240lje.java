package X;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0lje, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369240lje implements InterfaceC1367540lgu {
    public static final C1369240lje LIZ = new C1369240lje();

    @Override // X.InterfaceC1367540lgu
    public final Map<String, Object> getEventTracking() {
        return null;
    }

    public final String toString() {
        return "SharePanelRelationMatcher";
    }

    @Override // X.InterfaceC1367540lgu
    public final Map<String, Object> LIZIZ() {
        return C2097908Jt.LIZJ(new Pair("type", "share_panel_relation_search"));
    }

    @Override // X.InterfaceC1367540lgu
    public final C1369340ljo LIZ(String str, String str2) {
        C1369280lji c1369280ljiLIZIZ = C1369270ljh.LIZIZ(str2, str);
        if (c1369280ljiLIZIZ != null) {
            return new C1369340ljo(c1369280ljiLIZIZ.LIZIZ, Collections.singletonList(c1369280ljiLIZIZ.LIZ));
        }
        return new C1369340ljo(0.0d, C13BV.INSTANCE);
    }
}
