package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0d7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038280d7q implements InterfaceC1038370d7z {
    public final List<InterfaceC1038370d7z> LIZ;

    @Override // X.InterfaceC1038370d7z
    public final boolean LIZ() {
        Iterator<InterfaceC1038370d7z> it2 = this.LIZ.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (it2.next().LIZ()) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.InterfaceC1038370d7z
    public final void LIZIZ() {
        Iterator<InterfaceC1038370d7z> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1038280d7q(List<? extends InterfaceC1038370d7z> list) {
        this.LIZ = list;
    }
}
