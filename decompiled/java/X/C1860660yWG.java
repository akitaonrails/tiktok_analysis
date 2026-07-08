package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0yWG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860660yWG {
    public static final void LIZ(TakoBotSettingResponse takoBotSettingResponse) {
        List<TakoBotInfo> list = takoBotSettingResponse.botInfos;
        ArrayList arrayList = new ArrayList();
        for (TakoBotInfo takoBotInfo : list) {
            if (takoBotInfo.disableHistory) {
                arrayList.add(takoBotInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((TakoBotInfo) it2.next()).botId));
        }
        if (!arrayList2.isEmpty()) {
            C1863400yag.LIZ.getClass();
            C1863400yag.LIZJ.addAll(arrayList2);
        }
    }
}
