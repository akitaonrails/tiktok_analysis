package X;

import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0VvF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813230VvF extends Observable {
    public static volatile C813230VvF LIZJ;
    public volatile boolean LIZ;
    public final CopyOnWriteArrayList<Integer> LIZIZ = new CopyOnWriteArrayList<>();

    public final void LIZ(boolean z, List<Integer> list) {
        this.LIZ = z;
        this.LIZIZ.clear();
        this.LIZIZ.addAll(list);
        HashMap map = new HashMap();
        map.put("user_blocked_state", Boolean.valueOf(this.LIZ));
        map.put("drop_reason_list", this.LIZIZ);
        setChanged();
        notifyObservers(map);
    }
}
