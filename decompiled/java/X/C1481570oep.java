package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.simreporter.callback.UpdateCallback;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481570oep {
    public static boolean LIZJ = true;
    public UpdateCallback LIZ;
    public C1481580oeq LIZIZ;

    public final void LIZ() {
        IEvent iEventLIZJ;
        C1481580oeq c1481580oeq = this.LIZIZ;
        if (c1481580oeq != null) {
            JSONObject jSONObject = new JSONObject();
            EnumC585580Mxw enumC585580Mxw = c1481580oeq.LJIL;
            try {
                jSONObject.put("access", c1481580oeq.LJI);
                jSONObject.put("group_id", c1481580oeq.LIZIZ);
                jSONObject.put("play_sess", c1481580oeq.LJFF);
                jSONObject.put("vduration", c1481580oeq.LIZLLL);
                jSONObject.put("preloader_type", c1481580oeq.LJ);
                if (EnumC585580Mxw.T_LITE_FEED == enumC585580Mxw) {
                    jSONObject.put("cache_completed", c1481580oeq.LJIIIIZZ);
                }
                int i = c1481580oeq.LJII;
                if (i > -1) {
                    jSONObject.put("is_hit_cache", i);
                }
                int i2 = c1481580oeq.LJIIIZ;
                if (i2 >= -2) {
                    jSONObject.put("pre_cache_size", i2);
                }
                int i3 = c1481580oeq.LJIIIIZZ;
                if (i3 >= 0) {
                    jSONObject.put("cache_completed", i3);
                }
                jSONObject.put("vps_timestamp", System.currentTimeMillis());
                jSONObject.put("select_flow", c1481580oeq.LJIIL);
                jSONObject.put("bitrate_values", c1481580oeq.LJIJ);
                for (String str : c1481580oeq.LJIJJLI.keySet()) {
                    Object obj = c1481580oeq.LJIJJLI.get(str);
                    if (obj != null) {
                        jSONObject.put(str, obj);
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (C1474810oTv.LJJLI()) {
                InterfaceC1482100ofg interfaceC1482100ofgLIZ = C1481590oer.LIZ();
                String str2 = this.LIZIZ.LJFF;
                EnumC1481810ofD enumC1481810ofD = EnumC1481810ofD.VIDEO_REQUEST;
                HashMap<String, String> mapLIZ = ((C1481640oew) interfaceC1482100ofgLIZ).LIZ(str2);
                if ((mapLIZ == null ? Boolean.FALSE : Boolean.valueOf(mapLIZ.containsKey(enumC1481810ofD.name()))).booleanValue()) {
                    JSONObject jSONObject2 = new JSONObject();
                    C1481630oev.LIZJ(this.LIZIZ.LJFF, jSONObject2);
                    C1482340og4.LIZIZ().getClass();
                    try {
                        jSONObject2.put("has_playsessionevents", 1);
                        jSONObject2.put("has_oneplay", 0);
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    C1482340og4.LIZLLL(jSONObject2);
                    C1482340og4.LJ(jSONObject2);
                }
            }
            C1481580oeq c1481580oeq2 = this.LIZIZ;
            String str3 = c1481580oeq2 != null ? c1481580oeq2.LJFF : null;
            String strJ3 = C786410Ut5.J3(jSONObject);
            if (C1474810oTv.LJJJJ() && LIZJ) {
                LIZJ = false;
                if (C1474810oTv.LJJJJ() && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(strJ3)) {
                    C1481590oer.LIZJ.put(str3, strJ3);
                }
            } else {
                C1481630oev.LIZLLL(false);
                ((C1481640oew) C1481590oer.LIZ()).LJ(EnumC1481810ofD.VIDEO_REQUEST, str3, strJ3);
            }
            if (C1474810oTv.LJJIJLIJ() && (iEventLIZJ = C1475000oUE.LIZJ()) != null) {
                iEventLIZJ.onEvent("video_request", jSONObject);
            }
            if (this.LIZ != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("video_request", jSONObject);
                this.LIZ.update(4, linkedHashMap);
            }
            C625790Ogb.LIZ();
        }
    }
}
