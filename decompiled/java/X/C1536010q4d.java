package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.FutureTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536010q4d extends C09AY implements Function1<C1536070q4j, Unit> {
    public C1536010q4d() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1536070q4j c1536070q4j) {
        Map<String, FutureTask<byte[]>> map;
        C1536070q4j c1536070q4j2 = c1536070q4j;
        if (c1536070q4j2.isSuccess() && (map = c1536070q4j2.LIZIZ) != null) {
            Iterator<Map.Entry<String, FutureTask<byte[]>>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue().run();
            }
        }
        return Unit.LIZ;
    }
}
