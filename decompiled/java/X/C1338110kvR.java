package X;

/* JADX INFO: renamed from: X.0kvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338110kvR {
    public static boolean LIZ(InterfaceC1338020kvI interfaceC1338020kvI) {
        boolean z;
        C21325918cz c21325918czLIZIZ = interfaceC1338020kvI.LIZIZ();
        String str = c21325918czLIZIZ.LJIILJJIL;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            EnumC1325870kbh enumC1325870kbh = EnumC1325870kbh.PARAMS_INVALID;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Template: ");
            sbLIZ.append(c21325918czLIZIZ.LJIIJJI());
            sbLIZ.append(", with animation requires bindData to pass in uniqueNodeId");
            new C1338670kwL(enumC1325870kbh, 5000, C2188811AlT.LIZIZ(sbLIZ), null, 24).LIZJ(C21323718cd.LIZ(interfaceC1338020kvI));
            return false;
        }
        String elementId = interfaceC1338020kvI.getElementId();
        if (elementId != null && elementId.length() != 0) {
            return true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Template: ");
        sbLIZ2.append(c21325918czLIZIZ.LJIIJJI());
        sbLIZ2.append(", element with animation needs to configure element_id");
        new C1338670kwL(EnumC1325870kbh.PARAMS_INVALID, 5000, C2188811AlT.LIZIZ(sbLIZ2), null, 24).LIZJ(C21323718cd.LIZ(interfaceC1338020kvI));
        return false;
    }

    public static String LIZIZ(InterfaceC1338020kvI interfaceC1338020kvI, String str) {
        String str2 = interfaceC1338020kvI.LIZIZ().LJIILJJIL;
        String elementId = interfaceC1338020kvI.getElementId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(elementId);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
