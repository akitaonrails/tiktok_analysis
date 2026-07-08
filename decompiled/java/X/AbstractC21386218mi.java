package X;

import Y.AObjectS406S0100000_32;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.18mi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21386218mi extends C0S34 {
    public InterfaceC21386618mm LJI;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public final C01GW LJII = C452501pT.LIZ(EnumC452301pR.NONE, new AObjectS406S0100000_32(this, 2));
    public final List<InterfaceC21387018mq> LJIIJ = new ArrayList();
    public final C21386718mn LJIIJJI = new InterfaceC690350R6b() { // from class: X.18mn
        @Override // X.InterfaceC690350R6b
        public final View LIZ() {
            return this.LIZ.LJIIIZ();
        }

        @Override // X.InterfaceC690350R6b
        public final void LIZIZ(C0R6Z c0r6z) {
            if (!((ArrayList) this.LIZ.LJIIJ).contains(c0r6z)) {
                ((ArrayList) this.LIZ.LJIIJ).add(c0r6z);
            }
        }

        @Override // X.InterfaceC690350R6b
        public final void LIZJ(C0R6Z c0r6z) {
            ((ArrayList) this.LIZ.LJIIJ).remove(c0r6z);
        }
    };

    public void LJIIIIZZ() {
    }

    public abstract void LJIIJ(InterfaceC21386618mm interfaceC21386618mm);

    public abstract void LJIILIIL();

    public abstract void LJIILJJIL(InterfaceC690390R6f interfaceC690390R6f);

    public abstract boolean LJIILL(InterfaceC21386618mm interfaceC21386618mm);

    public final View LJIIIZ() {
        return (View) this.LJII.getValue();
    }

    public final void LJIIJJI() {
        for (InterfaceC21387018mq interfaceC21387018mq : this.LJIIJ) {
            InterfaceC21386618mm interfaceC21386618mm = this.LJI;
            interfaceC21387018mq.LIZ(interfaceC21386618mm != null ? interfaceC21386618mm.getSourceId() : null);
        }
    }

    public final void LJIIL() {
        for (InterfaceC21387018mq interfaceC21387018mq : this.LJIIJ) {
            InterfaceC21386618mm interfaceC21386618mm = this.LJI;
            interfaceC21387018mq.LIZIZ(interfaceC21386618mm != null ? interfaceC21386618mm.getSourceId() : null);
        }
    }

    @Override // X.C0S34, X.C0S3C
    public final void LJI(InterfaceC690390R6f interfaceC690390R6f) {
        C0R5Z c0r5zLIZLLL;
        C0S3E c0s3e;
        super.LJI(interfaceC690390R6f);
        C0R6A c0r6aLIZJ = null;
        if ((interfaceC690390R6f instanceof C0S3E) && (c0s3e = (C0S3E) interfaceC690390R6f) != null) {
            c0r6aLIZJ = c0s3e.LIZJ();
        }
        this.LJI = c0r6aLIZJ;
        InterfaceC690370R6d interfaceC690370R6d = this.LJ;
        if (interfaceC690370R6d != null && (c0r5zLIZLLL = interfaceC690370R6d.LIZLLL()) != null) {
            c0r5zLIZLLL.LIZ = this.LJIIJJI;
        }
        LJIIIIZZ();
        LJIILJJIL(interfaceC690390R6f);
        if (LJIILL(this.LJI)) {
            LJIIJ(this.LJI);
        }
        LJIILIIL();
    }
}
