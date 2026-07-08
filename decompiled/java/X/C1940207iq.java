package X;

import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07iq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1940207iq {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(665));

    public static String LIZ(String str, String str2, C1772820wEa c1772820wEa) {
        if (str == null) {
            return str2;
        }
        for (InterfaceC1940307ir interfaceC1940307ir : (List) LIZ.getValue()) {
            if (interfaceC1940307ir.enable()) {
                str2 = interfaceC1940307ir.LIZ(str, str2);
            }
        }
        return str2;
    }
}
