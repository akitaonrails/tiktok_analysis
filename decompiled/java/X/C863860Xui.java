package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Xui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C863860Xui {
    public final List<Long> LL = new ArrayList();

    public final void LIZ(C870860YEi c870860YEi) {
        ArrayList arrayList = new ArrayList(this.LL);
        ((ArrayList) this.LL).clear();
        Iterator<InterfaceC864610Xvv> it2 = c870860YEi.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ().LIZLLL(arrayList);
        }
    }
}
