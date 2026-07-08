package X;

import com.bytedance.pipo.ttpay.recharge.RechargeViewmodel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0utq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.ttpay.recharge.RechargeViewmodel$consultRecharge$2", f = "RechargeViewmodel.kt", l = {263, 286, 295, 305}, m = "invokeSuspend")
public final class C1721520utq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ RechargeViewmodel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1721520utq(RechargeViewmodel rechargeViewmodel, InterfaceC1364105Vn<? super C1721520utq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = rechargeViewmodel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1721520utq c1721520utq = new C1721520utq(this.LLILLL, interfaceC1364105Vn);
        c1721520utq.LLILLJJLI = obj;
        return c1721520utq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146 A[Catch: all -> 0x0164, TRY_ENTER, TryCatch #0 {all -> 0x0164, blocks: (B:82:0x015b, B:83:0x015e, B:53:0x00e1, B:54:0x00e4, B:56:0x00e8, B:61:0x00f2, B:63:0x00fc, B:65:0x0106, B:66:0x0108, B:68:0x0110, B:70:0x011c, B:71:0x011e, B:73:0x0129, B:79:0x0146, B:13:0x0032, B:15:0x004f, B:16:0x0051, B:18:0x0057, B:19:0x0059, B:21:0x0061, B:22:0x0065, B:24:0x006b, B:25:0x006f, B:27:0x0075, B:28:0x0079, B:30:0x007f, B:31:0x0081, B:33:0x0087, B:34:0x0089, B:36:0x008f, B:37:0x0091, B:39:0x009f, B:40:0x00a1), top: B:96:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0178  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1721520utq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
