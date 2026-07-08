package X;

import com.bytedance.im.core.proto.Request;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xtf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.retry.LoopingNetworkRequestRetryScheduler$insertRequest$2", f = "NetworkRequestRetryScheduler.kt", l = {}, m = "invokeSuspend")
public final class C863210Xtf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C863980Xuu LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Request LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863210Xtf(C863980Xuu c863980Xuu, String str, Request request, InterfaceC1364105Vn<? super C863210Xtf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c863980Xuu;
        this.LLILLJJLI = str;
        this.LLILLL = request;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863210Xtf(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoopingNetworkRequestRetryScheduler@4605.insertRequest$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(this.LL.LIZIZ.LJI(this.LLILLJJLI, this.LLILLL, System.currentTimeMillis()));
        C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.insertRequest$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
