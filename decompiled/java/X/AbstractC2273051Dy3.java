package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1Dy3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2273051Dy3 {
    public List<InterfaceC2273061Dy4> LIZ;

    public abstract void LIZ();

    public abstract void LIZLLL(View view, View view2);

    public final void LIZIZ() {
        List<InterfaceC2273061Dy4> list = this.LIZ;
        if (list != null) {
            Iterator<InterfaceC2273061Dy4> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        }
    }

    public final void LIZJ() {
        List<InterfaceC2273061Dy4> list = this.LIZ;
        if (list != null) {
            Iterator<InterfaceC2273061Dy4> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ();
            }
        }
    }
}
