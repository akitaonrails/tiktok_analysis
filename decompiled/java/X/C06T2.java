package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;

/* JADX INFO: renamed from: X.06T2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06T2 {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;

    static {
        C437510HDp c437510HDp = C437510HDp.LIZ;
        User currentUser = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurrentUser();
        if (currentUser == null) {
            currentUser = new User();
        }
        LIZ = C1383370m6R.LJIIJ(C437510HDp.LIZ(c437510HDp, currentUser, 2131827050, null, null, null, 8));
        LIZIZ = C1383370m6R.LJIIJ(2131827060);
        LIZJ = C1383370m6R.LJIIJ(2131827061);
    }

    public static String LIZ(String str) {
        if (str != null) {
            return C786410Ut5.j4(C1383370m6R.LJIIJ(2131835843), Arrays.copyOf(new Object[]{str}, 1));
        }
        return C1383370m6R.LJIIJ(2131837343);
    }

    public static String LIZIZ(String str) {
        if (str != null) {
            return C1710306mr.LIZIZ(2131827059, str);
        }
        return C1383370m6R.LJIIJ(2131830982);
    }
}
