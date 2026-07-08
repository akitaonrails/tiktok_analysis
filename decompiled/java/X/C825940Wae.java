package X;

import com.bytedance.bpea.basics.Cert;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Wae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825940Wae {
    public final Cert LIZ;
    public final String LIZIZ;
    public final String[] LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final Map<String, Object> LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CertContext(cert=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entryToken=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", apiId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", entryDataTypes=");
        String[] strArr = this.LIZJ;
        sbLIZ.append(strArr != null ? Arrays.toString(strArr) : null);
        sbLIZ.append(", entryCategory=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", entryExtraInfo=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Object LIZIZ(String str) {
        return ((LinkedHashMap) this.LJI).get(str);
    }

    public final void LIZ(Object obj, String str) {
        this.LJI.put(str, obj);
    }

    public /* synthetic */ C825940Wae(Cert cert, String str, String[] strArr, Integer num, String str2) {
        this(cert, str, strArr, num, str2, 0);
    }

    public C825940Wae(Cert cert, String str, String[] strArr, Integer num, String str2, int i) {
        this.LIZ = cert;
        this.LIZIZ = str;
        this.LIZJ = strArr;
        this.LIZLLL = num;
        this.LJ = str2;
        this.LJFF = i;
        this.LJI = new LinkedHashMap();
    }
}
