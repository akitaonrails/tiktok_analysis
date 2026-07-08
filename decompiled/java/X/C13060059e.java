package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.059e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.awemepool.SearchAwemePoolUltraProMax$createDualStreamModel$2$build$1$2$2$loadMore$2$1$3$1", f = "SearchAwemePoolUltraProMax.kt", l = {}, m = "invokeSuspend")
public final class C13060059e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Throwable LL;
    public final /* synthetic */ Function1<Exception, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13060059e(Throwable th, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LL = th;
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13060059e(this.LL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAwemePoolUltraProMax@5df8.createDualStreamModel$2$build$1$2$2$loadMore$2$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Throwable th = this.LL;
        if ((th instanceof Exception) && th != null) {
            this.LLILLJJLI.invoke((Exception) th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAwemePoolUltraProMax@5df8.createDualStreamModel$2$build$1$2$2$loadMore$2$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
