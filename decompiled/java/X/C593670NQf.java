package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* JADX INFO: renamed from: X.0NQf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C593670NQf {
    public static final C593670NQf LIZ = new C593670NQf();
    public static final Keva LIZIZ = KevaImpl.getRepo("pns_compliance_common_keva", 1);

    public static String LIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null || curUserId.length() == 0) {
            curUserId = "guest";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(curUserId);
        sbLIZ.append("_user_eligibility_result");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
