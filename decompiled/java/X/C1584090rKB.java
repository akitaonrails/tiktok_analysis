package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageBusinessAssem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rKB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584090rKB extends C09AY implements Function0<AbstractC1591090rVT> {
    public final /* synthetic */ MainPageBusinessAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1584090rKB(MainPageBusinessAssem mainPageBusinessAssem) {
        super(0);
        this.LL = mainPageBusinessAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC1591090rVT invoke() {
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZ)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
            return null;
        }
        return homeTabAbilityLIZ.hQ1(c19egLIZ);
    }
}
