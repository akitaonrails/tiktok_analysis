package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceControl;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.player.AJProducerManager;
import com.ss.ttm.player.TTPlayer;
import com.ss.ttm.player.TTPlayerClient;
import com.ss.ttm.player.TTPlayerSurface;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0oNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470940oNg extends AbstractC1470990oNl {
    public static String LJ = null;
    public static String LJFF = null;
    public static boolean LJI = false;
    public final long LIZ = System.currentTimeMillis();
    public TTPlayer LIZIZ;
    public TTPlayerClient LIZJ;
    public final Context LIZLLL;

    public final Surface LIZLLL() {
        C1470950oNh c1470950oNh = this.LIZIZ.LJII;
        c1470950oNh.getClass();
        try {
            c1470950oNh.LIZLLL.readLock().lock();
            if (c1470950oNh.LIZJ == null) {
                c1470950oNh.LIZLLL.readLock().unlock();
                return null;
            }
            Surface surface = c1470950oNh.LIZJ.getSurface();
            c1470950oNh.LIZLLL.readLock().unlock();
            return surface;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1470950oNh.LIZLLL.readLock().unlock();
            throw th;
        }
    }

    public final void LJI() {
        long j = this.LIZIZ.LIZ;
        synchronized (AJProducerManager.class) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setOnImageAvailableListener,playerId:");
            sbLIZ.append(j);
            sbLIZ.append(",listener:");
            sbLIZ.append((Object) null);
            sbLIZ.append(",handler:");
            sbLIZ.append((Object) null);
            C2188811AlT.LIZIZ(sbLIZ);
            if (j == 0) {
                return;
            }
            AJProducerManager.LIZ.remove(Long.valueOf(j));
            for (C1286350jZx c1286350jZx : AJProducerManager.LIZJ) {
                if (c1286350jZx.LIZJ == j) {
                    c1286350jZx.LIZ(null, null);
                }
            }
        }
    }

    public C1470940oNg(Context context) {
        this.LIZLLL = context;
    }

    public final void LJFF(long j) {
        this.LIZIZ.LJJIIZI(j);
    }

    public final void LJII(Surface surface) {
        this.LIZIZ.LJJIJLIJ(surface);
    }

    public final int LIZJ(int i, int i2) {
        return this.LIZIZ.LIZLLL(i, i2);
    }

    public final void LJ(int i, int i2, String str) {
        TTPlayerClient tTPlayerClient = this.LIZJ;
        tTPlayerClient.getClass();
        if (i == 2) {
            if (i2 == 1) {
                tTPlayerClient.LLJJJJ = str;
                return;
            } else {
                if (i2 != 0) {
                    return;
                }
                tTPlayerClient.LLJJJIL = str;
                return;
            }
        }
        if (i == 0) {
            tTPlayerClient.LLJJIJIIJIL = i2;
        }
        if (str == null) {
            return;
        }
        if (tTPlayerClient.LLJ.size() > 40) {
            tTPlayerClient.LLJ.removeFirst();
        }
        tTPlayerClient.LLJ.addLast(C786410Ut5.k4(Locale.US, "%s&&time:%d", new Object[]{str, Long.valueOf(System.currentTimeMillis())}));
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.0oNm] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.07zX] */
    public final void LJIIIIZZ(SurfaceControl surfaceControl, int i, int i2) throws Throwable {
        boolean zLIZ;
        int iLIZIZ;
        final C1470950oNh c1470950oNh = this.LIZIZ.LJII;
        long j = c1470950oNh.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set surface control, sc: ");
        sbLIZ.append(surfaceControl);
        sbLIZ.append(", width: ");
        sbLIZ.append(i);
        sbLIZ.append(", height: ");
        sbLIZ.append(i2);
        C1285330jYJ.LIZ(4, "core", j, C2188811AlT.LIZIZ(sbLIZ));
        int i3 = c1470950oNh.LJIIJ + 1;
        c1470950oNh.LJIIJ = i3;
        if (surfaceControl != null) {
            zLIZ = c1470950oNh.LIZ();
        } else {
            zLIZ = false;
        }
        if (i3 < c1470950oNh.LJIIJ) {
            long j2 = c1470950oNh.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("this commit id less than current, drop it, commitId: ");
            sbLIZ2.append(i3);
            sbLIZ2.append(", mCommitId: ");
            sbLIZ2.append(c1470950oNh.LJIIJ);
            C1285330jYJ.LIZ(5, "core", j2, C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        c1470950oNh.LIZLLL.readLock().lock();
        TTPlayerSurface tTPlayerSurface = c1470950oNh.LIZJ;
        c1470950oNh.LIZLLL.readLock().unlock();
        synchronized (c1470950oNh.LJIIIIZZ) {
            try {
                C1470970oNj c1470970oNj = c1470950oNh.LJIIJJI;
                if (c1470970oNj.LIZIZ() && !c1470970oNj.LJIIIZ) {
                    c1470970oNj.LJI = System.currentTimeMillis();
                }
                SurfaceControl surfaceControl2 = null;
                try {
                    if (surfaceControl == null) {
                        int iLIZ = C1471100oNw.LIZ(c1470950oNh.LIZIZ, tTPlayerSurface);
                        long j3 = c1470950oNh.LIZIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("reparent parent to null, ret: ");
                        sbLIZ3.append(iLIZ);
                        C1285330jYJ.LIZ(4, "core", j3, C2188811AlT.LIZIZ(sbLIZ3));
                        if (iLIZ == 0) {
                            c1470950oNh.LJFF = null;
                            c1470950oNh.LJI = -1;
                            c1470950oNh.LJII = -1;
                        }
                        c1470950oNh.LJIIJJI.LIZ(1, -1, -1, -1);
                        ((C1471020oNo) c1470950oNh.LIZ).LIZ(-1, 0, 0, false);
                    } else {
                        if (surfaceControl != c1470950oNh.LJFF || zLIZ) {
                            surfaceControl2 = surfaceControl;
                        } else {
                            C1285330jYJ.LIZ(4, "core", c1470950oNh.LIZIZ, "same parent");
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 33 && c1470950oNh.LJIILJJIL > 0) {
                            long j4 = c1470950oNh.LIZIZ;
                            final BPEAHandler bPEAHandler = c1470950oNh.LJIILL;
                            Objects.requireNonNull(bPEAHandler);
                            iLIZIZ = C1471100oNw.LIZJ(tTPlayerSurface, surfaceControl2, i, i2, j4, new Executor() { // from class: X.07zX
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    Handler handler = bPEAHandler;
                                    C1C7U.LIZ("SurfaceControlManager@fd2a.updateAndReparent$1L");
                                    C786410Ut5.LJJZZIII(handler, runnable);
                                }
                            }, new SurfaceControl.TransactionCommittedListener() { // from class: X.0oNm
                                @Override // android.view.SurfaceControl.TransactionCommittedListener
                                public final void onTransactionCommitted() {
                                    C1285330jYJ.LIZ(4, "core", c1470950oNh.LIZIZ, "onTransactionCommitted, start notify");
                                    C1470950oNh c1470950oNh2 = c1470950oNh;
                                    ((C1471020oNo) c1470950oNh2.LIZ).LIZ(0, c1470950oNh2.LJI, c1470950oNh.LJII, true);
                                }
                            });
                        } else {
                            iLIZIZ = C1471100oNw.LIZIZ(tTPlayerSurface, surfaceControl2, i, i2, true, c1470950oNh.LIZIZ);
                        }
                        long j5 = c1470950oNh.LIZIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("reparent ret: ");
                        sbLIZ4.append(iLIZIZ);
                        C1285330jYJ.LIZ(4, "core", j5, C2188811AlT.LIZIZ(sbLIZ4));
                        c1470950oNh.LJIIJJI.LIZ(0, i, i2, iLIZIZ);
                        if (iLIZIZ == 0) {
                            c1470950oNh.LJFF = surfaceControl;
                            c1470950oNh.LJI = i;
                            c1470950oNh.LJII = i2;
                            if (i4 < 33 || c1470950oNh.LJIILJJIL <= 0) {
                                ((C1471020oNo) c1470950oNh.LIZ).LIZ(iLIZIZ, c1470950oNh.LJI, c1470950oNh.LJII, true);
                            }
                        } else {
                            ((C1471020oNo) c1470950oNh.LIZ).LIZ(iLIZIZ, 0, 0, false);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b A[Catch: UnsatisfiedLinkError -> 0x0040, all -> 0x01bb, TRY_LEAVE, TryCatch #2 {UnsatisfiedLinkError -> 0x0040, blocks: (B:18:0x0037, B:20:0x003b), top: B:48:0x0037, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[Catch: all -> 0x01bb, TryCatch #4 {, blocks: (B:4:0x0003, B:7:0x0009, B:9:0x000d, B:10:0x001b, B:13:0x0021, B:15:0x0031, B:17:0x0035, B:18:0x0037, B:20:0x003b, B:22:0x0041, B:23:0x004a, B:25:0x004e, B:27:0x0052, B:28:0x016d, B:33:0x0187, B:37:0x019a, B:38:0x01b2, B:36:0x0193, B:39:0x01b3, B:40:0x01ba, B:34:0x018f, B:29:0x0177), top: B:52:0x0003, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e A[Catch: all -> 0x01bb, TryCatch #4 {, blocks: (B:4:0x0003, B:7:0x0009, B:9:0x000d, B:10:0x001b, B:13:0x0021, B:15:0x0031, B:17:0x0035, B:18:0x0037, B:20:0x003b, B:22:0x0041, B:23:0x004a, B:25:0x004e, B:27:0x0052, B:28:0x016d, B:33:0x0187, B:37:0x019a, B:38:0x01b2, B:36:0x0193, B:39:0x01b3, B:40:0x01ba, B:34:0x018f, B:29:0x0177), top: B:52:0x0003, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b3 A[Catch: all -> 0x01bb, TryCatch #4 {, blocks: (B:4:0x0003, B:7:0x0009, B:9:0x000d, B:10:0x001b, B:13:0x0021, B:15:0x0031, B:17:0x0035, B:18:0x0037, B:20:0x003b, B:22:0x0041, B:23:0x004a, B:25:0x004e, B:27:0x0052, B:28:0x016d, B:33:0x0187, B:37:0x019a, B:38:0x01b2, B:36:0x0193, B:39:0x01b3, B:40:0x01ba, B:34:0x018f, B:29:0x0177), top: B:52:0x0003, inners: #0, #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized X.C1470940oNg LIZIZ(com.ss.ttm.player.TTPlayerClient r9, android.content.Context r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1470940oNg.LIZIZ(com.ss.ttm.player.TTPlayerClient, android.content.Context, int, int):X.0oNg");
    }
}
