package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.videoarch.liveplayer.log.LiveLoggerService;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0uIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1698660uIy {
    public final List<C1699020uJY> LIZ = new ArrayList();
    public boolean LIZIZ;
    public final /* synthetic */ LiveLoggerService LIZJ;

    public C1698660uIy(LiveLoggerService liveLoggerService) {
        this.LIZJ = liveLoggerService;
    }

    public final void LIZ(JSONObject jSONObject) {
        C1698490uIh c1698490uIh;
        if (((ArrayList) this.LIZ).isEmpty()) {
            return;
        }
        LiveLoggerService liveLoggerService = this.LIZJ;
        long j = liveLoggerService.LLLZZIL;
        if (j <= 0) {
            j = liveLoggerService.LLLZZ;
        }
        if (j <= 0 && (c1698490uIh = liveLoggerService.LLILLL) != null) {
            j = c1698490uIh.LJIIZILJ;
            if (j <= 0) {
                j = c1698490uIh.LJIJ;
            }
        }
        long jMax = Math.max(j, 0L);
        StringBuilder sb = new StringBuilder(e3.e);
        for (int i = 0; i < ((ArrayList) this.LIZ).size(); i++) {
            C1699020uJY c1699020uJY = (C1699020uJY) ListProtector.get(this.LIZ, i);
            if (i > 0) {
                sb.append(',');
            }
            long jMax2 = Math.max(0L, c1699020uJY.LIZ - jMax);
            long j2 = c1699020uJY.LIZIZ - c1699020uJY.LIZ;
            sb.append(jMax2);
            sb.append(':');
            sb.append(j2);
        }
        if (this.LIZIZ) {
            sb.append(",truncated");
        }
        sb.append(']');
        try {
            jSONObject.put("new_video_render_stall_series", sb.toString());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
