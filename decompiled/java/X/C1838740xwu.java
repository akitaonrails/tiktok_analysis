package X;

import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xwu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838740xwu implements InterfaceC1838630xwj {
    public final Choreographer LL;
    public final C1838750xwv LLILLJJLI;

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final InterfaceC23272099y getKey() {
        return InterfaceC1838630xwj.LIZJ;
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

    public C1838740xwu(Choreographer choreographer, C1838750xwv c1838750xwv) {
        this.LL = choreographer;
        this.LLILLJJLI = c1838750xwv;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.08bp, android.view.Choreographer$FrameCallback, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1838630xwj
    public final Object LJLZ(InterfaceC1364105Vn interfaceC1364105Vn, final Function1 function1) {
        C1838750xwv c1838750xwv = this.LLILLJJLI;
        if (c1838750xwv == null) {
            CoroutineContext.Element element = interfaceC1364105Vn.getContext().get(InterfaceC23139094v.LJJLIIJ);
            if (element instanceof C1838750xwv) {
                c1838750xwv = (C1838750xwv) element;
            } else {
                c1838750xwv = null;
            }
        }
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        ?? r3 = new Choreographer.FrameCallback(c2252611DEt, this, function1) { // from class: X.08bp
            public final /* synthetic */ InterfaceC20236714Gf<Object> LL;
            public final /* synthetic */ Function1<Long, Object> LLILLJJLI;

            {
                this.LLILLJJLI = function1;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object c098200Yq;
                InterfaceC20236714Gf<Object> interfaceC20236714Gf = this.LL;
                try {
                    c098200Yq = this.LLILLJJLI.invoke(Long.valueOf(j));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                interfaceC20236714Gf.resumeWith(c098200Yq);
            }
        };
        if (c1838750xwv != null && Intrinsics.LJFF(c1838750xwv.LL, this.LL)) {
            synchronized (c1838750xwv.LLILLL) {
                try {
                    c1838750xwv.LLILZIL.add((Choreographer.FrameCallback) r3);
                    if (!c1838750xwv.LLIZLLLIL) {
                        c1838750xwv.LLIZLLLIL = true;
                        c1838750xwv.LL.postFrameCallback(c1838750xwv.LLJ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c2252611DEt.LJJII(new AwS393S0200000_27(c1838750xwv, (ChoreographerFrameCallbackC2151508bp) r3, 2));
        } else {
            this.LL.postFrameCallback(r3);
            c2252611DEt.LJJII(new AwS393S0200000_27(this, (ChoreographerFrameCallbackC2151508bp) r3, 3));
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
