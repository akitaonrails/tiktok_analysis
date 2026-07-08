package X;

import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.google.gson.h;
import com.google.gson.n;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.07iV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1938107iV {
    public final String LIZ;
    public final String LIZIZ;
    public final C1938107iV LIZJ;
    public final AbstractC1938207iW LIZLLL;
    public final C01GW LJ;

    public final boolean LIZ(SchemaBundle schemaBundle) {
        Matcher matcher;
        Pattern pattern = (Pattern) this.LJ.getValue();
        if (pattern != null && (matcher = pattern.matcher(schemaBundle.getUrl())) != null) {
            return matcher.find();
        }
        return false;
    }

    public C1938107iV(h hVar, int i) {
        n nVarLJIILIIL = hVar.LJJIIJZLJL(i).LJIILIIL();
        String strLJIL = nVarLJIILIIL.LJJIIZ("name").LJIL();
        this.LIZ = strLJIL;
        this.LIZIZ = nVarLJIILIIL.LJJIIZ("match").LJIL();
        this.LIZLLL = C1938607ia.LIZ(nVarLJIILIIL.LJJIIZI("actions"), 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rule ");
        sbLIZ.append(strLJIL);
        sbLIZ.append(" parsed successfully");
        C1530030puz.LIZIZ("SparkSchemaModifierRule", C2188811AlT.LIZIZ(sbLIZ), null);
        this.LIZJ = i < hVar.size() + (-1) ? new C1938107iV(hVar, i + 1) : null;
        this.LJ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 1));
    }
}
