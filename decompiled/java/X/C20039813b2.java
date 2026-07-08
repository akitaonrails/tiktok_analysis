package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13b2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20039813b2 extends AbstractC1879030yzt {
    public static boolean LIZ = true;
    public static boolean LIZIZ;

    public static void LIZLLL(C13MH c13mh, EnumC1783170wVH enumC1783170wVH, String str, Function0 function0, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa) {
        if (!LIZ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("message:");
        sbLIZ.append((String) function0.invoke());
        sbLIZ.append(", params:");
        sbLIZ.append(interfaceC1604490rr5);
        sbLIZ.append(", result:");
        sbLIZ.append(c0raa);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = C13MI.LIZ[c13mh.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("nodeType:");
                    sbLIZ2.append(enumC1783170wVH);
                    sbLIZ2.append(", name:");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(strLIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    return;
                }
                throw new C1954807lC();
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("nodeType:");
            sbLIZ3.append(enumC1783170wVH);
            sbLIZ3.append(", name:");
            sbLIZ3.append(str);
            sbLIZ3.append(", ");
            sbLIZ3.append(strLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ3);
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("nodeType:");
        sbLIZ4.append(enumC1783170wVH);
        sbLIZ4.append(", name:");
        sbLIZ4.append(str);
        sbLIZ4.append(", ");
        sbLIZ4.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ4);
    }
}
