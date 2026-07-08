package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0MtO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C582760MtO extends AbstractC1023200cjW {
    public final C623440Oco LJI = C623440Oco.LIZIZ;
    public String LJII = "undefined";
    public final ConcurrentHashMap<String, WeakReference<InterfaceC1023190cjV>> LJIIIIZZ = new ConcurrentHashMap<>();

    public final InterfaceC1023190cjV LIZLLL() {
        InterfaceC1023190cjV interfaceC1023190cjV;
        WeakReference<InterfaceC1023190cjV> weakReference = this.LJIIIIZZ.get(this.LJII);
        if (weakReference == null || (interfaceC1023190cjV = weakReference.get()) == null) {
            Iterator<T> it2 = this.LJIIIIZZ.values().iterator();
            while (it2.hasNext()) {
                interfaceC1023190cjV = (InterfaceC1023190cjV) ((Reference) it2.next()).get();
                if (interfaceC1023190cjV != null) {
                }
            }
            return null;
        }
        return interfaceC1023190cjV;
    }

    @Override // X.AbstractC1023200cjW
    public final /* bridge */ /* synthetic */ AbstractC1023090cjL LIZ() {
        return this.LJI;
    }
}
