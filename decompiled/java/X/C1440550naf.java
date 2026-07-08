package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0naf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440550naf {
    public boolean LIZ;
    public boolean LIZJ;
    public boolean LJFF;
    public AbstractC1440530nad LJII;
    public AbstractC1440530nad LJIIIIZZ;
    public AbstractC1440530nad LJIIIZ;
    public final String LJIIJ;
    public final C1D82[] LJIIJJI;
    public String LIZIZ = UUID.randomUUID().toString();
    public final List<Object> LIZLLL = new ArrayList();
    public C1D84 LJ = new C1D84();
    public final List<Object> LJI = new ArrayList();

    public final C1D80 LIZ() {
        Executor executorE4;
        Executor executorC4;
        String str = this.LJIIJ;
        C1D82[] c1d82Arr = this.LJIIJJI;
        C1D80 c1d80 = new C1D80(str, (C1D82[]) Arrays.copyOf(c1d82Arr, c1d82Arr.length), this.LIZIZ, this.LJ);
        c1d80.LJIIL = 100;
        c1d80.LIZ = this.LIZ;
        c1d80.LIZIZ = this.LIZJ;
        c1d80.LJI.addAll(this.LIZLLL);
        ((ArrayList) c1d80.LJII).addAll(this.LJI);
        c1d80.LJIIIIZZ = this.LJFF;
        AbstractC1440530nad abstractC1440530nad = this.LJII;
        C1440540nae c1440540nae = C1440540nae.LIZ;
        Executor executorE42 = null;
        if (Intrinsics.LJFF(abstractC1440530nad, c1440540nae)) {
            executorE4 = C786410Ut5.e4(1, new ThreadFactory() { // from class: X.0nag
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    BPEAThread bPEAThread = new BPEAThread(runnable);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("wave-schedule");
                    sbLIZ.append(UUID.randomUUID().toString());
                    ThreadMethodProxy.setName(bPEAThread, C2188811AlT.LIZIZ(sbLIZ));
                    return bPEAThread;
                }
            });
        } else if (Intrinsics.LJFF(abstractC1440530nad, new AbstractC1440530nad() { // from class: X.0naj
        })) {
            executorE4 = null;
        } else {
            if (!(abstractC1440530nad instanceof C1435280nSA)) {
                throw new C1954807lC();
            }
            executorE4 = ((C1435280nSA) abstractC1440530nad).LIZ;
        }
        c1d80.LIZLLL = executorE4;
        AbstractC1440530nad abstractC1440530nad2 = this.LJIIIIZZ;
        if (Intrinsics.LJFF(abstractC1440530nad2, c1440540nae)) {
            executorC4 = C786410Ut5.c4(new ThreadFactory() { // from class: X.0nah
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    BPEAThread bPEAThread = new BPEAThread(runnable);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("wave-task");
                    sbLIZ.append(UUID.randomUUID().toString());
                    ThreadMethodProxy.setName(bPEAThread, C2188811AlT.LIZIZ(sbLIZ));
                    return bPEAThread;
                }
            });
        } else if (Intrinsics.LJFF(abstractC1440530nad2, new AbstractC1440530nad() { // from class: X.0naj
        })) {
            executorC4 = null;
        } else {
            if (!(abstractC1440530nad2 instanceof C1435280nSA)) {
                throw new C1954807lC();
            }
            executorC4 = ((C1435280nSA) abstractC1440530nad2).LIZ;
        }
        c1d80.LJ = executorC4;
        AbstractC1440530nad abstractC1440530nad3 = this.LJIIIZ;
        if (Intrinsics.LJFF(abstractC1440530nad3, c1440540nae)) {
            executorE42 = C786410Ut5.e4(1, new ThreadFactory() { // from class: X.0nai
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    BPEAThread bPEAThread = new BPEAThread(runnable);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("wave-event");
                    sbLIZ.append(UUID.randomUUID().toString());
                    ThreadMethodProxy.setName(bPEAThread, C2188811AlT.LIZIZ(sbLIZ));
                    return bPEAThread;
                }
            });
        } else if (!Intrinsics.LJFF(abstractC1440530nad3, new AbstractC1440530nad() { // from class: X.0naj
        })) {
            if (!(abstractC1440530nad3 instanceof C1435280nSA)) {
                throw new C1954807lC();
            }
            executorE42 = ((C1435280nSA) abstractC1440530nad3).LIZ;
        }
        c1d80.LJFF = executorE42;
        return c1d80;
    }

    public C1440550naf(String str, C1D82... c1d82Arr) {
        this.LJIIJ = str;
        this.LJIIJJI = c1d82Arr;
        C1440540nae c1440540nae = C1440540nae.LIZ;
        this.LJII = c1440540nae;
        this.LJIIIIZZ = c1440540nae;
        this.LJIIIZ = c1440540nae;
    }
}
