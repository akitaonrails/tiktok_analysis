package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.0xws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838720xws implements InterfaceC1838630xwj {
    public final Function0<Unit> LL;
    public Throwable LLILLL;
    public final Object LLILLJJLI = new Object();
    public List<C1838730xwt<?>> LLILZ = new ArrayList();
    public List<C1838730xwt<?>> LLILZIL = new ArrayList();
    public final C1514410pVn LLILZLL = new C1514410pVn(0);

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final InterfaceC23272099y getKey() {
        return InterfaceC1838630xwj.LIZJ;
    }

    public C1838720xws(AwS574S0100000_30 awS574S0100000_30) {
        this.LL = awS574S0100000_30;
    }

    public final void LJ(long j) {
        Object c098200Yq;
        synchronized (this.LLILLJJLI) {
            try {
                List<C1838730xwt<?>> list = this.LLILZ;
                this.LLILZ = this.LLILZIL;
                this.LLILZIL = list;
                this.LLILZLL.set(0);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C1838730xwt<?> c1838730xwt = list.get(i);
                    InterfaceC1364105Vn<?> interfaceC1364105Vn = c1838730xwt.LIZIZ;
                    try {
                        c098200Yq = c1838730xwt.LIZ.invoke(Long.valueOf(j));
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    interfaceC1364105Vn.resumeWith(c098200Yq);
                }
                list.clear();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(InterfaceC23272099y<E> interfaceC23272099y) {
        return (E) C09A1.LIZIZ(this, interfaceC23272099y);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y) {
        return C09A1.LIZJ(this, interfaceC23272099y);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return C09A1.LIZLLL(this, coroutineContext);
    }

    public static final void LIZJ(C1838720xws c1838720xws, Throwable th) {
        synchronized (c1838720xws.LLILLJJLI) {
            try {
                if (c1838720xws.LLILLL != null) {
                    return;
                }
                c1838720xws.LLILLL = th;
                List<C1838730xwt<?>> list = c1838720xws.LLILZ;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC1364105Vn<?> interfaceC1364105Vn = list.get(i).LIZIZ;
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC1364105Vn.resumeWith(c098200Yq);
                }
                c1838720xws.LLILZ.clear();
                c1838720xws.LLILZLL.set(0);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // X.InterfaceC1838630xwj
    public final Object LJLZ(InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        boolean z;
        Function0<Unit> function0;
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C1838730xwt<?> c1838730xwt = new C1838730xwt<>(function1, c2252611DEt);
        synchronized (this.LLILLJJLI) {
            try {
                Throwable th = this.LLILLL;
                if (th != null) {
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    c2252611DEt.resumeWith(c098200Yq);
                } else {
                    if (!this.LLILZ.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LLILZ.add(c1838730xwt);
                    if (!z) {
                        this.LLILZLL.set(1);
                    }
                    boolean z2 = true ^ z;
                    c2252611DEt.LJJII(new AwS393S0200000_27(this, (C1838720xws) c1838730xwt, (C1838730xwt<Object>) 1));
                    if (z2 && (function0 = this.LL) != null) {
                        try {
                            function0.invoke();
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            LIZJ(this, th2);
                        }
                    }
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) C09A1.LIZ(this, r, function2);
    }
}
