package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import m14.l;
import okio.ByteString;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0p0M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494920p0M {
    public EnumC1495780p1k LJIJJ;
    public C1495760p1i LJIJJLI;
    public C0X1V LJJ;
    public Socket LJJIIZI;
    public C0X1V LJJIJ;
    public C1489840osA LJJJJIZL;
    public C1494160oz8 LJJJJJL;
    public final C1494600ozq LJJJJL;
    public final Context LJJJJLI;
    public long LIZ = -1;
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;
    public long LJFF = -1;
    public long LJI = -1;
    public long LJII = -1;
    public long LJIIIIZZ = -1;
    public long LJIIIZ = -1;
    public long LJIIJ = -1;
    public long LJIIJJI = -1;
    public long LJIIL = -1;
    public long LJIILIIL = -1;
    public final AtomicLong LJIILJJIL = new AtomicLong(-1);
    public long LJIILL = -1;
    public long LJIILLIIL = -1;
    public final List<Pair<InetSocketAddress, Integer>> LJIIZILJ = new ArrayList();
    public Proxy.Type LJIJ = Proxy.Type.DIRECT;
    public EnumC1152930g6l LJIJI = EnumC1152930g6l.HANDSHAKE_UNKNOWN;
    public long LJIL = 0;
    public int LJJI = -1;
    public long LJJIFFI = 0;
    public EnumC847200XLi LJJII = null;
    public String LJJIII = "";
    public boolean LJJIIJ = false;
    public boolean LJJIIJZLJL = false;
    public String LJJIIZ = "";
    public String LJJIJIIJI = "";
    public int LJJIJIIJIL = 0;
    public final List<C1495000p0U> LJJIJIL = new ArrayList();
    public EnumC1494960p0Q LJJIJL = EnumC1494960p0Q.IDLE;
    public String LJJIJLIJ = "";
    public int LJJIL = -1;
    public EnumC1494970p0R LJJIZ = EnumC1494970p0R.UNKNOWN;
    public String LJJJ = "";
    public boolean LJJJI = false;
    public boolean LJJJIL = false;
    public final List<C1489590orl> LJJJJ = new ArrayList();
    public int LJJJJI = 0;
    public String LJJJJJ = "";
    public final AtomicBoolean LJJJJLL = new AtomicBoolean(false);

    public static long LJIIL(long j, long j2) {
        if (j2 == -1 || j == -1) {
            return -1L;
        }
        return j - j2;
    }

    public static boolean LIZ() {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final void LJII() {
        this.LJJJJL.getClass();
        this.LJJJJL.LIZLLL.LJJIZ(LJIIL(this.LIZJ, this.LIZIZ));
        this.LJJJJL.LIZLLL.LJJJIL(LJIIL(this.LJ, this.LIZLLL));
        this.LJJJJL.LIZLLL.LJJJJI(LJIIL(this.LJFF, this.LJ));
        this.LJJJJL.LIZLLL.LJJJI(LJIIL(this.LJII, this.LJI) + LJIIL(this.LJIIIZ, this.LJIIIIZZ));
        C1494570ozn c1494570ozn = this.LJJJJL.LIZLLL;
        c1494570ozn.LJLJI.LIZLLL.getClass();
        WeakReference<InterfaceC1494730p03> weakReference = c1494570ozn.LIZIZ;
        if (weakReference != null) {
            weakReference.get().LJFF(-1L);
        }
        this.LJJJJL.LIZLLL.LJJJJ(-1L);
        this.LJJJJL.LIZLLL.LJJJ(LJIIL(this.LJIILIIL, this.LJIIL));
        this.LJJJJL.LIZLLL.LJJJJIZL(LJIIL(this.LJIILJJIL.get(), this.LIZ));
        C1494600ozq c1494600ozq = this.LJJJJL;
        c1494600ozq.LJIJ = this.LJJIIZ;
        c1494600ozq.LJJI = this.LIZLLL == -1 && this.LJIILL != -1;
        c1494600ozq.LJIJI = this.LJIL;
        c1494600ozq.LJIJJ = this.LJJIFFI;
        c1494600ozq.getClass();
        C0X1V c0x1v = this.LJJ;
        if (c0x1v != null) {
            this.LJJJJL.LJJIIZI = LJFF(c0x1v);
            this.LJJJJL.LJIJI += this.LJJ.LIZ();
        }
        C0X1V c0x1v2 = this.LJJIJ;
        if (c0x1v2 != null) {
            this.LJJJJL.LJJIJ = LJFF(c0x1v2);
            this.LJJJJL.LJIJJ += this.LJJIJ.LIZ();
        }
        this.LJJJJL.LJJIJIIJI = this.LJJIJIIJI;
        boolean zDebug = Logger.debug();
        C1494600ozq c1494600ozq2 = this.LJJJJL;
        C1494210ozD c1494210ozD = c1494600ozq2.LJJIJL;
        boolean z = c1494210ozD.LIZ;
        boolean z2 = !z;
        boolean z3 = this.LJJIZ != EnumC1494970p0R.SUCCESS;
        boolean z4 = z && c1494210ozD.LIZIZ;
        if (zDebug || z3 || z2 || z4) {
            c1494600ozq2.LIZLLL.LJJJJJ(LIZIZ(this.LJJJJLI));
        }
        this.LJJJJL.LIZLLL.LJIL();
    }

    public static int LJ(IOException iOException) {
        if (iOException instanceof SSLHandshakeException) {
            return -148;
        }
        if (iOException instanceof SSLKeyException) {
            return -149;
        }
        if (iOException instanceof SSLProtocolException) {
            return -107;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return -153;
        }
        if (iOException instanceof UnknownHostException) {
            return -105;
        }
        if (iOException instanceof ConnectException) {
            return LIZJ(iOException, -104);
        }
        if (iOException instanceof PortUnreachableException) {
            return -108;
        }
        if (iOException instanceof NoRouteToHostException) {
            return -109;
        }
        if (iOException instanceof BindException) {
            return -147;
        }
        if (iOException instanceof SocketException) {
            return LIZJ(iOException, -15);
        }
        if (iOException instanceof MalformedURLException) {
            return -300;
        }
        if (iOException instanceof SocketTimeoutException) {
            return -118;
        }
        if (iOException instanceof ProtocolException) {
            return -901;
        }
        if (iOException instanceof HttpRetryException) {
            String message = iOException.getMessage();
            if (!TextUtils.isEmpty(message) && message.contains("Too many follow-up requests")) {
                return -310;
            }
            return -196;
        }
        if (iOException instanceof UnknownServiceException) {
            return -902;
        }
        return -1;
    }

    public static String LJFF(C0X1V c0x1v) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((TreeMap) c0x1v.LJIIIZ()).entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        jSONObject.put(str, (String) it2.next());
                    }
                }
            }
            return C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static EnumC1494980p0S LJIIJ(EnumC847200XLi enumC847200XLi) {
        if (enumC847200XLi == null) {
            return EnumC1494980p0S.CONNECTION_INFO_UNKNOWN;
        }
        int i = C847210XLj.LIZ[enumC847200XLi.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return EnumC1494980p0S.CONNECTION_INFO_UNKNOWN;
                        }
                        return EnumC1494980p0S.CONNECTION_INFO_QUIC_UNKNOWN_VERSION;
                    }
                    return EnumC1494980p0S.CONNECTION_INFO_DEPRECATED_SPDY3;
                }
                return EnumC1494980p0S.CONNECTION_INFO_HTTP2;
            }
            return EnumC1494980p0S.CONNECTION_INFO_HTTP1_1;
        }
        return EnumC1494980p0S.CONNECTION_INFO_HTTP1_0;
    }

    public static long LJIIJJI(String str) {
        String[] strArrSplit = str.split("=");
        if (strArrSplit.length == 2) {
            try {
                long j = CastLongProtector.parseLong(strArrSplit[1]);
                if (j >= 0) {
                    return j;
                }
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return -1L;
    }

    public final String LIZIZ(Context context) {
        boolean z;
        long jLIZ;
        long jLIZ2;
        boolean z2;
        String strLIZLLL;
        boolean z3;
        Set<String> setLIZ;
        Object objLIZJ;
        InetAddress inetAddress;
        boolean z4;
        boolean z5;
        Uri uri;
        Uri uri2;
        List<String> listLIZ;
        String[] strArrSplit;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String str = l.LJ().LJIIJJI;
            ArrayList<String> arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(",")) != null) {
                arrayList.addAll(Arrays.asList(strArrSplit));
            }
            InterfaceC1493370oxr interfaceC1493370oxrLJFF = C1493780oyW.LJFF();
            if (interfaceC1493370oxrLJFF != null && (listLIZ = ((C1493320oxm) interfaceC1493370oxrLJFF).LIZ()) != null) {
                if (listLIZ.size() > 5) {
                    Logger.debug();
                }
                int i = 0;
                for (String str2 : listLIZ) {
                    i++;
                    if (i > 5) {
                        break;
                    }
                    arrayList.add(str2);
                }
            }
            JSONArray jSONArray = new JSONArray();
            for (String str3 : arrayList) {
                if (!TextUtils.isEmpty(str3)) {
                    jSONArray.put(str3);
                }
            }
            jSONObject2.put("hit", jSONArray);
            jSONObject.put("ab_test", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("load_state", this.LJJIJL.ordinal());
            jSONObject3.put("method", this.LJJIJLIJ);
            if (this.LJJIZ == EnumC1494970p0R.IO_PENDING) {
                z = true;
            } else {
                z = false;
            }
            jSONObject3.put("is_pending", z);
            jSONObject3.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LJJIZ);
            if (this.LJJIZ != EnumC1494970p0R.SUCCESS) {
                jSONObject3.put("net_error", this.LJJIL);
            }
            if (!TextUtils.isEmpty(this.LJJJ) && (uri2 = UriProtector.parse(this.LJJJ)) != null && !TextUtils.isEmpty(uri2.getScheme()) && !TextUtils.isEmpty(uri2.getHost()) && uri2.getPath() != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(uri2.getScheme());
                sbLIZ.append("://");
                sbLIZ.append(uri2.getHost());
                sbLIZ.append(uri2.getPath());
                jSONObject3.put("origin_url", C2188811AlT.LIZIZ(sbLIZ));
            }
            jSONObject3.put("redirect_times", this.LJJIJIIJIL);
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            for (C1495000p0U c1495000p0U : (ArrayList) this.LJJIJIL) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("code", c1495000p0U.LIZ);
                jSONObject4.put("method", c1495000p0U.LIZIZ);
                jSONObject4.put("internal", c1495000p0U.LIZLLL);
                String str4 = c1495000p0U.LIZJ;
                if (str4 != null && (uri = UriProtector.parse(str4)) != null && !TextUtils.isEmpty(uri.getScheme()) && !TextUtils.isEmpty(uri.getHost())) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(uri.getScheme());
                    sbLIZ2.append("://");
                    sbLIZ2.append(uri.getHost());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    jSONArray3.put(strLIZIZ);
                    if (uri.getPath() != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(strLIZIZ);
                        sbLIZ3.append(uri.getPath());
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    jSONObject4.put("url", strLIZIZ);
                }
                jSONArray2.put(jSONObject4);
            }
            jSONObject3.put("redirect_info", jSONArray2);
            jSONObject3.put("redirecting_list", jSONArray3);
            jSONObject3.put("dispatched", this.LJJJI);
            jSONObject.put("base", jSONObject3);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("code", this.LJJI);
            jSONObject5.put("connection_info", LJIIJ(this.LJJII).LL);
            C0X1V c0x1v = this.LJJ;
            if (c0x1v != null) {
                jLIZ = c0x1v.LIZ();
            } else {
                jLIZ = 0;
            }
            jSONObject5.put("sent_bytes", this.LJIL + jLIZ);
            C0X1V c0x1v2 = this.LJJIJ;
            if (c0x1v2 != null) {
                jLIZ2 = c0x1v2.LIZ();
            } else {
                jLIZ2 = 0;
            }
            jSONObject5.put("received_bytes", this.LJJIFFI + jLIZ2);
            jSONObject5.put("cached", this.LJJIIJ);
            jSONObject5.put("network_accessed", this.LJJIIJZLJL);
            if (this.LJIJ != Proxy.Type.DIRECT) {
                z2 = true;
            } else {
                z2 = false;
            }
            jSONObject5.put("via_proxy", z2);
            C0X1V c0x1v3 = this.LJJIJ;
            if (c0x1v3 != null) {
                List<String> listLJIIJJI = c0x1v3.LJIIJJI("Set-Cookie");
                if (!C086I.LIZIZ(listLJIIJJI)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                jSONObject5.put("set_cookie", z5);
                if (z5) {
                    jSONObject5.put("set_cookie_lines", listLJIIJJI.size());
                    long length = 0;
                    for (String str5 : listLJIIJJI) {
                        if (str5 != null) {
                            length += (long) str5.length();
                        }
                    }
                    jSONObject5.put("set_cookie_bytes", length);
                }
            }
            jSONObject.put("response", jSONObject5);
            JSONObject jSONObject6 = new JSONObject();
            if (this.LJJIJ == null) {
                strLIZLLL = "";
            } else {
                for (int i2 = 0; i2 < this.LJJIJ.LJIIIIZZ(); i2++) {
                    String strLJ = this.LJJIJ.LJ(i2);
                    String strLJIIJ = this.LJJIJ.LJIIJ(i2);
                    if (!TextUtils.isEmpty(strLJ) && !TextUtils.isEmpty(strLJIIJ)) {
                        String lowerCase = strLJ.toLowerCase();
                        if (lowerCase.startsWith("x-tt-") && !lowerCase.contains("sids") && !lowerCase.contains("session") && !lowerCase.contains("token") && !lowerCase.contains("uid") && !lowerCase.contains("sign")) {
                            jSONObject6.put(strLJ, strLJIIJ);
                        }
                    }
                }
                String strLIZLLL2 = this.LJJIJ.LIZLLL("tt-idc-switch");
                if (!TextUtils.isEmpty(strLIZLLL2)) {
                    jSONObject6.put("tt-idc-switch", strLIZLLL2);
                }
                strLIZLLL = this.LJJIJ.LIZLLL("server-timing");
                if (!TextUtils.isEmpty(strLIZLLL)) {
                    jSONObject6.put("server-timing", strLIZLLL);
                }
                List<String> list = C1490260osq.LIZ().LIZ;
                if (!C086I.LIZIZ(list)) {
                    for (String str6 : (CopyOnWriteArrayList) list) {
                        if (!TextUtils.isEmpty(str6)) {
                            jSONObject6.remove(str6);
                        }
                    }
                }
                jSONObject.put("header", jSONObject6);
            }
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("libcore", "okhttp");
            jSONObject7.put("core_ver", C1493780oyW.LJI());
            jSONObject7.put("is_main_process", C2104008Mc.LIZJ(context));
            jSONObject7.put("ttnet_version", "4.2.243.57-tiktok");
            jSONObject7.put("retry_attempts", -1);
            jSONObject.put("other", jSONObject7);
            JSONObject jSONObject8 = new JSONObject();
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("dns", LJIIL(this.LIZJ, this.LIZIZ));
            jSONObject9.put("tcp", LJIIL(this.LJ, this.LIZLLL));
            jSONObject9.put("ssl", LJIIL(this.LJFF, this.LJ));
            jSONObject9.put("send", LJIIL(this.LJII, this.LJI) + LJIIL(this.LJIIIZ, this.LJIIIIZZ));
            long jLJIIL = LJIIL(this.LJIIJJI, this.LJII);
            jSONObject9.put("ttfb", jLJIIL);
            jSONObject9.put("header_recv", LJIIL(this.LJIIJJI, this.LJIIJ));
            jSONObject9.put("body_recv", LJIIL(this.LJIILIIL, this.LJIIL));
            jSONObject9.put("dispatch", this.LJIILLIIL);
            LJI(strLIZLLL, jLJIIL, jSONObject9);
            C1489840osA c1489840osA = this.LJJJJIZL;
            if (c1489840osA != null) {
                long j = c1489840osA.LJ;
                if (j >= 0) {
                    jSONObject9.put("meta_dp", j);
                }
            }
            C1494600ozq c1494600ozq = this.LJJJJL;
            jSONObject9.put("sample", LJIIL(c1494600ozq.LJJIL, c1494600ozq.LJJIJLIJ));
            jSONObject8.put("detailed_duration", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("start_time", this.LIZ);
            jSONObject10.put("duration", LJIIL(this.LJIILJJIL.get(), this.LIZ));
            jSONObject10.put("request_sent_time", this.LJI);
            jSONObject10.put("response_recv_time", this.LJIIJ);
            jSONObject8.put("request", jSONObject10);
            jSONObject.put("timing", jSONObject8);
            JSONObject jSONObject11 = new JSONObject();
            Socket socket = this.LJJIIZI;
            if (socket != null && (inetAddress = socket.getInetAddress()) != null) {
                EnumC994270byr enumC994270byr = EnumC994270byr.ADDRESS_FAMILY_UNSPECIFIED;
                if (inetAddress instanceof Inet4Address) {
                    enumC994270byr = EnumC994270byr.ADDRESS_FAMILY_IPV4;
                } else if (inetAddress instanceof Inet6Address) {
                    enumC994270byr = EnumC994270byr.ADDRESS_FAMILY_IPV6;
                }
                jSONObject11.put("address_family", enumC994270byr.ordinal());
                if (this.LIZLLL == -1 && this.LJIILL != -1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                jSONObject11.put("socket_reused", z4);
                if (inetAddress.getHostAddress() != null) {
                    jSONObject11.put("remote", inetAddress.getHostAddress());
                }
            }
            JSONArray jSONArray4 = new JSONArray();
            for (Pair pair : (ArrayList) this.LJIIZILJ) {
                JSONObject jSONObject12 = new JSONObject();
                jSONObject12.put("address", ((InetSocketAddress) pair.first).toString().substring(1));
                jSONObject12.put("result", pair.second);
                jSONArray4.put(jSONObject12);
            }
            jSONObject11.put("connection_attempts", jSONArray4);
            jSONObject.put("socket", jSONObject11);
            JSONObject jSONObject13 = new JSONObject();
            jSONObject13.put("handshake_type", this.LJIJI.ordinal());
            jSONObject13.put("cipher_suite", this.LJIJJLI);
            jSONObject13.put("ssl_version", this.LJIJJ);
            jSONObject.put("ssl", jSONObject13);
            JSONObject jSONObject14 = new JSONObject();
            JSONArray jSONArray5 = new JSONArray();
            if (this.LJJJIL) {
                jSONObject14.put("host_replace_map", 1);
                jSONObject14.put("host_replace_map_size", this.LJJJJI);
            } else {
                List<C1489590orl> list2 = this.LJJJJ;
                if (list2 != null) {
                    for (C1489590orl c1489590orl : (ArrayList) list2) {
                        JSONObject jSONObject15 = new JSONObject();
                        if (c1489590orl.LIZLLL) {
                            jSONObject15.put("priority", c1489590orl.LIZJ);
                            jSONObject15.put("type", c1489590orl.LJ);
                            jSONObject15.put("action_hit", c1489590orl.LIZLLL);
                            if (!TextUtils.isEmpty(c1489590orl.LJI)) {
                                Uri uri3 = UriProtector.parse(c1489590orl.LJI);
                                if (uri3.getHost() != null) {
                                    jSONObject15.put("replace_host", uri3.getHost());
                                }
                            } else {
                                jSONObject15.put("replace_host", "");
                            }
                            jSONObject15.put("feedback", c1489590orl.LJFF);
                            long j2 = c1489590orl.LIZIZ;
                            if (j2 > 0) {
                                jSONObject15.put("rule_id", j2);
                            }
                            if (!TextUtils.isEmpty(c1489590orl.LIZ)) {
                                jSONObject15.put("service_name", c1489590orl.LIZ);
                            }
                            jSONArray5.put(jSONObject15);
                        }
                    }
                }
                jSONObject14.put("action_info", jSONArray5);
                jSONObject14.put("empty_action", ((ArrayList) l.LJ().LIZLLL).isEmpty());
                jSONObject14.put("host_replace_map", 0);
            }
            jSONObject14.put("source", l.LJ().LIZIZ());
            jSONObject14.put("update_time", l.LJ().LIZJ());
            jSONObject14.put("epoch", l.LJ().LIZJ.get());
            jSONObject.put("url_dispatch", jSONObject14);
            if (!TextUtils.isEmpty(l.LJ().LJIIJ)) {
                jSONObject.put("tt_tnc_etag", l.LJ().LJIIJ);
            }
            if (this.LJJJJIZL != null) {
                JSONObject jSONObject16 = new JSONObject();
                Set<String> set = this.LJJJJIZL.LIZJ;
                if (set != null && !((HashSet) set).isEmpty()) {
                    jSONObject16.put("header_add", this.LJJJJIZL.LIZJ);
                }
                Set<String> set2 = this.LJJJJIZL.LIZLLL;
                if (set2 != null && !((HashSet) set2).isEmpty()) {
                    jSONObject16.put("header_rm", this.LJJJJIZL.LIZLLL);
                }
                Set<String> set3 = this.LJJJJIZL.LIZ;
                if (set3 != null && !((HashSet) set3).isEmpty()) {
                    jSONObject16.put("query_add", this.LJJJJIZL.LIZ);
                }
                Set<String> set4 = this.LJJJJIZL.LIZIZ;
                if (set4 != null && !((HashSet) set4).isEmpty()) {
                    jSONObject16.put("query_rm", this.LJJJJIZL.LIZIZ);
                }
                if (jSONObject16.length() > 0) {
                    jSONObject.put("meta_dp", jSONObject16);
                }
            }
            if (!TextUtils.isEmpty(this.LJJJJJ)) {
                try {
                    jSONObject.put("dns", new JSONObject(this.LJJJJJ));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            JSONObject jSONObject17 = new JSONObject();
            C1494160oz8 c1494160oz8 = this.LJJJJJL;
            if (c1494160oz8 != null) {
                long j3 = c1494160oz8.LJIIIIZZ;
                if (j3 > 0) {
                    jSONObject17.put("protect", j3);
                }
                long j4 = this.LJJJJJL.LJFF;
                if (j4 > 0) {
                    jSONObject17.put("connect", j4);
                }
                long j5 = this.LJJJJJL.LIZLLL;
                if (j5 > 0) {
                    jSONObject17.put("read", j5);
                }
                long j6 = this.LJJJJJL.LJ;
                if (j6 > 0) {
                    jSONObject17.put("write", j6);
                }
            }
            jSONObject.put("socket_timeout_param", jSONObject17);
            JSONObject jSONObject18 = new JSONObject();
            jSONObject18.put("ipv4_reachable", LIZ());
            jSONObject18.put("ipv6_reachable", C1494040oyw.LIZ().get());
            jSONObject.put("ifconfig", jSONObject18);
            if (C1493780oyW.LJ() != null && (objLIZJ = C1493780oyW.LJ().LIZJ()) != null) {
                jSONObject.put("tnc", objLIZJ);
            }
            if (C1493240oxe.LJI().LJFF() != null) {
                jSONObject.put("store_idc", C1493240oxe.LJI().LJFF());
            }
            JSONObject jSONObject19 = new JSONObject();
            JSONObject jSONObject20 = new JSONObject();
            jSONObject20.put("pre_sampling", this.LJJJJL.LJJIJL.LIZ);
            jSONObject20.put("result", this.LJJJJL.LJJIJL.LIZJ.getValue());
            EnumC1494180ozA enumC1494180ozA = this.LJJJJL.LJJIJL.LIZLLL;
            if (enumC1494180ozA != EnumC1494180ozA.NONE) {
                jSONObject20.put("no_setting_reason", enumC1494180ozA.getValue());
            }
            long j7 = this.LJJJJL.LJJIJL.LJ;
            long length2 = 0;
            if (j7 > 0) {
                jSONObject20.put("first_config_delay", j7);
            }
            jSONObject19.put("sampling", jSONObject20);
            jSONObject.put("log", jSONObject19);
            if (this.LJJ != null) {
                JSONObject jSONObject21 = new JSONObject();
                List<String> listLJIIJJI2 = this.LJJ.LJIIJJI("Cookie");
                if (!C086I.LIZIZ(listLJIIJJI2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                jSONObject21.put("Cookie", z3);
                if (z3) {
                    for (String str7 : listLJIIJJI2) {
                        if (str7 != null) {
                            length2 += (long) str7.length();
                        }
                    }
                    jSONObject21.put("add_cookie_bytes", length2);
                }
                String strLIZLLL3 = this.LJJ.LIZLLL("x-tt-token");
                if (strLIZLLL3 != null && !strLIZLLL3.isEmpty()) {
                    jSONObject21.put("token_md5", ByteString.encodeUtf8(strLIZLLL3).md5().hex());
                }
                if ("http".equalsIgnoreCase(this.LJJIII)) {
                    if (listLJIIJJI2 != null && !listLJIIJJI2.isEmpty() && (setLIZ = C826940WcG.LIZ(listLJIIJJI2)) != null) {
                        JSONArray jSONArray6 = new JSONArray();
                        Iterator<String> it2 = setLIZ.iterator();
                        while (it2.hasNext()) {
                            jSONArray6.put(it2.next());
                        }
                        jSONObject21.put("insecure_cookies", jSONArray6);
                    }
                    Set<String> setLIZIZ = C826940WcG.LIZIZ(this.LJJ);
                    if (setLIZIZ != null) {
                        JSONArray jSONArray7 = new JSONArray();
                        Iterator<String> it3 = setLIZIZ.iterator();
                        while (it3.hasNext()) {
                            jSONArray7.put(it3.next());
                        }
                        jSONObject21.put("insecure_headers", jSONArray7);
                    }
                }
                jSONObject.put("session", jSONObject21);
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C786410Ut5.v3();
        }
        return C786410Ut5.J3(jSONObject);
    }

    public C1494920p0M(C1494600ozq c1494600ozq, Context context) {
        this.LJJJJL = c1494600ozq;
        this.LJJJJLI = context;
    }

    public static int LIZJ(IOException iOException, int i) {
        if (iOException == null) {
            return i;
        }
        try {
            int iLIZLLL = LIZLLL(i, iOException.getMessage());
            if (iLIZLLL != i) {
                return iLIZLLL;
            }
            try {
                Throwable cause = iOException.getCause();
                if (cause == null) {
                    return iLIZLLL;
                }
                String message = cause.getMessage();
                if (TextUtils.isEmpty(message)) {
                    return iLIZLLL;
                }
                return LIZLLL(i, message);
            } catch (Throwable th) {
                th = th;
                i = iLIZLLL;
                TryCatchGuardChecker.doCheck(th);
                return i;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static int LIZLLL(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        if (!str.contains("ECONNRESET") && !str.contains("Connection reset") && !str.contains("reset by peer")) {
            if (str.contains("ECONNREFUSED")) {
                return -102;
            }
            if (!str.contains("CONNECTION_ABORTED") && !str.contains("connection abort")) {
                if (!str.contains("ENETDOWN") && !str.contains("Network is unreachable")) {
                    if (!str.contains("EHOSTUNREACH") && !str.contains("ENETUNREACH")) {
                        if (str.contains("EADDRNOTAVAIL")) {
                            return -108;
                        }
                        if (!str.contains("EADDRINUSE")) {
                            return i;
                        }
                        return -147;
                    }
                    return -109;
                }
                return -106;
            }
            return -103;
        }
        return -101;
    }

    public static void LJI(String str, long j, JSONObject jSONObject) throws JSONException {
        String[] strArrSplit;
        HashMap map = new HashMap();
        C1494990p0T c1494990p0T = new C1494990p0T();
        if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(",")) != null) {
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";");
                if (strArrSplit2 != null && strArrSplit2.length == 2 && !TextUtils.isEmpty(strArrSplit2[0]) && !TextUtils.isEmpty(strArrSplit2[1])) {
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                }
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String strTrim = ((String) entry.getKey()).trim();
            String strTrim2 = ((String) entry.getValue()).trim();
            if (strTrim.equalsIgnoreCase("cdn-cache")) {
                c1494990p0T.LIZ = true;
                String[] strArrSplit3 = strTrim2.split("=");
                if (strArrSplit3.length == 2 && strArrSplit3[1].equalsIgnoreCase("hit")) {
                    c1494990p0T.LIZIZ = true;
                } else {
                    c1494990p0T.LIZIZ = false;
                }
            } else if (strTrim.equalsIgnoreCase("edge")) {
                c1494990p0T.LIZJ = LJIIJJI(strTrim2);
            } else if (strTrim.equalsIgnoreCase("origin")) {
                c1494990p0T.LIZLLL = LJIIJJI(strTrim2);
            } else if (strTrim.equalsIgnoreCase("inner")) {
                c1494990p0T.LJ = LJIIJJI(strTrim2);
            } else if (!TextUtils.isEmpty(strTrim)) {
                jSONObject.put(strTrim, LJIIJJI(strTrim2));
            }
        }
        if (c1494990p0T.LIZ) {
            if (c1494990p0T.LIZIZ) {
                jSONObject.put("edge", c1494990p0T.LIZJ);
                jSONObject.put("cdn-cache", "hit");
                if (j != -1) {
                    long j2 = c1494990p0T.LIZJ;
                    if (j > j2) {
                        c1494990p0T.LJFF = j - j2;
                    }
                }
                jSONObject.put("rtt", c1494990p0T.LJFF);
                return;
            }
            jSONObject.put("edge", c1494990p0T.LIZJ);
            jSONObject.put("cdn-cache", "miss");
            long j3 = c1494990p0T.LIZLLL;
            long j4 = c1494990p0T.LJ;
            if (j3 > j4) {
                jSONObject.put("origin", j3 - j4);
            } else {
                jSONObject.put("origin", -1);
            }
            jSONObject.put("inner", c1494990p0T.LJ);
            if (j != -1) {
                long j5 = c1494990p0T.LIZLLL;
                long j6 = c1494990p0T.LIZJ;
                if (j > j5 + j6) {
                    c1494990p0T.LJFF = (j - j5) - j6;
                }
            }
            jSONObject.put("rtt", c1494990p0T.LJFF);
            return;
        }
        jSONObject.put("inner", c1494990p0T.LJ);
        if (j != -1) {
            long j7 = c1494990p0T.LJ;
            if (j > j7) {
                c1494990p0T.LJFF = j - j7;
            }
        }
        jSONObject.put("rtt", c1494990p0T.LJFF);
    }

    public final void LJIIIIZZ(String str, C1489590orl c1489590orl, boolean z) {
        if (z) {
            C1495000p0U c1495000p0U = new C1495000p0U();
            c1495000p0U.LIZ = 307;
            c1495000p0U.LIZLLL = true;
            c1495000p0U.LIZIZ = str;
            c1495000p0U.LIZJ = c1489590orl.LJI;
            ((ArrayList) this.LJJIJIL).add(c1495000p0U);
            this.LJJIJIIJIL++;
        }
        ((ArrayList) this.LJJJJ).add(c1489590orl);
    }

    public final void LJIIIZ(long j, String str, String str2, List list, boolean z) {
        C1495000p0U c1495000p0U = new C1495000p0U();
        c1495000p0U.LIZ = 307;
        c1495000p0U.LIZLLL = true;
        c1495000p0U.LIZIZ = str;
        c1495000p0U.LIZJ = str2;
        ((ArrayList) this.LJJIJIL).add(c1495000p0U);
        this.LJJIJIIJIL++;
        this.LJIILLIIL = j;
        this.LJJJI = true;
        if (z) {
            this.LJJJIL = true;
            this.LJJJJI = ((ConcurrentHashMap) l.LJ().LJIIIZ).size();
        } else {
            ((ArrayList) this.LJJJJ).addAll(list);
            this.LJJJIL = false;
        }
    }
}
