package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.094B, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
public final class C094B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C094N<? extends Unit>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AnonymousClass0955<Object> LLILLL;
    public final /* synthetic */ Object LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C094B(AnonymousClass0955<Object> anonymousClass0955, Object obj, InterfaceC1364105Vn<? super C094B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass0955;
        this.LLILZ = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C094B c094b = new C094B(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c094b.LLILLJJLI = obj;
        return c094b;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object c094m;
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
                AnonymousClass0955<Object> anonymousClass0955 = this.LLILLL;
                Object obj2 = this.LLILZ;
                this.LL = 1;
                if (anonymousClass0955.LJIJI(obj2, this) == objLJFF) {
                    return objLJFF;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            c094m = Unit.LIZ;
        } else {
            c094m = new C094M(C189200o6.m5exceptionOrNullimpl(c098200Yq));
        }
        return new C094N(c094m);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C094N<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
