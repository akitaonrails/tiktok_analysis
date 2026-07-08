package X;

import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: renamed from: X.0VFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794660VFg {
    public Deque<InterfaceC794700VFk> LIZ;
    public Map<String, InterfaceC794700VFk> LIZIZ;
    public InterfaceC794700VFk LIZJ;

    public final void LIZ() {
        ((LinkedList) this.LIZ).clear();
        ((LinkedHashMap) this.LIZIZ).clear();
        this.LIZJ = null;
    }

    public final void LIZIZ(C794740VFo c794740VFo) {
        if (this.LIZJ == null) {
            this.LIZJ = c794740VFo;
        } else if (!this.LIZ.isEmpty()) {
            String strLJIJI = ((InterfaceC794700VFk) ((LinkedList) this.LIZ).peek()).LJIJI();
            c794740VFo.LIZLLL = strLJIJI;
            InterfaceC794700VFk interfaceC794700VFk = (InterfaceC794700VFk) ((LinkedHashMap) this.LIZIZ).get(strLJIJI);
            if (interfaceC794700VFk != null) {
                c794740VFo.LJ = interfaceC794700VFk.LJIJI();
            }
            this.LIZIZ.put(strLJIJI, c794740VFo);
        } else {
            c794740VFo.LJ = this.LIZJ.LJIJI();
        }
        ((LinkedList) this.LIZ).push(c794740VFo);
    }
}
