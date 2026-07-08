package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS367S0200000_1;
import njp.a;

/* JADX INFO: renamed from: X.04AF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.recommend.SeaPdpRecommendMgr$fetchBundleDealData$1$2", f = "SeaPdpRecommendMgr.kt", l = {230}, m = "invokeSuspend")
public final class C04AF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C04AG LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04AF(C04AG c04ag, Context context, InterfaceC1364105Vn<? super C04AF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c04ag;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C04AF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpRecommendMgr@82f2.fetchBundleDealData$1$2");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(50L, this) == objLJFF) {
                C1C7U.LIZIZ("SeaPdpRecommendMgr@82f2.fetchBundleDealData$1$2");
                return objLJFF;
            }
        }
        C04C5 c04c5WR2 = this.LLILLJJLI.LIZ.WR2();
        Context context = this.LLILLL;
        SeaPdpViewModel seaPdpViewModel = this.LLILLJJLI.LIZ;
        c04c5WR2.getClass();
        seaPdpViewModel.iR2(new AwS367S0200000_1(c04c5WR2, context, 297));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpRecommendMgr@82f2.fetchBundleDealData$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
