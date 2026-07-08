package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;

/* JADX INFO: renamed from: X.0lZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363240lZy {
    public boolean LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public List<? extends IMContact> LJ;
    public int LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContactContext(hasMufAuthor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mufAuthorUid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasAggregationContact=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", aggregationCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", preInsertedCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
