package X;

import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09qA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.nextstep.interceptor.Check4KVideoInterceptor$showToastOnMain$2", f = "Check4KVideoInterceptor.kt", l = {}, m = "invokeSuspend")
public final class C2495209qA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2494909q7 LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2495209qA(C2494909q7 c2494909q7, int i, InterfaceC1364105Vn<? super C2495209qA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2494909q7;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2495209qA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Check4KVideoInterceptor@473b.showToastOnMain$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19EG c19eg = this.LL.LL;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(this.LLILLJJLI);
        creativeToastBuilder.isTuxToastLegacy(true);
        C1390380mHk.LIZ(c19eg, 3047, creativeToastBuilder);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Check4KVideoInterceptor@473b.showToastOnMain$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
