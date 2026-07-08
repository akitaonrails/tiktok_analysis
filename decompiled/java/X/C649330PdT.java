package X;

import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PdT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649330PdT extends C09AY implements Function0<TemplateData> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ C649300PdQ LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ DynamicPatch LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C649330PdT(Map<String, ? extends Object> map, C649300PdQ c649300PdQ, boolean z, DynamicPatch dynamicPatch, boolean z2) {
        super(0);
        this.LL = map;
        this.LLILLJJLI = c649300PdQ;
        this.LLILLL = z;
        this.LLILZ = dynamicPatch;
        this.LLILZIL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TemplateData invoke() {
        TemplateData templateDataLJII;
        C830490Whz c830490Whz = new C830490Whz();
        Map<String, Object> map = this.LL;
        if (map != null) {
            c830490Whz.putAll(map);
        }
        this.LLILLJJLI.LJII(c830490Whz);
        if (this.LLILLL && C703302op.LIZ(this.LLILZ.getRawData())) {
            C647380PaK c647380PaK = C647380PaK.LJIIIIZZ;
            DynamicPatch dynamicPatch = this.LLILZ;
            C1537480q70 c1537480q70LJIIJJI = this.LLILLJJLI.LJIIJJI();
            c647380PaK.getClass();
            templateDataLJII = C647380PaK.LIZIZ(dynamicPatch, c830490Whz, c1537480q70LJIIJJI);
        } else {
            templateDataLJII = TemplateData.LJII(c830490Whz);
        }
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
            templateDataLJII.LJIILIIL("isLogin", 1);
        } else {
            templateDataLJII.LJIILIIL("isLogin", 0);
        }
        if (ComplianceServiceProvider.LJI().P9()) {
            templateDataLJII.LJIILIIL("enable_manage_search_entry", 1);
        }
        templateDataLJII.LJIILIIL("enable_visual_search", Integer.valueOf(C673080Qag.LIZIZ() ? 1 : 0));
        C649190PdF.LIZ.getClass();
        if (C649190PdF.LIZIZ == 2 && !this.LLILZIL) {
            templateDataLJII.LIZJ = "allSearchDataProcess";
        }
        return templateDataLJII;
    }
}
