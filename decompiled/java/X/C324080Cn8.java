package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cn8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.ShopPrefetchDataManager$startPrefetch$3", f = "ShopPrefetchDataManager.kt", l = {81}, m = "invokeSuspend")
public final class C324080Cn8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1739060vM8 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1738990vM1 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324080Cn8(C1739060vM8 c1739060vM8, C1738990vM1 c1738990vM1, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1739060vM8;
        this.LLILLL = str;
        this.LLILZ = c1738990vM1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324080Cn8(this.LLILLJJLI, this.LLILZ, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJIIIIZZ;
        C1C7U.LIZ("ShopPrefetchDataManager@c051.startPrefetch$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        n nVar = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1739060vM8 c1739060vM8 = this.LLILLJJLI;
                String str = this.LLILLL;
                C1738990vM1 c1738990vM1 = this.LLILZ;
                this.LL = 1;
                c1739060vM8.getClass();
                obj = C2399409ai.LIZ("shop", "product_tab_list", c1738990vM1.LIZIZ, new C324090Cn9(c1739060vM8, c1738990vM1, str, null), this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ShopPrefetchDataManager@c051.startPrefetch$3");
                    return objLJFF;
                }
            }
            nVar = (n) obj;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = this.LLILLJJLI.LIZIZ;
        if (nVar == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(nVar)) == null) {
            strLJIIIIZZ = "";
        }
        concurrentHashMap.put("product_filters", strLJIIIIZZ);
        this.LLILLJJLI.LIZJ("product_filters");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopPrefetchDataManager@c051.startPrefetch$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
