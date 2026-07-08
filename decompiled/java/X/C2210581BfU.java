package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.1BfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210581BfU {
    public final CopyOnWriteArraySet<InterfaceC2211191BgT> LIZ = new CopyOnWriteArraySet<>();

    public final void LIZ(String str, String str2) {
        Iterator<InterfaceC2211191BgT> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }
}
