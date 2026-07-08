package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CJC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CJC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0CJE LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CJC(C0CKZ c0ckz, String str) {
        super(0);
        this.LL = c0ckz;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ConcurrentHashMap<String, Object> concurrentHashMapPutIfAbsent;
        C0CJE c0cje = this.LL;
        ConcurrentHashMap<String, ConcurrentHashMap<String, Object>> concurrentHashMap = c0cje.LIZ;
        String strLIZIZ = c0cje.LIZIZ();
        ConcurrentHashMap<String, Object> concurrentHashMap2 = concurrentHashMap.get(strLIZIZ);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZIZ, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        C0CJE c0cje2 = this.LL;
        String str = this.LLILLJJLI;
        ConcurrentHashMap<String, Object> concurrentHashMap3 = concurrentHashMap2;
        if (c0cje2.LIZIZ.containsKey(str) && concurrentHashMap3.get(str) == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l = c0cje2.LIZIZ.get(str);
            concurrentHashMap3.put(str, Long.valueOf(jCurrentTimeMillis - (l != null ? l.longValue() : 0L)));
        }
        return Unit.LIZ;
    }
}
