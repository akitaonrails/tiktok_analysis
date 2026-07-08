package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0HQZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HQZ implements InterfaceC440740HQa {
    public final List<InterfaceC440740HQa> LIZ = new ArrayList();

    @Override // X.InterfaceC440740HQa
    public final void LIZ(View view, float f) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC440740HQa) it2.next()).LIZ(view, f);
        }
    }
}
