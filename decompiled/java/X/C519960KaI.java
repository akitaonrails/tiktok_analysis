package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0KaI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C519960KaI {
    public static final /* synthetic */ int LIZ = 0;

    static {
        LIZ(Keva.getRepo("interaction_like_count"));
        LIZ(Keva.getRepo("interaction_comment_count"));
    }

    public static void LIZ(Keva keva) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : keva.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof C519970KaJ) && System.currentTimeMillis() - ((C519970KaJ) value).timeStamp >= 600000) {
                arrayList.add(key);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            keva.erase((String) it2.next());
        }
    }
}
