package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;

/* JADX INFO: renamed from: X.0hC1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194630hC1 {
    public static final C1194630hC1 LIZ = new C1194630hC1();

    public static void LIZ(Context context, String str, String str2, String str3, String str4) {
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ("aweme://roma_redirect/?spark_page=poi_submission");
        sparkContext.LJJJZ("page_type", "create");
        sparkContext.LJJJZ("enter_from", "poi_post_page_create");
        sparkContext.LJJJZ("search_name", str);
        sparkContext.LJJJZ("lat", str2);
        sparkContext.LJJJZ("lng", str3);
        sparkContext.LJJJZ("creation_id", str4);
        sparkContext.LJJJZ("source", "search");
        sparkContext.LJJJLZIJ(1, "roma_enable_with_param");
        C1541950qED.LIZJ.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }
}
