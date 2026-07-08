package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Ivi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482280Ivi {
    public static final C482280Ivi LIZ = new C482280Ivi();
    public static final C482290Ivj LIZIZ = new C482290Ivj();
    public static final C482270Ivh LIZJ = new C482270Ivh();

    public static void LIZ(int i) {
        String str;
        C482290Ivj c482290Ivj = LIZIZ;
        boolean z = true;
        if (c482290Ivj.LIZJ > 0) {
            Pair[] pairArr = new Pair[5];
            long jCurrentTimeMillis = System.currentTimeMillis() - c482290Ivj.LIZJ;
            if (jCurrentTimeMillis < 0) {
                jCurrentTimeMillis = 0;
            }
            pairArr[0] = new Pair("duration", String.valueOf(jCurrentTimeMillis));
            pairArr[1] = new Pair("item_ids", C13LP.LJJLIIIJ(c482290Ivj.LIZ, ",", null, null, 0, null, null, 62));
            pairArr[2] = new Pair("leaves_count", String.valueOf(i));
            pairArr[3] = new Pair(Scene.SCENE_SERVICE, c482290Ivj.LIZIZ);
            if (((Boolean) C275080AqI.LIZ.getValue()).booleanValue()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[4] = new Pair("async_you_may_like", str);
            C20684815ws.LJIILLIIL("livesdk_toplive_api_status", C2097608Jq.LJIIIIZZ(pairArr));
            c482290Ivj.LIZJ = 0L;
            ((ArrayList) c482290Ivj.LIZ).clear();
            c482290Ivj.LIZIZ = "";
        }
        C482270Ivh c482270Ivh = LIZJ;
        if (c482270Ivh.LIZLLL <= 0) {
            c482270Ivh.LIZLLL = System.currentTimeMillis();
            if (i >= 0) {
                z = false;
            }
            c482270Ivh.LJFF = z;
        }
    }
}
