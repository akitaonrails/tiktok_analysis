package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class RunnableC1481650oex implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        HashMap<String, String> mapLIZ;
        Boolean bool;
        C1C7U.LIZ("SimConvergeServiceManager@e29b.saveLeftOverData$1L");
        C1481590oer.LIZIZ();
        C1481640oew c1481640oew = (C1481640oew) C1481590oer.LIZ();
        for (String str : c1481640oew.LJ.keySet()) {
            InterfaceC1481930ofP interfaceC1481930ofPLIZIZ = c1481640oew.LIZIZ(str);
            if (interfaceC1481930ofPLIZIZ == null) {
                int i = 0;
                while (true) {
                    if (i >= ((LinkedList) c1481640oew.LIZJ).size()) {
                        break;
                    }
                    InterfaceC1481930ofP interfaceC1481930ofP = (InterfaceC1481930ofP) ListProtector.get(c1481640oew.LIZJ, i);
                    if (interfaceC1481930ofP == null || !interfaceC1481930ofP.LIZJ(C0VT3.VALID_STATUS) || interfaceC1481930ofP.LIZJ(C0VT3.USING_STATUS)) {
                        i++;
                    } else if (i >= 0 && i < ((LinkedList) c1481640oew.LIZJ).size() && (interfaceC1481930ofPLIZIZ = (InterfaceC1481930ofP) ListProtector.get(c1481640oew.LIZJ, i)) != null) {
                        if (!TextUtils.isEmpty(str) && i >= 0) {
                            c1481640oew.LIZLLL.put(str, Integer.valueOf(i));
                        }
                    }
                }
            }
            if (interfaceC1481930ofPLIZIZ.LIZJ(C0VT3.VALID_STATUS) && (mapLIZ = c1481640oew.LIZ(str)) != null && !mapLIZ.isEmpty()) {
                for (String str2 : mapLIZ.keySet()) {
                    String str3 = mapLIZ.get(str2);
                    if (str3 != null && !str3.isEmpty()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append("_");
                        sbLIZ.append(str2);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        if (TextUtils.isEmpty(strLIZIZ) || !c1481640oew.LJFF.containsKey(strLIZIZ) || (bool = c1481640oew.LJFF.get(strLIZIZ)) == null || !bool.booleanValue()) {
                            if (!TextUtils.isEmpty(strLIZIZ)) {
                                c1481640oew.LJFF.put(strLIZIZ, Boolean.TRUE);
                            }
                            if (((Boolean) C1474810oTv.K2.getValue()).booleanValue()) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str3);
                                    jSONObject.put("isSaveTag", "1");
                                    interfaceC1481930ofPLIZIZ.LIZIZ(str, str2, C786410Ut5.J3(jSONObject));
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            } else {
                                interfaceC1481930ofPLIZIZ.LIZIZ(str, str2, str3);
                            }
                        }
                    }
                }
            }
        }
        C1C7U.LIZIZ("SimConvergeServiceManager@e29b.saveLeftOverData$1L");
    }
}
