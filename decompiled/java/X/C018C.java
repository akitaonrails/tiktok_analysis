package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.018C, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C018C {
    public static boolean LJ;
    public static final ConcurrentHashMap<String, Object> LJFF = new ConcurrentHashMap<>();
    public final C0J0Q LIZ;
    public final ConcurrentHashMap<String, Object> LIZIZ = new ConcurrentHashMap<>();
    public final C01GW LIZJ = C452501pT.LIZIZ(new C5182020e(this, 102));
    public boolean LIZLLL;

    public final void LIZ() {
        if (this.LIZLLL || !LJ) {
            return;
        }
        for (Map.Entry<String, Object> entry : LJFF.entrySet()) {
            this.LIZIZ.put(entry.getKey(), entry.getValue());
        }
        this.LIZLLL = true;
    }

    public C018C(C0J0Q c0j0q) {
        this.LIZ = c0j0q;
    }
}
