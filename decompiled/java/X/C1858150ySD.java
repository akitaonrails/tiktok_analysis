package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BatchUpdateMessage;
import com.ss.android.ugc.aweme.tako.ccl.model.request.ExtraRequestInfo;
import defpackage.w2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: X.0ySD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858150ySD {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(IMessageAbility iMessageAbility, BatchUpdateMessage batchUpdateMessage, List list, boolean z, w2.a aVar, int i) {
        if ((i & 2) != 0) {
            list = C13BV.INSTANCE;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            aVar = null;
        }
        iMessageAbility.j10(batchUpdateMessage, list, z, aVar);
    }

    public static void LIZIZ(IMessageAbility iMessageAbility, String str, List list, List list2, boolean z, EnumC1858090yS7 enumC1858090yS7, int i, Integer num, int i2, String str2, String str3, Map map, C830490Whz c830490Whz, boolean z2, ExtraRequestInfo extraRequestInfo, Map map2, Map map3, TakoReferenceAskInfo takoReferenceAskInfo, TakoEditAskInfo takoEditAskInfo, int i3) {
        String string;
        Map map4 = map2;
        ExtraRequestInfo extraRequestInfo2 = extraRequestInfo;
        boolean z3 = z2;
        String str4 = str2;
        int i4 = i2;
        Integer num2 = num;
        TakoReferenceAskInfo takoReferenceAskInfo2 = takoReferenceAskInfo;
        int i5 = i;
        Map linkedHashMap = map3;
        List list3 = list2;
        if ((i3 & 4) != 0) {
            list3 = C13BV.INSTANCE;
        }
        if ((i3 & 32) != 0) {
            i5 = 0;
        }
        TakoEditAskInfo takoEditAskInfo2 = null;
        if ((i3 & 64) != 0) {
            num2 = null;
        }
        if ((i3 & 128) != 0) {
            i4 = 0;
        }
        String str5 = "";
        if ((i3 & 256) != 0) {
            str4 = "";
        }
        if ((i3 & 512) == 0) {
            str5 = str3;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z3 = false;
        }
        if ((i3 & 8192) != 0) {
            extraRequestInfo2 = null;
        }
        if ((i3 & 16384) != 0) {
            map4 = null;
        }
        if ((32768 & i3) != 0) {
            linkedHashMap = new LinkedHashMap();
        }
        if ((65536 & i3) != 0) {
            string = UUID.randomUUID().toString();
        } else {
            string = null;
        }
        if ((131072 & i3) != 0) {
            takoReferenceAskInfo2 = null;
        }
        if ((i3 & 262144) == 0) {
            takoEditAskInfo2 = takoEditAskInfo;
        }
        iMessageAbility.rv1(str, list, list3, z, enumC1858090yS7, i5, num2, i4, str4, str5, map, c830490Whz, z3, extraRequestInfo2, map4, linkedHashMap, string, takoReferenceAskInfo2, takoEditAskInfo2);
    }
}
