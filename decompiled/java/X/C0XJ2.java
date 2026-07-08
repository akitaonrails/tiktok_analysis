package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.track.RawURLGetter;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XJ2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XJ2 {
    public static void LIZ(final C0XJ4 c0xj4, Collection<String> collection, boolean z) {
        if (C086I.LIZIZ(collection)) {
            return;
        }
        String strLIZ = C1489110oqz.LIZ("other");
        for (final String strReplace : collection) {
            if (!TextUtils.isEmpty(strReplace)) {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                if (!TextUtils.isEmpty(strReplace)) {
                    try {
                        if (strReplace.contains("{TS}") || strReplace.contains("__TS__")) {
                            strReplace = strReplace.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
                        }
                        String deviceId = C2214471Bll.LIZIZ().getDeviceId();
                        if (!TextUtils.isEmpty(deviceId)) {
                            strReplace = C0XJ8.LIZIZ.LIZIZ(strReplace, deviceId);
                            if (strReplace.contains("{UA}") || strReplace.contains("__UA__")) {
                                strReplace = strReplace.replace("{UA}", strLIZ).replace("__UA__", strLIZ);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                }
                if (z) {
                    strReplace = C2093608Ic.LIZLLL(strReplace);
                }
                Uri uri = UriProtector.parse(strReplace);
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("track_url", strReplace);
                    jSONObject.put("scheme", uri.getScheme());
                    jSONObject.put("host", uri.getHost());
                    jSONObject.put("path", uri.getPath());
                    jSONObject.put("ref", "native");
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C1AF0.LJ(e2);
                }
                RawURLGetter.LIZ(strReplace, new C0XI1() { // from class: X.0XJ3
                    @Override // X.C0XI1
                    public final void LIZ(int i, boolean z2, Exception exc) {
                        C0XJ4 c0xj42 = c0xj4;
                        String str = strReplace;
                        long j = jCurrentTimeMillis;
                        JSONObject jSONObject2 = jSONObject;
                        if (c0xj42 != null) {
                            c0xj42.LIZ(j, str, String.valueOf(i));
                        }
                        if (exc != null) {
                            C2344809Gs.LIZ(exc);
                            try {
                                jSONObject2.put("error_message", exc.getMessage());
                            } catch (JSONException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                C1AF0.LJ(e3);
                            }
                        }
                        try {
                            jSONObject2.put("status_code", i);
                        } catch (JSONException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            C1AF0.LJ(e4);
                        }
                        if (C2214471Bll.LIZJ() != null) {
                            C2214471Bll.LIZJ().monitorStatusRate("aweme_third_party_track_url_succeed_rate", z2 ? 1 : 0, jSONObject2);
                        }
                    }
                });
            }
        }
    }
}
