package X;

import Y.AObjectS320S0200000_34;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bvd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220591Bvd extends C2217421BqW implements InterfaceC1631620sYq<JSONObject, Map<String, ? extends byte[]>, Integer, C2220181Buy> {
    public C2220591Bvd(C2220331BvD c2220331BvD) {
        super(3, c2220331BvD, C2220331BvD.class, "readCompressedFileBuffer", "readCompressedFileBuffer(Lorg/json/JSONObject;Ljava/util/Map;Ljava/lang/Integer;)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final C2220181Buy invoke(JSONObject jSONObject, Map<String, ? extends byte[]> map, Integer num) {
        String str;
        JSONObject jSONObject2 = jSONObject;
        Integer num2 = num;
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        if (jSONObject2 != null && num2 != null) {
            Pair pairLJIILIIL = C2220331BvD.LJIILIIL(Collections.singletonList("filePath"), jSONObject2);
            boolean zBooleanValue = ((Boolean) pairLJIILIIL.getFirst()).booleanValue();
            String str2 = (String) pairLJIILIIL.getSecond();
            if (zBooleanValue && str2 != null) {
                Object objOpt = jSONObject2.opt("compressionAlgorithm");
                if ((objOpt instanceof String) && (str = (String) objOpt) != null) {
                    Locale locale = Locale.ROOT;
                    if (!Intrinsics.LJFF(str.toLowerCase(locale), "br")) {
                        return c2220331BvD.LJIIJJI(EnumC2221121BwU.INVALID_ARG, num2.intValue());
                    }
                    c2220331BvD.LIZ.LIZ.LJIILJJIL(str2, str.toLowerCase(locale), new AObjectS320S0200000_34(c2220331BvD, num2, 3));
                    return C2220181Buy.LJ;
                }
                return c2220331BvD.LJIIIZ(num2.intValue(), true);
            }
            return c2220331BvD.LJIIIZ(num2.intValue(), true);
        }
        return C2220181Buy.LIZLLL;
    }
}
