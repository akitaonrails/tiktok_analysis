package X;

import Y.ARunnableS113S0100000_13;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sliver.Sliver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0VWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799180VWq {
    public static InterfaceC799230VWv LIZJ;
    public static Thread LIZLLL;
    public static long LJFF;
    public static BPEAHandler LJI;
    public static HandlerThread LJII;
    public static final C799180VWq LIZ = new C799180VWq();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static String LJ = "";
    public static volatile C799250VWx LJIIIIZZ = new C799250VWx(new C0VX2(0).LIZ, 100);

    public static void LIZ() {
        try {
            Thread thread = LIZLLL;
            if (thread != null) {
                Sliver.stop(thread);
                AtomicBoolean atomicBoolean = C799200VWs.LIZ;
                if (C799200VWs.LIZ.compareAndSet(true, false)) {
                    Sliver.unRegisterSamplingListener(C799200VWs.LIZLLL);
                }
                List listLIZ = C799200VWs.LIZ(thread);
                if (listLIZ != null) {
                    C799220VWu c799220VWu = new C799220VWu();
                    c799220VWu.LIZIZ = LJ;
                    c799220VWu.LJFF = "cold_start";
                    c799220VWu.LIZJ = LJFF;
                    c799220VWu.LIZLLL = System.currentTimeMillis();
                    ((ArrayList) c799220VWu.LIZ).addAll(listLIZ);
                    BPEAHandler bPEAHandler = LJI;
                    if (bPEAHandler != null) {
                        C786410Ut5.LJLIIL(10000L, bPEAHandler, new ARunnableS113S0100000_13(c799220VWu, 180));
                    }
                } else {
                    LIZ.getClass();
                    HandlerThread handlerThread = LJII;
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                    }
                }
                ((LinkedHashMap) C799200VWs.LIZJ).clear();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        r0 = r1.activeCount() * 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r0 > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r0 = new java.lang.Thread[r0];
        r1.enumerate(r0);
        r0 = X.C13LQ.LJIJI(r0);
        r5 = new java.util.ArrayList();
        r7 = ((java.util.ArrayList) r0).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r7.hasNext() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        r6 = r7.next();
        r4 = (java.lang.Thread) r6;
        r1 = X.C2179008gG.LIZ;
        r0 = r4.getName();
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (X.C2179008gG.LIZ(r0, false) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r4, android.os.Looper.getMainLooper().getThread()) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r4, X.C786410Ut5.u3()) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        r5.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (r5.isEmpty() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
    
        if (X.C07KH.LIZ == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        r1 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
    
        if (r1.hasNext() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        r0 = (java.lang.Thread) r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
        r0 = X.C799180VWq.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        r3 = r0.LIZ(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        X.C799180VWq.LIZLLL = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        if (r3 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        if (r3.getState() == java.lang.Thread.State.TERMINATED) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
    
        X.C799180VWq.LJ = r3.getName();
        X.C799180VWq.LJFF = java.lang.System.currentTimeMillis();
        r0 = X.C799200VWs.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
    
        if (X.C799200VWs.LIZ.compareAndSet(false, true) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d9, code lost:
    
        com.bytedance.sliver.Sliver.registerSamplingListener(X.C799200VWs.LIZLLL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00de, code lost:
    
        com.bytedance.sliver.Sliver.start(r3, X.C799180VWq.LJIIIIZZ.LIZ, 100000, X.EnumC795650VJb.RING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
    
        java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ee, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C799180VWq.LIZIZ():void");
    }
}
