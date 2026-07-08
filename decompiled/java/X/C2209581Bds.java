package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209581Bds implements InterfaceC800590Var {
    public final /* synthetic */ C2209571Bdr LIZ;

    @Override // X.InterfaceC800590Var
    public final Object LIZ() {
        String strLIZIZ;
        String strLIZIZ2;
        String strLIZIZ3;
        if (this.LIZ.LJ.getLong("app_log_last_config_time", 0L) <= 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("appId", this.LIZ.LJIILIIL.LJIIIZ);
            long j = this.LIZ.LJ.getLong("session_interval", 0L);
            String strLIZIZ4 = "--";
            if (j > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(j);
                sbLIZ.append("ms");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = "--";
            }
            jSONObject2.put("BgSession Interval", strLIZIZ);
            long j2 = this.LIZ.LJ.getLong("batch_event_interval", 0L);
            if (j2 > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(j2);
                sbLIZ2.append("ms");
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                strLIZIZ2 = "--";
            }
            jSONObject2.put("Batch Interval", strLIZIZ2);
            long j3 = this.LIZ.LJ.getLong("abtest_fetch_interval", 0L);
            if (j3 > 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(j3);
                sbLIZ3.append("ms");
                strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            } else {
                strLIZIZ3 = "--";
            }
            jSONObject2.put("ABTest Interval", strLIZIZ3);
            jSONObject2.put("BAV", this.LIZ.LJ.getBoolean("bav_log_collect", false));
            jSONObject2.put("ABTest", this.LIZ.LJ.getBoolean("bav_ab_config", false));
            jSONObject2.put("Realtime Events", this.LIZ.LJ.getString("real_time_events", "[]"));
            jSONObject2.put("Disable Detail", this.LIZ.LJ.getBoolean("forbid_report_phone_detail_info", false));
            long j4 = this.LIZ.LJ.getLong("fetch_interval", 0L);
            if (j4 > 0) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(j4);
                sbLIZ4.append("ms");
                strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
            }
            jSONObject2.put("Server Interval", strLIZIZ4);
            int i = this.LIZ.LJ.getInt("content_encode_method", 0);
            jSONObject2.put("Compress Type", i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "ZSTD+DICT" : "ZSTD" : "GZIP");
            jSONObject2.put("Log Back", this.LIZ.LJ.getString("log_back", ""));
            jSONObject2.put("Pack Size Limited", this.LIZ.LJ.getLong("max_pack_size", 0L) > 0);
            jSONObject2.put("Max Pack Size", this.LIZ.LJ.getLong("max_pack_size", 0L));
            jSONObject2.put("Ignore Priority", this.LIZ.LJ.getBoolean("ignore_event_priority", false));
            jSONObject.put("config", jSONObject2);
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return jSONObject;
        }
    }

    public C2209581Bds(C2209571Bdr c2209571Bdr) {
        this.LIZ = c2209571Bdr;
    }
}
