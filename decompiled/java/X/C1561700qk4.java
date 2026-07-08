package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFBizIconsAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qk4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1561700qk4 extends C09AY implements Function0<HomeTabAbility> {
    public final /* synthetic */ MFBizIconsAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1561700qk4(MFBizIconsAssem mFBizIconsAssem) {
        super(0);
        this.LL = mFBizIconsAssem;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01wD, com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final HomeTabAbility invoke() {
        if (!C296200BjG.LIZ()) {
            return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), HomeTabAbility.class, null);
        }
        MFBizIconsAssem mFBizIconsAssem = this.LL;
        HomeTabAbility homeTabAbility = mFBizIconsAssem.LLJJIJIL;
        if (homeTabAbility == null) {
            synchronized (mFBizIconsAssem) {
                homeTabAbility = mFBizIconsAssem.LLJJIJIL;
                if (homeTabAbility == null) {
                    C0QSJ c0qsjGo = mFBizIconsAssem.Go();
                    HomeTabAbility homeTabAbility2 = c0qsjGo != null ? (HomeTabAbility) c0qsjGo.getAbility(HomeTabAbility.class) : null;
                    mFBizIconsAssem.LLJJIJIL = homeTabAbility2;
                    return homeTabAbility2;
                }
            }
        }
        return homeTabAbility;
    }
}
