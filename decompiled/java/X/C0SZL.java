package X;

import X.C0SMO;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS54S0001000_11;

/* JADX INFO: renamed from: X.0SZL, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0SZL<R extends C0SMO<R, ITEM>, ITEM> implements C0RF2<R, ITEM> {
    public final ConcurrentHashMap<String, C0SZS<R, ITEM>> LIZ = new ConcurrentHashMap<>();

    public abstract String LIZLLL(ITEM item);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0RF2
    public final void LIZIZ(InterfaceC1587906Jp interfaceC1587906Jp, C0SMO<?, ?> c0smo, int i, List<? extends Object> list) {
        String strLIZLLL = LIZLLL(interfaceC1587906Jp);
        C0SZS<R, ITEM> c0szs = this.LIZ.get(strLIZLLL);
        if (c0szs == null) {
            C0SZU child = c0smo.getChild();
            if (!(child instanceof C0SZU)) {
                child = null;
            }
            c0szs = new C0SZS<>(C13LE.LIZ(c0smo.getClass()), child, null);
            this.LIZ.put(strLIZLLL, c0szs);
        }
        C0SZS<R, ?> proxy = c0smo.getProxy();
        if (proxy != 0) {
            proxy.LIZIZ();
        }
        c0szs.LIZ(i, c0smo, interfaceC1587906Jp, list, new AwS377S0200000_11(c0szs, i, list, 12), new AwS54S0001000_11(i, 0));
    }
}
