package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.viewmodel.PcsIndustrySelectVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06M3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.viewmodel.PcsIndustrySelectVM$submitSelection$2", f = "PcsIndustrySelectVM.kt", l = {291}, m = "invokeSuspend")
public final class C06M3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PcsIndustrySelectVM LLILLJJLI;
    public final /* synthetic */ C1784660wXg LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06M3(PcsIndustrySelectVM pcsIndustrySelectVM, C1784660wXg c1784660wXg, InterfaceC1364105Vn<? super C06M3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsIndustrySelectVM;
        this.LLILLL = c1784660wXg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06M3(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsIndustrySelectVM@8dd7.submitSelection$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLILLJJLI;
            final long j = this.LLILLL.LLILLL;
            AbstractC1777520wMA abstractC1777520wMA = new AbstractC1777520wMA(j) { // from class: X.06MX
                public final long LIZ;

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof C06MX) && this.LIZ == ((C06MX) obj2).LIZ;
                }

                public final int hashCode() {
                    return C786410Ut5.Y2(this.LIZ);
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ShowBadgeRemovalDialog(industryId=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = j;
                }
            };
            this.LL = 1;
            if (c2252331DDr.emit(abstractC1777520wMA, this) == objLJFF) {
                C1C7U.LIZIZ("PcsIndustrySelectVM@8dd7.submitSelection$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsIndustrySelectVM@8dd7.submitSelection$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
