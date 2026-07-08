package X;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.03Ra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C842803Ra {
    public static final C842803Ra LIZ = new C842803Ra();
    public static final HashMap<String, String> LIZIZ = C2097608Jq.LJI(new Pair("ui0024", LIZ(2131832535)), new Pair("ui0002", LIZ(2131832536)), new Pair("ui0012", LIZ(2131832535)), new Pair("ui0028", LIZ(2131832537)), new Pair("ui0017", LIZ(2131832533)), new Pair("ui0018", LIZ(2131832537)), new Pair("ui0019", LIZ(2131832537)), new Pair("ui0020", LIZ(2131832538)), new Pair("ui0031", LIZ(2131832543)), new Pair("ui0034", LIZ(2131832539)), new Pair("tp0002", LIZ(2131832540)), new Pair("tp0005", LIZ(2131832542)), new Pair("tp0006", LIZ(2131832548)), new Pair("tp0007", LIZ(2131832540)), new Pair("tp0009", LIZ(2131832540)), new Pair("tp0014", LIZ(2131832540)), new Pair("tp0018", LIZ(2131832540)), new Pair("tp0019", LIZ(2131832540)), new Pair("tp0023", LIZ(2131832541)), new Pair("tp0024", LIZ(2131832549)), new Pair("tp0027", LIZ(2131832540)), new Pair("tp0030", LIZ(2131832540)), new Pair("tp0031", LIZ(2131832540)), new Pair("tp0033", LIZ(2131832540)), new Pair("tp0034", LIZ(2131832540)), new Pair("tp0035", LIZ(2131832540)), new Pair("tp0040", LIZ(2131832532)), new Pair("ot0002", LIZ(2131832544)));

    public static String LIZ(int i) {
        return C7879035x.LIZ().getString(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r4) {
        /*
            java.util.Map r3 = X.C842903Rb.LIZ()
            if (r4 == 0) goto L63
            int r0 = r4.length()
            if (r0 == 0) goto L63
            r0 = 0
        Ld:
            java.lang.String r1 = "fallback"
            if (r0 == 0) goto L54
            java.lang.String r0 = "empty"
            java.lang.Object r2 = r3.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L23
            java.lang.Object r2 = r3.get(r1)
            java.lang.String r2 = (java.lang.String) r2
        L21:
            if (r2 == 0) goto L29
        L23:
            int r0 = r2.length()
            if (r0 != 0) goto L53
        L29:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = X.C842803Ra.LIZIZ
            boolean r0 = r1.containsKey(r4)
            if (r0 == 0) goto L37
            java.lang.Object r2 = r1.get(r4)
            java.lang.String r2 = (java.lang.String) r2
        L37:
            if (r2 != 0) goto L53
            r0 = 2131832545(0x7f112ee1, float:1.9298147E38)
            java.lang.String r2 = LIZ(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Payment toast msg is null, error code: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1AF0.LIZJ(r0)
        L53:
            return r2
        L54:
            java.lang.Object r2 = r3.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L23
            java.lang.Object r2 = r3.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            goto L21
        L63:
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C842803Ra.LIZIZ(java.lang.String):java.lang.String");
    }

    public static void LIZJ(String str, String str2) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ.LLIILII(), null, new C03RZ(str2, str, null), 2);
    }
}
