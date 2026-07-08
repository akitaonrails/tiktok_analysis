package X;

import com.ss.android.ugc.aweme.net.control.DispatchConfig;
import java.util.Collections;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0CEu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310420CEu {
    public static final C310420CEu LIZ = new C310420CEu();
    public static final DispatchConfig LIZIZ;
    public static final DispatchConfig LIZJ;
    public static final C01GW LIZLLL;

    static {
        EnumC2262571Dh9 enumC2262571Dh9 = EnumC2262571Dh9.BIZ_STARTUP;
        LIZIZ = new DispatchConfig(enumC2262571Dh9.getValue(), 0, null, null, Collections.singleton("/aweme/v2/feed/"), 5000, 0, null, null, null, null, null, null, 8142, null);
        LIZJ = new DispatchConfig(enumC2262571Dh9.getValue(), 0, null, null, null, 0, 0, null, null, null, C2097608Jq.LJIIIIZZ(new Pair("/vc/setting", 65536), new Pair("/tiktok/popup/dispatch/v1", 65536), new Pair("/tiktok/v1/ultimate/cmpl/settings/", 65536), new Pair("/common", 65536), new Pair("/tfe/api/request_combine/v1/", 65536)), C13LQ.LJLIIL(new String[]{"libra-sg.tiktokv.com", "libra-va.tiktokv.com", "oec-api.tiktokv.com", "webcast.tiktokv.com", "webcast-va.tiktokv.com", "search.tiktokv.com"}), null, 5118, null);
        LIZLLL = C452501pT.LIZIZ(new C310330CEl());
    }
}
