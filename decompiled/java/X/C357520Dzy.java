package X;

import com.ss.android.ugc.aweme.api.ITemplateService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS4S0400100_5;

/* JADX INFO: renamed from: X.0Dzy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357520Dzy extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C357450Dzr LLILLJJLI;
    public final /* synthetic */ C0FQS LLILLL;
    public final /* synthetic */ InterfaceC357510Dzx LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ InterfaceC1364105Vn<C358620E4e> LLILZLL;
    public final /* synthetic */ C357460Dzs LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C357520Dzy(boolean z, C357450Dzr c357450Dzr, C0FQS c0fqs, InterfaceC357510Dzx interfaceC357510Dzx, long j, InterfaceC1364105Vn<? super C358620E4e> interfaceC1364105Vn, C357460Dzs c357460Dzs) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c357450Dzr;
        this.LLILLL = c0fqs;
        this.LLILZ = interfaceC357510Dzx;
        this.LLILZIL = j;
        this.LLILZLL = interfaceC1364105Vn;
        this.LLIZ = c357460Dzs;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0FQT c0fqtLJJ;
        C013C c013c = new C013C();
        c013c.element = this.LL;
        C357450Dzr c357450Dzr = this.LLILLJJLI;
        ITemplateService iTemplateService = (ITemplateService) ServiceManager.get().getService(ITemplateService.class);
        if (iTemplateService != null) {
            C0FQS c0fqs = this.LLILLL;
            c0fqtLJJ = iTemplateService.LJJ(c0fqs, new AwS4S0400100_5(this.LLILZ, (InterfaceC357510Dzx) this.LLILZIL, (long) this.LLILZLL, (InterfaceC1364105Vn<? super C358620E4e>) c013c, (C013C) c0fqs, (C0FQS) 0), new AwS214S0300000_5(this.LLILZ, (InterfaceC357510Dzx) this.LLILZLL, (InterfaceC1364105Vn<? super C358620E4e>) this.LLILLL, (C0FQS) 2), new AwS371S0200000_5(this.LLIZ, this.LLILZ, 11));
        } else {
            c0fqtLJJ = null;
        }
        c357450Dzr.LJIIIZ = c0fqtLJJ;
        return Unit.LIZ;
    }
}
