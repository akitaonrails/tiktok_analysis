package X;

import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0Nbw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.ui.login.ComposeLoginRichTextKt$rememberPrivacyText$1$1", f = "ComposeLoginRichText.kt", l = {}, m = "invokeSuspend")
public final class C597420Nbw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05P0<String> LL;
    public final /* synthetic */ C05P0<Integer> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597420Nbw(C05P0<String> c05p0, C05P0<Integer> c05p02, InterfaceC1364105Vn<? super C597420Nbw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05p0;
        this.LLILLJJLI = c05p02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597420Nbw(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJFF;
        IPNSConsentConfigService iPNSConsentConfigServiceLJIIIZ;
        String storeRegion;
        C1C7U.LIZ("ComposeLoginRichTextKt@8a09.rememberPrivacyText$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
        if (iPNSChangeRegionService == null || (strLJFF = iPNSChangeRegionService.LJFF()) == null) {
            strLJFF = "";
        }
        this.LL.setValue(strLJFF);
        if (C294580Bge.LIZ() && (iPNSConsentConfigServiceLJIIIZ = ComplianceServiceProvider.LJIIIZ()) != null) {
            AwS588S0100000_9 awS588S0100000_9 = new AwS588S0100000_9((C05P0) this.LLILLJJLI, (C05P0<Integer>) 696);
            if (iPNSChangeRegionService != null) {
                storeRegion = iPNSChangeRegionService.getStoreRegion();
            } else {
                storeRegion = null;
            }
            iPNSConsentConfigServiceLJIIIZ.LJ(storeRegion, awS588S0100000_9);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComposeLoginRichTextKt@8a09.rememberPrivacyText$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
