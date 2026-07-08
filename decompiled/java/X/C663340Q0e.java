package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0Q0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663340Q0e {
    public final String LIZ;
    public final EnumC663360Q0g LIZIZ;
    public final boolean LIZJ;

    public final boolean LIZ(InterfaceC1019840ce6 interfaceC1019840ce6) {
        if (this.LIZJ) {
            return false;
        }
        int i = C663350Q0f.LIZ[this.LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i == 3) {
                boolean z = this.LIZJ;
                if (z) {
                    HashMap map = new HashMap();
                    map.put("bridgeName", this.LIZ);
                    map.put("newContainer", String.valueOf(z));
                    C1AF0.LIZLLL("search_jsb_use_deprecated", map);
                }
                if (!this.LIZJ) {
                    return false;
                }
                interfaceC1019840ce6.LIZ(0, "deprecated jsb methods cannot be added in spark plugin");
                return true;
            }
            throw new C1954807lC();
        }
        boolean z2 = this.LIZJ;
        HashMap map2 = new HashMap();
        map2.put("bridgeName", this.LIZ);
        map2.put("newContainer", String.valueOf(z2));
        C1AF0.LIZLLL("search_jsb_use_experimental", map2);
        return false;
    }

    public /* synthetic */ C663340Q0e(C1051660dTQ c1051660dTQ, String str) {
        this(c1051660dTQ, str, EnumC663360Q0g.DEPRECATED);
    }

    public C663340Q0e(C1051660dTQ c1051660dTQ, String str, EnumC663360Q0g enumC663360Q0g) {
        boolean z;
        C646940PZc c646940PZc;
        this.LIZ = str;
        this.LIZIZ = enumC663360Q0g;
        C1537480q70 c1537480q70 = c1051660dTQ.LIZIZ;
        if (c1537480q70 != null && (c646940PZc = (C646940PZc) c1537480q70.LJFF(C646940PZc.class)) != null) {
            z = c646940PZc.LIZ;
        } else {
            z = false;
        }
        this.LIZJ = z;
    }
}
