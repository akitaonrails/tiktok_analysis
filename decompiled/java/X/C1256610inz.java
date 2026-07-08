package X;

import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;

/* JADX INFO: renamed from: X.0inz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1256610inz {
    public static final HomePageViewPagerAbility LIZ(C19EG c19eg) {
        Object ability;
        Object obj = null;
        if (c19eg == null) {
            return null;
        }
        if (C297720Bli.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(c19eg, null), MainActivityScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(HomePageViewPagerAbility.class);
            } else {
                ability = null;
            }
            if (ability instanceof HomePageViewPagerAbility) {
                obj = ability;
            }
            return (HomePageViewPagerAbility) obj;
        }
        return LIZIZ(c19eg);
    }

    public static final HomePageViewPagerAbility LIZIZ(C19EG c19eg) {
        return (HomePageViewPagerAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), HomePageViewPagerAbility.class, null);
    }

    public static final HomePageViewPagerAbility LIZJ(MainActivityScope mainActivityScope) {
        InterfaceC665370Q7z interfaceC665370Q7z = mainActivityScope.LL;
        if (interfaceC665370Q7z == null) {
            return null;
        }
        return (HomePageViewPagerAbility) C1558520qew.LIZ(interfaceC665370Q7z, HomePageViewPagerAbility.class, null);
    }
}
