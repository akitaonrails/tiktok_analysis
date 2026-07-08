package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0ZKR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZKR {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(425));

    public static boolean LIZ() {
        C01GW c01gw = C269880Ahu.LIZ;
        return ((Number) c01gw.getValue()).intValue() > 0 && ThreadLocalRandom.current().nextDouble() < ((double) ((Number) c01gw.getValue()).intValue()) / 10000.0d;
    }

    public static void LIZIZ(long j, String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6;
        if (((Number) C269880Ahu.LIZ.getValue()).intValue() > 0) {
            C01GW c01gw = LIZ;
            if (((C823170WQx) c01gw.getValue()).contains(str)) {
                return;
            }
            ((C823170WQx) c01gw.getValue()).add(str);
            C0I0B.LJFF.LIZIZ();
            Pair[] pairArr = new Pair[6];
            pairArr[0] = new Pair("duration", String.valueOf(j));
            if (z) {
                str6 = "1";
            } else {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[1] = new Pair("has_cache", str6);
            pairArr[2] = new Pair(Scene.SCENE_SERVICE, str2);
            pairArr[3] = new Pair("type", str3);
            pairArr[4] = new Pair("method", str4);
            pairArr[5] = new Pair("result", str5);
            C20684815ws.LJIILLIIL("dm_avatar_loader_time_consumption", C2097608Jq.LJIIIIZZ(pairArr));
        }
    }
}
