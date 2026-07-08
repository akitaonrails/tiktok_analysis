package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import java.util.List;

/* JADX INFO: renamed from: X.0n9Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423660n9Q {
    public final EnumC1423670n9R LIZ;
    public final List<TemplateCategoryData> LIZIZ;
    public final C1423470n97 LIZJ;
    public final C1422880n8A LIZLLL;
    public final boolean LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchCategoriesResult(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", categoryList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extraData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", updated=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1423660n9Q(EnumC1423670n9R enumC1423670n9R, List<TemplateCategoryData> list, C1423470n97 c1423470n97, C1422880n8A c1422880n8A, boolean z) {
        this.LIZ = enumC1423670n9R;
        this.LIZIZ = list;
        this.LIZJ = c1423470n97;
        this.LIZLLL = c1422880n8A;
        this.LJ = z;
    }
}
