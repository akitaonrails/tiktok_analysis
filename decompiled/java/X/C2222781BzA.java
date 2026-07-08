package X;

import Y.AObjectS81S0000000_34;
import Y.ARunnableS134S0100000_34;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.mediakit.image.IMIOImageRequest;
import com.ss.mediakit.image.MIOImageClient;
import com.ss.mediakit.image.MIOImageResponse;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BzA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222781BzA extends AbstractC1339120kx4 {
    public volatile IMIOImageRequest LJ;
    public final C01GW<Set<String>> LJFF = C452501pT.LIZIZ(new AObjectS81S0000000_34(3));
    public final MIOImageClient LJI = MIOImageClient.getInstance();
    public C2222771Bz9 LJII;
    public InterfaceC1335890krr LJIIIIZZ;

    public final C2222771Bz9 LJFF() {
        if (this.LJII == null) {
            C2222771Bz9 c2222771Bz9 = new C2222771Bz9();
            this.LJII = c2222771Bz9;
            c2222771Bz9.LIZIZ = this.LIZIZ;
            c2222771Bz9.LIZJ = this.LIZJ;
        }
        return this.LJII;
    }

    @Override // X.InterfaceC1334000koo
    public final void cancel() {
        if (!this.LJI.isMIORunning()) {
            LJFF().cancel();
            return;
        }
        if (C1328570kg3.LJIIJ(2)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mImageRequest:");
            sbLIZ.append(this.LJ);
            C1330590kjJ.LIZJ("MIOImageFetcher", "cancel", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LJ != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.LJ.stop();
            } else {
                this.LIZ.execute(new ARunnableS134S0100000_34(this, 45));
            }
        }
        InterfaceC1335890krr interfaceC1335890krr = this.LJIIIIZZ;
        if (interfaceC1335890krr != null) {
            ((C1335880krq) interfaceC1335890krr).LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJ(com.ss.mediakit.image.MIOImageResponse r6) {
        /*
            com.ss.mediakit.image.MIOImageResponse$ResponseDetail r0 = r6.detail()
            r5 = 0
            if (r0 == 0) goto L70
            java.lang.String r0 = "max-age=\\d+"
            java.util.regex.Pattern r4 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
            com.ss.mediakit.image.MIOImageResponse$ResponseDetail r0 = r6.detail()     // Catch: java.lang.Exception -> L55
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.respHeaders     // Catch: java.lang.Exception -> L55
            if (r1 == 0) goto L42
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> L55
            if (r0 != 0) goto L42
            java.util.Set r0 = r1.entrySet()     // Catch: java.lang.Exception -> L55
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Exception -> L55
        L23:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> L55
            if (r0 == 0) goto L42
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Exception -> L55
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Exception -> L55
            java.lang.String r1 = "Cache-Control"
            java.lang.Object r0 = r2.getKey()     // Catch: java.lang.Exception -> L55
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L55
            if (r0 == 0) goto L23
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L55
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L55
            goto L43
        L42:
            r2 = r5
        L43:
            if (r2 != 0) goto L46
            return r5
        L46:
            java.util.regex.Matcher r1 = r4.matcher(r2)     // Catch: java.lang.Exception -> L57
            boolean r0 = r1.find()     // Catch: java.lang.Exception -> L57
            if (r0 == 0) goto L70
            java.lang.String r5 = r1.group()     // Catch: java.lang.Exception -> L57
            return r5
        L55:
            r1 = move-exception
            goto L59
        L57:
            r1 = move-exception
            r5 = r2
        L59:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            r0 = 2
            boolean r0 = X.C1328570kg3.LJIIJ(r0)
            if (r0 == 0) goto L70
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "MIOImageFetcher"
            java.lang.String r0 = "getCacheControl"
            X.C1330590kjJ.LIZJ(r1, r0, r2)
        L70:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2222781BzA.LJ(com.ss.mediakit.image.MIOImageResponse):java.lang.String");
    }

    public final void LJIILIIL(Uri uri) {
        String str;
        C1516280pYo c1516280pYo;
        if (!TextUtils.isEmpty(uri.getHost())) {
            int iLIZ = C278980Awa.LIZ();
            int i = 1;
            if (iLIZ == 1) {
                str = "prefer_ip";
            } else if (iLIZ == 2) {
                str = "backup_ip";
            } else {
                return;
            }
            C1516490pZ9 value = C1516490pZ9.LIZIZ.getValue();
            String host = uri.getHost();
            value.getClass();
            if (!TextUtils.isEmpty(host) && (c1516280pYo = value.LIZ.get(host)) != null) {
                try {
                    if (c1516280pYo.LIZ() || (((Boolean) C278990Awb.LIZ.getValue()).booleanValue() && !TextUtils.isEmpty(c1516280pYo.LIZ) && c1516280pYo.LIZIZ != null)) {
                        this.LJI.setPreDNS(uri.getHost(), c1516280pYo.LIZ, 0L);
                        if (C1328570kg3.LJIIJ(2)) {
                            int i2 = C2187451AjH.LIZ;
                            C1330590kjJ.LIZJ("MIOImageFetcher", "setPreDnsIpList", C786410Ut5.k4(Locale.US, "ip key: %s, host: %s, ip list: %s", new Object[]{str, uri.getHost(), c1516280pYo.LIZ}));
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("host", uri.getHost());
                    if (!c1516280pYo.LIZ()) {
                        i = 0;
                    }
                    jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
                    if (!TextUtils.isEmpty(c1516280pYo.LIZ)) {
                        jSONObject.put("ipListLength", c1516280pYo.LIZ.split(",").length);
                    }
                    C793770VBv.LJII("m2_feed_image_dns_opt_valid", jSONObject, null, null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (C1328570kg3.LJIIJ(2)) {
                        int i3 = C2187451AjH.LIZ;
                        C1330590kjJ.LIZJ("MIOImageFetcher", "setPreDnsIpList", e.toString());
                    }
                }
            }
        }
    }

    public static C1331400kkc LIZLLL(MIOImageResponse mIOImageResponse, Throwable th) {
        String str;
        if (mIOImageResponse == null) {
            return new C1331400kkc(9999, "response is null", 9999);
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(mIOImageResponse.detail().statusCode);
        String message = "";
        if (TextUtils.isEmpty(mIOImageResponse.detail().url)) {
            str = "";
        } else {
            str = mIOImageResponse.detail().url;
        }
        objArr[1] = str;
        if (th != null) {
            message = th.getMessage();
        }
        objArr[2] = message;
        return new C1331400kkc(9999, C786410Ut5.k4(locale, "statusCode: %d, url: %s, message: %s", objArr), mIOImageResponse.code());
    }

    public static String LJI(String str, Map map) {
        String str2 = null;
        if (map != null && map.size() > 0) {
            for (Map.Entry entry : map.entrySet()) {
                if (str.equalsIgnoreCase((String) entry.getKey())) {
                    str2 = (String) entry.getValue();
                }
            }
        }
        return str2;
    }

    public static final void LJII(InterfaceC1335890krr interfaceC1335890krr, Throwable th) {
        if (interfaceC1335890krr != null) {
            try {
                if ("request canceled".equals(th.getMessage())) {
                    ((C1335880krq) interfaceC1335890krr).LIZ();
                } else {
                    C1328510kfx c1328510kfx = (C1328510kfx) ((C1335880krq) interfaceC1335890krr).LIZ;
                    c1328510kfx.LIZIZ.LJFF(c1328510kfx.LIZ, th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (C1328570kg3.LJIIJ(2)) {
                    int i = C2187451AjH.LIZ;
                    C1330590kjJ.LIZJ("MIOImageFetcher", "handleCancel", th2.toString());
                }
            }
        }
    }

    public static void LJIIIIZZ(Map map, C1333970kol c1333970kol) {
        String str;
        String[] strArrSplit;
        String strLJI = LJI("ImageX-Demotion", map);
        if (strLJI == null) {
            strLJI = "undefined";
        }
        c1333970kol.LJIILJJIL = strLJI;
        String strLJI2 = LJI("ImageX-Fmt", map);
        if (strLJI2 != null && (strArrSplit = strLJI2.split("2")) != null && strArrSplit.length > 0) {
            c1333970kol.LJIILL = strArrSplit[0];
            if (strArrSplit.length > 1) {
                c1333970kol.LJIILLIIL = strArrSplit[1];
            } else {
                c1333970kol.LJIILLIIL = "undefined";
            }
        } else {
            c1333970kol.LJIILL = "undefined";
            c1333970kol.LJIILLIIL = "undefined";
        }
        if (!"undefined".equals(c1333970kol.LJIILL) && !"undefined".equals(c1333970kol.LJIILLIIL)) {
            if (c1333970kol.LJIILL.equalsIgnoreCase(c1333970kol.LJIILLIIL)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c1333970kol.LJIIZILJ = str;
        } else {
            c1333970kol.LJIIZILJ = "-1";
        }
        String strLJI3 = LJI("x-imagex-extra", map);
        if (strLJI3 == null) {
            strLJI3 = "";
        }
        c1333970kol.LJIILIIL = strLJI3;
        String strLJI4 = LJI("x-imagex-blurhash", map);
        if (!TextUtils.isEmpty(strLJI4)) {
            try {
                C1318160kPG c1318160kPG = ((C1333990kon) c1333970kol).LJIJI;
                WeakReference<InterfaceC1336190ksL> weakReferenceLIZ = C720190SMv.LIZ(c1333970kol.LJFF);
                if (weakReferenceLIZ != null && weakReferenceLIZ.get() != null) {
                    weakReferenceLIZ.get().LIZIZ(strLJI4, c1318160kPG);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onAsyncResponse: blurhash exception is ");
                sbLIZ.append(e);
                C1328570kg3.LIZIZ("MIOImageFetcher", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: JSONException -> 0x0047, TryCatch #0 {JSONException -> 0x0047, blocks: (B:2:0x0000, B:5:0x000c, B:7:0x0012, B:9:0x001a, B:12:0x0022, B:14:0x0028, B:16:0x0030, B:19:0x0038, B:21:0x003e, B:23:0x0043, B:15:0x002d, B:8:0x0017), top: B:30:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[Catch: JSONException -> 0x0047, TryCatch #0 {JSONException -> 0x0047, blocks: (B:2:0x0000, B:5:0x000c, B:7:0x0012, B:9:0x001a, B:12:0x0022, B:14:0x0028, B:16:0x0030, B:19:0x0038, B:21:0x003e, B:23:0x0043, B:15:0x002d, B:8:0x0017), top: B:30:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIJJI(org.json.JSONObject r10, X.C1333970kol r11) {
        /*
            long r1 = r11.LIZIZ     // Catch: org.json.JSONException -> L47
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            java.lang.String r7 = "queue_time"
            r3 = -1
            if (r0 == 0) goto L17
            long r5 = r11.LIZ     // Catch: org.json.JSONException -> L47
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L17
            long r1 = r1 - r5
            r10.put(r7, r1)     // Catch: org.json.JSONException -> L47
            goto L1a
        L17:
            r10.put(r7, r3)     // Catch: org.json.JSONException -> L47
        L1a:
            long r1 = r11.LIZJ     // Catch: org.json.JSONException -> L47
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            java.lang.String r7 = "fetch_time"
            if (r0 == 0) goto L2d
            long r5 = r11.LIZIZ     // Catch: org.json.JSONException -> L47
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L2d
            long r1 = r1 - r5
            r10.put(r7, r1)     // Catch: org.json.JSONException -> L47
            goto L30
        L2d:
            r10.put(r7, r3)     // Catch: org.json.JSONException -> L47
        L30:
            long r1 = r11.LIZJ     // Catch: org.json.JSONException -> L47
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            java.lang.String r7 = "total_time"
            if (r0 == 0) goto L43
            long r5 = r11.LIZ     // Catch: org.json.JSONException -> L47
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L43
            long r1 = r1 - r5
            r10.put(r7, r1)     // Catch: org.json.JSONException -> L47
            return
        L43:
            r10.put(r7, r3)     // Catch: org.json.JSONException -> L47
            return
        L47:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            r0 = 2
            boolean r0 = X.C1328570kg3.LJIIJ(r0)
            if (r0 == 0) goto L5f
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "MIOImageFetcher"
            java.lang.String r0 = "handleRequestTime"
            X.C1330590kjJ.LIZJ(r1, r0, r2)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2222781BzA.LJIIJJI(org.json.JSONObject, X.0kol):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        r9 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r24.LJFF, "refresh_token");
        r2 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r24.LJFF, "im-url-refresh");
        r8 = X.C289130BUx.LIZ();
        r6 = ((java.lang.Boolean) X.C1E2X.LIZJ.getValue()).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        if (android.text.TextUtils.isEmpty(r9) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
    
        if (r8 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        if (r6 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
    
        if (android.text.TextUtils.equals(r2, "public-video-cover") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d4, code lost:
    
        r23.LJFF.getValue().add(r24.LIZLLL);
        r2 = X.C2188811AlT.LIZ();
        r2.append("https://api-va.tiktokv.com/image/refresh/?target=");
        r2.append(java.net.URLEncoder.encode(r11));
        r11 = X.C2188811AlT.LIZIZ(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        r6 = ((java.lang.Boolean) X.C1E2X.LJ.getValue()).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0106, code lost:
    
        if (X.C1E2X.LIZ() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010e, code lost:
    
        if (android.text.TextUtils.equals(r2, "private-image") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0116, code lost:
    
        if (android.text.TextUtils.equals(r2, "private-video-cover") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0118, code lost:
    
        if (r6 == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0120, code lost:
    
        if (android.text.TextUtils.equals(r2, "sticker") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0122, code lost:
    
        r23.LJFF.getValue().add(r24.LIZLLL);
        r2 = X.C2188811AlT.LIZ();
        r2.append("https://api-va.tiktokv.com/tiktok/v1/im/image/refresh/?target=");
        r2.append(java.net.URLEncoder.encode(r11));
        r11 = X.C2188811AlT.LIZIZ(r2);
     */
    @Override // X.InterfaceC1334000koo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1333990kon r24, X.C1335880krq r25) {
        /*
            Method dump skipped, instruction units count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2222781BzA.LIZ(X.0kon, X.0krq):void");
    }

    @Override // X.InterfaceC1334000koo
    public final void LIZIZ(C1333990kon c1333990kon, C1335880krq c1335880krq) {
        if (!this.LJI.isMIORunning()) {
            LJFF().LIZIZ(c1333990kon, c1335880krq);
            return;
        }
        if (this.LJ != null && c1333990kon != null) {
            if (C1328570kg3.LJIIJ(2)) {
                int i = C2187451AjH.LIZ;
                C1330590kjJ.LIZJ("MIOImageFetcher", "callData", C786410Ut5.k4(Locale.US, "<%s>start", new Object[]{c1333990kon.LIZLLL}));
            }
            this.LJIIIIZZ = c1335880krq;
            this.LJ.start(new C2222791BzB(this, c1333990kon, c1335880krq));
        }
    }

    public final void LJIIL(C1333970kol c1333970kol, boolean z) {
        if (!TextUtils.isEmpty(c1333970kol.LIZLLL) && this.LJFF.getValue().contains(c1333970kol.LIZLLL)) {
            this.LJFF.getValue().remove(c1333970kol.LIZLLL);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
                jSONObject2.put("duration", c1333970kol.LIZJ - c1333970kol.LIZ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C793770VBv.LJII("m2_expired_url_redirect", jSONObject, jSONObject2, null);
        }
    }

    public final void LJIIIZ(MIOImageResponse mIOImageResponse, C1333970kol c1333970kol, Throwable th, long j, long j2) {
        String string;
        long j3 = j2;
        if (c1333970kol != null) {
            try {
                String[] strArr = new String[1];
                if (mIOImageResponse != null && mIOImageResponse.detail() != null) {
                    strArr[0] = mIOImageResponse.detail().remoteIp;
                }
                if (TextUtils.isEmpty(strArr[0])) {
                    strArr[0] = AbstractC1339120kx4.LIZJ(th);
                }
                long j4 = c1333970kol.LIZ;
                if (j > 0) {
                    j3 = j;
                }
                if (mIOImageResponse == null || mIOImageResponse.detail() == null) {
                    string = null;
                } else {
                    string = mIOImageResponse.detail().url;
                }
                if (TextUtils.isEmpty(string)) {
                    string = c1333970kol.LJFF.toString();
                }
                int i = C2187451AjH.LIZ;
                C1330590kjJ.LJFF("MIOImageFetcher", "handleException", C786410Ut5.k4(Locale.US, "<%s>e: %s, trace: %s", new Object[]{c1333970kol.LIZLLL, th, Arrays.toString(th.getStackTrace())}));
                C1494850p0F c1494850p0F = new C1494850p0F();
                c1494850p0F.LJJIFFI = 2;
                c1494850p0F.LJIJ = strArr[0];
                if (this.LIZIZ != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestId", c1333970kol.LIZLLL);
                    jSONObject.put("retryCount", 0);
                    this.LIZIZ.LIZIZ(j3, j4, string, c1494850p0F, th, jSONObject);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (C1328570kg3.LJIIJ(2)) {
                    int i2 = C2187451AjH.LIZ;
                    C1330590kjJ.LIZJ("MIOImageFetcher", "handleException", th2.toString());
                }
            }
        }
    }

    public final void LJIIJ(MIOImageResponse mIOImageResponse, C1333970kol c1333970kol, Throwable th, C1494850p0F c1494850p0F, long j, long j2) {
        String string;
        long j3 = j2;
        if (c1333970kol != null) {
            try {
                long j4 = c1333970kol.LIZ;
                if (j > 0) {
                    j3 = j;
                }
                if (mIOImageResponse != null) {
                    string = mIOImageResponse.detail().url;
                } else {
                    string = c1333970kol.LJFF.toString();
                }
                if (th != null) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("exception for mio response url = ");
                    sbLIZ.append(string);
                    sbLIZ.append(" exception = ");
                    sbLIZ.append(th);
                    sbLIZ.append(" stackTrace:: ");
                    sbLIZ.append(Arrays.toString(th.getStackTrace()));
                    C1330590kjJ.LJFF("MIOImageFetcher", "handleException$1", C2188811AlT.LIZIZ(sbLIZ));
                }
                C1334060kou c1334060kou = new C1334060kou();
                if (mIOImageResponse != null && mIOImageResponse.detail().respHeaders != null) {
                    C1333950koj c1333950koj = new C1333950koj();
                    c1334060kou.LIZIZ = c1333950koj;
                    c1333950koj.LIZ = LJI("Nw-Session-Trace", mIOImageResponse.detail().respHeaders);
                    c1333950koj.LIZIZ = mIOImageResponse.detail().remoteIp;
                }
                if (this.LIZJ != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestId", c1333970kol.LIZLLL);
                    jSONObject.put("retryCount", 0);
                    jSONObject.put("http_status", mIOImageResponse.detail().statusCode);
                    LJIIJJI(jSONObject, c1333970kol);
                    this.LIZJ.LIZ(j3, j4, c1334060kou, c1494850p0F, LIZLLL(mIOImageResponse, th), jSONObject);
                    int i2 = C2187451AjH.LIZ;
                    C1330590kjJ.LIZJ("MIOImageFetcher", "handleException", "report failure point");
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }
}
