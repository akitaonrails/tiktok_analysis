package X;

import java.util.List;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11f4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19555211f4 implements InterfaceC19549811eC {
    public boolean LIZ;
    public final C01GW LIZIZ;

    @Override // X.InterfaceC19549811eC
    public final void LIZJ() {
        LJ().LIZJ(new InterfaceC1485110okX() { // from class: X.11eF
            @Override // X.InterfaceC1485110okX
            public final void LIZ(int i, int i2) {
            }
        });
    }

    public final C20498815Ja LJ() {
        return (C20498815Ja) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC19549811eC
    public final void LJIILLIIL() {
        LJ().resume();
    }

    @Override // X.InterfaceC19549811eC
    public final boolean isPlaying() {
        return LJ().isPlaying();
    }

    @Override // X.InterfaceC19549811eC
    public final void pause() {
        LJ().pause();
    }

    @Override // X.InterfaceC19549811eC
    public final void release() {
        LJ().release();
        this.LIZ = true;
    }

    @Override // X.InterfaceC19549811eC
    public final void stop() {
        LJ().stop();
    }

    @Override // X.InterfaceC19549811eC
    public final boolean LJII() {
        return this.LIZ;
    }

    public C19555211f4(C19550811eM c19550811eM) {
        this.LIZIZ = C452501pT.LIZIZ(new AwS573S0100000_29(c19550811eM, 1071));
    }

    @Override // X.InterfaceC19549811eC
    public final void LIZIZ(C19550211eG c19550211eG) {
        C1485060okS c1485060okS = new C1485060okS();
        c1485060okS.LJI = c19550211eG.LIZIZ;
        List<String> list = c19550211eG.LIZ;
        if (list != null) {
            c1485060okS.LIZIZ = list;
        }
        LJ().LIZIZ(c1485060okS);
        this.LIZ = false;
    }
}
