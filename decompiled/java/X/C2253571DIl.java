package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1DIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253571DIl {
    public final CopyOnWriteArrayList<InterfaceC2253641DIs> LIZ = new CopyOnWriteArrayList<>();

    public final void onEvent(AbstractC2253581DIm abstractC2253581DIm) {
        Iterator<InterfaceC2253641DIs> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onEvent(abstractC2253581DIm);
        }
    }
}
