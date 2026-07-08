package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0dQV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049850dQV implements InterfaceC1049750dQL {
    public final List<InterfaceC1049880dQY> LIZ = new CopyOnWriteArrayList();

    @Override // X.InterfaceC1049750dQL
    public final void LIZ(InterfaceC1049880dQY interfaceC1049880dQY) {
        ((CopyOnWriteArrayList) this.LIZ).add(interfaceC1049880dQY);
    }

    @Override // X.InterfaceC1049750dQL
    public final void LIZIZ(String str) {
        if (((CopyOnWriteArrayList) this.LIZ).isEmpty()) {
            return;
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1049880dQY) it2.next()).LIZJ();
        }
    }
}
