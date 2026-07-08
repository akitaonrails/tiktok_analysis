package X;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C696860RVc extends C09AY implements Function1<C696930RVj<Object>, C696930RVj<Object>> {
    public final /* synthetic */ List<Function1<C696930RVj<Object>, C696930RVj<Object>>> LL;
    public final /* synthetic */ C696840RVa LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C696860RVc(List<Function1<C696930RVj<Object>, C696930RVj<Object>>> list, C696840RVa c696840RVa) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = c696840RVa;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C696930RVj<Object> invoke(C696930RVj<Object> c696930RVj) {
        C696930RVj<Object> c696930RVjInvoke = c696930RVj;
        List<Function1<C696930RVj<Object>, C696930RVj<Object>>> list = this.LL;
        if (!list.isEmpty()) {
            ListIterator<Function1<C696930RVj<Object>, C696930RVj<Object>>> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                c696930RVjInvoke = listIterator.previous().invoke(c696930RVjInvoke);
            }
        }
        C696930RVj<Object> c696930RVj2 = c696930RVjInvoke;
        this.LLILLJJLI.LIZ = c696930RVj2;
        return c696930RVj2;
    }
}
