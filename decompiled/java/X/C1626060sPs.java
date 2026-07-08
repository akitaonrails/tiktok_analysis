package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.ss.android.ugc.aweme.creative.model.TemplateEffectInfo;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.MobileEffectExportWorkflowImpl$exportEffect$1$2", f = "MobileEffectExportWorkflowImpl.kt", l = {}, m = "invokeSuspend")
public final class C1626060sPs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ UploadableMobileEffect2 LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ UIAnnotationErrorCode LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626060sPs(UploadableMobileEffect2 uploadableMobileEffect2, boolean z, UIAnnotationErrorCode uIAnnotationErrorCode, InterfaceC1364105Vn<? super C1626060sPs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = uploadableMobileEffect2;
        this.LLILLJJLI = z;
        this.LLILLL = uIAnnotationErrorCode;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626060sPs(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        UIAnnotationErrorCode uIAnnotationErrorCode;
        String string;
        C1C7U.LIZ("MobileEffectExportWorkflowImpl@479.exportEffect$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair[] pairArr = new Pair[5];
        TemplateEffectInfo templateEffectInfo = this.LL.templateInfo;
        String str2 = null;
        if (templateEffectInfo != null) {
            str2 = templateEffectInfo.templateResourceId;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        pairArr[0] = new Pair("parent_template_resource_id", str2);
        TemplateEffectInfo templateEffectInfo2 = this.LL.templateInfo;
        if (templateEffectInfo2 == null || (str = templateEffectInfo2.templateEffectId) == null) {
            str = "";
        }
        pairArr[1] = new Pair("parent_template_loki_effect_id", str);
        pairArr[2] = new Pair("effect_id", this.LL.effectId);
        pairArr[3] = new Pair("export_success", String.valueOf(this.LLILLJJLI));
        if (!this.LLILLJJLI && (uIAnnotationErrorCode = this.LLILLL) != null && (string = uIAnnotationErrorCode.toString()) != null) {
            str3 = string;
        }
        pairArr[4] = new Pair("failure_reason", str3);
        C1449260noi.LJ("met_effect_export_result", C2097608Jq.LJIIIIZZ(pairArr));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MobileEffectExportWorkflowImpl@479.exportEffect$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
