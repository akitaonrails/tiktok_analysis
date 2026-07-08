package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ref, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C701030Ref {
    public C701030Ref LIZ;
    public final List<C701030Ref> LIZIZ = new ArrayList();

    public final synchronized int LIZIZ() {
        return ((ArrayList) this.LIZIZ).size();
    }

    public final synchronized C701030Ref LIZ(Function1<? super C701030Ref, Boolean> function1) {
        Object next;
        Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (function1.invoke(next).booleanValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (C701030Ref) next;
    }

    public final synchronized <R> List<R> LIZJ(Function1<? super C701030Ref, ? extends R> function1) {
        ArrayList arrayList;
        List<C701030Ref> list = this.LIZIZ;
        arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            R rInvoke = function1.invoke(it2.next());
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }
}
