package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0oHm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467280oHm implements InterfaceC1470930oNf, InterfaceC1470920oNe, InterfaceC1467800oIc, InterfaceC1470900oNc, InterfaceC1470910oNd, InterfaceC1467810oId, InterfaceC1470110oML, InterfaceC1467820oIe {
    public final WeakReference<AbstractC1467000oHK> LIZ;

    public C1467280oHm(AbstractC1467000oHK abstractC1467000oHK) {
        this.LIZ = new WeakReference<>(abstractC1467000oHK);
    }

    @Override // X.InterfaceC1470900oNc
    public final void LIZ(InterfaceC1470080oMI interfaceC1470080oMI) {
        AbstractC1467000oHK abstractC1467000oHK = this.LIZ.get();
        if (abstractC1467000oHK == null) {
            return;
        }
        abstractC1467000oHK.LJJIZ(interfaceC1470080oMI);
    }

    @Override // X.InterfaceC1470930oNf
    public final void LIZJ(InterfaceC1470080oMI interfaceC1470080oMI) {
        AbstractC1467000oHK abstractC1467000oHK = this.LIZ.get();
        if (abstractC1467000oHK == null) {
            return;
        }
        abstractC1467000oHK.LJJJIL(interfaceC1470080oMI);
    }

    @Override // X.InterfaceC1470920oNe
    public final boolean LIZIZ(InterfaceC1470080oMI interfaceC1470080oMI, int i, int i2) {
        AbstractC1467000oHK abstractC1467000oHK = this.LIZ.get();
        if (abstractC1467000oHK == null) {
            return false;
        }
        abstractC1467000oHK.LJJJI(interfaceC1470080oMI, i, i2);
        return false;
    }

    @Override // X.InterfaceC1470910oNd
    public final boolean LIZLLL(InterfaceC1470080oMI interfaceC1470080oMI, int i, int i2) {
        AbstractC1467000oHK abstractC1467000oHK = this.LIZ.get();
        if (abstractC1467000oHK == null) {
            return false;
        }
        return abstractC1467000oHK.LJJJ(interfaceC1470080oMI, i, i2);
    }

    @Override // X.InterfaceC1470110oML
    public final void LJ(InterfaceC1470080oMI interfaceC1470080oMI, int i, int i2) {
        AbstractC1467000oHK abstractC1467000oHK = this.LIZ.get();
        if (abstractC1467000oHK == null) {
            return;
        }
        abstractC1467000oHK.LJJJJIZL(i, i2);
    }
}
