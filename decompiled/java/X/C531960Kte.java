package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.TemplateConsumeData;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kte, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartUseTemplateKt$START_USE_TEMPLATE_GRAPH$1$5", f = "StartUseTemplate.kt", l = {}, m = "invokeSuspend")
public final class C531960Kte extends C09AX implements Function2<InterfaceC532370KuJ<C531970Ktf>, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C531960Kte(InterfaceC1364105Vn<? super C531960Kte> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C531960Kte c531960Kte = new C531960Kte(interfaceC1364105Vn);
        c531960Kte.LL = obj;
        return c531960Kte;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CreativeModel creativeModel;
        TemplateConsumeData templateConsumeData;
        String str;
        C1C7U.LIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ShortVideoContext shortVideoContext = ((C531970Ktf) ((InterfaceC532370KuJ) this.LL).getContext()).LJ;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (templateConsumeData = creativeModel.templateConsumeData) != null && (str = templateConsumeData.nleSummary) != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$5");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<C531970Ktf> interfaceC532370KuJ, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC532370KuJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
