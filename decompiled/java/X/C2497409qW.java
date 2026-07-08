package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09qW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aiplayground.panel.component.AIPlaygroundGenerateComponent$tryCheckFaceAndGenerate$1", f = "AIPlaygroundGenerateComponent.kt", l = {194}, m = "invokeSuspend")
public final class C2497409qW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1851370yHH LLILLJJLI;
    public final /* synthetic */ AIGCGenerationParam LLILLL;
    public final /* synthetic */ List<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2497409qW(C1851370yHH c1851370yHH, AIGCGenerationParam aIGCGenerationParam, List<String> list, InterfaceC1364105Vn<? super C2497409qW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1851370yHH;
        this.LLILLL = aIGCGenerationParam;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2497409qW(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AIPlaygroundGenerateComponent@1d45.tryCheckFaceAndGenerate$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C2497309qV c2497309qV = new C2497309qV(this.LLILZ, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c2497309qV);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIPlaygroundGenerateComponent@1d45.tryCheckFaceAndGenerate$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.O4(this.LLILLL, ((Boolean) obj).booleanValue());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPlaygroundGenerateComponent@1d45.tryCheckFaceAndGenerate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
