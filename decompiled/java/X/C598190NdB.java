package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl$onDestroyView$1", f = "TabCommerceFragmentImpl.kt", l = {156}, m = "invokeSuspend")
public final class C598190NdB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TabCommerceFragmentImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598190NdB(TabCommerceFragmentImpl tabCommerceFragmentImpl, InterfaceC1364105Vn<? super C598190NdB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tabCommerceFragmentImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598190NdB(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabCommerceFragmentImpl@8414.onDestroyView$1");
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
            SparkContext sparkContext = this.LLILLJJLI.LLJJIJIL;
            if (sparkContext != null) {
                this.LL = 1;
                if (C614710O9d.LIZ(sparkContext, this) == objLJFF) {
                    C1C7U.LIZIZ("TabCommerceFragmentImpl@8414.onDestroyView$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TabCommerceFragmentImpl@8414.onDestroyView$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
