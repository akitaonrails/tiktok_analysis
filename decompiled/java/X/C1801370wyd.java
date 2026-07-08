package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801370wyd {
    public final Function0<SparkContext> LIZ;

    public C1801370wyd(AwS576S0100000_32 awS576S0100000_32) {
        this.LIZ = awS576S0100000_32;
    }

    public final void LIZ(String str) {
        SparkContext sparkContextInvoke = this.LIZ.invoke();
        if (sparkContextInvoke == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", str);
        jSONObject.put("timestamp", System.currentTimeMillis());
        sparkContextInvoke.LJJIIJZLJL(jSONObject, "shopping_task_lifecycle");
    }
}
