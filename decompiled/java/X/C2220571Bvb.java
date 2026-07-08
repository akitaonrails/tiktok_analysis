package X;

import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bvb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220571Bvb extends C2217421BqW implements InterfaceC1631620sYq<JSONObject, Map<String, ? extends byte[]>, Integer, C2220181Buy> {
    public C2220571Bvb(C2220331BvD c2220331BvD) {
        super(3, c2220331BvD, C2220331BvD.class, "readCompressedFileBufferSync", "readCompressedFileBufferSync(Lorg/json/JSONObject;Ljava/util/Map;Ljava/lang/Integer;)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final C2220181Buy invoke(JSONObject jSONObject, Map<String, ? extends byte[]> map, Integer num) {
        String str;
        JSONObject jSONObject2 = jSONObject;
        Integer num2 = num;
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        if (jSONObject2 == null) {
            return C2220181Buy.LIZLLL;
        }
        Pair pairLJIILIIL = C2220331BvD.LJIILIIL(Collections.singletonList("filePath"), jSONObject2);
        boolean zBooleanValue = ((Boolean) pairLJIILIIL.getFirst()).booleanValue();
        String str2 = (String) pairLJIILIIL.getSecond();
        int iIntValue = -1;
        if (zBooleanValue && str2 != null) {
            Object objOpt = jSONObject2.opt("compressionAlgorithm");
            if ((objOpt instanceof String) && (str = (String) objOpt) != null) {
                Locale locale = Locale.ROOT;
                if (!Intrinsics.LJFF(str.toLowerCase(locale), "br")) {
                    return C2220331BvD.LJIIL(EnumC2221121BwU.INVALID_ARG);
                }
                return c2220331BvD.LIZ.LIZ.LJJLIIIJILLIZJL(str2, str.toLowerCase(locale)).LIZIZ();
            }
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
            return c2220331BvD.LJIIIZ(iIntValue, false);
        }
        if (num2 != null) {
            iIntValue = num2.intValue();
        }
        return c2220331BvD.LJIIIZ(iIntValue, false);
    }
}
