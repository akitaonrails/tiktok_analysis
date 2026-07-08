package X;

import android.os.Vibrator;

/* JADX INFO: renamed from: X.1Bac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207561Bac extends C2207491BaV implements InterfaceC2207401BaM {
    public C2207571Bad LIZIZ;

    @Override // X.InterfaceC2207401BaM
    public final boolean LIZJ(EnumC2207531BaZ enumC2207531BaZ) {
        C2207571Bad c2207571Bad = this.LIZIZ;
        return c2207571Bad != null && c2207571Bad.LIZ().contains(enumC2207531BaZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2207561Bac(android.content.Context r17) {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2207561Bac.<init>(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01aa A[Catch: JSONException -> 0x01c0, TryCatch #0 {JSONException -> 0x01c0, blocks: (B:38:0x00af, B:40:0x00b5, B:41:0x00c6, B:43:0x00cc, B:45:0x00dc, B:46:0x0102, B:48:0x0108, B:52:0x0120, B:63:0x013c, B:65:0x014f, B:64:0x0146, B:55:0x0129, B:66:0x0152, B:70:0x016e, B:81:0x018a, B:82:0x01aa, B:73:0x0177, B:83:0x01b7, B:84:0x01bb), top: B:103:0x00af }] */
    @Override // X.InterfaceC2207401BaM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C2207451BaR r14) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2207561Bac.LIZ(X.1BaR):java.lang.Object");
    }

    @Override // X.InterfaceC2207401BaM
    public final Object LIZIZ(C2207451BaR c2207451BaR) {
        StringBuilder sbLIZ;
        String str;
        switch (C1ET5.LIZ[c2207451BaR.LIZ.ordinal()]) {
            case 1:
            case 2:
            case 3:
                C081Q.LIZ.a();
                break;
            case 4:
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reset tid:");
                sbLIZ.append(0);
                str = " priority";
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                C2207231Ba5.LIZ(3);
                break;
            case 5:
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reset tid:");
                sbLIZ.append(0);
                str = " core bind";
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                C2207231Ba5.LIZ(3);
                break;
            case 6:
                C2207231Ba5.LIZ(3);
                Vibrator vibrator = C2207581Bae.LIZ;
                if (vibrator == null) {
                    C2207231Ba5.LIZ(6);
                } else {
                    C2207581Bae.LIZIZ = true;
                    vibrator.cancel();
                }
                break;
            case 7:
                C081Q.LIZ.a();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("release boost for ");
                sbLIZ2.append(c2207451BaR.LIZLLL.LIZ.getDesc());
                C2188811AlT.LIZIZ(sbLIZ2);
                C2207231Ba5.LIZ(4);
                break;
            default:
                C2207231Ba5.LIZ(5);
                break;
        }
        return 1;
    }
}
