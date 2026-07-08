package X;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nSQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435440nSQ {
    public static final C1435440nSQ LIZ = new C1435440nSQ();
    public static final LinkedBlockingQueue<Runnable> LIZIZ;
    public static final ExecutorService LIZJ;
    public static volatile RunnableC1435430nSP LIZLLL;

    static {
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
        LIZIZ = linkedBlockingQueue;
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
        c2123408ToLIZ.LIZIZ = "DetachedWatermark";
        c2123408ToLIZ.LIZLLL = linkedBlockingQueue;
        LIZJ = C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public final synchronized void LIZ(String str, String str2) {
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = LIZIZ;
        int size = linkedBlockingQueue.size();
        Iterator<Runnable> it2 = linkedBlockingQueue.iterator();
        boolean z = false;
        int i = 0;
        while (it2.hasNext()) {
            Runnable next = it2.next();
            if ((next instanceof RunnableC1435430nSP) && Intrinsics.LJFF(((RunnableC1435430nSP) next).LLILLJJLI, str)) {
                it2.remove();
                i++;
            }
        }
        RunnableC1435430nSP runnableC1435430nSP = LIZLLL;
        if (runnableC1435430nSP != null && Intrinsics.LJFF(runnableC1435430nSP.LLILLJJLI, str)) {
            z = true;
            runnableC1435430nSP.LIZ(str2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Scheduler] cancelByPublishId publishId=");
        sbLIZ.append(str);
        sbLIZ.append(" removedFromQueue=");
        sbLIZ.append(i);
        sbLIZ.append(" currentCancelled=");
        sbLIZ.append(z);
        sbLIZ.append(" queueSize=");
        sbLIZ.append(size);
        sbLIZ.append("->");
        sbLIZ.append(LIZIZ.size());
        sbLIZ.append(" cause=");
        sbLIZ.append(str2);
        C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Detached Watermark Task cancelByPublishId: ");
        sbLIZ2.append(str);
        C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
