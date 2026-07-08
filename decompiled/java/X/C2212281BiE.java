package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212281BiE {
    public static volatile boolean LIZ;

    public static void LIZJ(long j) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SDK init duration: ");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        JSONObject jSONObject = new JSONObject();
        try {
            if (C2212231Bi9.LJJJ) {
                str = "dur_use_file";
            } else {
                str = "dur_use_sp";
            }
            jSONObject.put(str, j);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C2212291BiF.LIZLLL().LJIIIIZZ("service_sdk_init_duration", 0, jSONObject, null);
    }

    public static void LIZ(Context context, C2212361BiM c2212361BiM) {
        String str = C2212231Bi9.LIZ;
        C2212231Bi9.LJIILL = C786410Ut5.N3(context);
        if (c2212361BiM != null) {
            InterfaceC2213221Bjk interfaceC2213221Bjk = c2212361BiM.LJII;
            if (C2212231Bi9.LJIIJJI == null) {
                C2212231Bi9.LJIIJJI = new C2212311BiH();
            }
            C2212231Bi9.LJJJI = interfaceC2213221Bjk;
            C2212231Bi9.LJJJLL = C2212421BiS.LIZ(c2212361BiM.LJIIIIZZ);
            C2212231Bi9.LJIIL = c2212361BiM.LJ;
            ExecutorService executorServiceH4 = c2212361BiM.LIZ;
            if (executorServiceH4 == null) {
                executorServiceH4 = C786410Ut5.h4();
            }
            C2212231Bi9.LJ = executorServiceH4;
            ExecutorService executorServiceH42 = c2212361BiM.LIZIZ;
            if (executorServiceH42 == null) {
                executorServiceH42 = C786410Ut5.h4();
            }
            C2212231Bi9.LJFF = executorServiceH42;
            ExecutorService executorServiceH43 = c2212361BiM.LIZJ;
            if (executorServiceH43 == null) {
                executorServiceH43 = C786410Ut5.h4();
            }
            C2212231Bi9.LJI = executorServiceH43;
            C2212671Bir c2212671BirLIZ = C2212671Bir.LIZ();
            ExecutorService executorService = c2212361BiM.LIZLLL;
            if (executorService != null) {
                c2212671BirLIZ.LIZ = executorService;
            } else {
                c2212671BirLIZ.getClass();
            }
            C2212231Bi9.LJJIIZI = c2212361BiM.LJFF;
            C2212231Bi9.LJJIJLIJ = false;
            C2212231Bi9.LJJIL = c2212361BiM.LJI;
            C2212231Bi9.LJJIZ = false;
            C2212231Bi9.LJJJ = false;
            C2212231Bi9.LJJJIL = false;
        } else {
            C2212231Bi9.LJ = C786410Ut5.h4();
            C2212231Bi9.LJFF = C786410Ut5.h4();
            C2212231Bi9.LJI = C786410Ut5.h4();
        }
        if (C2212231Bi9.LJJIL) {
            C1554590qYb.LIZ().getClass();
            if (C2212091Bhv.LIZ == null) {
                synchronized (C2212091Bhv.class) {
                    try {
                        if (C2212091Bhv.LIZ == null) {
                            C2212091Bhv.LIZ = new C2212091Bhv();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            final C2212091Bhv c2212091Bhv = C2212091Bhv.LIZ;
            c2212091Bhv.getClass();
            if (!C2212231Bi9.LJJ) {
                C2212231Bi9.LJJ = true;
                Runnable runnable = new Runnable() { // from class: X.1Bhw
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SplashAdLocalDataLoader@fbf0.abLoadLocalSplashData$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SplashAdLocalDataLoader@fbf0.abLoadLocalSplashData$1");
                    }

                    public final void LIZ() {
                        List<C2212201Bi6> listLIZ;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            c2212091Bhv.getClass();
                            List<C2212201Bi6> listLIZ2 = C2212091Bhv.LIZ();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("wait for load local:");
                            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                            C2188811AlT.LIZIZ(sbLIZ);
                            if (C2212231Bi9.LJJI) {
                                return;
                            }
                            C2212061Bhs c2212061BhsLIZIZ = C2212061Bhs.LIZIZ();
                            if (C2212231Bi9.LJJIJLIJ) {
                                c2212091Bhv.getClass();
                                try {
                                    String strLIZLLL = C2212141Bi0.LJIIIIZZ().LIZJ.LIZLLL("splash_ad_first_show_data");
                                    listLIZ = C2212161Bi2.LIZ(!C2211541Bh2.LIZ(strLIZLLL) ? new JSONArray(strLIZLLL) : new JSONArray(), 0L, true);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    listLIZ = null;
                                }
                                c2212061BhsLIZIZ.LIZIZ = listLIZ;
                            }
                            long jLIZJ = C2212141Bi0.LJIIIIZZ().LIZJ.LIZJ("splash_ad_leave_interval", 0L);
                            long jLIZJ2 = C2212141Bi0.LJIIIIZZ().LIZJ.LIZJ("splash_ad_splash_interval", 0L);
                            long jLIZJ3 = C2212141Bi0.LJIIIIZZ().LIZJ.LIZJ("splash_ad_cold_launch_interval", 0L);
                            long jLIZJ4 = C2212141Bi0.LJIIIIZZ().LIZJ.LIZJ("splash_ad_last_show_time", 0L);
                            long jLIZJ5 = C2212141Bi0.LJIIIIZZ().LIZJ.LIZJ("splash_last_stock_time", 0L);
                            long jLIZJ6 = C2212141Bi0.LJIIIIZZ().LIZJ.LIZJ("splash_old_logic_last_stock_time", 0L);
                            String strLIZLLL2 = C2212141Bi0.LJIIIIZZ().LIZJ.LIZLLL("key_splash_ad_penalty_period");
                            String strLJFF = C2212141Bi0.LJIIIIZZ().LJFF();
                            String strLIZLLL3 = C2212141Bi0.LJIIIIZZ().LIZJ.LIZLLL("key_splash_ad_time_period_map");
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("wait for load sp:");
                            sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            if (!TextUtils.isEmpty(strLIZLLL2)) {
                                JSONArray jSONArray = new JSONArray(strLIZLLL2);
                                if (jSONArray.length() == 2) {
                                    long j = JSONArrayProtectorUtils.getLong(jSONArray, 0) * 1000;
                                    long j2 = JSONArrayProtectorUtils.getLong(jSONArray, 1) * 1000;
                                    if (j > 0) {
                                        c2212061BhsLIZIZ.LJ = j;
                                    } else {
                                        c2212061BhsLIZIZ.getClass();
                                    }
                                    if (j2 > 0) {
                                        c2212061BhsLIZIZ.LJFF = j2;
                                    }
                                }
                            }
                            c2212061BhsLIZIZ.LIZ = listLIZ2;
                            c2212061BhsLIZIZ.LIZLLL = jLIZJ;
                            c2212061BhsLIZIZ.LIZJ = jLIZJ2;
                            c2212061BhsLIZIZ.LJI = jLIZJ3;
                            c2212061BhsLIZIZ.LJIIJJI = strLJFF;
                            if (!TextUtils.isEmpty(strLIZLLL3)) {
                                c2212061BhsLIZIZ.LJIIIZ = C2349409Im.LIZ(strLIZLLL3);
                            }
                            if (C2212231Bi9.LJIIIIZZ().LJII) {
                                C2212181Bi4.LJ().LJFF = jLIZJ4;
                            }
                            C2212181Bi4.LJ().LIZLLL = jLIZJ5;
                            C2212181Bi4.LJ().LJ = jLIZJ6;
                            C2212231Bi9.LJJI = true;
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("load local and init time:");
                            sbLIZ3.append(jCurrentTimeMillis2);
                            C2188811AlT.LIZIZ(sbLIZ3);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(C2212231Bi9.LJJJ ? "dur_use_file" : "dur_use_sp", jCurrentTimeMillis2);
                            C2212291BiF.LIZLLL().LJIIIIZZ("service_load_local_data", 0, jSONObject, null);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                };
                if (C2212231Bi9.LJJIZ) {
                    C2212231Bi9.LJFF.execute(runnable);
                } else {
                    runnable.run();
                }
            }
            C2212441BiU c2212441BiULIZ = C2212441BiU.LIZ();
            c2212441BiULIZ.getClass();
            c2212441BiULIZ.LIZ = System.currentTimeMillis();
            c2212441BiULIZ.LIZIZ = true;
        }
    }

    public static void LIZIZ(Context context, C2212361BiM c2212361BiM) {
        if (!LIZ) {
            synchronized (C2212281BiE.class) {
                try {
                    if (!LIZ) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        LIZ(C786410Ut5.N3(context), c2212361BiM);
                        LIZ = true;
                        LIZJ(System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
