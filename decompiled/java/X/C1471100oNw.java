package X;

import android.os.Build;
import android.view.SurfaceControl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.player.TTPlayerSurface;
import com.ss.vcbkit.UnExpected;

/* JADX INFO: renamed from: X.0oNw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471100oNw {
    public static int LIZ(long j, TTPlayerSurface tTPlayerSurface) {
        if (tTPlayerSurface == null) {
            return -3;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recycle: ");
            sbLIZ.append(tTPlayerSurface);
            C1285330jYJ.LIZ(4, "hlp", j, C2188811AlT.LIZIZ(sbLIZ));
            SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
            try {
                try {
                    transaction.reparent(tTPlayerSurface.LIZ, null).apply();
                    transaction.close();
                    return 0;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    transaction.close();
                    return -2;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                transaction.close();
                throw th;
            }
        }
        return -4;
    }

    public static int LIZIZ(TTPlayerSurface tTPlayerSurface, SurfaceControl surfaceControl, int i, int i2, boolean z, long j) {
        if (tTPlayerSurface == null) {
            C1285330jYJ.LIZ(5, "hlp", j, "target is null");
            return -3;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("target: ");
            sbLIZ.append(tTPlayerSurface);
            sbLIZ.append(", parent: ");
            sbLIZ.append(surfaceControl);
            sbLIZ.append(", width: ");
            sbLIZ.append(i);
            sbLIZ.append(", height: ");
            sbLIZ.append(i2);
            sbLIZ.append(", visible: ");
            sbLIZ.append(z);
            C1285330jYJ.LIZ(4, "hlp", j, C2188811AlT.LIZIZ(sbLIZ));
            SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
            if (surfaceControl != null) {
                try {
                    try {
                        transaction.reparent(tTPlayerSurface.LIZ, surfaceControl);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(e);
                        sbLIZ2.append(", t:");
                        sbLIZ2.append(tTPlayerSurface);
                        sbLIZ2.append(", p:");
                        sbLIZ2.append(surfaceControl);
                        sbLIZ2.append(", w:");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", h:");
                        sbLIZ2.append(i2);
                        sbLIZ2.append(", v:");
                        sbLIZ2.append(z);
                        C1285330jYJ.LIZ(6, "hlp", j, C2188811AlT.LIZIZ(sbLIZ2));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("t:");
                        sbLIZ3.append(tTPlayerSurface);
                        sbLIZ3.append(", p:");
                        sbLIZ3.append(surfaceControl);
                        sbLIZ3.append(", w:");
                        sbLIZ3.append(i);
                        sbLIZ3.append(", h:");
                        sbLIZ3.append(i2);
                        sbLIZ3.append(", v:");
                        sbLIZ3.append(z);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        if (UnExpected.LIZ) {
                            C805380Via.LIZJ(e, strLIZIZ);
                        }
                        transaction.close();
                        return -2;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    transaction.close();
                    throw th;
                }
            }
            transaction.setBufferSize(tTPlayerSurface.LIZ, i, i2).setVisibility(tTPlayerSurface.LIZ, z).apply();
            transaction.close();
            return 0;
        }
        return -4;
    }

    public static int LIZJ(TTPlayerSurface tTPlayerSurface, SurfaceControl surfaceControl, int i, int i2, long j, ExecutorC2043707zX executorC2043707zX, SurfaceControlTransactionCommittedListenerC1471000oNm surfaceControlTransactionCommittedListenerC1471000oNm) {
        if (tTPlayerSurface == null) {
            C1285330jYJ.LIZ(5, "hlp", j, "target is null");
            return -3;
        }
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        transaction.addTransactionCommittedListener(executorC2043707zX, surfaceControlTransactionCommittedListenerC1471000oNm);
        if (surfaceControl != null) {
            try {
                try {
                    transaction.reparent(tTPlayerSurface.LIZ, surfaceControl);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    transaction.close();
                    return -2;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                transaction.close();
                throw th;
            }
        }
        transaction.setBufferSize(tTPlayerSurface.LIZ, i, i2).setVisibility(tTPlayerSurface.LIZ, true).apply();
        transaction.close();
        return 0;
    }
}
