package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qtp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.effect.EffectLoader$createLoadJob$1", f = "EffectLoader.kt", l = {113}, m = "invokeSuspend")
public final class C1567750qtp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Effect>>, Object> {
    public int LL;
    public final /* synthetic */ C1599950rjl LLILLJJLI;
    public final /* synthetic */ C1405530mgB LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1567750qtp(C1599950rjl c1599950rjl, C1405530mgB c1405530mgB, InterfaceC1364105Vn<? super C1567750qtp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1599950rjl;
        this.LLILLL = c1405530mgB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1567750qtp(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZJ;
        C1C7U.LIZ("EffectLoader@fcd0.createLoadJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZJ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1599950rjl c1599950rjl = this.LLILLJJLI;
            C1405530mgB c1405530mgB = this.LLILLL;
            this.LL = 1;
            objLIZJ = c1599950rjl.LIZJ(c1405530mgB, this);
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("EffectLoader@fcd0.createLoadJob$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZJ);
        C1C7U.LIZIZ("EffectLoader@fcd0.createLoadJob$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Effect>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
