package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowSessionImpl$2$1", f = "AIGCWorkflowSession.kt", l = {174}, m = "invokeSuspend")
public final class C555980LrI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>>, Object> {
    public int LL;
    public final /* synthetic */ C556030LrN LLILLJJLI;
    public final /* synthetic */ C1346605Ou LLILLL;
    public final /* synthetic */ C00GM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555980LrI(C556030LrN c556030LrN, C1346605Ou c1346605Ou, C00GM c00gm, InterfaceC1364105Vn<? super C555980LrI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c556030LrN;
        this.LLILLL = c1346605Ou;
        this.LLILZ = c00gm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C555980LrI(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJIILLIIL;
        C1C7U.LIZ("AIGCWorkflowSessionImpl@84a1.<init>$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJIILLIIL = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2267651DpL c2267651DpL = C2267651DpL.LIZ;
            String str = this.LLILLJJLI.LIZ.LIZ;
            C1346605Ou c1346605Ou = this.LLILLL;
            this.LL = 1;
            objLJIILLIIL = c2267651DpL.LJIILLIIL(str, c1346605Ou, this);
            if (objLJIILLIIL == objLJFF) {
                C1C7U.LIZIZ("AIGCWorkflowSessionImpl@84a1.<init>$2$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJIILLIIL);
        C1C7U.LIZIZ("AIGCWorkflowSessionImpl@84a1.<init>$2$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
