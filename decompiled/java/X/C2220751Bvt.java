package X;

import Y.AObjectS89S0101000_34;
import java.util.Collections;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bvt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220751Bvt extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220751Bvt(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "truncate", "truncate(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        final long jLongValue;
        JSONObject jSONObject2 = jSONObject;
        final int iIntValue = num.intValue();
        final C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Pair pairLJIILIIL = C2220331BvD.LJIILIIL(Collections.singletonList("filePath"), jSONObject2);
        boolean zBooleanValue = ((Boolean) pairLJIILIIL.getFirst()).booleanValue();
        final String str = (String) pairLJIILIIL.getSecond();
        if (zBooleanValue && str != null) {
            Pair pairLJJII = C2220331BvD.LJJII(jSONObject2);
            boolean zBooleanValue2 = ((Boolean) pairLJJII.getFirst()).booleanValue();
            Long l = (Long) pairLJJII.getSecond();
            if (zBooleanValue2 && l == null) {
                return c2220331BvD.LJIIIZ(iIntValue, true);
            }
            if (l != null) {
                jLongValue = l.longValue();
                if (jLongValue < 0) {
                    jLongValue = 0;
                }
            } else {
                jLongValue = 0;
            }
            c2220331BvD.LIZ.LIZ.LJJIJIIJIL(str, new Function1() { // from class: X.1BwM
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    C2220331BvD c2220331BvD2 = c2220331BvD;
                    int i = iIntValue;
                    String str2 = str;
                    long j = jLongValue;
                    C2220221Bv2 c2220221Bv2 = (C2220221Bv2) obj;
                    if (!c2220221Bv2.LIZIZ.LIZ) {
                        c2220331BvD2.LIZ.LIZIZ.LJJLIIJ(Integer.valueOf(i), c2220221Bv2.LIZ());
                        return Unit.LIZ;
                    }
                    c2220331BvD2.LIZ.LIZ.LJJI(j, str2, new AObjectS89S0101000_34(c2220331BvD2, i, 8));
                    return Unit.LIZ;
                }
            });
            return C2220181Buy.LJ;
        }
        return c2220331BvD.LJIIIZ(iIntValue, true);
    }
}
