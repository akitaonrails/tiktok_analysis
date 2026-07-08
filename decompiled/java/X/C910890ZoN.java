package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ZoN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C910890ZoN implements InterfaceC911200Zos {
    public final C901890ZZr LIZ;
    public boolean LIZIZ;

    public final void LIZIZ() {
        this.LIZ.LJIILL();
        this.LIZIZ = false;
    }

    public C910890ZoN(C901890ZZr c901890ZZr) {
        this.LIZ = c901890ZZr;
    }

    public final void LIZ(InterfaceC911160Zoo interfaceC911160Zoo, List<? extends Object> list) {
        C911140Zom c911140Zom;
        if (!this.LIZIZ) {
            this.LIZ.LJIILJJIL();
            this.LIZIZ = true;
        }
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                    if (!(obj2 instanceof C911140Zom) || (c911140Zom = (C911140Zom) obj2) == null || (!c911140Zom.LIZJ && !c911140Zom.LIZ)) {
                    }
                }
                return;
            }
            return;
        }
        if (interfaceC911160Zoo.getMsgStatus() == 0) {
            this.LIZ.onProgress(C912070ZqH.LIZIZ.LJIILIIL().LJIIIZ().LJIIJ(interfaceC911160Zoo.getUuid()));
        } else {
            if (interfaceC911160Zoo.getMsgStatus() != 1) {
                return;
            }
            this.LIZ.onProgress(99);
        }
    }
}
