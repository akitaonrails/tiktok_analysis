package X;

import android.util.Log;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0pVD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514050pVD {
    public static volatile C1514050pVD LIZLLL;
    public final Map<Class<?>, C0IMD<?>> LIZ = new ConcurrentHashMap();
    public final Map<Class<?>, InterfaceC1132110fZB<?>> LIZIZ = new ConcurrentHashMap();
    public final C1508660pMW LIZJ = new C1508660pMW();

    public static C1514050pVD LIZ() {
        if (LIZLLL == null) {
            synchronized (C1514050pVD.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C1514050pVD();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public static String LIZJ(Class cls) {
        if (cls == null) {
            return "";
        }
        if (cls.getEnclosingClass() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZJ(cls.getEnclosingClass()));
            sbLIZ.append("_");
            sbLIZ.append(cls.getSimpleName());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return cls.getSimpleName();
    }

    public static Object LIZIZ(Class cls, String str) {
        String name = cls.getPackage().getName();
        String strLIZJ = LIZJ(cls);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(name);
        sbLIZ.append("._");
        sbLIZ.append(strLIZJ);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            return Class.forName(strLIZIZ).newInstance();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("NetworkServiceProvider", e);
            HashMap map = new HashMap();
            map.put("error_type", "proto_decode");
            map.put("error_code", 1);
            HashMap map2 = new HashMap();
            map2.put("model_class_name", cls.getCanonicalName());
            map2.put("decode_class_name", strLIZIZ);
            map2.put("decoder_map_size", Integer.valueOf(((ConcurrentHashMap) LIZ().LIZ).size()));
            map2.put("error_code", 1);
            map2.put("error_message", e.getMessage());
            map2.put("error_stack", Log.getStackTraceString(e));
            C1CC2.LIZLLL("ttlive_quality_stability_error", map, null, map2);
            return null;
        }
    }

    public final C0K8R<C1500830p9t> LIZLLL(String str, List<C520610KbL> list, String str2, byte[] bArr, Object obj) {
        C1508660pMW c1508660pMW = this.LIZJ;
        C1508680pMY c1508680pMY = new C1508680pMY(str, list);
        c1508660pMW.LIZIZ(c1508680pMY);
        return ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).post(c1508680pMY.LIZ, list, str2, bArr, obj);
    }
}
