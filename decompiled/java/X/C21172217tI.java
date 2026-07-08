package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS169S0101000_32;
import kotlin.jvm.internal.AwS33S0202000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.17tI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21172217tI extends C822650WOx {
    public final LinkedList<AbstractRunnableC21164217s0> LL;
    public final Set<Integer> LLILLJJLI;
    public final Map<Integer, Integer> LLILLL;

    @Override // X.C822650WOx, com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int iIntValue;
        if (runnable instanceof AbstractRunnableC21164217s0) {
            final AbstractRunnableC21164217s0 abstractRunnableC21164217s0 = (AbstractRunnableC21164217s0) runnable;
            abstractRunnableC21164217s0.getClass();
            synchronized (AbstractRunnableC21164217s0.class) {
                try {
                    AbstractRunnableC21164217s0.LLILZLL++;
                    abstractRunnableC21164217s0.LLILLL = AbstractRunnableC21164217s0.LLILZLL;
                    Map<Integer, Integer> map = AbstractRunnableC21164217s0.LLILZIL;
                    Integer num = (Integer) ((LinkedHashMap) map).get(Integer.valueOf(abstractRunnableC21164217s0.LL));
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    abstractRunnableC21164217s0.LLILZ = iIntValue + 1;
                    map.put(Integer.valueOf(abstractRunnableC21164217s0.LL), Integer.valueOf(abstractRunnableC21164217s0.LLILZ));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            runnable = new AbstractRunnableC21172117tH(this, abstractRunnableC21164217s0) { // from class: X.17tG
                public final void LIZ() {
                    C21172217tI c21172217tI = this.LLILLJJLI.get();
                    if (c21172217tI == null) {
                        C1553130qWF.LJFF(AFwS223S0000000_32.get$arr$(335));
                        return;
                    }
                    C1553130qWF.LIZIZ(new AwS576S0100000_32(this, 875));
                    Map<Integer, Integer> map2 = c21172217tI.LLILLL;
                    LinkedList<AbstractRunnableC21164217s0> linkedList = c21172217tI.LL;
                    synchronized (linkedList) {
                        try {
                            int i = this.LL.LL;
                            Integer num2 = (Integer) ((LinkedHashMap) map2).get(Integer.valueOf(i));
                            int i2 = 0;
                            int iIntValue2 = num2 != null ? num2.intValue() : 0;
                            if (this.LL.LLILZ - iIntValue2 != 1 || c21172217tI.LLILLJJLI.contains(Integer.valueOf(i))) {
                                int size = linkedList.size() - 1;
                                while (i2 <= size) {
                                    int i3 = ((size - i2) / 2) + i2;
                                    if (linkedList.get(i3).LLILLL > this.LL.LLILLL) {
                                        size = i3 - 1;
                                    } else if (linkedList.get(i3).LLILLL < this.LL.LLILLL) {
                                        i2 = i3 + 1;
                                    }
                                }
                                linkedList.add(i2, this.LL);
                                C1553130qWF.LIZIZ(new AwS33S0202000_32(i, iIntValue2, (int) this, (C21172017tG) linkedList, (LinkedList<AbstractRunnableC21164217s0>) 4));
                            } else {
                                C1553130qWF.LIZIZ(new AwS169S0101000_32(i, this, 14));
                                c21172217tI.execute(new C21171917tF(c21172217tI, this.LL));
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SequenceDispatchShell@7f54.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SequenceDispatchShell@7f54.run");
                }
            };
        }
        super.execute(runnable);
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        throw new UnsupportedOperationException("Only support function execute!");
    }

    public C21172217tI(TimeUnit timeUnit, ThreadFactoryC1551520qTe threadFactoryC1551520qTe) {
        super(3, 3, 5L, timeUnit, new LinkedBlockingQueue(), threadFactoryC1551520qTe);
        this.LL = new LinkedList<>();
        this.LLILLJJLI = new LinkedHashSet();
        this.LLILLL = new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        throw new UnsupportedOperationException("Only support function execute!");
    }
}
