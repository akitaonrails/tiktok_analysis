package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ToC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.spriteimage.ScrollHandleConfiguration$runnable$1$1", f = "ScrollHandleConfiguration.kt", l = {164}, m = "invokeSuspend")
public final class C757900ToC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1836150xsj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C757900ToC(C1836150xsj c1836150xsj, InterfaceC1364105Vn<? super C757900ToC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1836150xsj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C757900ToC c757900ToC = new C757900ToC(this.LLILLL, interfaceC1364105Vn);
        c757900ToC.LLILLJJLI = obj;
        return c757900ToC;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        C1C7U.LIZ("ScrollHandleConfiguration@13e2.runnable$1$1");
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
            if (C2296808zG.LJI((InterfaceC497601wk) this.LLILLJJLI) && !this.LLILLL.LIZ.isFinishing()) {
                Pair pair2 = (Pair) this.LLILLL.LJJIZ.invoke();
                if (((Number) pair2.getSecond()).intValue() - ((Number) pair2.getFirst()).intValue() < this.LLILLL.LJIILJJIL + 2) {
                    pair = new Pair(pair2.getFirst(), C2286608xc.LJ(((Number) pair2.getFirst()).intValue() + this.LLILLL.LJIILJJIL + 2));
                } else {
                    pair = new Pair(pair2.getFirst(), pair2.getSecond());
                }
                int iIntValue = ((Number) pair.getFirst()).intValue();
                int iIntValue2 = ((Number) pair.getSecond()).intValue();
                C1836150xsj c1836150xsj = this.LLILLL;
                boolean zLIZIZ = c1836150xsj.LIZIZ();
                this.LL = 1;
                if (c1836150xsj.LIZLLL(iIntValue, iIntValue2, zLIZIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("ScrollHandleConfiguration@13e2.runnable$1$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ScrollHandleConfiguration@13e2.runnable$1$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ScrollHandleConfiguration@13e2.runnable$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
