package X;

import Y.ARunnableS21S1100000_16;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BEe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201501BEe {
    public static String LIZ;

    public static C1BER LIZIZ() {
        JSONObject jSONObject;
        C0CLW c0clw = C0CLW.LIZIZ;
        LIZ = c0clw.LIZ.getAdTrackerConfig();
        try {
            jSONObject = new JSONObject(c0clw.LIZ.getAdTrackerConfig());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            jSONObject = null;
        }
        C2201631BEr c2201631BEr = new C2201631BEr();
        c2201631BEr.LIZ = false;
        c2201631BEr.LIZIZ = jSONObject;
        if (jSONObject == null) {
            c2201631BEr.LIZIZ = new JSONObject();
        }
        return new C1BER(c2201631BEr);
    }

    public static C1BE8 LIZ() {
        C1BE8 c1be8LIZIZ = C1BE8.LIZIZ();
        if (!c1be8LIZIZ.LIZ) {
            synchronized (C2201501BEe.class) {
                try {
                    if (!c1be8LIZIZ.LIZ) {
                        C844470XAv.LIZ.getClass();
                        LIZJ(C844470XAv.LIZ());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c1be8LIZIZ;
    }

    public static void LIZJ(Context context) {
        C1BE7 c1be7 = new C1BE7(context);
        c1be7.LIZIZ = LIZIZ();
        c1be7.LIZJ = new C1BEG() { // from class: X.0dmv
            @Override // X.C1BEG
            public final void onEventV3(String str, JSONObject jSONObject) {
                if (jSONObject.optInt("is_ad_event") == 1) {
                    ARunnableS21S1100000_16 aRunnableS21S1100000_16 = new ARunnableS21S1100000_16(jSONObject, str, 2);
                    if (((Boolean) C17986072q.LIZ.getValue()).booleanValue()) {
                        C823050WQl.LIZLLL().submit(aRunnableS21S1100000_16);
                        return;
                    } else {
                        aRunnableS21S1100000_16.run();
                        return;
                    }
                }
                C20684815ws.LJIJ(str, jSONObject);
            }
        };
        c1be7.LJ = new AbstractC2201671BEv() { // from class: X.1BEo
            @Override // X.AbstractC2201671BEv
            public final String LIZ() {
                return C1489110oqz.LIZ("other");
            }
        };
        C2201491BEd c2201491BEd = new C2201491BEd();
        c2201491BEd.LIZ = true;
        c2201491BEd.LIZIZ = new AbstractC2201681BEw() { // from class: X.1BEs
        };
        c2201491BEd.LIZ(new InterfaceC2201661BEu() { // from class: X.1BEf
            @Override // X.InterfaceC2201661BEu
            public final C1BEW LIZ(InterfaceC2201591BEn interfaceC2201591BEn) {
                String str;
                int i;
                String str2;
                C1BEZ request;
                Map<String, List<String>> map;
                if (C2540609xU.LIZ() && (request = interfaceC2201591BEn.getRequest()) != null && (map = request.LIZLLL) != null) {
                    map.put("x-tt-dataflow-id", Collections.singletonList("671088644"));
                }
                C1BEW c1bewLIZ = interfaceC2201591BEn.LIZ(interfaceC2201591BEn.getRequest());
                if (c1bewLIZ != null) {
                    C1BEZ c1bez = c1bewLIZ.LJ;
                    if (c1bez != null) {
                        str = c1bez.LIZIZ;
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        Uri uri = UriProtector.parse(c1bewLIZ.LJ.LIZIZ);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("track_url", uri.toString());
                            jSONObject.put("scheme", uri.getScheme());
                            jSONObject.put("host", uri.getHost());
                            jSONObject.put("path", uri.getPath());
                            jSONObject.put("ref", "track_sdk");
                            if (C1843307Jv.LIZ()) {
                                str2 = "1";
                            } else {
                                str2 = CardStruct.IStatusCode.DEFAULT;
                            }
                            jSONObject.put("use_ttnet", str2);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1AF0.LJ(e);
                        }
                        Throwable th = c1bewLIZ.LJFF;
                        if (th != null) {
                            try {
                                jSONObject.put("error_message", th.getMessage());
                            } catch (JSONException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                C1AF0.LJ(e2);
                            }
                        }
                        try {
                            jSONObject.put("status_code", c1bewLIZ.LIZ);
                        } catch (JSONException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            C1AF0.LJ(e3);
                        }
                        int i2 = c1bewLIZ.LIZ;
                        if (i2 >= 200 && i2 < 300) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                        C793770VBv.LJIIJJI("aweme_third_party_track_url_succeed_rate", i, jSONObject);
                        return c1bewLIZ;
                    }
                }
                return c1bewLIZ;
            }
        });
        if (C1843307Jv.LIZ()) {
            c2201491BEd.LIZ(new C0XIZ());
        }
        C1BEN c1ben = new C1BEN(c2201491BEd);
        if (c1be7.LIZLLL == null) {
            c1be7.LIZLLL = new HashMap();
        }
        ((HashMap) c1be7.LIZLLL).put("c2s", c1ben);
        c1be7.LIZ();
        final C1BE8 c1be8LIZIZ = C1BE8.LIZIZ();
        SettingsManagerProxy.inst().registerSettingsWatcher(new InterfaceC2194071Atx() { // from class: X.1BEi
            @Override // X.InterfaceC2194071Atx
            public final void LIZ(IESSettingsProxy iESSettingsProxy) {
                if (u.LJIJI(C2201501BEe.LIZ, C0CLW.LIZIZ.LIZ.getAdTrackerConfig(), false)) {
                    c1be8LIZIZ.LIZ(C2201501BEe.LIZIZ());
                }
            }
        }, false);
    }
}
