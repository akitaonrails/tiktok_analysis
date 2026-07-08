package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS384S0200000_18;
import njp.a;

/* JADX INFO: renamed from: X.0gsR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesVM$syncLikeStateToServer$1", f = "PoiRecommendDishesVM.kt", l = {179}, m = "invokeSuspend")
public final class C1182490gsR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PoiRecommendDishesVM LLILLL;
    public final /* synthetic */ PoiDetailApi.RecommendedDish LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1182490gsR(PoiRecommendDishesVM poiRecommendDishesVM, PoiDetailApi.RecommendedDish recommendedDish, InterfaceC1364105Vn<? super C1182490gsR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = poiRecommendDishesVM;
        this.LLILZ = recommendedDish;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1182490gsR c1182490gsR = new C1182490gsR(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1182490gsR.LLILLJJLI = obj;
        return c1182490gsR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PoiRecommendDishesVM@b4e1.syncLikeStateToServer$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                PoiRecommendDishesVM poiRecommendDishesVM = this.LLILLL;
                PoiDetailApi.RecommendedDish recommendedDish = this.LLILZ;
                InterfaceC1182500gsS interfaceC1182500gsS = (InterfaceC1182500gsS) poiRecommendDishesVM.LL.getValue().getOperator();
                String str = poiRecommendDishesVM.getState().LLILZ;
                if (str == null) {
                    str = "";
                }
                this.LL = 1;
                obj = interfaceC1182500gsS.LLZ(str, recommendedDish, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PoiRecommendDishesVM@b4e1.syncLikeStateToServer$1");
                    return objLJFF;
                }
            }
            c098200Yq = Boolean.valueOf(((Boolean) obj).booleanValue());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = false;
        }
        if (((Boolean) c098200Yq).booleanValue()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PoiRecommendDishesVM@b4e1.syncLikeStateToServer$1");
            return unit;
        }
        PoiRecommendDishesVM poiRecommendDishesVM2 = this.LLILLL;
        poiRecommendDishesVM2.setState(new AwS384S0200000_18(this.LLILZ, poiRecommendDishesVM2, 188));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PoiRecommendDishesVM@b4e1.syncLikeStateToServer$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
