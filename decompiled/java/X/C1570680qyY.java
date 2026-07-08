package X;

import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570680qyY extends C09AY implements Function0<HomePageViewPagerAbility> {
    public final /* synthetic */ C1602750roH LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570680qyY(C1602750roH c1602750roH) {
        super(0);
        this.LL = c1602750roH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.base.HomePageViewPagerAbility] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // kotlin.jvm.functions.Function0
    public final HomePageViewPagerAbility invoke() {
        MainActivityScope mainActivityScopeLIZJ;
        if (C296200BjG.LIZ()) {
            C19EG c19eg = this.LL.LIZ;
            if (c19eg != null) {
                C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(c19eg, null), MainActivityScope.class);
                ?? ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(HomePageViewPagerAbility.class) : 0;
                if (ability instanceof HomePageViewPagerAbility) {
                    return ability;
                }
            }
        } else {
            C19EG c19eg2 = this.LL.LIZ;
            if (c19eg2 != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg2)) != null) {
                return C1256610inz.LIZJ(mainActivityScopeLIZJ);
            }
        }
        return null;
    }
}
