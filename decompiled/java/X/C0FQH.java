package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS371S0200000_5;
import njp.a;

/* JADX INFO: renamed from: X.0FQH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.node.EffectRestoreNodesKt$freezeTemplateNode$1", f = "EffectRestoreNodes.kt", l = {172}, m = "invokeSuspend")
public final class C0FQH extends C09AX implements Function2<C0FQI, InterfaceC1364105Vn<? super NLETemplateModel>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C0FQH(InterfaceC1364105Vn<? super C0FQH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0FQH c0fqh = new C0FQH(interfaceC1364105Vn);
        c0fqh.LLILLJJLI = obj;
        return c0fqh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("EffectRestoreNodesKt@b332.freezeTemplateNode$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                Object obj3 = this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
                obj2 = obj3;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0FQI c0fqi = (C0FQI) this.LLILLJJLI;
            NLETemplateModel nLETemplateModel = c0fqi.LIZ;
            boolean zLJ = C0E3A.LJ(nLETemplateModel);
            obj2 = nLETemplateModel;
            if (zLJ) {
                CreativeModel creativeModel = c0fqi.LIZLLL;
                CreativeInfo creativeInfo = c0fqi.LIZJ;
                TemplateConsumeCoreParam templateConsumeCoreParam = c0fqi.LIZIZ;
                C354660DvM c354660DvM = new C354660DvM(creativeInfo, templateConsumeCoreParam.templateId, C2286608xc.LJ(templateConsumeCoreParam.templateType.getValue()), C0FQG.LIZ(c0fqi.LIZIZ), c0fqi.LIZIZ.dispatchType.LIZ, null, c0fqi.LJI, c0fqi.LJII, null, c0fqi.LJFF, c0fqi.LJ, true);
                AwS371S0200000_5 awS371S0200000_5 = new AwS371S0200000_5(creativeModel, nLETemplateModel, 217);
                this.LLILLJJLI = nLETemplateModel;
                this.LL = 1;
                Object objLIZ = c354660DvM.LIZ(nLETemplateModel, awS371S0200000_5, this);
                obj2 = nLETemplateModel;
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("EffectRestoreNodesKt@b332.freezeTemplateNode$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("EffectRestoreNodesKt@b332.freezeTemplateNode$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0FQI c0fqi, InterfaceC1364105Vn<? super NLETemplateModel> interfaceC1364105Vn) {
        return ((a) create(c0fqi, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
