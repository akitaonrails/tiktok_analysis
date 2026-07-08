package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ksz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1336590ksz implements InterfaceC1335750krd {
    public final List<C1336600kt0> LIZ = new ArrayList();

    @Override // X.InterfaceC1335750krd
    public final void LIZ(File file) {
    }

    @Override // X.InterfaceC1335750krd
    public final void LIZJ(File file) {
    }

    @Override // X.InterfaceC1335750krd
    public final void LIZIZ(File file) {
        C1336600kt0 c1336600kt0 = new C1336600kt0();
        c1336600kt0.LIZ = file.lastModified();
        c1336600kt0.LIZIZ = file.length();
        c1336600kt0.LIZJ = file.getAbsolutePath();
        ((ArrayList) this.LIZ).add(c1336600kt0);
    }
}
