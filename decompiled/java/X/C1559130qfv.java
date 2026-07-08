package X;

import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;

/* JADX INFO: renamed from: X.0qfv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559130qfv {
    public static final void LIZ(C19EG c19eg, boolean z) {
        MainPageBusinessAbility mainPageBusinessAbility;
        Object ability;
        if (!(c19eg instanceof C19EG)) {
            return;
        }
        Object obj = null;
        if (C297720Bli.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(c19eg, null), MainActivityScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(MainPageBusinessAbility.class);
            } else {
                ability = null;
            }
            if (ability instanceof MainPageBusinessAbility) {
                obj = ability;
            }
            mainPageBusinessAbility = (MainPageBusinessAbility) obj;
        } else {
            mainPageBusinessAbility = (MainPageBusinessAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), MainPageBusinessAbility.class, null);
        }
        if (mainPageBusinessAbility != null) {
            mainPageBusinessAbility.Db(z);
        }
    }
}
