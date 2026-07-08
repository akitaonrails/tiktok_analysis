package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import v7.o;

/* JADX INFO: renamed from: X.090c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.chunk.ChunkPreloadDeferredManager$deferredToTask$1", f = "ChunkPreloadDeferredManager.kt", l = {992}, m = "invokeSuspend")
public final class C23016090c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C05XL<C1515820pY4<Object>> LLILLL;
    public final /* synthetic */ o<C1515820pY4<Object>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23016090c(C05XL<C1515820pY4<Object>> c05xl, o<C1515820pY4<Object>> oVar, InterfaceC1364105Vn<? super C23016090c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c05xl;
        this.LLILZ = oVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C23016090c c23016090c = new C23016090c(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c23016090c.LLILLJJLI = obj;
        return c23016090c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Exception runtimeException;
        C1C7U.LIZ("ChunkPreloadDeferredManager@81a.deferredToTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C05XL<C1515820pY4<Object>> c05xl = this.LLILLL;
                this.LL = 1;
                obj = c05xl.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ChunkPreloadDeferredManager@81a.deferredToTask$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C1515820pY4) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        o<C1515820pY4<Object>> oVar = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            oVar.LIZJ((C1515820pY4<Object>) c098200Yq);
        }
        o<C1515820pY4<Object>> oVar2 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            if (thM5exceptionOrNullimpl instanceof Exception) {
                runtimeException = (Exception) thM5exceptionOrNullimpl;
            } else {
                runtimeException = null;
            }
            if (runtimeException == null) {
                runtimeException = new RuntimeException(thM5exceptionOrNullimpl);
            }
            oVar2.LIZIZ(runtimeException);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChunkPreloadDeferredManager@81a.deferredToTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
