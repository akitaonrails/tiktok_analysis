package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.config.AIPortraitConfigKt$AI_PORTRAIT_CONFIG$5$5", f = "AIPortraitConfig.kt", l = {102}, m = "invokeSuspend")
public final class C545900Lb2 extends C09AX implements Function2<CreativeModel, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C545900Lb2(InterfaceC1364105Vn<? super C545900Lb2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C545900Lb2 c545900Lb2 = new C545900Lb2(interfaceC1364105Vn);
        c545900Lb2.LLILLJJLI = obj;
        return c545900Lb2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJI;
        AIPortraitContextModel aIPortraitContextModel;
        AIPortraitGeneratingModel aIPortraitGeneratingModel;
        C1C7U.LIZ("AIPortraitConfigKt@d663.AI_PORTRAIT_CONFIG$5$5");
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
            CreativeModel creativeModel = (CreativeModel) this.LLILLJJLI;
            this.LL = 1;
            AIPortraitModel aIPortraitModel = creativeModel.aigcBusinessModel.aiPortraitModel;
            if (aIPortraitModel == null || (aIPortraitContextModel = aIPortraitModel.contextModel) == null || (aIPortraitGeneratingModel = aIPortraitContextModel.generatingModel) == null || (objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C0LOU(aIPortraitGeneratingModel, null))) != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("AIPortraitConfigKt@d663.AI_PORTRAIT_CONFIG$5$5");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitConfigKt@d663.AI_PORTRAIT_CONFIG$5$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreativeModel creativeModel, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(creativeModel, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
