package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.model.iaa.MinisRewardedAdData;
import com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1Av5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2194771Av5 {
    public static final C2194771Av5 LIZ = new C2194771Av5();
    public static final ConcurrentHashMap<String, MinisRewardedAdData> LIZIZ = new ConcurrentHashMap<>();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    public static void LIZJ(String str) {
        C1227904rF c1227904rF = C1227904rF.LIZ;
        ConcurrentHashMap<String, MinisRewardedAdData> concurrentHashMap = LIZIZ;
        c1227904rF.getClass();
        String strLJI = C1227904rF.LJI(concurrentHashMap);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, MinisRewardedAdData> entry : concurrentHashMap.entrySet()) {
            String key = entry.getKey();
            MinisRewardedAdData value = entry.getValue();
            String str2 = value.clientKey;
            if (str2 != null && str2.equals(str)) {
                linkedHashMap.put(key, value);
            }
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroyInstanceWhenExitMinis，map json:");
        sbLIZ.append(strLJI);
        sbLIZ.append(", tempAdInstanceInfoMap:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(linkedHashMap));
        C2188811AlT.LIZIZ(sbLIZ);
        C2196681AyA c2196681AyA = C2196681AyA.LIZ;
        List listLLIIII = C13LP.LLIIII(linkedHashMap.keySet());
        c2196681AyA.getClass();
        C2196681AyA.LIZIZ(listLLIIII);
        ICommerceSaasService iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
        if (iCommerceSaasService != null) {
            iCommerceSaasService.LIZ(C13LP.LLIIII(linkedHashMap.keySet()));
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            LIZIZ.remove(((Map.Entry) it2.next()).getKey());
        }
    }

    public static InterfaceC2194711Auz LIZ(int i, Integer num, String str) {
        InterfaceC2194711Auz interfaceC2194711Auz = (InterfaceC2194711Auz) C1909107dp.LIZJ(InterfaceC2194711Auz.class, null);
        interfaceC2194711Auz.setSuccess(Boolean.FALSE);
        interfaceC2194711Auz.setErrorCode(Integer.valueOf(i));
        interfaceC2194711Auz.setErrorMsg(str);
        interfaceC2194711Auz.setSubErrorCode(num);
        return interfaceC2194711Auz;
    }

    public static InterfaceC2194631Aur LIZIZ(int i, Integer num, String str) {
        InterfaceC2194631Aur interfaceC2194631Aur = (InterfaceC2194631Aur) C1909107dp.LIZJ(InterfaceC2194631Aur.class, null);
        interfaceC2194631Aur.setSuccess(Boolean.FALSE);
        interfaceC2194631Aur.setErrorCode(Integer.valueOf(i));
        interfaceC2194631Aur.setErrorMsg(str);
        interfaceC2194631Aur.setSubErrorCode(num);
        return interfaceC2194631Aur;
    }
}
