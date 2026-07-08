package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0RTF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0RTF implements C0RTK {
    public final HashMap<AbstractC1155604fa<?>, C0RTG<?>> LL = new HashMap<>();

    @Override // X.C0RTK
    public final Map<AbstractC1155604fa<?>, C0RTG<?>> ff() {
        return this.LL;
    }

    @Override // X.C0RTK
    public final void Zf(Map<AbstractC1155604fa<?>, ? extends C0RTG<?>> map) {
        this.LL.putAll(map);
    }
}
