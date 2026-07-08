package X;

import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.LoginModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.ss.android.ugc.aweme.web.experiment.IABLoginConfigExp;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AwS124S0101000_16;
import kotlin.jvm.internal.AwS130S1100000_16;
import kotlin.jvm.internal.AwS6S3100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dNO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1047920dNO implements InterfaceC1039610d9z {
    public final SparkContext LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public int LJ;
    public final C1035880d3y LJFF;
    public String LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public final JSONObject LJIIJ;
    public final JSONArray LJIIJJI;
    public final Pattern LJIIL;
    public final Pattern LJIILIIL;
    public Boolean LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;

    @Override // X.InterfaceC1039610d9z
    public final void LIZJ() {
        if (this.LIZIZ == null || this.LIZJ == null) {
            return;
        }
        this.LJIIIZ = true;
    }

    @Override // X.InterfaceC1039610d9z
    public final void LIZLLL() {
        if (this.LIZIZ == null || this.LIZJ == null) {
            return;
        }
        LJII(true);
        LJ(this.LJ);
    }

    public final void LJI() {
        WebView webView;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        C1035880d3y c1035880d3y = this.LJFF;
        if (c1035880d3y != null) {
            c1035880d3y.setLoginModel(new LoginModel(this.LIZIZ, this.LIZJ, this.LIZLLL));
        }
        SparkContext sparkContext = this.LIZ;
        View viewE1 = null;
        if (sparkContext != null && (interfaceC1541990qEHLJIJJ = sparkContext.LJIJJ()) != null) {
            viewE1 = interfaceC1541990qEHLJIJJ.e1();
        }
        if (!(viewE1 instanceof WebView) || (webView = (WebView) viewE1) == null) {
            return;
        }
        C1544770qIl.LIZ(webView, new AbstractC843740X8a() { // from class: X.0dNP
            @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
            public final String LJFF(Uri uri, WebView webView2) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_id", this.LIZ.LIZIZ);
                jSONObject.put("login_type", this.LIZ.LIZJ);
                jSONObject.put("login_method", this.LIZ.LIZLLL);
                return C786410Ut5.J3(jSONObject);
            }
        });
    }

    public C1047920dNO(SparkContext sparkContext) {
        JSONArray jSONArrayNames;
        this.LIZ = sparkContext;
        try {
            String str = ((IABLoginConfigExp.IABLoginConfig) IABLoginConfigExp.LIZIZ.getValue()).thirdRegulars;
            this.LJIIJ = new JSONObject(str == null ? "" : str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        JSONObject jSONObject = this.LJIIJ;
        if (jSONObject != null) {
            jSONArrayNames = jSONObject.names();
        } else {
            jSONArrayNames = null;
        }
        this.LJIIJJI = jSONArrayNames;
        C01GW c01gw = IABLoginConfigExp.LIZIZ;
        String str2 = ((IABLoginConfigExp.IABLoginConfig) c01gw.getValue()).firstRegulars;
        if (str2 != null) {
            this.LJIIL = PatternProtector.compile(str2);
        }
        String str3 = ((IABLoginConfigExp.IABLoginConfig) c01gw.getValue()).firstPartyCancel;
        if (str3 != null) {
            this.LJIILIIL = PatternProtector.compile(str3);
        }
        SparkContext sparkContext2 = this.LIZ;
        this.LJFF = sparkContext2 != null ? (C1035880d3y) sparkContext2.LJFF(C1035880d3y.class) : null;
    }

    @Override // X.InterfaceC1039610d9z
    public final void LIZIZ(String str) {
        AwemeRawAd awemeRawAd;
        if (this.LIZIZ == null || this.LIZJ == null || Intrinsics.LJFF(this.LIZJ, "third_party") || this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        C1035880d3y c1035880d3y = this.LJFF;
        if (c1035880d3y == null) {
            return;
        }
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(c1035880d3y);
        C1023960ckk c1023960ckk = C2265801DmM.LIZ;
        C1035880d3y c1035880d3y2 = this.LJFF;
        if (c1035880d3y2 != null) {
            awemeRawAd = c1035880d3y2.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        adWebEventLogger.logAd(c1023960ckk, awemeRawAd, new AwS130S1100000_16(this, str, 20));
    }

    public final void LJ(int i) {
        AwemeRawAd awemeRawAd;
        C1035880d3y c1035880d3y = this.LJFF;
        if (c1035880d3y == null) {
            return;
        }
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(c1035880d3y);
        C1023960ckk c1023960ckk = C2265901DmW.LIZ;
        C1035880d3y c1035880d3y2 = this.LJFF;
        if (c1035880d3y2 != null) {
            awemeRawAd = c1035880d3y2.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        adWebEventLogger.logAd(c1023960ckk, awemeRawAd, new AwS124S0101000_16(this, i, 17));
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
        LJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(boolean r4) {
        /*
            r3 = this;
            r2 = 2
            java.lang.String r1 = "third_party"
            if (r4 == 0) goto L1f
            java.lang.String r0 = r3.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto L15
            boolean r0 = r3.LJIIIZ
            if (r0 == 0) goto L1d
        L11:
            r2 = 0
        L12:
            r3.LJ = r2
            return
        L15:
            boolean r0 = r3.LJIIIZ
            if (r0 != 0) goto L11
            boolean r0 = r3.LJIIIIZZ
            if (r0 == 0) goto L12
        L1d:
            r2 = 3
            goto L12
        L1f:
            boolean r0 = r3.LJIIIIZZ
            if (r0 != 0) goto L2b
            java.lang.String r0 = r3.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto L12
        L2b:
            r2 = 1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1047920dNO.LJII(boolean):void");
    }

    @Override // X.InterfaceC1039610d9z
    public final void checkUrl(String str) {
        boolean z;
        boolean z2;
        String path;
        String host;
        String path2;
        Uri uri;
        String host2;
        Uri uri2;
        Pattern pattern;
        Matcher matcher;
        String host3;
        String host4;
        Uri uri3;
        Pattern pattern2;
        String string;
        String str2;
        this.LJIILJJIL = null;
        this.LJIILL = null;
        this.LJIILLIIL = null;
        if (a0.LJJJIL(str)) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "";
        if (!z) {
            String path3 = UriProtector.parse(str).getPath();
            if (path3 == null) {
                path3 = "";
            }
            String host5 = UriProtector.parse(str).getHost();
            if (host5 == null) {
                host5 = "";
            }
            if (Intrinsics.LJFF(this.LIZJ, "third_party") && (str2 = this.LIZLLL) != null && a0.LJJIIZI(host5, str2, false)) {
                this.LJIILJJIL = Boolean.TRUE;
                this.LJIILL = this.LIZJ;
                this.LJIILLIIL = this.LIZLLL;
            } else {
                JSONArray jSONArray = this.LJIIJJI;
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    loop0: for (int i = 0; i < length; i++) {
                        if (a0.LJJIIZI(host5, JSONArrayProtectorUtils.getString(jSONArray, i), false)) {
                            try {
                                JSONObject jSONObject = this.LJIIJ;
                                if (jSONObject == null || (string = JSONObjectProtectorUtils.getString(jSONObject, JSONArrayProtectorUtils.getString(jSONArray, i))) == null) {
                                    string = "";
                                }
                                JSONArray jSONArray2 = new JSONArray(string);
                                int length2 = jSONArray2.length();
                                for (int i2 = 0; i2 < length2; i2++) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(host5);
                                    sbLIZ.append(path3);
                                    if (a0.LJJIIZI(C2188811AlT.LIZIZ(sbLIZ), JSONArrayProtectorUtils.getString(jSONArray2, i2), false)) {
                                        this.LJIILJJIL = Boolean.TRUE;
                                        this.LJIILL = "third_party";
                                        this.LJIILLIIL = JSONArrayProtectorUtils.getString(jSONArray, i);
                                        break loop0;
                                    }
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                    pattern2 = this.LJIIL;
                    if (pattern2 != null && pattern2.matcher(str).find()) {
                        this.LJIILJJIL = Boolean.TRUE;
                        this.LJIILL = "first_party";
                        this.LJIILLIIL = "first_party";
                    }
                } else {
                    pattern2 = this.LJIIL;
                    if (pattern2 != null) {
                        this.LJIILJJIL = Boolean.TRUE;
                        this.LJIILL = "first_party";
                        this.LJIILLIIL = "first_party";
                    }
                }
            }
        }
        Boolean bool = this.LJIILJJIL;
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.LJFF(bool, bool2) || !Intrinsics.LJFF(this.LJIILL, "third_party")) {
            this.LJI = str;
            this.LJII = false;
        }
        if (this.LIZIZ != null && this.LIZJ != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (!Intrinsics.LJFF(this.LJIILJJIL, bool2)) {
                return;
            }
            if (Intrinsics.LJFF(this.LJIILL, "third_party")) {
                String str4 = this.LJI;
                if (str4 == null || (uri3 = UriProtector.parse(str4)) == null || (host3 = uri3.getHost()) == null) {
                    host3 = "";
                }
                Uri uri4 = UriProtector.parse(str);
                if (uri4 != null && (host4 = uri4.getHost()) != null) {
                    str3 = host4;
                }
                this.LJII = Intrinsics.LJFF(host3, str3);
            }
            LJFF(this.LJIILL, this.LJIILLIIL, "url_change");
            return;
        }
        if (!Intrinsics.LJFF(this.LJIILJJIL, bool2)) {
            C1035880d3y c1035880d3y = this.LJFF;
            if (c1035880d3y != null && c1035880d3y.isBack() == 1) {
                LJII(true);
                LJ(this.LJ);
                return;
            }
            LJII(false);
            if (Intrinsics.LJFF(this.LIZJ, "first_party") && (pattern = this.LJIILIIL) != null && (matcher = pattern.matcher(str)) != null && matcher.find()) {
                this.LJ = 3;
            }
            LJ(this.LJ);
            return;
        }
        if (Intrinsics.LJFF(this.LIZLLL, this.LJIILLIIL)) {
            C1035880d3y c1035880d3y2 = this.LJFF;
            if ((c1035880d3y2 != null && c1035880d3y2.isBack() == 1) || !Intrinsics.LJFF(this.LIZJ, "third_party")) {
                return;
            }
            Uri uri5 = UriProtector.parse(str);
            if (uri5 == null || (path = uri5.getPath()) == null) {
                path = "";
            }
            Uri uri6 = UriProtector.parse(str);
            if (uri6 == null || (host = uri6.getHost()) == null) {
                host = "";
            }
            String str5 = this.LJI;
            if (str5 == null || (uri2 = UriProtector.parse(str5)) == null || (path2 = uri2.getPath()) == null) {
                path2 = "";
            }
            String str6 = this.LJI;
            if (str6 != null && (uri = UriProtector.parse(str6)) != null && (host2 = uri.getHost()) != null) {
                str3 = host2;
            }
            if (this.LJII) {
                if (!Intrinsics.LJFF(path, path2) || !Intrinsics.LJFF(host, str3)) {
                    return;
                }
                this.LJ = 1;
                LJ(1);
                return;
            }
            if (!Intrinsics.LJFF(host, str3)) {
                return;
            }
            this.LJ = 1;
            LJ(1);
            return;
        }
        C1035880d3y c1035880d3y3 = this.LJFF;
        if ((c1035880d3y3 != null && c1035880d3y3.isBack() == 1) || !Intrinsics.LJFF(this.LIZJ, "third_party")) {
            if (this.LJIIIZ) {
                this.LJ = 0;
            } else if (this.LJIIIIZZ) {
                this.LJ = 3;
            } else {
                this.LJ = 4;
            }
        } else {
            this.LJ = 1;
        }
        LJ(this.LJ);
        LJFF(this.LJIILL, this.LJIILLIIL, "url_change");
    }

    @Override // X.InterfaceC1039610d9z
    public final void LIZ(String str, String str2) {
        LJFF(str, str2, "js_callback");
    }

    public final void LJFF(String str, String str2, String str3) {
        AwemeRawAd awemeRawAd;
        if (this.LJFF == null || this.LIZIZ != null) {
            return;
        }
        String string = UUID.randomUUID().toString();
        this.LIZIZ = string;
        this.LIZJ = str;
        this.LIZLLL = str2;
        C1035880d3y c1035880d3y = this.LJFF;
        if (c1035880d3y != null) {
            c1035880d3y.setLoginModel(new LoginModel(string, str, str2));
        }
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LJFF);
        C1023960ckk c1023960ckk = C2265841DmQ.LIZ;
        C1035880d3y c1035880d3y2 = this.LJFF;
        if (c1035880d3y2 != null) {
            awemeRawAd = c1035880d3y2.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        adWebEventLogger.logAd(c1023960ckk, awemeRawAd, new AwS6S3100000_16(this, str, str2, str3, 2));
        LJI();
    }
}
