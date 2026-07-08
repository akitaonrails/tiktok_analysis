package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1ARU, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ARU<Element> {
    public final CopyOnWriteArrayList<Element> LIZ = new CopyOnWriteArrayList<>();

    public final void LIZ(Element element) {
        if (!this.LIZ.contains(element)) {
            this.LIZ.add(element);
        }
    }

    public final void LIZIZ(final Function1<? super Element, Unit> function1) {
        C1ARW<Element> c1arw = new C1ARW<Element>() { // from class: X.1ARV
            @Override // X.C1ARW
            public final void LIZ(Element element) {
                function1.invoke(element);
            }
        };
        Iterator<Element> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                c1arw.LIZ(it2.next());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
