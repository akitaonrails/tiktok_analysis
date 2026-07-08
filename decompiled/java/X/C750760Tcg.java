package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.ComplianceVM;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tcg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.ComplianceVM$setTTAEToggleStatus$1", f = "ComplianceVM.kt", l = {157}, m = "invokeSuspend")
public final class C750760Tcg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ComplianceVM LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750760Tcg(ComplianceVM complianceVM, int i, boolean z, InterfaceC1364105Vn<? super C750760Tcg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = complianceVM;
        this.LLILLL = i;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C750760Tcg(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("ComplianceVM@1f9d.setTTAEToggleStatus$1");
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
                String strValueOf = String.valueOf(this.LLILLL);
                this.LL = 1;
                obj = iCommercializeComplianceApi.setAudienceExtensionPA(strValueOf, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ComplianceVM@1f9d.setTTAEToggleStatus$1");
                    return objLJFF;
                }
            }
            if (((BaseResponse) obj).status_code != 0) {
                ComplianceVM complianceVM = this.LLILLJJLI;
                if (!this.LLILZ) {
                    z = true;
                } else {
                    z = false;
                }
                complianceVM.vQ2(z);
                this.LLILLJJLI.LLILZLL.postValue("update_ttae_toggle_fail");
            } else {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(this.LLILLL, "new_value");
                C20684815ws.LJIILLIIL("ttae_toggle_switch_change", c2344009Gk.LIZ);
                this.LLILLJJLI.LLILZLL.postValue("update_ttae_toggle_success");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.vQ2(!this.LLILZ);
            this.LLILLJJLI.LLILZLL.postValue("update_ttae_toggle_fail");
            C1022620cia.LIZIZ("setTTAEToggleStatus", e.toString());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComplianceVM@1f9d.setTTAEToggleStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
