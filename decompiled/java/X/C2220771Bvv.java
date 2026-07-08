package X;

import Y.AObjectS89S0101000_34;
import java.util.Collections;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220771Bvv extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220771Bvv(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "saveFile", "saveFile(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        String str;
        JSONObject jSONObject2 = jSONObject;
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Pair pairLJIILIIL = C2220331BvD.LJIILIIL(Collections.singletonList("tempFilePath"), jSONObject2);
        boolean zBooleanValue = ((Boolean) pairLJIILIIL.getFirst()).booleanValue();
        String str2 = (String) pairLJIILIIL.getSecond();
        if (zBooleanValue && str2 != null) {
            if (jSONObject2.has("filePath")) {
                Pair pairLJIILIIL2 = C2220331BvD.LJIILIIL(Collections.singletonList("filePath"), jSONObject2);
                boolean zBooleanValue2 = ((Boolean) pairLJIILIIL2.getFirst()).booleanValue();
                str = (String) pairLJIILIIL2.getSecond();
                if (!zBooleanValue2 || str == null) {
                    return c2220331BvD.LJIIIZ(iIntValue, true);
                }
            } else {
                str = null;
            }
            c2220331BvD.LIZ.LIZ.LJJIJIIJI(str2, str, new AObjectS89S0101000_34(c2220331BvD, iIntValue, 16));
            return C2220181Buy.LJ;
        }
        return c2220331BvD.LJIIIZ(iIntValue, true);
    }
}
