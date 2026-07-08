package X;

/* JADX INFO: renamed from: X.0kLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316130kLz {
    public static InterfaceC1320380kSq LIZ(InterfaceC1320380kSq interfaceC1320380kSq) {
        if (interfaceC1320380kSq == InterfaceC1320380kSq.LIZJ) {
            return InterfaceC1316140kM0.LJIIL;
        }
        if (interfaceC1320380kSq == InterfaceC1320380kSq.LJI) {
            return InterfaceC1316140kM0.LJIIJJI;
        }
        if (interfaceC1320380kSq == InterfaceC1320380kSq.LJ) {
            return InterfaceC1316140kM0.LJIIJ;
        }
        if (interfaceC1320380kSq == InterfaceC1320380kSq.LIZ) {
            return InterfaceC1316140kM0.LJIIIZ;
        }
        return interfaceC1320380kSq;
    }

    public static AbstractC1320320kSk LIZIZ(String str) {
        if ("aspectFit".equals(str)) {
            return InterfaceC1320380kSq.LIZJ;
        }
        if ("aspectFill".equals(str)) {
            return InterfaceC1320380kSq.LJI;
        }
        if ("scaleToFill".equals(str)) {
            return InterfaceC1320380kSq.LIZ;
        }
        if ("center".equals(str)) {
            return InterfaceC1320380kSq.LJ;
        }
        if (str != null && !str.equals("none") && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid resize mode: '");
            sbLIZ.append(str);
            sbLIZ.append("'");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return InterfaceC1320380kSq.LIZ;
    }
}
