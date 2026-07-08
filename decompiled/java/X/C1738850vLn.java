package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1738850vLn {
    public String LIZ;
    public String LIZIZ;
    public Map<String, String> LIZJ = new LinkedHashMap();
    public final String LIZLLL;
    public final String LJ;
    public String LJFF;
    public final String LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BankCardRequest{mMerchantUserId='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", mNonce='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1738850vLn(String str, String str2, String str3) {
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJI = str3;
    }
}
