package X;

import Y.ARunnableS10S1200000_4;
import android.net.Uri;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ikc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254520ikc extends C2202271BHd {
    public final C1254450ikV LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public C1749280vcc LIZLLL;
    public String LJ;

    public final boolean LJIIIIZZ() {
        C1749280vcc c1749280vcc = this.LIZLLL;
        return c1749280vcc != null && c1749280vcc.getVisibility() == 0;
    }

    public static String LJI(String str) {
        Uri uri = UriProtector.parse(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String host = uri.getHost();
        String str2 = "";
        if (host == null) {
            host = "";
        }
        sbLIZ.append(host);
        String path = uri.getPath();
        if (path != null) {
            str2 = path;
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C2202271BHd
    public final boolean LJ(WebView webView, WebResourceRequest webResourceRequest) {
        String string;
        Uri url;
        C1254450ikV c1254450ikV = this.LIZ;
        if (c1254450ikV != null && c1254450ikV.LJ(webView, webResourceRequest)) {
            return true;
        }
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            string = url.toString();
        } else {
            string = null;
        }
        return LJII(webView, string);
    }

    @Override // X.C2202271BHd
    public final boolean LJFF(WebView webView, String str) {
        C1254450ikV c1254450ikV = this.LIZ;
        if (c1254450ikV != null && c1254450ikV.LJFF(webView, str)) {
            return true;
        }
        return LJII(webView, str);
    }

    public final boolean LJII(WebView webView, String str) {
        int i;
        boolean z;
        String str2;
        if (webView == null || str == null || !u.LJJIIJZLJL(str, "http", true)) {
            return false;
        }
        String strLJI = LJI(str);
        WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
        try {
            int size = webBackForwardListCopyBackForwardList.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i2);
                String strLJI2 = LJI(itemAtIndex.getUrl());
                if (i2 == webBackForwardListCopyBackForwardList.getCurrentIndex()) {
                    z = true;
                } else {
                    z = false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(i2);
                sbLIZ.append("] ");
                if (!z) {
                    str2 = "  HIST";
                } else {
                    str2 = "-> CURRENT";
                }
                sbLIZ.append(str2);
                sbLIZ.append(": ");
                sbLIZ.append(itemAtIndex.getUrl());
                sbLIZ.append(" -> key=");
                sbLIZ.append(strLJI2);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
            String str3 = null;
            if (currentIndex >= 0) {
                int i3 = 0;
                i = 1;
                while (true) {
                    String url = webBackForwardListCopyBackForwardList.getItemAtIndex(i3).getUrl();
                    if (!C1B2T.LJFF(url)) {
                        String strLJI3 = LJI(url);
                        if (str3 != null) {
                            if (!Intrinsics.LJFF(strLJI3, str3)) {
                                i++;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Layer CHANGE: ");
                                sbLIZ2.append(str3);
                                sbLIZ2.append(" -> ");
                                sbLIZ2.append(strLJI3);
                                sbLIZ2.append(", layer count: ");
                                sbLIZ2.append(i);
                                C2188811AlT.LIZIZ(sbLIZ2);
                            } else {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("Layer SAME: ");
                                sbLIZ3.append(strLJI3);
                                sbLIZ3.append(" == ");
                                sbLIZ3.append(str3);
                                sbLIZ3.append(", layer count: ");
                                sbLIZ3.append(i);
                                C2188811AlT.LIZIZ(sbLIZ3);
                            }
                        } else {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("First item: key=");
                            sbLIZ4.append(strLJI3);
                            C2188811AlT.LIZIZ(sbLIZ4);
                        }
                        str3 = strLJI3;
                    }
                    if (i3 == currentIndex) {
                        break;
                    }
                    i3++;
                }
            } else {
                i = 1;
            }
            if (str3 != null) {
                if (!Intrinsics.LJFF(strLJI, str3)) {
                    i++;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("NEW URL will CHANGE layer: ");
                    sbLIZ5.append(str3);
                    sbLIZ5.append(" -> ");
                    sbLIZ5.append(strLJI);
                    sbLIZ5.append(", final layer count: ");
                    sbLIZ5.append(i);
                    C2188811AlT.LIZIZ(sbLIZ5);
                } else {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("NEW URL will STAY in same layer: ");
                    sbLIZ6.append(strLJI);
                    sbLIZ6.append(" == ");
                    sbLIZ6.append(str3);
                    sbLIZ6.append(", final layer count: ");
                    sbLIZ6.append(i);
                    C2188811AlT.LIZIZ(sbLIZ6);
                }
            } else {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("NEW URL is first navigation: ");
                sbLIZ7.append(strLJI);
                sbLIZ7.append(", final layer count: ");
                sbLIZ7.append(i);
                C2188811AlT.LIZIZ(sbLIZ7);
            }
            if (i >= 0) {
                C1254430ikT c1254430ikT = C1254430ikT.LIZ;
                String str4 = this.LIZJ;
                c1254430ikT.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("creator_id", str4);
                c2344009Gk.LJIIIIZZ("url_link", strLJI);
                c2344009Gk.LJIIIIZZ("from_source", "biolink");
                c2344009Gk.LIZJ(i, "layer_level");
                C20684815ws.LJIILLIIL("biolink_click_event", c2344009Gk.LIZ);
                if (i > this.LIZIZ) {
                    HandlerHook.viewPost(webView, new ARunnableS10S1200000_4(webView, this, str, 2));
                    return true;
                }
                return false;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    public C1254520ikc(C1254450ikV c1254450ikV, int i, String str) {
        this.LIZ = c1254450ikV;
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
