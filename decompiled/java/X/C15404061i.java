package X;

import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.061i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15404061i {
    public final C08I7<Integer, C08I7<Long, IMAIBotInfo>> LIZ = new C08I7<>(1);

    public final void LIZ(List<IMAIBotInfo> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (IMAIBotInfo iMAIBotInfo : list) {
            Integer numValueOf = Integer.valueOf(iMAIBotInfo.scene);
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(iMAIBotInfo);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            List<IMAIBotInfo> list2 = (List) entry.getValue();
            C08I7<Long, IMAIBotInfo> c08i7LIZIZ = this.LIZ.LIZIZ(Integer.valueOf(iIntValue));
            if (c08i7LIZIZ == null) {
                c08i7LIZIZ = new C08I7<>(1);
                this.LIZ.LIZLLL(Integer.valueOf(iIntValue), c08i7LIZIZ);
            }
            for (IMAIBotInfo iMAIBotInfo2 : list2) {
                c08i7LIZIZ.LIZLLL(Long.valueOf(iMAIBotInfo2.id), iMAIBotInfo2);
            }
        }
    }
}
