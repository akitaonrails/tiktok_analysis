package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.0WCY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WCY implements InterfaceC819290WBz {
    public static final Logger LJFF = Logger.getLogger(C819200WBq.class.getName());
    public final InterfaceC819440WCo LIZ;
    public final Executor LIZIZ;
    public final InterfaceC819450WCp LIZJ;
    public final C0WCP LIZLLL;
    public final C0WCM LJ;

    @Override // X.InterfaceC819290WBz
    public final void LIZ(final C0WC3 c0wc3, final C0WCF c0wcf, final C818560W9e c818560W9e) {
        this.LIZIZ.execute(new Runnable() { // from class: X.0WCX
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC819390WCj interfaceC819390WCj;
                final C0WCY c0wcy = this.LL;
                final AbstractC818550W9d abstractC818550W9d = c818560W9e;
                C0WC4 c0wc4 = c0wc3;
                C0WCG c0wcg = c0wcf;
                c0wcy.getClass();
                C1C7U.LIZ("DefaultScheduler@6a92.schedule$1L");
                try {
                    interfaceC819390WCj = c0wcy.LIZJ.get(abstractC818550W9d.LIZIZ());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    Logger logger = C0WCY.LJFF;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error scheduling event ");
                    sbLIZ.append(e.getMessage());
                    logger.warning(C2188811AlT.LIZIZ(sbLIZ));
                    c0wc4.getClass();
                }
                if (interfaceC819390WCj != null) {
                    final C0WCF c0wcfLIZIZ = interfaceC819390WCj.LIZIZ(c0wcg);
                    c0wcy.LJ.LIZIZ(new C0WCL() { // from class: X.0WCd
                        @Override // X.C0WCL
                        public final Object execute() {
                            C0WCY c0wcy2 = c0wcy;
                            AbstractC818550W9d abstractC818550W9d2 = abstractC818550W9d;
                            c0wcy2.LIZLLL.LJJLJLI(abstractC818550W9d2, c0wcfLIZIZ);
                            c0wcy2.LIZ.LIZ(abstractC818550W9d2, 1);
                            return null;
                        }
                    });
                    c0wc4.getClass();
                    C1C7U.LIZIZ("DefaultScheduler@6a92.schedule$1L");
                    return;
                }
                String strJ4 = C786410Ut5.j4("Transport backend '%s' is not registered", new Object[]{abstractC818550W9d.LIZIZ()});
                C0WCY.LJFF.warning(strJ4);
                new IllegalArgumentException(strJ4);
                c0wc4.getClass();
                C1C7U.LIZIZ("DefaultScheduler@6a92.schedule$1L");
            }
        });
    }

    public C0WCY(Executor executor, InterfaceC819450WCp interfaceC819450WCp, InterfaceC819440WCo interfaceC819440WCo, C0WCP c0wcp, C0WCM c0wcm) {
        this.LIZIZ = executor;
        this.LIZJ = interfaceC819450WCp;
        this.LIZ = interfaceC819440WCo;
        this.LIZLLL = c0wcp;
        this.LJ = c0wcm;
    }
}
