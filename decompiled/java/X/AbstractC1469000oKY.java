package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0oKY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1469000oKY implements InterfaceC1469660oLc {
    public InterfaceC1467950oIr LIZ;
    public final Map<String, Object> LIZIZ = new HashMap();
    public InterfaceC1470660oNE LIZJ;

    @Override // X.InterfaceC1469660oLc
    public InterfaceC1467950oIr LJFF() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1469660oLc
    public final Map<String, Object> getLogInfo() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1469660oLc
    public final void LJI(InterfaceC1470660oNE interfaceC1470660oNE) {
        this.LIZJ = interfaceC1470660oNE;
    }

    @Override // X.InterfaceC1469660oLc
    public final void LJIIIIZZ(InterfaceC1467950oIr interfaceC1467950oIr) {
        this.LIZ = interfaceC1467950oIr;
    }

    @Override // X.InterfaceC1469660oLc
    public final void LJII(Object obj, String str) {
        ((HashMap) this.LIZIZ).put(str, obj);
    }
}
