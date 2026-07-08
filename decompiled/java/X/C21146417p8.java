package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;

/* JADX INFO: renamed from: X.17p8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21146417p8 {
    public static final void LIZ(final int i, final String str) {
        List<InterfaceC21138617ns> listUnmodifiableList;
        ReentrantReadWriteLock.ReadLock lock = C21145717p1.LIZIZ.readLock();
        lock.lock();
        try {
            List<C21143617og> listLIZ = C21145717p1.LIZJ.LIZ(i);
            synchronized (listLIZ) {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (C21143617og c21143617og : listLIZ) {
                        if (Boolean.TRUE.booleanValue()) {
                            arrayList.add(c21143617og);
                        }
                    }
                    listUnmodifiableList = null;
                    if (!(!arrayList.isEmpty())) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((C21143617og) it2.next()).LJ);
                        }
                        listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            lock.unlock();
            if (listUnmodifiableList != null) {
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listUnmodifiableList, 10));
                for (final InterfaceC21138617ns interfaceC21138617ns : listUnmodifiableList) {
                    C0T98 c0t98 = new C0T98(interfaceC21138617ns, i, str) { // from class: X.17pD
                        public InterfaceC21138617ns LLILLJJLI;
                        public Integer LLILLL;
                        public String LLILZ;

                        @Override // X.C0T98
                        public final void LIZ() {
                            this.LLILLJJLI = null;
                            this.LLILLL = null;
                            this.LLILZ = null;
                        }

                        @Override // X.C0T98
                        public final void LIZIZ() {
                            Integer num;
                            Object c098200Yq;
                            InterfaceC21138617ns interfaceC21138617ns2 = this.LLILLJJLI;
                            if (interfaceC21138617ns2 == null || (num = this.LLILLL) == null) {
                                return;
                            }
                            int iIntValue = num.intValue();
                            String str2 = this.LLILZ;
                            if (str2 != null) {
                                System.currentTimeMillis();
                                try {
                                    InterfaceC21146617pA interfaceC21146617pA = C21145617p0.LIZ.LIZLLL;
                                    if (interfaceC21146617pA != null) {
                                        interfaceC21146617pA.LJIILJJIL();
                                    }
                                    interfaceC21138617ns2.LIZIZ(C21145617p0.LIZ.LIZ);
                                    c098200Yq = Unit.LIZ;
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                                    System.currentTimeMillis();
                                    InterfaceC21146617pA interfaceC21146617pA2 = C21145617p0.LIZ.LIZLLL;
                                    if (interfaceC21146617pA2 != null) {
                                        interfaceC21146617pA2.LJI();
                                    }
                                }
                                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                                if (thM5exceptionOrNullimpl != null) {
                                    C21145717p1.LJI(iIntValue, interfaceC21138617ns2);
                                    InterfaceC21146617pA interfaceC21146617pA3 = C21145617p0.LIZ.LIZLLL;
                                    if (interfaceC21146617pA3 != null) {
                                        interfaceC21146617pA3.LIZIZ(str2, thM5exceptionOrNullimpl);
                                    }
                                }
                            }
                        }

                        {
                            this.LLILLJJLI = interfaceC21138617ns;
                            this.LLILLL = Integer.valueOf(i);
                            this.LLILZ = str;
                        }
                    };
                    interfaceC21138617ns.LIZLLL(c0t98);
                    arrayList3.add(c0t98);
                }
                C21145617p0.LIZ.LIZJ.execute(new C01OY(arrayList3));
            }
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
