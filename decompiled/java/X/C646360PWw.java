package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;

/* JADX INFO: renamed from: X.0PWw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646360PWw {
    public static C648330Pbr LIZ(int i, long j, Context context) {
        SparkContext sparkContext;
        C1538200q8A c1538200q8A;
        C648330Pbr c648330Pbr = new C648330Pbr(context, i);
        if (i == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sparkView = c648330Pbr.getSparkView();
            if (sparkView != null && (sparkContext = sparkView.getSparkContext()) != null && (c1538200q8A = (C1538200q8A) sparkContext.LJFF(C1538200q8A.class)) != null) {
                c1538200q8A.LJIILLIIL.put("createRVViewStart", Long.valueOf(j));
                c1538200q8A.LJIILLIIL.put("searchSparkCreateEnd", Long.valueOf(jCurrentTimeMillis));
            }
        }
        return c648330Pbr;
    }
}
