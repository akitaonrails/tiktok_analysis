package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.143c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202026143c {
    public static void LIZIZ(String str, long j, long j2, String str2, boolean z, boolean z2) {
        double d;
        if (j == 0) {
            d = 0.0d;
        } else {
            d = j2 / j;
        }
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("duration", Long.valueOf(j));
        c2241008qG.LIZ.put("downloadStrategy", Integer.valueOf(((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIIJJI()));
        c2241008qG.LIZ.put("speed", Double.valueOf(d));
        c2241008qG.LIZ.put("size", Long.valueOf(j2));
        c2241008qG.LIZ.put("fileUri", "");
        c2241008qG.LIZ.put("fileUrlList", str);
        c2241008qG.LIZ.put("hostname", C142I.LIZJ(""));
        c2241008qG.LIZ.put("is_private", Boolean.valueOf(z));
        c2241008qG.LIZ.put("isUseTTPlayer", Boolean.FALSE);
        c2241008qG.LIZ.put("trace", str2);
        c2241008qG.LIZ.put("isHitCache", Boolean.valueOf(z2));
        JSONObject jSONObjectLJ = c2241008qG.LJ();
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("aweme_music_download_error_rate", 0, jSONObjectLJ);
    }

    public static void LIZ(int i, String str, String str2, String str3, String str4, String str5, long j, String str6, int i2, boolean z, boolean z2) {
        boolean zLIZIZ;
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (zLIZIZ) {
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("hostname", C142I.LIZJ(str5));
            c2241008qG.LIZ.put("trace", str4);
            c2241008qG.LIZ.put("music_id", str2);
            c2241008qG.LIZ.put("fileUrlList", str3);
            c2241008qG.LIZ.put("downloadStrategy", Integer.valueOf(((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIIJJI()));
            c2241008qG.LIZ.put("fileMagic", str6);
            c2241008qG.LIZ.put("code", String.valueOf(i2));
            c2241008qG.LIZ.put("size", Long.valueOf(j));
            c2241008qG.LIZ.put("is_private", Boolean.valueOf(z));
            c2241008qG.LIZ.put("isUseTTPlayer", Boolean.FALSE);
            c2241008qG.LIZ.put("errorDesc", str);
            c2241008qG.LIZ.put("isHitCache", Boolean.valueOf(z2));
            JSONObject jSONObjectLJ = c2241008qG.LJ();
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("aweme_music_download_error_rate", i, jSONObjectLJ);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            C1B9C c1b9c = C612400O0g.LIZ;
            jSONObject.put("netWorkQuality", c1b9c.LIZIZ().toString());
            jSONObject.put("netWorkSpeed", (int) c1b9c.LIZJ());
            jSONObject.put("errorDesc", str);
            jSONObject.put("errorUrl", str5);
            jSONObject.put("is_network_available", zLIZIZ);
            jSONObject.put("isUseTTPlayer", false);
            jSONObject.put("isHitCache", z2);
            C794240VDq.LIZIZ("aweme_music_download_log", "aweme_music", jSONObject);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
