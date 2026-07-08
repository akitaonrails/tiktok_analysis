package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: renamed from: X.08LB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LB extends C09AY implements Function0<Set<String>> {
    public final /* synthetic */ C1648406cs LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08LB(C1648406cs c1648406cs) {
        super(0);
        this.LL = c1648406cs;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<String> invoke() {
        C08LY c08ly = new C08LY(C09RB.LJJI(C09RB.LJIIIZ(C09RB.LJIJI(new C08LY(new C1939607ik(((LinkedHashMap) this.LL.LIZ).values()), AFwS248S0000000_14.get$arr$(537)), AFwS229S0000000_2.get$arr$(881)), AFwS231S0000000_3.get$arr$(260)), 3), AFwS231S0000000_3.get$arr$(261));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = c08ly.iterator();
        while (true) {
            C08LX c08lx = (C08LX) it2;
            if (!c08lx.hasNext()) {
                return linkedHashSet;
            }
            linkedHashSet.add(c08lx.next());
        }
    }
}
