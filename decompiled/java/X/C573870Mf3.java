package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mf3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.aiself.AiSelfTemplateComponent$processTemplate$1", f = "AiSelfTemplateComponent.kt", l = {}, m = "invokeSuspend")
public final class C573870Mf3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C573850Mf1 LL;
    public final /* synthetic */ NLETemplateModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C573870Mf3(C573850Mf1 c573850Mf1, NLETemplateModel nLETemplateModel, InterfaceC1364105Vn<? super C573870Mf3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c573850Mf1;
        this.LLILLJJLI = nLETemplateModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C573870Mf3(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiSelfTemplateComponent@5a3.processTemplate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.q3().LIZJ(this.LLILLJJLI, this.LL.getEditModel(), true, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiSelfTemplateComponent@5a3.processTemplate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
