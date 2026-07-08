package X;

import Y.ARunnableS120S0100000_20;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kPE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318140kPE {
    public static final int LJFF = Runtime.getRuntime().availableProcessors();
    public static Executor LJI;
    public static String LJII;
    public final String LIZ;
    public final String LIZIZ;
    public final C1316650kMp LIZJ;
    public final InterfaceC1318130kPD LIZLLL;
    public final InterfaceC821570WKt LJ;

    public C1318140kPE(String str, C1316650kMp c1316650kMp, InterfaceC1318130kPD interfaceC1318130kPD) {
        this(str, LJII, c1316650kMp, interfaceC1318130kPD);
    }

    public C1318140kPE(String str, String str2, C1316650kMp c1316650kMp, InterfaceC1318130kPD interfaceC1318130kPD) {
        this(str, str2, c1316650kMp, interfaceC1318130kPD, null);
    }

    public C1318140kPE(String str, String str2, C1316650kMp c1316650kMp, InterfaceC1318130kPD interfaceC1318130kPD, InterfaceC821570WKt interfaceC821570WKt) {
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 464);
        if (LJI == null) {
            LJI = C786410Ut5.e4(LJFF, new ThreadFactoryC1318170kPH("BlurDecodeExecutor"));
        }
        this.LIZIZ = str;
        this.LIZ = str2;
        this.LIZJ = c1316650kMp;
        this.LIZLLL = interfaceC1318130kPD;
        this.LJ = interfaceC821570WKt;
        LJI.execute(aRunnableS120S0100000_20);
    }
}
