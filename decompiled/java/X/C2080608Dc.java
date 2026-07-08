package X;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import dalvik.system.DexFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08Dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2080608Dc {
    public static List LIZ(String str) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        List<DexFile> arrayList = new ArrayList();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            int i = Build.VERSION.SDK_INT;
            boolean z4 = true;
            if (i != 24 && i != 25) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (i != 26 && i != 27) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    if (i == 28) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        z4 = false;
                    }
                }
            }
            if (z4 && DexFile.isDexOptNeeded(str)) {
                arrayList = C08N1.LIZIZ(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(e3.e);
                sbLIZ.append(str);
                sbLIZ.append("] need opt, loadDexFileInMemory took ");
                sbLIZ.append(SystemClock.uptimeMillis() - jUptimeMillis);
                sbLIZ.append("ms");
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            if (arrayList.isEmpty()) {
                arrayList.add(DexFile.loadDex(str, null, 0));
            }
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        ArrayList arrayList2 = new ArrayList();
        for (DexFile dexFile : arrayList) {
            ArrayList arrayList3 = new ArrayList();
            if (dexFile != null) {
                try {
                    Enumeration<String> enumerationEntries = dexFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        arrayList3.add(enumerationEntries.nextElement());
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
            arrayList2.addAll(arrayList3);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("open dexfile[");
        sbLIZ2.append(str);
        sbLIZ2.append("] took ");
        sbLIZ2.append(jUptimeMillis2 - jUptimeMillis);
        sbLIZ2.append("ms, dump classes took ");
        sbLIZ2.append(SystemClock.uptimeMillis() - jUptimeMillis2);
        sbLIZ2.append("ms, classlist_size=");
        sbLIZ2.append(arrayList2.size());
        C2188811AlT.LIZIZ(sbLIZ2);
        return arrayList2;
    }
}
