package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0MvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584030MvR {
    public static void LIZ(final String str, final String str2, final String str3, final JSONObject jSONObject, final Aweme aweme) {
        final String strLIZIZ = C1514430pVp.LIZIZ();
        final String strLIZJ = C1514430pVp.LIZJ();
        C15O7.LIZIZ(new Callable() { // from class: X.0N1I
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONObject jSONObject2;
                JSONObject jSONObject3 = jSONObject;
                Aweme aweme2 = aweme;
                String str4 = strLIZIZ;
                String str5 = strLIZJ;
                String str6 = str;
                String str7 = str2;
                String str8 = str3;
                C1C7U.LIZ("Feed0vvStatUtils@199.onPlayFails$1L");
                if (jSONObject3 == null) {
                    try {
                        jSONObject2 = new JSONObject();
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else {
                    jSONObject2 = jSONObject3;
                }
                jSONObject2.put("has_tts", C20703515zt.LJIJJLI(aweme2));
                jSONObject2.put("has_cla", C20703515zt.LJIIZILJ(aweme2) ? 1 : 0);
                jSONObject2.put("top_activity", str4);
                jSONObject2.put("feed_tab", str5);
                jSONObject2.put("err_code", str6);
                jSONObject2.put("err_msg", str7);
                jSONObject2.put("is_audio_mode", String.valueOf(C1618110sD3.LIZ() ? 1 : 0));
                MobClick mobClickObtain = MobClick.obtain();
                mobClickObtain.setEventName("video_play_failed");
                mobClickObtain.setValue(str8);
                mobClickObtain.setJsonObject(jSONObject3);
                C20684815ws.onEvent(mobClickObtain);
                C1C7U.LIZIZ("Feed0vvStatUtils@199.onPlayFails$1L");
                return null;
            }
        }, C20684815ws.LJFF(), null);
    }
}
