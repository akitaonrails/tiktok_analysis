package X;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05bR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.lynx.hybrid.param.HybridContext$getInitDataRes$2$1", f = "HybridContext.kt", l = {469}, m = "invokeSuspend")
public final class C1384705bR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public int LL;
    public final /* synthetic */ C1537480q70 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1384705bR(C1537480q70 c1537480q70, InterfaceC1364105Vn<? super C1384705bR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1537480q70;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1384705bR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HybridContext@b38f.getInitDataRes$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0957<? extends Map<String, ? extends Object>> anonymousClass0957 = this.LLILLJJLI.initDataUrlDeferred;
            if (anonymousClass0957 != null) {
                this.LL = 1;
                obj = anonymousClass0957.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("HybridContext@b38f.getInitDataRes$2$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        AtomicReference<Map<String, Object>> atomicReference = this.LLILLJJLI.initDataRes;
        while (!atomicReference.compareAndSet(null, (Map<String, Object>) obj) && atomicReference.get() == null) {
        }
        Integer numLJ = C2286608xc.LJ(Log.i("initDataUrlTag", "deferred finished"));
        C1C7U.LIZIZ("HybridContext@b38f.getInitDataRes$2$1");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
