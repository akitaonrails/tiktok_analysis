package X;

import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadApiData;
import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadEntry;
import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadEventData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08Wf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2130308Wf {
    public static C2130808Wk LIZ(ECPreloadEntry eCPreloadEntry, String str) {
        ArrayList arrayList = new ArrayList();
        List<ECPreloadApiData> list = eCPreloadEntry.apiList;
        if (list != null) {
            Iterator<ECPreloadApiData> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C1903407cu(it2.next()));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        List<ECPreloadEventData> list2 = eCPreloadEntry.eventList;
        if (list2 != null) {
            Iterator<ECPreloadEventData> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new C08W1(it3.next()));
            }
        }
        String str2 = eCPreloadEntry.type;
        if (str2 == null) {
            return null;
        }
        EnumC2130408Wg.Companion.getClass();
        if (!Intrinsics.LJFF(str2, EnumC2130408Wg.PDP_BATCH_API.getValueStr()) || eCPreloadEntry.entryId == null) {
            return null;
        }
        return new C2130808Wk(eCPreloadEntry, arrayList, arrayList2, str);
    }
}
