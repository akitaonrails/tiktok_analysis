package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.user.IQueryIMUserCallbackSingle$queryUser$2$4$onLoadMember$1", f = "IQueryIMUserCallbackSingle.kt", l = {}, m = "invokeSuspend")
public final class C462250IAt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC462200IAo LL;
    public final /* synthetic */ C1462005nu LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C462250IAt(InterfaceC462200IAo interfaceC462200IAo, C1462005nu c1462005nu, InterfaceC1364105Vn<? super C462250IAt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC462200IAo;
        this.LLILLJJLI = c1462005nu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C462250IAt(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IQueryIMUserCallbackSingle@d85a.queryUser$2$4$onLoadMember$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IQueryIMUserCallbackSingle@d85a.queryUser$2$4$onLoadMember$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
