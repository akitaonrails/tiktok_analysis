package X;

import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08kL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2204308kL {
    public static final C2204308kL LIZ = new C2204308kL();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1753));
    public static final Gson LIZJ = C7740030o.LIZ().getGson();

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static String LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
