package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.business.AutofillHostContent;

/* JADX INFO: renamed from: X.0udb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillManager", f = "AutofillManager.kt", l = {79, 81}, m = "doPrepareAutofill")
public final class C1711450udb extends AbstractC23140094w {
    public AutofillHostContent LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1711440uda LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1711450udb(C1711440uda c1711440uda, InterfaceC1364105Vn<? super C1711450udb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1711440uda;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutofillManager@bbf4.doPrepareAutofill$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("AutofillManager@bbf4.doPrepareAutofill$1");
        return objLIZ;
    }
}
