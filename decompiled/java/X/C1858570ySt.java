package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.TakoMaskAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.mix.TakoAnswerMixAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.flowmarkdown.assem.TakoNewMarkdownAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.source.TakoReferenceAssem;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ySt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.preload.TakoViewPreload$preloadForTop1$1", f = "TakoViewPreload.kt", l = {}, m = "invokeSuspend")
public final class C1858570ySt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1858570ySt(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC1364105Vn<? super C1858570ySt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = z4;
        this.LLILZIL = z5;
        this.LLILZLL = z6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1858570ySt(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        Object c098200Yq5;
        C1C7U.LIZ("TakoViewPreload@2e88.preloadForTop1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            C1858450ySh.LIZ.getClass();
            AtomicReference<TakoAnswerMixAssem> atomicReference = C1858450ySh.LIZLLL;
            if (atomicReference.get() == null) {
                try {
                    System.currentTimeMillis();
                    TakoAnswerMixAssem takoAnswerMixAssem = new TakoAnswerMixAssem();
                    System.currentTimeMillis();
                    while (!atomicReference.compareAndSet(null, takoAnswerMixAssem) && atomicReference.get() == null) {
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
        if (this.LLILLJJLI) {
            C1858450ySh.LIZ.getClass();
            if (C1858450ySh.LJ.compareAndSet(false, true)) {
                try {
                    System.currentTimeMillis();
                    C1918907fP.LIZ();
                    System.currentTimeMillis();
                    c098200Yq5 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq5);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq5 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq5);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq5) != null) {
                    C1858450ySh.LJ.set(false);
                }
            }
        }
        if (this.LLILLL) {
            C1858450ySh.LIZ.getClass();
            AtomicReference<TakoReferenceAssem> atomicReference2 = C1858450ySh.LJFF;
            if (atomicReference2.get() == null) {
                try {
                    System.currentTimeMillis();
                    TakoReferenceAssem takoReferenceAssem = new TakoReferenceAssem();
                    System.currentTimeMillis();
                    while (!atomicReference2.compareAndSet(null, takoReferenceAssem) && atomicReference2.get() == null) {
                    }
                    c098200Yq4 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq4);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq4 = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq4);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq4);
            }
        }
        if (this.LLILZ) {
            C1858450ySh.LIZ.getClass();
            AtomicReference<TakoNewMarkdownAssem> atomicReference3 = C1858450ySh.LJI;
            if (atomicReference3.get() == null) {
                try {
                    System.currentTimeMillis();
                    TakoNewMarkdownAssem takoNewMarkdownAssem = new TakoNewMarkdownAssem();
                    System.currentTimeMillis();
                    while (!atomicReference3.compareAndSet(null, takoNewMarkdownAssem) && atomicReference3.get() == null) {
                    }
                    c098200Yq3 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    c098200Yq3 = new C098200Yq(th4);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq3);
            }
        }
        if (this.LLILZIL) {
            C1858450ySh.LIZ.getClass();
            AtomicReference<TakoMaskAssem> atomicReference4 = C1858450ySh.LJII;
            if (atomicReference4.get() == null) {
                try {
                    System.currentTimeMillis();
                    TakoMaskAssem takoMaskAssem = new TakoMaskAssem();
                    System.currentTimeMillis();
                    while (!atomicReference4.compareAndSet(null, takoMaskAssem) && atomicReference4.get() == null) {
                    }
                    c098200Yq2 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    c098200Yq2 = new C098200Yq(th5);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            }
        }
        if (this.LLILZLL) {
            C1858450ySh.LIZ.getClass();
            if (C1858450ySh.LJIIIIZZ.compareAndSet(false, true)) {
                try {
                    System.currentTimeMillis();
                    int i = C1859250yTz.LIZ;
                    System.currentTimeMillis();
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th6) {
                    TryCatchGuardChecker.doCheck(th6);
                    c098200Yq = new C098200Yq(th6);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    C1858450ySh.LJIIIIZZ.set(false);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoViewPreload@2e88.preloadForTop1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
