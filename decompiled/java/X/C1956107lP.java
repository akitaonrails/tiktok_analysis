package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.07lP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1956107lP {
    public static final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ);
    public static final ConcurrentHashMap<String, Boolean> LIZIZ = new ConcurrentHashMap<>();

    public static boolean LIZ(String str) {
        boolean zBooleanValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarUploadHandler check hasExitedUploadingFlow, status as ");
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LIZIZ;
        Boolean bool = concurrentHashMap.get(str);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        Boolean bool2 = concurrentHashMap.get(str);
        if (bool2 == null) {
            return false;
        }
        return bool2.booleanValue();
    }

    public static void LIZIZ(String str, boolean z) {
        LIZIZ.put(str, Boolean.valueOf(z));
    }
}
