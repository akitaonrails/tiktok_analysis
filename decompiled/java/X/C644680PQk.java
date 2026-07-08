package X;

import Y.ARunnableS10S1300000_10;
import android.net.Uri;
import android.os.Looper;
import android.util.ArrayMap;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS196S0000000_10;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644680PQk {
    public static final ArrayMap<Object, C644680PQk> LJ = new ArrayMap<>();
    public static final BPEAHandler LJFF;
    public final Object LIZ;
    public int LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(413));
    public StringBuilder LIZLLL = new StringBuilder();

    static {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        LJFF = new BPEAHandler(looperMyLooper);
    }

    public final LinkedHashMap<Uri, C644660PQi> LIZJ() {
        return (LinkedHashMap) this.LIZJ.getValue();
    }

    public C644680PQk(Object obj) {
        this.LIZ = obj;
    }

    public static void LIZIZ(C644680PQk c644680PQk, JSONObject jSONObject) throws JSONException {
        if (c644680PQk.LIZIZ != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(c644680PQk.LIZJ());
            boolean z = true;
            if (((Number) C0BC1.LIZ.getValue()).intValue() != 1) {
                z = false;
            }
            if (z) {
                jSONObject.put("lynx_predict_pre_layout_cards", C644690PQl.LJI);
                jSONObject.put("lynx_chunk_ready_pre_layout_cards", C644690PQl.LJII);
                jSONObject.put("lynx_chunk_type_pre_layout_cards", C644690PQl.LJFF);
                jSONObject.put("lynx_pre_layout_valid", C644690PQl.LJIIJ);
                jSONObject.put("lynx_pre_layout_advance_time", String.valueOf(C644690PQl.LIZIZ - C644690PQl.LIZ));
                jSONObject.put("lynx_pre_layout_advance_update_time", String.valueOf(C644690PQl.LIZIZ - C644690PQl.LJIIIIZZ));
                jSONObject.put("lynx_pre_layout_advance_update_duration", String.valueOf(C644690PQl.LJIIIZ - C644690PQl.LJIIIIZZ));
                jSONObject.put("lynx_pre_layout_load_wait_time", String.valueOf(C644690PQl.LJ - C644690PQl.LIZIZ));
                jSONObject.put("lynx_pre_layout_process_render_duration", String.valueOf(C644690PQl.LIZJ));
                jSONObject.put("lynx_pre_layout_update_data_duration", String.valueOf(C644690PQl.LIZLLL));
                jSONObject.put("lynx_process_render_in_advance", C644690PQl.LJIIJJI);
                jSONObject.put("lynx_pre_layout_sync_flush_cost", String.valueOf(C644690PQl.LJIIL));
                jSONObject.put("lynx_pre_layout_async_process_flag", C644690PQl.LJIILIIL);
                jSONObject.put("lynx_vh_duration_before", String.valueOf(C644690PQl.LIZIZ - C644690PQl.LJIILJJIL));
                jSONObject.put("lynx_vh_duration_after", String.valueOf(C644690PQl.LJIILL - C644690PQl.LJIILLIIL));
                jSONObject.put("lynx_vh_duration_mid", String.valueOf(C644690PQl.LJIILLIIL - C644690PQl.LIZIZ));
                jSONObject.put("lynx_vh_all", String.valueOf(C644690PQl.LJIILL - C644690PQl.LJIILJJIL));
                jSONObject.put("lynx_dynamic_aweme_parse_duration", String.valueOf(C644690PQl.LJIIZILJ));
                jSONObject.put("lynx_get_aweme_in_needed_cost_time", String.valueOf(C644690PQl.LJIJ));
                long j = C644690PQl.LJIJJLI;
                if (j > 0) {
                    jSONObject.put("lynx_search_list_init_and_props_cost", String.valueOf(j));
                    jSONObject.put("lynx_search_list_vh_bind_cost", String.valueOf(C644690PQl.LJIJJ));
                }
                long j2 = C644690PQl.LJIJI;
                if (j2 > 0) {
                    jSONObject.put("lynx_search_video_init_and_props_cost", String.valueOf(j2));
                }
                C644690PQl.LIZ = 0L;
                C644690PQl.LIZIZ = 0L;
                C644690PQl.LIZJ = 0L;
                C644690PQl.LIZLLL = 0L;
                C644690PQl.LJ = 0L;
                C644690PQl.LJIIIIZZ = 0L;
                C644690PQl.LJFF = "";
                C644690PQl.LJI = "";
                C644690PQl.LJII = "";
                C644690PQl.LJIIJ = false;
                C644690PQl.LJIIJJI = false;
                C644690PQl.LJIIL = 0L;
                C644690PQl.LJIILIIL = false;
                C644690PQl.LJIILJJIL = 0L;
                C644690PQl.LJIILL = 0L;
                C644690PQl.LJIILLIIL = 0L;
                C644690PQl.LJIIIZ = 0L;
                C644690PQl.LJIIZILJ = 0L;
                C644690PQl.LJIJ = 0L;
                C644690PQl.LJIJI = 0L;
                C644690PQl.LJIJJ = 0L;
                C644690PQl.LJIJJLI = 0L;
            }
            jSONObject.put("lynx_predict_cards_origin_type", C644670PQj.LIZLLL);
            jSONObject.put("lynx_real_cards_origin_type", C644670PQj.LJ);
            C644670PQj.LIZLLL = "";
            C644670PQj.LJ = "";
            C786410Ut5.LJLIIL(2000L, LJFF, new ARunnableS10S1300000_10(c644680PQk, jSONObject, linkedHashMap, 0));
        }
    }

    public final void LIZ(Uri uri, C644660PQi c644660PQi) {
        if (this.LIZIZ == 0) {
            return;
        }
        if (LIZJ().containsKey(uri)) {
            String string = uri.toString();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append(uri.hashCode());
            LIZJ().put(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)), c644660PQi);
            return;
        }
        LIZJ().put(uri, c644660PQi);
    }
}
