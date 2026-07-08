package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.cart.cache.CartPreloadConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vR4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.cart.cache.CartCacheManager$executeCartCacheStrategy$1", f = "CartCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C1742120vR4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742120vR4(Map<String, ? extends Object> map, String str, Long l, InterfaceC1364105Vn<? super C1742120vR4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = map;
        this.LLILLL = str;
        this.LLILZ = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1742120vR4 c1742120vR4 = new C1742120vR4(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1742120vR4.LL = obj;
        return c1742120vR4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List listLJJLJ;
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        C1C7U.LIZ("CartCacheManager@5d34.executeCartCacheStrategy$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C013C c013c = new C013C();
        int i = C1742080vR0.LIZ;
        Map map = this.LLILLJJLI;
        if (map == null) {
            map = new HashMap();
        }
        int[] iArrLJFF = C1742080vR0.LJFF(map);
        if (iArrLJFF == null || (listLJJLJ = C13LQ.LJJLJ(iArrLJFF)) == null) {
            listLJJLJ = C13BV.INSTANCE;
        }
        CartPreloadConfig cartPreloadConfigLIZIZ = C1742130vR5.LIZIZ();
        if (cartPreloadConfigLIZIZ != null) {
            if (Intrinsics.LJFF(cartPreloadConfigLIZIZ.enableClearCache, true)) {
                C1742190vRB.LIZ.getClass();
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = IAccountDependencyService.class.getName();
                    if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
                }
                C212391189t c212391189t = C212391189t.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cart_cache_");
                sbLIZ.append(((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c212391189t.getClass();
                C212391189t.LIZIZ("cart_cache", strLIZIZ, null);
            }
            if (Intrinsics.LJFF(cartPreloadConfigLIZIZ.enableGetCartPreload, true)) {
                C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1742160vR8(this.LLILLL, listLJJLJ, this.LLILLJJLI, c013c, null), 3);
            }
            if (Intrinsics.LJFF(cartPreloadConfigLIZIZ.enableCartPreload, true)) {
                C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1742170vR9(this.LLILZ, listLJJLJ, c013c, null), 3);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CartCacheManager@5d34.executeCartCacheStrategy$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
