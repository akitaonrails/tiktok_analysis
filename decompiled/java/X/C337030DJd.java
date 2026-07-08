package X;

/* JADX INFO: renamed from: X.0DJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337030DJd {
    public static double LIZIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return 0.0d;
        }
        InterfaceC1017050cZb.LJLJLLL.getClass();
        Double d = C0BI6.LIZIZ.getValue().get(str);
        if (d == null) {
            if (!C2213981Bky.LIZIZ.isOffline()) {
                return 0.0d;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get priority failed, biz: ");
            sbLIZ.append(str);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return d.doubleValue();
    }

    public static int LIZ(InterfaceC1017050cZb interfaceC1017050cZb, InterfaceC1017050cZb interfaceC1017050cZb2) {
        double dLIZIZ = LIZIZ(interfaceC1017050cZb2.LJJJLIIL()) - LIZIZ(interfaceC1017050cZb.LJJJLIIL());
        if (dLIZIZ > 0.0d) {
            return 1;
        }
        if (dLIZIZ < 0.0d) {
            return -1;
        }
        return 0;
    }
}
