package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0XAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C844470XAv {
    public static volatile Application LIZIZ;
    public static volatile Integer LIZJ;
    public static volatile String LJ;
    public static volatile C844510XAz LJFF;
    public static volatile C844500XAy LJI;
    public static volatile String LJII;
    public static volatile String LJIILLIIL;
    public static boolean LJIJ;
    public static boolean LJIJI;
    public static boolean LJIJJ;
    public static long LJIJJLI;
    public static final C844470XAv LIZ = new C844470XAv();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1231204rm());
    public static volatile C0CQU LJIIIIZZ = new C0CQU();
    public static volatile int LJIIIZ = 2;
    public static volatile int LJIIJ = -1;
    public static volatile String LJIIJJI = "";
    public static volatile String LJIIL = "";
    public static volatile String LJIILIIL = "";
    public static volatile String LJIILJJIL = "";
    public static volatile String LJIILL = "googleplay";
    public static volatile int LJIIZILJ = -1;

    public static Context LIZ() {
        try {
            Application application = LIZIZ;
            if (application != null) {
                return application;
            }
            Object obj = Unit.LIZ;
            return obj != null ? (Application) obj : C1BWL.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C1BWL.LIZ();
        }
    }

    public static long LIZIZ() {
        C844500XAy c844500XAy = LJI;
        if (c844500XAy == null) {
            c844500XAy = null;
        }
        return c844500XAy.LIZ;
    }

    public static String LIZJ() {
        C844500XAy c844500XAy = LJI;
        if (c844500XAy == null) {
            c844500XAy = null;
        }
        return c844500XAy.LIZIZ;
    }

    public static long LIZLLL() {
        C844500XAy c844500XAy = LJI;
        if (c844500XAy == null) {
            c844500XAy = null;
        }
        return c844500XAy.LIZJ;
    }

    public static long LJ() {
        C844510XAz c844510XAz = LJFF;
        if (c844510XAz == null) {
            c844510XAz = null;
        }
        return c844510XAz.LIZ;
    }

    public static String LJFF() {
        C844510XAz c844510XAz = LJFF;
        if (c844510XAz == null) {
            c844510XAz = null;
        }
        return c844510XAz.LIZIZ;
    }
}
