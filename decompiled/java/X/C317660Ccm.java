package X;

import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ccm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.ui.login.ComposeLoginRichTextKt$rememberPrivacyText$3$5$1", f = "ComposeLoginRichText.kt", l = {}, m = "invokeSuspend")
public final class C317660Ccm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C317660Ccm(InterfaceC1364105Vn<? super C317660Ccm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317660Ccm(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C1C7U.LIZ("ComposeLoginRichTextKt@8a09.rememberPrivacyText$3$5$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("enter_from", "signup_login_page");
        IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
        if (iPNSChangeRegionService != null) {
            numLJ = C2286608xc.LJ(iPNSChangeRegionService.LJIIL());
        } else {
            numLJ = null;
        }
        c2241008qG.LIZ.put("is_client_value", numLJ);
        C20684815ws.LJIJ("account_region_status_show", c2241008qG.LJ());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComposeLoginRichTextKt@8a09.rememberPrivacyText$3$5$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C317660Ccm(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
