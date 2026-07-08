package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oLN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469510oLN extends C1469530oLP<InterfaceC1467780oIa> implements InterfaceC1467780oIa {
    @Override // X.InterfaceC1467780oIa
    public final void LJJJIL(C1467470oI5 c1467470oI5) {
        for (Object obj : (CopyOnWriteArrayList) this.LL) {
            if (obj != null) {
                ((InterfaceC1467780oIa) obj).LJJJIL(c1467470oI5);
            }
        }
    }
}
