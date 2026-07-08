package X;

import java.util.Random;

/* JADX INFO: renamed from: X.0ji4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1291380ji4 {
    public static boolean LIZ;
    public static Random LIZIZ;

    static {
        synchronized (C1291390ji5.class) {
            InterfaceC1291400ji6 interfaceC1291400ji6 = C1291390ji5.LIZ;
            if (interfaceC1291400ji6 != null) {
                interfaceC1291400ji6.LIZ();
                C1291390ji5.LIZ = null;
            } else {
                C1291390ji5.LIZIZ = true;
            }
        }
    }

    public static void LIZ(C1291330jhz c1291330jhz, C1291430ji9 c1291430ji9, Object obj) {
        Integer numValueOf;
        if (LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("traceLottieViewSetAnimation  {value=");
            sbLIZ.append(obj);
            sbLIZ.append("  view=");
            sbLIZ.append(c1291330jhz.hashCode());
            sbLIZ.append(" visibility:");
            sbLIZ.append(c1291330jhz.getVisibility());
            sbLIZ.append(" drawable=");
            if (c1291430ji9 != null) {
                numValueOf = Integer.valueOf(c1291430ji9.hashCode());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(" visible:");
            sbLIZ.append(c1291330jhz.isShown());
            sbLIZ.append("}");
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
