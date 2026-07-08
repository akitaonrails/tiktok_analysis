package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.mammon.audiosdk.structures.SAMICoreServerEvent;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Sv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2376309Sv {
    public static final C2376309Sv LIZ = new C2376309Sv();

    public static void LIZ(int i, int i2, String str, String str2, String str3, int i3, long j, long j2, long j3, SAMICoreServerEvent sAMICoreServerEvent) {
        int iOptInt;
        int i4;
        String str4;
        if (i == 0) {
            return;
        }
        try {
            iOptInt = new JSONObject(str2).optInt("underrun_count");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iOptInt = 0;
        }
        if (i3 > 0) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j2;
        long j4 = j - j2;
        long j5 = j3 - j2;
        int length = str3.length();
        if (sAMICoreServerEvent != null) {
            str4 = sAMICoreServerEvent.taskId;
        } else {
            str4 = null;
        }
        LIZIZ(i, str, i2, jCurrentTimeMillis, j4, j5, 2, length, iOptInt, i4, str4, 0);
    }

    public static void LIZIZ(int i, String str, int i2, long j, long j2, long j3, Integer num, int i3, int i4, int i5, String str2, Integer num2) {
        if (i == 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("speaker_id", str);
        linkedHashMap.put(Scene.SCENE_SERVICE, String.valueOf(i2));
        linkedHashMap.put("error_code", String.valueOf(num2));
        linkedHashMap.put("total_duration", String.valueOf(j));
        linkedHashMap.put("first_frame_duration", String.valueOf(j2));
        linkedHashMap.put("action", String.valueOf(num));
        linkedHashMap.put("content_sum", String.valueOf(i3));
        linkedHashMap.put("caton_time", String.valueOf(i4));
        linkedHashMap.put("save_file_suc", String.valueOf(i5));
        linkedHashMap.put("connect_suc_duration", String.valueOf(j3));
        if (str2 != null) {
            linkedHashMap.put("task_id", str2);
        }
        C20684815ws.LJIILLIIL("streaming_tts_action", linkedHashMap);
    }
}
