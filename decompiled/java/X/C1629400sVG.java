package X;

import Y.AObserverS227S0100000_25;
import com.ss.android.ugc.aweme.sticker.ab.EffectDownloadNoNetworkOptConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sVG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629400sVG {
    public final InterfaceC1625000sOA LIZ;
    public boolean LIZIZ;
    public AwS426S0200000_25 LIZJ;
    public final C01GW<C1629670sVh> LIZLLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1122));

    public final void LIZ() {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        this.LIZ.w4().LIZIZ(new InterfaceC1625190sOT() { // from class: X.0sVF
            @Override // X.InterfaceC1625190sOT
            public final <T> C1625490sOx LIZ(InterfaceC1625180sOS<T> interfaceC1625180sOS) {
                if (!C20510015Ni.LIZ.LJIIIIZZ()) {
                    C1629380sVE.LIZ.getClass();
                    if (!((EffectDownloadNoNetworkOptConfig) C1629380sVE.LIZJ.getValue()).holdRequest) {
                        if (interfaceC1625180sOS instanceof C1625440sOs) {
                            C1629400sVG c1629400sVG = this.LIZ;
                            C1625440sOs c1625440sOs = (C1625440sOs) interfaceC1625180sOS;
                            Effect effect = c1625440sOs.LIZ;
                            if (effect == null) {
                                c1629400sVG.getClass();
                            } else if (!c1629400sVG.LIZ.C0().getStickerRepository().LJI().LIZIZ(effect)) {
                            }
                            C1629400sVG c1629400sVG2 = this.LIZ;
                            c1625440sOs.LIZ.getEffectId();
                            c1629400sVG2.getClass();
                            C1629400sVG c1629400sVG3 = this.LIZ;
                            c1629400sVG3.LIZJ = new AwS426S0200000_25(c1629400sVG3, (C1629400sVG) interfaceC1625180sOS, 184);
                            this.LIZ.LIZLLL.getValue().LIZ();
                        }
                        return new C1625490sOx();
                    }
                }
                return new C1625490sOx();
            }
        });
        this.LIZ.C0().LJII().LJIJJLI().observe(this.LIZ.getLifecycleOwner(), new AObserverS227S0100000_25(this, 132));
    }

    public C1629400sVG(InterfaceC1625000sOA interfaceC1625000sOA) {
        this.LIZ = interfaceC1625000sOA;
    }
}
