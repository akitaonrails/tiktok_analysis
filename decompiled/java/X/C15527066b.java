package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.066b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15527066b {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, List list, C13BV c13bv, boolean z, long j, Integer num, long j2, int i) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ;
        String str3;
        if ((i & 16) != 0) {
            z = false;
        }
        long j3 = 0;
        if ((i & 32) != 0) {
            j = 0;
        }
        if ((i & 64) != 0) {
            num = 0;
        }
        if ((i & 128) == 0) {
            j3 = j2;
        }
        if ((i & 512) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        } else {
            interfaceC1493505szLIZIZ = null;
        }
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        if (!C894660Z7w.LIZLLL()) {
            c0i0b.LIZJ();
            if (!C894660Z7w.LJ() && System.currentTimeMillis() % ((long) 100) >= 1) {
                return;
            }
        }
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("stage", str);
        pairArr[1] = new Pair("channel", str2);
        pairArr[2] = new Pair("bundle_list", C13LP.LJJLIIIJ(list, null, null, null, 0, null, null, 63));
        pairArr[3] = new Pair("cdn_list", C13LP.LJJLIIIJ(c13bv, null, null, null, 0, null, null, 63));
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[4] = new Pair("is_success", str3);
        pairArr[5] = new Pair("duration", String.valueOf(j));
        pairArr[6] = new Pair("original_error_code", String.valueOf(num));
        pairArr[7] = new Pair("version_code", String.valueOf(j3));
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        interfaceC1493505szLIZIZ.getClass();
        C20684815ws.LJIILLIIL("load_streak_resource", mapLJIIIIZZ);
    }
}
