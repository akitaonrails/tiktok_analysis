package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220501BvU extends C2217421BqW implements InterfaceC1631620sYq<JSONObject, Map<String, ? extends byte[]>, Integer, C2220181Buy> {
    public C2220501BvU(C2220331BvD c2220331BvD) {
        super(3, c2220331BvD, C2220331BvD.class, "writeFileBufferSync", "writeFileBufferSync(Lorg/json/JSONObject;Ljava/util/Map;Ljava/lang/Integer;)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final C2220181Buy invoke(JSONObject jSONObject, Map<String, ? extends byte[]> map, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        Map<String, ? extends byte[]> map2 = map;
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        if (jSONObject2 == null) {
            return C2220181Buy.LIZLLL;
        }
        Pair pairLJIILL = C2220331BvD.LJIILL(c2220331BvD, jSONObject2);
        boolean zBooleanValue = ((Boolean) pairLJIILL.getFirst()).booleanValue();
        String str = (String) pairLJIILL.getSecond();
        if (!zBooleanValue) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "invalid path").LIZ();
        }
        if (u.LJIIZILJ(a0.LJLIIIL(str).toString(), "/", false)) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.IS_DIR, "is a directory").LIZ();
        }
        byte[] bArr = map2.get("data");
        if (bArr == null) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "missing buffer data").LIZ();
        }
        if (bArr.length == 0) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.DATA_EMPTY, "empty data").LIZ();
        }
        return c2220331BvD.LIZ.LIZ.LJIIL(str, bArr, jSONObject2.optBoolean("append", false)).LIZ();
    }
}
