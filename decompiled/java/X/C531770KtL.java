package X;

import android.app.Activity;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KtL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.node.InitPipelineNodeKt$initPipelineNode$1", f = "InitPipelineNode.kt", l = {}, m = "invokeSuspend")
public final class C531770KtL extends C09AX implements Function2<C531780KtM, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C531770KtL(InterfaceC1364105Vn<? super C531770KtL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C531770KtL c531770KtL = new C531770KtL(interfaceC1364105Vn);
        c531770KtL.LL = obj;
        return c531770KtL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TemplateSourceConfig templateSourceConfigLIZLLL;
        C1C7U.LIZ("InitPipelineNodeKt@fb11.initPipelineNode$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C531780KtM c531780KtM = (C531780KtM) this.LL;
        Activity activity = c531780KtM.LIZ;
        if (c531780KtM.LIZIZ == EnumC1412640mre.CUT_SAME) {
            C1432940nOO.LIZ.getClass();
            templateSourceConfigLIZLLL = C1432940nOO.LIZLLL();
        } else {
            templateSourceConfigLIZLLL = null;
        }
        C0LE8.LIZIZ(templateSourceConfigLIZLLL);
        C122T.LIZ();
        C122T.LIZIZ();
        C0FI2.LJIJJ().LJJIL(activity, Boolean.valueOf(!C298130BmN.LIZ()));
        C19565911gn.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InitPipelineNodeKt@fb11.initPipelineNode$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C531780KtM c531780KtM, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c531780KtM, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
