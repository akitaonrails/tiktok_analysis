package X;

import Y.ARunnableS113S0100000_13;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Vdm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802400Vdm {
    public static C08OM LIZ;
    public static volatile String LIZIZ;
    public static final Map<String, String> LIZJ = new ConcurrentHashMap();
    public static volatile C0VSJ LIZLLL;

    public static void LIZJ() {
        Context contextLJ;
        if (LIZIZ == null && (contextLJ = C0VX9.LJ()) != null) {
            C0VSJ c0vsj = new C0VSJ(C0VX9.LJFF(), "custom_tags");
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            C0VSJ c0vsj2 = new C0VSJ(c0vsj, C802270VdZ.LJFF(contextLJ, C802270VdZ.LIZJ()) ? "main" : C802270VdZ.LIZIZ().replaceAll(":", e3.g));
            if (!c0vsj2.exists()) {
                c0vsj2.mkdirs();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tag_");
            sbLIZ.append(C0VX9.LIZJ());
            C0VSJ c0vsj3 = new C0VSJ(c0vsj2, C2188811AlT.LIZIZ(sbLIZ));
            if (!c0vsj3.exists()) {
                c0vsj3.mkdirs();
            }
            LIZIZ = c0vsj3.getAbsolutePath();
        }
    }

    public static void LIZIZ(C0VSJ c0vsj) {
        File[] fileArrListFiles = c0vsj.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (!file.isFile()) {
                File[] fileArrListFiles2 = file.listFiles();
                if (fileArrListFiles2 == null) {
                    continue;
                } else if (fileArrListFiles2.length > 5) {
                    Arrays.sort(fileArrListFiles2);
                    for (int i = 0; i < fileArrListFiles2.length - 5; i++) {
                        C08SE.LIZIZ(fileArrListFiles2[i]);
                    }
                } else {
                    return;
                }
            } else {
                C08SE.LIZIZ(file);
            }
        }
    }

    public static void LIZLLL(String str) {
        Map<String, String> map = LIZJ;
        if (!((ConcurrentHashMap) map).containsKey(str)) {
            return;
        }
        ((ConcurrentHashMap) map).remove(str);
        if (!C801930Vd1.LIZLLL()) {
            return;
        }
        C0VXF.post(new ARunnableS113S0100000_13((Map) new HashMap(map), 69));
    }

    public static void LJ(Map<String, String> map) {
        ObjectOutputStream objectOutputStream;
        String strReplaceAll;
        try {
            if (LIZLLL == null) {
                Application application = C0VX9.LIZIZ().LIZJ;
                if (application == null) {
                    return;
                }
                C0VSJ c0vsj = new C0VSJ(C0VX9.LJFF(), "tags");
                if (!c0vsj.exists()) {
                    c0vsj.mkdirs();
                }
                if (C802270VdZ.LJFF(application, C802270VdZ.LIZJ())) {
                    strReplaceAll = "main";
                } else {
                    strReplaceAll = C802270VdZ.LIZIZ().replaceAll(":", e3.g);
                }
                C0VSJ c0vsj2 = new C0VSJ(c0vsj, strReplaceAll);
                if (!c0vsj2.exists()) {
                    c0vsj2.mkdirs();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("import_tag_");
                sbLIZ.append(C0VX9.LIZJ());
                sbLIZ.append(".txt");
                LIZLLL = new C0VSJ(c0vsj2, C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Throwable th) {
            th = th;
            objectOutputStream = null;
        }
        if (LIZLLL == null) {
            return;
        }
        objectOutputStream = new ObjectOutputStream(new C0VSV(LIZLLL));
        try {
            objectOutputStream.writeObject(map);
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
        }
        C798010VSd.LIZ(objectOutputStream);
        TryCatchGuardChecker.doCheck(th);
        C798010VSd.LIZ(objectOutputStream);
    }

    public static void LIZ(Map<? extends String, ? extends String> map, C802410Vdn c802410Vdn) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    if (LIZ != null) {
                        C0VXF.post(new ARunnableS113S0100000_13((Map) map, 67));
                    } else {
                        c802410Vdn.LIZJ(map);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
