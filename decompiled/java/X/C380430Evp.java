package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Evp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.task.template.tasks.TemplateCombineEffectTaskV0$executeSerial$1$2", f = "TemplateCombineEffectTaskV0.kt", l = {}, m = "invokeSuspend")
public final class C380430Evp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0FQS LL;
    public final /* synthetic */ C381300ExE LLILLJJLI;
    public final /* synthetic */ C381330ExH LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C380430Evp(C0FQS c0fqs, C381300ExE c381300ExE, C381330ExH c381330ExH, InterfaceC1364105Vn<? super C380430Evp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0fqs;
        this.LLILLJJLI = c381300ExE;
        this.LLILLL = c381330ExH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C380430Evp(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        NLEEditor nLEEditor;
        C1C7U.LIZ("TemplateCombineEffectTaskV0@393c.executeSerial$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C381410ExP c381410ExP = this.LL.LJIJ;
        if (c381410ExP != null && (nLEEditor = c381410ExP.LIZIZ) != null) {
            Boolean.valueOf(nLEEditor.commit());
        }
        this.LLILLJJLI.LIZJ(this.LL, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateCombineEffectTaskV0@393c.executeSerial$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
