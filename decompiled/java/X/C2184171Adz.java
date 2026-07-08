package X;

import Y.ACallableS76S1100000_34;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Printer;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.setting.SecureSDKConfigSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Adz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184171Adz {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZIZ() {
        return TextUtils.equals(C0C64.LJIILLIIL().LJJ(31744, "enable_send_staging_adlog", "v3", true), "all");
    }

    public static final boolean LIZJ() {
        return TextUtils.equals(C0C64.LJIILLIIL().LJJ(31744, "enable_send_staging_adlog", "v3", true), "v1");
    }

    public static final C1022820ciu LIZLLL(String str, String str2, CommonAdData commonAdData) {
        String string;
        if (commonAdData == null) {
            return new C1022820ciu("", "", "", null, null, null);
        }
        Long creativeId = commonAdData.getCreativeId();
        if (creativeId != null) {
            creativeId.longValue();
            if (commonAdData.getGroupId() == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            } else {
                string = commonAdData.getGroupId().toString();
            }
            C1022820ciu c1022820ciu = new C1022820ciu(str, str2, commonAdData.getCreativeId().toString(), string, commonAdData.getLogExtra(), commonAdData);
            c1022820ciu.LIZIZ(Integer.valueOf(commonAdData.getChargeType()), "charge_type");
            c1022820ciu.LIZIZ(Integer.valueOf(commonAdData.getSystemOrigin()), "system_origin");
            synchronized (C1019290cdD.LIZ) {
                List<InterfaceC1019340cdI> list = C1019290cdD.LIZIZ;
                if (((ArrayList) list).isEmpty()) {
                    return c1022820ciu;
                }
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    try {
                        ((InterfaceC1019340cdI) it2.next()).LIZ(commonAdData, c1022820ciu);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJ(th);
                    }
                }
                return c1022820ciu;
            }
        }
        return new C1022820ciu("", "", "", null, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [X.1Ae0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.1Ae3] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.1BF0] */
    public static void LIZ(String str, String str2, String str3, JSONObject jSONObject) throws JSONException {
        int i;
        Printer printer;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str3);
        if (lLJIILIIL != null) {
            long jLongValue = lLJIILIIL.longValue();
            C01GW c01gw = SecureSDKConfigSetting.LIZIZ;
            if (((SecureSDKConfigSetting.SecureSDkConfig) c01gw.getValue()).isEnableCheck) {
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                if (!C2184221Ae4.LIZ) {
                    SecureSDKConfigSetting.SecureSDkConfig secureSDkConfig = (SecureSDKConfigSetting.SecureSDkConfig) c01gw.getValue();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("duplicate_check_threshold", secureSDkConfig.duplicateCheckThreshold);
                    jSONObject2.put("validate_skip_list", new JSONArray((Collection) secureSDkConfig.validateSkipList));
                    jSONObject2.put("duplicate_filter_list", new JSONArray((Collection) secureSDkConfig.duplicateFilterList));
                    final ?? r4 = new InterfaceC2184231Ae5() { // from class: X.1BF0
                        @Override // X.InterfaceC2184231Ae5
                        public final void onEventV3(String str4, JSONObject jSONObject3) {
                            ExecutorService logThreadPool;
                            ACallableS76S1100000_34 aCallableS76S1100000_34 = new ACallableS76S1100000_34(jSONObject3, str4, 4);
                            IAppLogDepend iAppLogDependLIZ = C2214471Bll.LIZ();
                            if (iAppLogDependLIZ != null) {
                                logThreadPool = iAppLogDependLIZ.getLogThreadPool();
                            } else {
                                logThreadPool = null;
                            }
                            C15O7.LIZIZ(aCallableS76S1100000_34, logThreadPool, null);
                        }
                    };
                    final ?? r3 = new InterfaceC2184201Ae2() { // from class: X.1Ae3
                        @Override // X.InterfaceC2184201Ae2
                        public final void LIZ(long j, String str4, String str5) {
                        }

                        @Override // X.InterfaceC2184201Ae2
                        public final void LIZIZ(int i2, String str4, String str5, long j, JSONObject jSONObject3) {
                        }
                    };
                    if (!C2184221Ae4.LIZ) {
                        C2184221Ae4.LIZ = true;
                        C786410Ut5.N3(contextLIZ);
                        int i2 = C2184161Ady.LIZ;
                        int iOptInt = jSONObject2.optInt("duplicate_check_threshold", 0);
                        C2184161Ady.LIZ = iOptInt;
                        if (iOptInt > 0) {
                            C2184161Ady.LIZIZ = Looper.getMainLooper();
                            C2184151Adx c2184151Adx = new Printer() { // from class: X.1Adx
                                @Override // android.util.Printer
                                public final void println(String str4) {
                                    boolean z;
                                    int i3 = C2184161Ady.LIZ;
                                    if (C2184161Ady.LJFF.nextInt(100) < C2184161Ady.LIZ) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    C2184161Ady.LJ = z;
                                    if (z && str4 != null && str4.charAt(0) == '>') {
                                        C1085650eMF<C2184251Ae7> c1085650eMF = C2184161Ady.LIZLLL;
                                        Iterator it2 = ((HashSet) C2184161Ady.LIZJ).iterator();
                                        while (it2.hasNext()) {
                                            try {
                                                c1085650eMF.LIZ((C2184251Ae7) it2.next());
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                            }
                                        }
                                        ((HashSet) C2184161Ady.LIZJ).clear();
                                    }
                                }
                            };
                            if (!C082U.LIZIZ) {
                                C082U.LIZIZ = true;
                                C082U.LIZ = new C082T();
                                try {
                                    Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
                                    declaredField.setAccessible(true);
                                    printer = (Printer) declaredField.get(Looper.getMainLooper());
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    printer = null;
                                }
                                C082U.LIZJ = printer;
                                if (C082U.LIZJ != null) {
                                    ((ArrayList) C082U.LIZ.LL).add(C082U.LIZJ);
                                }
                                C786410Ut5.LJIIZILJ(Looper.getMainLooper(), C082U.LIZ);
                            }
                            if (C082U.LIZ != null && C082U.LIZ.LLILLL != null && !((ArrayList) C082U.LIZ.LLILLL).contains(c2184151Adx)) {
                                ((ArrayList) C082U.LIZ.LLILLL).add(c2184151Adx);
                                C082U.LIZ.LLILZ = true;
                            }
                        }
                        final JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("validate_skip_list");
                        final JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("duplicate_filter_list");
                        C2184221Ae4.LIZIZ = new InterfaceC2184201Ae2(r3, r4, jSONArrayOptJSONArray2, jSONArrayOptJSONArray) { // from class: X.1Ae0
                            public final InterfaceC2184201Ae2 LIZ;
                            public final InterfaceC2184231Ae5 LIZIZ;
                            public final JSONArray LIZJ;
                            public final JSONArray LIZLLL;

                            public static boolean LIZJ(String str4, String str5, JSONArray jSONArray) throws JSONException {
                                if (jSONArray != null) {
                                    int length = jSONArray.length();
                                    for (int i3 = 0; i3 < length; i3++) {
                                        Object obj = jSONArray.get(i3);
                                        if (obj instanceof JSONArray) {
                                            JSONArray jSONArray2 = (JSONArray) obj;
                                            if (jSONArray2.length() >= 3 && ((Intrinsics.LJFF("event_v3", jSONArray2.get(0)) || Intrinsics.LJFF(jSONArray2.get(0), "*")) && ((Intrinsics.LJFF(str4, jSONArray2.get(1)) || Intrinsics.LJFF(jSONArray2.get(1), "*")) && (Intrinsics.LJFF(str5, jSONArray2.get(2)) || Intrinsics.LJFF(jSONArray2.get(2), "*"))))) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                                return false;
                            }

                            @Override // X.InterfaceC2184201Ae2
                            public final void LIZ(long j, String str4, String str5) {
                                if (!LIZJ(str4, str5, this.LIZJ)) {
                                    this.LIZIZ.onEventV3("ad_event_duplicated_monitor", new JSONObject().put("category", "event_v3").put("tag", str4).put("label", str5));
                                    InterfaceC2184201Ae2 interfaceC2184201Ae2 = this.LIZ;
                                    if (interfaceC2184201Ae2 != null) {
                                        interfaceC2184201Ae2.LIZ(j, str4, str5);
                                    }
                                }
                            }

                            {
                                this.LIZ = r3;
                                this.LIZIZ = r4;
                                this.LIZJ = jSONArrayOptJSONArray2;
                                this.LIZLLL = jSONArrayOptJSONArray;
                            }

                            @Override // X.InterfaceC2184201Ae2
                            public final void LIZIZ(int i3, String str4, String str5, long j, JSONObject jSONObject3) {
                                if (!LIZJ(str4, str5, this.LIZLLL)) {
                                    if (jSONObject3.has("is_ad_event")) {
                                        jSONObject3.remove("is_ad_event");
                                    }
                                    this.LIZIZ.onEventV3("ad_event_monitor", jSONObject3);
                                    InterfaceC2184201Ae2 interfaceC2184201Ae2 = this.LIZ;
                                    if (interfaceC2184201Ae2 != null) {
                                        interfaceC2184201Ae2.LIZIZ(i3, str4, str5, j, jSONObject3);
                                    }
                                }
                            }
                        };
                    }
                }
                if (C2184221Ae4.LIZ) {
                    C2184181Ae0 c2184181Ae0 = C2184221Ae4.LIZIZ;
                    if (contextLIZ != null) {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                jSONObject3.putOpt(next, jSONObject.opt(next));
                            }
                            jSONObject3.put("monitor_ad_id", jLongValue).put("tag", "invalid_ad").putOpt("monitor_tag", str).putOpt("monitor_label", str2).putOpt("category", "event_v3");
                            if (jLongValue <= 0 && jSONObject.optLong("value", 0L) <= 0) {
                                i = 4;
                            } else {
                                i = 0;
                            }
                            if (!jSONObject.has("log_extra") || TextUtils.isEmpty(jSONObject.optString("log_extra", ""))) {
                                i |= 2;
                            }
                            if (str2 == null || str2.length() == 0) {
                                i |= 8;
                            }
                            if (str == null || str.length() == 0) {
                                i |= 16;
                            }
                            if (!jSONObject3.has("is_ad_event")) {
                                i |= 32;
                            }
                            if (i > 0) {
                                jSONObject3.put("err_code", i);
                                if (c2184181Ae0 != null) {
                                    c2184181Ae0.LIZIZ(i, str, str2, jLongValue, jSONObject3);
                                }
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                    C2184181Ae0 c2184181Ae02 = C2184221Ae4.LIZIZ;
                    if (C2184161Ady.LJ && !(!Intrinsics.LJFF(C2184161Ady.LIZIZ, Looper.myLooper()))) {
                        Object objLIZIZ = C2184161Ady.LIZLLL.LIZIZ();
                        if (objLIZIZ == null) {
                            jSONObject.optString("log_extra");
                            objLIZIZ = new Object() { // from class: X.1Ae7
                            };
                        } else {
                            jSONObject.optString("log_extra");
                        }
                        HashSet hashSet = (HashSet) C2184161Ady.LIZJ;
                        if (!hashSet.contains(objLIZIZ)) {
                            hashSet.add(objLIZIZ);
                        } else if (c2184181Ae02 != null) {
                            c2184181Ae02.LIZ(jLongValue, str, str2);
                        }
                    }
                }
            }
        }
    }

    public static final C1022820ciu LJ(String str, String str2, String str3, String str4, String str5) {
        return new C1022820ciu(str, str2, str3, str5, str4, null);
    }
}
