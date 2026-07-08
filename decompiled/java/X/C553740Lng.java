package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.DraftMigrateState;
import com.ss.android.ugc.aweme.services.draft.IDraftMigrateStateService;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder$onBind$3", f = "DraftBoxNormalItemViewHolder.kt", l = {166, 169}, m = "invokeSuspend")
public final class C553740Lng extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DraftBoxNormalItemViewHolder LLILLJJLI;
    public final /* synthetic */ C0M0P LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553740Lng(DraftBoxNormalItemViewHolder draftBoxNormalItemViewHolder, C0M0P c0m0p, boolean z, boolean z2, int i, InterfaceC1364105Vn<? super C553740Lng> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftBoxNormalItemViewHolder;
        this.LLILLL = c0m0p;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C553740Lng(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        DraftMigrateState draftMigrateStateQueryDraftMigrateState;
        Object objLJI = obj;
        C1C7U.LIZ("DraftBoxNormalItemViewHolder@feeb.onBind$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJI);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DraftBoxNormalItemViewHolder@feeb.onBind$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            DraftBoxNormalItemViewHolder draftBoxNormalItemViewHolder = this.LLILLJJLI;
            C0M0P c0m0p = this.LLILLL;
            this.LL = 1;
            draftBoxNormalItemViewHolder.getClass();
            objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C553730Lnf(draftBoxNormalItemViewHolder, c0m0p, null));
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("DraftBoxNormalItemViewHolder@feeb.onBind$3");
                return objLJFF;
            }
        }
        AwemeDraft awemeDraft = (AwemeDraft) objLJI;
        DraftBoxNormalItemViewHolder draftBoxNormalItemViewHolder2 = this.LLILLJJLI;
        C0M0P c0m0p2 = this.LLILLL;
        IDraftMigrateStateService iDraftMigrateStateService = (IDraftMigrateStateService) draftBoxNormalItemViewHolder2.LLJLL.getValue();
        if (iDraftMigrateStateService == null || (draftMigrateStateQueryDraftMigrateState = iDraftMigrateStateService.queryDraftMigrateState(c0m0p2.LJ)) == null) {
            draftMigrateStateQueryDraftMigrateState = DraftMigrateState.WAIT_MIGRATE;
        }
        if (awemeDraft != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C554800LpO c554800LpO = new C554800LpO(this.LLILZ, awemeDraft, this.LLILLL, this.LLILLJJLI, draftMigrateStateQueryDraftMigrateState, this.LLILZIL, this.LLILZLL, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c554800LpO) == objLJFF) {
                C1C7U.LIZIZ("DraftBoxNormalItemViewHolder@feeb.onBind$3");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxNormalItemViewHolder@feeb.onBind$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
