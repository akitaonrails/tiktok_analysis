package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFUGAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qk3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1561690qk3 extends C09AY implements Function0<HomeTabAbility> {
    public final /* synthetic */ MFUGAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1561690qk3(MFUGAssem mFUGAssem) {
        super(0);
        this.LL = mFUGAssem;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01wD, com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final HomeTabAbility invoke() {
        if (!C296200BjG.LIZ()) {
            return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), HomeTabAbility.class, null);
        }
        MFUGAssem mFUGAssem = this.LL;
        HomeTabAbility homeTabAbility = mFUGAssem.LLIZ;
        if (homeTabAbility == null) {
            synchronized (mFUGAssem) {
                homeTabAbility = mFUGAssem.LLIZ;
                if (homeTabAbility == null) {
                    C0QSJ c0qsjM261do = mFUGAssem.m261do();
                    HomeTabAbility homeTabAbility2 = c0qsjM261do != null ? (HomeTabAbility) c0qsjM261do.getAbility(HomeTabAbility.class) : null;
                    mFUGAssem.LLIZ = homeTabAbility2;
                    return homeTabAbility2;
                }
            }
        }
        return homeTabAbility;
    }
}
