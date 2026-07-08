package X;

import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Bw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.ui.login.ComposeLoginRichTextKt$rememberEmailConsentPrivacyText$1$1", f = "ComposeLoginRichText.kt", l = {}, m = "invokeSuspend")
public final class C1313005Bw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05P0<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1313005Bw(C05P0<String> c05p0, InterfaceC1364105Vn<? super C1313005Bw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1313005Bw(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJFF;
        C1C7U.LIZ("ComposeLoginRichTextKt@8a09.rememberEmailConsentPrivacyText$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C05P0<String> c05p0 = this.LL;
        IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
        if (iPNSChangeRegionService == null || (strLJFF = iPNSChangeRegionService.LJFF()) == null) {
            strLJFF = "";
        }
        c05p0.setValue(strLJFF);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComposeLoginRichTextKt@8a09.rememberEmailConsentPrivacyText$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
