package X;

import Y.ARunnableS120S0100000_20;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kPF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318150kPF {
    public static final int LIZLLL = Runtime.getRuntime().availableProcessors();
    public static Executor LJ;
    public final String LIZ;
    public final C1318160kPG LIZIZ;
    public final InterfaceC1318090kP9 LIZJ;

    public C1318150kPF(String str, C1318160kPG c1318160kPG, InterfaceC1318090kP9 interfaceC1318090kP9) {
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 457);
        if (LJ == null) {
            LJ = C786410Ut5.e4(LIZLLL, new ThreadFactoryC1318170kPH("BlurDecodeExecutor"));
        }
        this.LIZ = str;
        this.LIZIZ = c1318160kPG;
        this.LIZJ = interfaceC1318090kP9;
        LJ.execute(aRunnableS120S0100000_20);
    }
}
