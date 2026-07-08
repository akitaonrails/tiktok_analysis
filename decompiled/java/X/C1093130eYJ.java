package X;

import com.bytedance.scene.Scene;
import com.tiktok.strategycenter.TTMStrategyResult;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0eYJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093130eYJ {
    public static final /* synthetic */ int LIZ = 0;

    public static C1093040eYA LIZLLL(String str, TTMStrategyResult tTMStrategyResult) {
        String ruleName;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String bizName = null;
        if (tTMStrategyResult != null) {
            ruleName = tTMStrategyResult.getRuleName();
        } else {
            ruleName = null;
        }
        linkedHashMap.put("ruleName", ruleName);
        if (tTMStrategyResult != null) {
            bizName = tTMStrategyResult.getBizName();
        }
        linkedHashMap.put("bizName", bizName);
        return new C1093040eYA(str, tTMStrategyResult, linkedHashMap);
    }

    public static C1093040eYA LIZ(String str, C1089610eSd c1089610eSd, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("extra", C2097908Jt.LIZJ(new Pair("trigger_feature", str2)));
        return new C1093040eYA(str, c1089610eSd, linkedHashMap);
    }

    public static C1093040eYA LIZJ(String str, InterfaceC830890Wid interfaceC830890Wid, InterfaceC805220ViK interfaceC805220ViK) {
        EnumC1910390zoT enumC1910390zoTLIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Scene.SCENE_SERVICE, interfaceC830890Wid);
        if (interfaceC805220ViK != null) {
            enumC1910390zoTLIZIZ = interfaceC805220ViK.LIZIZ();
        } else {
            enumC1910390zoTLIZIZ = null;
        }
        linkedHashMap.put("code", enumC1910390zoTLIZIZ);
        return new C1093040eYA(str, interfaceC805220ViK, linkedHashMap);
    }
}
