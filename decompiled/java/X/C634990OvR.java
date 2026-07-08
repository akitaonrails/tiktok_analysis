package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0OvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634990OvR {
    public static final C634990OvR LIZ = new C634990OvR();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(683));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(682));

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static String LIZIZ(String str, String str2) {
        C0XQ7.LJ();
        String curUserId = C0XQ7.LIZ.LJIIJ().getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(curUserId);
        sbLIZ.append(':');
        sbLIZ.append(str);
        sbLIZ.append(':');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
