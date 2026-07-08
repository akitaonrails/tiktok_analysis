package com.bef.effectsdk;

import X.C2188811AlT;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class GeneralParam {
    public static GetNetWorkInfo sGetNetworkInfo;

    public interface GetNetWorkInfo {
        int checkUrl(String str);

        HashMap<String, String> getHeader(String str);

        HashMap<String, String> getParam(String str);
    }

    public static native String nativeGetParamByKey(String str);

    public static native void nativeSetParamWithKey(String str, String str2);

    public static native void nativeSetParams(HashMap<String, String> map);

    public static int checkUrlStr(String str) {
        GetNetWorkInfo getNetWorkInfo = sGetNetworkInfo;
        if (getNetWorkInfo == null) {
            return 0;
        }
        return getNetWorkInfo.checkUrl(str);
    }

    public static String convertMapToString(HashMap<String, String> map) {
        if (map.isEmpty()) {
            return "";
        }
        Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
        Map.Entry<String, String> next = it2.next();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(next.getKey());
        sbLIZ.append("=");
        sbLIZ.append(next.getValue());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        while (it2.hasNext()) {
            Map.Entry<String, String> next2 = it2.next();
            String key = next2.getKey();
            String value = next2.getValue();
            if (!key.isEmpty() && !value.isEmpty()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("&");
                sbLIZ2.append(key);
                sbLIZ2.append("=");
                sbLIZ2.append(value);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        return strLIZIZ;
    }

    public static String getHeaderStr(String str) {
        GetNetWorkInfo getNetWorkInfo = sGetNetworkInfo;
        if (getNetWorkInfo == null) {
            return "";
        }
        return convertMapToString(getNetWorkInfo.getHeader(str));
    }

    public static String getParamByKey(String str) {
        return nativeGetParamByKey(str);
    }

    public static String getParamStr(String str) {
        GetNetWorkInfo getNetWorkInfo = sGetNetworkInfo;
        if (getNetWorkInfo == null) {
            return "";
        }
        return convertMapToString(getNetWorkInfo.getParam(str));
    }

    public static void setNetWorkInfoCallback(GetNetWorkInfo getNetWorkInfo) {
        sGetNetworkInfo = getNetWorkInfo;
    }

    public static void setParams(HashMap<String, String> map) {
        nativeSetParams(map);
    }

    public static void setParamWithKey(String str, String str2) {
        nativeSetParamWithKey(str, str2);
    }
}
