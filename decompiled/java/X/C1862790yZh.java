package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862790yZh {
    public static final /* synthetic */ int LIZIZ = 0;
    public final String LIZ;

    public final Map<String, String> LIZ() {
        String str = this.LIZ;
        if (str == null) {
            return C2097608Jq.LJ();
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("inspiration_session_id", str);
        pairArr[1] = new Pair("bot_type", C123100dR.LIZ(this.LIZ) ? "csi" : "tako");
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public C1862790yZh(String str) {
        this.LIZ = str;
    }
}
