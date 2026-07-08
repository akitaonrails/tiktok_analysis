package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* JADX INFO: renamed from: X.0oUW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475180oUW implements InterfaceC1479880oc6<C1476830oXB> {
    public final /* synthetic */ SimVideoUrlModel LIZ;
    public final /* synthetic */ InterfaceC1476900oXI LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ boolean LIZLLL;

    @Override // X.InterfaceC1479880oc6
    public final /* synthetic */ C1476830oXB LIZ() {
        return null;
    }

    @Override // X.InterfaceC1479880oc6
    public final C1476830oXB get() {
        C1475330oUl c1475330oUl = new C1475330oUl();
        c1475330oUl.LIZ = this.LIZ;
        c1475330oUl.LIZLLL = this.LIZIZ;
        c1475330oUl.LIZIZ = this.LIZJ;
        c1475330oUl.LIZJ = this.LIZLLL;
        return C607330Nrv.LIZ.LIZ().createVideoUrlProcessor().LJFF(c1475330oUl);
    }

    public C1475180oUW(SimVideoUrlModel simVideoUrlModel, InterfaceC1476900oXI interfaceC1476900oXI, boolean z, boolean z2) {
        this.LIZ = simVideoUrlModel;
        this.LIZIZ = interfaceC1476900oXI;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
