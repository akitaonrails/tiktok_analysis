package X;

import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;

/* JADX INFO: renamed from: X.0q8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1538690q8x extends AbstractC1538680q8w {
    public static final /* synthetic */ int LIZ = 0;

    @Override // X.AbstractC1538680q8w
    public final void LIZ(SparkContext sparkContext) {
    }

    @Override // X.AbstractC1538680q8w
    public final boolean LIZJ(Uri uri) {
        return false;
    }

    @Override // X.AbstractC1538680q8w
    public final boolean LIZLLL(String str) {
        return false;
    }

    public String LJI() {
        return "default";
    }

    public void LJ(SparkContext sparkContext, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("find custom SparkPlugin{");
        sbLIZ.append(LJI());
        sbLIZ.append('}');
        C1530030puz.LIZIZ("SparkPlugin", C2188811AlT.LIZIZ(sbLIZ), sparkContext);
    }

    public void LJFF(SparkContext sparkContext, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("find custom SparkPlugin For Third Party {");
        sbLIZ.append(LJI());
        sbLIZ.append('}');
        C1530030puz.LIZIZ("SparkPlugin", C2188811AlT.LIZIZ(sbLIZ), sparkContext);
    }
}
