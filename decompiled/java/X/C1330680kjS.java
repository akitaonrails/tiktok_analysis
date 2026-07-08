package X;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0kjS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330680kjS implements InterfaceC1328250kfX {
    public static C1330680kjS LIZIZ;
    public final Set<InterfaceC1330800kje> LIZ = new CopyOnWriteArraySet();

    @Override // X.InterfaceC1328250kfX
    public final void LIZ(InterfaceC1330800kje interfaceC1330800kje) {
        if (interfaceC1330800kje != null) {
            ((CopyOnWriteArraySet) this.LIZ).add(interfaceC1330800kje);
        }
    }
}
