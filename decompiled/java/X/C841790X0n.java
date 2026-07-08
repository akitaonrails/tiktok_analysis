package X;

import Y.ARunnableS82S0200000_13;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.net.model.TypeEnum;
import com.ss.android.ugc.aweme.net.model.UnexpectedConfig;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841790X0n implements InterfaceC841900X0y, InterfaceC841910X0z, C0X0V {
    public static final C0VFV<String> LIZJ = new C0VFV<>(5);
    public static final SimpleDateFormat LIZLLL = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
    public final List<UnexpectedConfig> LIZ;
    public final List<UnexpectedConfig> LIZIZ;

    @Override // X.InterfaceC841900X0y
    public final C841880X0w<Request, C0X52<?>> LIZIZ(C841880X0w<Request, C0X52<?>> c841880X0w) {
        return c841880X0w;
    }

    @Override // X.InterfaceC841910X0z
    public final C841880X0w<okhttp3.Request, C0XLY> LJFF(C841880X0w<okhttp3.Request, C0XLY> c841880X0w) {
        return c841880X0w;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:34:0x0097
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // X.InterfaceC841910X0z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C841880X0w<okhttp3.Request, X.C0XLY> LIZ(X.C841880X0w<okhttp3.Request, X.C0XLY> r10) {
        /*
            r9 = this;
            R r0 = r10.LIZIZ
            X.0XLY r0 = (X.C0XLY) r0
            okhttp3.Request r0 = r0.LL
            X.0XLQ r0 = r0.url()
            java.net.URI r0 = r0.LJIL()
            java.lang.String r0 = r0.toString()
            android.net.Uri r4 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.String r3 = "4"
            r2 = 0
            r9.LJII(r4, r3, r2, r2)
            java.util.List<com.ss.android.ugc.aweme.net.model.UnexpectedConfig> r0 = r9.LIZIZ
            boolean r0 = r0.isEmpty()
            r7 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto Lb7
            R r8 = r10.LIZIZ
            X.0XLY r8 = (X.C0XLY) r8
            if (r8 == 0) goto La1
            X.0X3h r0 = r8.LLIZ
            if (r0 == 0) goto L80
            X.0X0P r0 = r0.contentType()
            if (r0 == 0) goto L80
            java.lang.String r0 = r0.LIZ
        L39:
            boolean r1 = X.C08S5.LIZ(r0)
            X.0X3h r0 = r8.LLIZ
            if (r0 == 0) goto L7e
            X.0p36 r0 = r0.source()
            if (r0 == 0) goto L7e
            X.0p3D r6 = r0.buffer()
        L4b:
            if (r1 == 0) goto La1
            if (r6 == 0) goto La1
            X.0X3h r0 = r8.LLIZ
            if (r0 == 0) goto L61
            X.0p36 r5 = r0.source()
            if (r5 == 0) goto L61
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5.request(r0)
        L61:
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r5 = ""
            java.lang.String r0 = r8.LIZ(r0, r5)
            java.lang.String r1 = "gzip"
            boolean r0 = kotlin.text.u.LJIJI(r1, r0, r7)
            if (r0 != 0) goto L82
            java.lang.String r0 = "content-encoding"
            java.lang.String r0 = r8.LIZ(r0, r5)
            boolean r0 = kotlin.text.u.LJIJI(r1, r0, r7)
            if (r0 == 0) goto La6
            goto L82
        L7e:
            r6 = r2
            goto L4b
        L80:
            r0 = r2
            goto L39
        L82:
            X.0p3A r1 = new X.0p3A     // Catch: java.lang.Throwable -> L97
            X.0p3D r0 = r6.clone()     // Catch: java.lang.Throwable -> L97
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L97
            X.0p3D r6 = new X.0p3D     // Catch: java.lang.Throwable -> L94
            r6.<init>()     // Catch: java.lang.Throwable -> L94
            r6.LLIIJI(r1)     // Catch: java.lang.Throwable -> L94
            goto La3
        L94:
            r0 = move-exception
            r2 = r1
            goto L98
        L97:
            r0 = move-exception
        L98:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto La0
            r2.close()
        La0:
            throw r0
        La1:
            r0 = r2
            goto Lb4
        La3:
            r1.close()
        La6:
            X.0p3D r1 = r6.clone()
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r0 = r1.LJJLIIIJILLIZJL(r0)
        Lb4:
            r9.LJ(r4, r3, r0, r2)
        Lb7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C841790X0n.LIZ(X.0X0w):X.0X0w");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff  */
    @Override // X.InterfaceC841900X0y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C841880X0w<com.bytedance.retrofit2.client.Request, X.C0X52<?>> LJI(X.C841880X0w<com.bytedance.retrofit2.client.Request, X.C0X52<?>> r10) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C841790X0n.LJI(X.0X0w):X.0X0w");
    }

    public C841790X0n(List<UnexpectedConfig> list, List<UnexpectedConfig> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
        ArrayList<UnexpectedConfig> arrayList = new ArrayList();
        for (UnexpectedConfig unexpectedConfig : list) {
            C841800X0o c841800X0o = TypeEnum.Companion;
            int i = unexpectedConfig.type;
            c841800X0o.getClass();
            if (C841800X0o.LIZ(i)) {
                arrayList.add(unexpectedConfig);
            }
        }
        for (UnexpectedConfig unexpectedConfig2 : arrayList) {
            unexpectedConfig2.setRegex(new Regex(unexpectedConfig2.pattern));
        }
        List<UnexpectedConfig> list3 = this.LIZIZ;
        ArrayList<UnexpectedConfig> arrayList2 = new ArrayList();
        for (UnexpectedConfig unexpectedConfig3 : list3) {
            C841800X0o c841800X0o2 = TypeEnum.Companion;
            int i2 = unexpectedConfig3.type;
            c841800X0o2.getClass();
            if (C841800X0o.LIZ(i2)) {
                arrayList2.add(unexpectedConfig3);
            }
        }
        for (UnexpectedConfig unexpectedConfig4 : arrayList2) {
            unexpectedConfig4.setRegex(new Regex(unexpectedConfig4.pattern));
        }
    }

    public final void LJ(Uri uri, String str, String str2, String str3) throws JSONException {
        boolean zLJJIIJZLJL;
        Regex regex;
        if (str2 != null && !a0.LJJJIL(str2)) {
            String path = uri.getPath();
            if (path != null && u.LJJIIJZLJL(path, "/tfe/api/request_combine/v", false)) {
                return;
            }
            String path2 = uri.getPath();
            if (path2 != null && u.LJJIIJZLJL(path2, "/aweme/v", false)) {
                String path3 = uri.getPath();
                if (path3 != null && u.LJIIZILJ(path3, "/settings/", false)) {
                    return;
                }
                String path4 = uri.getPath();
                if (path4 != null && u.LJIIZILJ(path4, "/abtest/param/", false)) {
                    return;
                }
            }
            List<UnexpectedConfig> list = this.LIZIZ;
            ArrayList<UnexpectedConfig> arrayList = new ArrayList();
            for (UnexpectedConfig unexpectedConfig : list) {
                List<String> list2 = unexpectedConfig.targets;
                if (list2 == null || list2.contains(str)) {
                    arrayList.add(unexpectedConfig);
                }
            }
            for (UnexpectedConfig unexpectedConfig2 : arrayList) {
                int i = unexpectedConfig2.type;
                if (i == TypeEnum.START_WITH.getType()) {
                    zLJJIIJZLJL = u.LJJIIJZLJL(str2, unexpectedConfig2.pattern, false);
                } else if (i == TypeEnum.CONTAINS.getType()) {
                    zLJJIIJZLJL = a0.LJJIIZI(str2, unexpectedConfig2.pattern, false);
                } else if (i == TypeEnum.REGEX_MATCHES.getType()) {
                    Regex regex2 = unexpectedConfig2.regex;
                    if (regex2 != null) {
                        zLJJIIJZLJL = regex2.matches(str2);
                    }
                } else if (i == TypeEnum.REGEX_CONTAINS_MATCH_IN.getType() && (regex = unexpectedConfig2.regex) != null) {
                    zLJJIIJZLJL = regex.containsMatchIn(str2);
                }
                if (zLJJIIJZLJL) {
                    LJIIIIZZ(this, uri, unexpectedConfig2, str, str3, null, str2, 16);
                }
            }
        }
    }

    public final void LJII(Uri uri, String str, WebView webView, String str2) throws JSONException {
        boolean zLJJIIJZLJL;
        String string = uri.toString();
        List<UnexpectedConfig> list = this.LIZ;
        ArrayList<UnexpectedConfig> arrayList = new ArrayList();
        for (UnexpectedConfig unexpectedConfig : list) {
            List<String> list2 = unexpectedConfig.targets;
            if (list2 == null || list2.contains(str)) {
                arrayList.add(unexpectedConfig);
            }
        }
        for (UnexpectedConfig unexpectedConfig2 : arrayList) {
            int i = unexpectedConfig2.type;
            if (i == TypeEnum.START_WITH.getType()) {
                zLJJIIJZLJL = u.LJJIIJZLJL(string, unexpectedConfig2.pattern, false);
            } else if (i == TypeEnum.CONTAINS.getType()) {
                zLJJIIJZLJL = a0.LJJIIZI(string, unexpectedConfig2.pattern, false);
            } else if (i == TypeEnum.REGEX_MATCHES.getType()) {
                Regex regex = unexpectedConfig2.regex;
                if (regex != null) {
                    zLJJIIJZLJL = regex.matches(string);
                }
            } else if (i == TypeEnum.REGEX_CONTAINS_MATCH_IN.getType()) {
                Regex regex2 = unexpectedConfig2.regex;
                if (regex2 != null) {
                    zLJJIIJZLJL = regex2.containsMatchIn(string);
                }
            } else if (i == TypeEnum.EQUAL.getType()) {
                zLJJIIJZLJL = Intrinsics.LJFF(unexpectedConfig2.pattern, string);
            }
            if (zLJJIIJZLJL) {
                LJIIIIZZ(this, uri, unexpectedConfig2, str, str2, webView, null, 32);
            }
        }
    }

    public static void LJIIIIZZ(C841790X0n c841790X0n, Uri uri, UnexpectedConfig unexpectedConfig, String str, String str2, WebView webView, String str3, int i) throws JSONException {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            webView = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        c841790X0n.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("host", uri.getHost());
        jSONObject.put("path", uri.getPath());
        jSONObject.put("url", uri.toString());
        jSONObject.put("configId", unexpectedConfig.id);
        jSONObject.put("config", unexpectedConfig.toString());
        jSONObject.put("net_type", str);
        jSONObject.put("page", C0W76.LIZ());
        if (str2 != null && !a0.LJJJIL(str2)) {
            jSONObject.put("logid", str2);
        }
        if (str3 != null && !a0.LJJJIL(str3)) {
            jSONObject.put("response", str3);
        }
        if (webView == null) {
            if (Intrinsics.LJFF(str, "2")) {
                jSONObject.put("content", C13LP.LJJLIIIJ(LIZJ, "\n", null, null, 0, null, null, 62));
            }
            C793770VBv.LJ(EnumC841820X0q.UNEXPECTED_NETWORK_LOG.getLogType(), jSONObject);
        } else if (Build.VERSION.SDK_INT == 23 && !webView.isAttachedToWindow()) {
            C793770VBv.LJ(EnumC841820X0q.UNEXPECTED_NETWORK_LOG.getLogType(), jSONObject);
        } else {
            HandlerHook.viewPost(webView, new ARunnableS82S0200000_13(jSONObject, webView, 64));
        }
    }
}
