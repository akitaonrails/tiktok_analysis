package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882740z5s extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1882760z5u LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Object LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882740z5s(C1882760z5u c1882760z5u, String str, Object obj) {
        super(0);
        this.LL = c1882760z5u;
        this.LLILLJJLI = str;
        this.LLILLL = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ConcurrentHashMap<InterfaceC1882750z5t, CopyOnWriteArraySet<String>> concurrentHashMapLIZ = this.LL.LIZ();
        String str = this.LLILLJJLI;
        Object obj = this.LLILLL;
        for (Map.Entry<InterfaceC1882750z5t, CopyOnWriteArraySet<String>> entry : concurrentHashMapLIZ.entrySet()) {
            if (entry.getValue().contains(str)) {
                entry.getKey().y60(obj, str);
            }
        }
        Iterator it2 = ((CopyOnWriteArraySet) this.LL.LIZIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1882710z5p) it2.next()).onEvent();
        }
        return Unit.LIZ;
    }
}
