package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0VpC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC809480VpC {
    public static final Set<Integer> LIZIZ = new CopyOnWriteArraySet();
    public final Map<Integer, AbstractC809510VpF<InterfaceC809530VpH>> LIZ = new HashMap();

    public final JSONArray LIZ() {
        JSONArray jSONArray = new JSONArray();
        try {
            for (Integer num : ((HashMap) this.LIZ).keySet()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("buildApplogHeader with channelId: ");
                sbLIZ.append(num);
                C2188811AlT.LIZIZ(sbLIZ);
                if (LJFF(num.intValue())) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("buildApplogHeader.isLocalSupportChannel: ");
                    sbLIZ2.append(num);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    jSONArray.put(num);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("buildApplogHeader.error: ");
            sbLIZ3.append(th.getMessage());
            C2188811AlT.LIZIZ(sbLIZ3);
            for (Object obj : ((HashMap) this.LIZ).keySet()) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("buildApplogHeader(error) with channelId: ");
                sbLIZ4.append(obj);
                C2188811AlT.LIZIZ(sbLIZ4);
                if (obj instanceof Integer) {
                    Integer num2 = (Integer) obj;
                    if (LJFF(num2.intValue())) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("buildApplogHeader(error).isLocalSupportChannel: ");
                        sbLIZ5.append(obj);
                        C2188811AlT.LIZIZ(sbLIZ5);
                        jSONArray.put(num2);
                    }
                }
            }
        }
        return jSONArray;
    }

    public AbstractC809480VpC() {
        if (((HashMap) this.LIZ).size() == 0) {
            Map<Integer, AbstractC809510VpF<InterfaceC809530VpH>> map = this.LIZ;
            final Application application = C809360Vp0.LIZ;
            ((HashMap) map).put(5, new C809490VpD(5, "com.fcm.FcmPushAdapter", "fcm", new C809540VpI(application) { // from class: X.0VpE
                public final Context LIZ;

                {
                    this.LIZ = application;
                }

                @Override // X.C809540VpI
                public final boolean LIZ(InterfaceC808910VoH interfaceC808910VoH, int i) {
                    Context context;
                    Context context2;
                    if (interfaceC808910VoH != null && (context = this.LIZ) != null && !C2093608Ic.LJ("com.android.vending")) {
                        try {
                            if (C786410Ut5.Y3(context.getPackageManager(), "com.android.vending", 0) != null && (context2 = this.LIZ) != null && !C2093608Ic.LJ("com.google.android.gms")) {
                                try {
                                    if (C786410Ut5.Y3(context2.getPackageManager(), "com.google.android.gms", 0) != null) {
                                        return true;
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return false;
                        }
                    }
                    return false;
                }
            }));
            Map<Integer, AbstractC809510VpF<InterfaceC809530VpH>> map2 = this.LIZ;
            final Application application2 = C809360Vp0.LIZ;
            ((HashMap) map2).put(14, new C809490VpD(14, "com.adm.push.AdmPushAdapter", "amazon", new C809540VpI(application2) { // from class: X.0VpG
                public final Context LIZ;

                {
                    this.LIZ = application2;
                }

                @Override // X.C809540VpI
                public final boolean LIZ(InterfaceC808910VoH interfaceC808910VoH, int i) {
                    if (interfaceC808910VoH != null && interfaceC808910VoH.isPushAvailable(this.LIZ, i)) {
                        return true;
                    }
                    return false;
                }
            }));
            ((HashMap) this.LIZ).put(15, new C809490VpD(15, "com.bytedance.push.frontier.FrontierPushAdapter", "frontierPush", new C809540VpI()));
            Map<Integer, AbstractC809510VpF<InterfaceC809530VpH>> map3 = this.LIZ;
            final Application application3 = C809360Vp0.LIZ;
            ((HashMap) map3).put(10, new C809490VpD(10, "com.coloros.OpPushAdapter", "op", new C809540VpI(application3) { // from class: X.0VpG
                public final Context LIZ;

                {
                    this.LIZ = application3;
                }

                @Override // X.C809540VpI
                public final boolean LIZ(InterfaceC808910VoH interfaceC808910VoH, int i) {
                    if (interfaceC808910VoH != null && interfaceC808910VoH.isPushAvailable(this.LIZ, i)) {
                        return true;
                    }
                    return false;
                }
            }));
            Map<Integer, AbstractC809510VpF<InterfaceC809530VpH>> map4 = this.LIZ;
            final Application application4 = C809360Vp0.LIZ;
            ((HashMap) map4).put(30, new C809490VpD(30, "com.coloros.util.OppoSystemPushUtil", "oppo_system", new C809540VpI(application4) { // from class: X.0VpG
                public final Context LIZ;

                {
                    this.LIZ = application4;
                }

                @Override // X.C809540VpI
                public final boolean LIZ(InterfaceC808910VoH interfaceC808910VoH, int i) {
                    if (interfaceC808910VoH != null && interfaceC808910VoH.isPushAvailable(this.LIZ, i)) {
                        return true;
                    }
                    return false;
                }
            }));
            Map<Integer, AbstractC809510VpF<InterfaceC809530VpH>> map5 = this.LIZ;
            final Application application5 = C809360Vp0.LIZ;
            ((HashMap) map5).put(21, new C809490VpD(21, "com.bytedance.push.sync.SyncPushAdapter", "sync", new C809540VpI(application5) { // from class: X.0VpG
                public final Context LIZ;

                {
                    this.LIZ = application5;
                }

                @Override // X.C809540VpI
                public final boolean LIZ(InterfaceC808910VoH interfaceC808910VoH, int i) {
                    if (interfaceC808910VoH != null && interfaceC808910VoH.isPushAvailable(this.LIZ, i)) {
                        return true;
                    }
                    return false;
                }
            }));
        }
    }

    public static boolean LJI(int i) {
        if (C809190Voj.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initAllowPushSet: mAllowPushSet = ");
            sbLIZ.append(LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) LIZIZ;
        if (copyOnWriteArraySet.isEmpty()) {
            C808950VoL.LIZIZ().getClass();
            LIZLLL(C808950VoL.LIZJ().LJIL(), false);
        }
        return copyOnWriteArraySet.contains(Integer.valueOf(i));
    }

    public final int LIZIZ(String str) {
        if (this.LIZ == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        for (Integer num : ((HashMap) this.LIZ).keySet()) {
            if (str.equals(((InterfaceC809530VpH) ((AbstractC809510VpF) ((HashMap) this.LIZ).get(num)).LJ(new Object[0])).LIZJ())) {
                return num.intValue();
            }
        }
        return -1;
    }

    public final String LIZJ(int i) {
        if (((HashMap) this.LIZ).get(Integer.valueOf(i)) == null) {
            return "unknown";
        }
        return ((InterfaceC809530VpH) ((AbstractC809510VpF) ((HashMap) this.LIZ).get(Integer.valueOf(i))).LJ(new Object[0])).LIZ();
    }

    public final boolean LJ(String str) {
        try {
            if (!TextUtils.isEmpty(str) && !"[]".equals(str)) {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    if (jSONArray.optInt(0) == -9307) {
                        return true;
                    }
                    String string = LIZ().toString();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        int iOptInt = jSONArray.optInt(i);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(iOptInt);
                        sbLIZ.append("");
                        if (string.contains(C2188811AlT.LIZIZ(sbLIZ))) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final boolean LJFF(int i) {
        InterfaceC809530VpH interfaceC809530VpH = (InterfaceC809530VpH) ((AbstractC809510VpF) ((HashMap) this.LIZ).get(Integer.valueOf(i))).LJ(new Object[0]);
        if (interfaceC809530VpH == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BaseChannelHelper.isLocalSupportChannel(");
            sbLIZ.append(i);
            sbLIZ.append(" not in mPushChannelMap)");
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BaseChannelHelper.isLocalSupportChannel(");
        sbLIZ2.append(i);
        sbLIZ2.append(")...");
        C2188811AlT.LIZIZ(sbLIZ2);
        return interfaceC809530VpH.isSupport();
    }

    public static void LIZLLL(String str, boolean z) {
        if (z) {
            C808950VoL.LIZIZ().getClass();
            C808950VoL.LIZJ().LJIILL(str);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("support:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (C809190Voj.LIZ()) {
                jSONArray.toString();
            }
            ((CopyOnWriteArraySet) LIZIZ).clear();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                int iOptInt = jSONArray.optInt(i);
                if (iOptInt > 0) {
                    ((CopyOnWriteArraySet) LIZIZ).add(Integer.valueOf(iOptInt));
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
