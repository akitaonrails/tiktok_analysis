package X;

import Y.ACallableS147S0000000_3;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import java.net.URL;
import java.util.HashMap;
import java.util.jar.JarFile;

/* JADX INFO: renamed from: X.08pi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2237608pi {
    public static HashMap<URL, JarFile> LIZ;

    public static long LIZ(Context context) {
        ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(context, "activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkga2wA5Za/kLow/sJYU3UQ==", null));
        return memoryInfo.availMem;
    }

    public static void LIZIZ(int i) {
        try {
            C844470XAv.LIZ.getClass();
            int iLIZ = (int) ((LIZ(C844470XAv.LIZ()) / 1024) / 1024);
            String name = C2214201BlK.LJFF().getClass().getName();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(name);
            sbLIZ.append("   freeMem :");
            sbLIZ.append(iLIZ);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("memoryLevel", Integer.valueOf(i));
            c2241008qG.LIZ.put("page", name);
            c2241008qG.LIZ.put("freeMemory", Integer.valueOf(iLIZ));
            C794240VDq.LIZJ("TYPE_TRIM_MEMORY", c2241008qG.LJ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            if (C1331660kl2.LIZLLL) {
                C1331660kl2.LIZ.trimMemory(i);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C805380Via.LIZJ(e2, "trimMemory : Lighten");
        }
        if (Build.VERSION.SDK_INT <= 23) {
            C15O7.LIZJ(new ACallableS147S0000000_3(4));
        }
        if (5 == i) {
            C2344809Gs.LJ("trimMemory : Activity.TRIM_MEMORY_RUNNING_MODERATE");
            System.gc();
            return;
        }
        if (10 == i) {
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi(IUnKnownOwnershipBusinessOuterService.class);
            if (iUnKnownOwnershipBusinessOuterService != null) {
                iUnKnownOwnershipBusinessOuterService.LJIIL();
            }
            C2344809Gs.LJ("trimMemory : Activity.TRIM_MEMORY_RUNNING_LOW");
            System.gc();
            return;
        }
        if (40 == i) {
            C2344809Gs.LJ("trimMemory : Activity.TRIM_MEMORY_BACKGROUND");
            return;
        }
        C2344809Gs.LJ("trimMemory level:" + i);
    }
}
