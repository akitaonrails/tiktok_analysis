package X;

import java.util.List;

/* JADX INFO: renamed from: X.0hQa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1203660hQa implements InterfaceC1193590hAL {
    public C588480N6g LIZ;

    @Override // X.InterfaceC1193590hAL
    public final void LJL() {
        this.LIZ = null;
    }

    @Override // X.InterfaceC1193590hAL
    public final void LIZ(C588480N6g c588480N6g) {
        this.LIZ = c588480N6g;
    }

    public final void LIZIZ(List<? extends InterfaceC1203630hQX> list) {
        C588500N6i c588500N6i = new C588500N6i(C13BV.INSTANCE, list);
        C588480N6g c588480N6g = this.LIZ;
        if (c588480N6g != null) {
            c588480N6g.LIZ(c588500N6i);
        }
    }
}
