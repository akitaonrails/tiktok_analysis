package X;

import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdpartyadconsent.viewmodel.ThirdPartyAdConsentViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0TQZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TQZ extends C09AY implements Function2<View, C1391990mKL, Unit> {
    public final /* synthetic */ ThirdPartyAdConsentViewModel LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TQZ(ThirdPartyAdConsentViewModel thirdPartyAdConsentViewModel, int i, int i2) {
        super(2);
        this.LL = thirdPartyAdConsentViewModel;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, C1391990mKL c1391990mKL) {
        C1391990mKL c1391990mKL2 = c1391990mKL;
        ThirdPartyAdConsentViewModel thirdPartyAdConsentViewModel = this.LL;
        AFwS199S0000000_12 aFwS199S0000000_12 = AFwS199S0000000_12.get$arr$(526);
        thirdPartyAdConsentViewModel.getClass();
        try {
            ((ICommercializeComplianceApi) thirdPartyAdConsentViewModel.LL.getValue()).report3PConsentPromptConsent().enqueue(new C1769206wM(aFwS199S0000000_12, 3));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("report3PConsentPromptConsent exception: ");
            sbLIZ.append(e.getMessage());
            C1022620cia.LIZ("ThirdPartyAdReConsentPrompt", C2188811AlT.LIZIZ(sbLIZ));
        }
        C746520TQc c746520TQc = C746520TQc.LIZ;
        int i = this.LLILLJJLI;
        int i2 = this.LLILLL;
        c746520TQc.getClass();
        C746520TQc.LIZ(i, i2, 0);
        C746520TQc.LIZIZ = true;
        c1391990mKL2.LIZIZ = true;
        return Unit.LIZ;
    }
}
