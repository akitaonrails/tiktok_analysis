package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CJD, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CJD extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0CJE LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CJD(C0CKZ c0ckz, String str) {
        super(0);
        this.LL = c0ckz;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0CJE c0cje = this.LL;
        ConcurrentHashMap<String, ConcurrentHashMap<String, Object>> concurrentHashMap = c0cje.LIZ;
        String strLIZIZ = c0cje.LIZIZ();
        if (concurrentHashMap.get(strLIZIZ) == null) {
            concurrentHashMap.putIfAbsent(strLIZIZ, new ConcurrentHashMap<>());
        }
        C0CJE c0cje2 = this.LL;
        c0cje2.LIZIZ.put(this.LLILLJJLI, Long.valueOf(System.currentTimeMillis()));
        return Unit.LIZ;
    }
}
