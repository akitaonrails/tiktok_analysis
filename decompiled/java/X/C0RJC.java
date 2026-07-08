package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RJC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RJC {
    public final Map<String, Function1<C0RAB, Unit>> LIZ = new LinkedHashMap();
    public final Map<String, Function1<C0RAO, Unit>> LIZIZ = new LinkedHashMap();

    public final void LIZ(C0RAO c0rao) {
        if (!(c0rao instanceof C0RAW)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPlayStateChanged progress: ");
            sbLIZ.append(c0rao);
            sbLIZ.append(' ');
            C1022620cia.LIZ("MultiContentPlayerManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        Iterator it2 = ((LinkedHashMap) this.LIZIZ).values().iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(c0rao);
        }
    }
}
