package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.TemplateConsumeData;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ktb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartUseTemplateKt$START_USE_TEMPLATE_GRAPH$1$6", f = "StartUseTemplate.kt", l = {}, m = "invokeSuspend")
public final class C531930Ktb extends C09AX implements Function2<InterfaceC532370KuJ<C531970Ktf>, InterfaceC1364105Vn<? super C531670KtB>, Object> {
    public /* synthetic */ Object LL;

    public C531930Ktb(InterfaceC1364105Vn<? super C531930Ktb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C531930Ktb c531930Ktb = new C531930Ktb(interfaceC1364105Vn);
        c531930Ktb.LL = obj;
        return c531930Ktb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        CreativeModel creativeModel;
        TemplateConsumeData templateConsumeData;
        C1C7U.LIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC532370KuJ interfaceC532370KuJ = (InterfaceC532370KuJ) this.LL;
        ShortVideoContext shortVideoContext = ((C531970Ktf) interfaceC532370KuJ.getContext()).LJ;
        if (shortVideoContext == null || (creativeModel = shortVideoContext.creativeModel) == null || (templateConsumeData = creativeModel.templateConsumeData) == null || (str = templateConsumeData.nleSummary) == null) {
            str = "";
        }
        C531670KtB c531670KtB = new C531670KtB(C531990Kth.LIZ((C531970Ktf) interfaceC532370KuJ.getContext()), str);
        C1C7U.LIZIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$6");
        return c531670KtB;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<C531970Ktf> interfaceC532370KuJ, InterfaceC1364105Vn<? super C531670KtB> interfaceC1364105Vn) {
        return ((a) create(interfaceC532370KuJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
