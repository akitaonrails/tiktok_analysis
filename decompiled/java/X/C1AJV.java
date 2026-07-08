package X;

import com.bytedance.android.livesdk.model.Sticker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1AJV, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AJV {
    public final boolean LIZ;
    public final Map<Long, Integer> LIZIZ = new LinkedHashMap();

    public C1AJV(boolean z) {
        this.LIZ = z;
    }

    public final boolean LIZ(int i, Long l) {
        Integer num;
        if (l != null && (num = (Integer) ((LinkedHashMap) this.LIZIZ).get(l)) != null && num.intValue() == i) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(int i, List list) {
        if (!this.LIZ) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Sticker sticker = (Sticker) it2.next();
            if (sticker != null && Long.valueOf(sticker.id) != null && sticker.type == 4) {
                this.LIZIZ.put(Long.valueOf(sticker.id), Integer.valueOf(i));
            }
        }
    }
}
