package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08eL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil$saveHomepageCacheData$1", f = "MMKStorageUtil.kt", l = {143}, m = "invokeSuspend")
public final class C2167108eL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Object LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2167108eL(long j, Object obj, InterfaceC1364105Vn<? super C2167108eL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2167108eL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String strLJIIIIZZ;
        C1C7U.LIZ("MMKStorageUtil@6cc.saveHomepageCacheData$1");
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
            if (this.LLILLJJLI > 0) {
                C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("saveHomepageCacheData delay: ");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(" ms");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c599820Nfo.getClass();
                C599820Nfo.LIZ("MixMall", strLIZIZ);
                long j = this.LLILLJJLI;
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("MMKStorageUtil@6cc.saveHomepageCacheData$1");
                    return objLJFF;
                }
            }
        }
        C599820Nfo.LIZ.getClass();
        C599820Nfo.LIZ("MixMall", "saveHomepageCacheData run...");
        Object obj2 = this.LLILLL;
        try {
            MMKStorageUtil mMKStorageUtil = MMKStorageUtil.LIZ;
            if (obj2 instanceof String) {
                strLJIIIIZZ = (String) obj2;
            } else {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(obj2);
            }
            c098200Yq = Boolean.valueOf(mMKStorageUtil.LJI("mix_mall_homepage_cache", strLJIIIIZZ));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("saveHomepageCacheData, error = ");
            sbLIZ2.append(Log.getStackTraceString(thM5exceptionOrNullimpl));
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c599820Nfo2.getClass();
            C599820Nfo.LIZ("ec_mmk_util", strLIZIZ2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MMKStorageUtil@6cc.saveHomepageCacheData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
