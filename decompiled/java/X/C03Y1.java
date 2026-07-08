package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Y1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.tts.sku.us.ISkuBottomCommon$oneClickPay$1$1", f = "ISkuBottomCommon.kt", l = {466, 470, 472}, m = "invokeSuspend")
public final class C03Y1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC954103oB LLILLL;
    public final /* synthetic */ C04E4 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03Y1(InterfaceC954103oB interfaceC954103oB, C04E4 c04e4, InterfaceC1364105Vn<? super C03Y1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC954103oB;
        this.LLILZ = c04e4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03Y1(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03Y1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
