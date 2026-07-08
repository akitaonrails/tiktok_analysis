package X;

import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.06ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1647306ch {
    public static final boolean LIZLLL() {
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        if (C894660Z7w.LIZLLL()) {
            return true;
        }
        c0i0b.LIZJ();
        return C894660Z7w.LJ();
    }

    public static void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DM_ENSURE_TAG:");
        sbLIZ.append(str);
        C1AF0.LJFF(null, C2188811AlT.LIZIZ(sbLIZ));
        LIZ(null, str, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    public static final void LIZ(Exception exc, String str, boolean z) {
        String str2;
        Fragment fragmentLIZLLL;
        if (LIZLLL()) {
            if (z) {
                str2 = "DM crash!!!\n";
            } else {
                str2 = "debug toast: ";
            }
            C259800zU c259800zU = new C259800zU();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(str);
            c259800zU.element = C2188811AlT.LIZIZ(sbLIZ);
            if (exc != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append((String) c259800zU.element);
                sbLIZ2.append("\n\nReason: ");
                String message = exc.getMessage();
                if (message == null) {
                    message = "";
                }
                sbLIZ2.append(message);
                sbLIZ2.append("\n\nstackTrace[0]: ");
                sbLIZ2.append(exc.getStackTrace()[0]);
                c259800zU.element = C2188811AlT.LIZIZ(sbLIZ2);
            }
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL()) != null) {
                C1260120ite.LIZIZ(new RunnableC514501zT(fragmentLIZLLL, c259800zU, 25));
            }
        }
    }
}
