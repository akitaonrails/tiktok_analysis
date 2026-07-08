package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C290190BYz extends C09AY implements Function0<Map<String, ? extends String>> {
    public C290190BYz() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends String> invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Map<String, String> map = C0BZ0.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(Map.class, map, "aweme_features_config", true);
        return LJJII != 0 ? LJJII : map;
    }
}
