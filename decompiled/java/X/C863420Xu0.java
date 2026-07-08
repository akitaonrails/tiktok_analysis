package X;

import com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xu0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent$tryApplyEffect$1$hasSetUp$1", f = "TTEPPreviewEffectLogicComponent.kt", l = {227}, m = "invokeSuspend")
public final class C863420Xu0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ TTEPPreviewEffectLogicComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863420Xu0(TTEPPreviewEffectLogicComponent tTEPPreviewEffectLogicComponent, InterfaceC1364105Vn<? super C863420Xu0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tTEPPreviewEffectLogicComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863420Xu0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTEPPreviewEffectLogicComponent@5edf.tryApplyEffect$1$hasSetUp$1");
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
            TTEPPreviewEffectLogicComponent tTEPPreviewEffectLogicComponent = this.LLILLJJLI;
            this.LL = 1;
            obj = tTEPPreviewEffectLogicComponent.awaitRecordComponentSetUp(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TTEPPreviewEffectLogicComponent@5edf.tryApplyEffect$1$hasSetUp$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TTEPPreviewEffectLogicComponent@5edf.tryApplyEffect$1$hasSetUp$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
