package X;

import Y.ARunnableS92S0000000_13;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import androidx.fragment.app.Fragment;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.util.IFeedCacheLoaderService;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0X35, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X35 {
    public static Boolean LIZJ;
    public static Thread LJIIIIZZ;
    public static C146A LJIIIZ;
    public static final Map<String, Boolean> LIZ = new ConcurrentHashMap();
    public static int LIZIZ = 4;
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static boolean LJ = true;
    public static volatile boolean LJFF = false;
    public static volatile int LJI = 12;
    public static final String LJII = "samsung_kill_self_interval";
    public static Integer LJIIJ = null;
    public static final Object LJIIJJI = new Object();

    public static boolean LJIILIIL() {
        C844470XAv.LIZ.getClass();
        return C2093608Ic.LIZJ(C844470XAv.LJIILL, "qtp");
    }

    public static boolean LJ() {
        int iMyTid = Process.myTid();
        if (!JatoXL.isInited()) {
            return false;
        }
        JatoXL.setPriority(iMyTid, -20);
        CpusetManager.bindBigCore(iMyTid);
        return true;
    }

    public static void LJIIIZ() {
        if (C0BUP.LIZ() == -1 || !((IFeedCacheLoaderService) ServiceManager.get().getService(IFeedCacheLoaderService.class)).LJII()) {
            return;
        }
        C584420Mw4 c584420Mw4LIZ = C584420Mw4.LIZ();
        int i = C2187451AjH.LJII;
        if (c584420Mw4LIZ.LIZIZ.get()) {
            return;
        }
        try {
            if (JatoXL.isInited()) {
                synchronized (C584420Mw4.class) {
                    try {
                        if (!((CopyOnWriteArrayList) c584420Mw4LIZ.LIZ).contains(Integer.valueOf(i))) {
                            ((CopyOnWriteArrayList) c584420Mw4LIZ.LIZ).add(Integer.valueOf(i));
                            JatoXL.setPriority(i, 10);
                            CpusetManager.bindLittleCore(i);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static void LIZIZ(String str) {
        LIZJ(str, "");
    }

    public static void LIZLLL(String str) {
        if (LJIIIZ == null) {
            LJIIIZ = C202103146b.LIZ(0, "feed_total");
        }
        C146A c146a = LJIIIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cold_boot_application_attach_duration");
        sbLIZ.append(e3.g);
        sbLIZ.append(str);
        c146a.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJFF(String str) {
        C1150504el.LIZ().LIZLLL(str, false);
        C08TN.LIZ().LJ(str, true);
    }

    public static void LJI(String str) {
        C08TN.LIZ().LJI(str);
        C1150504el.LIZ().LJI(str, false);
    }

    public static void LJII(final ApplicationInfo applicationInfo) {
        synchronized (LJIIJJI) {
            try {
                if (LJIIJ == null) {
                    C2104908Ml.LIZIZ();
                    C0X38.LIZIZ(new ContextWrapper() { // from class: X.09cF
                        @Override // android.content.ContextWrapper, android.content.Context
                        public final ApplicationInfo getApplicationInfo() {
                            return applicationInfo;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(null);
                        }

                        @Override // android.content.ContextWrapper
                        public final void attachBaseContext(Context context) {
                            if (NxRewordManager.LJIILIIL) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("attachBaseContextWrapper: ");
                                sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
                                C2188811AlT.LIZIZ(sbLIZ);
                                context = new C817700W5w(context, false);
                            }
                            super.attachBaseContext(context);
                        }
                    }, C0BEC.LIZLLL());
                    LJIIJ = Integer.valueOf(C0X38.LIZ());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean LJIIL(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
        if (concurrentHashMap.get(str) != null && !Boolean.FALSE.equals(concurrentHashMap.get(str))) {
            return false;
        }
        concurrentHashMap.put(str, Boolean.TRUE);
        return true;
    }

    public static void LJIILL(Runnable runnable) {
        SystemClock.uptimeMillis();
        runnable.run();
    }

    public static void LJIJ(C0X37 c0x37) {
        try {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                int i = C0X36.LIZIZ[c0x37.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    LJIIIIZZ(C786410Ut5.v2(), new ARunnableS92S0000000_13(61));
                                    return;
                                }
                                return;
                            }
                            LJIIIIZZ(C786410Ut5.v2(), new ARunnableS92S0000000_13(60));
                            return;
                        }
                        C13WZ c13wz = C089N.LIZ;
                        c13wz.LJIILLIIL(C0X37.Live);
                        c13wz.LIZ();
                        return;
                    }
                    C13WZ c13wz2 = C089N.LIZ;
                    c13wz2.LJIILLIIL(C0X37.Mall);
                    c13wz2.LIZ();
                    return;
                }
                C13WZ c13wz3 = C089N.LIZ;
                c13wz3.LJIILLIIL(C0X37.Chat);
                c13wz3.LIZ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJIJI(long j) {
        C202099145x c202099145xLIZ = C1150504el.LIZ();
        ((ConcurrentHashMap) c202099145xLIZ.LIZIZ).put("feed_total", Long.valueOf(j));
        ((ConcurrentHashMap) c202099145xLIZ.LIZJ).put("feed_total", Long.valueOf(j));
    }

    public static void LIZ(String str, boolean z) {
        if (z) {
            if (!C1150504el.LIZ().LJIIIIZZ(str)) {
                C1150504el.LIZ().LIZLLL(str, false);
            }
            C08TN.LIZ().LIZJ(str);
        } else {
            C1150504el.LIZ().LIZLLL(str, false);
            C08TN.LIZ().LJ(str, false);
        }
    }

    public static void LIZJ(String str, String str2) {
        if ((C146T.LIZIZ.LIZ & 2) != 0) {
            if (LJIIIIZZ == null) {
                LJIIIIZZ = Looper.getMainLooper().getThread();
            }
            if (LJIIIZ == null) {
                LJIIIZ = C202103146b.LIZ(0, "feed_total");
            }
            if (Thread.currentThread() == LJIIIIZZ) {
                C146A c146a = LJIIIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(e3.g);
                sbLIZ.append(str2);
                c146a.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static void LJIIIIZZ(Choreographer choreographer, Runnable runnable) {
        try {
            Method methodLIZIZ = C1959507lx.LIZIZ(choreographer.getClass(), "postCallbackDelayed", Integer.TYPE, Runnable.class, Object.class, Long.TYPE);
            while (true) {
                int i = LIZIZ;
                if (i < 0) {
                    break;
                }
                try {
                    C2204961BRm.a0(methodLIZIZ, choreographer, new Object[]{Integer.valueOf(i), new ARunnableS92S0000000_13(59), null, 0}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOinbIuA/z3N4wkEe68wdH2+WBE=", null));
                    break;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LIZIZ--;
                }
            }
            int i2 = LIZIZ;
            if (i2 != 0) {
                C2204961BRm.a0(methodLIZIZ, choreographer, new Object[]{Integer.valueOf(i2), runnable, null, 0}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOinbIuA/z3N4wkEe68wdH2+WBE=", null));
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static void LJIIJ(long j, String str) {
        C08TN.LIZ().LJIIIZ(str);
        if (!C1150504el.LIZ().LJIIIZ(str)) {
            C1150504el.LIZ().LJFF(j, str, false);
        }
    }

    public static void LJIIJJI(String str, boolean z) {
        if (z) {
            C08TN.LIZ().LJIIIZ(str);
            if (!C1150504el.LIZ().LJIIIZ(str)) {
                C1150504el.LIZ().LJI(str, false);
                return;
            }
            return;
        }
        C08TN.LIZ().LJI(str);
        C1150504el.LIZ().LJI(str, false);
    }

    public static void LJIJJ(Application application, Runnable runnable) {
        boolean z;
        Boolean bool = LIZJ;
        if (bool != null && bool.booleanValue()) {
            runnable.run();
        }
        if (LJIILIIL()) {
            runnable.run();
        }
        try {
            ActivityManager activityManager = (ActivityManager) C446980Hfs.LIZIZ(application, ActivityManager.class);
            if (activityManager != null) {
                List listLJI = C2204961BRm.LJI(activityManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOinbIuA/z3N4wkEe68wdH2+WBE=", null));
                if (!C086I.LIZIZ(listLJI)) {
                    boolean z2 = false;
                    Intent intent = ((ActivityManager.RecentTaskInfo) listLJI.get(0)).baseIntent;
                    String action = intent.getAction();
                    if (action != null && action.equals("android.intent.action.MAIN")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Set<String> categories = intent.getCategories();
                    if (categories != null && categories.contains("android.intent.category.LAUNCHER")) {
                        z2 = true;
                    }
                    if (z && z2) {
                        LIZJ = Boolean.TRUE;
                        runnable.run();
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJIILJJIL(long j, String str, boolean z) {
        C1150504el.LIZ().LJ(j, str);
        if (z) {
            C08TN.LIZ().LJII(j, str);
        } else {
            C08TN.LIZ().LJFF(j, str);
        }
    }

    public static void LJIIZILJ(C0X37 c0x37, EnumC586050Myh enumC586050Myh, String str) {
        C0X37 c0x372;
        Fragment fragmentLIZLLL;
        try {
            if (Looper.getMainLooper() == Looper.myLooper() && c0x37 == (c0x372 = C0X37.FYP)) {
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ != null && (fragmentLIZLLL = abstractC1387200mCcLJ.LIZLLL()) != null && fragmentLIZLLL.getClass().getName().contains("Detail")) {
                    C13WZ c13wz = C089N.LIZ;
                    c13wz.LJIILLIIL(C0X37.Detail);
                    c13wz.LIZ();
                } else {
                    C13WZ c13wz2 = C089N.LIZ;
                    c13wz2.LJIILLIIL(c0x372);
                    c13wz2.LJIILL(enumC586050Myh);
                    c13wz2.LJIIJJI = str;
                    c13wz2.LIZ();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJIILLIIL(String str, C0X52<Object> c0x52, long j, long j2) {
        String strLIZIZ = str;
        if (c0x52 != null) {
            try {
                String[] strArrSplit = strLIZIZ.split("/");
                if (strArrSplit.length >= 2) {
                    String str2 = strArrSplit[strArrSplit.length - 2];
                    String str3 = strArrSplit[strArrSplit.length - 1];
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append('/');
                    sbLIZ.append(str3);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                C08TN.LIZ().LJIILLIIL(strLIZIZ, c0x52.LIZLLL, SystemClock.uptimeMillis() - j, SystemClock.currentThreadTimeMillis() - j2, SystemClock.uptimeMillis() - C202094145s.LJII);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
