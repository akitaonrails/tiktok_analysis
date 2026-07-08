package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.TemplateConsumeData;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KtX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartUseTemplateKt$START_USE_TEMPLATE_GRAPH$1$8", f = "StartUseTemplate.kt", l = {}, m = "invokeSuspend")
public final class C531890KtX extends C09AX implements Function2<InterfaceC532370KuJ<C531970Ktf>, InterfaceC1364105Vn<? super C531710KtF>, Object> {
    public /* synthetic */ Object LL;

    public C531890KtX(InterfaceC1364105Vn<? super C531890KtX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C531890KtX c531890KtX = new C531890KtX(interfaceC1364105Vn);
        c531890KtX.LL = obj;
        return c531890KtX;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TemplateConsumeCoreParam templateConsumeCoreParamLIZ;
        ShortVideoContext shortVideoContext;
        CreativeModel creativeModel;
        TemplateConsumeData templateConsumeData;
        String str;
        String creationId;
        CreativeModel creativeModel2;
        CreativeInfo creativeInfo;
        C531550Ksz c531550KszLIZ;
        C532330KuF c532330KuF;
        C1C7U.LIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$8");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC532370KuJ interfaceC532370KuJ = (InterfaceC532370KuJ) this.LL;
        TemplateConsumeCoreParam templateConsumeCoreParam = (TemplateConsumeCoreParam) interfaceC532370KuJ.LIZ(C531750KtJ.LIZ);
        if (templateConsumeCoreParam == null) {
            templateConsumeCoreParamLIZ = C531990Kth.LIZ((C531970Ktf) interfaceC532370KuJ.getContext());
        } else {
            templateConsumeCoreParamLIZ = templateConsumeCoreParam;
        }
        String str2 = null;
        if (templateConsumeCoreParam == null ? (shortVideoContext = ((C531970Ktf) interfaceC532370KuJ.getContext()).LJ) == null || (creativeModel = shortVideoContext.creativeModel) == null || (templateConsumeData = creativeModel.templateConsumeData) == null || (str = templateConsumeData.nleSummary) == null : (c531550KszLIZ = C0FQK.LIZ(templateConsumeCoreParamLIZ.templateId)) == null || (c532330KuF = c531550KszLIZ.LIZJ) == null || (str = c532330KuF.LJII) == null) {
            str = "";
        }
        Activity activity = ((C531970Ktf) interfaceC532370KuJ.getContext()).LIZLLL;
        ShortVideoContext shortVideoContext2 = ((C531970Ktf) interfaceC532370KuJ.getContext()).LJ;
        if (shortVideoContext2 != null && (creativeModel2 = shortVideoContext2.creativeModel) != null && (creativeInfo = creativeModel2.creativeInfo) != null) {
            creationId = creativeInfo.getCreationId();
        } else {
            creationId = null;
        }
        ShortVideoContext shortVideoContext3 = ((C531970Ktf) interfaceC532370KuJ.getContext()).LJ;
        if (shortVideoContext3 != null) {
            str2 = shortVideoContext3.shootWay;
        }
        C531710KtF c531710KtF = new C531710KtF(templateConsumeCoreParamLIZ, activity, creationId, str, str2);
        C1C7U.LIZIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$8");
        return c531710KtF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<C531970Ktf> interfaceC532370KuJ, InterfaceC1364105Vn<? super C531710KtF> interfaceC1364105Vn) {
        return ((a) create(interfaceC532370KuJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
