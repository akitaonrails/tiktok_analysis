package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334280D8o {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;

    public final C334300D8q LIZ() {
        String str = this.LIZ;
        if (str == null) {
            LIZIZ();
            return null;
        }
        String str2 = this.LIZIZ;
        if (str2 == null) {
            LIZIZ();
            return null;
        }
        String str3 = this.LIZJ;
        if (str3 == null) {
            LIZIZ();
            return null;
        }
        String str4 = this.LJ;
        if (str4 == null) {
            LIZIZ();
            return null;
        }
        String str5 = this.LJFF;
        if (str5 == null) {
            LIZIZ();
            return null;
        }
        String str6 = this.LJI;
        if (str6 == null) {
            LIZIZ();
            return null;
        }
        String str7 = this.LJII;
        if (str7 != null) {
            return new C334300D8q(str, str2, str3, this.LIZLLL, str4, str5, str6, str7);
        }
        LIZIZ();
        return null;
    }

    public final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildOrNull: incomplete billing address, hasFirstName=");
        sbLIZ.append(this.LIZ != null);
        sbLIZ.append(", hasLastName=");
        sbLIZ.append(this.LIZIZ != null);
        sbLIZ.append(", hasStreetAddress=");
        sbLIZ.append(this.LIZJ != null);
        sbLIZ.append(", hasAddressLocality=");
        sbLIZ.append(this.LJ != null);
        sbLIZ.append(", hasAddressRegion=");
        sbLIZ.append(this.LJFF != null);
        sbLIZ.append(", hasPostalCode=");
        sbLIZ.append(this.LJI != null);
        sbLIZ.append(", hasAddressCountry=");
        sbLIZ.append(this.LJII != null);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ(String str) {
        String string;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && (!a0.LJJJIL(string))) {
            return string;
        }
        return null;
    }
}
