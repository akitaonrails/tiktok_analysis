package X;

import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.11T5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C11T5<V> extends C11T0<Unit, V> {
    public List<? extends V> LIZIZ;

    @Override // X.C11T0
    public final List<Pair<Unit, List<V>>> LJ() {
        List<Pair<Unit, List<V>>> listSingletonList;
        List<? extends V> list = this.LIZIZ;
        return (list == null || (listSingletonList = Collections.singletonList(new Pair(Unit.LIZ, list))) == null) ? C13BV.INSTANCE : listSingletonList;
    }

    @Override // X.C11T0
    public final List LIZ(Unit unit) {
        return this.LIZIZ;
    }

    @Override // X.C11T0
    public final void LJFF(Unit unit, List list) {
        this.LIZIZ = list;
    }
}
