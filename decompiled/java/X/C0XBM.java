package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XBM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0XBM {
    public static final C0XBC LJIIZILJ;
    public C844630XBl LIZLLL;
    public final Context LJ;
    public final C844770XBz LJFF;
    public final C844760XBy LJI;
    public C0XBX LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public C0XCK LJIILIIL;
    public final C0XCZ LJIILJJIL;
    public C0WV5 LJIILL;
    public final Map<Class<?>, C0XB9> LIZ = new LinkedHashMap(32);
    public final Object LIZIZ = new Object();
    public boolean LIZJ = false;
    public volatile boolean LJII = false;
    public final AtomicBoolean LJIIL = new AtomicBoolean(false);
    public int LJIILLIIL = 0;
    public JSONObject LJIIIIZZ = new JSONObject();

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0XBC] */
    static {
        new AtomicBoolean(true);
        LJIIZILJ = new AbstractC824140WUq<C0XB8>() { // from class: X.0XBC
            @Override // X.AbstractC824140WUq
            public final C0XB8 LIZ(Object[] objArr) {
                return new C0XB8((Context) objArr[0], (C844630XBl) objArr[2], (C844770XBz) objArr[1]);
            }
        };
    }

    public final C0XBN LIZJ() {
        synchronized (this.LIZIZ) {
            while (!this.LJII) {
                try {
                    try {
                        this.LIZIZ.wait();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C844830XCf.LIZLLL(e);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LJFF.getClass();
        C0XBK c0xbk = (C0XBK) C0XBH.LIZ(C0XBK.class, this.LJFF.LIZ());
        String deviceId = c0xbk != null ? c0xbk.getDeviceId() : this.LJIIIZ.LIZIZ("", "");
        this.LJFF.getClass();
        String strLIZ = this.LJIIIZ.LIZ("install_id");
        this.LJFF.getClass();
        String string = C844580XBg.LIZ(this.LJ, this.LJFF).getString("openudid", null);
        this.LJFF.getClass();
        String string2 = C844580XBg.LIZ(this.LJ, this.LJFF).getString("clientudid", null);
        String strLIZ2 = this.LJIIIZ.LIZ("ssid");
        C0XBN c0xbn = new C0XBN();
        if (TextUtils.isEmpty(deviceId)) {
            deviceId = "";
        }
        c0xbn.LL = deviceId;
        if (TextUtils.isEmpty(strLIZ)) {
            strLIZ = "";
        }
        c0xbn.LLILLJJLI = strLIZ;
        c0xbn.LLILZ = string2;
        c0xbn.LLILLL = string;
        c0xbn.LLILZIL = strLIZ2;
        return c0xbn;
    }

    public final int LIZLLL() {
        String strOptString = this.LJIIIIZZ.optString("device_id", "");
        String strOptString2 = this.LJIIIIZZ.optString("install_id", "");
        String strOptString3 = this.LJIIIIZZ.optString("bd_did", "");
        if ((C2123908Tt.LIZ(strOptString) || C2123908Tt.LIZ(strOptString3)) && C2123908Tt.LIZ(strOptString2)) {
            return C844580XBg.LIZ(this.LJ, this.LJFF).getLong("dr_install_vc", 0L) == this.LJIIIIZZ.optLong("version_code", -1L) ? 1 : 2;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ() {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XBM.LJ():boolean");
    }

    public final void LJI() {
        C0XCK c0xck;
        C0XBN c0xbnLIZJ = LIZJ();
        if (TextUtils.isEmpty(c0xbnLIZJ.LL) || TextUtils.isEmpty(c0xbnLIZJ.LLILLJJLI) || (c0xck = this.LJIILIIL) == null) {
            return;
        }
        c0xck.LIZ(new C0XBY(c0xbnLIZJ));
    }

    public final C0XBX LIZ(Context context, C844630XBl c844630XBl) {
        InterfaceC844940XCq interfaceC844940XCq = (InterfaceC844940XCq) C0XBH.LIZ(InterfaceC844940XCq.class, String.valueOf(this.LJFF.LIZ));
        C0WIB c0wib = new C0WIB(context, c844630XBl.LIZ(this.LJFF), this.LJFF);
        if (interfaceC844940XCq != null) {
            return (C0XBX) interfaceC844940XCq.LJII();
        }
        return c0wib;
    }

    public final boolean LIZIZ(Context context, C844630XBl c844630XBl) {
        String strLIZIZ;
        C0WV5 c0wv5 = new C0WV5(context, this.LJFF);
        this.LJIILL = c0wv5;
        boolean z = c0wv5.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("is one key migrate：");
        sbLIZ.append(z);
        C844830XCf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C844770XBz c844770XBz = this.LJFF;
            c844770XBz.getClass();
            C0XBK c0xbk = (C0XBK) C0XBH.LIZ(C0XBK.class, this.LJFF.LIZ());
            if (c0xbk != null) {
                strLIZIZ = c0xbk.getDeviceId();
            } else {
                strLIZIZ = this.LJIIIZ.LIZIZ("", "");
            }
            C0WV5.LIZ(context, c844770XBz, strLIZIZ, true);
            C844770XBz c844770XBz2 = this.LJFF;
            C844580XBg.LIZ(context, c844770XBz2).edit().remove("google_aid").remove("gaid_limited").apply();
            C2123908Tt.LJI(c844770XBz2.LIZJ(), new String[]{"device_id", "bd_did", "install_id", "device_token"});
            C2123908Tt.LJI(c844630XBl.LLILZIL.LIZIZ(context), new String[]{"device_id", "bd_did", "install_id", "device_token"});
            C2123908Tt.LJI(C810670Vr7.LIZJ(context, 0, "snssdk_openudid"), new String[]{"clientudid", "openudid"});
            C2123908Tt.LJI(C844580XBg.LIZ(context, c844770XBz2), new String[]{"clientudid", "openudid"});
            C0XB1.LIZ(context, c844770XBz2);
        }
        C0WV5 c0wv52 = this.LJIILL;
        c0wv52.getClass();
        C844830XCf.LIZ("MigrateDetector#disableComponent");
        try {
            c0wv52.LIZ.setComponentEnabledSetting(c0wv52.LIZIZ, 2, 1);
            c0wv52.LIZLLL.edit().putInt("component_state", 2).apply();
            return z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C844830XCf.LIZJ("MigrateDetector#disableComponent error", e);
            return z;
        }
    }

    public final boolean LJII(Object obj, String str) {
        Object objOpt = this.LJIIIIZZ.opt(str);
        if (obj != null) {
            if (obj.equals(objOpt)) {
                return false;
            }
        } else if (objOpt == null) {
            return false;
        }
        synchronized (C0XBM.class) {
            try {
                try {
                    JSONObject jSONObject = this.LJIIIIZZ;
                    JSONObject jSONObject2 = new JSONObject();
                    C2123908Tt.LIZJ(jSONObject2, jSONObject);
                    jSONObject2.put(str, obj);
                    this.LJIIIIZZ = jSONObject2;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C844830XCf.LIZLLL(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return true;
    }

    public C0XBM(Context context, C844630XBl c844630XBl, C844770XBz c844770XBz) {
        this.LJIILJJIL = null;
        this.LJ = context;
        this.LIZLLL = c844630XBl;
        this.LJFF = c844770XBz;
        this.LJI = new C844760XBy(c844770XBz);
        this.LJIIIZ = LIZ(context, c844630XBl);
        this.LJIILJJIL = C0XCI.LJII(String.valueOf(c844770XBz.LIZ)).LJII;
        final C0XBV c0xbv = (C0XBV) this;
        C824170WUt.LJ(new Runnable() { // from class: X.0XBO
            /* JADX WARN: Removed duplicated region for block: B:34:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    r5 = this;
                    X.0XBM r4 = r1
                    android.content.Context r2 = r4.LJ
                    r3 = 1
                    X.0XBz r0 = r4.LJFF     // Catch: java.lang.Throwable -> L33
                    boolean r0 = r0.LJIJI     // Catch: java.lang.Throwable -> L33
                    if (r0 != 0) goto L18
                    java.lang.String r0 = "disable OneKeyMigrateDetect"
                    X.C844830XCf.LIZ(r0)     // Catch: java.lang.Throwable -> L33
                L10:
                    X.0XBl r1 = r4.LIZLLL     // Catch: java.lang.Throwable -> L33
                    X.0XBz r0 = r4.LJFF     // Catch: java.lang.Throwable -> L33
                    X.C0XBL.LIZ(r2, r1, r0)     // Catch: java.lang.Throwable -> L33
                    goto L21
                L18:
                    X.0XBl r0 = r4.LIZLLL     // Catch: java.lang.Throwable -> L33
                    boolean r0 = r4.LIZIZ(r2, r0)     // Catch: java.lang.Throwable -> L33
                    if (r0 != 0) goto L21
                    goto L10
                L21:
                    java.lang.Object r1 = r4.LIZIZ
                    monitor-enter(r1)
                    r4.LJII = r3     // Catch: java.lang.Throwable -> L2d
                    java.lang.Object r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L2d
                    r0.notifyAll()     // Catch: java.lang.Throwable -> L2d
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
                    return
                L2d:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L2d
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
                    throw r0
                L33:
                    r2 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L33
                    java.lang.Object r1 = r4.LIZIZ
                    monitor-enter(r1)
                    r4.LJII = r3     // Catch: java.lang.Throwable -> L43
                    java.lang.Object r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L43
                    r0.notifyAll()     // Catch: java.lang.Throwable -> L43
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
                    throw r2
                L43:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L43
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0XBO.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DeviceManager@c54e.<init>$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DeviceManager@c54e.<init>$1");
            }
        }, c844770XBz.LIZ());
    }

    public final void LJFF(C0XBK c0xbk, String str, String str2) throws JSONException {
        String strLIZLLL = c0xbk.LIZLLL();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("old_id", str2);
        jSONObject.put("new_id", str);
        if (!this.LIZLLL.LL) {
            jSONObject.put("openudid", c0xbk.getOpenUdid());
        }
        jSONObject.put("clientudid", strLIZLLL);
        InterfaceC844540XBc interfaceC844540XBc = this.LJFF.LJJII;
        if (interfaceC844540XBc != null) {
            ((C2210711Bfh) interfaceC844540XBc).LIZ("did_change", jSONObject);
        }
    }
}
