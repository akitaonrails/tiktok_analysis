package X;

import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.facebook.net.IDownloadImage;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0kwo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338960kwo extends AbstractC1328990kgj<C1338980kwq> {
    public static InterfaceC1339010kwt LIZIZ;
    public static InterfaceC1339090kx1 LIZJ;
    public final Executor LIZ = new ExecutorC1490620otQ();

    public C1338960kwo() {
        C1328570kg3.LJFF("FrescoTTNetFetcher", "init FrescoTTNetFetcher");
    }

    public static int LJII(Throwable th) {
        if (th instanceof C1494450ozb) {
            return 1003;
        }
        if (th instanceof C1494690ozz) {
            String requestLog = ((C1494690ozz) th).getRequestLog();
            if (!TextUtils.isEmpty(requestLog)) {
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(requestLog).optJSONObject("response");
                    if (jSONObjectOptJSONObject != null) {
                        return jSONObjectOptJSONObject.optInt("code");
                    }
                    return -1;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return -1;
                }
            }
            return -1;
        }
        if (th instanceof C1494430ozZ) {
            return ((C1494430ozZ) th).getStatusCode();
        }
        if (th instanceof C1499040p70) {
            return 1001;
        }
        if (th instanceof C1494440oza) {
            return 1002;
        }
        if (th instanceof C0Z68) {
            return 1004;
        }
        if (th instanceof C1493470oy1) {
            return 1005;
        }
        if (th instanceof C2190708i9) {
            return 1006;
        }
        return LSPassThroughRecordSizeConfig.DEFAULT;
    }

    public static int LJIIIZ(C1338980kwq c1338980kwq) {
        InterfaceC1327930kf1 interfaceC1327930kf1;
        Uri uriLIZJ;
        if (c1338980kwq != null && (interfaceC1327930kf1 = c1338980kwq.LIZIZ) != null && interfaceC1327930kf1.LIZJ() != null) {
            Object objLIZJ = c1338980kwq.LIZIZ.LIZJ();
            if ((objLIZJ instanceof C1198404mU) && (uriLIZJ = c1338980kwq.LIZJ()) != null) {
                C1198404mU c1198404mU = (C1198404mU) objLIZJ;
                String string = uriLIZJ.toString();
                if (C2093608Ic.LJ(string)) {
                    c1198404mU.getClass();
                    return -1;
                }
                if (!c1198404mU.LIZ.containsKey(string)) {
                    return -1;
                }
                return c1198404mU.LIZ.get(string).intValue();
            }
            return -1;
        }
        return -1;
    }

    public static InputStream LJIILL(C0X52 c0x52) throws IOException {
        if (c0x52.LIZJ()) {
            return ((TypedInput) c0x52.LIZIZ).in();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unexpected HTTP code ");
        sbLIZ.append(c0x52.LIZ.LIZIZ);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1328990kgj, X.InterfaceC1328710kgH
    public final void LIZLLL(C1328680kgE c1328680kgE) {
        ((C1338980kwq) c1328680kgE).LJIIJ.run();
    }

    public static String LJIIIIZZ(String str, List list) {
        String str2 = null;
        if (list != null && list.size() > 0) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C080U c080u = (C080U) it2.next();
                if (str.equalsIgnoreCase(c080u.LIZ)) {
                    str2 = c080u.LIZIZ;
                }
            }
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: JSONException -> 0x0047, TryCatch #0 {JSONException -> 0x0047, blocks: (B:2:0x0000, B:5:0x000c, B:7:0x0012, B:9:0x001a, B:12:0x0022, B:14:0x0028, B:16:0x0030, B:19:0x0038, B:21:0x003e, B:23:0x0043, B:15:0x002d, B:8:0x0017), top: B:28:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[Catch: JSONException -> 0x0047, TryCatch #0 {JSONException -> 0x0047, blocks: (B:2:0x0000, B:5:0x000c, B:7:0x0012, B:9:0x001a, B:12:0x0022, B:14:0x0028, B:16:0x0030, B:19:0x0038, B:21:0x003e, B:23:0x0043, B:15:0x002d, B:8:0x0017), top: B:28:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILJJIL(org.json.JSONObject r10, X.C1338980kwq r11) {
        /*
            long r1 = r11.LJII     // Catch: org.json.JSONException -> L47
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            java.lang.String r7 = "queue_time"
            r3 = -1
            if (r0 == 0) goto L17
            long r5 = r11.LJI     // Catch: org.json.JSONException -> L47
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L17
            long r1 = r1 - r5
            r10.put(r7, r1)     // Catch: org.json.JSONException -> L47
            goto L1a
        L17:
            r10.put(r7, r3)     // Catch: org.json.JSONException -> L47
        L1a:
            long r1 = r11.LJIIIIZZ     // Catch: org.json.JSONException -> L47
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            java.lang.String r7 = "fetch_time"
            if (r0 == 0) goto L2d
            long r5 = r11.LJII     // Catch: org.json.JSONException -> L47
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L2d
            long r1 = r1 - r5
            r10.put(r7, r1)     // Catch: org.json.JSONException -> L47
            goto L30
        L2d:
            r10.put(r7, r3)     // Catch: org.json.JSONException -> L47
        L30:
            long r1 = r11.LJIIIIZZ     // Catch: org.json.JSONException -> L47
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            java.lang.String r7 = "total_time"
            if (r0 == 0) goto L43
            long r5 = r11.LJI     // Catch: org.json.JSONException -> L47
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L43
            long r1 = r1 - r5
            r10.put(r7, r1)     // Catch: org.json.JSONException -> L47
            return
        L43:
            r10.put(r7, r3)     // Catch: org.json.JSONException -> L47
            return
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1338960kwo.LJIILJJIL(org.json.JSONObject, X.0kwq):void");
    }

    @Override // X.InterfaceC1328710kgH
    public final void LIZ(C1328680kgE c1328680kgE, C1328510kfx c1328510kfx) {
        C1338980kwq c1338980kwq = (C1338980kwq) c1328680kgE;
        if (c1338980kwq != null) {
            LJI(c1338980kwq, c1328510kfx, false);
        }
    }

    @Override // X.InterfaceC1328710kgH
    public final C1328680kgE LIZJ(InterfaceC1328020kfA interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
        return new C1338980kwq(interfaceC1328020kfA, interfaceC1327930kf1);
    }

    @Override // X.AbstractC1328990kgj, X.InterfaceC1328710kgH
    public final Map LJ(C1328680kgE c1328680kgE, int i) {
        Map<String, String> map;
        C1338980kwq c1338980kwq = (C1338980kwq) c1328680kgE;
        HashMap map2 = new HashMap(1);
        map2.put("image_size", Integer.toString(i));
        map2.put("hit_cdn_cache", c1338980kwq.LJIIIZ);
        map2.put("x_response_cache", c1338980kwq.LJIIL);
        map2.put("imagex_demotion", c1338980kwq.LJIILIIL);
        map2.put("imagex_want_fmt", c1338980kwq.LJIILJJIL);
        map2.put("imagex_true_fmt", c1338980kwq.LJIILL);
        map2.put("imagex_consistency", c1338980kwq.LJIILLIIL);
        map2.put("x-imagex-extra", c1338980kwq.LJIIZILJ);
        InterfaceC1327930kf1 interfaceC1327930kf1 = c1338980kwq.LIZIZ;
        if (interfaceC1327930kf1 != null && interfaceC1327930kf1.LJFF() != null && (map = c1338980kwq.LIZIZ.LJFF().LJJIIJZLJL) != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
                map2.put("customParam", C786410Ut5.J3(jSONObject));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        InterfaceC1327930kf1 interfaceC1327930kf12 = c1338980kwq.LIZIZ;
        if (interfaceC1327930kf12 != null) {
            map2.put("is_prefetch_image", Boolean.toString(interfaceC1327930kf12.LJI()));
        }
        return map2;
    }

    public static void LJIIL(C0X52 c0x52, String str, C1338980kwq c1338980kwq) {
        List<C080U> listLIZIZ;
        String str2;
        String[] strArrSplit;
        String strReplace;
        Rect rectUnflattenFromString;
        c1338980kwq.LJIIIZ = CardStruct.IStatusCode.DEFAULT;
        String[] strArr = {"X-Cache", "X-Cache-new", "X-Cache-Status", "via", "X-Via-Ucdn"};
        int i = 0;
        while (true) {
            listLIZIZ = null;
            if (i >= 5) {
                break;
            }
            listLIZIZ = c0x52.LIZ.LIZIZ(strArr[i]);
            if (listLIZIZ != null && listLIZIZ.size() > 0) {
                break;
            } else {
                i++;
            }
        }
        if (!C086I.LIZIZ(listLIZIZ)) {
            Iterator<C080U> it2 = listLIZIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C080U next = it2.next();
                    if (next != null) {
                        String str3 = next.LIZIZ;
                        if (!TextUtils.isEmpty(str3) && str3.toLowerCase().contains("hit")) {
                            c1338980kwq.LJIIIZ = "1";
                            break;
                        }
                    }
                }
            }
        } else {
            c1338980kwq.LJIIIZ = "-1";
        }
        try {
            C080U c080uLIZ = c0x52.LIZ.LIZ("x-response-cache");
            if (c080uLIZ != null) {
                c1338980kwq.LJIIL = c080uLIZ.LIZIZ;
            } else {
                c1338980kwq.LJIIL = "undefined";
            }
            String strLJIIIIZZ = LJIIIIZZ("X-Crop-Rs", c0x52.LIZ.LIZLLL);
            if (!TextUtils.isEmpty(strLJIIIIZZ) && (rectUnflattenFromString = Rect.unflattenFromString((strReplace = strLJIIIIZZ.replace(e3.h, "").replace(")", "").replace("-", ",").replace(",", " ")))) != null && !rectUnflattenFromString.isEmpty() && rectUnflattenFromString.left >= 0 && rectUnflattenFromString.top >= 0) {
                HashMap map = new HashMap();
                map.put("regionToDecode", strReplace);
                c1338980kwq.LJFF = map;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!TextUtils.isEmpty(str)) {
            synchronized (C1339000kws.LIZ()) {
            }
        }
        c1338980kwq.LJ = false;
        String strLJIIIIZZ2 = LJIIIIZZ("ImageX-Demotion", c0x52.LIZ.LIZLLL);
        if (strLJIIIIZZ2 == null) {
            strLJIIIIZZ2 = "undefined";
        }
        c1338980kwq.LJIILIIL = strLJIIIIZZ2;
        String strLJIIIIZZ3 = LJIIIIZZ("ImageX-Fmt", c0x52.LIZ.LIZLLL);
        if (strLJIIIIZZ3 != null && (strArrSplit = strLJIIIIZZ3.split("2")) != null && strArrSplit.length > 0) {
            c1338980kwq.LJIILJJIL = strArrSplit[0];
            if (strArrSplit.length > 1) {
                c1338980kwq.LJIILL = strArrSplit[1];
            } else {
                c1338980kwq.LJIILL = "undefined";
            }
        } else {
            c1338980kwq.LJIILJJIL = "undefined";
            c1338980kwq.LJIILL = "undefined";
        }
        if (!"undefined".equals(c1338980kwq.LJIILJJIL) && !"undefined".equals(c1338980kwq.LJIILL)) {
            if (c1338980kwq.LJIILJJIL.equalsIgnoreCase(c1338980kwq.LJIILL)) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c1338980kwq.LJIILLIIL = str2;
        } else {
            c1338980kwq.LJIILLIIL = "-1";
        }
        String strLJIIIIZZ4 = LJIIIIZZ("x-imagex-extra", c0x52.LIZ.LIZLLL);
        if (strLJIIIIZZ4 == null) {
            strLJIIIIZZ4 = "";
        }
        c1338980kwq.LJIIZILJ = strLJIIIIZZ4;
    }

    public static void LJIILIIL(C1338980kwq c1338980kwq, boolean z, long j) {
        if (LJIIIZ(c1338980kwq) == 1) {
            C1493880oyg.LIZ().LIZIZ(j, c1338980kwq.LIZJ().toString(), z, true);
        } else {
            if (LJIIIZ(c1338980kwq) != 0) {
                return;
            }
            C1493880oyg.LIZ().LIZIZ(j, c1338980kwq.LIZJ().toString(), z, false);
        }
    }

    public final void LJI(C1338980kwq c1338980kwq, InterfaceC1331040kk2 interfaceC1331040kk2, boolean z) {
        C1339050kwx c1339050kwx;
        String strLIZIZ;
        InterfaceC1339070kwz interfaceC1339070kwz;
        c1338980kwq.LJI = System.currentTimeMillis();
        Uri uriLIZJ = c1338980kwq.LIZJ();
        if (uriLIZJ == null) {
            return;
        }
        String str = null;
        if (LIZJ != null) {
            c1339050kwx = new C1339050kwx();
        } else {
            c1339050kwx = null;
        }
        String string = uriLIZJ.toString();
        if (c1339050kwx != null) {
            strLIZIZ = c1339050kwx.LIZ.LIZIZ(string);
        } else {
            strLIZIZ = string;
        }
        if (C2093608Ic.LJ(strLIZIZ)) {
            return;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(strLIZIZ, linkedHashMap);
            String strReplace = (String) pairLIZJ.first;
            if (z) {
                strReplace = strReplace.replace("http://", "https://");
            }
            String str2 = (String) pairLIZJ.second;
            synchronized (C1339000kws.LIZ()) {
            }
            IDownloadImage iDownloadImage = (IDownloadImage) C1515120pWw.LJIIIZ(IDownloadImage.class, strReplace);
            C1339030kwv c1339030kwv = new C1339030kwv(c1338980kwq.LIZIZ.LJFF().LIZJ, 0);
            LinkedList linkedList = new LinkedList();
            InterfaceC1327930kf1 interfaceC1327930kf1 = c1338980kwq.LIZIZ;
            if (interfaceC1327930kf1 != null && interfaceC1327930kf1.LJFF() != null) {
                C1325710kbR c1325710kbRLJFF = c1338980kwq.LIZIZ.LJFF();
                String str3 = c1325710kbRLJFF.LJJIIZ;
                str = c1325710kbRLJFF.LJJIIZI;
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str)) {
                    String strLIZ = C821530WKp.LIZ(str3, str);
                    if (!TextUtils.isEmpty(strLIZ)) {
                        linkedList.add(new C080U("imagex-decrypt-key", strLIZ));
                    }
                }
            }
            Map<String, String> map = c1338980kwq.LIZIZ.LJFF().LJJIII;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    linkedList.add(new C080U(entry.getKey(), entry.getValue()));
                }
            }
            if (iDownloadImage != null) {
                C0X9S<TypedInput> c0x9sDownloadFileForNormal = iDownloadImage.downloadFileForNormal(false, -1, str2, linkedHashMap, linkedList, c1339030kwv);
                try {
                    c1338980kwq.LIZIZ.LJ(new C1005460cGu(this, c0x9sDownloadFileForNormal));
                    interfaceC1339070kwz = C1494230ozF.LJIIIIZZ;
                } catch (Exception e) {
                    e = e;
                }
                if (interfaceC1339070kwz != null) {
                    C1493400oxu c1493400oxu = (C1493400oxu) interfaceC1339070kwz;
                    if (!C2093608Ic.LJ(strLIZIZ) && c1493400oxu.LLJJI > 0) {
                        try {
                            URI uriLIZIZ = C2089108Gj.LIZIZ(strLIZIZ);
                            if (uriLIZIZ != null && !C2093608Ic.LJ(uriLIZIZ.getHost())) {
                                TTNetInit.getTTNetDepend().LJIIL();
                                throw new IllegalArgumentException("cdnHostSuffix is not init !!!");
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        e = e;
                    }
                }
                c0x9sDownloadFileForNormal.enqueue(new C1338970kwp(this, c1338980kwq, c1339050kwx, str, z, c1339030kwv, string, interfaceC1331040kk2, false, c0x9sDownloadFileForNormal));
                return;
            }
            return;
        } catch (Exception e2) {
            e = e2;
        }
        TryCatchGuardChecker.doCheck(e);
    }

    public static void LJIIJ(C1494850p0F c1494850p0F, List list, C1493620oyG c1493620oyG, Exception exc) {
        if (c1494850p0F == null) {
            return;
        }
        try {
            if (!C2093608Ic.LJ(c1494850p0F.LJIJ)) {
                return;
            }
            String str = null;
            if (list != null && list.size() > 0) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C080U c080u = (C080U) it2.next();
                    if ("x-snssdk.remoteaddr".equalsIgnoreCase(c080u.LIZ)) {
                        str = c080u.LIZIZ;
                    }
                }
            }
            if (C2093608Ic.LJ(str) && c1493620oyG != null) {
                str = c1493620oyG.LIZ;
            }
            if (C2093608Ic.LJ(str)) {
                str = "";
                if (exc != null) {
                    try {
                        String[] strArrSplit = exc.getMessage().split("\\|");
                        if (strArrSplit != null && strArrSplit.length >= 2) {
                            Logger.debug();
                            str = strArrSplit[0];
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            if (C2093608Ic.LJ(str)) {
                return;
            }
            c1494850p0F.LJIJ = str;
            T t = c1494850p0F.LIZJ;
            if (t != 0) {
                t.LIZ = str;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static void LJIIJJI(C0X52 c0x52, C1338980kwq c1338980kwq, Throwable th, C1494850p0F c1494850p0F) {
        InterfaceC1327930kf1 interfaceC1327930kf1;
        if (c1338980kwq != null) {
            try {
                long j = c1338980kwq.LJI;
                long jCurrentTimeMillis = c1338980kwq.LJIIIIZZ - j;
                if (jCurrentTimeMillis <= 0) {
                    jCurrentTimeMillis = System.currentTimeMillis() - c1338980kwq.LJI;
                }
                if (C2093608Ic.LJ(null) && (c0x52 == null || (interfaceC1327930kf1 = c1338980kwq.LIZIZ) == null || interfaceC1327930kf1.LJFF() == null || c1338980kwq.LIZIZ.LJFF().LJJIFFI)) {
                    c1338980kwq.LIZJ().toString();
                }
                Logger.debug();
                LJIILIIL(c1338980kwq, false, jCurrentTimeMillis);
                C1334060kou c1334060kou = new C1334060kou();
                c1334060kou.LIZ = c0x52;
                if (LIZIZ != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestId", c1338980kwq.LIZ());
                    jSONObject.put("retryCount", c1338980kwq.LJIIJJI);
                    jSONObject.put("http_status", LJII(th));
                    LIZIZ.LIZ(jCurrentTimeMillis, j, c1334060kou, c1494850p0F, th, jSONObject);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    public static void LJFF(C1338980kwq c1338980kwq, String str, boolean z, List list, long j) {
        if (z) {
            return;
        }
        try {
            long j2 = Long.parseLong(LJIIIIZZ("X-Length", list));
            if (j2 != -1 && j != -1 && j2 != j) {
                C1339000kws.LIZ().LIZIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String strLJIIIIZZ = LJIIIIZZ("Content-Type", list);
        if (TextUtils.isEmpty(strLJIIIIZZ) || !strLJIIIIZZ.contains("image")) {
            synchronized (C1339000kws.LIZ()) {
            }
        }
        String str2 = c1338980kwq.LIZLLL;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !str.equals(str2)) {
            throw new C1338990kwr("MD5 does not match！！");
        }
    }
}
