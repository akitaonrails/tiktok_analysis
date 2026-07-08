package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01S4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.data.ReadReceiptRepo$subscribe$job$1$1$1", f = "ReadReceiptRepo.kt", l = {}, m = "invokeSuspend")
public final class C01S4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, C872090YJb> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<C872090YJb, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01S4(String str, Map map, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
        this.LLILLJJLI = str;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01S4(this.LLILLJJLI, this.LL, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReadReceiptRepo@2b40.subscribe$job$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C872090YJb c872090YJb = this.LL.get(this.LLILLJJLI);
        if (c872090YJb != null) {
            this.LLILLL.invoke(c872090YJb);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReadReceiptRepo@2b40.subscribe$job$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
