package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DMN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DMN extends C09AY implements Function0<List<? extends InterfaceC1583870rJp>> {
    public final /* synthetic */ MainTabStrip LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DMN(MainTabStrip mainTabStrip) {
        super(0);
        this.LL = mainTabStrip;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends InterfaceC1583870rJp> invoke() {
        HomeTabAbility homeTabAbility;
        List<? extends InterfaceC1583870rJp> listL32;
        if (C296200BjG.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(this.LL.getActivity(), null), MainActivityScope.class);
            Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(HomeTabAbility.class) : null;
            homeTabAbility = (HomeTabAbility) (ability instanceof HomeTabAbility ? ability : null);
        } else {
            homeTabAbility = (HomeTabAbility) C1558520qew.LIZ(C1558360qeg.LJI(this.LL.getActivity(), null), HomeTabAbility.class, null);
        }
        return (homeTabAbility == null || (listL32 = homeTabAbility.l32()) == null) ? C13BV.INSTANCE : listL32;
    }
}
