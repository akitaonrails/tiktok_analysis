package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1139490fl5<DATA> {
    public boolean LIZIZ;
    public final AtomicLong LIZ = new AtomicLong(0);
    public final TreeMap<Integer, LinkedList<DATA>> LIZJ = new TreeMap<>(Collections.reverseOrder());

    public final synchronized void LIZ() {
        this.LIZJ.clear();
        this.LIZ.set(0L);
    }

    public final synchronized int LJ() {
        if (LIZJ()) {
            return 0;
        }
        if (this.LIZJ.isEmpty()) {
            this.LIZ.set(0L);
            return 0;
        }
        Integer numFirstKey = this.LIZJ.firstKey();
        if (numFirstKey == null) {
            this.LIZ.set(0L);
            return 0;
        }
        return numFirstKey.intValue();
    }

    public abstract boolean LJI(DATA data);

    public final synchronized String toString() {
        StringBuilder sbLIZ;
        sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftBucketQueue(isAnchor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalSize=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", priorityBucket=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZJ() {
        return this.LIZ.get() <= 0;
    }

    public final DATA LJIIIZ() {
        Iterator<Map.Entry<Integer, LinkedList<DATA>>> it2 = this.LIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            LinkedList<DATA> value = it2.next().getValue();
            if (!value.isEmpty()) {
                DATA data = (DATA) C19719612Di.LJJIIZI(value);
                if (value.isEmpty()) {
                    it2.remove();
                }
                if (C1133910fc5.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("pollFirst, item = ");
                    sbLIZ.append(data);
                    C1133910fc5.LJ("GiftBucketQueueAbs", C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LIZ.decrementAndGet();
                return data;
            }
            it2.remove();
        }
        this.LIZ.set(0L);
        return null;
    }

    public final long LJIIJJI() {
        return this.LIZ.get();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [DATA, java.lang.Object] */
    public final synchronized DATA LIZIZ(Function1<? super DATA, Boolean> function1) {
        if (LIZJ()) {
            return null;
        }
        if (this.LIZJ.isEmpty()) {
            this.LIZ.set(0L);
            return null;
        }
        Iterator<Map.Entry<Integer, LinkedList<DATA>>> it2 = this.LIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            LinkedList<DATA> value = it2.next().getValue();
            if (!value.isEmpty()) {
                for (DATA data : value) {
                    if (function1 != null) {
                        if (function1.invoke(data).booleanValue()) {
                            return data;
                        }
                    } else {
                        return data;
                    }
                }
            } else {
                it2.remove();
            }
        }
        return null;
    }

    public final synchronized void LIZLLL(Function1<? super DATA, C1140170fmB> function1) {
        if (this.LIZJ.isEmpty()) {
            this.LIZ.set(0L);
            return;
        }
        Iterator<Map.Entry<Integer, LinkedList<DATA>>> it2 = this.LIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            LinkedList<DATA> value = it2.next().getValue();
            if (value.isEmpty()) {
                it2.remove();
            } else {
                Iterator<DATA> it3 = value.iterator();
                while (it3.hasNext()) {
                    C1140170fmB c1140170fmBInvoke = function1.invoke(it3.next());
                    if (c1140170fmBInvoke.LIZ) {
                        it3.remove();
                        this.LIZ.decrementAndGet();
                    }
                    if (!c1140170fmBInvoke.LIZIZ) {
                        if (value.isEmpty()) {
                            it2.remove();
                        }
                        return;
                    }
                }
                if (value.isEmpty()) {
                    it2.remove();
                }
            }
        }
    }

    public final synchronized void LJFF(DATA data) {
        if (LJI(data)) {
            this.LIZ.incrementAndGet();
        }
    }

    public final synchronized DATA LJII(Function1<? super DATA, C1140170fmB> function1) {
        DATA dataLJIIIIZZ;
        if (LIZJ()) {
            return null;
        }
        if (function1 == null) {
            dataLJIIIIZZ = LJIIIZ();
        } else {
            dataLJIIIIZZ = LJIIIIZZ(function1);
        }
        return dataLJIIIIZZ;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [DATA, java.lang.Object] */
    public final DATA LJIIIIZZ(Function1<? super DATA, C1140170fmB> function1) {
        if (this.LIZJ.isEmpty()) {
            this.LIZ.set(0L);
            return null;
        }
        Iterator<Map.Entry<Integer, LinkedList<DATA>>> it2 = this.LIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            LinkedList<DATA> value = it2.next().getValue();
            if (value.isEmpty()) {
                it2.remove();
            } else {
                Iterator<DATA> it3 = value.iterator();
                while (it3.hasNext()) {
                    DATA next = it3.next();
                    C1140170fmB c1140170fmBInvoke = function1.invoke(next);
                    if (C1133910fc5.LIZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("pollByCondition, conditionResult = ");
                        sbLIZ.append(c1140170fmBInvoke);
                        C1133910fc5.LJ("GiftBucketQueueAbs", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (c1140170fmBInvoke.LIZ) {
                        it3.remove();
                        this.LIZ.decrementAndGet();
                    }
                    if (!c1140170fmBInvoke.LIZIZ) {
                        if (value.isEmpty()) {
                            it2.remove();
                        }
                        if (!c1140170fmBInvoke.LIZJ) {
                            return null;
                        }
                        return next;
                    }
                }
                if (value.isEmpty()) {
                    it2.remove();
                }
            }
        }
        return null;
    }

    public final synchronized void LJIIJ(int i) {
        if (LIZJ()) {
            return;
        }
        if (i <= 0) {
            return;
        }
        if (this.LIZJ.isEmpty()) {
            this.LIZ.set(0L);
            return;
        }
        if (i >= LJIIJJI()) {
            LIZ();
            return;
        }
        Iterator<Map.Entry<Integer, LinkedList<DATA>>> it2 = this.LIZJ.descendingMap().entrySet().iterator();
        int size = 0;
        while (it2.hasNext()) {
            int i2 = i - size;
            if (i2 <= 0) {
                return;
            }
            LinkedList<DATA> value = it2.next().getValue();
            if (!value.isEmpty()) {
                if (i2 >= value.size()) {
                    size += value.size();
                    this.LIZ.addAndGet(-value.size());
                    it2.remove();
                } else {
                    value.subList(value.size() - i2, value.size()).clear();
                    this.LIZ.addAndGet(-i2);
                    size += i2;
                }
            } else {
                it2.remove();
            }
        }
    }
}
