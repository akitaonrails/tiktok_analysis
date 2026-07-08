package X;

import com.bytedance.hybrid.spark.SparkContext;

/* JADX INFO: renamed from: X.0dsf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067310dsf extends AbstractC1538690q8x {
    public final String LIZIZ;

    @Override // X.AbstractC1538690q8x
    public final String LJI() {
        return "spark_plugin_game_station";
    }

    public C1067310dsf(String str) {
        this.LIZIZ = str;
    }

    @Override // X.AbstractC1538690q8x
    public final void LJ(SparkContext sparkContext, String str) {
        super.LJ(sparkContext, str);
        sparkContext.LJJJJZ(new C1077530e99(this, 2));
    }
}
