package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0iXB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246190iXB {
    public static final long LIZIZ = TimeUnit.DAYS.toMillis(30);
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(13));

    public final Keva LIZ() {
        return (Keva) this.LIZ.getValue();
    }

    public final void LIZJ(String str) {
        LIZ().storeLong(LIZIZ("exit_until_ts", str), System.currentTimeMillis() + LIZIZ);
        LIZ().storeInt(LIZIZ("show_pv_count", str), 0);
    }

    public static String LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
