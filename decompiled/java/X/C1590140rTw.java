package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSocialAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rTw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590140rTw extends C09AY implements Function0<HomeTabAbility> {
    public final /* synthetic */ MainPageSocialAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1590140rTw(MainPageSocialAssem mainPageSocialAssem) {
        super(0);
        this.LL = mainPageSocialAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.jvm.functions.Function0
    public final HomeTabAbility invoke() {
        ?? r1;
        HomeTabAbility homeTabAbilityLIZ;
        MainPageSocialAssem mainPageSocialAssem = this.LL;
        try {
            if (C296200BjG.LIZ()) {
                homeTabAbilityLIZ = mainPageSocialAssem.Go();
            } else {
                MainActivityScope mainActivityScopeLIZLLL = C0S4U.LIZLLL(mainPageSocialAssem);
                homeTabAbilityLIZ = mainActivityScopeLIZLLL != null ? C0DMM.LIZ(mainActivityScopeLIZLLL) : null;
            }
            C189200o6.m2constructorimpl(homeTabAbilityLIZ);
            r1 = homeTabAbilityLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            r1 = c098200Yq;
        }
        if (C189200o6.m7isFailureimpl(r1)) {
            return null;
        }
        return r1;
    }
}
