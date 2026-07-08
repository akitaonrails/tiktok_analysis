package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.api.BaseSignResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillManager$tryAutofill$1$1$1$1", f = "AutofillManager.kt", l = {}, m = "invokeSuspend")
public final class C1702720uPW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1711360udS LL;
    public final /* synthetic */ C0X52<BaseSignResponse> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702720uPW(InterfaceC1711360udS interfaceC1711360udS, C0X52<BaseSignResponse> c0x52, InterfaceC1364105Vn<? super C1702720uPW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1711360udS;
        this.LLILLJJLI = c0x52;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702720uPW(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C1C7U.LIZ("AutofillManager@bbf4.tryAutofill$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1711360udS interfaceC1711360udS = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("api failed: ");
        C0X52<BaseSignResponse> c0x52 = this.LLILLJJLI;
        if (c0x52 != null) {
            numLJ = C2286608xc.LJ(c0x52.LIZ.LIZIZ);
        } else {
            numLJ = null;
        }
        sbLIZ.append(numLJ);
        interfaceC1711360udS.LIZIZ(0, "get_pi_list", C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutofillManager@bbf4.tryAutofill$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
