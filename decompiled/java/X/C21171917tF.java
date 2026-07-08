package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS169S0101000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.17tF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21171917tF extends AbstractRunnableC21172117tH {
    public final void LIZ() {
        C1553130qWF.LIZIZ(new AwS576S0100000_32(this, 877));
        try {
            this.LL.run();
            AtomicInteger atomicInteger = this.LL.LLILLJJLI;
            int iOrdinal = EnumC21164117rz.Running.ordinal();
            EnumC21164117rz enumC21164117rz = EnumC21164117rz.Finished;
            if (!atomicInteger.compareAndSet(iOrdinal, enumC21164117rz.ordinal())) {
                C1553130qWF.LIZIZ(new AwS576S0100000_32(this, 878));
                this.LL.LLILLJJLI.set(enumC21164117rz.ordinal());
            }
            C21172217tI c21172217tI = this.LLILLJJLI.get();
            if (c21172217tI == null) {
                C1553130qWF.LJFF(AFwS223S0000000_32.get$arr$(336));
                return;
            }
            LinkedList<AbstractRunnableC21164217s0> linkedList = c21172217tI.LL;
            synchronized (linkedList) {
                try {
                    C1553130qWF.LIZIZ(new AwS576S0100000_32(this, 879));
                    c21172217tI.LLILLJJLI.remove(Integer.valueOf(this.LL.LL));
                    Iterator<AbstractRunnableC21164217s0> it2 = linkedList.iterator();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (true) {
                        if (!it2.hasNext()) {
                            C1553130qWF.LIZIZ(new AwS433S0200000_32(c21172217tI, (C21172217tI) linkedList, (LinkedList<AbstractRunnableC21164217s0>) 85));
                            break;
                        }
                        AbstractRunnableC21164217s0 next = it2.next();
                        if (next.LLILLJJLI.get() != EnumC21164117rz.Waiting.ordinal()) {
                            C1553130qWF.LIZIZ(new AwS576S0100000_32(next, 880));
                            it2.remove();
                        } else {
                            Integer num = (Integer) ((LinkedHashMap) c21172217tI.LLILLL).get(Integer.valueOf(next.LL));
                            int iIntValue = num != null ? num.intValue() : 0;
                            if (linkedHashSet.contains(Integer.valueOf(next.LL))) {
                                C1553130qWF.LIZIZ(new AwS169S0101000_32(next, iIntValue, 15));
                            } else if (c21172217tI.LLILLJJLI.contains(Integer.valueOf(next.LL))) {
                                continue;
                            } else {
                                if (next.LLILZ - iIntValue == 1) {
                                    C1553130qWF.LIZIZ(new AwS169S0101000_32(next, iIntValue, 16));
                                    it2.remove();
                                    c21172217tI.execute(new C21171917tF(c21172217tI, next));
                                    break;
                                }
                                linkedHashSet.add(Integer.valueOf(next.LL));
                                C1553130qWF.LIZIZ(new AwS169S0101000_32(next, iIntValue, 17));
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            AtomicInteger atomicInteger2 = this.LL.LLILLJJLI;
            int iOrdinal2 = EnumC21164117rz.Running.ordinal();
            EnumC21164117rz enumC21164117rz2 = EnumC21164117rz.Finished;
            if (!atomicInteger2.compareAndSet(iOrdinal2, enumC21164117rz2.ordinal())) {
                C1553130qWF.LIZIZ(new AwS576S0100000_32(this, 878));
                this.LL.LLILLJJLI.set(enumC21164117rz2.ordinal());
            }
            C21172217tI c21172217tI2 = this.LLILLJJLI.get();
            if (c21172217tI2 == null) {
                C1553130qWF.LJFF(AFwS223S0000000_32.get$arr$(336));
                throw th2;
            }
            LinkedList<AbstractRunnableC21164217s0> linkedList2 = c21172217tI2.LL;
            synchronized (linkedList2) {
                try {
                    C1553130qWF.LIZIZ(new AwS576S0100000_32(this, 879));
                    c21172217tI2.LLILLJJLI.remove(Integer.valueOf(this.LL.LL));
                    Iterator<AbstractRunnableC21164217s0> it3 = linkedList2.iterator();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    while (true) {
                        if (!it3.hasNext()) {
                            C1553130qWF.LIZIZ(new AwS433S0200000_32(c21172217tI2, (C21172217tI) linkedList2, (LinkedList<AbstractRunnableC21164217s0>) 85));
                            break;
                        }
                        AbstractRunnableC21164217s0 next2 = it3.next();
                        if (next2.LLILLJJLI.get() != EnumC21164117rz.Waiting.ordinal()) {
                            C1553130qWF.LIZIZ(new AwS576S0100000_32(next2, 880));
                            it3.remove();
                        } else {
                            Integer num2 = (Integer) ((LinkedHashMap) c21172217tI2.LLILLL).get(Integer.valueOf(next2.LL));
                            int iIntValue2 = num2 != null ? num2.intValue() : 0;
                            if (linkedHashSet2.contains(Integer.valueOf(next2.LL))) {
                                C1553130qWF.LIZIZ(new AwS169S0101000_32(next2, iIntValue2, 15));
                            } else if (c21172217tI2.LLILLJJLI.contains(Integer.valueOf(next2.LL))) {
                                continue;
                            } else {
                                if (next2.LLILZ - iIntValue2 == 1) {
                                    C1553130qWF.LIZIZ(new AwS169S0101000_32(next2, iIntValue2, 16));
                                    it3.remove();
                                    c21172217tI2.execute(new C21171917tF(c21172217tI2, next2));
                                    break;
                                }
                                linkedHashSet2.add(Integer.valueOf(next2.LL));
                                C1553130qWF.LIZIZ(new AwS169S0101000_32(next2, iIntValue2, 17));
                            }
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    throw th3;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SequenceExecutionShell@d34d.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SequenceExecutionShell@d34d.run");
    }

    public C21171917tF(C21172217tI c21172217tI, AbstractRunnableC21164217s0 abstractRunnableC21164217s0) {
        super(c21172217tI, abstractRunnableC21164217s0);
        AtomicInteger atomicInteger = abstractRunnableC21164217s0.LLILLJJLI;
        int iOrdinal = EnumC21164117rz.Waiting.ordinal();
        EnumC21164117rz enumC21164117rz = EnumC21164117rz.Running;
        if (!atomicInteger.compareAndSet(iOrdinal, enumC21164117rz.ordinal())) {
            C1553130qWF.LIZIZ(new AwS576S0100000_32(abstractRunnableC21164217s0, 876));
            abstractRunnableC21164217s0.LLILLJJLI.set(enumC21164117rz.ordinal());
        }
        C1553130qWF.LIZIZ(new AwS433S0200000_32(c21172217tI, abstractRunnableC21164217s0, 84));
        c21172217tI.LLILLJJLI.add(Integer.valueOf(abstractRunnableC21164217s0.LL));
        c21172217tI.LLILLL.put(Integer.valueOf(abstractRunnableC21164217s0.LL), Integer.valueOf(abstractRunnableC21164217s0.LLILZ));
    }
}
