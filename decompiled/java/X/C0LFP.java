package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LFP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.ugctemplate.v2t.nle.CameraNLEPlayerForTemplateComponent$confirm$2$1", f = "CameraNLEPlayerForTemplateComponent.kt", l = {335}, m = "invokeSuspend")
public final class C0LFP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0LFO LLILLJJLI;
    public final /* synthetic */ NLEModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LFP(C0LFO c0lfo, NLEModel nLEModel, InterfaceC1364105Vn<? super C0LFP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0lfo;
        this.LLILLL = nLEModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LFP(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CameraNLEPlayerForTemplateComponent@69d2.confirm$2$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C0LFQ c0lfq = new C0LFQ(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c0lfq);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CameraNLEPlayerForTemplateComponent@69d2.confirm$2$1");
                return objLJFF;
            }
        }
        String str = (String) obj;
        if (C2286708xd.LIZJ(str)) {
            f0 f0VarK4 = this.LLILLJJLI.K4();
            if (f0VarK4 != null) {
                f0VarK4.xP1(true, true, true);
            }
            C0LFR c0lfrK5 = this.LLILLJJLI.k5();
            if (c0lfrK5 != null) {
                c0lfrK5.P91(true, str);
            }
            this.LLILLJJLI.hide();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CameraNLEPlayerForTemplateComponent@69d2.confirm$2$1");
            return unit;
        }
        this.LLILLJJLI.hide();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CameraNLEPlayerForTemplateComponent@69d2.confirm$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
