package X;

import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Observable;

/* JADX INFO: renamed from: X.0X2A, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X2A extends Observable {
    public static volatile C0X2A LIZ = null;
    public static volatile String LIZIZ = "";
    public static volatile String LIZJ = "";
    public static volatile String LIZLLL = "";
    public static volatile String LJ = "";

    public static C0X2A LIZIZ() {
        if (LIZ == null) {
            synchronized (C0X2A.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C0X2A();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static String LIZ() {
        return LIZJ;
    }

    public final void LIZJ(String str, String str2, String str3, String str4, String str5, String str6) {
        Logger.debug();
        LIZIZ = str;
        LIZJ = str2;
        LIZLLL = str3;
        LJ = str5;
        HashMap map = new HashMap();
        map.put("store_idc", str);
        map.put("store_region", str2);
        map.put("region_source", str3);
        map.put("region_legacy_user", str4);
        map.put("sec_uid", str5);
        map.put("logid", str6);
        setChanged();
        notifyObservers(map);
    }
}
