package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0s1V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610950s1V {
    public static final C1610950s1V LIZ = new C1610950s1V();

    public static void LIZ(boolean z, int i, long j, EnumC1576090r7H enumC1576090r7H, boolean z2, boolean z3, double d, int i2) {
        String str;
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("success", String.valueOf(z ? 1 : 0));
        pairArr[1] = new Pair("error_code", String.valueOf(i));
        pairArr[2] = new Pair("cost", String.valueOf(j));
        pairArr[3] = new Pair("intent_type", enumC1576090r7H.getTrackingName());
        pairArr[4] = new Pair("feed_open", String.valueOf(z2 ? 1 : 0));
        if (z3) {
            str = "group";
        } else {
            str = "private";
        }
        pairArr[5] = new Pair("chat_type", str);
        pairArr[6] = new Pair("score", String.valueOf(d));
        pairArr[7] = new Pair("model_result", String.valueOf(i2));
        C20684815ws.LJIILLIIL("shared_feed_guide_client_ai_task_result", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
