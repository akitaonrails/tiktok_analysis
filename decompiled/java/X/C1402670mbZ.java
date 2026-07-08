package X;

import com.ss.android.ugc.aweme.creative.model.StreamVoiceConversionModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mbZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402670mbZ {
    public static final String LIZ(StreamVoiceConversionModel streamVoiceConversionModel) {
        Map<String, String> mapLIZLLL = LIZLLL(streamVoiceConversionModel);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = ((LinkedHashMap) mapLIZLLL).entrySet().iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(((Map.Entry) it2.next()).getKey());
        }
        return LJ(C13LP.LLIIII(linkedHashSet));
    }

    public static final Map<String, String> LIZLLL(StreamVoiceConversionModel streamVoiceConversionModel) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : streamVoiceConversionModel.vcSegmentEffectIdFromMap.entrySet()) {
            if (streamVoiceConversionModel.vcVoiceId != null && Intrinsics.LJFF(entry.getKey(), streamVoiceConversionModel.vcVoiceId)) {
                linkedHashMap.put(entry.getKey(), "vc_page");
            } else {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final String LJ(List list) {
        if (list.isEmpty()) {
            return "";
        }
        int size = list.size() - 1;
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                stringBuffer.append((String) obj);
                if (i != size) {
                    stringBuffer.append(',');
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return stringBuffer.toString();
    }

    public static final String LIZIZ(StreamVoiceConversionModel streamVoiceConversionModel, List<String> list) {
        Map<String, String> mapLIZLLL = LIZLLL(streamVoiceConversionModel);
        boolean z = false;
        if (list != null) {
            Iterator<String> it2 = list.iterator();
            z = false;
            while (it2.hasNext()) {
                CharSequence charSequence = (CharSequence) ((LinkedHashMap) mapLIZLLL).get(it2.next());
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = ((LinkedHashMap) mapLIZLLL).entrySet().iterator();
        while (it3.hasNext()) {
            linkedHashSet.add(((Map.Entry) it3.next()).getValue());
        }
        if (z) {
            linkedHashSet.add("video_edit_page");
        }
        return LJ(C13LP.LLIIII(linkedHashSet));
    }
}
