package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vCL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.BaseECBillboardWidget$updateBillboard$1", f = "BaseECBillboardWidget.kt", l = {}, m = "invokeSuspend")
public final class C1732990vCL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1732690vBr LL;
    public final /* synthetic */ List<ECBillboard> LLILLJJLI;
    public final /* synthetic */ InterfaceC1731950vAf LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732990vCL(AbstractC1732690vBr abstractC1732690vBr, List<ECBillboard> list, InterfaceC1731950vAf interfaceC1731950vAf, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super C1732990vCL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1732690vBr;
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC1731950vAf;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1732990vCL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0124, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("unknown billboardType: ");
        r1.append(r3.billboardType);
        r2.LIZ(X.C2188811AlT.LIZIZ(r1));
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732990vCL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
