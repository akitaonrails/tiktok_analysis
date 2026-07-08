package X;

import Y.AgS297S0100000_16;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS225S0300000_16;
import njp.a;

/* JADX INFO: renamed from: X.0dyL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.dialogcenter.task.RequestEmailAuthPipelineTask$getAuthPipeline$1", f = "RequestEmailAuthPipelineTask.kt", l = {87}, m = "invokeSuspend")
public final class C1070830dyL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1073410e2V LLILLL;
    public final /* synthetic */ EnumC1070340dxY LLILZ;
    public final /* synthetic */ InterfaceC20236714Gf<Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1070830dyL(C1073410e2V c1073410e2V, EnumC1070340dxY enumC1070340dxY, InterfaceC20236714Gf<? super Boolean> interfaceC20236714Gf, InterfaceC1364105Vn<? super C1070830dyL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1073410e2V;
        this.LLILZ = enumC1070340dxY;
        this.LLILZIL = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1070830dyL c1070830dyL = new C1070830dyL(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1070830dyL.LLILLJJLI = obj;
        return c1070830dyL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RequestEmailAuthPipelineTask@f716.getAuthPipeline$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1073410e2V c1073410e2V = this.LLILLL;
            C095D c095dLIZ = ((C1071200dyw) C1070250dxP.LIZ(c1073410e2V.LIZ.LIZ, new AwS225S0300000_16(interfaceC497601wk, this.LLILZ, c1073410e2V, 2))).LIZ();
            AgS297S0100000_16 agS297S0100000_16 = new AgS297S0100000_16(this.LLILZIL, 3);
            this.LL = 1;
            if (c095dLIZ.collect(agS297S0100000_16, this) == objLJFF) {
                C1C7U.LIZIZ("RequestEmailAuthPipelineTask@f716.getAuthPipeline$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RequestEmailAuthPipelineTask@f716.getAuthPipeline$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
