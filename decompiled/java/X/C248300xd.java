package X;

import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import java.util.List;

/* JADX INFO: renamed from: X.00xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C248300xd implements InterfaceC960700b6i {
    public final Long LIZ;
    public final InterfaceC246900xP LIZIZ;
    public final InterfaceC950820aqm LIZJ;
    public final int LIZLLL = 12;
    public final C01GW LJ = C292401Bi.LIZ(new C5182020e(this, 184));
    public long LJFF = -1;
    public C11JF LJI;

    @Override // X.InterfaceC960700b6i
    public final void X1() {
        Long l = this.LIZ;
        if (l == null || l.longValue() <= 0 || !((InterfaceC248400xe) this.LJ.getValue()).LJIIJJI() || Z1()) {
            return;
        }
        if (this.LJFF <= 0) {
            LIZ(this.LIZ.longValue(), C158B.LIZJ(), true);
        } else {
            LIZ(this.LIZ.longValue(), this.LJFF, false);
        }
    }

    @Override // X.InterfaceC960700b6i
    public final List<C955670ayb> Y1() {
        return ((InterfaceC248400xe) this.LJ.getValue()).Y1();
    }

    @Override // X.InterfaceC960700b6i
    public final boolean Z1() {
        C11JF c11jf = this.LJI;
        return (c11jf == null || c11jf.isDisposed()) ? false : true;
    }

    @Override // X.InterfaceC960700b6i
    public final void release() {
        C11JF c11jf = this.LJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJI = null;
        this.LJFF = -1L;
        ((InterfaceC248400xe) this.LJ.getValue()).release();
    }

    public C248300xd(Long l, InterfaceC246900xP interfaceC246900xP, C960620b6a c960620b6a) {
        this.LIZ = l;
        this.LIZIZ = interfaceC246900xP;
        this.LIZJ = c960620b6a;
    }

    public final void LIZ(long j, long j2, boolean z) {
        C480460Ism.LIZ().getClass();
        this.LJI = (C11JF) ((CoHostApi) C480460Ism.LIZLLL(CoHostApi.class)).getCoHostHistory(j, j2, this.LIZLLL).LJJLIIIJJIZ(2L).LJIILIIL(new C0UO0()).LJJLL(new C515501zd(this, z, 5), new C515501zd(this, z, 6));
    }
}
