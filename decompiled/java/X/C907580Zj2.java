package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.CombinedSearchContentEngine$clear$1$1", f = "SupervisorSearchContentUpdateEngine.kt", l = {319}, m = "invokeSuspend")
public final class C907580Zj2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C907600Zj4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C907580Zj2(C907600Zj4 c907600Zj4, InterfaceC1364105Vn<? super C907580Zj2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c907600Zj4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C907580Zj2(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CombinedSearchContentEngine@35ee.clear$1$1");
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
            C907690ZjD c907690ZjD = (C907690ZjD) this.LLILLJJLI.LJIIJJI.getValue();
            this.LL = 1;
            c907690ZjD.LJ.LJIIJJI(null);
            Object objLJJZ = c907690ZjD.LJFF.LJJZ(this);
            if (objLJJZ != C099R.LJFF()) {
                objLJJZ = Unit.LIZ;
            }
            if (objLJJZ == objLJFF) {
                C1C7U.LIZIZ("CombinedSearchContentEngine@35ee.clear$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CombinedSearchContentEngine@35ee.clear$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
