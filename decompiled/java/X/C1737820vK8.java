package X;

import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0vK8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1737820vK8 {
    public final boolean LIZ;
    public int LIZIZ;
    public String LIZJ;
    public List<C1737770vK3> LIZLLL;
    public String LJ;
    public final List<C1737880vKE> LJFF;
    public String LJI;
    public UploadAuthKeyConfig LJII;
    public final C1738160vKg LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AmeEffectPreUploadData(effectId='");
        sbLIZ.append(this.LJ);
        sbLIZ.append("', uploadIconKey='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append("', uploadEffectKey='");
        sbLIZ.append(this.LJI);
        sbLIZ.append("',zipEffectPath='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("', cropIconPath='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("',  authKeyConfig not null=");
        sbLIZ.append(this.LJII != null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1737820vK8(int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C1738160vKg c1738160vKg = new C1738160vKg(0);
        this.LIZ = false;
        this.LIZIZ = 0;
        this.LIZJ = "";
        this.LIZLLL = arrayList;
        this.LJ = "";
        this.LJFF = arrayList2;
        this.LJI = "";
        this.LJII = null;
        this.LJIIIIZZ = c1738160vKg;
    }
}
