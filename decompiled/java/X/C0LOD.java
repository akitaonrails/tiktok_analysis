package X;

import com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LOD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.config.AIPortraitCloudDraftNavigateHandlers$generationFailureNavigation$localDraft$1", f = "AIPortraitCloudDraftNavigateHandlers.kt", l = {116}, m = "invokeSuspend")
public final class C0LOD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public int LL;
    public final /* synthetic */ AIGCDraft LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LOD(AIGCDraft aIGCDraft, InterfaceC1364105Vn<? super C0LOD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGCDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LOD(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitCloudDraftNavigateHandlers@c600.generationFailureNavigation$localDraft$1");
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
            C548590LfN.LIZ.getClass();
            DraftService draftServiceLIZ = C548590LfN.LIZ();
            AIGCDraft aIGCDraft = this.LLILLJJLI;
            InterfaceC546090LbL interfaceC546090LbL = aIGCDraft.businessKey;
            String str = aIGCDraft.serverTaskId;
            C0LOJ c0loj = new C0LOJ(true, C306490Bzr.LIZ());
            this.LL = 1;
            obj = draftServiceLIZ.LJII(interfaceC546090LbL, str, c0loj, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIPortraitCloudDraftNavigateHandlers@c600.generationFailureNavigation$localDraft$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AIPortraitCloudDraftNavigateHandlers@c600.generationFailureNavigation$localDraft$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
