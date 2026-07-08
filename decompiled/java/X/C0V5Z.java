package X;

import Y.ARunnableS83S0000000_3;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.apm.doctor.DoctorManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V5Z, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V5Z implements InterfaceC788120Uvq {
    public volatile boolean LL;
    public volatile boolean LLILLJJLI;
    public volatile JSONObject LLILLL;
    public volatile JSONObject LLILZ;
    public volatile JSONObject LLILZIL;
    public volatile SharedPreferences LLIZLLLIL;
    public InterfaceC792020V5c LLJ;
    public JSONObject LLJI;
    public boolean LLJIJIL;
    public volatile boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public volatile long LLJJIJI;
    public volatile long LLJJIJIIJIL;
    public List<InterfaceC792030V5d> LLJJIJIL;
    public List<String> LLILZLL = C0V51.LIZ;
    public volatile long LLIZ = 1200;
    public long LLJILJIL = -1;
    public long LLJILJILJ = 60000;
    public long LLJILLL = -1;

    public final void LJ() {
        if (this.LL) {
            return;
        }
        this.LL = true;
        List<InterfaceC792030V5d> list = this.LLJJIJIL;
        if (list != null) {
            Iterator it2 = ((CopyOnWriteArrayList) list).iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC792030V5d) it2.next()).LIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Context context = C792400V6o.LIZ;
                    C1AF0.LJ(th);
                }
            }
        }
    }

    public final String LJI() {
        if (this.LLIZLLLIL == null) {
            synchronized (this) {
                try {
                    if (this.LLIZLLLIL == null) {
                        this.LLIZLLLIL = C092U.LIZIZ(C792400V6o.LIZ, "monitor_config");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        String string = this.LLIZLLLIL.getString("monitor_net_config", "");
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SlardarConfigFetcher.queryFromLocal: ");
            sbLIZ.append(string);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return string;
    }

    public final JSONObject LJIIIIZZ() {
        Map<String, String> queryParams;
        InterfaceC792020V5c interfaceC792020V5c = this.LLJ;
        HashMap map = (interfaceC792020V5c == null || interfaceC792020V5c.getQueryParams() == null || (queryParams = this.LLJ.getQueryParams()) == null) ? new HashMap() : new HashMap(queryParams);
        map.put("last_calculate_timestamp", String.valueOf(this.LLJJIJI / 1000));
        map.put("last_full_calculate_timestamp", String.valueOf(this.LLJJIJIIJIL / 1000));
        if (System.currentTimeMillis() - this.LLJJIJI >= 345600000) {
            map.put("force_refresh", String.valueOf(1));
        }
        map.put("minor_version", "1");
        return new JSONObject(map);
    }

    public final boolean LJIIJ() {
        String strLJI = LJI();
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("configStr:");
            sbLIZ.append(strLJI);
            C792910V8n.LIZ("SlardarConfigFetcher", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SlardarConfigFetcher.updateFromLocal, configStr=");
            sbLIZ2.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        boolean z = true;
        if (!TextUtils.isEmpty(strLJI)) {
            try {
                JSONObject jSONObject = new JSONObject(strLJI);
                this.LLJIJIL = true;
                int i = this.LLIZLLLIL.getInt("setting_version", 0);
                if (C792400V6o.LJIIIIZZ()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("SlardarConfigFetcher.updateFromLocal, settingVersion=");
                    sbLIZ3.append(i);
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
                if (i == 5) {
                    this.LLJILJIL = this.LLIZLLLIL.getLong("monitor_configure_refresh_time", 0L);
                    this.LLJJIJI = this.LLIZLLLIL.getLong("monitor_last_calculate_timestamp_v5", 0L);
                    this.LLJJIJIIJIL = this.LLIZLLLIL.getLong("monitor_last_full_calculate_timestamp_v5", 0L);
                    if (C792400V6o.LJIIIIZZ()) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("lastCalculateTimestamp:");
                        sbLIZ4.append(this.LLJJIJI);
                        C792910V8n.LIZ("SlardarConfigFetcher", C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(this.LLJILJIL);
                    sbLIZ5.append("");
                    C792400V6o.LIZ("config_time", C2188811AlT.LIZIZ(sbLIZ5));
                    C792420V6q.LJIILL = this.LLJILJIL;
                    LJIIIZ(jSONObject);
                    LJFF(jSONObject, true);
                    LJ();
                    z = false;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("SlardarConfigFetcher.updateFromLocal, isForceRefreshFromNet=");
            sbLIZ6.append(z);
            C2188811AlT.LIZIZ(sbLIZ6);
            DoctorManager doctorManager = DoctorManager.getInstance();
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("needForceRefreshFromNet:");
            sbLIZ7.append(z);
            sbLIZ7.append(" localConfig:");
            sbLIZ7.append(strLJI);
            doctorManager.LIZIZ("APM_SETTING_UPDATE_FROM_LOCAL", C2188811AlT.LIZIZ(sbLIZ7));
        }
        return z;
    }

    @Override // X.InterfaceC788120Uvq
    public final void LIZIZ(long j) {
        LJII(false);
    }

    public final boolean LIZJ(C2403609bO c2403609bO) {
        Object objValueOf;
        if (c2403609bO != null && c2403609bO.LIZ == 200) {
            byte[] bArr = c2403609bO.LIZJ;
            if (bArr == null) {
                return false;
            }
            JSONObject jSONObject = new JSONObject(new String(bArr));
            if (C792400V6o.LJIIIIZZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resultJSON:");
                sbLIZ.append(jSONObject);
                C792910V8n.LIZ("SlardarConfigFetcher", C2188811AlT.LIZIZ(sbLIZ));
                DoctorManager.getInstance().LIZIZ("APM_SETTING_UPDATE_FROM_NET_RESULT", C786410Ut5.J3(jSONObject));
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C792400V6o.LJFF.optString("aid"));
            if (jSONObjectOptJSONObject == null) {
                return false;
            }
            return LJIIJJI(jSONObjectOptJSONObject);
        }
        if (C792400V6o.LJIIIIZZ()) {
            DoctorManager doctorManager = DoctorManager.getInstance();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("statusCode error:");
            if (c2403609bO == null) {
                objValueOf = "null";
            } else {
                objValueOf = Integer.valueOf(c2403609bO.LIZ);
            }
            sbLIZ2.append(objValueOf);
            doctorManager.LIZIZ("APM_SETTING_UPDATE_FROM_NET_ERROR", C2188811AlT.LIZIZ(sbLIZ2));
        }
        return false;
    }

    public final boolean LIZLLL(long j) {
        long j2 = this.LLJILJILJ;
        if (j2 > 60000) {
            if (j - this.LLJILLL > j2) {
                return true;
            }
            return false;
        }
        if (j - this.LLJILJIL > this.LLIZ * 1000) {
            return true;
        }
        return false;
    }

    public final void LJII(boolean z) {
        boolean z2;
        boolean zLIZJ = false;
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SlardarConfigFetcher.queryFromNet.");
            if (!this.LLJJIII && !this.LLJJI) {
                z2 = false;
            } else {
                z2 = true;
            }
            sbLIZ.append(z2);
            sbLIZ.append(" ");
            sbLIZ.append(LIZLLL(System.currentTimeMillis()));
            C2188811AlT.LIZIZ(sbLIZ);
            DoctorManager doctorManager = DoctorManager.getInstance();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("queryFromNet:");
            sbLIZ2.append(z);
            doctorManager.LIZIZ("APM_SETTING_UPDATE_FROM_NET", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (this.LLJJIII || this.LLJJI) {
            if (z || LIZLLL(System.currentTimeMillis())) {
                if (!C786970Utz.LIZ(C792400V6o.LIZ)) {
                    if (C792400V6o.LJIIIIZZ()) {
                        DoctorManager.getInstance().LIZIZ("APM_SETTING_UPDATE_FROM_NET_ERROR", "network not available");
                        return;
                    }
                    return;
                }
                InterfaceC792020V5c interfaceC792020V5c = this.LLJ;
                if (interfaceC792020V5c != null && interfaceC792020V5c.getQueryParams() != null && !this.LLJ.getQueryParams().isEmpty()) {
                    if (this.LLJJIJI == 0) {
                        this.LLJJIJI = this.LLIZLLLIL.getLong("monitor_last_calculate_timestamp_v5", 0L);
                    }
                    if (this.LLJJIJIIJIL == 0) {
                        this.LLJJIJIIJIL = this.LLIZLLLIL.getLong("monitor_last_full_calculate_timestamp_v5", 0L);
                    }
                    this.LLJILLL = System.currentTimeMillis();
                    Iterator<String> it2 = this.LLILZLL.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            String next = it2.next();
                            try {
                                JSONObject jSONObjectLJIIIIZZ = LJIIIIZZ();
                                String strOptString = C792400V6o.LJFF.optString("aid");
                                HashMap map = new HashMap();
                                map.put("Content-Type", "application/json; charset=utf-8");
                                JSONObject jSONObject = new JSONObject();
                                if (!TextUtils.isEmpty(strOptString) && !strOptString.equals(CardStruct.IStatusCode.DEFAULT)) {
                                    jSONObject.put(strOptString, jSONObjectLJIIIIZZ);
                                }
                                byte[] bArrLIZ = LIZ(C786410Ut5.J3(jSONObject).getBytes(), map);
                                C792010V5b c792010V5b = new C792010V5b(next, map, bArrLIZ);
                                HashMap map2 = new HashMap();
                                map2.put("aid", strOptString);
                                String strLIZ = C015N.LIZ(c792010V5b.LIZ, map2);
                                c792010V5b.LIZ = strLIZ;
                                C2403609bO c2403609bODoPost = C792400V6o.LJIIIIZZ.doPost(strLIZ, bArrLIZ, map);
                                if (C792400V6o.LJIIIIZZ()) {
                                    DoctorManager.getInstance().LIZIZ("APM_SETTING_UPDATE_FROM_NET_REQUEST", c792010V5b.LIZ);
                                }
                                zLIZJ = LIZJ(c2403609bODoPost);
                                if (C792400V6o.LJIIIIZZ()) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("SlardarConfigFetcher.queryFromNet.fetchResult: ");
                                    sbLIZ3.append(c2403609bODoPost.LIZJ.length);
                                    sbLIZ3.append(" ");
                                    sbLIZ3.append(zLIZJ);
                                    C2188811AlT.LIZIZ(sbLIZ3);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (C792400V6o.LJIIIIZZ()) {
                                    DoctorManager doctorManager2 = DoctorManager.getInstance();
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("queFromNetError:");
                                    sbLIZ4.append(th);
                                    doctorManager2.LIZIZ("APM_SETTING_UPDATE_FROM_NET_ERROR", C2188811AlT.LIZIZ(sbLIZ4));
                                }
                            }
                            if (zLIZJ) {
                                break;
                            }
                        } else if (!zLIZJ) {
                            this.LLJILJILJ = Math.min(this.LLJILJILJ * 2, 600000L);
                            return;
                        }
                    }
                    this.LLJILJILJ = 60000L;
                    return;
                }
                if (C792400V6o.LJIIIIZZ()) {
                    DoctorManager.getInstance().LIZIZ("APM_SETTING_UPDATE_FROM_NET_ERROR", "mQueryParams not available");
                }
            }
        }
    }

    public final void LJIIIZ(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObjectOptJSONObject;
        boolean z;
        JSONObject jSONObject3;
        if (C0V3O.LIZJ(jSONObject)) {
            return;
        }
        JSONObject jSONObjectLJ = C0V3O.LJ("general", "slardar_api_settings", jSONObject);
        if (jSONObjectLJ != null) {
            JSONObject jSONObjectOptJSONObject2 = jSONObjectLJ.optJSONObject("fetch_setting");
            if (jSONObjectOptJSONObject2 != null) {
                this.LLIZ = jSONObjectOptJSONObject2.optLong("fetch_setting_interval", 1200L);
            }
            if (this.LLIZ < 600) {
                this.LLIZ = 600L;
            }
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("custom_event_settings");
        if (jSONObjectOptJSONObject3 != null) {
            this.LLILLL = jSONObjectOptJSONObject3.optJSONObject("allow_log_type");
            this.LLILZ = jSONObjectOptJSONObject3.optJSONObject("allow_metric_type");
            this.LLILZIL = jSONObjectOptJSONObject3.optJSONObject("allow_service_name");
        }
        this.LLJI = jSONObject;
        if (!TextUtils.isEmpty("exception_modules") && (jSONObject3 = this.LLJI) != null) {
            jSONObject2 = jSONObject3.optJSONObject("exception_modules");
        } else {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject2 != null && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("exception")) != null) {
            if (jSONObjectOptJSONObject.optInt("enable_upload") == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LLILLJJLI = z;
        }
        if (this.LLILZIL != null && !TextUtils.isEmpty("apm_cost") && this.LLILZIL.optInt("apm_cost") == 1) {
            C0V30.LJFF = new C0V33(this);
            C0V30.LJI = true;
        }
    }

    public final boolean LJIIJJI(JSONObject jSONObject) {
        SharedPreferences sharedPreferences;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int iOptInt = jSONObject.optInt("code", -1);
        if (iOptInt == -1) {
            return false;
        }
        if (iOptInt == 1) {
            this.LLJILJIL = System.currentTimeMillis();
            this.LLJJIJI = ((long) jSONObject.optInt("last_calculate_timestamp", 0)) * 1000;
            this.LLJJIJIIJIL = ((long) jSONObject.optInt("last_full_calculate_timestamp", 0)) * 1000;
            SharedPreferences.Editor editorEdit = this.LLIZLLLIL.edit();
            editorEdit.putLong("monitor_configure_refresh_time", this.LLJILJIL);
            editorEdit.putLong("monitor_last_calculate_timestamp_v5", this.LLJJIJI);
            editorEdit.putLong("monitor_last_full_calculate_timestamp_v5", this.LLJJIJIIJIL);
            editorEdit.commit();
            return true;
        }
        int i = 2;
        if (iOptInt != 0 && iOptInt != 2) {
            return false;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            String strLJI = LJI();
            if (TextUtils.isEmpty(strLJI)) {
                strLJI = "{}";
            }
            try {
                jSONObjectOptJSONObject = new JSONObject(strLJI);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "SlardarConfigFetcher->updateWithSpecificAidResult");
                if (C792400V6o.LJIIIIZZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("error parse configStr:");
                    sbLIZ.append(strLJI);
                    C792910V8n.LIZIZ("SlardarConfigFetcher", C2188811AlT.LIZIZ(sbLIZ));
                }
                return false;
            }
        }
        try {
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data_to_merge");
            if (jSONObjectOptJSONObject2 != null) {
                C792450V6t.LIZLLL(jSONObjectOptJSONObject, jSONObjectOptJSONObject2);
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJFF(e2, "SlardarConfigFetcher->updateWithSpecificAidResult 2");
            if (C792400V6o.LJIIIIZZ()) {
                C792910V8n.LIZIZ("SlardarConfigFetcher", "error nested data: dataToMerge");
            }
        }
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("data_to_delete");
            if (jSONObjectOptJSONObject3 != null) {
                C792450V6t.LIZIZ(jSONObjectOptJSONObject, jSONObjectOptJSONObject3);
            }
        } catch (JSONException e3) {
            TryCatchGuardChecker.doCheck(e3);
            C1AF0.LJFF(e3, "SlardarConfigFetcher->updateWithSpecificAidResult 3");
            if (C792400V6o.LJIIIIZZ()) {
                C792910V8n.LIZIZ("SlardarConfigFetcher", "error nested data: dataToDelete");
            }
        }
        this.LLJJIJI = ((long) jSONObject.optInt("last_calculate_timestamp", 0)) * 1000;
        this.LLJJIJIIJIL = ((long) jSONObject.optInt("last_full_calculate_timestamp", 0)) * 1000;
        this.LLJILJIL = System.currentTimeMillis();
        this.LLJIJIL = false;
        LJIIIZ(jSONObjectOptJSONObject);
        if (jSONObjectOptJSONObject.optJSONObject("general") != null) {
            C791580V3k.LIZIZ(32, !r1.optBoolean("enable_salvage_log", true));
        }
        JSONObject jSONObjectLJ = C0V3O.LJ("performance_modules", "smooth", jSONObjectOptJSONObject);
        if (jSONObjectLJ != null) {
            if (jSONObjectLJ.optInt("block_enable_upload", 0) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            C791580V3k.LIZIZ(1, z4);
            if (jSONObjectLJ.optInt("enable_trace", 0) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            C791580V3k.LIZIZ(2, z5);
            if (jSONObjectLJ.optInt("enable_stack_sampling", 0) == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            C791580V3k.LIZIZ(64, z6);
            if (jSONObjectLJ.optInt("enable_history_message_logging", 0) == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            C791580V3k.LIZIZ(128, z7);
            C791580V3k.LJ = jSONObjectLJ.optLong("atrace_tag", 0L);
            int iLIZLLL = C0V3O.LIZLLL("smooth", "block_monitor_mode", jSONObjectOptJSONObject);
            if (iLIZLLL != 11) {
                if (iLIZLLL != 101) {
                    if (iLIZLLL != 1001) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 3;
                }
            }
            C791580V3k.LIZLLL = ((i << 29) & (-536870912)) + (C791580V3k.LIZLLL & 536870911);
            if (jSONObjectLJ.optInt("enable_socket_total_traffic_collect", 0) == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            C791580V3k.LIZIZ(256, z8);
            if (jSONObjectLJ.optInt("enable_socket_dumpstack_collect", 0) == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            C791580V3k.LIZIZ(512, z9);
        }
        JSONObject jSONObjectLJ2 = C0V3O.LJ("performance_modules", "start_trace", jSONObjectOptJSONObject);
        if (jSONObjectLJ2 != null) {
            if (jSONObjectLJ2.optInt("enable_perf_data_collect", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            C791580V3k.LIZIZ(4, z);
            if (jSONObjectLJ2.optInt("enable_lock_data_collect", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C791580V3k.LIZIZ(8, z2);
            if (jSONObjectLJ2.optInt("enable_long_sleep_data_collect", 0) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            C791580V3k.LIZIZ(16, z3);
        }
        if ((jSONObjectLJ != null || jSONObjectLJ2 != null) && (sharedPreferences = C791580V3k.LIZIZ) != null) {
            sharedPreferences.edit().putInt("monitor_switch_config_first_flag", C791580V3k.LIZLLL).putLong("monitor_switch_config_atrace_flag", C791580V3k.LJ).apply();
        }
        this.LLIZLLLIL.getString("monitor_net_config", "");
        SharedPreferences.Editor editorEdit2 = this.LLIZLLLIL.edit();
        editorEdit2.putString("monitor_net_config", C786410Ut5.J3(jSONObjectOptJSONObject));
        editorEdit2.putInt("setting_version", 5);
        editorEdit2.putLong("monitor_configure_refresh_time", this.LLJILJIL);
        editorEdit2.putLong("monitor_last_calculate_timestamp_v5", this.LLJJIJI);
        editorEdit2.putLong("monitor_last_full_calculate_timestamp_v5", this.LLJJIJIIJIL);
        editorEdit2.commit();
        LJFF(jSONObjectOptJSONObject, false);
        LJ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LLJILJIL);
        sbLIZ2.append("");
        C792400V6o.LIZ("config_time", C2188811AlT.LIZIZ(sbLIZ2));
        C792420V6q.LJIILL = this.LLJILJIL;
        C787900UvU.LIZ.LIZLLL(1000L, new ARunnableS83S0000000_3(33));
        C0V5B.LIZ("apm_debug", "APM_SETTING_READY");
        return true;
    }

    public static byte[] LIZ(byte[] bArr, Map<String, String> map) throws IOException {
        if (bArr.length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    ((HashMap) map).put("Content-Encoding", "gzip");
                    return byteArray;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJFF(e, "SlardarConfigFetcher->compress");
                    throw e;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                gZIPOutputStream.close();
                throw th;
            }
        }
        return bArr;
    }

    public final void LJFF(JSONObject jSONObject, boolean z) {
        List<InterfaceC792030V5d> list = this.LLJJIJIL;
        if (list != null) {
            Iterator it2 = ((CopyOnWriteArrayList) list).iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC792030V5d) it2.next()).LJFF(jSONObject, z);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Context context = C792400V6o.LIZ;
                    C1AF0.LJ(th);
                }
            }
        }
    }
}
