package X;

import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;

/* JADX INFO: renamed from: X.0qga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559540qga {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(C19EG c19eg) {
        MainBusinessAbility mainBusinessAbilityLIZJ;
        if (c19eg == null || (mainBusinessAbilityLIZJ = LIZJ(c19eg)) == null) {
            return false;
        }
        return mainBusinessAbilityLIZJ.QQ1();
    }

    public static final boolean LIZIZ(C19EG c19eg) {
        MainBusinessAbility mainBusinessAbility;
        Object ability;
        if (c19eg == null) {
            return false;
        }
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
            mainBusinessAbility = (MainBusinessAbility) obj;
        } else {
            mainBusinessAbility = (MainBusinessAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), MainBusinessAbility.class, null);
        }
        if (mainBusinessAbility == null) {
            return false;
        }
        return mainBusinessAbility.cl0();
    }

    public static MainBusinessAbility LIZJ(C19EG c19eg) {
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
}
