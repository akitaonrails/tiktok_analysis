package X;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BhQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2211781BhQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2211761BhO LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2211781BhQ(C2211761BhO c2211761BhO) {
        super(0);
        this.LL = c2211761BhO;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ConcurrentHashMap<Integer, Set<C2211761BhO>> concurrentHashMap = C2211751BhN.LIZIZ;
        C2211761BhO c2211761BhO = this.LL;
        for (Map.Entry<Integer, Set<C2211761BhO>> entry : concurrentHashMap.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if (entry.getValue().remove(c2211761BhO)) {
                c2211761BhO.setLastShowState(false);
                Object value = C2211751BhN.LJ.getValue();
                EnumC2211831BhV enumC2211831BhV = EnumC2211831BhV.TO_INVISIBLE;
                C2211821BhU c2211821BhULJIIIIZZ = C2211751BhN.LJIIIIZZ(c2211761BhO, C2211751BhN.LJI(iIntValue));
                value.getClass();
                C2211771BhP.LIZIZ(enumC2211831BhV, c2211821BhULJIIIIZZ, c2211761BhO);
            }
        }
        return Unit.LIZ;
    }
}
