package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ck7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel$loadMixChunkData$1$3", f = "ShopMallMixViewModel.kt", l = {830}, m = "invokeSuspend")
public final class C322210Ck7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C05XL<C1515820pY4<C1515870pY9<ECMixMallPageDTO>>> LLILLL;
    public final /* synthetic */ Function2<C1515820pY4<C1515870pY9<ECMixMallPageDTO>>, Throwable, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C322210Ck7(C05XL<C1515820pY4<C1515870pY9<ECMixMallPageDTO>>> c05xl, Function2<? super C1515820pY4<C1515870pY9<ECMixMallPageDTO>>, ? super Throwable, Unit> function2, InterfaceC1364105Vn<? super C322210Ck7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c05xl;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C322210Ck7 c322210Ck7 = new C322210Ck7(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c322210Ck7.LLILLJJLI = obj;
        return c322210Ck7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("ShopMallMixViewModel@a591.loadMixChunkData$1$3");
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
                C05XL<C1515820pY4<C1515870pY9<ECMixMallPageDTO>>> c05xl = this.LLILLL;
                this.LL = 1;
                obj = c05xl.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ShopMallMixViewModel@a591.loadMixChunkData$1$3");
                    return objLJFF;
                }
            }
            c098200Yq = (C1515820pY4) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Function2<C1515820pY4<C1515870pY9<ECMixMallPageDTO>>, Throwable, Unit> function2 = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            function2.invoke((C1515820pY4<C1515870pY9<ECMixMallPageDTO>>) c098200Yq, null);
        }
        Function2<C1515820pY4<C1515870pY9<ECMixMallPageDTO>>, Throwable, Unit> function22 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            function22.invoke(null, thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallMixViewModel@a591.loadMixChunkData$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
