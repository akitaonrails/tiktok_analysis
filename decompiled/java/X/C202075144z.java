package X;

import X.AnonymousClass1452;
import X.C1C7U;
import X.C202075144z;
import X.C2188811AlT;
import X.C844470XAv;
import X.InterfaceC202074144y;
import android.app.Application;
import android.content.Context;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYNormalCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYCleanStrategy;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.mutilinstance.HostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.144z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202075144z {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static final C202075144z LIZ = new C202075144z();
    public static final ExecutorService LIZLLL = C786410Ut5.d4(1);

    public final void LJII() {
        synchronized (this) {
            try {
                LIZJ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJI() {
        PitayaExperiment.Config config = PitayaExperiment.LIZ;
        if (PitayaExperiment.LIZJ) {
            synchronized (this) {
                try {
                    if (LIZIZ) {
                        return;
                    }
                    LIZIZ = true;
                    String strLIZIZ = C20301014c4.LIZIZ();
                    String strLIZLLL = LIZLLL(strLIZIZ);
                    if (strLIZLLL != null) {
                        if (strLIZLLL.length() == 0) {
                            if (C2273401Dyc.LIZIZ()) {
                                LJ(strLIZLLL, strLIZIZ);
                            }
                        } else if (!Intrinsics.LJFF(strLIZLLL, strLIZIZ)) {
                            LJ(strLIZLLL, strLIZIZ);
                        }
                    }
                    C20301014c4.LIZ(new InterfaceC20301414c8() { // from class: X.1451
                        @Override // X.InterfaceC20301414c8
                        public final void LIZ(C20301214c6 c20301214c6, C20301214c6 c20301214c62) {
                            C202075144z c202075144z = C202075144z.LIZ;
                            String str = c20301214c62.LIZIZ;
                            Locale locale = Locale.ROOT;
                            String lowerCase = str.toLowerCase(locale);
                            c202075144z.getClass();
                            C202075144z.LIZLLL(lowerCase);
                            c202075144z.LJ(c20301214c6.LIZIZ.toLowerCase(locale), c20301214c62.LIZIZ.toLowerCase(locale));
                        }
                    });
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
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
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static void LIZIZ(AnonymousClass1450 anonymousClass1450) {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        String absolutePath = LIZ(contextLIZ).getAbsolutePath();
        if (absolutePath == null) {
            absolutePath = "";
        }
        if (absolutePath.length() == 0) {
            anonymousClass1450.LIZ(new AnonymousClass1452(false, -1, "invalid root path so can not cleanup"));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(absolutePath);
        sbLIZ.append("/Pitaya");
        LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        String[] strArrDatabaseList = contextLIZ.databaseList();
        if (strArrDatabaseList != null) {
            C089E c089e = new C089E(strArrDatabaseList);
            while (c089e.hasNext()) {
                File databasePath = contextLIZ.getDatabasePath((String) c089e.next());
                if (databasePath.isFile() && a0.LJJIIZI(databasePath.getName(), "feature_engineering", false)) {
                    databasePath.delete();
                }
            }
        }
        anonymousClass1450.LIZ(new AnonymousClass1452(true, 0, null));
    }

    public static void LIZJ(String str) {
        File[] fileArrListFiles;
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() || (fileArrListFiles = c0vsj.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                LIZJ(file.getAbsolutePath());
            }
        }
        c0vsj.delete();
    }

    public static String LIZLLL(String str) {
        String strLJI;
        C844470XAv.LIZ.getClass();
        String absolutePath = LIZ(C844470XAv.LIZ()).getAbsolutePath();
        if (absolutePath == null) {
            return null;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(absolutePath);
            sbLIZ.append("/pitaya_region");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (c0vsj.exists()) {
                strLJI = C09BH.LJI(c0vsj, Charsets.UTF_8);
            } else {
                strLJI = "";
                c0vsj.createNewFile();
            }
            C09BH.LJIIIZ(c0vsj, str, Charsets.UTF_8);
            return strLJI;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static void LJFF(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C844470XAv.LIZ.getClass();
        jSONObject.put("aid", C844470XAv.LJIIJ);
        jSONObject.put("from_region", str);
        jSONObject.put("to_region", str2);
        jSONObject.put("rst", 1);
        AppLogNewUtils.onEventV3("pitaya22_change_region", jSONObject);
    }

    public final void LJ(String str, String str2) {
        synchronized (this) {
            try {
                final AnonymousClass1450 anonymousClass1450 = new AnonymousClass1450(str, str2);
                LIZ.getClass();
                LJFF(str, str2);
                if (!LIZJ) {
                    LIZIZ(anonymousClass1450);
                } else {
                    HostSetupWatcher.INSTANCE.registerHostSetupListener(new HostSetupListener() { // from class: com.ss.android.ugc.aweme.pitaya.PitayaRegionHelper$cleanPitayaResourceByPluginAsync$1
                        @Override // com.bytedance.pitaya.api.mutilinstance.HostSetupListener
                        public void onHostSetup(boolean z) {
                            ExecutorService executorService = C202075144z.LIZLLL;
                            final InterfaceC202074144y interfaceC202074144y = anonymousClass1450;
                            executorService.execute(new Runnable() { // from class: com.ss.android.ugc.aweme.pitaya.PitayaRegionHelper$cleanPitayaResourceByPluginAsync$1$onHostSetup$1
                                public final void LIZ() {
                                    C844470XAv.LIZ.getClass();
                                    Context contextLIZ = C844470XAv.LIZ();
                                    int i = C844470XAv.LJIIJ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(i);
                                    sbLIZ.append("");
                                    IPitayaCore core = PitayaCoreFactory.getCore(C2188811AlT.LIZIZ(sbLIZ));
                                    PTYCleanStrategy pTYCleanStrategy = PTYCleanStrategy.Critical;
                                    final InterfaceC202074144y interfaceC202074144y2 = interfaceC202074144y;
                                    core.cleanStorage(contextLIZ, pTYCleanStrategy, new PTYNormalCallback() { // from class: com.ss.android.ugc.aweme.pitaya.PitayaRegionHelper$cleanPitayaResourceByPluginAsync$1$onHostSetup$1.1
                                        @Override // com.bytedance.pitaya.api.PTYNormalCallback
                                        public void onResult(boolean z2, PTYError pTYError) {
                                            int code;
                                            String summary;
                                            InterfaceC202074144y interfaceC202074144y3 = interfaceC202074144y2;
                                            if (pTYError != null) {
                                                code = pTYError.getCode();
                                                summary = pTYError.getSummary();
                                                if (summary == null) {
                                                }
                                                interfaceC202074144y3.LIZ(new AnonymousClass1452(z2, code, summary));
                                            }
                                            code = 0;
                                            summary = "";
                                            interfaceC202074144y3.LIZ(new AnonymousClass1452(z2, code, summary));
                                        }
                                    });
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("PitayaRegionHelper@606d.cleanPitayaResourceByPluginAsync$1$onHostSetup$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("PitayaRegionHelper@606d.cleanPitayaResourceByPluginAsync$1$onHostSetup$1");
                                }
                            });
                        }
                    });
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
