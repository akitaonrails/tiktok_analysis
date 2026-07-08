package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.11iH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19575111iH implements InterfaceC1661080tKM {
    public final /* synthetic */ C19574811iE LIZ;

    public C19575111iH(C19574811iE c19574811iE) {
        this.LIZ = c19574811iE;
    }

    @Override // X.InterfaceC1661080tKM
    public final void LIZ(C1661050tKJ c1661050tKJ) {
        this.LIZ.LJJL.onFail(c1661050tKJ.LJ, c1661050tKJ.LJI);
    }

    @Override // X.InterfaceC1661080tKM
    public final void LIZJ(C1661050tKJ c1661050tKJ) {
        if (c1661050tKJ.LIZJ.intValue() == -108) {
            this.LIZ.getClass();
        }
        C19574811iE c19574811iE = this.LIZ;
        c19574811iE.LJJJ = c1661050tKJ.LIZ;
        c19574811iE.LJJL.onSuccess(c1661050tKJ.LJ);
    }

    @Override // X.InterfaceC1661080tKM
    public final void LJ(Effect effect) {
        this.LIZ.LJJL.LIZ.LJJJIL = effect;
    }

    @Override // X.InterfaceC1661080tKM
    public final void onStart(Effect effect) {
        this.LIZ.getClass();
        C19574811iE c19574811iE = this.LIZ;
        c19574811iE.LJJLIIIJILLIZJL = false;
        c19574811iE.LJJL.onStart(effect);
    }

    @Override // X.InterfaceC1661080tKM
    public final void LIZIZ(Effect effect, String str) {
        this.LIZ.LJJL.LIZ(effect, str);
    }

    @Override // X.InterfaceC1661080tKM
    public final void LIZLLL(int i, Effect effect, Long l) {
        this.LIZ.LJJL.onProgress(effect, i, l.longValue());
    }
}
