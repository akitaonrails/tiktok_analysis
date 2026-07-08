package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0q75, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537530q75 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1533020pzo LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ WeakReference<C1537480q70> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537530q75(C1533020pzo c1533020pzo, String str, WeakReference<C1537480q70> weakReference) {
        super(0);
        this.LL = c1533020pzo;
        this.LLILLJJLI = str;
        this.LLILLL = weakReference;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1533020pzo c1533020pzo = this.LL;
        String str = this.LLILLJJLI;
        ConcurrentHashMap<C1540860qCS, Boolean> concurrentHashMap = C1540860qCS.LJII;
        Map<C1541070qCn<?, ?>, C1541020qCi> mapLJFF = c1533020pzo.LJFF(str, false);
        C1537480q70 c1537480q70 = this.LLILLL.get();
        if (c1537480q70 != null) {
            for (Map.Entry entry : ((HashMap) mapLJFF).entrySet()) {
                String str2 = ((C1541070qCn) entry.getKey()).LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append("_prefetch_accuracy");
                c1537480q70.LJIIIZ().LIZJ(C2188811AlT.LIZIZ(sbLIZ), Float.valueOf(((C1541020qCi) entry.getValue()).LJIIIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append("_prefetch_released_rate");
                c1537480q70.LJIIIZ().LIZJ(C2188811AlT.LIZIZ(sbLIZ2), Float.valueOf(((C1541020qCi) entry.getValue()).LJIIIIZZ));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str2);
                sbLIZ3.append("_prefetch_count");
                c1537480q70.LJIIIZ().LIZJ(C2188811AlT.LIZIZ(sbLIZ3), Integer.valueOf(((C1541020qCi) entry.getValue()).LIZIZ));
            }
        }
        return Unit.LIZ;
    }
}
