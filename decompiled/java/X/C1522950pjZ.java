package X;

import Y.AObjectS16S1101000_23;
import Y.AObjectS296S0200000_23;
import Y.AObjectS397S0100000_23;
import Y.AObjectS94S1100000_23;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS34S0101000_23;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ttnet.org.chromium.net.e;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.chromium.CronetClient;
import org.chromium.wschannel.WsClient;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pjZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522950pjZ implements InterfaceC1524590pmD {
    public final C1304160k2g LIZ;
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public final ConcurrentHashMap<Integer, InterfaceC1523020pjg> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, Long> LIZLLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, C1502140pC0> LJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, JSONObject> LJFF = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, Runnable> LJI = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, Runnable> LJII = new ConcurrentHashMap<>();

    @Override // X.InterfaceC1304090k2Z
    public final void onPause() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onResume() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onStart() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onExit() {
        Unit unit;
        Enumeration<Integer> enumerationKeys = C1523000pje.LIZ.keys();
        ArrayList arrayList = new ArrayList();
        while (enumerationKeys.hasMoreElements()) {
            arrayList.add(enumerationKeys.nextElement());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LJJLJLI(((Number) it2.next()).intValue(), Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT), "module exit");
        }
        this.LIZJ.clear();
        this.LIZLLL.clear();
        this.LJ.clear();
        this.LJFF.clear();
        Iterator<T> it3 = this.LJI.values().iterator();
        while (it3.hasNext()) {
            this.LIZIZ.removeCallbacks((Runnable) it3.next());
        }
        this.LJI.clear();
        Iterator<T> it4 = this.LJII.values().iterator();
        while (it4.hasNext()) {
            this.LIZIZ.removeCallbacks((Runnable) it4.next());
        }
        this.LJII.clear();
        C08O9.LIZ.getClass();
        if (C08O9.LIZIZ.get()) {
            try {
                e cronetEngine = CronetClient.getCronetEngine();
                if (cronetEngine != null) {
                    cronetEngine.LJI();
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C08O9.LIZIZ.set(false);
        }
    }

    public C1522950pjZ(C1304160k2g c1304160k2g) {
        this.LIZ = c1304160k2g;
    }

    public static C1502140pC0 LJLIIIL(String str) {
        List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(u.LJJIFFI(str, "\r\n", "\n", false), new String[]{"\n"}, 0, 6);
        C1502130pBz c1502130pBz = new C1502130pBz();
        boolean z = false;
        for (String str2 : listLJJLIIIJILLIZJL) {
            int iLJJIZ = a0.LJJIZ(str2, ':', 0, false, 6);
            if (iLJJIZ > 0) {
                String string = a0.LJLIIIL(str2.substring(0, iLJJIZ)).toString();
                String string2 = a0.LJLIIIL(str2.substring(iLJJIZ + 1)).toString();
                if (string.length() > 0) {
                    c1502130pBz.LIZ(string, string2);
                    z = true;
                }
            }
        }
        if (z) {
            return c1502130pBz.LIZIZ();
        }
        return null;
    }

    public static C1502140pC0 LJLIIL(String str) {
        Object c098200Yq;
        C1502140pC0 c1502140pC0LJLIIL;
        String string = a0.LJLIIIL(str).toString();
        if (!u.LJJIIJZLJL(string, "{", false)) {
            return null;
        }
        try {
            c098200Yq = new JSONObject(string);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSONObject jSONObject = (JSONObject) c098200Yq;
        if (jSONObject == null) {
            return null;
        }
        for (String str2 : C1697810uHb.LJIIJJI("responseHeader", "response_header", "responseHeaders", "response_headers", "headers", "header")) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str2);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                C1502130pBz c1502130pBz = new C1502130pBz();
                c1502130pBz.LIZJ(jSONObjectOptJSONObject);
                return c1502130pBz.LIZIZ();
            }
            String strOptString = jSONObject.optString(str2);
            if (strOptString != null && (!a0.LJJJIL(strOptString)) && (c1502140pC0LJLIIL = LJLIIL(strOptString)) != null) {
                return c1502140pC0LJLIIL;
            }
        }
        if (jSONObject.length() <= 0) {
            return null;
        }
        C1502130pBz c1502130pBz2 = new C1502130pBz();
        c1502130pBz2.LIZJ(jSONObject);
        return c1502130pBz2.LIZIZ();
    }

    @Override // X.InterfaceC1524590pmD
    public final boolean LJJIIJZLJL(int i) {
        return C1523000pje.LIZ.containsKey(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1524590pmD
    public final boolean LJJJLZIJ(int i) {
        AtomicBoolean atomicBoolean;
        C1522990pjd c1522990pjd = C1523000pje.LIZ.get(Integer.valueOf(i));
        if (c1522990pjd != null && (atomicBoolean = c1522990pjd.LIZIZ) != null && atomicBoolean.get()) {
            return true;
        }
        return false;
    }

    public final void LJJZ(int i) {
        Runnable runnableRemove = this.LJII.remove(Integer.valueOf(i));
        if (runnableRemove != null) {
            this.LIZIZ.removeCallbacks(runnableRemove);
        }
    }

    public final void LJJZZI(int i) {
        Runnable runnableRemove = this.LJI.remove(Integer.valueOf(i));
        if (runnableRemove != null) {
            this.LIZIZ.removeCallbacks(runnableRemove);
        }
    }

    public final void LJJZZIII(int i) {
        this.LJFF.remove(Integer.valueOf(i));
        LJJZZI(i);
    }

    public final void LJL(Function0<Unit> function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), this.LIZIZ.getLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS106S0100000_6((Function0) function0, 5));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // X.InterfaceC1524590pmD
    public final boolean LJIIJJI(C1522970pjb c1522970pjb, C1522980pjc c1522980pjc) {
        Object obj;
        if (this.LIZJ.containsKey(Integer.valueOf(c1522970pjb.LIZ))) {
            return false;
        }
        C08O9 c08o9 = C08O9.LIZ;
        Context contextLIZ = this.LIZ.LIZ();
        c08o9.getClass();
        if (!C08O9.LIZIZ.get()) {
            try {
                e cronetEngine = CronetClient.getCronetEngine();
                if (cronetEngine != null) {
                    C0VSJ c0vsj = new C0VSJ(C08O9.LIZ(contextLIZ), "cronet_ws.json");
                    if (c0vsj.exists()) {
                        try {
                            C189200o6.m2constructorimpl(Boolean.valueOf(c0vsj.delete()));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                    cronetEngine.LJFF(c0vsj.getAbsolutePath());
                    C08O9.LIZIZ.set(true);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C08O9.LIZIZ.set(false);
                th2.getMessage();
            }
        }
        this.LIZLLL.put(Integer.valueOf(c1522970pjb.LIZ), Long.valueOf(SystemClock.elapsedRealtime()));
        this.LJ.remove(Integer.valueOf(c1522970pjb.LIZ));
        LJJZZIII(c1522970pjb.LIZ);
        final int i = c1522970pjb.LIZ;
        IMessageReceiveListener iMessageReceiveListener = new IMessageReceiveListener() { // from class: X.0pja
            /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
            @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onFeedBackLog(java.lang.String r10) {
                /*
                    Method dump skipped, instruction units count: 269
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1522960pja.onFeedBackLog(java.lang.String):void");
            }

            @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener
            public final void onMessage(byte[] bArr, int i2) {
                Object c098200Yq;
                InterfaceC1523020pjg interfaceC1523020pjg = this.LIZ.LIZJ.get(Integer.valueOf(i));
                if (interfaceC1523020pjg == null) {
                    return;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        this.LIZ.LJL(new AObjectS296S0200000_23(interfaceC1523020pjg, bArr, 1));
                        return;
                    } else {
                        this.LIZ.LJL(new AObjectS296S0200000_23(interfaceC1523020pjg, bArr, 0));
                        return;
                    }
                }
                try {
                    c098200Yq = new String(bArr, Charsets.UTF_8);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = "";
                }
                this.LIZ.LJL(new AObjectS94S1100000_23(interfaceC1523020pjg, (String) c098200Yq, 0));
            }

            @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener
            public final void onConnection(int i2, String str, JSONObject jSONObject) {
                AtomicBoolean atomicBoolean;
                InterfaceC1523020pjg interfaceC1523020pjg = this.LIZ.LIZJ.get(Integer.valueOf(i));
                if (interfaceC1523020pjg == null) {
                    return;
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                String strOptString = jSONObject.optString("error", "");
                int iOptInt = jSONObject.optInt("error_code", 0);
                int iOptInt2 = jSONObject.optInt("close_code", jSONObject.optInt("code", -1));
                String strOptString2 = jSONObject.optString("close_reason", jSONObject.optString("reason", ""));
                String strOptString3 = jSONObject.optString("request_log", "");
                jSONObject.toString();
                strOptString3.length();
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            this.LIZ.LJJZ(i);
                            C1522990pjd c1522990pjd = C1523000pje.LIZ.get(Integer.valueOf(i));
                            if (c1522990pjd != null && (atomicBoolean = c1522990pjd.LIZIZ) != null) {
                                atomicBoolean.set(true);
                            }
                            C1502140pC0 c1502140pC0Remove = this.LIZ.LJ.remove(Integer.valueOf(i));
                            if (c1502140pC0Remove == null) {
                                this.LIZ.getClass();
                                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
                                if (jSONObjectOptJSONObject == null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("headers")) == null) {
                                    c1502140pC0Remove = C1502140pC0.LIZIZ;
                                } else {
                                    C1502130pBz c1502130pBz = new C1502130pBz();
                                    c1502130pBz.LIZJ(jSONObjectOptJSONObject);
                                    c1502140pC0Remove = c1502130pBz.LIZIZ();
                                }
                            }
                            List<C1502120pBy> list = c1502140pC0Remove.LIZ;
                            if (list == null) {
                                list = null;
                            }
                            if (list.size() == 0) {
                                this.LIZ.LJFF.put(Integer.valueOf(i), new JSONObject(C786410Ut5.J3(jSONObject)));
                                C1522950pjZ c1522950pjZ = this.LIZ;
                                int i3 = i;
                                c1522950pjZ.LJJZZI(i3);
                                ARunnableS34S0101000_23 aRunnableS34S0101000_23 = new ARunnableS34S0101000_23(c1522950pjZ, i3, 1);
                                c1522950pjZ.LJI.put(Integer.valueOf(i3), aRunnableS34S0101000_23);
                                C786410Ut5.LJLIIL(500L, c1522950pjZ.LIZIZ, aRunnableS34S0101000_23);
                                return;
                            }
                            this.LIZ.LJLI(i, c1502140pC0Remove, new JSONObject(C786410Ut5.J3(jSONObject)), interfaceC1523020pjg);
                            return;
                        }
                        return;
                    }
                    this.LIZ.LJJZ(i);
                    C1523000pje.LIZ.remove(Integer.valueOf(i));
                    this.LIZ.LIZJ.remove(Integer.valueOf(i));
                    this.LIZ.LIZLLL.remove(Integer.valueOf(i));
                    this.LIZ.LJ.remove(Integer.valueOf(i));
                    this.LIZ.LJJZZIII(i);
                    if (iOptInt2 < 0) {
                        iOptInt2 = LSPassThroughRecordSizeConfig.DEFAULT;
                    }
                    if (!a0.LJJJIL(strOptString2)) {
                        strOptString = strOptString2;
                    }
                    this.LIZ.LJL(new AObjectS16S1101000_23(interfaceC1523020pjg, iOptInt2, strOptString, 0));
                    return;
                }
                this.LIZ.LJJZ(i);
                C1523000pje.LIZ.remove(Integer.valueOf(i));
                this.LIZ.LIZJ.remove(Integer.valueOf(i));
                this.LIZ.LIZLLL.remove(Integer.valueOf(i));
                this.LIZ.LJ.remove(Integer.valueOf(i));
                this.LIZ.LJJZZIII(i);
                if (iOptInt == 0) {
                    iOptInt = EnumC1523070pjl.INTERNAL_ERROR.getCode();
                }
                if (strOptString.length() == 0) {
                    strOptString = "socket error";
                }
                this.LIZ.LJL(new AObjectS16S1101000_23(interfaceC1523020pjg, iOptInt, strOptString, 1));
            }
        };
        if (!C1523000pje.LIZ.containsKey(Integer.valueOf(i))) {
            Uri uri = UriProtector.parse(c1522970pjb.LIZIZ);
            String string = uri.buildUpon().clearQuery().build().toString();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = UriProtector.getQueryParameterNames(uri).iterator();
            while (true) {
                obj = "";
                if (!it2.hasNext()) {
                    break;
                }
                String str = (String) it2.next();
                Object objLJJLIIIJL = C13LP.LJJLIIIJL(UriProtector.getQueryParameters(uri, str));
                if (objLJJLIIIJL != null) {
                    obj = objLJJLIIIJL;
                }
                linkedHashMap.put(str, obj);
            }
            Pair pair = new Pair(string, linkedHashMap);
            String str2 = (String) pair.getFirst();
            Map<String, String> map = (Map) pair.getSecond();
            C1502140pC0 c1502140pC0 = c1522970pjb.LIZJ;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            List<C1502120pBy> list = c1502140pC0.LIZ;
            if (list == null) {
                list = null;
            }
            for (C1502120pBy c1502120pBy : list) {
                linkedHashMap2.put(c1502120pBy.LIZ, c1502120pBy.LIZIZ);
            }
            List<String> list2 = c1522970pjb.LIZLLL;
            ?? LJJLIIIJ = obj;
            if (!list2.isEmpty()) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<String> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(a0.LJLIIIL(it3.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((String) obj2).length() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                LJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LJJJJI(arrayList2), ",", null, null, 0, null, null, 62);
            }
            if ((!a0.LJJJIL(LJJLIIIJ)) && !linkedHashMap2.containsKey("Sec-WebSocket-Protocol")) {
                linkedHashMap2.put("Sec-WebSocket-Protocol", LJJLIIIJ);
            }
            try {
                WsClient wsClient = new WsClient(iMessageReceiveListener);
                C1523000pje.LIZ.put(Integer.valueOf(c1522970pjb.LIZ), new C1522990pjd(wsClient));
                wsClient.openConnection(map, linkedHashMap2, C1697810uHb.LJIIL(str2), false, false);
                this.LIZJ.put(Integer.valueOf(c1522970pjb.LIZ), c1522980pjc);
                int i2 = c1522970pjb.LIZ;
                long j = c1522970pjb.LJ;
                if (j > 0) {
                    if (j <= 0) {
                        return true;
                    }
                } else {
                    j = 60000;
                }
                LJJZ(i2);
                ARunnableS34S0101000_23 aRunnableS34S0101000_23 = new ARunnableS34S0101000_23(this, i2, 0);
                this.LJII.put(Integer.valueOf(i2), aRunnableS34S0101000_23);
                C786410Ut5.LJLIIL(j, this.LIZIZ, aRunnableS34S0101000_23);
                return true;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                iMessageReceiveListener.onConnection(-1, str2, null);
            }
        }
        this.LIZLLL.remove(Integer.valueOf(c1522970pjb.LIZ));
        this.LJ.remove(Integer.valueOf(c1522970pjb.LIZ));
        LJL(new AObjectS397S0100000_23(c1522980pjc, 1));
        return false;
    }

    @Override // X.InterfaceC1524590pmD
    public final boolean LJJIJL(int i, String str, byte[] bArr) {
        int i2;
        InterfaceC1523020pjg interfaceC1523020pjg;
        boolean zSendMessage = false;
        if (str != null) {
            bArr = str.getBytes(Charset.forName("UTF-8"));
            i2 = 1;
        } else {
            if (bArr != null) {
                i2 = 2;
            }
            return zSendMessage;
        }
        C1522990pjd c1522990pjd = C1523000pje.LIZ.get(Integer.valueOf(i));
        if ((c1522990pjd == null || !(zSendMessage = c1522990pjd.LIZ.sendMessage(bArr, i2))) && (interfaceC1523020pjg = this.LIZJ.get(Integer.valueOf(i))) != null) {
            LJL(new AObjectS397S0100000_23(interfaceC1523020pjg, 0));
        }
        return zSendMessage;
    }

    @Override // X.InterfaceC1524590pmD
    public final boolean LJJLJLI(int i, Integer num, String str) {
        int iIntValue;
        InterfaceC1523020pjg interfaceC1523020pjgRemove = this.LIZJ.remove(Integer.valueOf(i));
        this.LJ.remove(Integer.valueOf(i));
        this.LIZLLL.remove(Integer.valueOf(i));
        LJJZZIII(i);
        LJJZ(i);
        C1522990pjd c1522990pjdRemove = C1523000pje.LIZ.remove(Integer.valueOf(i));
        boolean z = false;
        if (c1522990pjdRemove == null) {
            if (interfaceC1523020pjgRemove != null) {
                interfaceC1523020pjgRemove.onError(EnumC1523070pjl.SOCKET_CLOSE_FAIL.getCode(), "close fail");
            }
        } else {
            c1522990pjdRemove.LIZIZ.set(false);
            c1522990pjdRemove.LIZ.stopConnection();
            z = true;
            if (interfaceC1523020pjgRemove != null) {
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = LSPassThroughRecordSizeConfig.DEFAULT;
                }
                if (str == null) {
                    str = "";
                }
                interfaceC1523020pjgRemove.LIZ(iIntValue, str);
                return true;
            }
        }
        return z;
    }

    public final void LJLI(int i, final C1502140pC0 c1502140pC0, final JSONObject jSONObject, final InterfaceC1523020pjg interfaceC1523020pjg) {
        JSONObject jSONObjectOptJSONObject;
        jSONObject.put("header", c1502140pC0.LIZIZ());
        final String strOptString = jSONObject.optString("protocol");
        if (!(!a0.LJJJIL(strOptString)) && (((jSONObjectOptJSONObject = jSONObject.optJSONObject("header")) == null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("headers")) == null) || (strOptString = jSONObjectOptJSONObject.optString("Sec-WebSocket-Protocol")) == null || a0.LJJJIL(strOptString))) {
            strOptString = "";
        }
        if (!a0.LJJJIL(strOptString)) {
            jSONObject.put("protocol", strOptString);
        }
        Long lRemove = this.LIZLLL.remove(Integer.valueOf(i));
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("fetchStart", jLongValue);
            jSONObject2.put("domainLookUpStart", jLongValue);
            jSONObject2.put("domainLookUpEnd", jLongValue);
            jSONObject2.put("connectStart", jLongValue);
            jSONObject2.put("connectEnd", jElapsedRealtime);
            long j = jElapsedRealtime - jLongValue;
            jSONObject2.put("rtt", j);
            jSONObject2.put("handshakeCost", j);
            jSONObject2.put("cost", j);
            jSONObject.put("profile", jSONObject2);
        }
        LJL(new Function0() { // from class: X.0pjf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterfaceC1523020pjg interfaceC1523020pjg2 = interfaceC1523020pjg;
                C1502140pC0 c1502140pC02 = c1502140pC0;
                JSONObject jSONObject3 = jSONObject;
                interfaceC1523020pjg2.LIZIZ(c1502140pC02, jSONObject3.optString("protocol", strOptString), jSONObject3);
                return Unit.LIZ;
            }
        });
    }
}
