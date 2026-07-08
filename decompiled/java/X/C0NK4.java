package X;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0NK4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NK4<S> {
    public final C2252321DDq LIZ;
    public final C2252321DDq LIZIZ;
    public final C1DEK LIZJ;
    public final C0NK5<S> LIZLLL;
    public final C054G LJ;

    public final void LIZ() {
        C0NK5<S> c0nk5 = this.LIZLLL;
        synchronized (c0nk5) {
            if (c0nk5.LIZIZ.isEmpty()) {
                return;
            }
            LinkedList<Function1<S, S>> linkedList = c0nk5.LIZIZ;
            c0nk5.LIZIZ = new LinkedList<>();
            if (linkedList != null) {
                Object value = this.LIZ.getValue();
                Iterator<Function1<S, S>> it2 = linkedList.iterator();
                while (it2.hasNext()) {
                    value = it2.next().invoke(value);
                }
                this.LIZ.setValue(value);
            }
        }
    }

    public C0NK4(InterfaceC0148002o interfaceC0148002o, Executor executor) {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(interfaceC0148002o);
        this.LIZ = c2252321DDqLIZ;
        this.LIZIZ = c2252321DDqLIZ;
        this.LIZJ = C095G.LIZ(-1, null, 6);
        this.LIZLLL = new C0NK5<>();
        C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C2182901Abw.LIZIZ(executor)).plus(new C639070P4v(CoroutineExceptionHandler.LJJLIL, this, 3)));
        this.LJ = c054gLIZ;
        C23250099c.LIZLLL(c054gLIZ, null, null, new C0NK3(this, null), 3);
    }
}
