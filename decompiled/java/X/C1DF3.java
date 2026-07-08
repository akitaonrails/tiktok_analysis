package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* JADX INFO: renamed from: X.1DF3, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DF3 extends PthreadThread {
    public static final AtomicIntegerFieldUpdater LLJ = AtomicIntegerFieldUpdater.newUpdater(C1DF3.class, "workerCtl");
    public final C1DEY LL;
    public final C259800zU<C1DDP> LLILLJJLI;
    public C1DF9 LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public final /* synthetic */ CoroutineScheduler LLIZLLLIL;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;
    public volatile int workerCtl;

    public C1DF3() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0003, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DF3.LIZLLL():void");
    }

    public final C1DDP LJFF() {
        if (LJ(2) == 0) {
            C1DDP c1ddpLIZLLL = LIZLLL();
            return c1ddpLIZLLL != null ? c1ddpLIZLLL : LIZLLL();
        }
        C1DDP c1ddpLIZLLL2 = LIZLLL();
        return c1ddpLIZLLL2 != null ? c1ddpLIZLLL2 : LIZLLL();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            LIZLLL();
        } catch (Throwable th) {
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
    
        r3 = X.C1DEY.LIZLLL.get(r5);
        r2 = X.C1DEY.LIZJ.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
    
        if (r3 == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        if (X.C1DEY.LJ.get(r5) == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
    
        r2 = r2 - 1;
        r4 = r5.LIZJ(r2, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b6, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b9, code lost:
    
        r4 = LIZLLL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
    
        if (r4 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c9, code lost:
    
        return LJIIIZ(1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1DDP LIZJ(boolean r13) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DF3.LIZJ(boolean):X.1DDP");
    }

    public final int LJ(int i) {
        int i2 = this.LLILZLL;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.LLILZLL = i5;
        int i6 = i - 1;
        if ((i6 & i) == 0) {
            return i5 & i6;
        }
        return (i5 & Integer.MAX_VALUE) % i;
    }

    public final void LJII(int i) {
        String strValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLIZLLLIL.schedulerName);
        sbLIZ.append("-worker-");
        if (i == 0) {
            strValueOf = "TERMINATED";
        } else {
            strValueOf = String.valueOf(i);
        }
        sbLIZ.append(strValueOf);
        setName(C2188811AlT.LIZIZ(sbLIZ));
        this.indexInArray = i;
    }

    public final boolean LJIIIIZZ(C1DF9 c1df9) {
        boolean z;
        C1DF9 c1df92 = this.LLILLL;
        if (c1df92 == C1DF9.CPU_ACQUIRED) {
            z = true;
            CoroutineScheduler.controlState$FU.addAndGet(this.LLIZLLLIL, 4398046511104L);
        } else {
            z = false;
        }
        if (c1df92 != c1df9) {
            this.LLILLL = c1df9;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a6 A[EDGE_INSN: B:66:0x00a6->B:40:0x00a6 BREAK  A[LOOP:1: B:26:0x006b->B:68:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, X.1DDP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.1DDP] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.1DDP] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1DDP LJIIIZ(int r19) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DF3.LJIIIZ(int):X.1DDP");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1DF3(CoroutineScheduler coroutineScheduler, int i) {
        super("CoroutineScheduler$Worker");
        this.LLIZLLLIL = coroutineScheduler;
        setDaemon(true);
        this.LL = new C1DEY();
        this.LLILLJJLI = new C259800zU<>();
        this.LLILLL = C1DF9.DORMANT;
        this.nextParkedWorker = CoroutineScheduler.NOT_IN_STACK;
        this.LLILZLL = AbstractC19994813Le.Default.nextInt();
        LJII(i);
    }
}
