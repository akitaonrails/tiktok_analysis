package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D28, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.fetcher.UcpAsyncFetcher$fetch$1$2", f = "UcpAsyncFetcher.kt", l = {}, m = "invokeSuspend")
public final class C0D28 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ C0D27<T> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D28(C0D27 c0d27, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = obj;
        this.LLILLJJLI = c0d27;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D28(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String message;
        C1C7U.LIZ("UcpAsyncFetcher@b048.fetch$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = "Unknown error";
        if (C189200o6.m8isSuccessimpl(this.LL)) {
            Object obj2 = this.LL;
            if (!C189200o6.m7isFailureimpl(obj2) && obj2 != null) {
                this.LLILLJJLI.LIZLLL.invoke((T) obj2);
            } else {
                this.LLILLJJLI.LJ.invoke("Unknown error");
            }
        } else {
            Function1<String, Unit> function1 = this.LLILLJJLI.LJ;
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(this.LL);
            if (thM5exceptionOrNullimpl != null && (message = thM5exceptionOrNullimpl.getMessage()) != null) {
                str = message;
            }
            function1.invoke(str);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UcpAsyncFetcher@b048.fetch$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
