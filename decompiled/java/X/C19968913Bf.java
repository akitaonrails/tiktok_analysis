package X;

import android.util.Base64;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.13Bf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19968913Bf {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<List<byte[]>> LIZLLL;
    public final int LJ;
    public final String LJFF;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FontRequest {mProviderAuthority: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mProviderPackage: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mQuery: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mCertificates:");
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        for (int i = 0; i < this.LIZLLL.size(); i++) {
            sb.append(" [");
            List list = (List) ListProtector.get(this.LIZLLL, i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) ListProtector.get(list, i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("mCertificatesArray: ");
        sbLIZ2.append(this.LJ);
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        return sb.toString();
    }

    public C19968913Bf(String str, int i) {
        this.LIZ = "com.google.android.gms.fonts";
        this.LIZIZ = "com.google.android.gms";
        this.LIZJ = str;
        this.LIZLLL = null;
        if (i != 0) {
            this.LJ = i;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("com.google.android.gms.fonts");
            sbLIZ.append("-");
            sbLIZ.append("com.google.android.gms");
            sbLIZ.append("-");
            sbLIZ.append(str);
            this.LJFF = C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        throw new IllegalArgumentException();
    }

    public C19968913Bf(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.LIZ = str;
        str2.getClass();
        this.LIZIZ = str2;
        this.LIZJ = str3;
        list.getClass();
        this.LIZLLL = list;
        this.LJ = 0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("-");
        sbLIZ.append(str2);
        sbLIZ.append("-");
        sbLIZ.append(str3);
        this.LJFF = C2188811AlT.LIZIZ(sbLIZ);
    }
}
