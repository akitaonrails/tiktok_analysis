package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bFR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966110bFR extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C965980bFE LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966110bFR(C965980bFE c965980bFE) {
        super(0);
        this.LL = c965980bFE;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL.LLILLJJLI.LIZ(false, true)) {
            Iterator it2 = ((ConcurrentHashMap) this.LL.LLILLL).entrySet().iterator();
            while (it2.hasNext()) {
                ((C966570bGB) ((Map.Entry) it2.next()).getValue()).LIZLLL.LIZ(false, true);
            }
            ((ConcurrentHashMap) this.LL.LLILLL).clear();
            ((ConcurrentHashMap) this.LL.LLILZ).clear();
        }
        return Unit.LIZ;
    }
}
