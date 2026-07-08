package X;

import android.content.Context;
import android.os.Process;
import com.bytedance.android.alog.Alog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feedlog.ILogWriter;
import java.io.File;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Wcq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827300Wcq implements ILogWriter {
    public static volatile Alog LIZIZ;
    public static final C827300Wcq LIZ = new C827300Wcq();
    public static volatile ArrayDeque<C827330Wct> LIZJ = new ArrayDeque<>();
    public static ArrayDeque<C827330Wct> LIZLLL = new ArrayDeque<>();
    public static final Object LJ = new Object();
    public static final ScheduledExecutorService LJFF = C823050WQl.LJ();
    public static final C827500WdA LJI = new ThreadLocal<Long>() { // from class: X.0WdA
        @Override // java.lang.ThreadLocal
        public final Long initialValue() {
            return Long.valueOf(Process.myTid());
        }
    };

    public static void LIZIZ() throws Throwable {
        ArrayDeque arrayDequeLJI = null;
        try {
            arrayDequeLJI = LJI();
            try {
                if (arrayDequeLJI.isEmpty()) {
                    if (arrayDequeLJI.isEmpty()) {
                        LJFF(arrayDequeLJI);
                        return;
                    }
                    return;
                }
                while (!arrayDequeLJI.isEmpty()) {
                    C827330Wct c827330Wct = (C827330Wct) arrayDequeLJI.removeFirst();
                    LJII(c827330Wct.LIZ, c827330Wct.LIZLLL, c827330Wct.LJ, c827330Wct.LIZIZ, c827330Wct.LIZJ);
                }
                if (arrayDequeLJI.isEmpty()) {
                    LJFF(arrayDequeLJI);
                }
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (arrayDequeLJI != null && arrayDequeLJI.isEmpty()) {
                    LJFF(arrayDequeLJI);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static ArrayDeque LJI() {
        synchronized (LJ) {
            try {
                if (LIZJ.isEmpty()) {
                    ArrayDeque<C827330Wct> arrayDeque = LIZLLL;
                    if (arrayDeque != null) {
                        LIZLLL = null;
                        arrayDeque.clear();
                    } else {
                        arrayDeque = new ArrayDeque<>();
                    }
                    return arrayDeque;
                }
                ArrayDeque<C827330Wct> arrayDeque2 = LIZJ;
                ArrayDeque<C827330Wct> arrayDeque3 = LIZLLL;
                if (arrayDeque3 != null) {
                    LIZLLL = null;
                    arrayDeque3.clear();
                } else {
                    arrayDeque3 = new ArrayDeque<>();
                }
                LIZJ = arrayDeque3;
                return arrayDeque2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJFF(ArrayDeque arrayDeque) {
        arrayDeque.clear();
        synchronized (LJ) {
            try {
                if (LIZLLL == null) {
                    LIZLLL = arrayDeque;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static Alog LIZ(Context context, File file) {
        if (file == null) {
            try {
                file = C08OV.LIZJ(context);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        C827280Wco c827280Wco = new C827280Wco(context);
        c827280Wco.LIZJ("feeds");
        c827280Wco.LJ = file.getAbsolutePath();
        c827280Wco.LJFF = 524288;
        c827280Wco.LJI = 4194304;
        c827280Wco.LJII = 7;
        c827280Wco.LJIIL = EnumC827470Wd7.SAFE.value;
        c827280Wco.LJIILIIL = EnumC827460Wd6.RAW.value;
        c827280Wco.LJIILJJIL = EnumC827440Wd4.LEGACY.value;
        c827280Wco.LJIILL = EnumC827430Wd3.NONE.value;
        c827280Wco.LJIILLIIL = EnumC827450Wd5.NONE.value;
        c827280Wco.LJIIZILJ = EnumC827420Wd2.NONE.value;
        return c827280Wco.LIZIZ();
    }

    public final void LJ(Context context, C0VSJ c0vsj) {
        ArrayDeque arrayDequeLJI;
        Unit unit;
        if (LIZIZ == null && LIZIZ == null) {
            synchronized (this) {
                try {
                    if (LIZIZ == null) {
                        LIZ.getClass();
                        LIZIZ = LIZ(context, c0vsj);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        while (true) {
            try {
                arrayDequeLJI = LJI();
                if (arrayDequeLJI.isEmpty()) {
                    break;
                }
                while (!arrayDequeLJI.isEmpty()) {
                    C827330Wct c827330Wct = (C827330Wct) arrayDequeLJI.removeFirst();
                    LJII(c827330Wct.LIZ, c827330Wct.LIZLLL, c827330Wct.LJ, c827330Wct.LIZIZ, c827330Wct.LIZJ);
                }
                LJFF(arrayDequeLJI);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
                return;
            }
        }
        LJFF(arrayDequeLJI);
        Alog alog = LIZIZ;
        if (alog != null) {
            alog.LIZ();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C189200o6.m2constructorimpl(unit);
    }

    @Override // com.ss.android.ugc.aweme.feedlog.ILogWriter
    public final void LIZJ(String str, int i, String str2, String str3) {
        long jLongValue;
        if (str2 != null && str3 != null) {
            Long l = LJI.get();
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (LIZIZ == null) {
                synchronized (LJ) {
                    try {
                        LIZJ.addLast(new C827330Wct(i, jLongValue, jCurrentTimeMillis, str2, str3));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return;
            }
            LIZLLL(i, jLongValue, jCurrentTimeMillis, str2, str3);
            C0C76.LIZ().isOpen();
        }
    }

    public static void LIZLLL(int i, long j, long j2, String str, String str2) {
        synchronized (LJ) {
            try {
                LIZJ.addLast(new C827330Wct(i, j, j2, str, str2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJII(int i, long j, long j2, String str, String str2) {
        Alog alog = LIZIZ;
        if (alog == null) {
            return;
        }
        try {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                alog.LJIILLIIL(1, j, j2, str, str2);
                            } else {
                                alog.LJIILLIIL(4, j, j2, str, str2);
                            }
                        } else {
                            alog.LJIILLIIL(3, j, j2, str, str2);
                        }
                    } else {
                        alog.LJIILLIIL(2, j, j2, str, str2);
                    }
                } else {
                    alog.LJIILLIIL(1, j, j2, str, str2);
                }
            } else {
                alog.LJIILLIIL(0, j, j2, str, str2);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
