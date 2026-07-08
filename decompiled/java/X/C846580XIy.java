package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.commercialize.track.RawURLGetter;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C846580XIy {
    public static void LIZ(final C1045290dJ9 c1045290dJ9, Collection collection) {
        if (C086I.LIZIZ(collection)) {
            return;
        }
        String strLIZ = C1489110oqz.LIZ("other");
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            final String strReplace = (String) it2.next();
            if (!TextUtils.isEmpty(strReplace)) {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                if (!TextUtils.isEmpty(strReplace)) {
                    try {
                        if (strReplace.contains("{TS}") || strReplace.contains("__TS__")) {
                            strReplace = strReplace.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
                        }
                        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
                        if (!TextUtils.isEmpty(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId)) {
                            if (strReplace.contains("{UID}") || strReplace.contains("__UID__")) {
                                strReplace = strReplace.replace("{UID}", strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId).replace("__UID__", strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId);
                            }
                            if (strReplace.contains("{UA}") || strReplace.contains("__UA__")) {
                                strReplace = strReplace.replace("{UA}", strLIZ).replace("__UA__", strLIZ);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
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
                }
                RawURLGetter.LIZ(strReplace, new C0XI1() { // from class: X.0XIz
                    @Override // X.C0XI1
                    public final void LIZ(int i, boolean z, Exception exc) {
                        C0XJ0 c0xj0 = c1045290dJ9;
                        String str = strReplace;
                        long j = jCurrentTimeMillis;
                        JSONObject jSONObject2 = jSONObject;
                        if (c0xj0 != null) {
                            c0xj0.LIZ(j, str, String.valueOf(i));
                        }
                        if (exc != null) {
                            C2344809Gs.LIZ(exc);
                            try {
                                jSONObject2.put("error_message", exc.getMessage());
                            } catch (JSONException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                        }
                        try {
                            jSONObject2.put("status_code", i);
                        } catch (JSONException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                        C793770VBv.LJIIJJI("aweme_third_party_track_url_succeed_rate", z ? 1 : 0, jSONObject2);
                    }
                });
            }
        }
    }
}
