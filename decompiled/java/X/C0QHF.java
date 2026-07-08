package X;

import com.bytedance.forest.Forest;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QHF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.common.utils.SearchInitTaskHelper$preCodeCacheSpark$1$1", f = "SearchInitTaskHelper.kt", l = {}, m = "invokeSuspend")
public final class C0QHF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SparkContext LL;
    public final /* synthetic */ Forest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QHF(SparkContext sparkContext, Forest forest, InterfaceC1364105Vn<? super C0QHF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sparkContext;
        this.LLILLJJLI = forest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0QHF(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchInitTaskHelper@c7c1.preCodeCacheSpark$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1536840q5y.LIZLLL(this.LL, new AbstractC1536860q60() { // from class: X.0QHH
            @Override // X.AbstractC1536860q60
            public final void LJ(String str) {
            }

            @Override // X.AbstractC1536860q60
            public final void LJFF() {
            }
        }, this.LLILLJJLI, false, 56);
        C0QGO c0qgo = C0QGO.LIZ;
        SparkContext sparkContext = this.LL;
        c0qgo.getClass();
        C0QGO.LJIIIZ = sparkContext;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchInitTaskHelper@c7c1.preCodeCacheSpark$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
