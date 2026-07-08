package X;

import com.google.gson.k;
import java.util.Arrays;

/* JADX INFO: renamed from: X.09ES, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C09ES {
    public String[] LIZ;
    public String LIZIZ;
    public String LIZJ;
    public k LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConfItem{stackFeatures=");
        sbLIZ.append(Arrays.toString(this.LIZ));
        sbLIZ.append(", protectorType='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", returnType='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", returnValue='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
