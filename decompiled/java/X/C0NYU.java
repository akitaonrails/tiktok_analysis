package X;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0NYU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NYU {
    public static final List<String> LIZ(Map<String, ? extends AbstractC595720NYc> map) {
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        Collection<? extends AbstractC595720NYc> collectionValues = map.values();
        C13DV c13dvLIZIZ2 = C1697820uHc.LIZIZ();
        for (AbstractC595720NYc abstractC595720NYc : collectionValues) {
            if (abstractC595720NYc instanceof C595710NYb) {
                c13dvLIZIZ2.add(((C595710NYb) abstractC595720NYc).LIZIZ);
            } else if (abstractC595720NYc instanceof C595700NYa) {
                c13dvLIZIZ2.addAll(((C595700NYa) abstractC595720NYc).LIZJ);
            }
        }
        c13dvLIZIZ.addAll(C1697820uHc.LIZ(c13dvLIZIZ2));
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }
}
