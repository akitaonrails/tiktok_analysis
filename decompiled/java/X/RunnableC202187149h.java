package X;

import android.os.Build;
import com.bytedance.security.Sword.Sword;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.tts.oecverify.BdTuring;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.149h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class RunnableC202187149h implements Runnable {
    public C14A3 LL = null;
    public String LLILLJJLI = "";
    public int LLILLL = -1;
    public String LLILZ = "";
    public String LLILZIL = "";
    public String LLILZLL = "";

    public final void LIZ() {
        String strLIZLLL;
        C202185149f c202185149f = C202185149f.LIZ;
        C14A3 c14a3 = this.LL;
        String str = this.LLILLJJLI;
        int i = this.LLILLL;
        String str2 = this.LLILZ;
        String str3 = this.LLILZIL;
        String str4 = this.LLILZLL;
        HashMap map = new HashMap();
        InterfaceC202184149e interfaceC202184149e = C202185149f.LJ;
        Pair pair = new Pair("aid", C202190149k.LIZ());
        map.put(pair.getFirst(), pair.getSecond());
        InterfaceC202184149e interfaceC202184149e2 = C202185149f.LJ;
        if (interfaceC202184149e2 == null) {
            interfaceC202184149e2 = null;
        }
        interfaceC202184149e2.getClass();
        Pair pair2 = new Pair("lang", BdTuring.getInstance().getConfig().getLanguage());
        map.put(pair2.getFirst(), pair2.getSecond());
        InterfaceC202184149e interfaceC202184149e3 = C202185149f.LJ;
        if (interfaceC202184149e3 == null) {
            interfaceC202184149e3 = null;
        }
        interfaceC202184149e3.getClass();
        Pair pair3 = new Pair("app_name", BdTuring.getInstance().getConfig().getAppName());
        map.put(pair3.getFirst(), pair3.getSecond());
        InterfaceC202184149e interfaceC202184149e4 = C202185149f.LJ;
        if (interfaceC202184149e4 == null) {
            interfaceC202184149e4 = null;
        }
        interfaceC202184149e4.getClass();
        Pair pair4 = new Pair("channel", BdTuring.getInstance().getConfig().getChannel());
        map.put(pair4.getFirst(), pair4.getSecond());
        InterfaceC202184149e interfaceC202184149e5 = C202185149f.LJ;
        Pair pair5 = new Pair("region", C202190149k.LIZJ());
        map.put(pair5.getFirst(), pair5.getSecond());
        Pair pair6 = new Pair("os_type", CardStruct.IStatusCode.DEFAULT);
        map.put(pair6.getFirst(), pair6.getSecond());
        Pair pair7 = new Pair("datetime", String.valueOf(System.currentTimeMillis()));
        map.put(pair7.getFirst(), pair7.getSecond());
        InterfaceC202184149e interfaceC202184149e6 = C202185149f.LJ;
        if (interfaceC202184149e6 == null) {
            interfaceC202184149e6 = null;
        }
        interfaceC202184149e6.getClass();
        Pair pair8 = new Pair("sdk_version", "3.2.3.i18n");
        map.put(pair8.getFirst(), pair8.getSecond());
        InterfaceC202184149e interfaceC202184149e7 = C202185149f.LJ;
        if (interfaceC202184149e7 == null) {
            interfaceC202184149e7 = null;
        }
        interfaceC202184149e7.getClass();
        Pair pair9 = new Pair("iid", BdTuring.getInstance().getConfig().getInstallId());
        map.put(pair9.getFirst(), pair9.getSecond());
        InterfaceC202184149e interfaceC202184149e8 = C202185149f.LJ;
        Pair pair10 = new Pair("app_version", C202190149k.LIZIZ());
        map.put(pair10.getFirst(), pair10.getSecond());
        Pair pair11 = new Pair("os_name", "Android");
        map.put(pair11.getFirst(), pair11.getSecond());
        Pair pair12 = new Pair("os_version", String.valueOf(Build.VERSION.SDK_INT));
        map.put(pair12.getFirst(), pair12.getSecond());
        InterfaceC202184149e interfaceC202184149e9 = C202185149f.LJ;
        if (interfaceC202184149e9 == null) {
            interfaceC202184149e9 = null;
        }
        interfaceC202184149e9.getClass();
        Pair pair13 = new Pair("did", BdTuring.getInstance().getConfig().getDeviceId());
        map.put(pair13.getFirst(), pair13.getSecond());
        String strEncode = Build.BRAND;
        try {
            strEncode = URLEncoder.encode(strEncode, "utf-8");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            C14A6.LIZIZ();
        }
        Pair pair14 = new Pair("device_brand", strEncode);
        map.put(pair14.getFirst(), pair14.getSecond());
        Pair pair15 = new Pair("detail", str);
        map.put(pair15.getFirst(), pair15.getSecond());
        Pair pair16 = new Pair("result", String.valueOf(i));
        map.put(pair16.getFirst(), pair16.getSecond());
        String strLJI = C202185149f.LJI("common");
        String strLJ = strLJI == null ? null : C202185149f.LJ(strLJI, "api/v1/dispose/login/report");
        if (strLJ != null) {
            C202185149f c202185149f2 = C202185149f.LIZ;
            strLIZLLL = C202185149f.LIZLLL(strLJ);
        } else {
            if (C14A6.LIZ()) {
                throw new RuntimeException("url should not empty");
            }
            strLIZLLL = null;
        }
        if (c14a3 == null) {
            return;
        }
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        InterfaceC202184149e interfaceC202184149e10 = C202185149f.LJ;
        (interfaceC202184149e10 != null ? interfaceC202184149e10 : null).getClass();
        InterfaceC2178208g8 httpClient = BdTuring.getInstance().getConfig().getHttpClient();
        C202189149j c202189149j = new C202189149j(strLIZLLL, map, c14a3, httpClient);
        try {
            String strJ3 = C786410Ut5.J3(new JSONObject(map));
            Charset charset = Charsets.UTF_8;
            byte[] bytes = strJ3.getBytes(charset);
            String strClientPackedBase64 = Sword.clientPackedBase64(bytes, bytes.length);
            if (strClientPackedBase64 == null) {
                try {
                    c14a3.LIZ(0, 0, 3, 0, str4, str2, str3, "");
                } catch (Exception e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    c202189149j.LIZIZ.LIZ(0, 0, 2, 0, str4, str2, str3, "");
                }
            }
            String strJ32 = C786410Ut5.J3(new JSONObject().put("message", strClientPackedBase64));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("Content-type", "application/json;tt-data=g");
            byte[] bytes2 = strJ32.getBytes(charset);
            if (bytes2 == null) {
                bytes2 = new byte[0];
            }
            byte[] bArrPost = httpClient.post(strLIZLLL, linkedHashMap, bytes2);
            if (bArrPost.length > 0) {
                String str5 = new String(bArrPost, charset);
                new JSONObject();
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    c14a3.LIZ(200, jSONObject.optInt("code"), jSONObject.optInt("result"), jSONObject.optInt("error_code"), str4, str2, str3, jSONObject.optString("custom", ""));
                } catch (JSONException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    try {
                        c202189149j.LIZIZ.LIZ(0, 0, 2, 0, str4, str2, str3, "");
                    } catch (Exception e4) {
                        e = e4;
                        TryCatchGuardChecker.doCheck(e);
                        c202189149j.LIZIZ.LIZ(0, 0, 2, 0, str4, str2, str3, "");
                    }
                }
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SettingsManager$taskReportRunable@ca16.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SettingsManager$taskReportRunable@ca16.run");
    }
}
