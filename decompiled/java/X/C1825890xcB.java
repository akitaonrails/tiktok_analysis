package X;

import android.content.Context;
import java.util.Map;

/* JADX INFO: renamed from: X.0xcB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825890xcB {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, String> LJ;
    public final EnumC1420700n4e LJFF;
    public final InterfaceC665370Q7z LJI;
    public final C01GW LJII;

    public C1825890xcB(Context context, String str, String str2, String str3, EnumC1420700n4e enumC1420700n4e, InterfaceC665370Q7z interfaceC665370Q7z, int i) {
        Map<String, String> mapLJ;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        if ((i & 16) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        enumC1420700n4e = (i & 32) != 0 ? null : enumC1420700n4e;
        interfaceC665370Q7z = (i & 64) != 0 ? null : interfaceC665370Q7z;
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = mapLJ;
        this.LJFF = enumC1420700n4e;
        this.LJI = interfaceC665370Q7z;
        this.LJII = C452501pT.LIZIZ(new C1826020xcO(this));
    }
}
