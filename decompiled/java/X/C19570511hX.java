package X;

/* JADX INFO: renamed from: X.11hX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19570511hX {
    public static InterfaceC19570411hW LIZ;

    public static void LIZ(String str) {
        InterfaceC19570411hW interfaceC19570411hW = LIZ;
        if (interfaceC19570411hW != null) {
            interfaceC19570411hW.LIZ(str);
        }
    }

    public static void LIZIZ(String str) {
        int length;
        int i = 0;
        if (str != null && (length = str.length()) > 3900 && str != null) {
            int i2 = length / 3900;
            if (i2 < 0) {
                return;
            }
            while (true) {
                int i3 = i * 3900;
                int i4 = i + 1;
                int i5 = i4 * 3900;
                if (i5 > length) {
                    i5 = length;
                }
                if (i3 == i5) {
                    return;
                }
                InterfaceC19570411hW interfaceC19570411hW = LIZ;
                if (interfaceC19570411hW != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[split-log-order-");
                    sbLIZ.append(i4);
                    sbLIZ.append("] ");
                    sbLIZ.append(str.substring(i3, i5));
                    interfaceC19570411hW.i(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[split-log-order-");
                    sbLIZ2.append(i4);
                    sbLIZ2.append("] ");
                    sbLIZ2.append(str.substring(i3, i5));
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                if (i != i2) {
                    i = i4;
                } else {
                    return;
                }
            }
        } else {
            InterfaceC19570411hW interfaceC19570411hW2 = LIZ;
            if (interfaceC19570411hW2 != null) {
                interfaceC19570411hW2.i(str);
            }
        }
    }

    public static void LIZJ(String str) {
        InterfaceC19570411hW interfaceC19570411hW = LIZ;
        if (interfaceC19570411hW != null) {
            interfaceC19570411hW.w(str);
        }
    }
}
