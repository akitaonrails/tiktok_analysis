package X;

import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tako.model.SmartSearchItem;
import com.ss.android.ugc.aweme.tako.model.TakoEntranceRequestInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEventTracker;
import com.ss.android.ugc.aweme.tako.model.TakoSearchCarryInItem;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0yYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862290yYt {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(String str, C1856090yOt c1856090yOt, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mode_source", str2);
        linkedHashMap.put("page_source", "system_album");
        if (str != null && str.length() > 0) {
            linkedHashMap.put("query", str);
        }
        String str3 = c1856090yOt.LIZIZ;
        if (str3 != null && str3.length() > 0) {
            linkedHashMap.put("search_id", str3);
        }
        String str4 = c1856090yOt.LJ;
        if (str4 != null && str4.length() > 0) {
            linkedHashMap.put("impr_id", str4);
        }
        String str5 = c1856090yOt.LIZJ;
        if (str5 != null && str5.length() > 0) {
            linkedHashMap.put("panel_impr_id", str5);
        }
        String str6 = c1856090yOt.LIZLLL;
        if (str6 != null && str6.length() > 0) {
            linkedHashMap.put("aweme_type", str6);
        }
        return linkedHashMap;
    }

    public static void LIZIZ(Context context, String str, String str2, long j, String str3, String str4, String str5, TakoSearchCarryInItem takoSearchCarryInItem, TakoEventTracker takoEventTracker, String str6, String str7, String str8, List list, String str9) {
        if (context == null) {
            return;
        }
        C682830QqP.LIZ(str, str2, new C1862560yZK(j, str4, str5, takoEventTracker, takoSearchCarryInItem, str8, list, str7, str9, str3, str6)).LJII(context);
    }

    public static void LIZJ(Context context, String str, String str2, long j, String str3, String str4, SmartSearchItem smartSearchItem, String str5, String str6, String str7, String str8, TakoEntranceRequestInfo takoEntranceRequestInfo, C20229014Dg c20229014Dg, List list, boolean z, Integer num, int i) {
        boolean z2 = z;
        List list2 = list;
        C20229014Dg c20229014Dg2 = c20229014Dg;
        TakoEntranceRequestInfo takoEntranceRequestInfo2 = takoEntranceRequestInfo;
        String str9 = str8;
        String str10 = str7;
        String str11 = str6;
        Integer num2 = null;
        if ((i & 256) != 0) {
            str11 = null;
        }
        if ((i & 512) != 0) {
            str10 = null;
        }
        if ((i & 1024) != 0) {
            str9 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            takoEntranceRequestInfo2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c20229014Dg2 = null;
        }
        if ((i & 8192) != 0) {
            list2 = C13BV.INSTANCE;
        }
        if ((i & 16384) != 0) {
            z2 = false;
        }
        if ((i & 32768) == 0) {
            num2 = num;
        }
        if (context != null) {
            C682830QqP.LIZ(str, str2, new C1864070ybl(j, z2, str9, c20229014Dg2, smartSearchItem, str5, takoEntranceRequestInfo2, str11, str10, str4, num2, list2, str3)).LJII(context);
        }
    }
}
