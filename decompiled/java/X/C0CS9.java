package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.interfaces.INLETextStickerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CS9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.apply.TemplateApplier$applyTemplateInternal$2$1", f = "TemplateApplier.kt", l = {195}, m = "invokeSuspend")
public final class C0CS9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NLEModel LLILLJJLI;
    public final /* synthetic */ CreativeModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CS9(NLEModel nLEModel, CreativeModel creativeModel, InterfaceC1364105Vn<? super C0CS9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = nLEModel;
        this.LLILLL = creativeModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CS9(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("TemplateApplier@dfb.applyTemplateInternal$2$1");
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
            INLETextStickerService iNLETextStickerService = (INLETextStickerService) PluggableExtentionKt.pluggableSpi$default(INLETextStickerService.class, false, false, false, 14, null);
            if (iNLETextStickerService != null) {
                NLEModel nLEModel = this.LLILLJJLI;
                CreativeModel creativeModel = this.LLILLL;
                int iLIZIZ = C1415610mwR.LIZIZ();
                this.LL = 1;
                if (iNLETextStickerService.LIZ(nLEModel, creativeModel, iLIZIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("TemplateApplier@dfb.applyTemplateInternal$2$1");
                    return objLJFF;
                }
            } else {
                unit = null;
                C1C7U.LIZIZ("TemplateApplier@dfb.applyTemplateInternal$2$1");
                return unit;
            }
        }
        unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateApplier@dfb.applyTemplateInternal$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
