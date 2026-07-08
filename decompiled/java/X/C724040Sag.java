package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Sag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724040Sag {
    public static final void LIZ(List<? extends InterfaceC724070Saj> list, Function1<? super InterfaceC724070Saj, Unit> function1) {
        Iterator<? extends InterfaceC724070Saj> it2 = list.iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }
}
