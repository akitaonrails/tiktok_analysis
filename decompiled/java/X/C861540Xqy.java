package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xqy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.conflicts.RecordConflictsManagementComponent$onCreate$1", f = "RecordConflictsManagementComponent.kt", l = {58}, m = "invokeSuspend")
public final class C861540Xqy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1652260t68 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861540Xqy(C1652260t68 c1652260t68, InterfaceC1364105Vn<? super C861540Xqy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1652260t68;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861540Xqy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0951 anonymousClass0951LJI;
        C1C7U.LIZ("RecordConflictsManagementComponent@e1ce.onCreate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            BusinessCapabilityService.LIZ.getClass();
            BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
            if (businessCapabilityServiceLIZ != null && (anonymousClass0951LJI = businessCapabilityServiceLIZ.LJI()) != null) {
                AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 22);
                this.LL = 1;
                if (anonymousClass0951LJI.collect(agS295S0100000_14, this) == objLJFF) {
                    C1C7U.LIZIZ("RecordConflictsManagementComponent@e1ce.onCreate$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RecordConflictsManagementComponent@e1ce.onCreate$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
