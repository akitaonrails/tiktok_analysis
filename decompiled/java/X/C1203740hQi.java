package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0hQi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203740hQi {
    public static final C1203740hQi LIZ = new C1203740hQi();
    public static final Keva LIZIZ = Keva.getRepo("Nearby-Keva");

    public static String LIZ(String str) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
