package X;

import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.ugc.statisticlogger.btm.BackupConfigData;
import com.bytedance.ies.ugc.statisticlogger.btm.MonitorItem;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.q;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS73S1000000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0p7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499570p7r {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONObject LIZLLL() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject(BtmSDK.INSTANCE.getBcmChainStandardStringByFinder("c0.d0", PageFinder.via((Object) null), null));
        if (jSONObject2.opt("chain") == null) {
            jSONObject.put("generated_by_backup", 0);
            return jSONObject2.put("debug_params", jSONObject);
        }
        jSONObject.put("generated_by_backup", 1);
        return jSONObject2.put("debug_params", jSONObject);
    }

    public static C1499480p7i LJ(String str) {
        boolean zLJFF;
        MonitorItem monitorItem = null;
        boolean z = false;
        if (str == null) {
            return new C1499480p7i(null, false);
        }
        loop0: for (MonitorItem monitorItem2 : ((BackupConfigData) C1499530p7n.LIZIZ.getValue()).monitorList) {
            List<String> list = monitorItem2.rules;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str2 : list) {
                    if (u.LJJIIJZLJL(str2, "[start]", false)) {
                        zLJFF = u.LJJIIJZLJL(str, str2.substring(7), false);
                    } else if (u.LJJIIJZLJL(str2, "[end]", false)) {
                        zLJFF = u.LJIIZILJ(str, str2.substring(5), false);
                    } else {
                        zLJFF = Intrinsics.LJFF(str, str2);
                    }
                    if (!zLJFF) {
                        break;
                    }
                }
            }
            monitorItem = monitorItem2;
        }
        MonitorItem monitorItem3 = monitorItem;
        List<String> list2 = ((BackupConfigData) C1499530p7n.LIZIZ.getValue()).addChainToHeader;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<String> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (u.LJJIIJZLJL(str, it2.next(), false)) {
                    z = true;
                    break;
                }
            }
        }
        return new C1499480p7i(monitorItem3, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.gson.n] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static Pair LJII(String str) {
        ?? nVar;
        int i;
        try {
            InterfaceC1499580p7s.LIZ.getClass();
            i = 0;
            nVar = GsonProtectorUtils.parse(C1499590p7t.LIZIZ.getValue(), str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            nVar = 0;
            i = 1;
        }
        if (nVar == 0) {
            nVar = new n();
            C08LX c08lx = new C08LX(new C08LY(new C1939607ik(a0.LJJLIIIJILLIZJL(str, new String[]{"&"}, 0, 6)), AnonymousClass0207.get$arr$(110)));
            while (c08lx.hasNext()) {
                List list = (List) c08lx.next();
                String str2 = (String) C13LP.LJJJLZIJ(1, list);
                if (str2 != null) {
                    String str3 = (String) ListProtector.get(list, 0);
                    try {
                        InterfaceC1499580p7s.LIZ.getClass();
                        C1499590p7t.LIZIZ.getValue().getClass();
                        nVar.LJJIFFI(str3, p.LIZJ(str2));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        nVar.LJJIIJ(str3, str2);
                    }
                }
            }
        }
        return new Pair(nVar, Integer.valueOf(i));
    }

    public static String LIZJ(String str, MonitorItem monitorItem) {
        JSONObject jSONObject;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        if (monitorItem != null) {
            try {
                if (monitorItem.removeBcmKeys.isEmpty() || str.getBytes(Charsets.UTF_8).length <= monitorItem.maxLength || (jSONArrayOptJSONArray = (jSONObject = new JSONObject(str)).optJSONArray("chain")) == null) {
                    return null;
                }
                int length = jSONArrayOptJSONArray.length();
                boolean z = false;
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject4 != null) {
                        jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("content");
                    } else {
                        jSONObjectOptJSONObject = null;
                    }
                    if (jSONObjectOptJSONObject != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("page")) != null) {
                        Iterator<String> it2 = monitorItem.removeBcmKeys.iterator();
                        while (it2.hasNext()) {
                            if (jSONObjectOptJSONObject3.remove(it2.next()) != null) {
                                z = true;
                            }
                        }
                    }
                    if (jSONObjectOptJSONObject != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("unit")) != null) {
                        Iterator<String> it3 = monitorItem.removeBcmKeys.iterator();
                        while (it3.hasNext()) {
                            if (jSONObjectOptJSONObject2.remove(it3.next()) != null) {
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("bcm_chain_debug");
                    if (jSONObjectOptJSONObject5 == null) {
                        jSONObjectOptJSONObject5 = new JSONObject();
                    }
                    jSONObjectOptJSONObject5.putOpt("remove_bcm_keys", new JSONArray((Collection) monitorItem.removeBcmKeys));
                    jSONObject.putOpt("bcm_chain_debug", jSONObjectOptJSONObject5);
                    return C786410Ut5.J3(jSONObject);
                }
                return null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    @InterfaceC1294060jmO
    public static C0XMH LIZIZ(String str, TypedOutput typedOutput, MonitorItem monitorItem) {
        C0X0P c0x0pLIZJ = null;
        if (monitorItem != null && typedOutput != null && str != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            typedOutput.writeTo(byteArrayOutputStream);
            Pair pairLJII = LJII(byteArrayOutputStream.toString("UTF-8"));
            k kVar = (k) pairLJII.getFirst();
            int iIntValue = ((Number) pairLJII.getSecond()).intValue();
            List<String> list = monitorItem.location;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (LIZ(kVar, str, it2.next(), null, null)) {
                        return null;
                    }
                }
            }
            if (iIntValue != 1) {
                String string = kVar.toString();
                if (string.length() == 0) {
                    return null;
                }
                String strMimeType = typedOutput.mimeType();
                if (strMimeType != null) {
                    c0x0pLIZJ = C0X0P.LIZJ(strMimeType);
                }
                return new C0XMH(AbstractC842530X3j.LIZJ(c0x0pLIZJ, string));
            }
        }
        return null;
    }

    public static void LJI(String str, String str2, String str3) throws JSONException {
        if (str3 == null) {
            JSONObject jSONObjectLIZLLL = LIZLLL();
            if (jSONObjectLIZLLL != null) {
                str3 = C786410Ut5.J3(jSONObjectLIZLLL);
            } else {
                str3 = null;
            }
        }
        C18CE c18ce = C18CE.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("message: ");
        sbLIZ.append(str2);
        sbLIZ.append(" chain: ");
        sbLIZ.append(str3);
        c18ce.LIZIZ(3022, C2188811AlT.LIZIZ(sbLIZ), BtmSDK.INSTANCE.getCurrentResumedPage(), null, true, new AwS73S1000000_23(str, 12));
    }

    public static boolean LJFF(C0XMB c0xmb, Request request, MonitorItem monitorItem, List list) {
        C0X0P c0x0pLIZJ;
        if (monitorItem == null) {
            return false;
        }
        TypedOutput body = request.getBody();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        body.writeTo(byteArrayOutputStream);
        Pair pairLJII = LJII(byteArrayOutputStream.toString("UTF-8"));
        k kVar = (k) pairLJII.getFirst();
        int iIntValue = ((Number) pairLJII.getSecond()).intValue();
        List<String> list2 = monitorItem.location;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (LIZ(kVar, request.getPath(), it2.next(), list, monitorItem)) {
                    return false;
                }
            }
        }
        if (iIntValue != 0) {
            return false;
        }
        String string = kVar.toString();
        if (string.length() == 0) {
            return false;
        }
        String strMimeType = request.getBody().mimeType();
        if (strMimeType != null) {
            c0x0pLIZJ = C0X0P.LIZJ(strMimeType);
        } else {
            c0x0pLIZJ = null;
        }
        C842540X3k c842540X3kLIZJ = AbstractC842530X3j.LIZJ(c0x0pLIZJ, string);
        c0xmb.LIZIZ(new C0XMH(c842540X3kLIZJ), request.getMethod());
        return true;
    }

    public static boolean LIZ(k kVar, String str, String str2, List list, MonitorItem monitorItem) throws JSONException {
        String strJ3 = null;
        if (kVar != null) {
            boolean z = true;
            if (str2.length() != 0) {
                String str3 = (String) ListProtector.get(a0.LJJLIIIJILLIZJL(str2, new String[]{e3.d}, 0, 6), 0);
                String strSubstring = str2.substring(a0.LJJIZ(str2, '.', 0, false, 6) + 1);
                if (kVar instanceof n) {
                    n nVarLJIILIIL = kVar.LJIILIIL();
                    boolean z2 = !a0.LJJIIZI(str2, e3.d, false);
                    boolean zLJIIZILJ = u.LJIIZILJ(str3, "[]", false);
                    if (z2) {
                        k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ(str2);
                        if (kVarLJJIIZ != null && (kVarLJJIIZ instanceof q) && (kVarLJJIIZ.LJIILJJIL().LL instanceof String)) {
                            String strLJIL = kVarLJJIIZ.LJIILJJIL().LJIL();
                            String strLIZJ = LIZJ(strLJIL, monitorItem);
                            if (strLIZJ != null) {
                                nVarLJIILIIL.LJJIIJ(str2, strLIZJ);
                                if (list != null) {
                                    list.add(strLIZJ);
                                }
                                return false;
                            }
                            if (list != null) {
                                list.add(strLJIL);
                            }
                            return true;
                        }
                        JSONObject jSONObjectLIZLLL = LIZLLL();
                        if (jSONObjectLIZLLL != null && (strJ3 = C786410Ut5.J3(jSONObjectLIZLLL)) != null && strJ3.length() != 0) {
                            String strLIZJ2 = LIZJ(strJ3, monitorItem);
                            if (strLIZJ2 != null) {
                                strJ3 = strLIZJ2;
                            }
                            nVarLJIILIIL.LJJIIJ(str2, strJ3);
                            LJI(str, "fill bcm chain successful", strJ3);
                        } else {
                            LJI(str, "fill bcm chain fail, cannot generate back up chain", strJ3);
                        }
                        if (list != null) {
                            if (strJ3 == null) {
                                strJ3 = "";
                            }
                            list.add(strJ3);
                        }
                        return false;
                    }
                    if (zLJIIZILJ) {
                        String strSubstring2 = str3.substring(0, str3.length() - 2);
                        k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ(strSubstring2);
                        kVarLJJIIZ2.getClass();
                        if (kVarLJJIIZ2 instanceof h) {
                            h hVarLJIIL = nVarLJIILIIL.LJJIIZ(strSubstring2).LJIIL();
                            int size = hVarLJIIL.size();
                            for (int i = 0; i < size; i++) {
                                if (!LIZ(hVarLJIIL.LJJIIJZLJL(i), str, strSubstring, list, monitorItem)) {
                                    z = false;
                                }
                            }
                            return z;
                        }
                        LJI(str, "route broken", null);
                        return false;
                    }
                    return LIZ(nVarLJIILIIL.LJJIIZ(str3), str, strSubstring, list, monitorItem);
                }
                LJI(str, "route broken", null);
                return false;
            }
        }
        LJI(str, "route broken", null);
        return false;
    }
}
