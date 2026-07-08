package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pipo.cashier.common.bind.api.BindResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uYU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.bind.CashierBindPaymentMethodHelper$requestNewBindInfo$1$1$1", f = "CashierBindPaymentMethodHelper.kt", l = {}, m = "invokeSuspend")
public final class C1708280uYU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0X52<BindResponse> LL;
    public final /* synthetic */ BindResponse LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1708270uYT LLILZ;
    public final /* synthetic */ C1708320uYY LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ C1708990uZd LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ C1708220uYO LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1708280uYU(C0X52<BindResponse> c0x52, BindResponse bindResponse, String str, InterfaceC1708270uYT interfaceC1708270uYT, C1708320uYY c1708320uYY, Context context, C1708990uZd c1708990uZd, String str2, C1708220uYO c1708220uYO, InterfaceC1364105Vn<? super C1708280uYU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0x52;
        this.LLILLJJLI = bindResponse;
        this.LLILLL = str;
        this.LLILZ = interfaceC1708270uYT;
        this.LLILZIL = c1708320uYY;
        this.LLILZLL = context;
        this.LLIZ = c1708990uZd;
        this.LLIZLLLIL = str2;
        this.LLJ = c1708220uYO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1708280uYU(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0215  */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.Map] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1708280uYU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
