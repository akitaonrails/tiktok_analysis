package X;

import com.bytedance.pipo.ttpay.recharge.RechargeViewmodel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0utm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.ttpay.recharge.RechargeViewmodel$getCashierBasicInfo$3", f = "RechargeViewmodel.kt", l = {117}, m = "invokeSuspend")
public final class C1721480utm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public RechargeViewmodel LL;
    public InterfaceC497601wk LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ Map<String, Long> LLILZIL;
    public final /* synthetic */ RechargeViewmodel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1721480utm(Map<String, Long> map, RechargeViewmodel rechargeViewmodel, InterfaceC1364105Vn<? super C1721480utm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = map;
        this.LLILZLL = rechargeViewmodel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1721480utm c1721480utm = new C1721480utm(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1721480utm.LLILZ = obj;
        return c1721480utm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0270  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1721480utm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
