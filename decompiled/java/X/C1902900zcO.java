package X;

import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0zcO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902900zcO {
    public static volatile int LIZLLL;
    public static final C1902900zcO LIZ = new C1902900zcO();
    public static final CopyOnWriteArraySet<String> LIZIZ = new CopyOnWriteArraySet<>();
    public static final CopyOnWriteArraySet<String> LIZJ = new CopyOnWriteArraySet<>();
    public static String LJ = "";

    public final void LIZ() {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("total_unread_count", Integer.valueOf(LIZLLL));
        CopyOnWriteArraySet<String> copyOnWriteArraySet = LIZIZ;
        c2241008qG.LIZ.put("client_read_count", Integer.valueOf(copyOnWriteArraySet.size()));
        CopyOnWriteArraySet<String> copyOnWriteArraySet2 = LIZJ;
        c2241008qG.LIZ.put("client_click_count", Integer.valueOf(copyOnWriteArraySet2.size()));
        c2241008qG.LIZ.put("position", LJ);
        C20684815ws.LJIJ("activities_consumption", c2241008qG.LJ());
        synchronized (this) {
            LIZLLL = 0;
            copyOnWriteArraySet.clear();
            copyOnWriteArraySet2.clear();
        }
    }

    public final synchronized void LIZIZ(int i, String str) {
        LIZLLL = i;
        LJ = str;
        LIZIZ.clear();
        LIZJ.clear();
    }
}
