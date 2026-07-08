package X;

import Y.AgS202S0200000_12;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U6Q, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.beauty.anchor.LiveBeautySubItemListView$observeViewModel$1", f = "LiveBeautySubItemListView.kt", l = {123}, m = "invokeSuspend")
public final class C0U6Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0U6S LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U6Q(C0U6S c0u6s, InterfaceC1364105Vn<? super C0U6Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0u6s;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0U6Q c0u6q = new C0U6Q(this.LLILLL, interfaceC1364105Vn);
        c0u6q.LLILLJJLI = obj;
        return c0u6q;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBeautySubItemListView@3631.observeViewModel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C0U6S c0u6s = this.LLILLL;
            C2252321DDq c2252321DDq = c0u6s.LJIILJJIL.LLILZIL;
            AgS202S0200000_12 agS202S0200000_12 = new AgS202S0200000_12(interfaceC497601wk, c0u6s, 5);
            this.LL = 1;
            if (c2252321DDq.collect(agS202S0200000_12, this) == objLJFF) {
                C1C7U.LIZIZ("LiveBeautySubItemListView@3631.observeViewModel$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
