package X;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: X.0otO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490600otO {
    public final ThreadPoolExecutor LIZ;
    public final ThreadPoolExecutor LIZIZ;
    public final ThreadPoolExecutor LIZJ;
    public final ThreadPoolExecutor LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public boolean LJIIJJI;

    public C1490600otO(C1490580otM c1490580otM) {
        this.LJ = 8;
        this.LJFF = 8;
        this.LJI = 8;
        this.LJII = 8;
        this.LJIIIIZZ = 10L;
        this.LJIIIZ = 30L;
        this.LJIIJ = 10L;
        this.LJIIJJI = true;
        ThreadPoolExecutor threadPoolExecutor = c1490580otM.LIZ;
        if (threadPoolExecutor != null) {
            this.LIZ = threadPoolExecutor;
        }
        ThreadPoolExecutor threadPoolExecutor2 = c1490580otM.LIZIZ;
        if (threadPoolExecutor2 != null) {
            this.LIZIZ = threadPoolExecutor2;
        }
        ThreadPoolExecutor threadPoolExecutor3 = c1490580otM.LIZJ;
        if (threadPoolExecutor3 != null) {
            this.LIZJ = threadPoolExecutor3;
        }
        ThreadPoolExecutor threadPoolExecutor4 = c1490580otM.LIZLLL;
        if (threadPoolExecutor4 != null) {
            this.LIZLLL = threadPoolExecutor4;
        }
        int i = c1490580otM.LJ;
        if (i > 0) {
            this.LJI = i;
        }
        int i2 = c1490580otM.LJFF;
        if (i2 > 0) {
            this.LJII = i2;
        }
        int i3 = c1490580otM.LJI;
        if (i3 > 0) {
            this.LJ = i3;
        }
        int i4 = c1490580otM.LJII;
        if (i4 > 0) {
            this.LJFF = i4;
        }
        long j = c1490580otM.LJIIIIZZ;
        if (j > 0) {
            this.LJIIIZ = j;
        }
        long j2 = c1490580otM.LJIIIZ;
        if (j2 > 0) {
            this.LJIIJ = j2;
        }
        long j3 = c1490580otM.LJIIJ;
        if (j3 > 0) {
            this.LJIIIIZZ = j3;
        }
        this.LJIIJJI = c1490580otM.LJIIJJI;
    }
}
