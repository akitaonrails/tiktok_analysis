package X;

import com.bytedance.keva.Keva;
import java.security.SecureRandom;

/* JADX INFO: renamed from: X.0cJN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006990cJN {
    public static final C1006990cJN LIZ = new C1006990cJN();
    public static final Keva LIZIZ = Keva.getRepo("commerce_interest_feedback_button");
    public static final SecureRandom LIZJ = new SecureRandom();

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
