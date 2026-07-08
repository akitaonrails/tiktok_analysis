package X;

import Y.AgS193S0200000_2;
import com.ss.android.ugc.aweme.external.AVDraftMigrateServiceImpl;
import com.ss.android.ugc.aweme.services.draft.IDraftMigrateFlowService;
import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Mc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.AVDraftMigrateServiceImpl$observeM2DraftMigrationResult$1", f = "AVDraftMigrateServiceImpl.kt", l = {154}, m = "invokeSuspend")
public final class C1339605Mc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IDraftMigrateFlowService LLILLJJLI;
    public final /* synthetic */ AVDraftMigrateServiceImpl LLILLL;
    public final /* synthetic */ C19EG LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1339605Mc(IDraftMigrateFlowService iDraftMigrateFlowService, AVDraftMigrateServiceImpl aVDraftMigrateServiceImpl, C19EG c19eg, InterfaceC1364105Vn<? super C1339605Mc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iDraftMigrateFlowService;
        this.LLILLL = aVDraftMigrateServiceImpl;
        this.LLILZ = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1339605Mc(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AVDraftMigrateServiceImpl@f318.observeM2DraftMigrationResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<MigrateTaskStatus> taskStatus = this.LLILLJJLI.getTaskStatus();
            AgS193S0200000_2 agS193S0200000_2 = new AgS193S0200000_2(this.LLILLL, this.LLILZ, 2);
            this.LL = 1;
            if (taskStatus.collect(agS193S0200000_2, this) == objLJFF) {
                C1C7U.LIZIZ("AVDraftMigrateServiceImpl@f318.observeM2DraftMigrationResult$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
