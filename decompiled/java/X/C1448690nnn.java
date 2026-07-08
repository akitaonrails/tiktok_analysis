package X;

import com.bytedance.creationmodel.core.WritableCacheProvider;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0nnn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448690nnn {
    public final Map<Class<?>, Map<InterfaceC2217241BqE<?, ?>, InterfaceC1448670nnl<?, ?>>> LIZ = new HashMap();

    public final Map<InterfaceC2217241BqE<?, ?>, InterfaceC1448670nnl<?, ?>> LIZ(Class<?> cls) {
        Map<InterfaceC2217241BqE<?, ?>, InterfaceC1448670nnl<?, ?>> map = (Map) ((HashMap) this.LIZ).get(cls);
        if (map != null) {
            return map;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(cls.getName());
        sbLIZ.append("_WritableCacheProvider");
        ((WritableCacheProvider) Class.forName(C2188811AlT.LIZIZ(sbLIZ)).newInstance()).register(this);
        return (Map) ((HashMap) this.LIZ).get(cls);
    }
}
