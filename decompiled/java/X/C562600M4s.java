package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.fragment.EffectDraftEntranceViewHolder$bindData$1$1", f = "EffectDraftEntranceViewHolder.kt", l = {137}, m = "invokeSuspend")
public final class C562600M4s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ C1401480mZe LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C562600M4s(List<String> list, C1401480mZe c1401480mZe, InterfaceC1364105Vn<? super C562600M4s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c1401480mZe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C562600M4s(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AwemeDraft awemeDraft;
        List<AwemeDraft> listQueryDraftsInfoWithLimited;
        C1C7U.LIZ("EffectDraftEntranceViewHolder@7e74.bindData$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0M4M c0m4m = new C0M4M(false, false, EnumC562220M3g.NORMAL, new C562260M3k(EnumC562230M3h.EFFECT, this.LLILLJJLI, EnumC562250M3j.LIKE), 19);
            IAVDraftService iAVDraftService = (IAVDraftService) this.LLILLL.LLJ.getValue();
            if (iAVDraftService != null && (listQueryDraftsInfoWithLimited = iAVDraftService.queryDraftsInfoWithLimited(c0m4m, 1)) != null) {
                awemeDraft = (AwemeDraft) C13LP.LJJJLL(listQueryDraftsInfoWithLimited);
            } else {
                awemeDraft = null;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C562610M4t c562610M4t = new C562610M4t(awemeDraft, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c562610M4t) == objLJFF) {
                C1C7U.LIZIZ("EffectDraftEntranceViewHolder@7e74.bindData$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectDraftEntranceViewHolder@7e74.bindData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
