package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0WL8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WL8 {
    public final List<C0WL6> LIZ = new ArrayList();

    public C0WL8(int i) {
    }

    public final void LIZ(Function1<? super C0WL6, Unit> function1) {
        Iterator<C0WL6> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }
}
