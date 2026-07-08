package X;

import com.google.gson.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01wi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.infra.datacenter.DataCenter$observeFetchApi$1", f = "DataCenter.kt", l = {334}, m = "invokeSuspend")
public final class C497401wi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1106810euN LLILLL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZ;
    public final /* synthetic */ Function1<n, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C497401wi(C1106810euN c1106810euN, String str, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1, Function1 function12) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c1106810euN;
        this.LLILZ = function1;
        this.LLILZIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C497401wi(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn, this.LLILZ, this.LLILZIL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DataCenter@f176.observeFetchApi$1");
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
            C1106750euH c1106750euH = C1106750euH.LIZ;
            C358101aF c358101aFLIZIZ = ((InterfaceC362001as) C1106750euH.LIZIZ.getValue()).LIZIZ(this.LLILLJJLI);
            C497501wj c497501wj = new C497501wj(this.LLILLL, this.LLILLJJLI, null, this.LLILZ, this.LLILZIL);
            this.LL = 1;
            if (C09IC.LJII(c358101aFLIZIZ, this, c497501wj) == objLJFF) {
                C1C7U.LIZIZ("DataCenter@f176.observeFetchApi$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DataCenter@f176.observeFetchApi$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
