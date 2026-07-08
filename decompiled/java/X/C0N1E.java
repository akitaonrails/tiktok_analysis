package X;

import Y.AfS133S0000000_9;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.common.MobClick;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N1E, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N1E {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;

    public static void LIZ(boolean z) {
        if (z && !LIZIZ) {
            synchronized (C0N1E.class) {
                try {
                    if (!LIZIZ) {
                        LIZIZ = true;
                        C1906580ziK.LIZJ().LIZIZ().LJJLJLI(new AfS133S0000000_9(3));
                        C1514430pVp.LIZIZ = new C0N1G() { // from class: X.0N1F
                        };
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (LIZ != z) {
            LIZ = z;
        }
    }

    public static void LIZIZ(final String str, final String str2) {
        if (LIZ && !TextUtils.isEmpty(str)) {
            final String strLIZIZ = C1514430pVp.LIZIZ();
            final String strLIZJ = C1514430pVp.LIZJ();
            C15O7.LIZIZ(new Callable() { // from class: X.0Wca
                @Override // java.util.concurrent.Callable
                public final Object call() throws JSONException {
                    String str3 = strLIZIZ;
                    String str4 = strLIZJ;
                    String str5 = str;
                    String str6 = str2;
                    C1C7U.LIZ("VideoRequestStatus@8cd2.statPrepareError$1L");
                    C736480Suk c736480Suk = new C736480Suk();
                    c736480Suk.LIZ("top_activity", str3);
                    c736480Suk.LIZ("feed_tab", str4);
                    c736480Suk.LIZ("err_code", str5);
                    c736480Suk.LIZ("play_sess", String.valueOf(str6));
                    final JSONObject jSONObjectLIZIZ = c736480Suk.LIZIZ();
                    try {
                        jSONObjectLIZIZ.put("preloader_type", 2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                    MobClick mobClickObtain = MobClick.obtain();
                    mobClickObtain.setEventName("video_prepare_error");
                    mobClickObtain.setLabelName("perf_monitor");
                    mobClickObtain.setJsonObject(jSONObjectLIZIZ);
                    C20684815ws.onEvent(mobClickObtain);
                    C20684815ws.LJIJ("video_prepare_error", jSONObjectLIZIZ);
                    boolean z = C827150Wcb.LIZIZ;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (!C827150Wcb.LIZ()) {
                        C844470XAv.LIZ.getClass();
                        final Context contextLIZ = C844470XAv.LIZ();
                        try {
                            jSONObjectLIZIZ.put("local_time", jCurrentTimeMillis / 1000);
                        } catch (JSONException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        C15O7.LIZJ(new Callable() { // from class: X.0UNz
                            public final /* synthetic */ String LLILLJJLI = "video_prepare_error";
                            public final /* synthetic */ String LLILLL = "low_retain";

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                JSONObject jSONObject = jSONObjectLIZIZ;
                                String str7 = this.LLILLJJLI;
                                String str8 = this.LLILLL;
                                Context context = contextLIZ;
                                C1C7U.LIZ("LowRetainLog@884d.log$2L");
                                JSONObject jSONObject2 = new JSONObject();
                                Iterator<String> itKeys = jSONObject.keys();
                                while (itKeys.hasNext()) {
                                    try {
                                        String next = itKeys.next();
                                        jSONObject2.put(next, jSONObject.get(next));
                                    } catch (Exception e3) {
                                        TryCatchGuardChecker.doCheck(e3);
                                    }
                                }
                                jSONObject2.put("event", str7);
                                C827040WcQ.LIZ.getClass();
                                jSONObject2.put("session_id", C827040WcQ.LIZJ);
                                jSONObject2.put(Scene.SCENE_SERVICE, str8);
                                AppLog.recordMiscLog(context, "app_perf", jSONObject2);
                                C1C7U.LIZIZ("LowRetainLog@884d.log$2L");
                                return null;
                            }
                        });
                    }
                    C1481030odx.LIZIZ("video_prepare_error", jSONObjectLIZIZ);
                    C1C7U.LIZIZ("VideoRequestStatus@8cd2.statPrepareError$1L");
                    return null;
                }
            }, C20684815ws.LJFF(), null);
        }
    }
}
