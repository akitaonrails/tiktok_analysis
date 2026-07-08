package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09B9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09B9<T> implements InterfaceC1478005qU {
    public final /* synthetic */ C09BB LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Map<String, String> LIZJ;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super T>, Object> LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C09B9(C09BB c09bb, String str, Map<String, String> map, Function1<? super InterfaceC1364105Vn<? super T>, ? extends Object> function1) {
        this.LIZ = c09bb;
        this.LIZIZ = str;
        this.LIZJ = map;
        this.LIZLLL = function1;
    }

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<T> c09aj) {
        C1C7U.LIZ("CoroutineToRxAdapter@82b6.requestWithRetryAsObservable$1");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C09BB c09bb = this.LIZ;
        final AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(c09bb.LIZ.LIZIZ, null, null, new C09B8(c09bb, this.LIZIZ, this.LIZJ, this.LIZLLL, atomicBoolean, c09aj, null), 3);
        c09aj.setCancellable(new C11KX() { // from class: X.09BA
            @Override // X.C11KX
            public final void cancel() {
                anonymousClass0956LIZLLL.LIZIZ(null);
            }
        });
        C1C7U.LIZIZ("CoroutineToRxAdapter@82b6.requestWithRetryAsObservable$1");
    }
}
