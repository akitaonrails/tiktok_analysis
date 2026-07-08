package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.146J, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C146J extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C146J(String str) {
        super(0);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (C146K.LJFF && !a0.LJJIIZI(this.LL, "main", false)) {
            ConcurrentHashMap<String, Long> concurrentHashMap = C146K.LIZJ;
            if (concurrentHashMap.containsKey(this.LL)) {
                Long l = concurrentHashMap.get(this.LL);
                if (l == null || l.longValue() != 0) {
                    Long l2 = concurrentHashMap.get(this.LL);
                    if ((l2 != null ? l2.longValue() : 0L) >= C146K.LIZLLL) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Long l3 = concurrentHashMap.get(this.LL);
                        C146K.LIZIZ += jCurrentTimeMillis - (l3 != null ? l3.longValue() : 0L);
                    } else {
                        C146K.LIZIZ += System.currentTimeMillis() - C146K.LIZLLL;
                    }
                }
            }
        }
        C146K.LIZJ.remove(this.LL);
        return Unit.LIZ;
    }
}
