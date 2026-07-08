package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YLU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YLU {
    public final CopyOnWriteArrayList<C0YXB> LIZ = new CopyOnWriteArrayList<>();

    public final void LIZ(Function1<? super C0YXB, Unit> function1) {
        Iterator<C0YXB> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }
}
