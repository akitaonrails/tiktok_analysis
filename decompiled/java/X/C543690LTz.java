package X;

import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LTz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.aigcbusiness.text2image.Text2ImageServerTask$stepRequestServer$2", f = "Text2ImageServerTask.kt", l = {134}, m = "invokeSuspend")
public final class C543690LTz extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C543750LUf LLILLJJLI;
    public final /* synthetic */ C09JG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543690LTz(C543750LUf c543750LUf, C09JG c09jg, InterfaceC1364105Vn<? super C543690LTz> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c543750LUf;
        this.LLILLL = c09jg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C543690LTz(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageServerTask@3222.stepRequestServer$2");
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
            C543750LUf c543750LUf = this.LLILLJJLI;
            C0LSZ c0lszLIZ = C0LSZ.LIZ(c543750LUf.LIZLLL, null, null, null, null, null, null, null, 10, null, null, null, 0, null, null, null, 0, null, null, null, 0L, ((I2VServerTaskInput) this.LLILLL).reqKey, 0L, null, null, null, 0, null, 266338175);
            this.LL = 1;
            if (C0LTN.LJJJ(c543750LUf, c0lszLIZ, this) == objLJFF) {
                C1C7U.LIZIZ("Text2ImageServerTask@3222.stepRequestServer$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Text2ImageServerTask@3222.stepRequestServer$2");
        return unit;
    }
}
