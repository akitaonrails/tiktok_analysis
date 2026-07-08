package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CJB, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CJB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0CJE LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Object LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CJB(C0CJE c0cje, String str, Object obj) {
        super(0);
        this.LL = c0cje;
        this.LLILLJJLI = str;
        this.LLILLL = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String string;
        ConcurrentHashMap<String, Object> concurrentHashMapPutIfAbsent;
        C0CJE c0cje = this.LL;
        ConcurrentHashMap<String, ConcurrentHashMap<String, Object>> concurrentHashMap = c0cje.LIZ;
        String strLIZIZ = c0cje.LIZIZ();
        ConcurrentHashMap<String, Object> concurrentHashMap2 = concurrentHashMap.get(strLIZIZ);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZIZ, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        String str = this.LLILLJJLI;
        Object obj = this.LLILLL;
        ConcurrentHashMap<String, Object> concurrentHashMap3 = concurrentHashMap2;
        if (obj == null || (string = obj.toString()) == null) {
            string = "";
        }
        concurrentHashMap3.put(str, string);
        return Unit.LIZ;
    }
}
