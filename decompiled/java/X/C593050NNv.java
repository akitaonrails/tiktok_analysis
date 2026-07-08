package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NNv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.api.component.idlepreload.CommerceIDLEPreloadModule$observeMainThreadStateChange$1", f = "CommerceIDLEPreloadModule.kt", l = {79}, m = "invokeSuspend")
public final class C593050NNv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C593080NNy LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593050NNv(C593080NNy c593080NNy, boolean z, InterfaceC1364105Vn<? super C593050NNv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c593080NNy;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593050NNv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceIDLEPreloadModule@18dd.observeMainThreadStateChange$1");
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
            boolean zLIZ = this.LLILLJJLI.LJIIL.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mainThreadStateListener isIdle = ");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(", resAvailable = ");
            sbLIZ.append(zLIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LLILLL && zLIZ) {
                C593080NNy c593080NNy = this.LLILLJJLI;
                c593080NNy.getClass();
                c593080NNy.LJI.set(false);
                c593080NNy.LJFF();
            } else {
                C593080NNy c593080NNy2 = this.LLILLJJLI;
                this.LL = 1;
                if (c593080NNy2.LIZ(this) == objLJFF) {
                    C1C7U.LIZIZ("CommerceIDLEPreloadModule@18dd.observeMainThreadStateChange$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceIDLEPreloadModule@18dd.observeMainThreadStateChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
