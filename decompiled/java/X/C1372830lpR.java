package X;

import java.util.List;

/* JADX INFO: renamed from: X.0lpR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372830lpR {
    public final boolean LIZ;
    public final InterfaceC1364520lc2 LIZIZ;
    public final List<InterfaceC1370310llN> LIZJ;
    public final List<InterfaceC1370310llN> LIZLLL;
    public final List<C1365460ldY> LJ;
    public final boolean LJFF;

    public C1372830lpR(boolean z, InterfaceC1364520lc2 interfaceC1364520lc2, List list, List list2, List list3, int i) {
        boolean z2;
        interfaceC1364520lc2 = (i & 2) != 0 ? null : interfaceC1364520lc2;
        list = (i & 4) != 0 ? C13BV.INSTANCE : list;
        list2 = (i & 8) != 0 ? C13BV.INSTANCE : list2;
        list3 = (i & 16) != 0 ? C13BV.INSTANCE : list3;
        if ((i & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LIZ = z;
        this.LIZIZ = interfaceC1364520lc2;
        this.LIZJ = list;
        this.LIZLLL = list2;
        this.LJ = list3;
        this.LJFF = z2;
    }
}
