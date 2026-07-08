package X;

import com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundDraftService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09qk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aiplayground.logic.AIPlaygroundLogicComponent$autoSaveDraft$1", f = "AIPlaygroundLogicComponent.kt", l = {296}, m = "invokeSuspend")
public final class C2498809qk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C381630Exl LLILLJJLI;
    public final /* synthetic */ CreativeModel LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2498809qk(C381630Exl c381630Exl, CreativeModel creativeModel, String str, InterfaceC1364105Vn<? super C2498809qk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c381630Exl;
        this.LLILLL = creativeModel;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2498809qk(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strZ1;
        C1C7U.LIZ("AIPlaygroundLogicComponent@6c52.autoSaveDraft$1");
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
            AIGCGenerationParam aIGCGenerationParam = this.LLILLJJLI.LLILZLL;
            if (aIGCGenerationParam != null) {
                strZ1 = aIGCGenerationParam.imagePath;
            } else {
                strZ1 = null;
            }
            if (strZ1 == null || strZ1.length() == 0) {
                strZ1 = this.LLILLJJLI.Z1(this.LLILLL.creativeInfo);
            }
            if (strZ1.length() == 0) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AIPlaygroundLogicComponent@6c52.autoSaveDraft$1");
                return unit;
            }
            IAIPlaygroundDraftService iAIPlaygroundDraftServiceLIZ = C07GW.LIZ();
            if (iAIPlaygroundDraftServiceLIZ != null) {
                String str = this.LLILZ;
                String str2 = this.LLILLJJLI.LLJ;
                CreativeModel creativeModel = this.LLILLL;
                this.LL = 1;
                if (iAIPlaygroundDraftServiceLIZ.LIZ(str, strZ1, str2, creativeModel, strZ1, this) == objLJFF) {
                    C1C7U.LIZIZ("AIPlaygroundLogicComponent@6c52.autoSaveDraft$1");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIPlaygroundLogicComponent@6c52.autoSaveDraft$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
