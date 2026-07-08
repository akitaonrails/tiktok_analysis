package X;

import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.api.IJSInjectCallback$ErrorCode;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0qIv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544870qIv {
    public final long LIZ;
    public Long LIZIZ;
    public final C1544980qJ6 LIZJ;
    public final C1544950qJ3 LIZLLL;
    public final C1544820qIq LJ;
    public final C1544930qJ1 LJFF;
    public final C1545000qJ8 LJI;
    public final C1544990qJ7 LJII;
    public final C1545020qJA LJIIIIZZ;
    public C1047790dNB LJIIIZ;

    public final C1047790dNB LIZJ() {
        if (this.LJIIIZ == null) {
            HashMap map = new HashMap();
            Long l = this.LJ.LIZLLL;
            if (l != null) {
                map.put("config_check_duration", Long.valueOf(l.longValue()));
            }
            Long l2 = this.LJ.LIZJ;
            if (l2 != null) {
                map.put("config_load_duration", Long.valueOf(l2.longValue()));
            }
            Long l3 = this.LIZLLL.LJI;
            if (l3 != null) {
                map.put("script_load_duration", Long.valueOf(l3.longValue()));
            }
            this.LJII.LIZIZ(map);
            this.LJIIIIZZ.LIZIZ(map);
            this.LJFF.LIZIZ(map);
            this.LIZLLL.LIZIZ(map);
            if (this.LIZIZ == null) {
                this.LIZIZ = Long.valueOf(System.currentTimeMillis() - this.LIZ);
            }
            Long l4 = this.LIZIZ;
            this.LJIIIZ = new C1047790dNB(l4 != null ? l4.longValue() : 0L, map);
        }
        return this.LJIIIZ;
    }

    public C1544870qIv() {
        this(System.currentTimeMillis());
    }

    public final C1047860dNI LIZLLL() {
        C1047790dNB c1047790dNBLIZJ = LIZJ();
        C1544980qJ6 c1544980qJ6 = this.LIZJ;
        return new C1047860dNI(c1544980qJ6.LIZLLL, c1544980qJ6.LJ, c1047790dNBLIZJ);
    }

    public C1544870qIv(long j) {
        this.LIZ = j;
        this.LIZJ = new C1544980qJ6();
        this.LIZLLL = new C1544950qJ3();
        this.LJ = new C1544820qIq();
        this.LJFF = new C1544930qJ1();
        this.LJI = new C1545000qJ8();
        this.LJII = new C1544990qJ7();
        this.LJIIIIZZ = new C1545020qJA();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r8, boolean r9, java.lang.String r10, java.lang.Throwable r11, com.bytedance.hybrid.spark.security.web_js.api.IJSInjectCallback$ErrorCode r12, java.lang.String r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1544870qIv.LIZ(int, boolean, java.lang.String, java.lang.Throwable, com.bytedance.hybrid.spark.security.web_js.api.IJSInjectCallback$ErrorCode, java.lang.String):void");
    }

    public static void LIZIZ(C1544870qIv c1544870qIv, WebView webView, boolean z, String str, Throwable th, IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode, String str2, int i) {
        IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode2 = iJSInjectCallback$ErrorCode;
        Throwable th2 = th;
        String str3 = null;
        if ((i & 8) != 0) {
            th2 = null;
        }
        if ((i & 16) != 0) {
            iJSInjectCallback$ErrorCode2 = null;
        }
        if ((i & 32) == 0) {
            str3 = str2;
        }
        c1544870qIv.getClass();
        if (webView != null) {
            c1544870qIv.LIZ(webView.hashCode(), z, str, th2, iJSInjectCallback$ErrorCode2, str3);
        }
    }
}
