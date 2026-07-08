package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0R1C, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.chunk.ChunkPreloadDeferredManager$preloadTask$1", f = "ChunkPreloadDeferredManager.kt", l = {}, m = "invokeSuspend")
public final class C0R1C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Function0<C15O7<C1515820pY4<Object>>> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C675200Qe6<Object> LLILZ;
    public final /* synthetic */ C05XL<C1515820pY4<Object>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0R1C(Function0<? extends C15O7<C1515820pY4<Object>>> function0, String str, C675200Qe6<Object> c675200Qe6, C05XL<C1515820pY4<Object>> c05xl, InterfaceC1364105Vn<? super C0R1C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function0;
        this.LLILLL = str;
        this.LLILZ = c675200Qe6;
        this.LLILZIL = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0R1C c0r1c = new C0R1C(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0r1c.LL = obj;
        return c0r1c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("ChunkPreloadDeferredManager@81a.preloadTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function0<C15O7<C1515820pY4<Object>>> function0 = this.LLILLJJLI;
        String str = this.LLILLL;
        try {
            c098200Yq = (C15O7) function0.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (c098200Yq != null) {
            C189200o6.m2constructorimpl(c098200Yq);
            final C675200Qe6<Object> c675200Qe6 = this.LLILZ;
            final C05XL<C1515820pY4<Object>> c05xl = this.LLILZIL;
            final String str2 = this.LLILLL;
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                ((C15O7) c098200Yq).LJI(new InterfaceC2385309Wh() { // from class: X.0R1D
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o7) {
                        C1C7U.LIZ("ChunkPreloadDeferredManager@81a.preloadTask$1$2$1");
                        if (!c15o7.LJIILL() && !c15o7.LJIILIIL() && c15o7.LJIIL() != null) {
                            c05xl.LJIIZILJ((C1515820pY4<Object>) c15o7.LJIIL());
                        } else {
                            C2191431Aph c2191431Aph = C2191431Aph.LIZ;
                            C675200Qe6<Object> c675200Qe62 = c675200Qe6;
                            C05XL<C1515820pY4<Object>> c05xl2 = c05xl;
                            c2191431Aph.getClass();
                            C2191431Aph.LJIIJ(c675200Qe62, c05xl2);
                            C05XL<C1515820pY4<Object>> c05xl3 = c05xl;
                            Exception excLJIIJJI = c15o7.LJIIJJI();
                            if (excLJIIJJI == null) {
                                excLJIIJJI = new Exception(str2);
                            }
                            c05xl3.LJJJJJ(excLJIIJJI);
                        }
                        C1C7U.LIZIZ("ChunkPreloadDeferredManager@81a.preloadTask$1$2$1");
                        return c15o7;
                    }
                });
            }
            C675200Qe6<Object> c675200Qe62 = this.LLILZ;
            C05XL<C1515820pY4<Object>> c05xl2 = this.LLILZIL;
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C2191431Aph.LIZ.getClass();
                C2191431Aph.LJIIJ(c675200Qe62, c05xl2);
                c05xl2.LJJJJJ(thM5exceptionOrNullimpl);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ChunkPreloadDeferredManager@81a.preloadTask$1");
            return unit;
        }
        str.toString();
        throw new IllegalStateException(str);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
