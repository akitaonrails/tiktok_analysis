package X;

import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: X.1DRJ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DRJ implements InterfaceC1153404fE {
    public final InterfaceC1153404fE LIZ;
    public C1DRJ LIZIZ;

    public C1DRJ(InterfaceC1153404fE interfaceC1153404fE) {
        this.LIZ = interfaceC1153404fE;
    }

    @Override // X.InterfaceC1153404fE
    public final void LIZ(List<? extends Type> list) {
        this.LIZ.LIZ(list);
        C1DRJ c1drj = this.LIZIZ;
        if (c1drj != null) {
            c1drj.LIZ(list);
        }
    }
}
