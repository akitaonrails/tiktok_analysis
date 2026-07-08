package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.DraftMigrateState;
import com.ss.android.ugc.aweme.services.draft.IDraftMigrateStateService;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LkC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder$onBind$3", f = "DraftBoxTaskItemViewHolder.kt", l = {182, 185}, m = "invokeSuspend")
public final class C551580LkC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DraftBoxTaskItemViewHolder LLILLJJLI;
    public final /* synthetic */ C0M0P LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C551580LkC(DraftBoxTaskItemViewHolder draftBoxTaskItemViewHolder, C0M0P c0m0p, InterfaceC1364105Vn<? super C551580LkC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftBoxTaskItemViewHolder;
        this.LLILLL = c0m0p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C551580LkC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        DraftMigrateState draftMigrateStateQueryDraftMigrateState;
        Object objLJI = obj;
        C1C7U.LIZ("DraftBoxTaskItemViewHolder@8ae8.onBind$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJI);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DraftBoxTaskItemViewHolder@8ae8.onBind$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            DraftBoxTaskItemViewHolder draftBoxTaskItemViewHolder = this.LLILLJJLI;
            C0M0P c0m0p = this.LLILLL;
            this.LL = 1;
            draftBoxTaskItemViewHolder.getClass();
            objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C551540Lk8(draftBoxTaskItemViewHolder, c0m0p, null));
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("DraftBoxTaskItemViewHolder@8ae8.onBind$3");
                return objLJFF;
            }
        }
        AwemeDraft awemeDraft = (AwemeDraft) objLJI;
        DraftBoxTaskItemViewHolder draftBoxTaskItemViewHolder2 = this.LLILLJJLI;
        C0M0P c0m0p2 = this.LLILLL;
        IDraftMigrateStateService iDraftMigrateStateService = (IDraftMigrateStateService) draftBoxTaskItemViewHolder2.LLLF.getValue();
        if (iDraftMigrateStateService == null || (draftMigrateStateQueryDraftMigrateState = iDraftMigrateStateService.queryDraftMigrateState(c0m0p2.LJ)) == null) {
            draftMigrateStateQueryDraftMigrateState = DraftMigrateState.WAIT_MIGRATE;
        }
        if (awemeDraft != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C553720Lne c553720Lne = new C553720Lne(this.LLILLJJLI, awemeDraft, draftMigrateStateQueryDraftMigrateState, this.LLILLL, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c553720Lne) == objLJFF) {
                C1C7U.LIZIZ("DraftBoxTaskItemViewHolder@8ae8.onBind$3");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxTaskItemViewHolder@8ae8.onBind$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
