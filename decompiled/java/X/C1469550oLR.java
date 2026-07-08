package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oLR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469550oLR extends C1469530oLP<InterfaceC1467760oIY> implements InterfaceC1467760oIY {
    @Override // X.InterfaceC1467760oIY
    public final boolean LJJIIZI(C1470240oMY c1470240oMY) {
        for (Object obj : (CopyOnWriteArrayList) this.LL) {
            if (obj != null) {
                ((InterfaceC1467760oIY) obj).LJJIIZI(c1470240oMY);
            }
        }
        return false;
    }
}
