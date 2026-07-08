package X;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1BUS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BUS extends C2205671BUf {
    public static final C1BUS LLILZ = new C1BUS();

    @Override // X.C2205671BUf
    public final boolean LIZLLL() {
        Iterator<C1BUP> it2 = C21690119ud.LIZJ.LIZ().iterator();
        while (it2.hasNext()) {
            View view = it2.next().LIZLLL.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C2205671BUf
    public final void LIZJ(boolean z) {
        String str;
        Iterator it2 = Collections.unmodifiableCollection(C21690119ud.LIZJ.LIZ).iterator();
        while (it2.hasNext()) {
            C1BUI c1bui = ((C1BUP) it2.next()).LJ;
            if (c1bui.LIZIZ.get() != null) {
                if (z) {
                    str = "foregrounded";
                } else {
                    str = "backgrounded";
                }
                C1287860jcO.LIZ.LIZ(c1bui.LJI(), "setState", str, c1bui.LIZ);
            }
        }
    }
}
