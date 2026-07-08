package X;

import android.util.Log;
import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.Reference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18CE, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18CE implements InterfaceC20337014hs {
    public static final C18CE LIZ = new C18CE();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1287810jcJ());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1287800jcI());

    public static String LJ() {
        String canonicalName;
        JSONObject jSONObject = new JSONObject();
        Iterator it2 = new C13EO(C18CJ.LIZ).iterator();
        int i = 10;
        while (true) {
            C13EN c13en = (C13EN) it2;
            if (!c13en.hasNext()) {
                return C786410Ut5.J3(jSONObject);
            }
            Reference reference = (Reference) c13en.next();
            if (i <= 0) {
                return C786410Ut5.J3(jSONObject);
            }
            Object obj = reference.get();
            if (obj != null && (canonicalName = obj.getClass().getCanonicalName()) != null) {
                try {
                    C21248618Dk.LIZ.getClass();
                    jSONObject.put(canonicalName, C21248618Dk.LJIIIZ(obj));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            i--;
        }
    }

    public static void LIZJ(C18EK c18ek, String str) {
        Object objLIZ = C18CJ.LIZ();
        String str2 = c18ek.LIZ;
        boolean zLIZ = c18ek.LIZ();
        C21248618Dk.LIZ.getClass();
        C189C.LIZ(new C18BE(C21248618Dk.LJIIIZ(objLIZ), str2, str, zLIZ));
    }

    @Override // X.InterfaceC20337014hs
    public final void LIZ(Function0 function0, boolean z) {
        if (!z) {
            function0.invoke().toString();
            C18IP.LIZ.LIZLLL();
        }
    }

    public final void LIZLLL(String str, String str2) {
        if (str.length() == 0) {
            LIZIZ(2009, "", null, null, false, new C1909607du(str2));
        }
    }

    public static void LJIIIIZZ(Throwable th, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String string;
        if (th == null || C20321214fK.LIZ()) {
            return;
        }
        String stackTraceString = Log.getStackTraceString(th);
        int iMin = Math.min(stackTraceString.length(), LSPassThroughRecordSizeConfig.DEFAULT);
        String strSubstring = stackTraceString.substring(0, iMin);
        if (iMin > 0) {
            jSONObject2.put("stack_trace", strSubstring);
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strSubstring.getBytes(Charsets.UTF_8));
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b : bArrDigest) {
                    String hexString = Integer.toHexString(b & 255);
                    if (hexString.length() < 2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('0');
                        sbLIZ.append(hexString);
                        hexString = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    stringBuffer.append(hexString);
                }
                string = stringBuffer.toString();
            } catch (NoSuchAlgorithmException e) {
                TryCatchGuardChecker.doCheck(e);
                string = "";
            }
            if (string.length() > 0) {
                jSONObject.put("trace_id", string);
            }
        }
    }

    public final void LJFF(int i, String str, Object obj, Throwable th, boolean z) {
        C21248618Dk.LIZ.getClass();
        LJII(this, i, str, obj, C21248618Dk.LJIIIIZZ(obj), false, false, th, z, null, null, 768);
    }

    @Override // X.InterfaceC20337014hs
    public final void LIZIZ(int i, String str, Object obj, Throwable th, boolean z, Function1<? super JSONObject, Unit> function1) {
        C21248618Dk.LIZ.getClass();
        LJII(this, i, str, obj, C21248618Dk.LJIIIIZZ(obj), false, false, th, z, null, function1, 256);
    }

    public static void LJI(final int i, PageInfo pageInfo, String str, C1287850jcN c1287850jcN, Function1 function1, Function2 function2, int i2) {
        final Function2 c1699980uL6 = function2;
        final Function1 c18cf = function1;
        final Function0 c18ch = c1287850jcN;
        final String str2 = str;
        final PageInfo pageInfo2 = pageInfo;
        if ((i2 & 2) != 0) {
            pageInfo2 = null;
        }
        if ((i2 & 4) != 0) {
            str2 = "null";
        }
        if ((i2 & 8) != 0) {
            c18ch = new C18CH();
        }
        final Throwable th = null;
        final boolean z = false;
        if ((i2 & 64) != 0) {
            c18cf = new C18CF();
        }
        if ((i2 & 128) != 0) {
            c1699980uL6 = new C1699980uL6();
        }
        C18GU.LIZ.LIZ(new Runnable() { // from class: X.18Ap
            public final void LIZ() {
                String pageBtm;
                boolean z2 = z;
                try {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_code", i);
                        PageInfo pageInfo3 = pageInfo2;
                        if (pageInfo3 == null || (pageBtm = pageInfo3.getPageBtm()) == null) {
                            pageBtm = "null";
                        }
                        jSONObject.put("btm_page", pageBtm);
                        jSONObject.put("btm", str2);
                        Regex regex = C18C3.LIZ;
                        PageInfo pageInfo4 = pageInfo2;
                        jSONObject.put("btm_pre_page", C18C3.LIZIZ(pageInfo4 != null ? pageInfo4.getBtmPre() : null));
                        PageInfo pageInfo5 = pageInfo2;
                        jSONObject.put("btm_pre", C18C3.LJI(pageInfo5 != null ? pageInfo5.getBtmPre() : null));
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                    c18cf.invoke(jSONObject);
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("lazy_msg", String.valueOf(c18ch.invoke()));
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                    }
                    c1699980uL6.invoke(jSONObject2, "extra");
                    C18CE.LJIIIIZZ(th, jSONObject, jSONObject2);
                    PageInfo pageInfo6 = pageInfo2;
                    if (pageInfo6 == null || pageInfo6.getPageBtm() == null) {
                        jSONObject.optString("btm_page");
                    }
                    C443120HZe c443120HZe = new C443120HZe(Integer.valueOf(i), jSONObject, jSONObject2);
                    int iIntValue = ((Number) c443120HZe.getFirst()).intValue();
                    JSONObject jSONObject3 = (JSONObject) c443120HZe.getSecond();
                    JSONObject jSONObject4 = (JSONObject) c443120HZe.getThird();
                    C18A9 c18a9LJI = C18IP.LIZ.LJI();
                    if (c18a9LJI != null) {
                        c18a9LJI.LIZ(jSONObject3, jSONObject4);
                    }
                    try {
                        String strOptString = jSONObject3.optString("btm");
                        if (strOptString == null) {
                            strOptString = "";
                        }
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("category", jSONObject3);
                        jSONObject5.put("extraLog", jSONObject4);
                        C18BI.LIZ(iIntValue, strOptString, jSONObject5);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        C189200o6.m2constructorimpl(new C098200Yq(th4));
                    }
                    C18EG.LIZIZ(iIntValue, "BtmSDK_Monitor_" + iIntValue);
                    C18CK.LJIIIIZZ(String.valueOf(iIntValue), new C1782490wUB(jSONObject3, jSONObject4), z2);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    C189200o6.m2constructorimpl(new C098200Yq(th5));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BtmMonitor@2176.monitor$$inlined$monitor$btm_impl_i18nRelease$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BtmMonitor@2176.monitor$$inlined$monitor$btm_impl_i18nRelease$2");
            }
        }, true);
    }

    public static void LJII(C18CE c18ce, final int i, String str, Object obj, PageInfo pageInfo, boolean z, boolean z2, Throwable th, boolean z3, C1287840jcM c1287840jcM, Function1 function1, int i2) {
        final Function1 c18cg = function1;
        final boolean z4 = z;
        final Function0 c18ci = c1287840jcM;
        final PageInfo pageInfo2 = pageInfo;
        final Object obj2 = obj;
        final String str2 = str;
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        final Throwable th2 = null;
        if ((i2 & 4) != 0) {
            obj2 = null;
        }
        if ((i2 & 8) != 0) {
            pageInfo2 = null;
        }
        final boolean z5 = false;
        if ((i2 & 16) != 0) {
            z4 = false;
        }
        if ((i2 & 32) != 0) {
            z2 = false;
        }
        if ((i2 & 64) != 0) {
            th = null;
        }
        if ((i2 & 128) == 0) {
            z5 = z3;
        }
        if ((i2 & 256) != 0) {
            c18ci = new C18CI();
        }
        if ((i2 & 512) != 0) {
            c18cg = new C18CG();
        }
        c18ce.getClass();
        if (th == null) {
            if (z2) {
                th2 = new Throwable();
            }
        } else {
            th2 = th;
        }
        Runnable runnable = new Runnable() { // from class: X.18Aq
            public final void LIZ() {
                String canonicalName;
                String pageBtm;
                boolean z6 = z5;
                try {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        PageInfo pageInfo3 = pageInfo2;
                        if (pageInfo3 == null || (canonicalName = pageInfo3.getClassName()) == null) {
                            Object obj3 = obj2;
                            canonicalName = obj3 != null ? obj3.getClass().getCanonicalName() : null;
                        }
                        jSONObject.put("page_name", canonicalName);
                        jSONObject.put("error_code", i);
                        PageInfo pageInfo4 = pageInfo2;
                        jSONObject.put("step", pageInfo4 != null ? Integer.valueOf(pageInfo4.getStep()) : null);
                        PageInfo pageInfo5 = pageInfo2;
                        if (pageInfo5 == null || (pageBtm = pageInfo5.getPageBtm()) == null) {
                            pageBtm = "null";
                        }
                        jSONObject.put("btm_page", pageBtm);
                        Regex regex = C18C3.LIZ;
                        PageInfo pageInfo6 = pageInfo2;
                        jSONObject.put("btm_pre_page", C18C3.LIZIZ(pageInfo6 != null ? pageInfo6.getBtmPre() : null));
                        PageInfo pageInfo7 = pageInfo2;
                        jSONObject.put("btm_pre", C18C3.LJI(pageInfo7 != null ? pageInfo7.getBtmPre() : null));
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                    }
                    c18cg.invoke(jSONObject);
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_msg", str2);
                        jSONObject2.put("lazy_msg", String.valueOf(c18ci.invoke()));
                        if (z4) {
                            jSONObject2.put("page_list", C18CE.LJ());
                        }
                        C21241518Ar chainRecorderExp = BtmServiceImpl.INSTANCE.getChainRecorderExp();
                        PageInfo pageInfo8 = pageInfo2;
                        jSONObject2.put("btm_chain", chainRecorderExp.LIZ(10, pageInfo8 != null ? pageInfo8.getBtmPre() : null));
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                    }
                    C18CE.LJIIIIZZ(th2, jSONObject, jSONObject2);
                    C443120HZe c443120HZe = new C443120HZe(Integer.valueOf(i), jSONObject, jSONObject2);
                    int iIntValue = ((Number) c443120HZe.getFirst()).intValue();
                    JSONObject jSONObject3 = (JSONObject) c443120HZe.getSecond();
                    JSONObject jSONObject4 = (JSONObject) c443120HZe.getThird();
                    C18A9 c18a9LJI = C18IP.LIZ.LJI();
                    if (c18a9LJI != null) {
                        c18a9LJI.LIZ(jSONObject3, jSONObject4);
                    }
                    try {
                        String strOptString = jSONObject3.optString("btm");
                        if (strOptString == null) {
                            strOptString = "";
                        }
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("category", jSONObject3);
                        jSONObject5.put("extraLog", jSONObject4);
                        C18BI.LIZ(iIntValue, strOptString, jSONObject5);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th5) {
                        TryCatchGuardChecker.doCheck(th5);
                        C189200o6.m2constructorimpl(new C098200Yq(th5));
                    }
                    C18EG.LIZIZ(iIntValue, "BtmSDK_Monitor_" + iIntValue);
                    C18CK.LJIIIIZZ(String.valueOf(iIntValue), new C1782500wUC(jSONObject3, jSONObject4), z6);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th6) {
                    TryCatchGuardChecker.doCheck(th6);
                    C189200o6.m2constructorimpl(new C098200Yq(th6));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BtmMonitor@2176.monitor$$inlined$monitor$btm_impl_i18nRelease$3");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BtmMonitor@2176.monitor$$inlined$monitor$btm_impl_i18nRelease$3");
            }
        };
        if (z5) {
            runnable.run();
        } else {
            C18GU.LIZ.LIZ(runnable, true);
        }
    }
}
