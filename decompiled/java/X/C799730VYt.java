package X;

import Y.ARunnableS113S0100000_13;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lego.common.LegoHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0VYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799730VYt extends AbstractC799790VYz implements Handler.Callback {
    public boolean LL = true;
    public boolean LLILLJJLI = true;
    public final LegoHandler LLILLL = new LegoHandler(this);
    public final RunnableC799770VYx LLILZ;
    public final RunnableC799760VYw LLILZIL;

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LJFF() {
    }

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LJI() {
    }

    public final void LJ() {
        C799900VZk.LIZ.getClass();
        final C0CCZ c0cczLIZJ = C799900VZk.LIZIZ.LIZJ(EnumC799870VZh.IDLE);
        if (c0cczLIZJ != null) {
            if (C799900VZk.LJFF().LJIIJJI()) {
                this.LL = false;
                C786410Ut5.LJLIIL(500L, C799570VYd.LIZJ(), this.LLILZ);
            }
            C799570VYd.LJFF(c0cczLIZJ.serialExecute()).execute(new Runnable() { // from class: X.0VYs
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        System.currentTimeMillis();
                        C799900VZk.LIZ.getClass();
                        C799900VZk.LIZIZ.LJ(c0cczLIZJ);
                        this.LLILLL.LJ(1200);
                        System.currentTimeMillis();
                        C2104108Md.LIZLLL(C799900VZk.LJFF().context());
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0VYx] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VYw] */
    public C799730VYt() {
        C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.0VYu
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                C0CCZ c0ccz;
                if (this.LL.LL && C0CP9.LIZ()) {
                    this.LL.LJ();
                } else {
                    C799900VZk.LIZ.getClass();
                    if (C799900VZk.LJFF().LJ()) {
                        C799730VYt c799730VYt = this.LL;
                        if (c799730VYt.LLILLJJLI) {
                            C799880VZi c799880VZi = C799900VZk.LIZIZ;
                            synchronized (c799880VZi.LIZIZ) {
                                try {
                                    Map<EnumC799870VZh, List<InterfaceC800080Va2>> map = c799880VZi.LIZIZ;
                                    EnumC799870VZh enumC799870VZh = EnumC799870VZh.IDLE;
                                    if (!((Collection) ((ConcurrentHashMap) map).get(enumC799870VZh)).isEmpty()) {
                                        C118300cf c118300cf = new C118300cf();
                                        Iterator it2 = ((Iterable) ((ConcurrentHashMap) c799880VZi.LIZIZ).get(enumC799870VZh)).iterator();
                                        while (it2.hasNext()) {
                                            if (((InterfaceC800080Va2) it2.next()) instanceof InterfaceC799780VYy) {
                                                InterfaceC800080Va2 interfaceC800080Va2 = (InterfaceC800080Va2) ((List) ((ConcurrentHashMap) c799880VZi.LIZIZ).get(EnumC799870VZh.IDLE)).remove(c118300cf.element);
                                                synchronized (c799880VZi.LIZJ) {
                                                    try {
                                                        Object obj = ((ConcurrentHashMap) c799880VZi.LIZJ).get(C799750VYv.LIZ((C0CCZ) interfaceC800080Va2));
                                                        if (obj == null) {
                                                            "Required value was null.".toString();
                                                            throw new IllegalArgumentException("Required value was null.");
                                                        }
                                                        ((List) obj).add(interfaceC800080Va2);
                                                    } finally {
                                                        TryCatchGuardChecker.doCheck(th);
                                                    }
                                                }
                                                c0ccz = (C0CCZ) interfaceC800080Va2;
                                            } else {
                                                c118300cf.element++;
                                            }
                                        }
                                        c0ccz = null;
                                    } else {
                                        c0ccz = null;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            c799730VYt.LIZLLL(c0ccz, false);
                            return true;
                        }
                    }
                }
                return true;
            }
        }, Looper.myQueue());
        this.LLILZ = new Runnable() { // from class: X.0VYx
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.LL.LL = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        this.LLILZIL = new Runnable() { // from class: X.0VYw
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.LL.LLILLJJLI = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
    }

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        long j;
        super.LIZ(interfaceC800080Va2);
        C799900VZk.LIZ.getClass();
        if (!C799900VZk.LJFF().LJIIJJI() && C799900VZk.LIZIZ.LIZ(EnumC799870VZh.IDLE)) {
            this.LLILLL.LJ(1200);
        }
        if (C799900VZk.LJFF().LJ() && C799900VZk.LIZIZ.LIZIZ()) {
            if (C0CP9.LIZ()) {
                j = 400;
            } else {
                j = 200;
            }
            this.LLILLL.LJFF(1209, j);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        long j;
        C799900VZk.LIZ.getClass();
        if (!C799900VZk.LJFF().LJIIJJI()) {
            LJ();
        }
        if (C799900VZk.LJFF().LJ() && message.what == 1209) {
            if (C0CP9.LIZ()) {
                j = 400;
            } else {
                j = 200;
            }
            C799880VZi c799880VZi = C799900VZk.LIZIZ;
            c799880VZi.getClass();
            ArrayList arrayList = new ArrayList();
            synchronized (c799880VZi.LIZIZ) {
                try {
                    Map<EnumC799870VZh, List<InterfaceC800080Va2>> map = c799880VZi.LIZIZ;
                    EnumC799870VZh enumC799870VZh = EnumC799870VZh.IDLE;
                    if (!((Collection) ((ConcurrentHashMap) map).get(enumC799870VZh)).isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        int i = 0;
                        int i2 = 0;
                        for (InterfaceC800080Va2 interfaceC800080Va2 : (Iterable) ((ConcurrentHashMap) c799880VZi.LIZIZ).get(enumC799870VZh)) {
                            if (interfaceC800080Va2 instanceof InterfaceC799780VYy) {
                                ((InterfaceC799780VYy) interfaceC800080Va2).LJFF();
                                ((InterfaceC799780VYy) interfaceC800080Va2).LJ(Long.valueOf(((InterfaceC799780VYy) interfaceC800080Va2).LIZ() - j));
                                if (((InterfaceC799780VYy) interfaceC800080Va2).LIZ() <= 0) {
                                    arrayList2.add(Integer.valueOf(i2));
                                }
                            }
                            i2++;
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            InterfaceC800080Va2 interfaceC800080Va22 = (InterfaceC800080Va2) ((List) ((ConcurrentHashMap) c799880VZi.LIZIZ).get(EnumC799870VZh.IDLE)).remove(((Number) it2.next()).intValue() - i);
                            arrayList.add((C0CCZ) interfaceC800080Va22);
                            synchronized (c799880VZi.LIZJ) {
                                try {
                                    Object obj = ((ConcurrentHashMap) c799880VZi.LIZJ).get(C799750VYv.LIZ((C0CCZ) interfaceC800080Va22));
                                    if (obj != null) {
                                        ((List) obj).add(interfaceC800080Va22);
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                } finally {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                            i++;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                LIZLLL((C0CCZ) it3.next(), true);
            }
            C799900VZk.LIZ.getClass();
            if (C799900VZk.LIZIZ.LIZIZ()) {
                this.LLILLL.LJFF(1209, j);
            }
        }
        return true;
    }

    public final void LIZLLL(C0CCZ c0ccz, boolean z) {
        ExecutorService executorServiceLIZLLL;
        long j;
        if (c0ccz != null) {
            if (!z) {
                this.LLILLJJLI = false;
                if (C0CP9.LIZ()) {
                    j = 200;
                } else {
                    j = 100;
                }
                C786410Ut5.LJLIIL(j, C799570VYd.LIZJ(), this.LLILZIL);
            }
            C0VU1 c0vu1ThreadType = ((InterfaceC799780VYy) c0ccz).threadType();
            if (c0vu1ThreadType != null) {
                int i = C0VU6.LIZ[c0vu1ThreadType.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        executorServiceLIZLLL = C799570VYd.LJFF(c0ccz.serialExecute());
                    }
                } else {
                    executorServiceLIZLLL = C823050WQl.LIZLLL();
                }
                executorServiceLIZLLL.execute(new ARunnableS113S0100000_13(c0ccz, 28));
                return;
            }
            throw new C1954807lC();
        }
    }
}
