package X;

import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09XK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.helper.ClickDraftHelper$clickShootingI2vWithNewFramework$workflows$1", f = "ClickDraftHelper.kt", l = {214}, m = "invokeSuspend")
public final class C09XK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C552940LmO>>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<AwemeDraft> LLILLJJLI;
    public final /* synthetic */ C561130Lzb LLILLL;
    public final /* synthetic */ C0M0P LLILZ;
    public final /* synthetic */ C259800zU<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09XK(C259800zU<AwemeDraft> c259800zU, C561130Lzb c561130Lzb, C0M0P c0m0p, C259800zU<String> c259800zU2, InterfaceC1364105Vn<? super C09XK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c561130Lzb;
        this.LLILZ = c0m0p;
        this.LLILZIL = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09XK(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.ss.android.ugc.aweme.draft.model.AwemeDraft] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ClickDraftHelper@c135.clickShootingI2vWithNewFramework$workflows$1");
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
            this.LLILLJJLI.element = this.LLILLL.LIZLLL(this.LLILZ.LJ);
            C259800zU<String> c259800zU = this.LLILZIL;
            C556820Lse c556820Lse = C556820Lse.LIZ;
            AwemeDraft awemeDraft = this.LLILLJJLI.element;
            C0M0P c0m0p = this.LLILZ;
            c556820Lse.getClass();
            c259800zU.element = C556820Lse.LIZ(awemeDraft, c0m0p);
            AIGCWorkflowCreationService aIGCWorkflowCreationService = C556820Lse.LIZJ;
            if (aIGCWorkflowCreationService != null) {
                String str = this.LLILZ.LJ;
                this.LL = 1;
                obj = aIGCWorkflowCreationService.LJIILL(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ClickDraftHelper@c135.clickShootingI2vWithNewFramework$workflows$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("ClickDraftHelper@c135.clickShootingI2vWithNewFramework$workflows$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C552940LmO>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
