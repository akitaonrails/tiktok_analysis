package X;

import Y.ARunnableS92S0000000_13;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPreloadTTLSetting;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.HashSet;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0V2K, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V2K {
    public static volatile int LIZ;
    public static volatile boolean LIZIZ;
    public static final Object LIZJ;
    public static long[] LIZLLL;
    public static int LJ;
    public static boolean LJFF;
    public static volatile long LJI;
    public static volatile long LJII;
    public static final Thread LJIIIIZZ;
    public static volatile ARunnableS92S0000000_13 LJIIIZ;
    public static final HandlerThread LJIIJ;
    public static final BPEAHandler LJIIJJI;
    public static long LJIIL;
    public static long LJIILIIL;
    public static final int LJIILJJIL;
    public static final C0V2W[] LJIILL;
    public static int LJIILLIIL;
    public static final Object LJIIZILJ;
    public static boolean LJIJ;
    public static ARunnableS92S0000000_13 LJIJI;
    public static final C0V2M LJIJJ;
    public static C0V2L LJIJJLI;
    public static C0V2L LJIL;

    /* JADX WARN: Type inference failed for: r10v0, types: [X.0V2M, X.0V2z] */
    static {
        LIZ = Integer.MAX_VALUE;
        LIZIZ = false;
        Object obj = new Object();
        LIZJ = obj;
        LIZLLL = null;
        LJ = 0;
        LJFF = false;
        LJI = SystemClock.uptimeMillis();
        LJII = LJI;
        LJIIIIZZ = Looper.getMainLooper().getThread();
        LJIIIZ = null;
        HandlerThread handlerThread = new HandlerThread("trace_time_update_thread");
        handlerThread.start();
        LJIIJ = handlerThread;
        BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread));
        LJIIJJI = bPEAHandler;
        LJIILJJIL = 50;
        LJIILL = new C0V2W[50];
        LJIILLIIL = 0;
        LJIIZILJ = new Object();
        LJIJ = false;
        LJIJI = null;
        ?? r10 = new AbstractC791470V2z() { // from class: X.0V2M
            @Override // X.AbstractC791470V2z
            public final void LIZ() {
                this.LIZ = false;
                C0V2K.LJIJ = true;
            }

            @Override // X.AbstractC791470V2z
            public final boolean LIZJ() {
                if (C0V2K.LJIIIZ != null) {
                    C0V2K.LJIIIZ.run();
                    C0V2K.LJIIIZ = null;
                }
                return C0V2K.LIZ >= 1;
            }

            @Override // X.AbstractC791470V2z
            public final void LIZIZ(String str) {
                this.LIZ = true;
                C0V2K.LJI = AbstractC791470V2z.LIZIZ - C0V2K.LJII;
                C0V2K.LJIJ = false;
                Object obj2 = C0V2K.LJIIZILJ;
                synchronized (obj2) {
                    try {
                        obj2.notify();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        };
        LJIJJ = r10;
        ARunnableS92S0000000_13 aRunnableS92S0000000_13 = new ARunnableS92S0000000_13(35);
        if (!C0V2E.LLJILLL) {
            LIZLLL = new long[FriendsTabPreloadTTLSetting.DEFAULT];
        }
        if (Build.VERSION.SDK_INT < 24) {
            LIZ = -4;
            LIZIZ = true;
        } else {
            if (LIZ == Integer.MAX_VALUE) {
                synchronized (obj) {
                    try {
                        if (LIZ == Integer.MAX_VALUE) {
                            LJI = SystemClock.uptimeMillis() - LJII;
                            bPEAHandler.removeCallbacksAndMessages(null);
                            C786410Ut5.LJLIIL(5L, bPEAHandler, aRunnableS92S0000000_13);
                            ARunnableS92S0000000_13 aRunnableS92S0000000_132 = new ARunnableS92S0000000_13(38);
                            LJIJI = aRunnableS92S0000000_132;
                            C786410Ut5.LJLIIL(15000L, bPEAHandler, aRunnableS92S0000000_132);
                            C0V30.LJFF(r10);
                            LIZ = 1;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            LIZLLL(4194302, 0L);
            LJ(AbstractC791470V2z.LIZIZ, "EvilMethodTracer#message_0");
        }
        C786410Ut5.LJLIIL(15000L, bPEAHandler, new ARunnableS92S0000000_13(36));
    }

    public static void LJI() {
        synchronized (LIZJ) {
            try {
                if (LIZ < 2 && LIZ >= -2) {
                    LJIIJJI.removeCallbacks(LJIJI);
                    if (LIZLLL == null) {
                        LIZLLL = new long[FriendsTabPreloadTTLSetting.DEFAULT];
                    }
                    LIZ = 2;
                    LIZIZ = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJII() {
        synchronized (LIZJ) {
            try {
                if (LIZ == 2) {
                    LIZ = -1;
                    LIZIZ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static long[] LIZ(int i, int i2) {
        long[] jArr = new long[0];
        if (LIZLLL == null) {
            return jArr;
        }
        int iMax = Math.max(0, i);
        int iMax2 = Math.max(0, i2);
        if (iMax2 > iMax) {
            int i3 = (iMax2 - iMax) + 1;
            long[] jArr2 = new long[i3];
            System.arraycopy(LIZLLL, iMax, jArr2, 0, i3);
            return jArr2;
        }
        if (iMax2 >= iMax) {
            return jArr;
        }
        int i4 = iMax2 + 1;
        long[] jArr3 = LIZLLL;
        long[] jArr4 = new long[(jArr3.length - iMax) + i4];
        System.arraycopy(jArr3, iMax, jArr4, 0, jArr3.length - iMax);
        long[] jArr5 = LIZLLL;
        System.arraycopy(jArr5, 0, jArr4, jArr5.length - iMax, i4);
        return jArr4;
    }

    public static long[] LIZIZ(long j, long j2) {
        C0V2L c0v2l;
        C0V2L c0v2l2 = LJIJJLI;
        if (c0v2l2 == null || (c0v2l = LJIL) == null) {
            return null;
        }
        while (c0v2l2 != c0v2l) {
            C0V2L c0v2l3 = c0v2l2.LIZJ;
            if (c0v2l3.LJFF > j2) {
                c0v2l2 = c0v2l3;
            } else {
                C0V2L c0v2l4 = c0v2l.LIZLLL;
                if (c0v2l4.LJFF >= j) {
                    break;
                }
                c0v2l = c0v2l4;
            }
        }
        int i = c0v2l2.LIZIZ;
        if (i == 0) {
            i = LJ - 1;
        }
        return LIZ(c0v2l.LIZ, i);
    }

    public static String LIZJ(long j, long[] jArr) {
        if (jArr == null) {
            return "";
        }
        LinkedList linkedList = new LinkedList();
        C791250V2d.LJFF(jArr, linkedList, j);
        C791250V2d.LJI(1, linkedList);
        StringBuilder sb = new StringBuilder();
        C791250V2d.LJ(linkedList, sb);
        return sb.toString();
    }

    public static void LIZLLL(int i, long j) {
        if (C2124308Tx.LIZIZ) {
            try {
                C2124308Tx.LIZJ.LJJJI(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        int[] iArr = C2124308Tx.LIZ;
        if (iArr != null && iArr.length > 0) {
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (iArr[i2] == i) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("method id------>:");
                    sbLIZ.append(i);
                    sbLIZ.append("\n");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(Log.getStackTraceString(new Throwable()));
                    System.err.println(C2188811AlT.LIZIZ(sbLIZ2));
                    break;
                }
                i2++;
            }
        }
        if (!LIZIZ && C0V2E.LLJILJILJ && LIZLLL != null && i < 4194303 && C786410Ut5.u3() == LJIIIIZZ && !LJFF) {
            LJFF = true;
            if (j != 0) {
                LJI = j - LJII;
                LJI &= 2199023255551L;
            }
            LJIIL = LJI;
            if (((HashSet) C0V2N.LIZ.LIZ).contains(Integer.valueOf(i))) {
                LJIILIIL = i;
                C791560V3i.LIZLLL().getClass();
            }
            long j2 = (((long) i) << 41) | Long.MIN_VALUE | LJI;
            long[] jArr = LIZLLL;
            int i3 = LJ;
            jArr[i3] = j2;
            int i4 = i3 + 1;
            LJ = i4;
            if (i4 == 600000) {
                LJ = 0;
            }
            LJFF = false;
            C0V2L c0v2l = LJIL;
            if (c0v2l != null && c0v2l.LIZ == LJ) {
                C0V2L c0v2l2 = c0v2l.LIZLLL;
                LJIL = c0v2l2;
                if (c0v2l2 != null) {
                    c0v2l2.LIZJ = null;
                } else {
                    LJIJJLI = null;
                }
            }
        }
    }

    public static C0V2L LJ(long j, String str) {
        if (LJIJJLI == null) {
            C0V2L c0v2l = new C0V2L(LJ);
            LJIJJLI = c0v2l;
            if (j <= 0) {
                j = SystemClock.uptimeMillis();
            }
            c0v2l.LJFF = j;
            C0V2L c0v2l2 = LJIJJLI;
            c0v2l2.LJ = str;
            LJIL = c0v2l2;
            return c0v2l2;
        }
        int i = LJ;
        C0V2L c0v2l3 = new C0V2L(i);
        if (j <= 0) {
            j = SystemClock.uptimeMillis();
        }
        c0v2l3.LJFF = j;
        c0v2l3.LJ = str;
        C0V2L c0v2l4 = LJIJJLI;
        c0v2l3.LIZJ = c0v2l4;
        c0v2l4.LIZIZ = i - 1;
        c0v2l4.LIZLLL = c0v2l3;
        LJIJJLI = c0v2l3;
        return c0v2l3;
    }

    public static void LJFF(int i, long j) {
        int i2;
        if (C2124308Tx.LIZIZ) {
            try {
                C2124308Tx.LIZJ.LJJJIL(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (!LIZIZ && C0V2E.LLJILJILJ && LIZLLL != null && i < 4194303) {
            Thread threadU3 = C786410Ut5.u3();
            Thread thread = LJIIIIZZ;
            if (threadU3 == thread) {
                if (j != 0) {
                    LJI = j - LJII;
                    LJI &= 2199023255551L;
                }
                long j2 = i;
                if (j2 == LJIILIIL) {
                    if (LJI - LJIIL > 16 && (i2 = LJIILLIIL) < LJIILJJIL - 1) {
                        LJIILL[i2] = new C0V2W(ThreadMethodProxy.getStackTrace(thread));
                        LJIILLIIL++;
                    }
                    LJIILIIL = 0L;
                    C791560V3i.LIZLLL().getClass();
                }
                LJIIL = 0L;
                long j3 = (j2 << 41) | 0 | LJI;
                long[] jArr = LIZLLL;
                int i3 = LJ;
                jArr[i3] = j3;
                int i4 = i3 + 1;
                LJ = i4;
                if (i4 == 600000) {
                    LJ = 0;
                }
                C0V2L c0v2l = LJIL;
                if (c0v2l != null && c0v2l.LIZ == LJ) {
                    C0V2L c0v2l2 = c0v2l.LIZLLL;
                    LJIL = c0v2l2;
                    if (c0v2l2 != null) {
                        c0v2l2.LIZJ = null;
                    } else {
                        LJIJJLI = null;
                    }
                }
            }
        }
    }
}
