package X;

import android.content.Context;
import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.NimbleParams;
import com.ss.android.ugc.aweme.tako.model.SuggestionWordInfo;
import com.ss.android.ugc.aweme.tako.model.TakoActionItem;
import com.ss.android.ugc.aweme.tako.model.TakoEntranceRequestInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEventTracker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ybj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1864050ybj {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(InterfaceC1864030ybh interfaceC1864030ybh, Context context, String str, String str2, long j, View view, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, String str10, List list, List list2, List list3, List list4, List list5, Map map, List list6, TakoEventTracker takoEventTracker, TakoActionItem takoActionItem, boolean z, Aweme aweme, String str11, String str12, AIBotInfo aIBotInfo, String str13, String str14, String str15, String str16, boolean z2, SuggestionWordInfo suggestionWordInfo, TakoEntranceRequestInfo takoEntranceRequestInfo, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Integer num, NimbleParams nimbleParams, C665120Q7a c665120Q7a, String str24, int i, int i2) {
        List list7 = list6;
        String str25 = str24;
        NimbleParams nimbleParams2 = nimbleParams;
        Integer num2 = num;
        String str26 = str23;
        String str27 = str21;
        String str28 = str20;
        String str29 = str19;
        String str30 = str17;
        TakoEntranceRequestInfo takoEntranceRequestInfo2 = takoEntranceRequestInfo;
        SuggestionWordInfo suggestionWordInfo2 = suggestionWordInfo;
        String str31 = str16;
        String str32 = str15;
        String str33 = str14;
        List list8 = list;
        Aweme aweme2 = aweme;
        AIBotInfo aIBotInfo2 = aIBotInfo;
        boolean z3 = z;
        TakoEventTracker takoEventTracker2 = takoEventTracker;
        String str34 = str12;
        TakoActionItem takoActionItem2 = takoActionItem;
        C665120Q7a c665120Q7a2 = c665120Q7a;
        Map linkedHashMap = map;
        String str35 = str22;
        List list9 = list5;
        String str36 = str18;
        List list10 = list4;
        String str37 = str10;
        Long l2 = l;
        String str38 = str9;
        boolean z4 = z2;
        List list11 = list3;
        String str39 = str8;
        String str40 = str7;
        String str41 = str6;
        String str42 = str5;
        String str43 = str13;
        List list12 = list2;
        String str44 = str4;
        String str45 = str11;
        String str46 = str3;
        View view2 = view;
        if ((i & 16) != 0) {
            view2 = null;
        }
        if ((i & 32) != 0) {
            str46 = null;
        }
        if ((i & 64) != 0) {
            str44 = null;
        }
        if ((i & 128) != 0) {
            str42 = null;
        }
        if ((i & 512) != 0) {
            str41 = null;
        }
        if ((i & 1024) != 0) {
            str40 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str39 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str38 = null;
        }
        if ((i & 8192) != 0) {
            l2 = null;
        }
        if ((i & 16384) != 0) {
            str37 = null;
        }
        if ((32768 & i) != 0) {
            list8 = C13BV.INSTANCE;
        }
        if ((65536 & i) != 0) {
            list12 = C13BV.INSTANCE;
        }
        if ((131072 & i) != 0) {
            list11 = C13BV.INSTANCE;
        }
        if ((262144 & i) != 0) {
            list10 = C13BV.INSTANCE;
        }
        if ((524288 & i) != 0) {
            list9 = C13BV.INSTANCE;
        }
        if ((1048576 & i) != 0) {
            linkedHashMap = new LinkedHashMap();
        }
        if ((i & 2097152) != 0) {
            list7 = C13BV.INSTANCE;
        }
        if ((i & 4194304) != 0) {
            takoEventTracker2 = null;
        }
        if ((i & 8388608) != 0) {
            takoActionItem2 = null;
        }
        if ((i & 16777216) != 0) {
            z3 = false;
        }
        if ((i & 33554432) != 0) {
            aweme2 = null;
        }
        if ((134217728 & i) != 0) {
            str45 = null;
        }
        if ((268435456 & i) != 0) {
            str34 = null;
        }
        if ((536870912 & i) != 0) {
            aIBotInfo2 = new AIBotInfo(0L, null, null, 0, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388607, null);
        }
        if ((i & 1073741824) != 0) {
            str43 = null;
        }
        if ((i2 & 4) != 0) {
            str33 = null;
        }
        if ((i2 & 8) != 0) {
            str32 = null;
        }
        if ((i2 & 16) != 0) {
            str31 = null;
        }
        if ((i2 & 32) != 0) {
            z4 = false;
        }
        if ((i2 & 128) != 0) {
            suggestionWordInfo2 = null;
        }
        if ((i2 & 256) != 0) {
            takoEntranceRequestInfo2 = null;
        }
        if ((i2 & 512) != 0) {
            str30 = null;
        }
        if ((i2 & 1024) != 0) {
            str36 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str29 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str28 = null;
        }
        if ((i2 & 8192) != 0) {
            str27 = null;
        }
        if ((2097152 & i2) != 0) {
            str35 = null;
        }
        if ((i2 & 4194304) != 0) {
            str26 = null;
        }
        if ((i2 & 8388608) != 0) {
            num2 = null;
        }
        if ((i2 & 16777216) != 0) {
            nimbleParams2 = null;
        }
        if ((i2 & 33554432) != 0) {
            c665120Q7a2 = null;
        }
        if ((67108864 & i2) != 0) {
            str25 = null;
        }
        interfaceC1864030ybh.LIZJ(context, str, str2, j, view2, str46, str44, str42, null, str41, str40, str39, str38, l2, str37, list8, list12, list11, list10, list9, linkedHashMap, list7, takoEventTracker2, takoActionItem2, z3, aweme2, null, str45, str34, aIBotInfo2, str43, null, null, false, str33, str32, str31, z4, null, suggestionWordInfo2, takoEntranceRequestInfo2, str30, str36, str29, str28, str27, null, false, false, false, false, null, null, str35, str26, num2, nimbleParams2, c665120Q7a2, str25);
    }
}
