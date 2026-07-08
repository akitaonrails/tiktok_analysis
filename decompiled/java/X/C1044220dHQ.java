package X;

import Y.ARunnableS85S0200000_16;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.web.utils.UploadFileFragment;
import java.util.Map;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS56S1300000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dHQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044220dHQ implements InterfaceC2206121BVy {
    public final C1039440d9i LIZ;
    public final UploadFileFragment LIZIZ;

    @Override // X.InterfaceC2206121BVy
    public final void LIZLLL(PermissionRequest permissionRequest) {
        C2487409ou.LIZJ(new ARunnableS85S0200000_16(this, permissionRequest, 19));
    }

    @Override // X.InterfaceC2206121BVy
    public final void LJ(String str) {
        String refer;
        String strOptString;
        String strOptString2;
        Map map;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConsoleMessage");
        C1035880d3y c1035880d3y = this.LIZ.LIZ;
        Map map2 = null;
        if (c1035880d3y != null) {
            refer = c1035880d3y.getRefer();
        } else {
            refer = null;
        }
        sbLIZ.append(refer);
        sbLIZ.append(" message ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str != null) {
            C1039700dA8.LIZ.getClass();
            if (!TextUtils.isEmpty(str) && u.LJJIIJZLJL(str, "bytedance://log_event_v3", false)) {
                Uri uri = UriProtector.parse(str);
                if (Intrinsics.LJFF("log_event_v3", uri.getHost()) && !C1039700dA8.LIZIZ) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "event");
                    String str2 = "";
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                    }
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "params");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                        str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                    }
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.optInt("is_ad_event") == 1) {
                        String strOptString3 = jSONObject.optString("tag");
                        String strOptString4 = jSONObject.optString("value");
                        if (jSONObject.has("log_extra")) {
                            strOptString = jSONObject.optString("log_extra");
                        } else {
                            strOptString = null;
                        }
                        if (jSONObject.has("group_id")) {
                            strOptString2 = jSONObject.optString("group_id");
                        } else {
                            strOptString2 = null;
                        }
                        String strOptString5 = jSONObject.optString("ad_extra_data");
                        try {
                            map = (Map) C08JS.LIZIZ().LJIIIIZZ(C786410Ut5.J3(jSONObject), Map.class);
                        } catch (Exception e) {
                            e = e;
                            map = null;
                        }
                        try {
                            map2 = (Map) C08JS.LIZIZ().LJIIIIZZ(strOptString5, Map.class);
                        } catch (Exception e2) {
                            e = e2;
                            TryCatchGuardChecker.doCheck(e);
                        }
                        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ(strOptString3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strOptString4, strOptString, strOptString2);
                        c1022820ciuLJ.LIZLLL(map);
                        c1022820ciuLJ.LIZ(map2);
                        c1022820ciuLJ.LJII();
                    } else {
                        C20684815ws.LJIJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, jSONObject);
                    }
                    C1039700dA8.LIZIZ = true;
                }
            }
        }
    }

    public C1044220dHQ(WebKitView webKitView, C1039440d9i c1039440d9i) {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        FragmentManager supportFragmentManager2;
        Context context;
        this.LIZ = c1039440d9i;
        Fragment fragmentLJJJJZI = null;
        if (webKitView == null || (context = webKitView.getContext()) == null) {
            c19eg = null;
        } else {
            for (context = webKitView.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof C19GS) {
                    c19eg = (C19EG) context;
                    break;
                }
            }
            c19eg = null;
        }
        if (c19eg != null && (supportFragmentManager2 = c19eg.getSupportFragmentManager()) != null) {
            fragmentLJJJJZI = supportFragmentManager2.LJJJJZI("web_view_upload_file");
        }
        if (!(fragmentLJJJJZI instanceof UploadFileFragment)) {
            UploadFileFragment uploadFileFragment = new UploadFileFragment();
            this.LIZIZ = uploadFileFragment;
            if (c19eg != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
                c19ehLJIIJ.LIZLLL(uploadFileFragment, "web_view_upload_file");
                c19ehLJIIJ.LJIIJ();
                return;
            }
            return;
        }
        this.LIZIZ = (UploadFileFragment) fragmentLJJJJZI;
    }

    @Override // X.InterfaceC2206121BVy
    public final void LIZ(String str, GeolocationPermissions.Callback callback) throws Throwable {
        Activity activityLIZIZ;
        int i;
        C1035880d3y c1035880d3y = this.LIZ.LIZ;
        if (c1035880d3y != null && !c1035880d3y.isPreviewMode()) {
            C1035880d3y c1035880d3y2 = this.LIZ.LIZ;
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null) {
                activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
            } else {
                activityLIZIZ = null;
            }
            if (activityLIZIZ != null && C1194170hBH.LIZ(activityLIZIZ)) {
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (!C0C64.LJIILLIIL().LJIIIZ(31744, "opt_iab_location_permission", true, false)) {
                    if (c1035880d3y2 == null || !c1035880d3y2.getLocationGranted()) {
                        if (C145T.LIZ(activityLIZIZ) == 1) {
                            i = 2131824772;
                        } else {
                            i = 2131824771;
                        }
                        C1397580mTM c1397580mTM = new C1397580mTM(activityLIZIZ);
                        c1397580mTM.LJFF(2131824773);
                        c1397580mTM.LIZ(i);
                        C985403tE.LIZ(c1397580mTM, new AwS56S1300000_16(c1035880d3y2, activityLIZIZ, callback, str, 4));
                        c1397580mTM.LJII = false;
                        new C1397510mTF(c1397580mTM).LIZLLL();
                        return;
                    }
                }
                C1047370dMV.LJ(c1035880d3y2, "location", 1, Integer.valueOf(C145T.LIZ(activityLIZIZ)));
                if (callback != null) {
                    C2204961BRm.LLJI(callback, str, true, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHe2SDcuVPPA9qvIScSqO3DrTNbubo5w0Ps8Fqb/frn", null));
                    return;
                }
                return;
            }
            C1047370dMV.LJ(c1035880d3y2, "location", 0, Integer.valueOf(C145T.LIZ(activityLIZIZ)));
            if (callback != null) {
                C2204961BRm.LLJI(callback, str, false, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHe2SDcuVPPA9qvIScSqO3DrTNbubo5w0Ps8Fqb/frn", null));
            }
        }
    }

    @Override // X.InterfaceC2206121BVy
    public final void LIZJ(WebView webView, String str) {
        String refer;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceivedTitle");
        C1035880d3y c1035880d3y = this.LIZ.LIZ;
        String url = null;
        if (c1035880d3y != null) {
            refer = c1035880d3y.getRefer();
        } else {
            refer = null;
        }
        sbLIZ.append(refer);
        sbLIZ.append(" webview.url ");
        if (webView != null) {
            url = webView.getUrl();
        }
        sbLIZ.append(url);
        sbLIZ.append(" title ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC2206121BVy
    public final void onProgressChanged(WebView webView, int i) {
        String refer;
        C1040740dBo c1040740dBo;
        InterfaceC1038430d85 interfaceC1038430d85;
        C1035880d3y c1035880d3y = this.LIZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onProgressChanged");
        String url = null;
        if (c1035880d3y != null) {
            refer = c1035880d3y.getRefer();
        } else {
            refer = null;
        }
        sbLIZ.append(refer);
        sbLIZ.append(" webview.url ");
        if (webView != null) {
            url = webView.getUrl();
        }
        sbLIZ.append(url);
        sbLIZ.append(" newProgress ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if (webView == null) {
            return;
        }
        SparkContext sparkContext = this.LIZ.LIZIZ;
        if (sparkContext != null && (interfaceC1038430d85 = (InterfaceC1038430d85) sparkContext.LJFF(InterfaceC1038430d85.class)) != null) {
            interfaceC1038430d85.LIZ(new C1040000dAc(i));
        }
        if (!C1035990d49.LJFF(webView.getUrl()) && (c1040740dBo = this.LIZ.LIZLLL) != null) {
            String url2 = webView.getUrl();
            boolean z = !C1039700dA8.LJII(this.LIZ.LIZ);
            AwS417S0200000_16 awS417S0200000_16 = new AwS417S0200000_16(this, webView, 35);
            SparkContext sparkContext2 = this.LIZ.LIZIZ;
            if (url2 != null && url2.length() != 0 && Intrinsics.LJFF(c1040740dBo.LLJI, url2) && i > 10) {
                if (!c1040740dBo.LLJJI.contains(10)) {
                    c1040740dBo.LLJJI.add(10);
                    c1040740dBo.LJJLIIIJL(sparkContext2, 10);
                }
                if (i > 30) {
                    if (!c1040740dBo.LLJJI.contains(30)) {
                        c1040740dBo.LLJJI.add(30);
                        c1040740dBo.LJJLIIIJL(sparkContext2, 30);
                    }
                    if (i > 50) {
                        if (!c1040740dBo.LLJJI.contains(50)) {
                            c1040740dBo.LLJJI.add(50);
                            c1040740dBo.LJJLIIIJL(sparkContext2, 50);
                        }
                        if (i > 75) {
                            if (!c1040740dBo.LLJJI.contains(75)) {
                                c1040740dBo.LLJJI.add(75);
                                c1040740dBo.LJJLIIIJL(sparkContext2, 75);
                            }
                            if (i == 100 && !c1040740dBo.LLJJI.contains(100)) {
                                c1040740dBo.LLJJI.add(100);
                                c1040740dBo.LJJLIIIJL(sparkContext2, 100);
                                if (C07J2.LIZ() && z) {
                                    c1040740dBo.LJJZZI(awS417S0200000_16, webView);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
    
        if (X.C838410Wul.LIZ(r9, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) goto L37;
     */
    @Override // X.InterfaceC2206121BVy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(android.webkit.WebView r17, final android.webkit.ValueCallback<android.net.Uri[]> r18, final android.webkit.WebChromeClient.FileChooserParams r19) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1044220dHQ.LIZIZ(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
    }
}
