package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0Y69, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public class C0Y69 implements C0Y6P {
    public final /* synthetic */ C0Y60 LIZ;

    public C0Y69(C0Y60 c0y60) {
        this.LIZ = c0y60;
    }

    public final void LIZ(List<C0Y8T> list) {
        if (this.LIZ.LJIILIIL.LJIIIZ().LJIIL) {
            return;
        }
        ArrayList<C0Y8T> arrayList = (ArrayList) list;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (C0Y8T c0y8t : arrayList) {
                if (((ConcurrentHashMap) this.LIZ.LIZ).get(c0y8t.getConversationId()) == null) {
                    arrayList2.add(c0y8t);
                }
            }
            this.LIZ.LJLJJL(arrayList2);
            if (!((CopyOnWriteArraySet) this.LIZ.LJFF).isEmpty()) {
                C787080UuA.LIZIZ(new Runnable() { // from class: X.0Y68
                    public final void LIZ() {
                        this.LL.LIZ.LJIILIIL.LIZLLL().LJIIJJI("ConversationListModel onFiltered onCallback IConversationListObserver");
                        Iterator it2 = ((CopyOnWriteArraySet) this.LL.LIZ.LJFF).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC867280Y0o) it2.next()).LLLIZZ(this.LL.LIZ.LIZ);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("DefaultConversationListModel@a5c5.<field>$1$onFiltered$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("DefaultConversationListModel@a5c5.<field>$1$onFiltered$1");
                    }
                });
            }
        }
    }
}
