package X;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Igu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473100Igu implements C0IXC {
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public C1ADB LIZJ = C473110Igv.LIZIZ;

    public final long LIZJ() {
        return LIZIZ("start_real", "first_frame");
    }

    public final long LIZLLL() {
        return LIZIZ("start_pull_stream", "first_frame");
    }

    public final void LJ() {
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            for (Map.Entry<String, String> entry : this.LIZIZ.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                LIZIZ("start_real", key);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" <--> ");
                sbLIZ.append(value);
                sbLIZ.append(" - ");
                sbLIZ.append(this.LIZIZ.get(key));
                sbLIZ.append("  ");
                C2188811AlT.LIZIZ(sbLIZ);
            }
            LIZIZ("start_real", "player_first_frame_render_end");
            LIZJ();
        }
    }

    @Override // X.C0IXC
    public final void LIZ(JSONObject jSONObject) {
        if (TextUtils.equals(jSONObject.optString("event_key"), "first_frame")) {
            C0IXC.LIZ.getClass();
            int length = C0IXB.LIZIZ.length;
            for (int i = 0; i < length; i++) {
                C0IXB c0ixb = C0IXC.LIZ;
                c0ixb.getClass();
                long jOptLong = jSONObject.optLong(C0IXB.LIZJ[i], 0L);
                if (jOptLong == 0) {
                    return;
                }
                c0ixb.getClass();
                LJFF(C0IXB.LIZIZ[i], String.valueOf(jOptLong));
            }
        }
    }

    public final long LIZIZ(String str, String str2) {
        String str3 = this.LIZIZ.get(str);
        if (str3 != null) {
            long j = CastLongProtector.parseLong(str3);
            String str4 = this.LIZIZ.get(str2);
            if (str4 != null) {
                long j2 = CastLongProtector.parseLong(str4) - j;
                if (j2 < 0) {
                    return 0L;
                }
                return j2;
            }
            return -1L;
        }
        return -1L;
    }

    public final void LJFF(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !this.LIZIZ.contains(str)) {
            this.LIZIZ.put(str, str2);
        }
    }
}
