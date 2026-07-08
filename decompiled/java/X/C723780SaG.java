package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0SaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723780SaG {
    public final /* synthetic */ C723820SaK LIZ;

    public C723780SaG(C723820SaK c723820SaK) {
        this.LIZ = c723820SaK;
    }

    public final void LIZ(List list) {
        ((ArrayList) this.LIZ.LIZLLL).addAll(list);
        if (this.LIZ.LIZIZ.LLILZ.LIZ.get() == 1 || this.LIZ.LIZIZ.LLILZ.LIZ.get() == 2) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((AbstractC738140SxQ) it2.next()).preload();
            }
        }
    }
}
