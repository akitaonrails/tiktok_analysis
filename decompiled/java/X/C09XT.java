package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundDraftService;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09XT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.helper.ClickDraftHelper$clickAIPlaygroundDraft$4", f = "ClickDraftHelper.kt", l = {372}, m = "invokeSuspend")
public final class C09XT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C09AE>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<C0LSZ> LLILLL;
    public final /* synthetic */ EditorProAIGCMediaItemModel LLILZ;
    public final /* synthetic */ C259800zU<AwemeDraft> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09XT(List<C0LSZ> list, EditorProAIGCMediaItemModel editorProAIGCMediaItemModel, C259800zU<AwemeDraft> c259800zU, InterfaceC1364105Vn<? super C09XT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = editorProAIGCMediaItemModel;
        this.LLILZIL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C09XT c09xt = new C09XT(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c09xt.LLILLJJLI = obj;
        return c09xt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("ClickDraftHelper@c135.clickAIPlaygroundDraft$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IAIPlaygroundDraftService iAIPlaygroundDraftServiceLIZ = C07GW.LIZ();
            if (iAIPlaygroundDraftServiceLIZ != null) {
                iAIPlaygroundDraftServiceLIZ.LIZIZ(this.LLILZ, this.LLILLL);
            }
            C259800zU<AwemeDraft> c259800zU = this.LLILZIL;
            AwemeDraft awemeDraft = c259800zU.element;
            CreativeFlowData creativeFlowData = awemeDraft.LJJJJIZL.creativeFlowData;
            if (creativeFlowData != null) {
                awemeDraft.LIZ.creativeFlowData = creativeFlowData;
            }
            EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = this.LLILZ;
            IAIPlaygroundDraftService iAIPlaygroundDraftServiceLIZ2 = C07GW.LIZ();
            if (iAIPlaygroundDraftServiceLIZ2 != null) {
                String strLIZ = c259800zU.element.LIZ();
                String str = editorProAIGCMediaItemModel.mediaFilePath;
                AwemeDraft awemeDraft2 = c259800zU.element;
                String str2 = awemeDraft2.LJJJJIZL.shootWay;
                CreativeModel creativeModel = awemeDraft2.LIZ;
                String str3 = awemeDraft2.LJJJJIZL.videoCoverPath;
                this.LL = 1;
                if (iAIPlaygroundDraftServiceLIZ2.LIZ(strLIZ, str, str2, creativeModel, str3, this) == objLJFF) {
                    C1C7U.LIZIZ("ClickDraftHelper@c135.clickAIPlaygroundDraft$4");
                    return objLJFF;
                }
            } else {
                unit = null;
                C189200o6.m2constructorimpl(unit);
                AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C09XC(this.LLILZIL, null), 3);
                C1C7U.LIZIZ("ClickDraftHelper@c135.clickAIPlaygroundDraft$4");
                return anonymousClass0956LIZLLL;
            }
        }
        unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        AnonymousClass0956 anonymousClass0956LIZLLL2 = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C09XC(this.LLILZIL, null), 3);
        C1C7U.LIZIZ("ClickDraftHelper@c135.clickAIPlaygroundDraft$4");
        return anonymousClass0956LIZLLL2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C09AE> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
