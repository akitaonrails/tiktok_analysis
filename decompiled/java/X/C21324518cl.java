package X;

import java.util.HashMap;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18cl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21324518cl {
    public final C21326718d7 LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final HashMap<String, C21325818cy> LIZLLL = new HashMap<>();
    public final C01GW LJ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS576S0100000_32(this, 713));

    public C21324518cl(C21326718d7 c21326718d7) {
        this.LIZ = c21326718d7;
    }

    public final C21325818cy LIZ(String str, AbstractC21324618cm abstractC21324618cm) {
        C1325860kbg.LIZ();
        C21325818cy c21325818cy = this.LIZLLL.get(str);
        if (c21325818cy == null) {
            C21325818cy c21325818cy2 = new C21325818cy(abstractC21324618cm.LIZJ(), str, this.LIZ);
            this.LIZLLL.put(str, c21325818cy2);
            return c21325818cy2;
        }
        return c21325818cy;
    }
}
