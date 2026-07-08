package X;

import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.03kY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C931603kY {
    public final JSONArray LIZ;
    public final String LIZIZ;
    public final JSONArray LIZJ;
    public List<Integer> LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{mCvvLength=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mCvvLengthList=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", mCardBrandRegex='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mCardBrandLength=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mCardBrandLengthList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mCardBrandDisplayName='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mCardBrand='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", mPaymentMethodId='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append(", mIconUrl='");
        sbLIZ.append(this.LJII);
        sbLIZ.append('\'');
        sbLIZ.append(", mDarkIconUrl='");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C931603kY(C931503kX c931503kX, C931103kT c931103kT) {
        this.LIZ = c931503kX.LIZIZ;
        this.LIZIZ = c931503kX.LIZJ;
        this.LIZJ = c931503kX.LIZLLL;
        this.LJ = c931503kX.LJ;
        this.LJFF = c931503kX.LJFF;
        this.LJI = c931103kT.LIZ;
        this.LJII = c931103kT.LIZJ;
        this.LJIIIIZZ = c931103kT.LIZLLL;
    }
}
