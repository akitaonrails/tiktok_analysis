package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.062j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.UcpApiCache$getOrFetch$2$networkDeferred$1", f = "UcpApiCache.kt", l = {71}, m = "invokeSuspend")
public final class C15431062j<T> extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends T>>, Object> {
    public int LL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super C189200o6<? extends T>>, Object> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C05XL<C189200o6<T>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15431062j(Function1<? super InterfaceC1364105Vn<? super C189200o6<? extends T>>, ? extends Object> function1, String str, C05XL<C189200o6<T>> c05xl, InterfaceC1364105Vn<? super C15431062j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = str;
        this.LLILZ = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15431062j(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("UcpApiCache@c9da.getOrFetch$2$networkDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    Function1<InterfaceC1364105Vn<? super C189200o6<? extends T>>, Object> function1 = this.LLILLJJLI;
                    this.LL = 1;
                    obj = function1.invoke(this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("UcpApiCache@c9da.getOrFetch$2$networkDeferred$1");
                        return objLJFF;
                    }
                }
                c098200Yq = ((C189200o6) obj).m10unboximpl();
                if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                    C15433062l.LIZIZ.put(this.LLILLL, new C15437062p(c098200Yq, System.currentTimeMillis()));
                }
                this.LLILZ.LJIIZILJ(C189200o6.m1boximpl(c098200Yq));
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                C098200Yq c098200Yq2 = new C098200Yq(e);
                C189200o6.m2constructorimpl(c098200Yq2);
                if (!this.LLILZ.isCompleted()) {
                    this.LLILZ.LJIIZILJ(C189200o6.m1boximpl(c098200Yq2));
                }
                throw e;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                c098200Yq = new C098200Yq(e2);
                C189200o6.m2constructorimpl(c098200Yq);
                if (!this.LLILZ.isCompleted()) {
                    this.LLILZ.LJIIZILJ(C189200o6.m1boximpl(c098200Yq));
                }
            }
            C15433062l.LIZJ.remove(this.LLILLL);
            C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
            C1C7U.LIZIZ("UcpApiCache@c9da.getOrFetch$2$networkDeferred$1");
            return c189200o6M1boximpl;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C15433062l.LIZJ.remove(this.LLILLL);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, Object obj) {
        return ((a) create(interfaceC497601wk, (InterfaceC1364105Vn) obj)).invokeSuspend(Unit.LIZ);
    }
}
