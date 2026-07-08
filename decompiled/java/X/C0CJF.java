package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CJF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CJF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0CJE LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CJF(C0CJE c0cje, String str, long j) {
        super(0);
        this.LL = c0cje;
        this.LLILLJJLI = str;
        this.LLILLL = j;
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
        String str = this.LLILLJJLI;
        long j = this.LLILLL;
        ConcurrentHashMap<String, Object> concurrentHashMap3 = concurrentHashMap2;
        if (concurrentHashMap3.get(str) == null) {
            concurrentHashMap3.put(str, Long.valueOf(j));
        }
        return Unit.LIZ;
    }
}
