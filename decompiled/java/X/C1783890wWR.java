package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wWR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1783890wWR extends C09AY implements Function1<C1783880wWQ, C1783880wWQ> {
    public final /* synthetic */ Set<Long> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783890wWR(Set<Long> set) {
        super(1);
        this.LL = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1783880wWQ invoke(C1783880wWQ c1783880wWQ) {
        Set<Long> setLLIIII;
        C1783880wWQ c1783880wWQ2 = c1783880wWQ;
        Map<Long, C1780260wQa> map = c1783880wWQ2.LIZ;
        Set<Long> set = this.LL;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Set setKeySet = linkedHashMap.keySet();
        if (set instanceof Collection) {
            setLLIIII = set;
        } else {
            setLLIIII = C13LP.LLIIII(set);
        }
        setKeySet.removeAll(setLLIIII);
        return new C1783880wWQ(C2097608Jq.LJIIJJI(linkedHashMap), C15442062u.LJII(c1783880wWQ2.LIZIZ, this.LL), C15442062u.LJII(c1783880wWQ2.LIZJ, this.LL));
    }
}
