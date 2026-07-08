package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: renamed from: X.0p6R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498690p6R implements InterfaceC1500070p8f, InterfaceC1498660p6O, Observer {
    public static volatile boolean LIZIZ;
    public final C1498680p6Q LIZ;

    public C1498690p6R(C1498680p6Q c1498680p6Q) {
        this.LIZ = c1498680p6Q;
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        C813210VvD.LIZ().addObserver(this);
    }

    public static void LJIIIIZZ(C0X9S c0x9s) {
        if (c0x9s != null) {
            try {
                if (!c0x9s.isCanceled()) {
                    c0x9s.cancel();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LIZIZ(C1498720p6U c1498720p6U, Exception exc) {
        if (exc != null) {
            int i = c1498720p6U.LJIIIIZZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Exception:");
            sbLIZ.append(exc.toString());
            C1490830otl.LJ(i, "TTNetDownloadHttpService", "afterDownload", C2188811AlT.LIZIZ(sbLIZ));
            TTNetInit.getTTNetDepend().LIZIZ();
            if (exc instanceof C1494690ozz) {
                String requestLog = ((C1494690ozz) exc).getRequestLog();
                if (!TextUtils.isEmpty(requestLog)) {
                    c1498720p6U.LIZLLL = requestLog;
                    return;
                }
            }
        }
        C0X9S c0x9s = c1498720p6U.LIZIZ;
        if (c0x9s == null) {
            C1490830otl.LJ(c1498720p6U.LJIIIIZZ, "TTNetDownloadHttpService", "afterDownload", "DownloadCall is null");
            return;
        }
        C0X52 c0x52 = c1498720p6U.LIZJ;
        if (c0x52 != null && c0x52.LIZ != null) {
            try {
                if (c0x9s instanceof InterfaceC843230X6b) {
                    ((InterfaceC843230X6b) c0x9s).doCollect();
                    Object obj = c1498720p6U.LIZJ.LIZ.LJFF;
                    if (obj instanceof C1494600ozq) {
                        String str = ((C1494600ozq) obj).LJJIIJ;
                        if (!TextUtils.isEmpty(str)) {
                            c1498720p6U.LIZLLL = str;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                int i2 = c1498720p6U.LJIIIIZZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Exception2:");
                sbLIZ2.append(th.toString());
                C1490830otl.LJ(i2, "TTNetDownloadHttpService", "afterDownload", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
        }
        C1490830otl.LJ(c1498720p6U.LJIIIIZZ, "TTNetDownloadHttpService", "afterDownload", "Response or raw response is null");
    }

    public static void LJII(C1498720p6U c1498720p6U, String str) throws DownloadTTNetException {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(str, linkedHashMap);
            StringBuilder sb = new StringBuilder();
            if (c1498720p6U.LJFF) {
                sb.append((String) pairLIZJ.second);
            }
            boolean z = true;
            for (String str2 : c1498720p6U.LJI) {
                String str3 = (String) linkedHashMap.get(str2);
                if (str3 != null) {
                    if (z) {
                        if (c1498720p6U.LJFF) {
                            sb.append("?");
                        }
                        z = false;
                    } else {
                        sb.append("&");
                    }
                    sb.append(str2);
                    sb.append("=");
                    sb.append(str3);
                }
            }
            c1498720p6U.LIZIZ.cancel();
            c1498720p6U.LJII = sb.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleRedirect Error:");
            sbLIZ.append(th.toString());
            throw new DownloadTTNetException(1086, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1500070p8f
    public final C1B8V LIZ(String str, List list) throws IOException {
        boolean zLJI = MethodIDManager.LJI(137302);
        C1498700p6S c1498700p6SLJFF = LJFF(str, true, list);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c1498700p6SLJFF;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable != null && (observable instanceof C813210VvD) && obj != null && (obj instanceof HashMap)) {
            try {
                String str = (String) ((HashMap) obj).get("request_log");
                if (C1490830otl.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("RequestLog:");
                    sbLIZ.append(str);
                    C1490830otl.LIZIZ("TTNetDownloadHttpService", "update", C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.InterfaceC1498660p6O
    /* JADX INFO: renamed from: LIZ, reason: collision with other method in class */
    public final InterfaceC2199921B8c mo53LIZ(String str, List<HttpHeader> list) throws IOException {
        boolean zLJI = MethodIDManager.LJI(137302);
        C1498700p6S c1498700p6SLJFF = LJFF(str, false, list);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c1498700p6SLJFF;
    }

    public static void LIZJ(C1498720p6U c1498720p6U, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        URL url = new URL(str);
        c1498720p6U.LJIIIZ = new URL(url.getProtocol(), str2, url.getFile()).toString();
        if (C1490830otl.LIZ()) {
            int i = c1498720p6U.LJIIIIZZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Host: ");
            sbLIZ.append(str2);
            C1490830otl.LIZLLL(i, "TTNetDownloadHttpService", "changeHost", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final C1498700p6S LJFF(String str, boolean z, List list) throws IOException {
        boolean zLJI = MethodIDManager.LJI(137302);
        C1498720p6U c1498720p6U = new C1498720p6U();
        try {
            C1498700p6S c1498700p6SLJI = LJI(str, list, c1498720p6U, z);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c1498700p6SLJI;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIIIZZ(c1498720p6U.LIZIZ);
            LIZIZ(c1498720p6U, e);
            DownloadTTNetException downloadTTNetExceptionLIZ = C2199681B7e.LJIJJLI().LIZ(c1498720p6U.LIZLLL, e);
            if (downloadTTNetExceptionLIZ == null) {
                downloadTTNetExceptionLIZ = new DownloadTTNetException(1079, e);
                downloadTTNetExceptionLIZ.setRequestLog(c1498720p6U.LIZLLL);
            }
            if (!TextUtils.isEmpty(c1498720p6U.LIZ.LIZ)) {
                downloadTTNetExceptionLIZ.setRemoteIp(c1498720p6U.LIZ.LIZ);
            }
            downloadTTNetExceptionLIZ.parseRemoteIp();
            IOException iOException = new IOException(downloadTTNetExceptionLIZ);
            if (zLJI) {
                MethodIDManager.LJ();
                throw iOException;
            }
            throw iOException;
        }
    }

    public static void LIZLLL(C1498720p6U c1498720p6U, String str, String str2, List list) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        URL url = new URL(str);
        c1498720p6U.LJIIIZ = new URL(url.getProtocol(), str2, url.getFile()).toString();
        if (C1490830otl.LIZ()) {
            int i = c1498720p6U.LJIIIIZZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Host: ");
            sbLIZ.append(str2);
            C1490830otl.LIZLLL(i, "TTNetDownloadHttpService", "changeHostAndIp", C2188811AlT.LIZIZ(sbLIZ));
        }
        ((ArrayList) list).add(new C080U("Host", url.getHost()));
    }

    public static void LJ(C1498720p6U c1498720p6U, String str, String str2, List list) {
        List<String> list2;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String[] strArrSplit = str2.split(",");
        if (strArrSplit != null && strArrSplit.length > 0) {
            URL url = new URL(str);
            String host = url.getHost();
            if (TextUtils.isEmpty(host)) {
                if (C1490830otl.LIZ()) {
                    int i = c1498720p6U.LJIIIIZZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Host Error:");
                    sbLIZ.append(host);
                    C1490830otl.LIZLLL(i, "TTNetDownloadHttpService", "changeIP", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            C1492900ox6 c1492900ox6TTDnsResolve = TTNetInit.TTDnsResolve(host, -1);
            if (c1492900ox6TTDnsResolve != null && (list2 = c1492900ox6TTDnsResolve.LIZIZ) != null && !list2.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (String str3 : strArrSplit) {
                    hashSet.add(str3);
                }
                Collections.shuffle(c1492900ox6TTDnsResolve.LIZIZ);
                if (C1490830otl.LIZ()) {
                    int i2 = c1498720p6U.LJIIIIZZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Dns Result: ");
                    sbLIZ2.append(c1492900ox6TTDnsResolve.LIZIZ.toString());
                    C1490830otl.LIZLLL(i2, "TTNetDownloadHttpService", "changeIP", C2188811AlT.LIZIZ(sbLIZ2));
                }
                for (String str4 : c1492900ox6TTDnsResolve.LIZIZ) {
                    if (!hashSet.contains(str4)) {
                        c1498720p6U.LJIIIZ = new URL(url.getProtocol(), str4, url.getFile()).toString();
                        ((ArrayList) list).add(new C080U("Host", host));
                        if (C1490830otl.LIZ()) {
                            int i3 = c1498720p6U.LJIIIIZZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Set Host: ");
                            sbLIZ3.append(host);
                            sbLIZ3.append(" Ip:");
                            sbLIZ3.append(str4);
                            C1490830otl.LIZLLL(i3, "TTNetDownloadHttpService", "changeIP", C2188811AlT.LIZIZ(sbLIZ3));
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (C1490830otl.LIZ()) {
                int i4 = c1498720p6U.LJIIIIZZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("TTDnsResolve Error:");
                sbLIZ4.append(c1492900ox6TTDnsResolve);
                C1490830otl.LIZLLL(i4, "TTNetDownloadHttpService", "changeIP", C2188811AlT.LIZIZ(sbLIZ4));
                return;
            }
            return;
        }
        if (C1490830otl.LIZ()) {
            int i5 = c1498720p6U.LJIIIIZZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Ips Error:");
            sbLIZ5.append(strArrSplit);
            C1490830otl.LIZLLL(i5, "TTNetDownloadHttpService", "changeIP", C2188811AlT.LIZIZ(sbLIZ5));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0310, code lost:
    
        throw new com.ss.android.socialbase.downloader.exception.DownloadTTNetException(1086, "handleRedirect Error: redirect location empty");
     */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.0p6T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.0p6S] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1498700p6S LJI(java.lang.String r20, java.util.List r21, final X.C1498720p6U r22, boolean r23) throws com.ss.android.socialbase.downloader.exception.DownloadTTNetException, X.C1494690ozz {
        /*
            Method dump skipped, instruction units count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1498690p6R.LJI(java.lang.String, java.util.List, X.0p6U, boolean):X.0p6S");
    }
}
