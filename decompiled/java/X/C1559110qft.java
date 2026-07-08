package X;

import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.journey.NewUserGuideAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;

/* JADX INFO: renamed from: X.0qft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559110qft {
    public static boolean LIZ;
    public static boolean LIZIZ;

    public static MainBusinessAbility LIZ(C19EG c19eg) {
        Object ability;
        Object obj = null;
        if (C297720Bli.LIZ()) {
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
        return (MainBusinessAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), MainBusinessAbility.class, null);
    }

    public static final boolean LIZIZ(C19EG c19eg) {
        if (c19eg != null) {
            return ((NewUserGuideAbility) C1558520qew.LIZJ(C1558360qeg.LJI(c19eg, null), NewUserGuideAbility.class)).isNewUser();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
