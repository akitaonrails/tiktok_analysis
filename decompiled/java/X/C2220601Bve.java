package X;

import Y.AObjectS89S0101000_34;
import java.util.Collections;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220601Bve extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220601Bve(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "readCompressedFile", "readCompressedFile(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        String str;
        JSONObject jSONObject2 = jSONObject;
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Pair pairLJIILIIL = C2220331BvD.LJIILIIL(Collections.singletonList("filePath"), jSONObject2);
        boolean zBooleanValue = ((Boolean) pairLJIILIIL.getFirst()).booleanValue();
        String str2 = (String) pairLJIILIIL.getSecond();
        if (zBooleanValue && str2 != null) {
            Object objOpt = jSONObject2.opt("compressionAlgorithm");
            if ((objOpt instanceof String) && (str = (String) objOpt) != null) {
                Locale locale = Locale.ROOT;
                if (!Intrinsics.LJFF(str.toLowerCase(locale), "br")) {
                    return c2220331BvD.LJIIJJI(EnumC2221121BwU.INVALID_ARG, iIntValue);
                }
                c2220331BvD.LIZ.LIZ.LJIILJJIL(str2, str.toLowerCase(locale), new AObjectS89S0101000_34(c2220331BvD, iIntValue, 27));
                return C2220181Buy.LJ;
            }
            return c2220331BvD.LJIIIZ(iIntValue, true);
        }
        return c2220331BvD.LJIIIZ(iIntValue, true);
    }
}
