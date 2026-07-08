package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09LT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.toedit.OnThisDayCutOptimizedVideoChosenHandler$prepare$2", f = "OnThisDayCutOptimizedVideoChosenHandler.kt", l = {}, m = "invokeSuspend")
public final class C09LT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0L3D LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09LT(C0L3D c0l3d, boolean z, InterfaceC1364105Vn<? super C09LT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0l3d;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09LT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OnThisDayCutOptimizedVideoChosenHandler@95f4.prepare$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJJJIZL(0, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OnThisDayCutOptimizedVideoChosenHandler@95f4.prepare$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
