package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0WBp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819190WBp implements InterfaceC819220WBs {
    public static final String LIZJ;
    public static final Set<C814570VxP> LIZLLL;
    public static final C819190WBp LJ;
    public static final C819190WBp LJFF;
    public final String LIZ;
    public final String LIZIZ;

    static {
        String strLIZ = C08E9.LIZ("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        LIZJ = strLIZ;
        String strLIZ2 = C08E9.LIZ("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strLIZ3 = C08E9.LIZ("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        LIZLLL = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C814570VxP("proto"), new C814570VxP("json"))));
        LJ = new C819190WBp(strLIZ, null);
        LJFF = new C819190WBp(strLIZ2, strLIZ3);
    }

    public final byte[] LIZJ() {
        String str = this.LIZIZ;
        if (str == null && this.LIZ == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.LIZ;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return C786410Ut5.j4("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    @Override // X.InterfaceC819220WBs
    public final Set<C814570VxP> LIZ() {
        return LIZLLL;
    }

    public static C819190WBp LIZIZ(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
            if (strArrSplit.length == 2) {
                String str2 = strArrSplit[0];
                if (!str2.isEmpty()) {
                    String str3 = strArrSplit[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C819190WBp(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public C819190WBp(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
