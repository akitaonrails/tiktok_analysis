package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762250vxX {
    public final InterfaceC497601wk LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final Map<String, C1508390pM5> LIZLLL = new LinkedHashMap();

    public final void LIZ() {
        for (Map.Entry entry : ((LinkedHashMap) this.LIZLLL).entrySet()) {
            entry.getKey();
            C1508390pM5 c1508390pM5 = (C1508390pM5) entry.getValue();
            if (c1508390pM5.LJI()) {
                c1508390pM5.pause();
            }
        }
    }

    public C1762250vxX(InterfaceC497601wk interfaceC497601wk, String str, boolean z) {
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
