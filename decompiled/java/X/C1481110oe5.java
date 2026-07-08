package X;

/* JADX INFO: renamed from: X.0oe5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481110oe5 {
    public static boolean LIZ;
    public static InterfaceC1481170oeB LIZIZ;

    public static void LIZ(String str) {
        InterfaceC1481170oeB interfaceC1481170oeB = LIZIZ;
        if (interfaceC1481170oeB != null) {
            interfaceC1481170oeB.onLog(str);
        }
    }

    public static void LIZJ(String str) {
        InterfaceC1481170oeB interfaceC1481170oeB = LIZIZ;
        if (interfaceC1481170oeB != null) {
            interfaceC1481170oeB.onLog(str);
        }
    }

    public static void LIZIZ(String str, String str2) {
        if (LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(str2);
            LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZLLL(String str, String str2) {
        if (LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(str2);
            LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJ(String str, Throwable th) {
        if (LIZ) {
            if (th != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PlayerLog");
                sbLIZ.append(", ");
                sbLIZ.append(str);
                LJ(C2188811AlT.LIZIZ(sbLIZ), th);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PlayerLog");
            sbLIZ2.append(", ");
            sbLIZ2.append(str);
            LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static void LJFF(Throwable th, String str) {
        InterfaceC1481170oeB interfaceC1481170oeB = LIZIZ;
        if (interfaceC1481170oeB != null) {
            interfaceC1481170oeB.ensureNotReachHere(th, str);
        }
    }
}
