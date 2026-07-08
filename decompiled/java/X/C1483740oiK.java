package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oiK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483740oiK implements InterfaceC1483860oiW {
    public final List<InterfaceC1483880oiY> LIZ = new CopyOnWriteArrayList();

    @Override // X.InterfaceC1483860oiW
    public final void LIZ(InterfaceC1483880oiY interfaceC1483880oiY) {
        if (!((CopyOnWriteArrayList) this.LIZ).contains(interfaceC1483880oiY)) {
            return;
        }
        ((CopyOnWriteArrayList) this.LIZ).remove(interfaceC1483880oiY);
    }

    @Override // X.InterfaceC1483860oiW
    public final void LIZIZ(InterfaceC1483880oiY interfaceC1483880oiY) {
        if (((CopyOnWriteArrayList) this.LIZ).contains(interfaceC1483880oiY)) {
            return;
        }
        ((CopyOnWriteArrayList) this.LIZ).add(interfaceC1483880oiY);
    }

    @Override // X.InterfaceC1483860oiW
    public final void LIZJ(InterfaceC1483880oiY interfaceC1483880oiY, InterfaceC1023860cka interfaceC1023860cka) {
        for (InterfaceC1483880oiY interfaceC1483880oiY2 : (CopyOnWriteArrayList) this.LIZ) {
            if (!interfaceC1483880oiY2.equals(interfaceC1483880oiY)) {
                interfaceC1483880oiY2.LJI(interfaceC1023860cka);
            }
        }
    }
}
