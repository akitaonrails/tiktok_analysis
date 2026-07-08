package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;

/* JADX INFO: renamed from: X.0DMM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DMM {
    public static final HomeTabAbility LIZ(MainActivityScope mainActivityScope) {
        InterfaceC665370Q7z interfaceC665370Q7z = mainActivityScope.LL;
        if (interfaceC665370Q7z != null) {
            return LIZIZ(interfaceC665370Q7z);
        }
        return null;
    }

    public static final HomeTabAbility LIZIZ(InterfaceC665370Q7z interfaceC665370Q7z) {
        Object ability;
        Object obj = null;
        if (C296200BjG.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7z, MainActivityScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(HomeTabAbility.class);
            } else {
                ability = null;
            }
            if (ability instanceof HomeTabAbility) {
                obj = ability;
            }
            return (HomeTabAbility) obj;
        }
        return (HomeTabAbility) C1558520qew.LIZ(interfaceC665370Q7z, HomeTabAbility.class, null);
    }
}
