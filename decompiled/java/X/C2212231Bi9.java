package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.1Bi9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212231Bi9 {
    public static InterfaceC20685715x1 LIZIZ;
    public static volatile InterfaceC2213261Bjo LIZJ;
    public static InterfaceC2213241Bjm LIZLLL;
    public static ExecutorService LJ;
    public static ExecutorService LJFF;
    public static ExecutorService LJI;
    public static long LJII;
    public static long LJIIJ;
    public static C2212311BiH LJIIJJI;
    public static HashMap<String, String> LJIIL;
    public static AbstractC2212871BjB LJIILIIL;
    public static InterfaceC2213251Bjn LJIILJJIL;
    public static Context LJIILL;
    public static C1BF7 LJIIZILJ;
    public static AbstractC2212891BjD LJIJ;
    public static int LJIJI;
    public static int LJIJJ;
    public static int LJIJJLI;
    public static int LJIL;
    public static volatile String LJJIFFI;
    public static volatile String LJJII;
    public static InterfaceC1018310cbd LJJIIZI;
    public static InterfaceC2213221Bjk LJJJI;
    public static InterfaceC2213031BjR LJJJJJL;
    public static AbstractC2212881BjC LJJJJL;
    public static AbstractC2212691Bit LJJJJLI;
    public static InterfaceC2213211Bjj LJJJJLL;
    public static C0VRP LJJJJZ;
    public static C2212421BiS LJJJLL;
    public static InterfaceC2213231Bjl LJJL;
    public static final String LIZ = String.valueOf(2013656);
    public static boolean LJIIIIZZ = false;
    public static volatile boolean LJIIIZ = false;
    public static boolean LJIILLIIL = false;
    public static volatile boolean LJJ = false;
    public static volatile boolean LJJI = false;
    public static volatile long LJJIII = 864000000;
    public static volatile boolean LJJIIJ = true;
    public static int LJJIIJZLJL = 0;
    public static boolean LJJIIZ = true;
    public static boolean LJJIJ = false;
    public static int LJJIJIIJI = -1;
    public static boolean LJJIJIIJIL = false;
    public static long LJJIJIL = 2000;
    public static long LJJIJL = 2000;
    public static boolean LJJIJLIJ = false;
    public static boolean LJJIL = true;
    public static boolean LJJIZ = false;
    public static boolean LJJJ = false;
    public static boolean LJJJIL = false;
    public static boolean LJJJJ = false;
    public static int LJJJJI = 0;
    public static int LJJJJIZL = 0;
    public static boolean LJJJJJ = false;
    public static boolean LJJJJZI = false;
    public static final int LJJJLIIL = -1;
    public static boolean LJJJLZIJ = false;
    public static boolean LJJJZ = false;

    public static C2212311BiH LIZIZ() {
        if (LJIIJJI == null) {
            LJIIJJI = new C2212311BiH();
        }
        return LJIIJJI;
    }

    public static String LIZLLL() {
        C2212311BiH c2212311BiH = LJIIJJI;
        String strLJ = c2212311BiH != null ? c2212311BiH.LJ() : "";
        return TextUtils.isEmpty(strLJ) ? C2212141Bi0.LJIIIIZZ().LIZJ.LIZLLL("splash_ad_did") : strLJ;
    }

    public static InterfaceC2213031BjR LJFF() {
        if (LJJJJJL == null) {
            LJJJJJL = new InterfaceC2213031BjR() { // from class: X.1Bim
                @Override // X.InterfaceC2213031BjR
                public final void LIZ() {
                }

                @Override // X.InterfaceC2213031BjR
                public final void LIZIZ(View view, List<View> list) {
                }

                @Override // X.InterfaceC2213031BjR
                public final void LIZJ() {
                }

                @Override // X.InterfaceC2213031BjR
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC2213031BjR
                public final void LJ() {
                }

                @Override // X.InterfaceC2213031BjR
                public final void LJFF() {
                }

                @Override // X.InterfaceC2213031BjR
                public final void LJI(C2212201Bi6 c2212201Bi6) {
                }

                @Override // X.InterfaceC2213031BjR
                public final void LJII() {
                }

                @Override // X.InterfaceC2213031BjR
                public final void LJIIIIZZ() {
                }

                @Override // X.InterfaceC2213031BjR
                public final void LJIIIZ(long j) {
                }
            };
        }
        return LJJJJJL;
    }

    public static String LJI() {
        return TextUtils.isEmpty(LJJII) ? LIZ(LIZJ()) : LIZ(LJJII);
    }

    public static AbstractC2212691Bit LJII() {
        if (LJJJJLI == null) {
            LJJJJLI = new AbstractC2212691Bit() { // from class: X.1Biu
            };
        }
        return LJJJJLI;
    }

    public static C2212421BiS LJIIIIZZ() {
        if (LJJJLL == null) {
            LJJJLL = C2212421BiS.LIZ(null);
        }
        return LJJJLL;
    }

    public static String LIZJ() throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Context context = LJIILL;
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = context.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Context applicationContext = null;
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(objInvoke);
                    if (obj instanceof Application) {
                        applicationContext = ((Application) obj).getApplicationContext();
                        PrintStream printStream = System.out;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Application context obtained through ActivityThread: ");
                        sbLIZ2.append(applicationContext);
                        printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        System.out.println("Error: mInitialApplication is not an instance of Application");
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Error: ");
                    sbLIZ3.append(e.getMessage());
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ3));
                }
                if (applicationContext == null) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(th.getMessage());
                    sbLIZ4.append(":");
                    sbLIZ4.append(C08RN.LIZJ());
                    sbLIZ4.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ4));
                }
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            }
            file = C786450Ut9.LIZJ;
        }
        sbLIZ.append(file.getAbsolutePath());
        sbLIZ.append("/splashCache/");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJ() {
        if (!LJIIIIZZ().LIZIZ) {
            return LJI();
        }
        String strLIZJ = LJJIFFI;
        if (TextUtils.isEmpty(strLIZJ)) {
            strLIZJ = LIZJ();
        }
        return LIZ(strLIZJ);
    }

    public static void LJIIIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UDPClient. setIsFirstTimeRequestAd: ");
        sbLIZ.append(false);
        C2188811AlT.LIZIZ(sbLIZ);
        LJJIIZ = false;
    }

    public static String LIZ(String str) {
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
