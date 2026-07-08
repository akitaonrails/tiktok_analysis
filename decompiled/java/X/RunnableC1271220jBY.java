package X;

import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0jBY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class RunnableC1271220jBY implements Runnable {
    public C1271390jBp LL;
    public EffectWrapper.AlgorithmResult LLILLJJLI;
    public final AtomicInteger LLILLL = new AtomicInteger(0);
    public final /* synthetic */ C1271230jBZ LLILZ;

    public final void LIZ() {
        if (this.LLILLL.get() < 0) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG ");
            C1274080jGA.LIZ.LIZ("FilterVideoBufferPool#Recycle.addRef", androidRuntimeException);
            if (C1274040jG6.LIZ()) {
                throw androidRuntimeException;
            }
        }
        this.LLILLL.incrementAndGet();
    }

    public final void LIZIZ() {
        if (this.LLILLL.decrementAndGet() < 0) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG ");
            C1274080jGA.LIZ.LIZ("FilterVideoBufferPool#Recycle.decRef", androidRuntimeException);
            if (C1274040jG6.LIZ()) {
                throw androidRuntimeException;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("FilterVideoBufferPool$Recycle@1db7.run");
        try {
            LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterVideoBufferPool$Recycle@1db7.run");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tex:");
        sbLIZ.append(this.LL.LIZIZ);
        sbLIZ.append(",fb:");
        sbLIZ.append(this.LL.LIZ);
        sbLIZ.append(",w:");
        sbLIZ.append(this.LL.LIZJ);
        sbLIZ.append(",h:");
        sbLIZ.append(this.LL.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RunnableC1271220jBY(C1271230jBZ c1271230jBZ, C1271390jBp c1271390jBp) {
        this.LLILZ = c1271230jBZ;
        this.LL = c1271390jBp;
    }

    public final void LIZJ(int i, int i2) {
        int i3;
        C1271390jBp c1271390jBp = this.LL;
        if (c1271390jBp != null) {
            int i4 = c1271390jBp.LIZIZ;
            if (c1271390jBp.LIZLLL(i, i2) && (i3 = this.LL.LIZIZ) != i4) {
                ((ConcurrentHashMap) this.LLILZ.LIZJ).put(Integer.valueOf(i3), this);
                ((ConcurrentHashMap) this.LLILZ.LIZJ).remove(Integer.valueOf(i4));
            }
        }
    }
}
