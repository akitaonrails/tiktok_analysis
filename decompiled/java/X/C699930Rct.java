package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Rct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699930Rct {
    public static IPlayerComponentAbility LIZJ(String str) {
        synchronized (C699910Rcr.LIZJ) {
            try {
                Map<String, WeakReference<IPlayerComponentAbility>> map = C699910Rcr.LJI;
                WeakReference weakReference = (WeakReference) ((LinkedHashMap) map).get(str);
                IPlayerComponentAbility iPlayerComponentAbility = null;
                if (weakReference == null) {
                    return null;
                }
                IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) weakReference.get();
                if (iPlayerComponentAbility2 == null) {
                    map.remove(str);
                } else {
                    iPlayerComponentAbility = iPlayerComponentAbility2;
                }
                return iPlayerComponentAbility;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("::");
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZIZ(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            String strLIZ = LIZ(str, str2);
            synchronized (C699910Rcr.LIZJ) {
                try {
                    C699910Rcr.LJFF.remove(strLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static boolean LIZLLL(String str, String str2) {
        boolean zAdd;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return false;
        }
        String strLIZ = LIZ(str, str2);
        synchronized (C699910Rcr.LIZJ) {
            try {
                zAdd = C699910Rcr.LJFF.add(strLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zAdd;
    }
}
