package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0VR0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VR0 extends C09AY implements Function1<C797710VQz, Unit> {
    public final /* synthetic */ C1212490hep LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0VR0(C1212490hep c1212490hep) {
        super(1);
        this.LL = c1212490hep;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C797710VQz c797710VQz) {
        C797710VQz c797710VQz2 = c797710VQz;
        C1212490hep c1212490hep = this.LL;
        c1212490hep.getClass();
        if (c797710VQz2.LIZJ) {
            c1212490hep.LIZIZ();
        } else if (c797710VQz2.LIZ) {
            Set<Integer> set = c797710VQz2.LIZIZ;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((Number) it2.next()).intValue() != 10000) {
                        c1212490hep.LIZLLL = true;
                        break;
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
