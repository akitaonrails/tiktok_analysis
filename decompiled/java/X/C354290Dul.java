package X;

import Y.AComparatorS24S0000000_5;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.ui.AudioBeatsPanelFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Dul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C354290Dul extends C2217421BqW implements Function1<List<? extends BeatInfo>, List<? extends BeatInfo>> {
    public C354290Dul(AudioBeatsPanelFragment audioBeatsPanelFragment) {
        super(1, audioBeatsPanelFragment, AudioBeatsPanelFragment.class, "filterBeats", "filterBeats(Ljava/util/List;)Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends BeatInfo> invoke(List<? extends BeatInfo> list) {
        List<? extends BeatInfo> list2 = list;
        this.receiver.getClass();
        if (list2.isEmpty()) {
            return C13BV.INSTANCE;
        }
        List<BeatInfo> listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(151), list2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (BeatInfo beatInfo : listLJLLLL) {
            long j = beatInfo.timestampInMS;
            long j2 = ((j - 10000) + 1) / 1000;
            if (j2 < 0) {
                j2 = 0;
            }
            long j3 = j / 1000;
            ArrayList arrayList2 = new ArrayList();
            if (j2 <= j3) {
                while (true) {
                    int i = (int) j2;
                    arrayList2.add(Integer.valueOf(i));
                    Integer numValueOf = Integer.valueOf(i);
                    Object obj = 0;
                    Object obj2 = linkedHashMap.get(numValueOf);
                    if (obj2 != null) {
                        obj = obj2;
                    }
                    if (((Number) obj).intValue() >= 20) {
                        break;
                    }
                    if (j2 == j3) {
                        break;
                    }
                    j2++;
                }
            }
            arrayList.add(beatInfo);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                Integer numValueOf2 = Integer.valueOf(iIntValue);
                Object obj3 = 0;
                Object obj4 = linkedHashMap.get(Integer.valueOf(iIntValue));
                if (obj4 != null) {
                    obj3 = obj4;
                }
                linkedHashMap.put(numValueOf2, Integer.valueOf(((Number) obj3).intValue() + 1));
            }
        }
        return C13LP.LJLLLL(new AComparatorS24S0000000_5(150), arrayList);
    }
}
