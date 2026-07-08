package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08oV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2230108oV {
    public static final ConcurrentHashMap<String, C2230008oU> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(int i, String str, String str2) {
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("message_id", str), new Pair("phase", str2), new Pair("hit", String.valueOf(i)));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("im_voice_message_preload_hit", mapLJIIIIZZ);
    }
}
