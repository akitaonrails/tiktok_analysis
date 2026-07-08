package X;

import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;

/* JADX INFO: renamed from: X.0deY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058560deY {
    public static final MainBusinessAbility LIZ(C19EG c19eg) {
        Object ability;
        Object obj = null;
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(c19eg, null), MainActivityScope.class);
        if (c0qsjLIZJ != null) {
            ability = c0qsjLIZJ.getAbility(MainBusinessAbility.class);
        } else {
            ability = null;
        }
        if (ability instanceof MainBusinessAbility) {
            obj = ability;
        }
        return (MainBusinessAbility) obj;
    }

    @InterfaceC1294060jmO
    public static final MainBusinessAbility LIZIZ(MainActivityScope mainActivityScope) {
        InterfaceC665370Q7z interfaceC665370Q7z = mainActivityScope.LL;
        if (interfaceC665370Q7z == null) {
            return null;
        }
        return (MainBusinessAbility) C1558520qew.LIZ(interfaceC665370Q7z, MainBusinessAbility.class, null);
    }

    @InterfaceC1294060jmO
    public static final MainBusinessAbility LIZJ(InterfaceC665370Q7z interfaceC665370Q7z) {
        return (MainBusinessAbility) C1558520qew.LIZ(interfaceC665370Q7z, MainBusinessAbility.class, null);
    }
}
