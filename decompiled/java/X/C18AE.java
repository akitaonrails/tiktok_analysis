package X;

import android.util.Log;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.bcm.impl.model.BcmUnit;
import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS428S0200000_27;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18AE, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18AE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C18AD c18ad, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("btm: ");
        if (str2 != null) {
            str = str2;
        }
        sbLIZ.append(str);
        sbLIZ.append('\n');
        C2188811AlT.LIZIZ(sbLIZ);
        for (C18AF c18af : C18AF.values()) {
            List<C18AJ> list = c18ad.LIZ;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                if (obj instanceof C18AH) {
                    arrayList.add(obj);
                }
            }
            ArrayList<C18AI> arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((C18AH) obj2).LIZJ == c18af) {
                    arrayList2.add(obj2);
                }
            }
            if (!arrayList2.isEmpty()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(AnonymousClass1897.LIZ(2131827916));
                sbLIZ2.append(c18af.getErrorTip());
                sbLIZ2.append(": ");
                C2188811AlT.LIZIZ(sbLIZ2);
                for (C18AI c18ai : arrayList2) {
                    if (c18ai.LIZIZ.containsKey("expect_value")) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append('[');
                        sbLIZ3.append(AnonymousClass1897.LIZ(2131827912));
                        sbLIZ3.append((char) 65306);
                        sbLIZ3.append(c18ai.LIZIZ.get("expect_value"));
                        sbLIZ3.append(']');
                        C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    if (c18ai.LIZIZ.containsKey("actual_value")) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append('[');
                        sbLIZ4.append(AnonymousClass1897.LIZ(2131827914));
                        sbLIZ4.append((char) 65306);
                        sbLIZ4.append(c18ai.LIZIZ.get("actual_value"));
                        sbLIZ4.append(']');
                        C2188811AlT.LIZIZ(sbLIZ4);
                    }
                }
            }
        }
        C18AK c18akLIZIZ = c18ad.LIZIZ();
        if (c18akLIZIZ != null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(AnonymousClass1897.LIZ(2131827908));
            sbLIZ5.append(": ");
            sbLIZ5.append(c18akLIZIZ.LIZ);
            C2188811AlT.LIZIZ(sbLIZ5);
        }
    }

    public static void LIZ(int i, String str, String str2, Map map, BcmUnit bcmUnit, JSONObject jSONObject) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(AnonymousClass1897.LIZ(2131827910));
        sbLIZ.append(": ");
        sbLIZ.append(i);
        sbLIZ.append('\n');
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(AnonymousClass1897.LIZ(2131827911));
        sbLIZ2.append(": ");
        sbLIZ2.append(str);
        sbLIZ2.append('\n');
        C2188811AlT.LIZIZ(sbLIZ2);
        if (str2 != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(AnonymousClass1897.LIZ(2131827907));
            sbLIZ3.append(": ");
            sbLIZ3.append(str2);
            sbLIZ3.append('\n');
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (map != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(AnonymousClass1897.LIZ(2131827906));
            sbLIZ4.append(": ");
            sbLIZ4.append(map);
            sbLIZ4.append('\n');
            C2188811AlT.LIZIZ(sbLIZ4);
        }
        if (bcmUnit != null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(AnonymousClass1897.LIZ(2131827909));
            sbLIZ5.append(": ");
            sbLIZ5.append(bcmUnit);
            sbLIZ5.append('\n');
            C2188811AlT.LIZIZ(sbLIZ5);
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(AnonymousClass1897.LIZ(2131827915));
        sbLIZ6.append(": ");
        sbLIZ6.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ6);
    }

    public static void LIZLLL(final int i, final C18AD c18ad, String str, String str2, String str3, int i2) {
        final String str4 = str3;
        final String str5 = str2;
        final String str6 = str;
        final String str7 = null;
        if ((i2 & 4) != 0) {
            str6 = null;
        }
        if ((i2 & 8) != 0) {
            str5 = null;
        }
        if ((i2 & 16) != 0) {
            str4 = null;
        }
        final boolean z = false;
        C18GU.LIZ.LIZ(new Runnable() { // from class: X.18A8
            @Override // java.lang.Runnable
            public final void run() {
                String str8 = str6;
                int i3 = i;
                String str9 = str5;
                String str10 = str4;
                String str11 = str7;
                C18AD c18ad2 = c18ad;
                boolean z2 = z;
                C1C7U.LIZ("BcmMonitor@fd8f.monitorParamsCheck$1L");
                try {
                    JSONObject jSONObjectPutOpt = new JSONObject().putOpt("btm_page", str8).putOpt("error_code", Integer.valueOf(i3)).putOpt("btm", str9).putOpt("page_name", str10);
                    JSONObject jSONObjectPutOpt2 = new JSONObject().putOpt("error_msg", str11);
                    c18ad2.LIZ(jSONObjectPutOpt2);
                    C18A9 c18a9LJI = C18IP.LIZ.LJI();
                    if (c18a9LJI != null) {
                        c18a9LJI.LIZ(jSONObjectPutOpt, jSONObjectPutOpt2);
                    }
                    C18AE.LIZIZ(c18ad2, str8, str9);
                    Iterator<String> itKeys = jSONObjectPutOpt2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObjectPutOpt.putOpt(next, jSONObjectPutOpt2.opt(next));
                    }
                    String strValueOf = String.valueOf(i3);
                    AwS428S0200000_27 awS428S0200000_27 = new AwS428S0200000_27(jSONObjectPutOpt, jSONObjectPutOpt2, 1);
                    if (!C18CK.LIZLLL || C18CK.LIZJ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("monitor_");
                        sbLIZ.append(strValueOf);
                        C18CK.LIZ(C2188811AlT.LIZIZ(sbLIZ), awS428S0200000_27, z2);
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                C1C7U.LIZIZ("BcmMonitor@fd8f.monitorParamsCheck$1L");
            }
        }, true);
    }

    public static void LIZJ(final int i, String str, String str2, String str3, BcmUnit bcmUnit, Map map, String str4, Throwable th, Function1 function1, int i2) {
        final AFwS223S0000000_32 aFwS223S0000000_32;
        final String str5 = str4;
        final Map map2 = map;
        final BcmUnit bcmUnit2 = bcmUnit;
        final String str6 = str3;
        final String str7 = str2;
        final Function1 function12 = function1;
        final String str8 = str;
        if ((i2 & 2) != 0) {
            str8 = "";
        }
        final Throwable th2 = null;
        if ((i2 & 4) != 0) {
            str7 = null;
        }
        if ((i2 & 8) != 0) {
            str6 = null;
        }
        if ((i2 & 16) != 0) {
            bcmUnit2 = null;
        }
        if ((i2 & 32) != 0) {
            map2 = null;
        }
        if ((i2 & 64) != 0) {
            str5 = null;
        }
        final boolean z = false;
        if ((i2 & 256) != 0) {
            aFwS223S0000000_32 = AFwS223S0000000_32.get$arr$(20);
        } else {
            aFwS223S0000000_32 = null;
        }
        if ((i2 & 512) == 0) {
            th2 = th;
        }
        if ((i2 & 1024) != 0) {
            function12 = AFwS278S0000000_32.get$arr$(8);
        }
        C18GU.LIZ.LIZ(new Runnable() { // from class: X.18AA
            @Override // java.lang.Runnable
            public final void run() {
                BcmParams bcmParams;
                Function1 function13 = function12;
                int i3 = i;
                String str9 = str8;
                String str10 = str6;
                Map map3 = map2;
                BcmUnit bcmUnit3 = bcmUnit2;
                String str11 = str7;
                boolean z2 = z;
                Function0 function0 = aFwS223S0000000_32;
                String str12 = str5;
                Throwable th3 = th2;
                C1C7U.LIZ("BcmMonitor@fd8f.monitor$1L");
                Object obj = "";
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (str11 == null) {
                        str11 = "";
                    }
                    try {
                        jSONObject.put("page_name", str11);
                        jSONObject.put("error_code", i3);
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                    }
                    function13.invoke(jSONObject);
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("btmId", str10);
                        jSONObject2.put("params", map3);
                        jSONObject2.put("rule", bcmUnit3);
                        jSONObject2.put("error_msg", str9);
                        jSONObject2.put("lazy_msg", String.valueOf(function0.invoke()));
                        if (str12 != null) {
                            jSONObject2.put("btm_chain", BtmServiceImpl.INSTANCE.getChainRecorderExp().LIZ(10, str12));
                        }
                        if (th3 != null) {
                            String stackTraceString = Log.getStackTraceString(th3);
                            int length = stackTraceString.length();
                            if (length > 1000) {
                                length = LSPassThroughRecordSizeConfig.DEFAULT;
                            } else if (length > 0) {
                            }
                            jSONObject2.put("stack_trace", stackTraceString.substring(0, length));
                        }
                    } catch (Throwable th5) {
                        TryCatchGuardChecker.doCheck(th5);
                    }
                    C18A9 c18a9LJI = C18IP.LIZ.LJI();
                    if (c18a9LJI != null) {
                        c18a9LJI.LIZ(jSONObject, jSONObject2);
                    }
                    C18AE.LIZ(i3, str9, str10, map3, bcmUnit3, jSONObject);
                    if (bcmUnit3 != null) {
                        JSONArray jSONArray = new JSONArray();
                        List<? extends Object> list = bcmUnit3.enumValue;
                        if (list != null) {
                            Iterator<? extends Object> it2 = list.iterator();
                            while (it2.hasNext()) {
                                jSONArray.put(it2.next());
                            }
                        }
                        jSONObject.put("bcm_key", bcmUnit3.bcmFieldName);
                        jSONObject.put("arctic_bcm_params", jSONArray);
                        if (map3 != null && (bcmParams = (BcmParams) map3.get("ecom_entrance")) != null) {
                            obj = bcmParams;
                        }
                        jSONObject.put("origin_bcm_params", obj);
                    }
                    C18CK.LJIIIIZZ(String.valueOf(i3), new AwS428S0200000_27(jSONObject, jSONObject2, 0), z2);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th6) {
                    TryCatchGuardChecker.doCheck(th6);
                    C189200o6.m2constructorimpl(new C098200Yq(th6));
                }
                C1C7U.LIZIZ("BcmMonitor@fd8f.monitor$1L");
            }
        }, true);
    }
}
