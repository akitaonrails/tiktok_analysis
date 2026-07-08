package X;

import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ooZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487610ooZ {
    public static final void LIZIZ(long j, String str, String str2, String str3) {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("duration", Long.valueOf(j));
        c2241008qG.LIZ.put("fileUri", str2);
        c2241008qG.LIZ.put("fileUrlList", str);
        c2241008qG.LIZ.put("isUseTTPlayer", Boolean.FALSE);
        c2241008qG.LIZ.put("trace", str3);
        JSONObject jSONObjectLJ = c2241008qG.LJ();
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("aweme_music_play_error_rate", 0, jSONObjectLJ);
    }

    public static final void LIZ(int i, String str, String str2, long j, String str3, String str4) {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("duration", Long.valueOf(j));
        c2241008qG.LIZ.put("fileUri", str2);
        c2241008qG.LIZ.put("fileUrlList", str);
        c2241008qG.LIZ.put("errorDesc", str3);
        c2241008qG.LIZ.put("isUseTTPlayer", Boolean.FALSE);
        c2241008qG.LIZ.put("trace", str4);
        JSONObject jSONObjectLJ = c2241008qG.LJ();
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("aweme_music_play_error_rate", i, jSONObjectLJ);
    }
}
