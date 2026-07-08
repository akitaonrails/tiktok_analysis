package X;

import Y.ARunnableS14S0301000_23;
import android.net.Uri;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.impl.NetworkExceptionImpl;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494100oz2 extends AbstractC1494150oz7 implements WeakHandler.IHandler {
    public static boolean LLLFFI;
    public static final Class LLLFZ;
    public String LLJILJIL;
    public final Set<String> LLJILJILJ;
    public String LLJILLL;
    public C1494120oz4 LLJJ;
    public final String LLJJI;
    public final String LLJJIII;
    public final String LLJJIJI;
    public final List<String> LLJJIJIIJIL;
    public final Object LLJJIJIL;
    public volatile AtomicInteger LLJJJ;
    public final List<HttpURLConnection> LLJJJIL;
    public volatile boolean LLJJJJ;
    public volatile HttpURLConnection LLJJJJJIL;
    public volatile int LLJJJJLIIL;
    public volatile C1494600ozq LLJJL;
    public volatile HttpURLConnection LLJJLIIIJLLLLLLLZ;
    public volatile C1494600ozq LLJL;
    public final List<C1494120oz4> LLJLIL;
    public volatile int LLJLILLLLZIIL;
    public final CountDownLatch LLJLL;
    public final WeakHandler LLJLLIL;
    public final long LLJLLL;
    public final boolean LLJZ;
    public final boolean LLJZIJLIL;
    public final long LLL;
    public long LLLF;
    public static final HandlerThread LLLFF = new HandlerThread("Concurrent-Handler");
    public static String LLLI = null;

    static {
        try {
            if (C1494230ozF.LJIL) {
                LLLFZ = NetworkExceptionImpl.class;
            } else {
                LLLFZ = Class.forName("com.ttnet.org.chromium.net.impl.NetworkExceptionImpl");
            }
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LLLFF.start();
    }

    @Override // X.AbstractC1494150oz7
    public final HttpURLConnection LJJIIJ() {
        return this.LLJJJJJIL != null ? this.LLJJJJJIL : this.LLJJLIIIJLLLLLLLZ;
    }

    public final void LJJJJJ() {
        this.LLJLLIL.removeCallbacksAndMessages(null);
        synchronized (this.LLJJIJIL) {
            try {
                if (this.LLJJJJ) {
                    return;
                }
                for (HttpURLConnection httpURLConnection : (CopyOnWriteArrayList) this.LLJJJIL) {
                    if (httpURLConnection != null) {
                        Iterator it2 = ((CopyOnWriteArrayList) this.LLJLIL).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C1494120oz4 c1494120oz4 = (C1494120oz4) it2.next();
                            if (c1494120oz4.LIZ == httpURLConnection.hashCode()) {
                                c1494120oz4.LIZLLL = System.currentTimeMillis();
                                if (this.LLJZIJLIL) {
                                    c1494120oz4.LJIIJ = System.currentTimeMillis();
                                } else {
                                    c1494120oz4.LJ = -999;
                                    c1494120oz4.LJI = new IOException("cleanupMessagesAndPendingConnections");
                                }
                            }
                        }
                        httpURLConnection.disconnect();
                        ((CopyOnWriteArrayList) this.LLJJJIL).remove(httpURLConnection);
                    }
                }
                this.LLILLJJLI.LIZLLL.LJIIIZ = LJJJJZI();
                this.LLJJJJ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final JSONObject LJJJJZI() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("concurrent", ((CopyOnWriteArrayList) this.LLJLIL).size() - 1);
            jSONObject.put("duration", System.currentTimeMillis() - this.LLILLJJLI.LJI);
            if (this.LLJZIJLIL && !TextUtils.isEmpty(LLLI)) {
                jSONObject.put("call_msg", LLLI);
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = ((CopyOnWriteArrayList) this.LLJLIL).iterator();
            while (it2.hasNext()) {
                jSONArray.put(((C1494120oz4) it2.next()).LIZ());
            }
            jSONObject.put("tasks", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0194  */
    @Override // X.AbstractC1494220ozE, X.InterfaceC1494830p0D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2175508fh execute() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1494100oz2.execute():X.08fh");
    }

    @Override // X.InterfaceC1494830p0D
    public final void cancel() {
        Logger.debug();
        synchronized (this.LLJJIJIL) {
            try {
                if (!this.LLJZIJLIL) {
                    this.LLJLL.countDown();
                }
                LJJJJJ();
                LJJII(this.LLJJJJJIL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static C1494600ozq LJJJJJL(C1494600ozq c1494600ozq) {
        C1494600ozq c1494600ozqCreate = C1494600ozq.LJJJJZ.create();
        C1494570ozn c1494570ozn = c1494600ozq.LIZLLL;
        if (c1494570ozn != null) {
            C1494570ozn c1494570ozn2 = new C1494570ozn();
            c1494570ozn.LJIIJJI(c1494570ozn2);
            c1494600ozqCreate.LJIILIIL(c1494570ozn2);
        }
        c1494600ozqCreate.LJJIIZ = c1494600ozq.LJJIIZ;
        c1494600ozqCreate.LIZJ = c1494600ozq.LIZJ;
        C1494110oz3 c1494110oz3 = c1494600ozq.LJJJJL;
        if (c1494110oz3 != null) {
            ArrayList arrayList = new ArrayList();
            for (C825090WYh c825090WYh : (ArrayList) c1494110oz3.LIZ) {
                c825090WYh.getClass();
                arrayList.add(new C825090WYh(c825090WYh.LIZ, c825090WYh.LIZIZ));
            }
            C1494110oz3 c1494110oz32 = new C1494110oz3(arrayList);
            c1494110oz32.LIZIZ = c1494110oz3.LIZIZ;
            for (C1494130oz5 c1494130oz5 : (CopyOnWriteArrayList) c1494110oz3.LIZJ) {
                List<C1494130oz5> list = c1494110oz32.LIZJ;
                String str = c1494130oz5.LIZ;
                String str2 = c1494130oz5.LIZIZ;
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list;
                copyOnWriteArrayList.add(new C1494130oz5(c1494130oz5.LIZJ, str, c1494130oz5.LJFF, str2, c1494130oz5.LIZLLL, c1494130oz5.LJ));
            }
            c1494600ozqCreate.LJJJJL = c1494110oz32;
        }
        c1494600ozqCreate.LJJIFFI = c1494600ozq.LJJIFFI;
        try {
            if (c1494600ozqCreate.LJJIIJZLJL != null) {
                c1494600ozqCreate.LJJIIJZLJL = new JSONObject(C786410Ut5.J3(c1494600ozqCreate.LJJIIJZLJL));
                return c1494600ozqCreate;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return c1494600ozqCreate;
    }

    @Override // X.AbstractC1494150oz7, X.InterfaceC1494830p0D
    public final boolean LIZ(long j) {
        this.LLIZLLLIL = j;
        if (this.LLJJJJJIL == null) {
            return true;
        }
        try {
            if (C1494230ozF.LIZJ) {
                AnonymousClass0803.LIZJ(this.LLJJJJJIL).LIZIZ("configureConnection", new Class[]{String.class, Object[].class}, "setThrottleNetSpeed", new Object[]{Long.valueOf(j)});
                return true;
            }
            AnonymousClass0803.LIZJ(this.LLJJJJJIL).LIZIZ("setThrottleNetSpeed", new Class[]{Long.TYPE}, Long.valueOf(j));
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public final void LJJJLIIL(C1494600ozq c1494600ozq) {
        if (c1494600ozq == null) {
            return;
        }
        c1494600ozq.LIZLLL.LJIIJJI(this.LLILLJJLI.LIZLLL);
        c1494600ozq.LIZLLL = this.LLILLJJLI.LIZLLL;
        this.LLILLJJLI = c1494600ozq;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message != null && (HandlerHook.getMessageObj(message.obj) instanceof Pair)) {
            try {
                Pair pair = (Pair) HandlerHook.getMessageObj(message.obj);
                C1494100oz2 c1494100oz2 = (C1494100oz2) pair.first;
                C1494600ozq c1494600ozq = (C1494600ozq) pair.second;
                int i = message.what;
                if (i != 0) {
                    if (i == 1) {
                        int i2 = message.arg1;
                        if (c1494100oz2.LLJLLIL.obtainMessage(0) != null) {
                            c1494100oz2.LLJLLIL.removeMessages(0);
                            c1494100oz2.LJJJJLI(c1494600ozq, i2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                c1494100oz2.LJJJJLI(c1494600ozq, 1002);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public C1494100oz2(Request request, C1493660oyK c1493660oyK) {
        super(request);
        this.LLJILJILJ = new CopyOnWriteArraySet();
        this.LLJILLL = "";
        this.LLJJ = null;
        this.LLJJIJIIJIL = new ArrayList();
        this.LLJJIJIL = new Object();
        int i = 0;
        this.LLJJJ = new AtomicInteger(0);
        this.LLJJJIL = new CopyOnWriteArrayList();
        this.LLJJJJ = false;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = -1;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
        this.LLJLIL = new CopyOnWriteArrayList();
        this.LLJLILLLLZIIL = 0;
        this.LLJLL = new CountDownLatch(1);
        this.LLJLLIL = new WeakHandler(C786410Ut5.W2(LLLFF), this);
        this.LLJZIJLIL = false;
        this.LLL = 0L;
        String url = request.getUrl();
        this.LLJILJIL = url;
        Uri uri = UriProtector.parse(url);
        String scheme = uri.getScheme();
        String host = uri.getHost();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(scheme);
        sbLIZ.append("://");
        sbLIZ.append(host);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String query = uri.getQuery();
        for (String str : c1493660oyK.LIZIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(scheme);
            sbLIZ2.append("://");
            sbLIZ2.append(str);
            String strReplaceFirst = this.LLJILJIL.replaceFirst(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
            if (!TextUtils.isEmpty(query)) {
                if (!query.contains("concurrent=")) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strReplaceFirst);
                    sbLIZ3.append("&concurrent=");
                    sbLIZ3.append(i);
                    strReplaceFirst = C2188811AlT.LIZIZ(sbLIZ3);
                }
                if (i > 0 && !query.contains("is_retry=")) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(strReplaceFirst);
                    sbLIZ4.append("&is_retry=1");
                    strReplaceFirst = C2188811AlT.LIZIZ(sbLIZ4);
                }
            }
            i++;
            ((ArrayList) this.LLJJIJIIJIL).add(strReplaceFirst);
        }
        String string = UUID.randomUUID().toString();
        this.LLJJI = string;
        this.LLJJIII = c1493660oyK.LJIIIIZZ;
        this.LLJJIJI = c1493660oyK.LJIILL;
        this.LLJLLL = c1493660oyK.LJIIL;
        LLLFFI = c1493660oyK.LJIILIIL;
        this.LLJZ = c1493660oyK.LJIILJJIL;
        this.LLL = c1493660oyK.LJIIZILJ;
        this.LLJZIJLIL = c1493660oyK.LJIILLIIL;
        InterfaceC1494070oyz interfaceC1494070oyz = C1494230ozF.LIZ;
        this.LLLF = 30000;
        if (request.getExtraInfo() instanceof C1494160oz8) {
            C1494160oz8 c1494160oz8 = (C1494160oz8) request.getExtraInfo();
            long j = c1494160oz8.LJIIIIZZ;
            if (j > 0) {
                this.LLLF = j;
            } else {
                long j2 = c1494160oz8.LIZJ;
                if (j2 > 0) {
                    long j3 = c1494160oz8.LIZLLL;
                    if (j3 > 0) {
                        this.LLLF = j2 + j3;
                    }
                }
            }
        }
        this.LLLF += 1000;
        Logger.debug();
        C1494570ozn c1494570ozn = this.LLILLJJLI.LIZLLL;
        c1494570ozn.LJIIJ = string;
        c1494570ozn.LJIIJJI = true;
    }

    public static String LJJJJL(String str, C1494120oz4 c1494120oz4) {
        if (c1494120oz4 == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            C1493630oyH.LIZIZ();
            String str2 = C1493630oyH.LIZJ.ttUrlDispatch(str, -1, true).LIZIZ;
            c1494120oz4.LJIIIIZZ = System.currentTimeMillis() - jCurrentTimeMillis;
            try {
                c1494120oz4.LJII = new URI(str2).getHost();
                Logger.debug();
                return c1494120oz4.LJII;
            } catch (URISyntaxException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException(e2);
        }
    }

    public final void LJJJJLI(C1494600ozq c1494600ozq, int i) {
        C1494600ozq c1494600ozqLJJJJJL = LJJJJJL(c1494600ozq);
        C1494600ozq c1494600ozqLJJJJJL2 = LJJJJJL(c1494600ozq);
        C1490590otN.LIZJ().LIZ(new C1490630otR("Concurrent-Call", EnumC1490640otS.IMMEDIATE, 0, new ARunnableS14S0301000_23(this, c1494600ozq, c1494600ozqLJJJJJL, i, 0)));
        long j = this.LLJLLL;
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        messageObtain.obj = new Pair(this, c1494600ozqLJJJJJL2);
        this.LLJLLIL.sendMessageDelayed(messageObtain, j);
    }

    public final Boolean LJJJJLL(String str, C1494120oz4 c1494120oz4) {
        if (C1497080p3q.LJFF()) {
            try {
                new URL(str).toURI();
                if (this.LLJJJ.get() == 0) {
                    this.LLJILLL = str;
                    this.LLJJ = c1494120oz4;
                    return Boolean.FALSE;
                }
                if (this.LLJJJ.get() == 1) {
                    ((CopyOnWriteArraySet) this.LLJILJILJ).add(LJJJJL(this.LLJILLL, this.LLJJ));
                }
                LJJJJL(str, c1494120oz4);
                if (((CopyOnWriteArraySet) this.LLJILJILJ).contains(c1494120oz4.LJII)) {
                    Boolean bool = Boolean.TRUE;
                    c1494120oz4.LJIIIZ = bool;
                    return bool;
                }
                ((CopyOnWriteArraySet) this.LLJILJILJ).add(c1494120oz4.LJII);
                return Boolean.FALSE;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return Boolean.TRUE;
            }
        }
        Logger.debug();
        return Boolean.TRUE;
    }

    public final IOException LJJJJZ(Exception exc, String str, HttpURLConnection httpURLConnection, boolean z) {
        int cronetInternalErrorCode;
        String str2 = str;
        if (!this.LLJZIJLIL && (exc instanceof IOException) && exc.getMessage() != null && exc.getMessage().startsWith("request canceled")) {
            return (IOException) exc;
        }
        if (!"com.ttnet.org.chromium.net.impl.NetworkExceptionImpl".equals(exc.getClass().getName()) && !"com.ttnet.org.chromium.net.impl.o0".equals(exc.getClass().getName())) {
            cronetInternalErrorCode = 0;
        } else {
            cronetInternalErrorCode = C1493630oyH.LIZJ.getCronetInternalErrorCode(httpURLConnection);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = this.LLJILJIL;
        }
        if (!z && httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        try {
            LJ(exc);
            C1494690ozz c1494690ozz = new C1494690ozz(exc, this.LLILLJJLI, cronetInternalErrorCode);
            C1494600ozq c1494600ozq = this.LLILLJJLI;
            c1494690ozz.setInfo(false, z, str2, c1494600ozq.LJJIJIIJIL, c1494600ozq);
            return c1494690ozz;
        } catch (C1494450ozb e) {
            TryCatchGuardChecker.doCheck(e);
            return e;
        }
    }
}
