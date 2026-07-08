package X;

import android.content.Context;
import com.aweme.storage.CacheStrategy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.util.FileCacheCleanerService;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: X.09f7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2426709f7 {
    public static volatile boolean LIZ;
    public static boolean LIZIZ;
    public static volatile boolean LIZJ;

    public static void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkSpace ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZIZ(Context context) {
        CacheStrategy cacheStrategy;
        String[] strArr;
        LIZIZ = true;
        boolean zLIZ = C1336210ksN.LIZ();
        for (InterfaceC345370DgN interfaceC345370DgN : (ArrayList) C2427009fA.LJIIJJI()) {
            if (!LIZJ) {
                if (zLIZ) {
                    interfaceC345370DgN.LJ(true);
                } else if ((C1336210ksN.LIZLLL() == EnumC1335310kqv.ULTRA_LOW || C1336210ksN.LIZLLL() == EnumC1335310kqv.LOW) && ((Boolean) C256120A1y.LIZIZ.getValue()).booleanValue()) {
                    interfaceC345370DgN.LJI();
                } else {
                    interfaceC345370DgN.LIZIZ(true);
                }
            } else {
                throw new Exception("stop force clean");
            }
        }
        FileCacheCleanerService.LIZLLL().LIZJ(C786410Ut5.N3(context));
        if (C786410Ut5.w2(context) != null && C786410Ut5.w2(context).getParentFile() != null && C786410Ut5.x2(context) != null && C786410Ut5.x2(context).getParentFile() != null && (cacheStrategy = (CacheStrategy) C2426809f8.LIZIZ.getValue()) != null && (strArr = cacheStrategy.forceList) != null && strArr.length > 0) {
            Set<String> setLIZIZ = FileCacheCleanerService.LIZLLL().LIZIZ();
            for (String str : cacheStrategy.forceList) {
                if (setLIZIZ != null && !setLIZIZ.contains(str)) {
                    C0VSJ c0vsj = new C0VSJ(str);
                    if ((LIZJ(c0vsj, C786410Ut5.w2(context).getParentFile()) || LIZJ(c0vsj, C786410Ut5.x2(context).getParentFile())) && c0vsj.exists()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("cleanOnline file:");
                        sbLIZ.append(c0vsj.getAbsolutePath());
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (c0vsj.isFile()) {
                            c0vsj.delete();
                        } else {
                            C2259808tI.LIZJ(c0vsj);
                        }
                    }
                }
            }
        }
        C2427609fG.LIZIZ(context);
    }

    public static boolean LIZJ(C0VSJ c0vsj, File file) {
        if (file != null) {
            try {
                if (file.getCanonicalPath() == null) {
                    return false;
                }
                for (File parentFile = c0vsj; parentFile != null; parentFile = parentFile.getParentFile()) {
                    if (parentFile.getCanonicalPath() == null) {
                        break;
                    }
                    if (parentFile.getCanonicalPath().equals(file.getCanonicalPath())) {
                        return true;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
