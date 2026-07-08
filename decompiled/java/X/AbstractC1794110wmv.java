package X;

import Y.ARunnableS30S1200000_27;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0wmv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1794110wmv {
    public static void LIZ(String str, Map<String, String> map, InterfaceC1794150wmz interfaceC1794150wmz) {
        HashMap map2 = (HashMap) map;
        map2.put("pipo_sdk_version", "1.0");
        String str2 = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LIZLLL;
        if (!TextUtils.isEmpty(str2)) {
            map2.put("device_id", str2);
        }
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJI().getClass();
        ((C1794830wo5) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZJ()).LIZ.execute(new ARunnableS30S1200000_27(map, interfaceC1794150wmz, str, 6));
    }
}
