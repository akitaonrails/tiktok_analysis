package X;

import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0dUR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1052290dUR {
    public static final Map<String, SparkThirdContext> LIZ = new LinkedHashMap();

    public static SparkThirdContext LIZ(String str) {
        Map<String, SparkThirdContext> map = LIZ;
        if (str == null) {
            str = "";
        }
        return (SparkThirdContext) ((LinkedHashMap) map).get(str);
    }
}
