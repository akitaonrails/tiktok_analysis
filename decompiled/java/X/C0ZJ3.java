package X;

import com.ss.android.common.util.NetworkUtils;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ZJ3, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZJ3 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        long serverTimeMills = NetworkUtils.getServerTimeMills();
        new C1061730djf();
        C1548820qPI.LIZIZ(new C397901gf(serverTimeMills, C1061730djf.LIZLLL(C2097608Jq.LJIIJ(new Pair("shareChannel", str))), "SendShareChannelEvent"));
    }
}
