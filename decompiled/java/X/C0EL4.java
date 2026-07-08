package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EL4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.task.EditorProContextInitTask$run$2", f = "EditorProContextInitTask.kt", l = {}, m = "invokeSuspend")
public final class C0EL4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0EL3 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ NLEModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EL4(C0EL3 c0el3, String str, NLEModel nLEModel, InterfaceC1364105Vn<? super C0EL4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0el3;
        this.LLILLJJLI = str;
        this.LLILLL = nLEModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0EL4(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProContextInitTask@3541.run$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0EL3 c0el3 = this.LL;
        C0E48 c0e48 = c0el3.LJII;
        C0EL6 c0el6 = c0el3.LJ;
        c0e48.M6(c0el6.LIZ, this.LLILLJJLI, c0el6.LIZIZ, c0el6.LIZJ, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProContextInitTask@3541.run$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
