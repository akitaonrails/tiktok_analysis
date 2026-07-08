package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zj5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.CombinedSearchContentEngine$deleteMessageList$1", f = "SupervisorSearchContentUpdateEngine.kt", l = {273}, m = "invokeSuspend")
public final class C907610Zj5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C907600Zj4 LLILLJJLI;
    public final /* synthetic */ List<C869590Y9l> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C907610Zj5(C907600Zj4 c907600Zj4, List<? extends C869590Y9l> list, InterfaceC1364105Vn<? super C907610Zj5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c907600Zj4;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C907610Zj5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CombinedSearchContentEngine@35ee.deleteMessageList$1");
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
            if (((Number) C296710Bk5.LIZ.getValue()).intValue() == 2) {
                C907690ZjD c907690ZjD = (C907690ZjD) this.LLILLJJLI.LJIIJJI.getValue();
                C907660ZjA c907660ZjA = new C907660ZjA(this.LLILLL, EnumC907700ZjE.DELETE);
                this.LL = 1;
                if (c907690ZjD.LIZ(c907660ZjA, this) == objLJFF) {
                    C1C7U.LIZIZ("CombinedSearchContentEngine@35ee.deleteMessageList$1");
                    return objLJFF;
                }
            } else {
                C907310Zib c907310ZibLIZ = this.LLILLJJLI.LIZ();
                if (c907310ZibLIZ != null) {
                    c907310ZibLIZ.LIZ(this.LLILLL);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CombinedSearchContentEngine@35ee.deleteMessageList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
