package X;

import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10M9, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.configuration.dialogs.ConsentBoxDialogAbility$realShow$2$1$1$onConsentRecordsUpdated$1", f = "ConsentBoxDialogAbility.kt", l = {96}, m = "invokeSuspend")
public final class C10M9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C10MB LLILLL;
    public final /* synthetic */ C10MA LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10M9(C10MB c10mb, C10MA c10ma, InterfaceC1364105Vn<? super C10M9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c10mb;
        this.LLILZ = c10ma;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C10M9 c10m9 = new C10M9(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c10m9.LLILLJJLI = obj;
        return c10m9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("ConsentBoxDialogAbility@35d3.realShow$2$1$1$onConsentRecordsUpdated$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("ConsentBoxDialogAbility@35d3.realShow$2$1$1$onConsentRecordsUpdated$1");
                return objLJFF;
            }
        }
        if (C2296808zG.LJI(interfaceC497601wk)) {
            C1912370zrf.LIZ.getClass();
            C1912370zrf.LIZJ();
            C10MF c10mf = this.LLILLL.LIZJ;
            if (c10mf != null) {
                c10mf.onEnd();
            }
            IPNSDeviceConsentService iPNSDeviceConsentService = (IPNSDeviceConsentService) this.LLILLL.LJFF.getValue();
            if (iPNSDeviceConsentService != null) {
                iPNSDeviceConsentService.LJIIIZ(this.LLILZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ConsentBoxDialogAbility@35d3.realShow$2$1$1$onConsentRecordsUpdated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
