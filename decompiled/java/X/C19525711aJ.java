package X;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.11aJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19525711aJ extends AbstractC19524811aA<Pair<? extends Set<InterfaceC19526611aS>, ? extends Set<InterfaceC19526611aS>>> {
    public final Map<String, Pair<Set<InterfaceC19526611aS>, Set<InterfaceC19526611aS>>> LIZIZ;

    public C19525711aJ(Map<String, Pair<Set<InterfaceC19526611aS>, Set<InterfaceC19526611aS>>> map) {
        super(map);
        this.LIZIZ = map;
    }

    @Override // X.AbstractC19524811aA
    public final void LIZ(InterfaceC19526611aS interfaceC19526611aS, C19525911aL c19525911aL) {
        Pair<Set<InterfaceC19526611aS>, Set<InterfaceC19526611aS>> pair = this.LIZIZ.get(c19525911aL.LIZ);
        if (pair == null) {
            pair = new Pair<>(new LinkedHashSet(), new LinkedHashSet());
            this.LIZIZ.put(c19525911aL.LIZ, pair);
        }
        pair.getFirst().add(interfaceC19526611aS);
        if (c19525911aL.LJI) {
            pair.getSecond().add(interfaceC19526611aS);
        }
    }
}
