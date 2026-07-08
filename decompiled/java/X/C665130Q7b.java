package X;

import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.NimbleParams;
import com.ss.android.ugc.aweme.tako.model.SuggestionWordInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEventTracker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Q7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665130Q7b {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C14TF c14tf, Context context, String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, List list3, List list4, List list5, Map map, List list6, TakoEventTracker takoEventTracker, String str9, String str10, AIBotInfo aIBotInfo, String str11, SuggestionWordInfo suggestionWordInfo, String str12, Integer num, NimbleParams nimbleParams, C665120Q7a c665120Q7a, String str13, int i, int i2) {
        String str14 = str13;
        C665120Q7a c665120Q7a2 = c665120Q7a;
        NimbleParams nimbleParams2 = nimbleParams;
        String str15 = str12;
        SuggestionWordInfo suggestionWordInfo2 = suggestionWordInfo;
        AIBotInfo aIBotInfo2 = aIBotInfo;
        String str16 = str10;
        String str17 = str9;
        TakoEventTracker takoEventTracker2 = takoEventTracker;
        Map linkedHashMap = map;
        Integer num2 = num;
        List list7 = list2;
        String str18 = str8;
        String str19 = str7;
        List list8 = list4;
        String str20 = str11;
        List list9 = list6;
        List list10 = list;
        String str21 = str4;
        String str22 = str3;
        List list11 = list3;
        String str23 = str6;
        String str24 = str5;
        List list12 = list5;
        if ((i & 16) != 0) {
            str22 = null;
        }
        if ((i & 32) != 0) {
            str21 = null;
        }
        if ((i & 64) != 0) {
            str24 = null;
        }
        if ((i & 128) != 0) {
            str23 = null;
        }
        if ((i & 1024) != 0) {
            str19 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str18 = null;
        }
        if ((i & 8192) != 0) {
            list10 = C13BV.INSTANCE;
        }
        if ((i & 16384) != 0) {
            list7 = C13BV.INSTANCE;
        }
        if ((32768 & i) != 0) {
            list11 = C13BV.INSTANCE;
        }
        if ((65536 & i) != 0) {
            list8 = C13BV.INSTANCE;
        }
        if ((131072 & i) != 0) {
            list12 = C13BV.INSTANCE;
        }
        if ((262144 & i) != 0) {
            linkedHashMap = new LinkedHashMap();
        }
        if ((524288 & i) != 0) {
            list9 = C13BV.INSTANCE;
        }
        if ((1048576 & i) != 0) {
            takoEventTracker2 = null;
        }
        if ((16777216 & i) != 0) {
            str17 = null;
        }
        if ((33554432 & i) != 0) {
            str16 = null;
        }
        if ((67108864 & i) != 0) {
            aIBotInfo2 = new AIBotInfo(0L, null, null, 0, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388607, null);
        }
        if ((134217728 & i) != 0) {
            str20 = null;
        }
        if ((i & 536870912) != 0) {
            suggestionWordInfo2 = null;
        }
        if ((i2 & 32) != 0) {
            str15 = null;
        }
        if ((i2 & 128) != 0) {
            num2 = null;
        }
        if ((i2 & 256) != 0) {
            nimbleParams2 = null;
        }
        if ((i2 & 512) != 0) {
            c665120Q7a2 = null;
        }
        if ((i2 & 1024) != 0) {
            str14 = null;
        }
        c14tf.LJLLLL(context, str, str2, j, str22, str21, str24, str23, null, null, str19, null, str18, list10, list7, list11, list8, list12, linkedHashMap, list9, takoEventTracker2, null, false, null, str17, str16, aIBotInfo2, str20, null, suggestionWordInfo2, null, null, null, null, null, null, null, str15, null, num2, nimbleParams2, c665120Q7a2, str14);
    }
}
