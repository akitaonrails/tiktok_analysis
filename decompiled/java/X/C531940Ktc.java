package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ktc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartUseTemplateKt$START_USE_TEMPLATE_GRAPH$1$3", f = "StartUseTemplate.kt", l = {}, m = "invokeSuspend")
public final class C531940Ktc extends C09AX implements Function2<InterfaceC532370KuJ<C531970Ktf>, InterfaceC1364105Vn<? super C531580Kt2>, Object> {
    public /* synthetic */ Object LL;

    public C531940Ktc(InterfaceC1364105Vn<? super C531940Ktc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C531940Ktc c531940Ktc = new C531940Ktc(interfaceC1364105Vn);
        c531940Ktc.LL = obj;
        return c531940Ktc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        CreativeModel creativeModel;
        CreativeInfo creativeInfo;
        C1C7U.LIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC532370KuJ interfaceC532370KuJ = (InterfaceC532370KuJ) this.LL;
        String str2 = ((C531970Ktf) interfaceC532370KuJ.getContext()).LIZ;
        C1412390mrF c1412390mrF = ((C531970Ktf) interfaceC532370KuJ.getContext()).LIZIZ;
        EnumC1412640mre enumC1412640mre = ((C531970Ktf) interfaceC532370KuJ.getContext()).LIZJ;
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
        C531580Kt2 c531580Kt2 = new C531580Kt2(str2, c1412390mrF, enumC1412640mre, str, creationId, ((C531970Ktf) interfaceC532370KuJ.getContext()).LJ);
        C1C7U.LIZIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$3");
        return c531580Kt2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<C531970Ktf> interfaceC532370KuJ, InterfaceC1364105Vn<? super C531580Kt2> interfaceC1364105Vn) {
        return ((a) create(interfaceC532370KuJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
