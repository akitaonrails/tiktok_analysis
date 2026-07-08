package X;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0vwo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761800vwo implements InterfaceC1763180vz2 {
    public final List<InterfaceC1763180vz2> LL = new ArrayList();

    @Override // X.InterfaceC1763180vz2
    public final void LJIIJJI(RectF rectF, int i) {
        Iterator<InterfaceC1763180vz2> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIJJI(rectF, i);
        }
    }
}
