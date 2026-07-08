package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageLeftIconState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0IB1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IB1 {
    public static final boolean LIZ(List<? extends Object> list) {
        if (list == null) {
            return true;
        }
        Iterator<? extends Object> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next() instanceof C461530I7z) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LIZJ(List<? extends Object> list, C14IR c14ir) {
        if (list == null) {
            return true;
        }
        for (Object obj : list) {
            if ((obj instanceof C461530I7z) && ((C461530I7z) obj).LIZ.contains(c14ir)) {
                return false;
            }
        }
        return true;
    }

    public static final C0IB0 LIZIZ(C0IB0 c0ib0, MessageLeftIconState messageLeftIconState, boolean z) {
        C462510IBt c462510IBt = C462510IBt.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0ib0.LIZJ);
        linkedHashMap.put(c462510IBt, new C461020I6a(messageLeftIconState, z));
        return C0IB0.LIZ(c0ib0, null, linkedHashMap, 3);
    }
}
