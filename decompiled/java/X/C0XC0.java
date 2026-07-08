package X;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import com.bytedance.android.sdk.ticketguard.TicketGuardFramework;
import com.bytedance.android.sdk.ticketguard.TicketGuardService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.account.ticketguard.AccountTicketGuardHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XC0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XC0 extends C0XC4 {
    public final C844770XBz LJII;
    public final C844630XBl LJIIIIZZ;
    public final C0XDG LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public final C0XCH LJIIL;

    @Override // X.C0XC4
    public final String LIZJ() {
        return "ds";
    }

    @Override // X.C0XC4
    public final long[] LIZLLL() {
        return new long[0];
    }

    @Override // X.C0XC4
    public final void LJ() {
    }

    @Override // X.C0XC4
    public final void LJFF() {
    }

    @Override // X.C0XC4
    public final long LJI() {
        return 0L;
    }

    @Override // X.C0XC4
    public final void LJIIIIZZ(int i) {
    }

    @Override // X.C0XC4
    public final void LIZ() {
        C844770XBz c844770XBz = this.LJII;
        InterfaceC844780XCa interfaceC844780XCa = C0XCJ.LIZIZ.LJIIIZ;
        if (interfaceC844780XCa == null || !interfaceC844780XCa.LIZJ("enable_event_track").booleanValue()) {
            return;
        }
        C0XC2 c0xc2LIZJ = C0XC2.LIZJ();
        int i = c844770XBz.LIZ;
        c0xc2LIZJ.getClass();
        if (c0xc2LIZJ.LIZIZ(String.valueOf(i)) != null) {
            C0XC2 c0xc2LIZJ2 = C0XC2.LIZJ();
            int i2 = c844770XBz.LIZ;
            c0xc2LIZJ2.getClass();
            c0xc2LIZJ2.LIZIZ(String.valueOf(i2)).LIZIZ(c844770XBz, "device_zti_get_dtoken_result");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C0XC4
    public final boolean LIZIZ() throws Throwable {
        Object objLJIIJ;
        Object obj;
        String base64ReePub;
        Object c098200Yq;
        C0XCI c0xci;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        SharedPreferences.Editor editorEdit2;
        SharedPreferences.Editor editorPutString2;
        String base64ReePub2;
        String str;
        String str2;
        C0XCI c0xciLJII;
        C0XBN c0xbnLJI;
        String string;
        String strLIZ;
        C0XC2 c0xc2LIZJ = C0XC2.LIZJ();
        int i = this.LJII.LIZ;
        c0xc2LIZJ.getClass();
        C0XCB c0xcbLIZIZ = c0xc2LIZJ.LIZIZ(String.valueOf(i));
        Uri uri = UriProtector.parse(this.LJIIIIZZ.LLILLJJLI.LLILLL);
        if (c0xcbLIZIZ != null) {
            String host = uri.getHost();
            if (host == null) {
                host = "";
            }
            c0xcbLIZIZ.LJIIIZ = host;
            String path = uri.getPath();
            c0xcbLIZIZ.LJIIIIZZ = path != null ? path : "";
            c0xcbLIZIZ.LJIIJ = this.LJIIJ;
            c0xcbLIZIZ.LJIIJJI = this.LJIIJJI;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("from", this.LJIIJJI);
        builderBuildUpon.appendQueryParameter("from_error", this.LJIIJ);
        String string2 = builderBuildUpon.build().toString();
        C0XCH c0xch = this.LJIIL;
        if (c0xch != null && (strLIZ = c0xch.LIZ(this.LIZ, new StringBuilder(string2), true, C0XDP.L0)) != null) {
            string2 = strLIZ;
        }
        if (string2.length() == 0) {
            C844870XCj.LIZ("dSign: url is empty");
            return false;
        }
        SharedPreferences sharedPreferencesLIZJ = this.LJII.LIZJ();
        C845030XCz c845030XCz = new C845030XCz(this.LJII);
        String str3 = "";
        if (!Intrinsics.LJFF(C0XCJ.LIZIZ.LJIIIZ.LIZJ("use_cached_device_properties"), Boolean.TRUE) || (string = this.LJII.LIZJ().getString("dsign_upload_params", "")) == null || string.length() == 0) {
            objLJIIJ = LJIIJ(c845030XCz);
        } else {
            try {
                objLJIIJ = new JSONObject(string);
                C189200o6.m2constructorimpl(objLJIIJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                objLJIIJ = new C098200Yq(th);
                C189200o6.m2constructorimpl(objLJIIJ);
            }
            if (C189200o6.m5exceptionOrNullimpl(objLJIIJ) != null) {
                objLJIIJ = LJIIJ(c845030XCz);
            }
        }
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("device_id", sharedPreferencesLIZJ.getString("device_id", ""));
            jSONObject2.put("install_id", sharedPreferencesLIZJ.getString("install_id", ""));
            jSONObject2.put("aid", this.LJII.LIZ);
            String strLJ = this.LJII.LJ();
            strLJ.toString();
            jSONObject2.put("app_version", strLJ);
            jSONObject2.put("model", Intrinsics.LJFF(Build.BRAND, "Pico") ? C2162708dd.LIZ() : Build.MODEL);
            jSONObject2.put("os", "Android");
            long j = this.LJII.LIZ;
            if (j <= 0 || (c0xciLJII = C0XCI.LJII(String.valueOf(j))) == null || (c0xbnLJI = c0xciLJII.LJI()) == null || (str = c0xbnLJI.LLILLL) == null) {
                str = "";
            }
            jSONObject2.put("openudid", str);
            if (!this.LJIIIIZZ.LL) {
                this.LJII.getClass();
                Pair<String, Boolean> pairLIZ = C0WV3.LIZ(this.LIZ, this.LJII);
                if (pairLIZ != null && (str2 = (String) pairLIZ.first) != null && str2.length() > 0) {
                    str3 = str2;
                }
            }
            jSONObject2.put("google_aid", str3);
            jSONObject2.put("properties_version", "android-1.0");
            jSONObject2.put("device_properties", objLJIIJ);
            C189200o6.m2constructorimpl(jSONObject2);
            obj = jSONObject2;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C098200Yq c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
            obj = c098200Yq2;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        Object jSONObject3 = obj;
        if (thM5exceptionOrNullimpl != null) {
            jSONObject3 = new JSONObject();
        }
        JSONObject jSONObject4 = (JSONObject) jSONObject3;
        if (c0xcbLIZIZ != null && c0xcbLIZIZ.LIZ <= 0) {
            c0xcbLIZIZ.LIZ = System.currentTimeMillis();
        }
        TicketGuardService service = TicketGuardFramework.INSTANCE.getService();
        if (service == null || (base64ReePub2 = service.getBase64ReePub()) == null || base64ReePub2.length() == 0) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AccountTicketGuardHelper.initTicketGuard(this.LJII.LIZJ, Long.MAX_VALUE, new AwS592S0100000_13(countDownLatch, 96));
            try {
                if (!countDownLatch.await(5L, TimeUnit.SECONDS)) {
                    if (c0xcbLIZIZ != null) {
                        c0xcbLIZIZ.LIZJ = Mp4ScreenVideoLoadTimeout.CONTROL;
                        c0xcbLIZIZ.LJFF = false;
                        if (c0xcbLIZIZ.LIZIZ <= 0) {
                            c0xcbLIZIZ.LIZIZ = System.currentTimeMillis();
                        }
                    }
                    C844870XCj.LIZ("dSign: initTicketGuardIn5S fail");
                    return false;
                }
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        TicketGuardService service2 = TicketGuardFramework.INSTANCE.getService();
        if (service2 == null || (base64ReePub = service2.getBase64ReePub()) == null || base64ReePub.length() == 0) {
            if (c0xcbLIZIZ != null) {
                if (c0xcbLIZIZ.LIZIZ <= 0) {
                    c0xcbLIZIZ.LIZIZ = System.currentTimeMillis();
                }
                c0xcbLIZIZ.LJFF = false;
            }
            C844870XCj.LIZ("dSign: getBase64ReePub real null");
            return false;
        }
        if (c0xcbLIZIZ != null) {
            c0xcbLIZIZ.LJFF = true;
        }
        HashMap mapLJI = C2097608Jq.LJI(new kotlin.Pair("tt-device-guard-iteration-version", "1"), new kotlin.Pair("tt-ticket-guard-public-key", base64ReePub));
        C844770XBz c844770XBz = this.LJII;
        InterfaceC23070092e interfaceC23070092e = c844770XBz.LIZIZ;
        boolean z = c844770XBz.LJJ;
        C0XD5 c0xd5 = c844770XBz.LJIIZILJ;
        HashMap<String, String> mapLIZLLL = C23069092d.LIZLLL(z, false);
        if (!mapLJI.isEmpty()) {
            mapLIZLLL.putAll(mapLJI);
        }
        try {
            byte[] bArrLJFF = C23069092d.LJFF(C786410Ut5.J3(jSONObject4), z, c0xd5);
            if (bArrLJFF != null && z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string2);
                sbLIZ.append("&tt_data=a");
                string2 = C2188811AlT.LIZIZ(sbLIZ);
            }
            String strPost = interfaceC23070092e.post(string2, mapLIZLLL, bArrLJFF);
            if (strPost != null) {
                try {
                    jSONObject = new JSONObject(strPost);
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("dSign # do dSign parse json error ");
                    sbLIZ2.append(strPost);
                    sbLIZ2.append(", ");
                    C844830XCf.LIZJ(C2188811AlT.LIZIZ(sbLIZ2), e2);
                }
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            C844830XCf.LIZJ("dSign#do dSign http error = ", e3);
        }
        if (c0xcbLIZIZ != null && c0xcbLIZIZ.LIZIZ <= 0) {
            c0xcbLIZIZ.LIZIZ = System.currentTimeMillis();
        }
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("message", "");
            boolean zLJFF = Intrinsics.LJFF(strOptString, "success");
            String strOptString2 = jSONObject.optString("tt-device-guard-server-data", "");
            this.LJIIIZ.LIZ(strOptString);
            if (strOptString2.length() == 0) {
                C844870XCj.LIZ("onDiSgnResult: deviceServerData isEmpty");
            } else {
                String strLIZ2 = C08G3.LIZ(strOptString2);
                if (strLIZ2.length() == 0) {
                    C844870XCj.LIZ(Intrinsics.LJIIJJI(strOptString2, "onDiSgnResult: base64DecodedString isEmpty, deviceServerData = "));
                } else {
                    try {
                        c098200Yq = new JSONObject(strLIZ2);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        c098200Yq = new C098200Yq(th3);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl2 == null) {
                        JSONObject jSONObject5 = (JSONObject) c098200Yq;
                        String strOptString3 = jSONObject5.optString("device_token", "");
                        if (strOptString3 == null) {
                            strOptString3 = "";
                        }
                        String strOptString4 = jSONObject5.optString("dtoken_sign", "");
                        if (strOptString4 == null) {
                            strOptString4 = "";
                        }
                        if (strOptString3.length() <= 0 || strOptString4.length() <= 0) {
                            C844870XCj.LIZ("onDiSgnResult: deviceToken or dTokenSign isEmpty, decodedString = " + ((Object) strLIZ2) + " deviceToken = " + strOptString3 + " dTokenSign = " + strOptString4);
                        } else {
                            C0XC5 c0xc5 = C0XC5.LIZ;
                            synchronized (c0xc5) {
                                try {
                                    C0XC5.LIZJ = strLIZ2;
                                    c0xci = C0XCJ.LIZIZ;
                                    SharedPreferences sharedPreferencesLIZIZ = C844580XBg.LIZIZ(c0xci.LJ());
                                    if (sharedPreferencesLIZIZ != null && (editorEdit2 = sharedPreferencesLIZIZ.edit()) != null && (editorPutString2 = editorEdit2.putString("device_token_info", strLIZ2)) != null) {
                                        editorPutString2.apply();
                                    }
                                    c0xc5.LIZLLL(c0xc5.LIZJ());
                                } catch (Throwable th4) {
                                    TryCatchGuardChecker.doCheck(th4);
                                    throw th4;
                                }
                            }
                            SharedPreferences sharedPreferencesLIZIZ2 = C844580XBg.LIZIZ(c0xci.LJ());
                            if (sharedPreferencesLIZIZ2 != null && (editorEdit = sharedPreferencesLIZIZ2.edit()) != null && (editorPutString = editorEdit.putString("public_key_bound_device_token", base64ReePub)) != null) {
                                editorPutString.apply();
                            }
                        }
                        if (c0xcbLIZIZ != null) {
                            c0xcbLIZIZ.LJ = strOptString3.length() > 0;
                            c0xcbLIZIZ.LJI = strOptString4.length() > 0;
                        }
                    } else {
                        C844870XCj.LIZ("onDiSgnResult: JSONObject(" + ((Object) strLIZ2) + ") error, message=" + ((Object) thM5exceptionOrNullimpl2.getMessage()));
                    }
                }
            }
            z = zLJFF;
            if (zLJFF) {
                this.LJFF = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x0276, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0191  */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r7v8, types: [X.0VSP, java.io.FileInputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject LJIIJ(X.C845030XCz r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XC0.LJIIJ(X.0XCz):org.json.JSONObject");
    }

    @Override // X.C0XC4
    public final void LJII(boolean z) {
        C0XCB c0xcbLIZIZ;
        C0XC2 c0xc2LIZJ = C0XC2.LIZJ();
        if (c0xc2LIZJ != null && (c0xcbLIZIZ = c0xc2LIZJ.LIZIZ(String.valueOf(this.LJII.LIZ))) != null) {
            c0xcbLIZIZ.LIZLLL = z;
        }
    }

    public C0XC0(C844770XBz c844770XBz, C844630XBl c844630XBl, C0XDG c0xdg) {
        super(c844770XBz.LIZJ, c844770XBz);
        this.LJII = c844770XBz;
        this.LJIIIIZZ = c844630XBl;
        this.LJIIIZ = c0xdg;
        this.LJIIJ = "normal";
        this.LJIIJJI = "normal";
        C0XCI c0xci = this.LJ;
        if (c0xci != null) {
            this.LJIIL = c0xci.LJI;
        }
    }
}
