package X;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05l4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.tiktok.kmp.fcp.supplier.FcpPolicySupplierImpl$handleApplyResult$1$1$1", f = "FcpPolicySupplierImpl.kt", l = {}, m = "invokeSuspend")
public final class C1444405l4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Set<String> LL;
    public final /* synthetic */ InterfaceC1444205l2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1444405l4(Set<String> set, InterfaceC1444205l2 interfaceC1444205l2, InterfaceC1364105Vn<? super C1444405l4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = set;
        this.LLILLJJLI = interfaceC1444205l2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1444405l4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FcpPolicySupplierImpl@c44d.handleApplyResult$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.LJII(this.LL.contains(this.LLILLJJLI.getIdentifier()));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FcpPolicySupplierImpl@c44d.handleApplyResult$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
