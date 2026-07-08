package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MPW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.component.OnThisDayTemplateComponent$generatePreviewVideo$1$1", f = "OnThisDayTemplateComponent.kt", l = {241}, m = "invokeSuspend")
public final class C0MPW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0MPY LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function1<NLEModel, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0MPW(C0MPY c0mpy, boolean z, Function1<? super NLEModel, Unit> function1, InterfaceC1364105Vn<? super C0MPW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0mpy;
        this.LLILZ = z;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MPW(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        C1C7U.LIZ("OnThisDayTemplateComponent@dac0.generatePreviewVideo$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            C0MPY c0mpy = this.LLILLL;
            boolean z2 = this.LLILZ;
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            obj = c0mpy.G2(true, z2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OnThisDayTemplateComponent@dac0.generatePreviewVideo$1$1");
                return objLJFF;
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        this.LLILZIL.invoke((NLEModel) obj);
        C0MPY c0mpy2 = this.LLILLL;
        if (obj == null) {
            z = false;
        }
        c0mpy2.CR0(z, this.LLILZ, jCurrentTimeMillis2 - jCurrentTimeMillis, "apply_template");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OnThisDayTemplateComponent@dac0.generatePreviewVideo$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
