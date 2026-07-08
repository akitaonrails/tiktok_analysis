package X;

import android.net.Uri;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.lynx.spark.schema.parser.api.ICardSchemaParseAPI;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0qK2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545560qK2 {
    public static final C1545560qK2 LIZ = new C1545560qK2();

    public static final void LIZ(Uri uri, Map<String, String> map, SparkSchemaParam sparkSchemaParam) {
        String str = (String) ((ConcurrentHashMap) map).get("container_bgcolor");
        if (str != null) {
            sparkSchemaParam.setContainerBgColor(C1545520qJy.LIZLLL("container_bgcolor", str, map));
        }
        C587540N2q.LIZ.getClass();
        ICardSchemaParseAPI iCardSchemaParseAPI = (ICardSchemaParseAPI) C587540N2q.LIZ(ICardSchemaParseAPI.class);
        if (iCardSchemaParseAPI != null) {
            iCardSchemaParseAPI.parse(uri, map, sparkSchemaParam);
        }
    }
}
