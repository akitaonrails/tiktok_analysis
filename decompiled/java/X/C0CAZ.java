package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.ss.android.ugc.aweme.ab.AbsABValueOptimizer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CAZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CAZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbsABValueOptimizer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CAZ(AbsABValueOptimizer absABValueOptimizer) {
        super(0);
        this.LL = absABValueOptimizer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object c098200Yq;
        AbsABValueOptimizer.ABCacheInfo aBCacheInfo;
        AbsABValueOptimizer absABValueOptimizer = this.LL;
        absABValueOptimizer.getClass();
        try {
            c098200Yq = null;
            String string = Keva.getRepo((String) absABValueOptimizer.LJ.getValue()).getString("ab_cache_info", null);
            if (string != null && (aBCacheInfo = (AbsABValueOptimizer.ABCacheInfo) C08JS.LIZIZ().LJII(string, AbsABValueOptimizer.ABCacheInfo.class)) != null && aBCacheInfo.versionCode == AbsABValueOptimizer.LIZ() && (!aBCacheInfo.abInfoList.isEmpty())) {
                List<AbsABValueOptimizer.ABInfo> list = aBCacheInfo.abInfoList;
                absABValueOptimizer.LIZLLL = list;
                if (list != null) {
                    for (AbsABValueOptimizer.ABInfo aBInfo : list) {
                        absABValueOptimizer.LIZLLL();
                        switch (aBInfo.type) {
                            case 1:
                                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                                String str = aBInfo.key;
                                k kVar = aBInfo.defaultValue;
                                c0c64LJIILLIIL.LJIIIZ(0, str, true, kVar != null ? kVar.LJ() : false);
                                break;
                            case 2:
                                C0C64 c0c64LJIILLIIL2 = C0C64.LJIILLIIL();
                                String str2 = aBInfo.key;
                                k kVar2 = aBInfo.defaultValue;
                                c0c64LJIILLIIL2.LJIJ(0, kVar2 != null ? kVar2.LJIIJJI() : 0, str2, true);
                                break;
                            case 3:
                                C0C64 c0c64LJIILLIIL3 = C0C64.LJIILLIIL();
                                String str3 = aBInfo.key;
                                k kVar3 = aBInfo.defaultValue;
                                c0c64LJIILLIIL3.LJIJJLI(0, kVar3 != null ? kVar3.LJIIZILJ() : 0L, str3, true);
                                break;
                            case 4:
                                C0C64 c0c64LJIILLIIL4 = C0C64.LJIILLIIL();
                                String str4 = aBInfo.key;
                                k kVar4 = aBInfo.defaultValue;
                                c0c64LJIILLIIL4.LJIILL(0, str4, true, kVar4 != null ? kVar4.LJIIJ() : 0.0f);
                                break;
                            case 5:
                                C0C64 c0c64LJIILLIIL5 = C0C64.LJIILLIIL();
                                String str5 = aBInfo.key;
                                k kVar5 = aBInfo.defaultValue;
                                c0c64LJIILLIIL5.LJIIL(kVar5 != null ? kVar5.LJIIIZ() : 0.0d, 0, str5, true);
                                break;
                            case 6:
                                C0C64 c0c64LJIILLIIL6 = C0C64.LJIILLIIL();
                                String str6 = aBInfo.key;
                                k kVar6 = aBInfo.defaultValue;
                                c0c64LJIILLIIL6.LJJ(0, str6, kVar6 != null ? kVar6.LJIL() : null, true);
                                break;
                        }
                    }
                    c098200Yq = Unit.LIZ;
                }
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m8isSuccessimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return Unit.LIZ;
    }
}
