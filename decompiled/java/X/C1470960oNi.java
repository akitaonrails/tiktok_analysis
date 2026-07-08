package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.player.TTPlayerSurface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0oNi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470960oNi {
    public final List<TTPlayerSurface> LIZ = new ArrayList();
    public int LIZIZ = 0;
    public int LIZJ = 0;
    public final Object LIZLLL = new Object();

    public final TTPlayerSurface LIZIZ() {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        TTPlayerSurface tTPlayerSurface = new TTPlayerSurface();
        tTPlayerSurface.LJFF = 1;
        synchronized (this.LIZLLL) {
            try {
                ((ArrayList) this.LIZ).add(tTPlayerSurface);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tTPlayerSurface;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094 A[PHI: r5
      0x0094: PHI (r5v2 com.ss.ttm.player.TTPlayerSurface) = (r5v1 com.ss.ttm.player.TTPlayerSurface), (r5v4 com.ss.ttm.player.TTPlayerSurface) binds: [B:18:0x0072, B:23:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.ttm.player.TTPlayerSurface LIZ(java.lang.Object r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.InterfaceC1471080oNu
            if (r0 == 0) goto Lf
            r0 = r11
            X.0oNu r0 = (X.InterfaceC1471080oNu) r0
            long r1 = r0.getNativeHandle()
        Lb:
            java.lang.Object r7 = r10.LIZLLL
            monitor-enter(r7)
            goto L12
        Lf:
            r1 = 0
            goto Lb
        L12:
            java.util.List<com.ss.ttm.player.TTPlayerSurface> r0 = r10.LIZ     // Catch: java.lang.Throwable -> L9b
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L9b
            java.util.Iterator r9 = r0.iterator()     // Catch: java.lang.Throwable -> L9b
        L1a:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L9b
            r6 = 3
            r4 = 1
            if (r0 == 0) goto L70
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Throwable -> L9b
            com.ss.ttm.player.TTPlayerSurface r5 = (com.ss.ttm.player.TTPlayerSurface) r5     // Catch: java.lang.Throwable -> L9b
            java.lang.String r8 = "mgr"
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "surface status: "
            r3.append(r0)     // Catch: java.lang.Throwable -> L9b
            int r0 = r5.LJFF     // Catch: java.lang.Throwable -> L9b
            r3.append(r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = ", pool size: "
            r3.append(r0)     // Catch: java.lang.Throwable -> L9b
            java.util.List<com.ss.ttm.player.TTPlayerSurface> r0 = r10.LIZ     // Catch: java.lang.Throwable -> L9b
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L9b
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9b
            r3.append(r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r3)     // Catch: java.lang.Throwable -> L9b
            X.C1285330jYJ.LIZ(r6, r8, r1, r0)     // Catch: java.lang.Throwable -> L9b
            int r0 = r5.LJFF     // Catch: java.lang.Throwable -> L9b
            if (r0 == r4) goto L1a
            r5.LJFF = r4     // Catch: java.lang.Throwable -> L9b
            r5.LIZIZ(r11)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r4 = "mgr"
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "acquire a surface from pool:"
            r3.append(r0)     // Catch: java.lang.Throwable -> L9b
            r3.append(r5)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r3)     // Catch: java.lang.Throwable -> L9b
            r0 = 4
            X.C1285330jYJ.LIZ(r0, r4, r1, r3)     // Catch: java.lang.Throwable -> L9b
        L6e:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9b
            goto L72
        L70:
            r5 = 0
            goto L6e
        L72:
            if (r5 != 0) goto L94
            com.ss.ttm.player.TTPlayerSurface r5 = r10.LIZIZ()
            if (r5 == 0) goto L7d
            r5.LIZIZ(r11)
        L7d:
            java.lang.String r4 = "mgr"
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "create a new generated surface:"
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r3)
            X.C1285330jYJ.LIZ(r6, r4, r1, r0)
            if (r5 == 0) goto L9a
        L94:
            int r0 = r5.LJ
            int r0 = r0 + 1
            r5.LJ = r0
        L9a:
            return r5
        L9b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1470960oNi.LIZ(java.lang.Object):com.ss.ttm.player.TTPlayerSurface");
    }

    public final void LIZJ(TTPlayerSurface tTPlayerSurface) {
        Object obj;
        long nativeHandle;
        boolean z;
        if (tTPlayerSurface != null) {
            obj = tTPlayerSurface.LIZIZ;
        } else {
            obj = null;
        }
        if (obj instanceof InterfaceC1471080oNu) {
            nativeHandle = ((InterfaceC1471080oNu) obj).getNativeHandle();
        } else {
            nativeHandle = 0;
        }
        if (this.LIZIZ <= 0) {
            z = true;
        } else {
            z = false;
        }
        C1471100oNw.LIZ(nativeHandle, tTPlayerSurface);
        if (tTPlayerSurface != null) {
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("recycleSurface, force released, surface:");
                sbLIZ.append(tTPlayerSurface);
                C1285330jYJ.LIZ(3, "mgr", nativeHandle, C2188811AlT.LIZIZ(sbLIZ));
                synchronized (this.LIZLLL) {
                    try {
                        ((ArrayList) this.LIZ).remove(tTPlayerSurface);
                    } finally {
                    }
                }
            } else if (((ArrayList) this.LIZ).size() >= this.LIZIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("recycleSurface, surface count is over limit, surface:");
                sbLIZ2.append(tTPlayerSurface);
                C1285330jYJ.LIZ(3, "mgr", nativeHandle, C2188811AlT.LIZIZ(sbLIZ2));
                synchronized (this.LIZLLL) {
                    try {
                        ((ArrayList) this.LIZ).remove(tTPlayerSurface);
                    } finally {
                    }
                }
            } else {
                int i = this.LIZJ;
                if (i > 0 && tTPlayerSurface.LJ >= i) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("recycleSurface, surface used count is over limit, surface:");
                    sbLIZ3.append(tTPlayerSurface);
                    C1285330jYJ.LIZ(3, "mgr", nativeHandle, C2188811AlT.LIZIZ(sbLIZ3));
                    synchronized (this.LIZLLL) {
                        try {
                            ((ArrayList) this.LIZ).remove(tTPlayerSurface);
                        } finally {
                        }
                    }
                } else if (!tTPlayerSurface.isValid()) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("recycleSurface, surface is invalid, surface:");
                    sbLIZ4.append(tTPlayerSurface);
                    C1285330jYJ.LIZ(3, "mgr", nativeHandle, C2188811AlT.LIZIZ(sbLIZ4));
                    synchronized (this.LIZLLL) {
                        try {
                            ((ArrayList) this.LIZ).remove(tTPlayerSurface);
                        } finally {
                        }
                    }
                } else {
                    synchronized (this.LIZLLL) {
                        try {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("recycleSurface, surface:");
                            sbLIZ5.append(tTPlayerSurface);
                            C1285330jYJ.LIZ(3, "mgr", nativeHandle, C2188811AlT.LIZIZ(sbLIZ5));
                            C1471100oNw.LIZ(tTPlayerSurface.LIZJ, tTPlayerSurface);
                            tTPlayerSurface.LJFF = 2;
                            tTPlayerSurface.LIZIZ = null;
                            tTPlayerSurface.LIZJ = 0L;
                        } finally {
                        }
                    }
                    return;
                }
            }
            tTPlayerSurface.LIZIZ(null);
            tTPlayerSurface.LJFF = 0;
            tTPlayerSurface.LIZ();
        }
    }

    public final void LIZLLL(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setParameter: ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(i2);
        C1285330jYJ.LIZ(3, "mgr", 0L, C2188811AlT.LIZIZ(sbLIZ));
        if (i != 1) {
            if (i == 2) {
                this.LIZJ = i2;
                return;
            }
            return;
        }
        this.LIZIZ = i2;
    }
}
