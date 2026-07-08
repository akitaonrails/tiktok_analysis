package X;

import android.os.Debug;
import android.os.SystemClock;
import com.bytedance.helios.statichook.config.ApiHookConfig;
import com.bytedance.pumbaa.base2.performance.PumbaaPerformanceTrackManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0WST, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WST {
    public final List<C0WSV> LIZ = new ArrayList();
    public C0WSB LIZIZ;
    public final C0WS6 LIZJ;
    public List<String> LIZLLL;

    public C0WST() {
        C0WS6 c0ws6;
        if (PumbaaPerformanceTrackManager.LIZIZ) {
            c0ws6 = new C0WS6();
            c0ws6.LIZ = SystemClock.elapsedRealtimeNanos();
            c0ws6.LIZJ = Debug.threadCpuTimeNanos();
        } else {
            c0ws6 = null;
        }
        this.LIZJ = c0ws6;
    }

    public static void LIZLLL(C0WS7 c0ws7, C0WZW c0wzw) {
        if (c0ws7 != null) {
            c0ws7.stop();
            c0wzw.LJFF = null;
        }
    }

    public final void LJ(int i, boolean z) {
        String str;
        if (z) {
            try {
                if (PumbaaPerformanceTrackManager.LJI()) {
                    String strValueOf = String.valueOf(i);
                    List<String> list = this.LIZLLL;
                    if (PumbaaPerformanceTrackManager.LJI()) {
                        if (strValueOf == null) {
                            strValueOf = "";
                        }
                        C0WSJ.LIZ(strValueOf, list);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        C0WSB c0wsb = this.LIZIZ;
        if (c0wsb == null) {
            return;
        }
        if (z) {
            C823880WTq c823880WTq = ApiHookConfig.LIZIZ.get(Integer.valueOf(i));
            if (c823880WTq != null) {
                str = c823880WTq.LJII;
            } else {
                str = null;
            }
            if ("around".equals(str)) {
                this.LIZIZ.stop();
                return;
            } else {
                this.LIZIZ.LJIILJJIL();
                return;
            }
        }
        c0wsb.LJIILJJIL();
    }

    public final C0WS7 LIZJ(String str, C0WZW c0wzw, boolean z) {
        String str2;
        if (z) {
            try {
                if (PumbaaPerformanceTrackManager.LJI()) {
                    if (this.LIZLLL == null) {
                        this.LIZLLL = new ArrayList();
                    }
                    ((ArrayList) this.LIZLLL).add(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        C0WSB c0wsb = this.LIZIZ;
        if (c0wsb == null) {
            return null;
        }
        if (!z) {
            str2 = "_postInvoke";
        } else {
            str2 = "_preInvoke";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        C0WS7 c0ws7LJFF = c0wsb.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        c0wzw.LJFF = c0ws7LJFF;
        return c0ws7LJFF;
    }

    public final C0WSU LIZIZ(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) throws Throwable {
        C0WSV[] c0wsvArr;
        C0WSU c0wsuPreInvoke;
        Object[] objArr2 = objArr;
        try {
            C0WSB c0wsbLIZIZ = PumbaaPerformanceTrackManager.LIZIZ(String.valueOf(i));
            this.LIZIZ = c0wsbLIZIZ;
            if (c0wsbLIZIZ != null) {
                C0WS6 c0ws6 = this.LIZJ;
                if (c0ws6 != null) {
                    c0wsbLIZIZ.LJIIJ(c0ws6);
                    this.LIZJ.LIZ();
                    this.LIZIZ.LJIIIIZZ("prepare", this.LIZJ);
                } else {
                    c0wsbLIZIZ.LJIIIZ();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0wzw.LJI = true;
        C823880WTq c823880WTq = ApiHookConfig.LIZIZ.get(Integer.valueOf(i));
        if (c823880WTq != null) {
            c0wsvArr = c823880WTq.LJI;
        } else {
            c0wsvArr = ApiHookConfig.LIZJ;
        }
        boolean z = false;
        for (C0WSV c0wsv : c0wsvArr) {
            C0WS7 c0ws7LIZJ = LIZJ(c0wsv.name(), c0wzw, true);
            try {
            } catch (Exception e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            if (C0WSD.LIZIZ(this.LIZIZ, c0ws7LIZJ)) {
                LIZLLL(c0ws7LIZJ, c0wzw);
            } else {
                try {
                    c0wsuPreInvoke = c0wsv.preInvoke(i, str, str2, obj, objArr2, str3, c0wzw);
                } catch (Exception e2) {
                    e = e2;
                } catch (Throwable th3) {
                    th = th3;
                }
                if (c0wsuPreInvoke.LIZ) {
                    LJ(i, true);
                    LIZLLL(c0ws7LIZJ, c0wzw);
                    return c0wsuPreInvoke;
                }
                try {
                    try {
                        Object[] objArr3 = c0wsuPreInvoke.LIZJ;
                        if (objArr3 != null) {
                            objArr2 = objArr3;
                            z = true;
                        }
                        ((ArrayList) this.LIZ).add(c0wsv);
                    } catch (Exception e3) {
                        e = e3;
                        TryCatchGuardChecker.doCheck(e);
                    }
                    LIZLLL(c0ws7LIZJ, c0wzw);
                } catch (Throwable th4) {
                    th = th4;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            LIZLLL(c0ws7LIZJ, c0wzw);
                            throw th;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                }
                TryCatchGuardChecker.doCheck(e);
                LIZLLL(c0ws7LIZJ, c0wzw);
            }
        }
        LJ(i, true);
        if (!z) {
            objArr2 = null;
        }
        return new C0WSU(objArr2);
    }

    public final void LIZ(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
        C0WSB c0wsb = this.LIZIZ;
        if (c0wsb != null) {
            c0wsb.LJIIIZ();
        }
        c0wzw.LJI = true;
        for (int size = ((ArrayList) this.LIZ).size() - 1; size >= 0; size--) {
            try {
                C0WSV c0wsv = (C0WSV) ((ArrayList) this.LIZ).get(size);
                C0WS7 c0ws7LIZJ = LIZJ(c0wsv.name(), c0wzw, false);
                if (C0WSD.LIZIZ(this.LIZIZ, c0ws7LIZJ)) {
                    LIZLLL(c0ws7LIZJ, c0wzw);
                } else {
                    c0wsv.postInvoke(i, str, str2, obj2, objArr, obj, c0wzw, z);
                    LIZLLL(c0ws7LIZJ, c0wzw);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LJ(i, false);
    }
}
