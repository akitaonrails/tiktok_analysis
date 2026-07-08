package X;

import com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService;
import com.ss.android.ugc.aweme.im.saas.host.api.im.contact.ISaasUserUpdateMonitor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0ZJX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZJX {
    public static final C1231704rr LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final AtomicBoolean LJ;
    public static volatile long LJFF;
    public static volatile long LJI;
    public static final C01GW LJII;
    public static final C01GW LJIIIIZZ;

    static {
        C1231704rr c1231704rr = new C1231704rr("[AS][Init]", null, 6);
        LIZ = c1231704rr;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C595860NYq());
        LIZIZ = c01gwLIZIZ;
        LIZJ = C452501pT.LIZIZ(new C0ZJB());
        LIZLLL = C452501pT.LIZIZ(new C897620ZJg());
        LJ = new AtomicBoolean(false);
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new C0ZJ2());
        LJII = c01gwLIZIZ2;
        C01GW c01gwLIZIZ3 = C452501pT.LIZIZ(new C897660ZJk());
        LJIIIIZZ = c01gwLIZIZ3;
        C897610ZJf c897610ZJf = new C897610ZJf();
        C897600ZJe c897600ZJe = new C897600ZJe();
        LJI = System.currentTimeMillis();
        C0I0B.LJFF.LIZJ();
        if (C2104408Mg.LIZJ(C894660Z7w.LIZ())) {
            c1231704rr.LIZIZ();
            ((ActivityStatusService) c01gwLIZIZ.getValue()).LJIIIZ(new C595740NYe());
            LJFF = System.currentTimeMillis() - LJI;
            ISaasUserUpdateMonitor iSaasUserUpdateMonitor = (ISaasUserUpdateMonitor) c01gwLIZIZ2.getValue();
            if (iSaasUserUpdateMonitor != null) {
                iSaasUserUpdateMonitor.LIZJ(c897610ZJf);
            }
            ((C897670ZJl) c01gwLIZIZ3.getValue()).LIZ = c897600ZJe;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init refactored activity status module end, duration (");
            sbLIZ.append(System.currentTimeMillis() - LJI);
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LIZ(boolean z) {
        String str;
        C897570ZJb c897570ZJb = (C897570ZJb) LIZLLL.getValue();
        C1231704rr c1231704rr = c897570ZJb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceCloseActivityStatus ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        c897570ZJb.LJFF = z;
        if (z) {
            if (c897570ZJb.LIZJ()) {
                c897570ZJb.LIZJ.LIZLLL("manual_shut_down", EnumC595840NYo.ALL);
            }
        } else {
            if (!c897570ZJb.LIZIZ()) {
                return;
            }
            if (c897570ZJb.LJI.getAndSet(true)) {
                str = "manual_open";
            } else {
                str = "app_launch";
            }
            c897570ZJb.LIZJ.LJ(str, EnumC595840NYo.ALL);
        }
    }
}
