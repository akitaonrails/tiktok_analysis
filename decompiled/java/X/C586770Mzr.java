package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Mzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586770Mzr {
    public static final C586770Mzr LIZ = new C586770Mzr();
    public static final ReentrantReadWriteLock.ReadLock LIZIZ;
    public static final ReentrantReadWriteLock.WriteLock LIZJ;
    public static final C603820NmG<String, Long> LIZLLL;
    public static final C603820NmG<String, Pair<Long, Long>> LJ;
    public static final C603820NmG<String, String> LJFF;

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        LIZIZ = reentrantReadWriteLock.readLock();
        LIZJ = reentrantReadWriteLock.writeLock();
        LIZLLL = new C603820NmG<>(10);
        LJ = new C603820NmG<>(10);
        LJFF = new C603820NmG<>(10);
    }

    public static final boolean LIZ(String str) {
        if (!C582340Msi.LIZ().disableBreakWhenNotRender || LJFF.LIZJ(str) != null) {
            return true;
        }
        return false;
    }

    public static final Pair<Long, Long> LIZIZ(String str) {
        boolean z;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return new Pair<>(-1L, -1L);
        }
        ReentrantReadWriteLock.ReadLock readLock = LIZIZ;
        readLock.lock();
        Pair<Long, Long> pairLIZJ = LJ.LIZJ(str);
        if (pairLIZJ == null) {
            pairLIZJ = new Pair<>(-1L, -1L);
        }
        readLock.unlock();
        return pairLIZJ;
    }

    public static final void LIZJ(String str) {
        if (C582340Msi.LIZ().disableBreakWhenNotRender && str != null && !a0.LJJJIL(str)) {
            ReentrantReadWriteLock.WriteLock writeLock = LIZJ;
            writeLock.lock();
            LJFF.LIZLLL(str, str);
            writeLock.unlock();
        }
    }

    public static final void LIZLLL(long j, String str, String str2) {
        if (C582340Msi.LIZ().enableRecordPosBeforeStop && str != null && !a0.LJJJIL(str) && str2 != null && !a0.LJJJIL(str2)) {
            ReentrantReadWriteLock.WriteLock writeLock = LIZJ;
            writeLock.lock();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            LIZLLL.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(j));
            writeLock.unlock();
        }
    }

    public static final void LJ(long j, long j2, String str) {
        if (str != null && !a0.LJJJIL(str)) {
            ReentrantReadWriteLock.WriteLock writeLock = LIZJ;
            writeLock.lock();
            LJ.LIZLLL(str, new Pair<>(Long.valueOf(j), Long.valueOf(j2)));
            writeLock.unlock();
        }
    }
}
