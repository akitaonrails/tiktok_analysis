package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0odJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1480630odJ implements InterfaceC1472880oQo {
    @Override // X.InterfaceC1472880oQo
    public final void LJLJI() {
    }

    @Override // X.InterfaceC1472880oQo
    public final void LJLILLLLZI() {
        SystemClock.elapsedRealtime();
        C0X35.LJIIJJI("cold_boot_start_to_prerender", true);
        C0X35.LJIIJJI("feed_get_cache_to_prerender", true);
        C0X35.LJIIJJI("player_precreate_end_to_prerender_start", true);
        C0X35.LIZ("player_prerender_real_duration", true);
        C0X35.LIZ("player_prerender_msg_duration", true);
    }

    @Override // X.InterfaceC1472880oQo
    public final void LJLJLJ() {
        SystemClock.elapsedRealtime();
        C0X35.LJIIJJI("player_init_to_precreate", true);
        C0X35.LJIIJJI("cold_boot_start_to_precreate", true);
        C0X35.LIZ("player_precreate_real_duration", true);
        C0X35.LIZ("player_precreate_msg_duration", true);
    }

    @Override // X.InterfaceC1472880oQo
    public final void LJLJLLL() {
        SystemClock.elapsedRealtime();
        C0X35.LJIIJJI("player_precreate_msg_duration", true);
        C0X35.LIZ("player_precreate_get_config_duration", true);
    }

    @Override // X.InterfaceC1472880oQo
    public final void LJLIIIL() {
        SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC1472880oQo
    public final void LJLJJI() {
        SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC1472880oQo
    public final void LJLJL() {
        SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC1472880oQo
    public final void LJLIIL(long j) {
        if (!C1474810oTv.LLIILZL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j);
                C20684815ws.LJIJ("pre_start_end_time", jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC1472880oQo
    public final void LJLIL(long j) {
        if (!C1474810oTv.LLIILZL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j);
                C20684815ws.LJIJ("pre_on_render_start_time", jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC1472880oQo
    public final void LJLJJL(long j) {
        if (!C1474810oTv.LLIILZL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j);
                C20684815ws.LJIJ("pre_on_prepared_time", jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC1472880oQo
    public final void LJLJJLL(long j) {
        if (!C1474810oTv.LLIILZL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j);
                C20684815ws.LJIJ("pre_set_surface_end_time", jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC1472880oQo
    public final void LJLL(long j) {
        if (!C1474810oTv.LLIILZL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j);
                C20684815ws.LJIJ("pre_pause_end_time", jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
