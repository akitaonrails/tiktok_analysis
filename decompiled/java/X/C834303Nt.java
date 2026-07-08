package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Nt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.helper.OrderSubmitSoftInterceptAssemHelper$syncFetchBillInfo$1", f = "OrderSubmitSoftInterceptAssemHelper.kt", l = {293}, m = "invokeSuspend")
public final class C834303Nt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C833803No LLILLJJLI;
    public final /* synthetic */ BillInfoRequest LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ C05XL<Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C834303Nt(C833803No c833803No, BillInfoRequest billInfoRequest, C013C c013c, C05XL<Boolean> c05xl, InterfaceC1364105Vn<? super C834303Nt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c833803No;
        this.LLILLL = billInfoRequest;
        this.LLILZ = c013c;
        this.LLILZIL = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C834303Nt(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C834303Nt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
