package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07MZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07MZ extends C09AY implements Function0<C07MX> {
    public C07MZ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.07MX] */
    @Override // kotlin.jvm.functions.Function0
    public final C07MX invoke() {
        return new C07MY() { // from class: X.07MX
            @Override // X.C07MY
            public final Map<String, String> LIZ() {
                return new LinkedHashMap();
            }
        };
    }
}
