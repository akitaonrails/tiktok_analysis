package X;

import java.io.File;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01bG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C364401bG {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(429));
    public static volatile String LIZIZ;

    public static String LIZ(String str, String str2, boolean z) {
        String str3;
        if (z) {
            str3 = "dark";
        } else {
            str3 = "light";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str4 = File.separator;
        sbLIZ.append(str4);
        sbLIZ.append(str);
        sbLIZ.append(str4);
        sbLIZ.append(str3);
        sbLIZ.append(str4);
        sbLIZ.append(str2);
        sbLIZ.append(".png");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZIZ(String str, InterfaceC497601wk interfaceC497601wk, Function2 function2) {
        String str2 = LIZIZ;
        if (str2 != null && C1533950q1J.LJ(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinImageGeckoManagergetGeckoImageResPathWithFetch: success: true cache res:");
            sbLIZ.append(str);
            sbLIZ.append(" path:");
            sbLIZ.append(str2);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            function2.invoke(Boolean.TRUE, str2);
            return;
        }
        C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C364301bF("", "tiktok_social_bulletin_image", str, new C364501bH(str, function2), null), 2);
    }
}
