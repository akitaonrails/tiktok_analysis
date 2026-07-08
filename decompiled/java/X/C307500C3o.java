package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.q;
import com.ss.android.ugc.aweme.video.experiment.DynamicOptionConfig;
import com.ss.android.ugc.aweme.video.experiment.DynamicOptionModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0C3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307500C3o {
    public static final C307500C3o LIZ = new C307500C3o();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C307550C3t());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C307520C3q());
    public static final ConcurrentHashMap<String, Object> LIZLLL = new ConcurrentHashMap<>();
    public static final C01GW LJ = C452501pT.LIZIZ(new C307560C3u());
    public static final C01GW LJFF;
    public static final C01GW LJI;

    static {
        new ConcurrentHashMap();
        LJFF = C452501pT.LIZIZ(new C307510C3p());
        LJI = C452501pT.LIZIZ(new C307490C3n());
    }

    public static String LJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object objInvoke = null;
        if (z) {
            return null;
        }
        try {
            objInvoke = new C307530C3r(str).invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return (String) objInvoke;
    }

    public static void LIZ(List list, DynamicOptionConfig dynamicOptionConfig) {
        if (dynamicOptionConfig != null && dynamicOptionConfig.dynamicOptionModelList != null && !dynamicOptionConfig.dynamicOptionModelList.isEmpty()) {
            for (DynamicOptionModel dynamicOptionModel : dynamicOptionConfig.dynamicOptionModelList) {
                int i = dynamicOptionModel.scene;
                if (i == 2 || i == 3) {
                    if (dynamicOptionModel.enableReversal != 1 || !C302870Bu1.LIZ()) {
                        C308310C6r c308310C6rLIZ = dynamicOptionModel.LIZ();
                        if (c308310C6rLIZ.LIZ(LIZLLL(dynamicOptionModel.libraKey, true))) {
                            ((ArrayList) list).add(c308310C6rLIZ);
                        }
                    }
                }
            }
        }
    }

    public static void LIZJ(List list, DynamicOptionConfig dynamicOptionConfig) {
        if (dynamicOptionConfig != null && dynamicOptionConfig.dynamicOptionModelList != null && !dynamicOptionConfig.dynamicOptionModelList.isEmpty()) {
            for (DynamicOptionModel dynamicOptionModel : dynamicOptionConfig.dynamicOptionModelList) {
                if (dynamicOptionModel.scene == 1 && (dynamicOptionModel.enableReversal != 1 || !C302870Bu1.LIZ())) {
                    C308310C6r c308310C6rLIZ = dynamicOptionModel.LIZ();
                    if (c308310C6rLIZ.LIZ(LIZLLL(dynamicOptionModel.libraKey, true))) {
                        ((ArrayList) list).add(c308310C6rLIZ);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.String] */
    public static Object LIZLLL(String str, boolean z) {
        boolean z2;
        Object obj;
        T string;
        String str2;
        String str3;
        String str4;
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        C337750DLx c337750DLx = C337750DLx.LJ;
        c337750DLx.getClass();
        if (!C2105908Mv.LIZ(str) && (str4 = c337750DLx.LIZ.get(str)) != null && C1786206z6.LIZ()) {
            return str4;
        }
        if (!C2105908Mv.LIZ(str) && (str3 = c337750DLx.LIZIZ.get(str)) != null && ((Boolean) C1787006zE.LIZIZ.getValue()).booleanValue()) {
            return str3;
        }
        if (!C2105908Mv.LIZ(str) && (str2 = c337750DLx.LIZJ.get(str)) != null && C07JK.LIZ()) {
            return str2;
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZLLL;
        Object objLJFF = concurrentHashMap.get(str);
        if (objLJFF == null) {
            int iIntValue = ((Number) C283320B8o.LIZ.getValue()).intValue();
            if (iIntValue == 1) {
                objLJFF = LJ(str);
            } else if (iIntValue == 2) {
                C259800zU c259800zU = new C259800zU();
                ?? LJ2 = LJ(str);
                c259800zU.element = LJ2;
                if (LJ2 == 0) {
                    Object objLJFF2 = LJFF(str, z);
                    if (objLJFF2 != null) {
                        string = objLJFF2.toString();
                    } else {
                        string = 0;
                    }
                    c259800zU.element = string;
                    if (string != 0) {
                        C15O7.LIZJ(new CallableC311880CKk(new C307540C3s(str, c259800zU)));
                    }
                }
                objLJFF = c259800zU.element;
            } else {
                objLJFF = LJFF(str, z);
            }
        }
        if (!concurrentHashMap.containsKey(str)) {
            if (objLJFF == null) {
                obj = "--KEVA_EMPTY_OBJECT--";
            } else {
                obj = objLJFF;
            }
            concurrentHashMap.put(str, obj);
        }
        if (Intrinsics.LJFF(objLJFF, "--KEVA_EMPTY_OBJECT--")) {
            return null;
        }
        return objLJFF;
    }

    public static Object LJFF(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Object objLIZLLL = C0C54.LIZJ.LIZLLL(str, false);
        if (z && objLIZLLL != null) {
            if (((Boolean) C266340AcC.LIZ.getValue()).booleanValue() && (objLIZLLL instanceof q)) {
                return ((k) objLIZLLL).LJIL();
            }
            return GsonProtectorUtils.toJson(C00S4.LIZ(), objLIZLLL);
        }
        return objLIZLLL;
    }

    public static void LIZIZ(List list, List list2, boolean z) {
        if (list2 != null && !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C308310C6r c308310C6r = (C308310C6r) it2.next();
                if (!z) {
                    int i = c308310C6r.LIZLLL;
                    if (i == 2 || i == 3) {
                        ((ArrayList) list).add(c308310C6r);
                    }
                } else if (z && c308310C6r.LIZLLL == 1) {
                    ((ArrayList) list).add(c308310C6r);
                }
            }
        }
    }
}
