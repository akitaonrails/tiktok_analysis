package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import java.io.File;
import java.io.PrintStream;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0pSH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512230pSH {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context) throws Throwable {
        Object obj;
        C1511430pQz.LIZ = C1511400pQw.LIZLLL;
        C1509300pNY.LIZ = new C1509170pNL() { // from class: X.0pNJ
            @Override // X.C1509170pNL, X.C1509180pNM
            public final void LIZ(C1510230pP3 c1510230pP3) {
                C1509130pNH.LIZ.LIZ(c1510230pP3);
                C1509160pNK.LIZ.getClass();
                C1509140pNI.LIZ.getClass();
                C1509070pNB.LIZ.LIZ(c1510230pP3);
                C1509100pNE.LIZ.getClass();
                C1509120pNG.LIZ.LIZ(c1510230pP3);
                C1509040pN8.LIZ.LIZ(c1510230pP3);
                C1509060pNA.LIZ.LIZ(c1510230pP3);
                C1509230pNR.LIZ.LIZ(c1510230pP3);
                C1510090pOp.LIZ.LIZ(c1510230pP3);
                C1509220pNQ.LIZ.getClass();
                C1509080pNC.LIZ.LIZ(c1510230pP3);
                C1509360pNe.LIZ.LIZ(c1510230pP3);
                C1509330pNb.LIZ.getClass();
                C1509210pNP.LIZ.LIZ(c1510230pP3);
                C1509510pNt.LIZ.LIZ(c1510230pP3);
                C1509520pNu.LIZ.LIZ(c1510230pP3);
                C1509620pO4.LIZ.LIZ(c1510230pP3);
                C1509110pNF.LIZ.getClass();
                C1509090pND.LIZ.getClass();
                C1509270pNV.LIZ.LIZ(c1510230pP3);
                C1509280pNW.LIZ.LIZ(c1510230pP3);
                super.LIZ(c1510230pP3);
            }

            @Override // X.C1509170pNL, X.C1509180pNM
            public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
                String str;
                SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
                if (smartSceneConfig != null && smartSceneConfig.getFeatures() != null) {
                    C1509130pNH.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509160pNK.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509140pNI.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509070pNB.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509100pNE.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509120pNG.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509040pN8.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509060pNA.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509230pNR.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509080pNC.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1510090pOp.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509220pNQ.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509360pNe.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509330pNb.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509210pNP.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509510pNt.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509520pNu.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509620pO4.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509110pNF.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509090pND.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509240pNS.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509270pNV.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    C1509280pNW.LIZ.LIZIZ(c1510230pP3, c1509310pNZ);
                    super.LIZ(c1510230pP3);
                    Map<String, Object> map = c1509310pNZ.LJFF;
                    if (map != null) {
                        c1509310pNZ.LIZIZ().putAll(map);
                    }
                    Map<String, Object> map2 = c1509310pNZ.LJ;
                    if (map2 != null && !map2.containsKey("enter_type") && (str = c1509310pNZ.LIZJ) != null) {
                        map2.put("enter_type", str);
                    }
                }
            }
        };
        if (!C1512400pSY.LIZIZ) {
            C1512400pSY.LIZIZ = true;
            C1512320pSQ.LIZ = false;
            C1512390pSX c1512390pSX = C1512400pSY.LIZ;
            C1512380pSW.LIZ = true;
            C1512380pSW.LIZIZ = c1512390pSX;
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
                        obj = declaredField.get(objInvoke);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        PrintStream printStream = System.out;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Error: ");
                        sbLIZ.append(e.getMessage());
                        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (obj instanceof Application) {
                        applicationContext = ((Application) obj).getApplicationContext();
                        PrintStream printStream2 = System.out;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Application context obtained through ActivityThread: ");
                        sbLIZ2.append(applicationContext);
                        printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                        if (applicationContext != null) {
                            C786450Ut9.LIZJ = applicationContext.getFilesDir();
                            C08RN.LIZ(applicationContext);
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(th.getMessage());
                        sbLIZ3.append(":");
                        sbLIZ3.append(C08RN.LIZJ());
                        sbLIZ3.append(" applicationContext is null");
                        throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                    sbLIZ32.append(th.getMessage());
                    sbLIZ32.append(":");
                    sbLIZ32.append(C08RN.LIZJ());
                    sbLIZ32.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ32));
                }
                file = C786450Ut9.LIZJ;
            }
            String absolutePath = new C0VSJ(file, "client_ai").getAbsolutePath();
            C1512280pSM c1512280pSM = new C1512280pSM();
            c1512280pSM.LIZ = absolutePath;
            c1512280pSM.LIZIZ = new InterfaceC1512410pSZ() { // from class: X.09UA
                @Override // X.InterfaceC1512410pSZ
                public final boolean LIZ(String str, String str2, String str3) {
                    try {
                        return NetworkUtils.downloadFile(-1, str, str2, null, str3, null, null, null, null, null, null);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return false;
                    }
                }
            };
            c1512280pSM.LIZJ = new InterfaceC1512300pSO() { // from class: X.09Eh
                @Override // X.InterfaceC1512300pSO
                public final <T> T LIZ(String str, Type type) {
                    T t;
                    Gson gson = C2104708Mj.LIZ;
                    C09CU c09cu = new C09CU(new StringReader(str));
                    Gson gson2 = C2104708Mj.LIZ;
                    synchronized (gson2) {
                        try {
                            t = (T) gson2.LJ(c09cu, type);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                    return t;
                }
            };
            c1512280pSM.LIZLLL = new InterfaceC1512460pSe() { // from class: X.0pSd
                @Override // X.InterfaceC1512460pSe
                public final void LIZ() {
                }
            };
            c1512280pSM.LJ = new InterfaceC1512370pSV() { // from class: X.0pRQ
                @Override // X.InterfaceC1512370pSV
                public final ExecutorService LIZ() {
                    ExecutorService executorService = C1511690pRP.LIZ;
                    if (executorService != null) {
                        return executorService;
                    }
                    if (C1510910pQ9.LIZ == null) {
                        return C1511710pRR.LIZ();
                    }
                    synchronized (C1511690pRP.class) {
                        try {
                            if (C1511690pRP.LIZ == null) {
                                ExecutorService executorServiceLIZ = C1510910pQ9.LIZ.LIZ();
                                C1511690pRP.LIZ = executorServiceLIZ;
                                if (executorServiceLIZ == null) {
                                    C1511690pRP.LIZ = C1511710pRR.LIZ();
                                }
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                    return C1511690pRP.LIZ;
                }
            };
            c1512280pSM.LJFF = new InterfaceC1512430pSb() { // from class: X.0pSS
                public static final /* synthetic */ int LIZ = 0;

                @Override // X.InterfaceC1512430pSb
                public final void ensureNotReachHere(Throwable th2) {
                    C1AF0.LJFF(th2, "ml-evaluator");
                }
            };
            C1512240pSI c1512240pSI = new C1512240pSI(c1512280pSM);
            if (C1512320pSQ.LIZ) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Inference init hasInit:");
                sbLIZ4.append(C1512310pSP.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ4);
                new Throwable("not crash, only for debug!!");
            }
            C1512310pSP c1512310pSPLIZ = C1512310pSP.LIZ();
            if (!C1512310pSP.LIZIZ) {
                C1512310pSP.LIZIZ = true;
                c1512310pSPLIZ.LIZ = c1512240pSI;
            }
            C1512290pSN.LIZ = C1512470pSf.LIZ;
        }
    }
}
