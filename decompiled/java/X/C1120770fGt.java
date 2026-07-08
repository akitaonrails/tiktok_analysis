package X;

import com.bytedance.android.livesdk.gift.model.GiftIconGuideInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0fGt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120770fGt {
    public static final C1120770fGt LIZ = new C1120770fGt();
    public static final Map<Long, C00XS> LIZIZ = new ConcurrentHashMap();

    public static GiftIconGuideInfo LIZ(List list) {
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                GiftIconGuideInfo giftIconGuideInfo = (GiftIconGuideInfo) next;
                if (giftIconGuideInfo.guideId.length() > 0) {
                    String str = giftIconGuideInfo.guideId;
                    if (str.length() != 0) {
                        ArrayList<String> arrayListLIZIZ = InterfaceC1106030et7.Q6.LIZIZ();
                        if (arrayListLIZIZ == null) {
                            arrayListLIZIZ = new ArrayList<>();
                        }
                        if (arrayListLIZIZ.lastIndexOf(str) == -1) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        return (GiftIconGuideInfo) next;
    }
}
