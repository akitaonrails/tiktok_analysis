package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ogccampaign.OgcLynxCache;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01VH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ogccampaign.OgcLynxCache$persistEntryAsync$1", f = "OgcLynxCache.kt", l = {}, m = "invokeSuspend")
public final class C01VH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ OgcLynxCache.CacheEntry LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01VH(String str, String str2, OgcLynxCache.CacheEntry cacheEntry, List<String> list, List<String> list2, InterfaceC1364105Vn<? super C01VH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = cacheEntry;
        this.LLILZIL = list;
        this.LLILZLL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01VH c01vh = new C01VH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c01vh.LL = obj;
        return c01vh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OgcLynxCache@b171.persistEntryAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        OgcLynxCache.CacheEntry cacheEntry = this.LLILZ;
        List<String> list = this.LLILZIL;
        List<String> list2 = this.LLILZLL;
        try {
            OgcLynxCache.LIZ.getClass();
            Keva keva = (Keva) OgcLynxCache.LIZJ.getValue();
            String strLIZ = OgcLynxCache.LIZ(str, str2);
            ((C1227904rF) OgcLynxCache.LIZIZ.getValue()).getClass();
            keva.storeString(strLIZ, C1227904rF.LJI(cacheEntry));
            for (String str3 : list) {
                OgcLynxCache.LIZ.getClass();
                ((Keva) OgcLynxCache.LIZJ.getValue()).erase(OgcLynxCache.LIZ(str, str3));
            }
            OgcLynxCache.LIZ.getClass();
            Keva keva2 = (Keva) OgcLynxCache.LIZJ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("idx_");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            ((C1227904rF) OgcLynxCache.LIZIZ.getValue()).getClass();
            keva2.storeString(strLIZIZ, C1227904rF.LJI(list2));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OgcLynxCache@b171.persistEntryAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
