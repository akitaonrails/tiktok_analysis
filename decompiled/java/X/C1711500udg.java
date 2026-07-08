package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0udg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillViewModel$fetchCardNumber$2", f = "AutofillViewModel.kt", l = {74}, m = "invokeSuspend")
public final class C1711500udg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AutofillViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1711500udg(AutofillViewModel autofillViewModel, String str, String str2, String str3, InterfaceC1364105Vn<? super C1711500udg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = autofillViewModel;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1711500udg c1711500udg = new C1711500udg(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1711500udg.LLILLJJLI = obj;
        return c1711500udg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b7 A[Catch: all -> 0x01d4, TryCatch #1 {all -> 0x01d4, blocks: (B:65:0x0173, B:68:0x0179, B:77:0x018b, B:79:0x0191, B:80:0x0193, B:82:0x019c, B:90:0x01c2, B:91:0x01cc, B:88:0x01ac, B:89:0x01b7, B:42:0x0118, B:44:0x011c, B:46:0x0120, B:50:0x0128, B:52:0x012c, B:56:0x0134, B:58:0x0138, B:61:0x013e), top: B:107:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e8  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1711500udg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
