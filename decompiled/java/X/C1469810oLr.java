package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import fyo.e;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469810oLr extends AbstractC1468760oKA {
    public static C1495520p1K LIZJ;
    public C1495500p1I LIZ;
    public int LIZIZ;

    static {
        C0X0P.LIZJ("application/json");
    }

    public static void LJFF() {
        if (LIZJ == null) {
            C1495510p1J c1495510p1J = new C1495510p1J();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            c1495510p1J.connectTimeout(10L, timeUnit);
            c1495510p1J.writeTimeout(10L, timeUnit);
            c1495510p1J.readTimeout(10L, timeUnit);
            LIZJ = C2204961BRm.k0(c1495510p1J, new C0WZX("dzBzEhEpEd7IQ14lQB2BaMaCmTvFu8ec22iEfgwxRclxcM6/Ouk=", null));
        }
    }

    @Override // X.AbstractC1468760oKA
    public final void LIZ() {
        C1495500p1I c1495500p1I = this.LIZ;
        if (c1495500p1I == null || c1495500p1I.LLILLJJLI.LIZLLL) {
            return;
        }
        this.LIZ.LIZ(-1);
    }

    public C1469810oLr() {
        if (LIZJ == null) {
            synchronized (C1469810oLr.class) {
                try {
                    LJFF();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.AbstractC1468760oKA
    public final void LIZIZ(String str, final C1467350oHt c1467350oHt) throws Throwable {
        synchronized (C1469810oLr.class) {
            try {
                LJFF();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C0X33 c0x33 = new C0X33();
        c0x33.LJII(str);
        Request requestLIZIZ = c0x33.LIZIZ();
        C1495520p1K c1495520p1K = LIZJ;
        c1495520p1K.getClass();
        C1495500p1I c1495500p1ILIZJ = C1495500p1I.LIZJ(c1495520p1K, requestLIZIZ, false);
        this.LIZ = c1495500p1ILIZJ;
        C2204961BRm.i0(c1495500p1ILIZJ, new InterfaceC1495610p1T() { // from class: X.0oLq
            @Override // X.InterfaceC1495610p1T
            public final void onFailure(InterfaceC1495580p1Q interfaceC1495580p1Q, IOException iOException) {
                this.LIZIZ.LIZIZ = 2;
                c1467350oHt.LIZIZ(null, new e("", -9994, 0, iOException.toString()));
            }

            @Override // X.InterfaceC1495610p1T
            public final void onResponse(InterfaceC1495580p1Q interfaceC1495580p1Q, C0XLY c0xly) throws Throwable {
                AbstractC842510X3h abstractC842510X3h;
                int i;
                JSONObject jSONObject;
                AbstractC842510X3h abstractC842510X3h2 = null;
                try {
                    abstractC842510X3h = c0xly.LLIZ;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    try {
                        jSONObject = new JSONObject(abstractC842510X3h.string());
                        i = -1;
                        e = null;
                        if (!c0xly.LIZIZ()) {
                            e = new Exception("http fail");
                            i = c0xly.LLILLL;
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        int i2 = C2187451AjH.LIZ;
                        TTVideoEngineLog.d(e);
                        i = -9979;
                        jSONObject = null;
                    }
                    if (abstractC842510X3h != null) {
                        try {
                            abstractC842510X3h.close();
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                    if (e == null) {
                        c1467350oHt.LIZIZ(jSONObject, null);
                    } else {
                        c1467350oHt.LIZIZ(jSONObject, new e("", i, 0, e.toString()));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    abstractC842510X3h2 = abstractC842510X3h;
                    TryCatchGuardChecker.doCheck(th);
                    if (abstractC842510X3h2 != null) {
                        try {
                            abstractC842510X3h2.close();
                            throw th;
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            throw th;
                        }
                    }
                    throw th;
                }
            }
        }, new C0WZX("dzBzEhEpEd7IQ14lQB2BaMaCmTvFu8ec22iEfgwxRclxcM6/Ouk=", null));
    }

    public final void LJ(Request request, final InterfaceC1309180kAm interfaceC1309180kAm) throws Throwable {
        synchronized (C1469810oLr.class) {
            try {
                int i = this.LIZIZ;
                if (i != 3 && i != 1) {
                    this.LIZIZ = 1;
                    C1495520p1K c1495520p1K = LIZJ;
                    c1495520p1K.getClass();
                    C1495500p1I c1495500p1ILIZJ = C1495500p1I.LIZJ(c1495520p1K, request, false);
                    this.LIZ = c1495500p1ILIZJ;
                    C2204961BRm.i0(c1495500p1ILIZJ, new InterfaceC1495610p1T() { // from class: X.0oLp
                        @Override // X.InterfaceC1495610p1T
                        public final void onFailure(InterfaceC1495580p1Q interfaceC1495580p1Q, IOException iOException) {
                            this.LIZIZ.LIZIZ = 2;
                            interfaceC1309180kAm.LIZIZ(null, new e("", -9994, 0, iOException.toString()));
                        }

                        @Override // X.InterfaceC1495610p1T
                        public final void onResponse(InterfaceC1495580p1Q interfaceC1495580p1Q, C0XLY c0xly) throws Throwable {
                            AbstractC842510X3h abstractC842510X3h;
                            JSONObject jSONObject;
                            String string;
                            int i2;
                            String strString;
                            synchronized (C1469810oLr.class) {
                                try {
                                    C1469810oLr c1469810oLr = this.LIZIZ;
                                    if (c1469810oLr.LIZIZ == 3) {
                                        return;
                                    }
                                    c1469810oLr.LIZIZ = 2;
                                    AbstractC842510X3h abstractC842510X3h2 = null;
                                    try {
                                        abstractC842510X3h = c0xly.LLIZ;
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                    try {
                                        try {
                                            strString = abstractC842510X3h.string();
                                            jSONObject = new JSONObject(strString);
                                        } catch (Exception e) {
                                            e = e;
                                            jSONObject = null;
                                        }
                                        try {
                                            int i3 = C2187451AjH.LIZ;
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("startTask onResponse body:");
                                            sbLIZ.append(strString);
                                            TTVideoEngineLog.d("TTHTTPNetwork", C2188811AlT.LIZIZ(sbLIZ));
                                            i2 = -1;
                                            string = null;
                                        } catch (Exception e2) {
                                            e = e2;
                                            TryCatchGuardChecker.doCheck(e);
                                            string = e.toString();
                                            i2 = -9994;
                                        }
                                        if (!c0xly.LIZIZ()) {
                                            string = c0xly.LLILZ;
                                            i2 = c0xly.LLILLL;
                                        }
                                        if (abstractC842510X3h != null) {
                                            try {
                                                abstractC842510X3h.close();
                                            } catch (Exception e3) {
                                            }
                                        }
                                        if (string == null) {
                                            interfaceC1309180kAm.LIZIZ(jSONObject, null);
                                        } else {
                                            interfaceC1309180kAm.LIZIZ(jSONObject, new e("", -9994, i2, string));
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        abstractC842510X3h2 = abstractC842510X3h;
                                        TryCatchGuardChecker.doCheck(th);
                                        if (abstractC842510X3h2 != null) {
                                            try {
                                                abstractC842510X3h2.close();
                                                throw th;
                                            } catch (Exception e32) {
                                                throw th;
                                            }
                                        }
                                        throw th;
                                    }
                                } finally {
                                    TryCatchGuardChecker.doCheck(e32);
                                }
                            }
                        }
                    }, new C0WZX("dzBzEhEpEd7IQ14lQB2BaMaCmTvFu8ec22iEfgwxRclxcM6/Ouk=", null));
                    return;
                }
                int i2 = C2187451AjH.LIZ;
                C1471660oOq.LIZJ("TTHTTPNetwork", "_startTask status error, return. " + this.LIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC1468760oKA
    public final void LIZJ(String str, Map<String, String> map, InterfaceC1309180kAm interfaceC1309180kAm) throws Throwable {
        synchronized (C1469810oLr.class) {
            try {
                LJFF();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C0X33 c0x33 = new C0X33();
        c0x33.LJII(str);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c0x33.LIZJ(entry.getKey(), entry.getValue());
                }
            }
        }
        LJ(c0x33.LIZIZ(), interfaceC1309180kAm);
    }

    @Override // X.AbstractC1468760oKA
    public final void LIZLLL(String str, Map map, InterfaceC1309180kAm interfaceC1309180kAm) throws Throwable {
        synchronized (C1469810oLr.class) {
            try {
                LJFF();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C0X33 c0x33 = new C0X33();
        c0x33.LJII(str);
        if (map != null && map.size() > 0) {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c0x33.LIZ((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        LJ(c0x33.LIZIZ(), interfaceC1309180kAm);
    }
}
