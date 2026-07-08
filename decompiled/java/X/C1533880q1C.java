package X;

import com.bytedance.forest.Forest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q1C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533880q1C {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3, Throwable th, JSONObject jSONObject) {
        C1534250q1n.LJFF(str, str2, str3, th, true);
        C1535250q3P c1535250q3P = new C1535250q3P(str, str2, str3, null, th, false, jSONObject, 40);
        Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
        if (function2 != null) {
            function2.invoke("UnexpectedForestEvent", c1535250q3P);
        }
        if (Forest.Companion.isDebug()) {
            if (th == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("illegal reach at ");
                sbLIZ.append(str);
                sbLIZ.append('$');
                sbLIZ.append(str2);
                sbLIZ.append(", ");
                sbLIZ.append(str3);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static void LIZJ(String str, String str2, String str3, Throwable th, JSONObject jSONObject) {
        C1534250q1n.LJFF(str, str2, str3, th, true);
        C1535250q3P c1535250q3P = new C1535250q3P(str, str2, str3, null, th, false, jSONObject, 40);
        Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
        if (function2 != null) {
            function2.invoke("UnexpectedForestEvent", c1535250q3P);
        }
    }
}
