package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.common.datamodel.TTAEToggleModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.ComplianceVM;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tcn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.ComplianceVM$getTTAEToggleStatus$1", f = "ComplianceVM.kt", l = {133}, m = "invokeSuspend")
public final class C750830Tcn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ComplianceVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750830Tcn(ComplianceVM complianceVM, InterfaceC1364105Vn<? super C750830Tcn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = complianceVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C750830Tcn(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ComplianceVM@1f9d.getTTAEToggleStatus$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                ICommercializeComplianceApi iCommercializeComplianceApi = this.LLILLJJLI.LL;
                this.LL = 1;
                obj = iCommercializeComplianceApi.getAudienceExtensionPA(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ComplianceVM@1f9d.getTTAEToggleStatus$1");
                    return objLJFF;
                }
            }
            TTAEToggleModel tTAEToggleModel = (TTAEToggleModel) obj;
            if (tTAEToggleModel.status_code == 0) {
                this.LLILLJJLI.LLIZ.postValue(tTAEToggleModel);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1022620cia.LIZIZ("getTTAEToggleStatus", e.toString());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComplianceVM@1f9d.getTTAEToggleStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
