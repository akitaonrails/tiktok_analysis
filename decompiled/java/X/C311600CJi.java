package X;

import android.os.SystemClock;
import com.bytedance.ies.ugc.appcontext.IAppContextService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tiktok.ef.absettings.api.IInitAbSettingsDepend;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311600CJi {
    public static final /* synthetic */ int LJJIJ = 0;
    public final long LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final Function2<String, JSONObject, Unit> LJ;
    public final boolean LJFF;
    public int LJIJ;
    public int LJIJI;
    public final int LJJIIZI;
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
    public final JSONArray LJJ = new JSONArray();
    public final int LJJI = C0CJ2.LIZJ().getInt("fetch_ab_request_code", 0);
    public long LJJIFFI = -1;
    public final long LJJII = SystemClock.uptimeMillis() - ((IInitAbSettingsDepend) C311680CJq.LIZ.getValue()).LJI();
    public long LJJIII = -1;
    public long LJJIIJ = -1;
    public long LJJIIJZLJL = -1;
    public long LJJIIZ = -1;

    public final void LIZJ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request_type", this.LJI);
        jSONObject.put("request_update_group_num", this.LJIIIIZZ);
        jSONObject.put("request_build_time", this.LJII);
        jSONObject.put("request_chunk_info", this.LJJ.toString());
        jSONObject.put("request_update_body_size", this.LJIILIIL);
        jSONObject.put("request_update_key_count", this.LJIILJJIL);
        jSONObject.put("request_locale_all_key_count", this.LJIILLIIL);
        jSONObject.put("request_code", this.LJIIL);
        jSONObject.put("last_request_code", this.LJJI);
        jSONObject.put("request_trigger", this.LIZJ);
        jSONObject.put("request_app_status", this.LJJIIZI);
        jSONObject.put("is_layer1_enabled", this.LIZLLL);
        String str = this.LJIILL;
        if (str != null) {
            jSONObject.put("error_message", str);
        }
        jSONObject.put("request_response_code", this.LJIIZILJ);
        jSONObject.put("request_delay_time", this.LJJII);
        jSONObject.put("request_total_cost_time", (SystemClock.elapsedRealtimeNanos() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - this.LIZIZ);
        jSONObject.put("first_chunk_request_time", this.LJJIFFI);
        jSONObject.put("first_chunk_store_cost_time", this.LJJIII);
        jSONObject.put("first_chunk_enable_time", this.LJJIIJ);
        jSONObject.put("first_chunk_parse_cost_time", this.LJJIIJZLJL);
        jSONObject.put("all_data_enable_time", SystemClock.uptimeMillis() - ((IInitAbSettingsDepend) C311680CJq.LIZ.getValue()).LJI());
        jSONObject.put("is_cold_start_first_launch", this.LJFF);
        jSONObject.put("local_libra_request_type", C1259804wO.LIZ());
        this.LJ.invoke("abmock_download_monitor", jSONObject);
    }

    public final void LIZ() {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - this.LJIIJ;
        this.LJIIJ = jElapsedRealtimeNanos;
        if (this.LJIJI == 0) {
            this.LJJIIJZLJL = jElapsedRealtimeNanos;
        }
    }

    public final void LJII() {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - this.LJJIIZ;
        this.LJIIIZ = jElapsedRealtimeNanos;
        if (this.LJIJI == 0) {
            this.LJJIFFI = jElapsedRealtimeNanos;
        }
    }

    public final void LJIIIIZZ() {
        C0CJ2.LIZJ().storeInt("fetch_ab_request_code", -6);
        this.LJIIJJI = SystemClock.elapsedRealtimeNanos() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final void LIZIZ(int i) throws JSONException {
        this.LJIIJJI = (SystemClock.elapsedRealtimeNanos() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - this.LJIIJJI;
        C0CJ2.LIZJ().storeInt("fetch_ab_request_code", 0);
        if (this.LJIJI == 0) {
            this.LJJIII = this.LJIIJJI;
            this.LJJIIJ = SystemClock.uptimeMillis() - ((IInitAbSettingsDepend) C311680CJq.LIZ.getValue()).LJI();
        }
        LJ(i);
    }

    public final void LIZLLL(long j) {
        this.LJII = j;
        this.LJJIIZ = SystemClock.elapsedRealtimeNanos() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final void LJ(int i) throws JSONException {
        JSONArray jSONArray = this.LJJ;
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

    public final void LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(str);
        this.LJIILL = C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJI(EnumC311620CJk enumC311620CJk) {
        switch (C311610CJj.LIZ[enumC311620CJk.ordinal()]) {
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
            default:
                throw new C1954807lC();
        }
        C0CJ2.LIZJ().storeInt("fetch_ab_request_code", this.LJIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C311600CJi(long j, long j2, int i, boolean z, Function2<? super String, ? super JSONObject, Unit> function2, boolean z2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = function2;
        this.LJFF = z2;
        int i2 = 0;
        IAppContextService iAppContextService = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null);
        if (iAppContextService != null && iAppContextService.isAppBackground()) {
            i2 = 1;
        }
        this.LJJIIZI = i2;
    }
}
