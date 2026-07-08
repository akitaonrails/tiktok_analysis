package X;

import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFUGAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qfx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559150qfx extends C09AY implements Function0<HomeViewPagerAbility> {
    public final /* synthetic */ MFUGAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1559150qfx(MFUGAssem mFUGAssem) {
        super(0);
        this.LL = mFUGAssem;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01wD, com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final HomeViewPagerAbility invoke() {
        if (!C297720Bli.LIZ()) {
            return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), HomeViewPagerAbility.class, null);
        }
        MFUGAssem mFUGAssem = this.LL;
        HomeViewPagerAbility homeViewPagerAbility = mFUGAssem.LLILZLL;
        if (homeViewPagerAbility == null) {
            synchronized (mFUGAssem) {
                homeViewPagerAbility = mFUGAssem.LLILZLL;
                if (homeViewPagerAbility == null) {
                    C0QSJ c0qsjM261do = mFUGAssem.m261do();
                    HomeViewPagerAbility homeViewPagerAbility2 = c0qsjM261do != null ? (HomeViewPagerAbility) c0qsjM261do.getAbility(HomeViewPagerAbility.class) : null;
                    mFUGAssem.LLILZLL = homeViewPagerAbility2;
                    return homeViewPagerAbility2;
                }
            }
        }
        return homeViewPagerAbility;
    }
}
