package X;

import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPerfAutoAdaptiveThreadOpt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01e1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C381501e1 {
    public C380401dq LIZ;
    public C381901e5 LIZIZ;
    public volatile boolean LIZJ;
    public C381601e2 LIZLLL;
    public HandlerThread LJ;
    public BPEAHandler LJFF;
    public int LJI;
    public final RunnableC514801zW LJII = new RunnableC514801zW(this, 9);
    public final RunnableC514801zW LJIIIIZZ = new RunnableC514801zW(this, 10);

    public final void LIZ() throws Throwable {
        ArrayList<C381601e2> arrayList;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            arrayList = new ArrayList();
            C381601e2 c381601e2 = this.LIZLLL;
            while (c381601e2 != null && c381601e2.LIZIZ <= jUptimeMillis) {
                arrayList.add(c381601e2);
                c381601e2 = c381601e2.LJ;
            }
            this.LIZLLL = c381601e2;
        }
        StringBuilder sb = new StringBuilder("MessageHandler consumeMessage list: ");
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (C381601e2 c381601e22 : arrayList) {
            arrayList2.add(new Pair(Integer.valueOf(c381601e22.LIZ), Long.valueOf(c381601e22.LIZIZ)));
        }
        sb.append(arrayList2);
        sb.append(", head: ");
        sb.append(this.LIZLLL);
        C20441214yg.LIZIZ("AutoAdaptiveCenter", sb.toString());
        for (C381601e2 c381601e23 : arrayList) {
            if (LiveBroadcastPerfAutoAdaptiveThreadOpt.getEnable()) {
                BPEAHandler bPEAHandler = this.LJFF;
                if (bPEAHandler != null) {
                    C786410Ut5.LJJZZIII(bPEAHandler, new RunnableC514501zT(this, c381601e23, 0));
                }
            } else {
                LIZIZ(c381601e23);
            }
        }
        C381601e2 c381601e24 = this.LIZLLL;
        if (c381601e24 != null) {
            if (!LiveBroadcastPerfAutoAdaptiveThreadOpt.getEnable()) {
                C473410IhP.LIZ().removeCallbacks(this.LJII);
                C786410Ut5.LJLIIL(c381601e24.LIZIZ - jUptimeMillis, C473410IhP.LIZ(), this.LJII);
                return;
            }
            BPEAHandler bPEAHandler2 = this.LJFF;
            if (bPEAHandler2 != null) {
                bPEAHandler2.removeCallbacks(this.LJIIIIZZ);
            }
            BPEAHandler bPEAHandler3 = this.LJFF;
            if (bPEAHandler3 != null) {
                C786410Ut5.LJLIIL(c381601e24.LIZIZ - jUptimeMillis, bPEAHandler3, this.LJIIIIZZ);
            }
        }
    }

    public final void LIZIZ(C381601e2 c381601e2) throws Throwable {
        C380401dq c380401dq;
        if (!this.LIZJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MessageHandler#dispatchMessage failed. Handler is not active. running: ");
            sbLIZ.append(this.LIZJ);
            C20441214yg.LJIIIZ("AutoAdaptiveCenter", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("MessageHandler#dispatchMessage, MessageType: ");
        sbLIZ2.append(c381601e2.LIZ);
        C20441214yg.LIZIZ("AutoAdaptiveCenter", C2188811AlT.LIZIZ(sbLIZ2));
        if (LiveBroadcastPerfAutoAdaptiveThreadOpt.getEnable()) {
            C23250099c.LJ(C23271099x.INSTANCE, new C379601di(this, c381601e2, null));
            return;
        }
        C381901e5 c381901e5 = this.LIZIZ;
        if (c381901e5 == null) {
            return;
        }
        InterfaceC381401e0 interfaceC381401e0 = (InterfaceC381401e0) ((LinkedHashMap) c381901e5.LIZ).get(Integer.valueOf(c381601e2.LIZ));
        if (interfaceC381401e0 == null || (c380401dq = this.LIZ) == null) {
            return;
        }
        c380401dq.LIZ(interfaceC381401e0, c381601e2.LIZLLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035 A[Catch: all -> 0x0045, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000e, B:10:0x0012, B:12:0x001a, B:15:0x0021, B:17:0x0029, B:20:0x0030, B:24:0x003a, B:25:0x003c, B:27:0x0040, B:23:0x0035), top: B:33:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZJ(X.C381601e2 r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.LIZJ     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto Le
            java.lang.String r1 = "AutoAdaptiveCenter"
            java.lang.String r0 = "Handler is not active, insert msg failed."
            X.C20441214yg.LJIIIZ(r1, r0)     // Catch: java.lang.Throwable -> L45
            monitor-exit(r7)
            return
        Le:
            X.01e2 r6 = r7.LIZLLL     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L35
            long r3 = r8.LIZIZ     // Catch: java.lang.Throwable -> L45
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L35
            long r1 = r6.LIZIZ     // Catch: java.lang.Throwable -> L45
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L35
            r5 = 0
        L21:
            long r3 = r6.LIZIZ     // Catch: java.lang.Throwable -> L45
            long r1 = r8.LIZIZ     // Catch: java.lang.Throwable -> L45
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L30
            X.01e2 r0 = r6.LJ     // Catch: java.lang.Throwable -> L45
            r5 = r6
            r6 = r0
            if (r0 == 0) goto L30
            goto L21
        L30:
            r8.LJ = r6     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L3c
            goto L3a
        L35:
            r8.LJ = r6     // Catch: java.lang.Throwable -> L45
            r7.LIZLLL = r8     // Catch: java.lang.Throwable -> L45
            goto L3c
        L3a:
            r5.LJ = r8     // Catch: java.lang.Throwable -> L45
        L3c:
            boolean r0 = r8.LIZJ     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L43
            r7.LIZLLL(r8)     // Catch: java.lang.Throwable -> L45
        L43:
            monitor-exit(r7)
            return
        L45:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381501e1.LIZJ(X.01e2):void");
    }

    public final synchronized void LIZLLL(C381601e2 c381601e2) {
        ArrayList<C381601e2> arrayList = new ArrayList();
        C381601e2 c381601e22 = new C381601e2(EnumC405401hs.HEAD.ordinal(), 0L, false, null, 30);
        c381601e22.LJ = this.LIZLLL;
        C381601e2 c381601e23 = c381601e22;
        while (true) {
            C381601e2 c381601e24 = null;
            if (c381601e23 == null || c381601e23.LJ == null) {
                break;
            }
            C381601e2 c381601e25 = c381601e23.LJ;
            if (c381601e25 != null && c381601e25.LIZ == c381601e2.LIZ && !Intrinsics.LJFF(c381601e25, c381601e2)) {
                C381601e2 c381601e26 = c381601e23.LJ;
                if (c381601e26 != null) {
                    arrayList.add(c381601e26);
                }
                C381601e2 c381601e27 = c381601e23.LJ;
                if (c381601e27 != null) {
                    c381601e24 = c381601e27.LJ;
                }
                c381601e23.LJ = c381601e24;
            } else {
                c381601e23 = c381601e23.LJ;
            }
        }
        this.LIZLLL = c381601e22.LJ;
        StringBuilder sb = new StringBuilder();
        sb.append("MessageHandler#removeMessageByType delete msg: ");
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (C381601e2 c381601e28 : arrayList) {
            arrayList2.add(new Pair(Integer.valueOf(c381601e28.LIZ), Long.valueOf(c381601e28.LIZIZ)));
        }
        sb.append(arrayList2);
        C20441214yg.LIZIZ("AutoAdaptiveCenter", sb.toString());
    }

    public C381501e1(C380401dq c380401dq, C381901e5 c381901e5) {
        this.LIZ = c380401dq;
        this.LIZIZ = c381901e5;
    }
}
