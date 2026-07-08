package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tKN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661090tKN implements InterfaceC1661080tKM {
    public InterfaceC1661080tKM LIZ;
    public Effect LIZIZ;
    public boolean LIZJ;
    public C1661050tKJ LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public C1661050tKJ LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public Effect LJIIIZ;
    public Long LJIIJ = 0L;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public String LJIILIIL;
    public Effect LJIILJJIL;
    public boolean LJIILL;
    public Effect LJIILLIIL;

    public C1661090tKN(InterfaceC1661080tKM interfaceC1661080tKM) {
        this.LIZ = interfaceC1661080tKM;
    }

    @Override // X.InterfaceC1661080tKM
    public final void LIZ(C1661050tKJ c1661050tKJ) {
        this.LJI = c1661050tKJ;
        this.LJII = true;
        InterfaceC1661080tKM interfaceC1661080tKM = this.LIZ;
        if (interfaceC1661080tKM != null) {
            interfaceC1661080tKM.LIZ(c1661050tKJ);
        }
    }

    @Override // X.InterfaceC1661080tKM
    public final void LIZJ(C1661050tKJ c1661050tKJ) {
        this.LIZLLL = c1661050tKJ;
        this.LJ = true;
        this.LJFF = Intrinsics.LJFF(c1661050tKJ.LJII, Boolean.TRUE);
        InterfaceC1661080tKM interfaceC1661080tKM = this.LIZ;
        if (interfaceC1661080tKM != null) {
            interfaceC1661080tKM.LIZJ(c1661050tKJ);
        }
    }

    @Override // X.InterfaceC1661080tKM
    public final void LJ(Effect effect) {
        this.LJIILL = true;
        this.LJIILLIIL = effect;
        InterfaceC1661080tKM interfaceC1661080tKM = this.LIZ;
        if (interfaceC1661080tKM != null) {
            interfaceC1661080tKM.LJ(effect);
        }
    }

    public final void LJFF(InterfaceC1661080tKM interfaceC1661080tKM) {
        if (this.LJIILL && interfaceC1661080tKM != null) {
            interfaceC1661080tKM.LJ(this.LJIILLIIL);
        }
        if (this.LJIIL && interfaceC1661080tKM != null) {
            interfaceC1661080tKM.LIZIZ(this.LJIILJJIL, this.LJIILIIL);
        }
        if (this.LIZJ && interfaceC1661080tKM != null) {
            interfaceC1661080tKM.onStart(this.LIZIZ);
        }
        if (this.LJIIJJI && interfaceC1661080tKM != null) {
            interfaceC1661080tKM.LIZLLL(this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ);
        }
        if (this.LJII && interfaceC1661080tKM != null) {
            interfaceC1661080tKM.LIZ(this.LJI);
        }
        if (this.LJ && interfaceC1661080tKM != null) {
            interfaceC1661080tKM.LIZJ(this.LIZLLL);
        }
        this.LIZ = interfaceC1661080tKM;
    }

    @Override // X.InterfaceC1661080tKM
    public final void onStart(Effect effect) {
        this.LIZIZ = effect;
        this.LIZJ = true;
        InterfaceC1661080tKM interfaceC1661080tKM = this.LIZ;
        if (interfaceC1661080tKM != null) {
            interfaceC1661080tKM.onStart(effect);
        }
    }

    @Override // X.InterfaceC1661080tKM
    public final void LIZIZ(Effect effect, String str) {
        this.LJIIL = true;
        this.LJIILIIL = str;
        this.LJIILJJIL = effect;
        InterfaceC1661080tKM interfaceC1661080tKM = this.LIZ;
        if (interfaceC1661080tKM != null) {
            interfaceC1661080tKM.LIZIZ(effect, str);
        }
    }

    @Override // X.InterfaceC1661080tKM
    public final void LIZLLL(int i, Effect effect, Long l) {
        this.LJIIIIZZ = i;
        this.LJIIIZ = effect;
        this.LJIIJ = l;
        this.LJIIJJI = true;
        InterfaceC1661080tKM interfaceC1661080tKM = this.LIZ;
        if (interfaceC1661080tKM != null) {
            interfaceC1661080tKM.LIZLLL(i, effect, l);
        }
    }
}
