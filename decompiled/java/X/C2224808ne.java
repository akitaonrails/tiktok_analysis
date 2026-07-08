package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillManager$prepareAutofill$1", f = "AutofillManager.kt", l = {64, 65, 69}, m = "invokeSuspend")
public final class C2224808ne extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2224808ne(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2224808ne(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutofillManager@bbf4.prepareAutofill$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AutofillManager@bbf4.prepareAutofill$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1711440uda c1711440uda = C1711440uda.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = c1711440uda.LIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AutofillManager@bbf4.prepareAutofill$1");
                return objLJFF;
            }
        }
        if (obj == null) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C2224608nc c2224608nc = new C2224608nc(null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c2224608nc) == objLJFF) {
                C1C7U.LIZIZ("AutofillManager@bbf4.prepareAutofill$1");
                return objLJFF;
            }
        } else {
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C2224708nd c2224708nd = new C2224708nd(null);
            this.LL = 3;
            if (C23250099c.LJI(this, abstractC2238408pq2, c2224708nd) == objLJFF) {
                C1C7U.LIZIZ("AutofillManager@bbf4.prepareAutofill$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AutofillManager@bbf4.prepareAutofill$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
