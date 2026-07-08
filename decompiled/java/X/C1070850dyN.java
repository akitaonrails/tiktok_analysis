package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dyN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.dialogcenter.task.RequestContactFBAuthPipelineTask$getAuthPipeline$1", f = "RequestContactFBAuthPipelineTask.kt", l = {233}, m = "invokeSuspend")
public final class C1070850dyN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1073410e2V LLILLL;
    public final /* synthetic */ EnumC1070340dxY LLILZ;
    public final /* synthetic */ C1073040e1u LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLIZ;
    public final /* synthetic */ InterfaceC20236714Gf<Boolean> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1070850dyN(C1073410e2V c1073410e2V, EnumC1070340dxY enumC1070340dxY, C1073040e1u c1073040e1u, boolean z, Function1<? super Boolean, Unit> function1, InterfaceC20236714Gf<? super Boolean> interfaceC20236714Gf, InterfaceC1364105Vn<? super C1070850dyN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1073410e2V;
        this.LLILZ = enumC1070340dxY;
        this.LLILZIL = c1073040e1u;
        this.LLILZLL = z;
        this.LLIZ = function1;
        this.LLIZLLLIL = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1070850dyN c1070850dyN = new C1070850dyN(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1070850dyN.LLILLJJLI = obj;
        return c1070850dyN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RequestContactFBAuthPipelineTask@7728.getAuthPipeline$1");
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
            C095D c095dLIZ = ((C1071200dyw) C1070250dxP.LIZ(c1073410e2V.LIZ.LIZ, new C1070860dyO(interfaceC497601wk, c1073410e2V, this.LLILZ, this.LLILZIL, this.LLILZLL))).LIZ();
            final Function1<Boolean, Unit> function1 = this.LLIZ;
            final InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = this.LLIZLLLIL;
            final C1073040e1u c1073040e1u = this.LLILZIL;
            final EnumC1070340dxY enumC1070340dxY = this.LLILZ;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0dyM
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    C1071240dz0 c1071240dz0 = (C1071240dz0) obj2;
                    if (c1071240dz0.LIZ.LIZLLL) {
                        function1.invoke(true);
                    }
                    int i2 = C1070790dyH.LIZ[c1071240dz0.LIZIZ.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2 && c1071240dz0.LIZ.LIZJ) {
                            c1073040e1u.LIZ.storeBoolean(C1071190dyv.LIZ(enumC1070340dxY), true);
                        }
                    } else if (c1071240dz0.LIZ.LIZJ) {
                        InterfaceC20236714Gf<Boolean> interfaceC20236714Gf2 = interfaceC20236714Gf;
                        C189200o6.m2constructorimpl(true);
                        interfaceC20236714Gf2.resumeWith(true);
                    } else {
                        InterfaceC20236714Gf<Boolean> interfaceC20236714Gf3 = interfaceC20236714Gf;
                        C189200o6.m2constructorimpl(false);
                        interfaceC20236714Gf3.resumeWith(false);
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c095dLIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("RequestContactFBAuthPipelineTask@7728.getAuthPipeline$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RequestContactFBAuthPipelineTask@7728.getAuthPipeline$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
