package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ZC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.source.SourceExtKt$onInit$1", f = "SourceExt.kt", l = {}, m = "invokeSuspend")
public final class C05ZC extends C09AX implements Function2<C1263200iyc, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ Function1<C1263200iyc, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05ZC(C013C c013c, Function1<? super C1263200iyc, Unit> function1, InterfaceC1364105Vn<? super C05ZC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c013c;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05ZC c05zc = new C05ZC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c05zc.LL = obj;
        return c05zc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SourceExtKt@5a61.onInit$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1263200iyc c1263200iyc = (C1263200iyc) this.LL;
        C013C c013c = this.LLILLJJLI;
        if (c013c.element) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SourceExtKt@5a61.onInit$1");
            return unit;
        }
        boolean z = c1263200iyc.LIZ;
        c013c.element = z;
        if (z) {
            this.LLILLL.invoke(c1263200iyc);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SourceExtKt@5a61.onInit$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1263200iyc c1263200iyc, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c1263200iyc, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
