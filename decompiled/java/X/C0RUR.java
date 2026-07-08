package X;

import com.ss.android.ugc.feed.platform.ab.ComponentStrategy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RUR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RUR extends C09AY implements Function0<Map<String, ? extends ComponentStrategy>> {
    public C0RUR() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends ComponentStrategy> invoke() {
        List listLJIJJLI = C15438062q.LJIJJLI(C1697810uHb.LJIIJJI(C2269831Dsr.LIZJ.getValue(), C2269771Dsl.LIZJ.getValue(), C0RUP.LIZ.getValue(), C2269801Dso.LIZJ.getValue(), C0RUQ.LIZ.getValue()));
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJIJJLI, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : (ArrayList) listLJIJJLI) {
            linkedHashMap.put(((ComponentStrategy) obj).tag, obj);
        }
        return linkedHashMap;
    }
}
