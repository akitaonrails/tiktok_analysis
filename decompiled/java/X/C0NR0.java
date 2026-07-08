package X;

import com.ss.android.ugc.aweme.pns.gatekeeper.GatekeeperEngine;

/* JADX INFO: renamed from: X.0NR0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NR0 implements C0X54 {
    public final /* synthetic */ C0NR1 LIZ;
    public final /* synthetic */ GatekeeperEngine LIZIZ;

    @Override // X.C0X54
    public final void LIZ() {
        GatekeeperEngine gatekeeperEngine = this.LIZIZ;
        C23250099c.LIZLLL(gatekeeperEngine.LJIIIZ, null, null, new C593800NQs(gatekeeperEngine, this.LIZ, true, null), 3);
        InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
        GatekeeperEngine gatekeeperEngine2 = this.LIZIZ;
        C0NR1 c0nr1 = this.LIZ;
        gatekeeperEngine2.getClass();
        interfaceC1519030pdFLIZJ.LIZ("gate_keeper_task_completed", GatekeeperEngine.LJIILLIIL(c0nr1));
    }

    @Override // X.C0X54
    public final void LIZIZ() {
        if (this.LIZ.category() == C0NRC.NOTICE) {
            this.LIZIZ.LIZIZ++;
        }
        GatekeeperEngine gatekeeperEngine = this.LIZIZ;
        C23250099c.LIZLLL(gatekeeperEngine.LJIIIZ, null, null, new C593800NQs(gatekeeperEngine, this.LIZ, false, null), 3);
        InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
        GatekeeperEngine gatekeeperEngine2 = this.LIZIZ;
        C0NR1 c0nr1 = this.LIZ;
        gatekeeperEngine2.getClass();
        interfaceC1519030pdFLIZJ.LIZ("gate_keeper_task_shown", GatekeeperEngine.LJIILLIIL(c0nr1));
    }

    public C0NR0(C0NR1 c0nr1, GatekeeperEngine gatekeeperEngine) {
        this.LIZ = c0nr1;
        this.LIZIZ = gatekeeperEngine;
    }
}
