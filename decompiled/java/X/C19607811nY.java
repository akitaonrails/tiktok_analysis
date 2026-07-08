package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.11nY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19607811nY {
    public final C19591211ks LIZ;
    public final List<AbstractC19589811ke<?>> LIZIZ = new ArrayList();
    public final Map<Integer, Class<? extends AbstractC19589811ke<?>>> LIZJ = new LinkedHashMap();

    public C19607811nY(C19591211ks c19591211ks) {
        this.LIZ = c19591211ks;
    }

    public final void LIZ(int i, Class<? extends AbstractC19589811ke<?>> cls) {
        this.LIZJ.put(Integer.valueOf(i), cls);
    }
}
