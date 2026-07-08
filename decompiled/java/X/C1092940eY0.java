package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0eY0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092940eY0 {
    public final C1092920eXy LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0eXy] */
    public C1092940eY0() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(201));
        this.LIZIZ = c01gwLIZIZ;
        this.LIZJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(199));
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(200));
        if (((Boolean) c01gwLIZIZ.getValue()).booleanValue()) {
            ((List) c01gwLIZIZ2.getValue()).add(new InterfaceC1092910eXx() { // from class: X.0eXz
                @Override // X.InterfaceC1092910eXx
                public final void LIZ(String str, String str2, Throwable th) {
                }
            });
        }
        this.LIZ = new InterfaceC1092910eXx((List) c01gwLIZIZ2.getValue()) { // from class: X.0eXy
            public final List<InterfaceC1092910eXx> LIZ;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = list;
            }

            @Override // X.InterfaceC1092910eXx
            public final void LIZ(String str, String str2, Throwable th) {
                Iterator<InterfaceC1092910eXx> it2 = this.LIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(str, str2, th);
                }
            }
        };
    }
}
