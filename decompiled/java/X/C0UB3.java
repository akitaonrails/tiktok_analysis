package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UB3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.singleselector.NormalStickerListView$fetchStickerList$1", f = "NormalStickerListView.kt", l = {93}, m = "invokeSuspend")
public final class C0UB3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0UB1 LLILLJJLI;
    public final /* synthetic */ C0UBH LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UB3(C0UB1 c0ub1, C0UBH c0ubh, InterfaceC1364105Vn<? super C0UB3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ub1;
        this.LLILLL = c0ubh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0UB3(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NormalStickerListView@5a7b.fetchStickerList$1");
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
            C1DEK c1dek = this.LLILLJJLI.LJIIL.LLILLJJLI;
            C395501gH c395501gH = new C395501gH(this.LLILLL.LIZIZ);
            this.LL = 1;
            if (c1dek.LJIJI(c395501gH, this) == objLJFF) {
                C1C7U.LIZIZ("NormalStickerListView@5a7b.fetchStickerList$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NormalStickerListView@5a7b.fetchStickerList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
