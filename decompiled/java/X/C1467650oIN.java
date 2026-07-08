package X;

import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oIN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467650oIN implements InterfaceC1468050oJ1 {
    public final ArrayList<String> LIZ = new ArrayList<>();
    public final C1468040oJ0 LIZIZ;
    public volatile long LIZJ;

    public C1467650oIN(C1468040oJ0 c1468040oJ0) {
        this.LIZIZ = c1468040oJ0;
    }

    @Override // X.InterfaceC1468050oJ1
    public final void LIZ(boolean z, boolean z2) {
        this.LIZJ = System.currentTimeMillis();
        HashMap map = new HashMap();
        map.put("t", Long.valueOf(System.currentTimeMillis()));
        map.put("bt", Integer.valueOf(z2 ? 1 : 0));
        map.put("con", Integer.valueOf(z ? 1 : 0));
        this.LIZ.add(C786410Ut5.J3(new JSONObject(map)));
    }
}
