package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KtY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartUseTemplateKt$START_USE_TEMPLATE_GRAPH$1$13", f = "StartUseTemplate.kt", l = {}, m = "invokeSuspend")
public final class C531900KtY extends C09AX implements Function2<InterfaceC532370KuJ<C531970Ktf>, InterfaceC1364105Vn<? super C532050Ktn>, Object> {
    public /* synthetic */ Object LL;

    public C531900KtY(InterfaceC1364105Vn<? super C531900KtY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C531900KtY c531900KtY = new C531900KtY(interfaceC1364105Vn);
        c531900KtY.LL = obj;
        return c531900KtY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        CreativeModel creativeModel;
        CreativeInfo creativeInfo;
        C1C7U.LIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$13");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC532370KuJ interfaceC532370KuJ = (InterfaceC532370KuJ) this.LL;
        TemplateConsumeCoreParam templateConsumeCoreParamLIZ = (TemplateConsumeCoreParam) interfaceC532370KuJ.LIZ(C531750KtJ.LIZ);
        if (templateConsumeCoreParamLIZ == null) {
            templateConsumeCoreParamLIZ = C531990Kth.LIZ((C531970Ktf) interfaceC532370KuJ.getContext());
        }
        Activity activity = ((C531970Ktf) interfaceC532370KuJ.getContext()).LIZLLL;
        String str2 = templateConsumeCoreParamLIZ.templateId;
        ShortVideoContext shortVideoContext = ((C531970Ktf) interfaceC532370KuJ.getContext()).LJ;
        String creationId = null;
        if (shortVideoContext != null) {
            str = shortVideoContext.shootWay;
        } else {
            str = null;
        }
        ShortVideoContext shortVideoContext2 = ((C531970Ktf) interfaceC532370KuJ.getContext()).LJ;
        if (shortVideoContext2 != null && (creativeModel = shortVideoContext2.creativeModel) != null && (creativeInfo = creativeModel.creativeInfo) != null) {
            creationId = creativeInfo.getCreationId();
        }
        C532050Ktn c532050Ktn = new C532050Ktn(activity, str2, str, creationId, true);
        C1C7U.LIZIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$13");
        return c532050Ktn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<C531970Ktf> interfaceC532370KuJ, InterfaceC1364105Vn<? super C532050Ktn> interfaceC1364105Vn) {
        return ((a) create(interfaceC532370KuJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
