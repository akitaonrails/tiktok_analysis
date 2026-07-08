package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CJh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311590CJh {
    public static final /* synthetic */ int LJJIJIIJIL = 0;
    public final long LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final boolean LJ;
    public final Function2<String, JSONObject, Unit> LJFF;
    public int LJIJ;
    public int LJIJI;
    public final C0C7U LJJIFFI;
    public final int LJJII;
    public long LJJIII;
    public final long LJJIIJ;
    public long LJJIIJZLJL;
    public long LJJIIZ;
    public long LJJIIZI;
    public long LJJIJ;
    public final int LJJIJIIJI;
    public final boolean LIZLLL = false;
    public int LJI = -1;
    public long LJII = -1;
    public int LJIIIIZZ = -1;
    public long LJIIIZ = -1;
    public long LJIIJ = -1;
    public long LJIIJJI = -1;
    public int LJIIL = -1;
    public int LJIILIIL = -1;
    public int LJIILJJIL = -1;
    public String LJIILL = "";
    public int LJIILLIIL = -1;
    public int LJIIZILJ = -1;
    public int LJIJJ = -1;
    public int LJIJJLI = -1;
    public int LJIL = -1;
    public int LJJ = -1;
    public final JSONArray LJJI = new JSONArray();

    public final void LIZIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request_type", this.LJI);
        jSONObject.put("request_update_group_num", this.LJIIIIZZ);
        jSONObject.put("request_build_time", this.LJII);
        jSONObject.put("request_chunk_info", this.LJJI.toString());
        jSONObject.put("request_update_body_size", this.LJIILIIL);
        jSONObject.put("request_update_key_count", this.LJIILJJIL);
        jSONObject.put("request_locale_all_key_count", this.LJIILLIIL);
        jSONObject.put("request_code", this.LJIIL);
        jSONObject.put("last_request_code", this.LJJII);
        jSONObject.put("request_trigger", this.LIZJ);
        jSONObject.put("request_app_status", this.LJJIJIIJI);
        jSONObject.put("is_layer1_enabled", this.LIZLLL);
        String str = this.LJIILL;
        if (str != null) {
            jSONObject.put("error_message", str);
        }
        jSONObject.put("request_response_code", this.LJIIZILJ);
        jSONObject.put("request_delay_time", this.LJJIIJ);
        jSONObject.put("request_total_cost_time", (SystemClock.elapsedRealtimeNanos() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - this.LIZIZ);
        jSONObject.put("first_chunk_request_time", this.LJJIII);
        jSONObject.put("first_chunk_store_cost_time", this.LJJIIJZLJL);
        jSONObject.put("first_chunk_enable_time", this.LJJIIZ);
        jSONObject.put("first_chunk_parse_cost_time", this.LJJIIZI);
        jSONObject.put("all_data_enable_time", SystemClock.uptimeMillis() - this.LIZ);
        jSONObject.put("is_cold_start_first_launch", this.LJ);
        jSONObject.put("all_delete_key_size", this.LJJ);
        this.LJFF.invoke("abmock_download_monitor", jSONObject);
    }

    public final void LJFF() {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - this.LJJIJ;
        this.LJIIIZ = jElapsedRealtimeNanos;
        if (this.LJIJI == 0) {
            this.LJJIII = jElapsedRealtimeNanos;
        }
    }

    public final void LIZ(int i) throws JSONException {
        this.LJIIJJI = (SystemClock.elapsedRealtimeNanos() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - this.LJIIJJI;
        C0C7U c0c7u = this.LJJIFFI;
        c0c7u.LIZIZ().storeInt(c0c7u.LJI, 0);
        if (this.LJIJI == 0) {
            this.LJJIIJZLJL = this.LJIIJJI;
            this.LJJIIZ = SystemClock.uptimeMillis() - this.LIZ;
        }
        LIZJ(i);
    }

    public final void LIZJ(int i) throws JSONException {
        JSONArray jSONArray = this.LJJI;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request_chunk_index", this.LJIJI);
        jSONObject.put("request_time", this.LJIIIZ);
        jSONObject.put("request_parse_time", this.LJIIJ);
        jSONObject.put("request_store_time", this.LJIIJJI);
        jSONObject.put("request_chunk_code", i);
        jSONObject.put("request_chunk_size", this.LJIJJ);
        jSONObject.put("request_data_enable_time", SystemClock.uptimeMillis() - this.LIZ);
        jSONObject.put("request_chunk_group_num", this.LJIJJLI);
        jSONObject.put("request_chunk_key_num", this.LJIL);
        jSONObject.put("request_chunk_response_code", this.LJIJ);
        jSONArray.put(jSONObject);
        this.LJIJI++;
        this.LJIIIZ = -1L;
        this.LJIIJ = -1L;
        this.LJIIJJI = -1L;
        this.LJIJJ = 0;
        this.LJIJJLI = 0;
        this.LJIL = 0;
        this.LJIJ = 0;
    }

    public final void LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(str);
        this.LJIILL = C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJ(EnumC311630CJl enumC311630CJl) {
        switch (C311640CJm.LIZ[enumC311630CJl.ordinal()]) {
            case 1:
                this.LJIIL = 0;
                break;
            case 2:
                this.LJIIL = -1;
                break;
            case 3:
                this.LJIIL = -2;
                break;
            case 4:
                this.LJIIL = -3;
                break;
            case 5:
                this.LJIIL = -4;
                break;
            case 6:
                this.LJIIL = -5;
                break;
        }
        C0C7U c0c7u = this.LJJIFFI;
        c0c7u.LIZIZ().storeInt(c0c7u.LJI, this.LJIIL);
    }

    public C311590CJh(long j, long j2, int i, boolean z, boolean z2, Function2 function2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = i;
        this.LJ = z2;
        this.LJFF = function2;
        C0C7U c0c7u = new C0C7U();
        this.LJJIFFI = c0c7u;
        this.LJJII = c0c7u.LIZIZ().getInt(c0c7u.LJI, 0);
        this.LJJIII = -1L;
        this.LJJIIJ = SystemClock.uptimeMillis() - j;
        this.LJJIIJZLJL = -1L;
        this.LJJIIZ = -1L;
        this.LJJIIZI = -1L;
        this.LJJIJ = -1L;
        this.LJJIJIIJI = z ? 1 : 0;
    }
}
