package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pUA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513400pUA<T> {
    public final CopyOnWriteArrayList<T> LIZ = new CopyOnWriteArrayList<>();

    public final void LIZ(Function1<? super T, Unit> function1) {
        Iterator<T> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }
}
