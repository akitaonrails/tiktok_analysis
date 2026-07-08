package X;

import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0pSI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512240pSI {
    public final String LIZ;
    public final InterfaceC1512410pSZ LIZIZ;
    public final InterfaceC1512300pSO LIZJ;
    public final InterfaceC1512460pSe LIZLLL;
    public final InterfaceC1512370pSV LJ;
    public final InterfaceC1512430pSb LJFF;
    public ExecutorService LJI;

    public C1512240pSI(C1512280pSM c1512280pSM) {
        String str = c1512280pSM.LIZ;
        if (str != null) {
            InterfaceC1512410pSZ interfaceC1512410pSZ = c1512280pSM.LIZIZ;
            if (interfaceC1512410pSZ != null) {
                InterfaceC1512300pSO interfaceC1512300pSO = c1512280pSM.LIZJ;
                if (interfaceC1512300pSO != null) {
                    this.LIZ = str;
                    this.LIZIZ = interfaceC1512410pSZ;
                    this.LIZJ = interfaceC1512300pSO;
                    this.LIZLLL = c1512280pSM.LIZLLL;
                    this.LJFF = c1512280pSM.LJFF;
                    this.LJI = null;
                    this.LJ = c1512280pSM.LJ;
                    return;
                }
                throw new RuntimeException("must implement IConfigParser");
            }
            throw new RuntimeException("must implement IFileDownloader");
        }
        throw new RuntimeException("must specified cache path");
    }
}
