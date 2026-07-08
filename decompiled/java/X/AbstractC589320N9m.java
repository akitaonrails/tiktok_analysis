package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0N9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC589320N9m {
    public InterfaceC589340N9o LIZ;
    public final Map<String, Object> LIZIZ = new HashMap();
    public final C589330N9n LIZJ = new InterfaceC589350N9p() { // from class: X.0N9n
        @Override // X.InterfaceC589350N9p
        public final void onEvent(C589280N9i c589280N9i) {
            this.LIZ.LJ(c589280N9i);
        }
    };

    public abstract String LIZIZ();

    public List<String> LIZJ() {
        return null;
    }

    public void LIZLLL(C00ET c00et) {
    }

    public void LJ(C589280N9i c589280N9i) {
    }

    public final void LIZ() {
        InterfaceC589340N9o interfaceC589340N9o = this.LIZ;
        LIZIZ();
        interfaceC589340N9o.LIZ();
    }

    public final void LJFF(Object obj, String str) {
        ((HashMap) this.LIZIZ).put(str, obj);
    }
}
