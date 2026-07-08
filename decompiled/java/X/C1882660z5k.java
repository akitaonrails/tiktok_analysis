package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882660z5k extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C262100zr LL;
    public final /* synthetic */ C1881280z3W LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882660z5k(C262100zr c262100zr, C1881280z3W c1881280z3W) {
        super(0);
        this.LL = c262100zr;
        this.LLILLJJLI = c1881280z3W;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ConcurrentHashMap concurrentHashMapLIZ = C1882650z5j.LIZ();
        C262100zr c262100zr = this.LL;
        C1881280z3W c1881280z3W = this.LLILLJJLI;
        for (Map.Entry entry : concurrentHashMapLIZ.entrySet()) {
            if (((CopyOnWriteArraySet) entry.getValue()).contains(c262100zr.LIZ)) {
                ((InterfaceC1882630z5h) entry.getKey()).LJIJJLI(c262100zr.LIZ, c1881280z3W);
            }
        }
        CopyOnWriteArraySet<InterfaceC1882710z5p> copyOnWriteArraySet = (CopyOnWriteArraySet) C1882650z5j.LLILZ.getValue();
        C262100zr c262100zr2 = this.LL;
        for (InterfaceC1882710z5p interfaceC1882710z5p : copyOnWriteArraySet) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr2.LIZIZ;
            if (interfaceC1107590evd != null) {
                interfaceC1107590evd.LIZ();
            }
            interfaceC1882710z5p.onEvent();
        }
        return Unit.LIZ;
    }
}
