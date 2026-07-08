package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS267S0300000_23;

/* JADX INFO: renamed from: X.0q6V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537170q6V {
    public int LIZ;
    public Iterable<String> LIZIZ;

    public final void LIZ(final C1537480q70 c1537480q70) {
        C1533020pzo c1533020pzoLJIILJJIL;
        if (this.LIZ == 1) {
            this.LIZ = 2;
            Iterable<String> iterable = this.LIZIZ;
            if (iterable != null && (c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(c1537480q70, true, null, 2)) != null) {
                C1530570pvr.LJFF(c1537480q70, EnumC1537150q6T.OPT_DATA_API_STATUS, 1);
                C1535890q4R c1535890q4R = C1535890q4R.LIZ;
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("query", c1537480q70), new Pair("globalProps", new InterfaceC679950Qll() { // from class: X.0q6W
                    @Override // X.InterfaceC679950Qll
                    public final String get(String str) {
                        String string;
                        C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
                        Object obj = C1326430kcb.LIZ().LIZ.get(str);
                        if (obj == null || (string = obj.toString()) == null) {
                            V v = C1326430kcb.LIZ().LIZ(c1537480q70.containerId).get(str);
                            if (v != 0) {
                                return v.toString();
                            }
                            return null;
                        }
                        return string;
                    }
                }));
                c1535890q4R.getClass();
                C1532960pzi.LJ(new AwS267S0300000_23(iterable, c1533020pzoLJIILJJIL, mapLJIIIIZZ, 0));
            }
            this.LIZIZ = null;
        }
    }
}
