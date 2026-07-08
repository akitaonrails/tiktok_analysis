package X;

import com.bytedance.hybrid.spark.SparkContext;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0lBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348230lBl extends AbstractC1538690q8x {
    @Override // X.AbstractC1538690q8x
    public final String LJI() {
        return "comment_link_product";
    }

    @Override // X.AbstractC1538690q8x
    public final void LJ(SparkContext sparkContext, String str) {
        super.LJ(sparkContext, str);
        ((ArrayList) C1348210lBj.LIZ).add(sparkContext.containerId);
    }
}
