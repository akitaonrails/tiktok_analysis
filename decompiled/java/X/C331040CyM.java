package X;

import com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2VM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CyM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2VM$preUploadDraft$1", f = "EffectEditV2VM.kt", l = {427}, m = "invokeSuspend")
public final class C331040CyM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EffectEditV2VM LLILLJJLI;
    public final /* synthetic */ C1737870vKD LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331040CyM(EffectEditV2VM effectEditV2VM, C1737870vKD c1737870vKD, InterfaceC1364105Vn<? super C331040CyM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectEditV2VM;
        this.LLILLL = c1737870vKD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331040CyM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectEditV2VM@5973.preUploadDraft$1");
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
            C1737810vK7 c1737810vK7 = (C1737810vK7) this.LLILLJJLI.LLILZ.getValue();
            C1737870vKD c1737870vKD = this.LLILLL;
            this.LL = 1;
            if (c1737810vK7.LIZIZ(c1737870vKD, this) == objLJFF) {
                C1C7U.LIZIZ("EffectEditV2VM@5973.preUploadDraft$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectEditV2VM@5973.preUploadDraft$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
