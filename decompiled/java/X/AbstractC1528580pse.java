package X;

import com.google.api.client.googleapis.GoogleUtils;

/* JADX INFO: renamed from: X.0pse, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1528580pse<T> extends C199536135i {
    public final C1528560psc LLILLL;

    public AbstractC1528580pse(C136O c136o, Class cls) {
        C1528560psc c1528560psc = new C1528560psc();
        this.LLILLL = c1528560psc;
        c136o.getClass();
        String str = c136o.LIZ;
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" ");
            sbLIZ.append("Google-API-Java-Client");
            sbLIZ.append("/");
            sbLIZ.append(GoogleUtils.LIZ);
            c1528560psc.LJ(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Google-API-Java-Client/");
            sbLIZ2.append(GoogleUtils.LIZ);
            c1528560psc.LJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        c1528560psc.LIZLLL(C2363709Nz.LIZIZ, "X-Goog-Api-Client");
    }

    public AbstractC1528580pse LIZJ(Object obj, String str) {
        super.LIZIZ(obj, str);
        return this;
    }
}
