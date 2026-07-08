package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0ScE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725000ScE extends C09AY implements Function1<C724880Sc2, Unit> {
    public C725000ScE() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C724880Sc2 c724880Sc2) {
        C724880Sc2 c724880Sc22 = c724880Sc2;
        if (C1562780qlo.LIZIZ()) {
            C202098145w c202098145wLIZ = C08TN.LIZ();
            String simpleName = c724880Sc22.LIZJ.getClass().getSimpleName();
            long jLongValue = c724880Sc22.LIZ;
            c202098145wLIZ.getClass();
            String strLJIIJ = C202098145w.LJIIJ(simpleName, "assemble_performance");
            if (((ConcurrentHashMap) c202098145wLIZ.LJIIJJI).containsKey(strLJIIJ)) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c202098145wLIZ.LJIIJJI;
                Long l = (Long) concurrentHashMap.get(strLJIIJ);
                if (l != null) {
                    jLongValue += l.longValue();
                }
                concurrentHashMap.put(strLJIIJ, Long.valueOf(jLongValue));
            } else {
                ((ConcurrentHashMap) c202098145wLIZ.LJIIJJI).put(strLJIIJ, Long.valueOf(jLongValue));
            }
        } else {
            C1562470qlJ c1562470qlJ = C1562470qlJ.LIZ;
            AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(c724880Sc22, 445);
            c1562470qlJ.getClass();
            C1562470qlJ.LIZ(c724880Sc22, "first_feed_performance_event", awS590S0100000_11);
        }
        return Unit.LIZ;
    }
}
