package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tools.AVApi;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06pY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1727006pY {
    public static final C1727006pY LIZ = new C1727006pY();
    public static final String LIZIZ = ((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1458));
    public static final ArrayList<InterfaceC1727306pb> LIZLLL = new ArrayList<>();

    public static void LIZ() {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1726906pX(null), 3);
    }

    public static int LIZIZ() {
        LIZJ();
        Keva keva = C1727106pZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_quota_remain");
        sbLIZ.append(C1727106pZ.LIZIZ());
        return keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 5);
    }

    public static void LIZJ() {
        if (C1727106pZ.LIZ() >= 0) {
            Date date = new Date();
            Date date2 = new Date(C1727106pZ.LIZ());
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(date2);
            if ((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / TimeUnit.SECONDS.toMillis(1L) < ((Number) C1727206pa.LIZ.getValue()).intValue()) {
                return;
            }
        }
        LIZ();
    }
}
