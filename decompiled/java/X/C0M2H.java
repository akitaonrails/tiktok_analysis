package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M2H, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.inappush.DraftSavedPushManager$handleDraftSaved$2", f = "DraftSavedPushManager.kt", l = {102, 104}, m = "invokeSuspend")
public final class C0M2H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AwemeDraft LLILLJJLI;
    public final /* synthetic */ Runnable LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M2H(AwemeDraft awemeDraft, Runnable runnable, InterfaceC1364105Vn<? super C0M2H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = awemeDraft;
        this.LLILLL = runnable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M2H(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("DraftSavedPushManager@f873.handleDraftSaved$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DraftSavedPushManager@f873.handleDraftSaved$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZ);
        } else {
            C155000ia.LIZIZ(objLIZ);
            C0M2F c0m2f = C0M2F.LIZ;
            this.LL = 1;
            objLIZ = c0m2f.LIZ(this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("DraftSavedPushManager@f873.handleDraftSaved$2");
                return objLJFF;
            }
        }
        String strLIZIZ = C562270M3l.LIZIZ(this.LLILLJJLI);
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C562350M3t c562350M3t = new C562350M3t(this.LLILLL, (C0M2L) objLIZ, strLIZIZ, this.LLILLJJLI, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c562350M3t) == objLJFF) {
            C1C7U.LIZIZ("DraftSavedPushManager@f873.handleDraftSaved$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftSavedPushManager@f873.handleDraftSaved$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
