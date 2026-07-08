package X;

import com.bytedance.android.live.liveinteract.multilive.model.InRoomMultiGuestBanner;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0a6k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922280a6k {
    public final List<InRoomMultiGuestBanner> LIZ;
    public final C946320ajW<String, String> LIZIZ;

    public final InRoomMultiGuestBanner LIZ() {
        InRoomMultiGuestBanner next;
        Iterator<InRoomMultiGuestBanner> it2 = this.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (!this.LIZIZ.containsKey(String.valueOf(next.id))) {
                break;
            }
        }
        return next;
    }

    public C922280a6k(List<InRoomMultiGuestBanner> list, C946320ajW<String, String> c946320ajW) {
        this.LIZ = list;
        this.LIZIZ = c946320ajW;
    }
}
