package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import cs.bd.o.m1;
import cs.bd.o.n1;
import cs.bd.o.o1;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08XS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08XS {
    public static void LIZ() {
        C08PI.LIZ(268435457, new C08PQ() { // from class: X.08XY
            @Override // X.C08PQ
            public final Object LIZ(long j, String str, Object obj) {
                try {
                    Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(C2110608Oq.LIZIZ.LIZ, "window"), new C0WZX("dzBzEhYuTITRWlUyQBHKac8w9eMRJ28guVc=", null));
                    Point point = new Point();
                    displayLLILZIL.getRealSize(point);
                    m1.LIZ = point.x;
                    m1.LIZIZ = point.y;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                return m1.LIZ + "*" + m1.LIZIZ;
            }
        });
        C08PI.LIZ(268435463, new C08PQ() { // from class: X.08XU
            @Override // X.C08PQ
            public final Object LIZ(long j, String str, Object obj) {
                return "";
            }
        });
        C08PI.LIZ(268435462, new C08PQ() { // from class: X.08XR
            @Override // X.C08PQ
            public final Object LIZ(long j, String str, Object obj) {
                int length;
                JSONObject jSONObject = new JSONObject();
                try {
                    HashMap<String, String> mapLIZJ = C08VD.LIZJ();
                    try {
                        length = new C0VSJ("/sys/devices/system/cpu/").listFiles(C08VD.LIZ).length;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        length = -1;
                    }
                    jSONObject.put("core", length);
                    jSONObject.put("pc", C08VD.LIZIZ("Processor", mapLIZJ));
                    jSONObject.put("hw", C08VD.LIZIZ("Hardware", mapLIZJ));
                    jSONObject.put("max", C08VD.LIZ("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
                    jSONObject.put("min", C08VD.LIZ("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"));
                    jSONObject.put("ft", C08VD.LIZIZ("Features", mapLIZJ));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                String strJ3 = C786410Ut5.J3(jSONObject);
                if (TextUtils.isEmpty(strJ3)) {
                    return "{}";
                }
                return strJ3.trim();
            }
        });
        C08PI.LIZ(268435464, new C08PQ() { // from class: X.08XV
            @Override // X.C08PQ
            public final Object LIZ(long j, String str, Object obj) {
                return "";
            }
        });
        C08PI.LIZ(268435467, new C08PQ() { // from class: X.08XT
            @Override // X.C08PQ
            public final Object LIZ(long j, String str, Object obj) {
                int[] iArr = {0, 0};
                try {
                    o1 o1VarLIZ = o1.LIZ(C2110608Oq.LIZIZ.LIZ);
                    o1VarLIZ.LIZ = j;
                    return new int[]{o1VarLIZ.LIZIZ, o1VarLIZ.LIZJ};
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return iArr;
                }
            }
        });
        C08PI.LIZ(268435474, new C08PQ() { // from class: X.08XP
            @Override // X.C08PQ
            public final Object LIZ(long j, String str, Object obj) {
                Context context = C2110608Oq.LIZIZ.LIZ;
                String strReplace = str.replace("+", "-").replace("/", "_");
                Activity activityLIZ = C08P2.LIZ();
                if (activityLIZ == null) {
                    return null;
                }
                o1.LIZ(context).LIZIZ(activityLIZ, strReplace);
                return null;
            }
        });
        C08PI.LIZ(268435468, new C08PQ() { // from class: X.08XW
            @Override // X.C08PQ
            public final Object LIZ(long j, String str, Object obj) {
                String str2;
                AudioManager audioManager = (AudioManager) C786410Ut5.H2(C2110608Oq.LIZIZ.LIZ, "audio");
                ArrayList arrayList = new ArrayList();
                try {
                    for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(1)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(audioDeviceInfo.getType());
                        sb.append("_");
                        int type = audioDeviceInfo.getType();
                        String[] strArr = n1.LIZ;
                        if (type <= strArr.length) {
                            str2 = strArr[type];
                        } else {
                            str2 = "TYPE_UNKNOWN";
                        }
                        sb.append(str2);
                        String string = sb.toString();
                        arrayList.add(string);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("audio device type is ");
                        sbLIZ.append(string);
                        sbLIZ.append("\n");
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                return arrayList.toArray();
            }
        });
    }
}
