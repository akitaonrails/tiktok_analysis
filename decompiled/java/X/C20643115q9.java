package X;

import Y.ACallableS256S0200000_31;
import android.os.SystemClock;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushBanStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushPopupLimitStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.SettingMessage;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushColdStartExp;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushExperienceOptimize;
import com.ss.android.ugc.aweme.innerpush.core.InnerPushManager;
import com.ss.android.ugc.aweme.innerpush.core.InnerPushQueueLooper;
import com.ss.android.ugc.aweme.innerpush.model.FrequencyStrategiesInfo;
import com.ss.android.ugc.aweme.innerpush.model.FrequencyStrategyPassInfo;
import com.ss.android.ugc.aweme.innerpush.model.GetMessageListResponse;
import com.ss.android.ugc.aweme.innerpush.settings.InnerPushAIExp;
import com.ss.android.ugc.aweme.innerpush.settings.PullSettings;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15q9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20643115q9 {
    public static long LIZJ;
    public static volatile boolean LJ;
    public static volatile long LJFF;
    public static final C20643115q9 LIZ = new C20643115q9();
    public static volatile long LIZIZ = -1;
    public static boolean LIZLLL = true;

    public static void LIZJ(final EnumC20643215qA enumC20643215qA, JSONObject jSONObject) {
        final String strOptString;
        Object c098200Yq;
        long jLongValue;
        boolean z;
        long jLongValue2;
        boolean z2;
        String strOptString2;
        EnumC20643215qA enumC20643215qA2;
        boolean zLJI = MethodIDManager.LJI(202201);
        boolean z3 = C2214201BlK.LJIIJJI;
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        long jUptimeMillis = SystemClock.uptimeMillis() - LJFF;
        boolean zIsPureMode = InnerPushManager.INSTANCE.isPureMode();
        String strJ3 = null;
        if (((Boolean) InnerPushExperienceOptimize.LJIIIIZZ.getValue()).booleanValue()) {
            if (jSONObject != null) {
                strOptString2 = jSONObject.optString("trigger_source");
            } else {
                strOptString2 = null;
            }
            EnumC20643215qA enumC20643215qA3 = EnumC20643215qA.WARM_START;
            if (enumC20643215qA == enumC20643215qA3 || enumC20643215qA == (enumC20643215qA2 = EnumC20643215qA.HOT_START) || Intrinsics.LJFF(strOptString2, enumC20643215qA3.getEventType()) || Intrinsics.LJFF(strOptString2, enumC20643215qA2.getEventType())) {
                C19290510dT.LIZIZ("InnerPushPuller", "warm/hot start disabled pull");
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        }
        if (((Boolean) InnerPushExperienceOptimize.LJFF.getValue()).booleanValue()) {
            if (LIZIZ >= 0) {
                LIZJ = System.currentTimeMillis();
                LIZIZ = -1L;
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            if (C13LQ.LJJIJIIJI(enumC20643215qA, new EnumC20643215qA[]{EnumC20643215qA.COLD_START, EnumC20643215qA.WARM_START, EnumC20643215qA.HOT_START, EnumC20643215qA.ACCOUNT_LOGIN}) >= 0 && System.currentTimeMillis() - LIZJ < ((Number) InnerPushExperienceOptimize.LJ.getValue()).longValue()) {
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        }
        if (zIsLogin && !LJ && !z3 && jUptimeMillis >= PullSettings.LIZ().minReqDurationSeconds * 1000 && !zIsPureMode) {
            LJ = true;
            LJFF = SystemClock.uptimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pull start(");
            sbLIZ.append(enumC20643215qA.getValue());
            sbLIZ.append(") triggerExtra: ");
            sbLIZ.append(jSONObject);
            C19290510dT.LIZ("InnerPushPuller", C2188811AlT.LIZIZ(sbLIZ));
            if (jSONObject != null) {
                strOptString = jSONObject.optString("pitaya_trace_id");
            } else {
                strOptString = null;
            }
            C19329510jl c19329510jl = C19329510jl.LIZ;
            if (jSONObject != null) {
                strJ3 = C786410Ut5.J3(jSONObject);
            }
            c19329510jl.getClass();
            C19330110jr.LIZ.getClass();
            Map<String, ?> all = C19329210ji.LJ().getAll();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (String str : all.keySet()) {
                if (u.LJJIIJZLJL(str, "record_ban_strategy", false)) {
                    Long lLJIILIIL = C2095008Iq.LJIILIIL(str.subSequence(20, str.length()).toString());
                    if (lLJIILIIL != null) {
                        jLongValue2 = lLJIILIIL.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    InnerPushBanStrategy innerPushBanStrategyLIZIZ = C19329210ji.LIZIZ(jLongValue2);
                    if (innerPushBanStrategyLIZIZ != null) {
                        C19330110jr.LIZ.getClass();
                        z2 = !C19330110jr.LJIIJJI(innerPushBanStrategyLIZIZ);
                    } else {
                        z2 = true;
                    }
                    arrayList2.add(new FrequencyStrategyPassInfo(jLongValue2, z2));
                }
                if (u.LJJIIJZLJL(str, "record_popup_limit_strategy", false)) {
                    Long lLJIILIIL2 = C2095008Iq.LJIILIIL(str.subSequence(28, str.length()).toString());
                    if (lLJIILIIL2 != null) {
                        jLongValue = lLJIILIIL2.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    InnerPushPopupLimitStrategy innerPushPopupLimitStrategyLIZLLL = C19329210ji.LIZLLL(jLongValue);
                    if (innerPushPopupLimitStrategyLIZLLL != null) {
                        C19330110jr.LIZ.getClass();
                        z = !C19330110jr.LJIIL(innerPushPopupLimitStrategyLIZLLL);
                    } else {
                        z = true;
                    }
                    arrayList.add(new FrequencyStrategyPassInfo(jLongValue, z));
                }
            }
            String strLJ = JsonParseUtils.LJ(new FrequencyStrategiesInfo(arrayList, arrayList2));
            InterfaceC19330910jz interfaceC19330910jz = (InterfaceC19330910jz) C19329510jl.LIZJ.getValue();
            int value = enumC20643215qA.getValue();
            ArrayList arrayList3 = new ArrayList();
            try {
                LinkedHashMap linkedHashMapLJFF = C19329210ji.LJFF();
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (Map.Entry entry : linkedHashMapLJFF.entrySet()) {
                    if (((Number) entry.getValue()).longValue() > jCurrentTimeMillis) {
                        arrayList3.add(entry.getKey());
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C19290510dT.LIZJ("SettingSyncHandler", "getFilterTypesJson error", thM5exceptionOrNullimpl);
            }
            InterfaceC420801kM interfaceC420801kMLJJLL = interfaceC19330910jz.LIZ(1, 1, 0L, strJ3, value, strLJ, C08JS.LIZLLL(arrayList3)).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.15pn
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    Object c098200Yq2;
                    String str2;
                    JSONArray jSONArrayOptJSONArray;
                    GetMessageListResponse getMessageListResponse = (GetMessageListResponse) obj;
                    try {
                        List<InnerPushMessage> list = getMessageListResponse.messages;
                        if (list != null) {
                            ArrayList arrayList4 = new ArrayList();
                            for (InnerPushMessage innerPushMessage : list) {
                                if (innerPushMessage.getProtocol() > 2) {
                                    arrayList4.add(innerPushMessage);
                                }
                            }
                            if (!arrayList4.isEmpty() && (str2 = getMessageListResponse.LL) != null && str2.length() != 0 && (jSONArrayOptJSONArray = new JSONObject(getMessageListResponse.LL).optJSONArray("messages")) != null && jSONArrayOptJSONArray.length() > 0) {
                                int length = jSONArrayOptJSONArray.length();
                                for (int i = 0; i < length; i++) {
                                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                                    if (jSONObjectOptJSONObject != null) {
                                        int iOptInt = jSONObjectOptJSONObject.optInt("protocol");
                                        long jOptLong = jSONObjectOptJSONObject.optLong(FollowStatusChangeMethod.PARAM_UID);
                                        Iterator it2 = arrayList4.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                InnerPushMessage innerPushMessage2 = (InnerPushMessage) it2.next();
                                                if (iOptInt == innerPushMessage2.getProtocol() && jOptLong == innerPushMessage2.getId()) {
                                                    C19331310k3.LIZIZ(innerPushMessage2, jSONObjectOptJSONObject.optString("payload"));
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        c098200Yq2 = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq2 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                    if (thM5exceptionOrNullimpl2 != null) {
                        C19290510dT.LIZJ("InnerPushMessage", "applyPayload from resp error", thM5exceptionOrNullimpl2);
                    }
                    return getMessageListResponse;
                }
            }).LJJLL(new C09JN() { // from class: X.10k4
                @Override // X.C09JN
                public final void accept(Object obj) {
                    Object c098200Yq2;
                    int size;
                    List<InnerPushMessage> list;
                    boolean z4;
                    String strJ32;
                    Object c098200Yq3;
                    Object c098200Yq4;
                    C1C7U.LIZ("InnerPushPuller@6455.pullInner$3");
                    GetMessageListResponse getMessageListResponse = (GetMessageListResponse) obj;
                    C19329510jl.LIZ.getClass();
                    C19329510jl.LIZ().LJ();
                    List<SettingMessage> list2 = getMessageListResponse.settingMessages;
                    if (list2 != null && !list2.isEmpty()) {
                        try {
                            LinkedHashMap linkedHashMapLJFF2 = C19329210ji.LJFF();
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            Iterator it2 = linkedHashMapLJFF2.entrySet().iterator();
                            while (it2.hasNext()) {
                                if (((Number) ((Map.Entry) it2.next()).getValue()).longValue() < jCurrentTimeMillis2) {
                                    it2.remove();
                                }
                            }
                            for (SettingMessage settingMessage : list2) {
                                linkedHashMapLJFF2.put(Integer.valueOf(settingMessage.type), Long.valueOf((settingMessage.expireSeconds * 1000) + jCurrentTimeMillis2));
                            }
                            C19329210ji.LJ().storeString("setting_sync_expire_config", C08JS.LIZLLL(linkedHashMapLJFF2));
                            c098200Yq3 = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq3);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq3 = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq3);
                        }
                        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq3);
                        if (thM5exceptionOrNullimpl2 != null) {
                            C19290510dT.LIZJ("SettingSyncHandler", "setExpireConfig error", thM5exceptionOrNullimpl2);
                        }
                        StringBuilder sb = new StringBuilder("dispatch setting messages, type=");
                        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        Iterator<SettingMessage> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(Integer.valueOf(it3.next().type));
                        }
                        sb.append(arrayList4);
                        C19290510dT.LIZLLL("SettingSyncHandler", sb.toString());
                        Iterator<SettingMessage> it4 = list2.iterator();
                        while (it4.hasNext()) {
                            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) C20641815pw.LIZJ.getValue()).get(Integer.valueOf(it4.next().type));
                            if (copyOnWriteArraySet != null) {
                                Iterator it5 = copyOnWriteArraySet.iterator();
                                while (it5.hasNext()) {
                                    try {
                                        ((C1FDT) it5.next()).LIZ();
                                        c098200Yq4 = Unit.LIZ;
                                        C189200o6.m2constructorimpl(c098200Yq4);
                                    } catch (Throwable th3) {
                                        TryCatchGuardChecker.doCheck(th3);
                                        c098200Yq4 = new C098200Yq(th3);
                                        C189200o6.m2constructorimpl(c098200Yq4);
                                    }
                                    Throwable thM5exceptionOrNullimpl3 = C189200o6.m5exceptionOrNullimpl(c098200Yq4);
                                    if (thM5exceptionOrNullimpl3 != null) {
                                        C19290510dT.LIZJ("SettingSyncHandler", "dispatch error", thM5exceptionOrNullimpl3);
                                    }
                                }
                            }
                        }
                    }
                    C20643115q9 c20643115q9 = C20643115q9.LIZ;
                    EnumC20643215qA enumC20643215qA4 = enumC20643215qA;
                    String str2 = strOptString;
                    c20643115q9.getClass();
                    Integer numValueOf = null;
                    try {
                        list = getMessageListResponse.messages;
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        c098200Yq2 = new C098200Yq(th4);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    if (list != null && !list.isEmpty()) {
                        ArrayList arrayList5 = new ArrayList();
                        for (InnerPushMessage innerPushMessage : getMessageListResponse.messages) {
                            if (!C20640515pj.LIZ(innerPushMessage)) {
                                C19329910jp.LIZ.getClass();
                                if (innerPushMessage.getProtocol() == 1 && innerPushMessage.getVersion() <= 2 && innerPushMessage.getId() > 0) {
                                    String mobEventJsonStr = innerPushMessage.getMobEventJsonStr();
                                    if (mobEventJsonStr != null && mobEventJsonStr.length() != 0) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (z4) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("pitaya_trace_id", str2);
                                        jSONObject2.put("scenario", String.valueOf(enumC20643215qA4.getValue()));
                                        strJ32 = C786410Ut5.J3(jSONObject2);
                                    } else {
                                        String mobEventJsonStr2 = innerPushMessage.getMobEventJsonStr();
                                        if (mobEventJsonStr2 != null) {
                                            JSONObject jSONObject3 = new JSONObject(mobEventJsonStr2);
                                            jSONObject3.put("pitaya_trace_id", str2);
                                            jSONObject3.put("scenario", String.valueOf(enumC20643215qA4.getValue()));
                                            strJ32 = C786410Ut5.J3(jSONObject3);
                                        } else {
                                            strJ32 = null;
                                        }
                                    }
                                    innerPushMessage.setMobEventJsonStr(strJ32);
                                    innerPushMessage.markReceiveFrom(EnumC19331110k1.FROM_PULLER);
                                    C19331210k2.LIZ.getClass();
                                    C19331210k2.LJIIJJI(innerPushMessage);
                                    InnerPushQueueLooper.LJFF(InnerPushQueueLooper.LL, innerPushMessage, 6);
                                } else {
                                    arrayList5.add(Long.valueOf(innerPushMessage.getId()));
                                }
                            }
                        }
                        C20643115q9.LIZ.getClass();
                        c098200Yq2 = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq2);
                        Throwable thM5exceptionOrNullimpl4 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                        if (thM5exceptionOrNullimpl4 != null) {
                            C19331210k2 c19331210k2 = C19331210k2.LIZ;
                            EnumC19355710nz enumC19355710nz = EnumC19355710nz.PULL_MESSAGE;
                            String message = thM5exceptionOrNullimpl4.getMessage();
                            c19331210k2.getClass();
                            C19331210k2.LJIIIZ(null, enumC19355710nz, message);
                            C19290510dT.LIZJ("InnerPushPuller", "handleResponse error", thM5exceptionOrNullimpl4);
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("pull success(");
                    sbLIZ2.append(enumC20643215qA.getValue());
                    sbLIZ2.append("): ");
                    List<InnerPushMessage> list3 = getMessageListResponse.messages;
                    if (list3 != null) {
                        numValueOf = Integer.valueOf(list3.size());
                    }
                    sbLIZ2.append(numValueOf);
                    sbLIZ2.append(" ptyTraceId: ");
                    sbLIZ2.append(strOptString);
                    C19290510dT.LIZ("InnerPushPuller", C2188811AlT.LIZIZ(sbLIZ2));
                    C19331210k2 c19331210k22 = C19331210k2.LIZ;
                    List<InnerPushMessage> list4 = getMessageListResponse.messages;
                    if (list4 != null) {
                        size = list4.size();
                    } else {
                        size = 0;
                    }
                    EnumC20643215qA enumC20643215qA5 = enumC20643215qA;
                    String str3 = strOptString;
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - C20643115q9.LJFF;
                    String str4 = getMessageListResponse.status_msg;
                    c19331210k22.getClass();
                    C19331210k2.LJIIJ(size, enumC20643215qA5, str3, jUptimeMillis2, null, str4, getMessageListResponse);
                    C20643115q9.LJ = false;
                    int i = C20642815q6.LIZ;
                    C20642815q6.LJ(enumC20643215qA, true);
                    C1C7U.LIZIZ("InnerPushPuller@6455.pullInner$3");
                }
            }, new C09JN() { // from class: X.15q5
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("InnerPushPuller@6455.pullInner$4");
                    Throwable th2 = (Throwable) obj;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("pull failed(");
                    sbLIZ2.append(enumC20643215qA.getValue());
                    sbLIZ2.append(')');
                    C19290510dT.LIZJ("InnerPushPuller", C2188811AlT.LIZIZ(sbLIZ2), th2);
                    C19329510jl.LIZ.getClass();
                    C19329510jl.LIZ().LJ();
                    C19331210k2 c19331210k2 = C19331210k2.LIZ;
                    EnumC20643215qA enumC20643215qA4 = enumC20643215qA;
                    String str2 = strOptString;
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - C20643115q9.LJFF;
                    String localizedMessage = th2.getLocalizedMessage();
                    c19331210k2.getClass();
                    C19331210k2.LJIIJ(0, enumC20643215qA4, str2, jUptimeMillis2, th2, localizedMessage, null);
                    C20643115q9.LJ = false;
                    int i = C20642815q6.LIZ;
                    C20642815q6.LJ(enumC20643215qA, false);
                    C1C7U.LIZIZ("InnerPushPuller@6455.pullInner$4");
                }
            });
            C19329510jl.LIZ.getClass();
            C19329510jl.LIZ().LIZ(interfaceC420801kMLJJLL);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("pull blocked(");
        sbLIZ2.append(enumC20643215qA.getValue());
        sbLIZ2.append("), isUserLogin=");
        sbLIZ2.append(zIsLogin);
        sbLIZ2.append(", isRequesting=");
        sbLIZ2.append(LJ);
        sbLIZ2.append(", isAppBackground=");
        sbLIZ2.append(z3);
        sbLIZ2.append(", reqDuration=");
        sbLIZ2.append(jUptimeMillis);
        sbLIZ2.append(", isPureMode=");
        sbLIZ2.append(zIsPureMode);
        C19290510dT.LIZIZ("InnerPushPuller", C2188811AlT.LIZIZ(sbLIZ2));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LIZ(EnumC20643215qA enumC20643215qA, long j, JSONObject jSONObject) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pull skipVideoBanPull:");
        sbLIZ.append(LIZLLL);
        sbLIZ.append(' ');
        C19290510dT.LIZLLL("InnerPushPuller", C2188811AlT.LIZIZ(sbLIZ));
        if (InnerPushColdStartExp.LIZ() && LIZLLL) {
            return;
        }
        if (j <= 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (((Boolean) InnerPushAIExp.LJ.getValue()).booleanValue() && ((Boolean) InnerPushColdStartExp.LIZLLL.getValue()).booleanValue() && enumC20643215qA == EnumC20643215qA.COLD_START) {
                InnerPushManager innerPushManager = InnerPushManager.INSTANCE;
                long coldStartTime = jCurrentTimeMillis - innerPushManager.getColdStartTime();
                C01GW c01gw = InnerPushColdStartExp.LJ;
                if (coldStartTime > ((Number) c01gw.getValue()).longValue() * 1000) {
                    C19290510dT.LIZLLL("InnerPushPuller", "pull InnerPushAIExp directly ");
                    if (((Boolean) C261040AKw.LIZ.getValue()).booleanValue()) {
                        C15O7.LIZIZ(new ACallableS256S0200000_31(enumC20643215qA, jSONObject, 0), C15O7.LJI, null);
                        return;
                    } else {
                        LIZJ(enumC20643215qA, jSONObject);
                        return;
                    }
                }
                long jLongValue = ((((Number) c01gw.getValue()).longValue() * 1000) + innerPushManager.getColdStartTime()) - jCurrentTimeMillis;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("pull InnerPushAIExp delay: ");
                sbLIZ2.append(jLongValue);
                sbLIZ2.append(' ');
                C19290510dT.LIZLLL("InnerPushPuller", C2188811AlT.LIZIZ(sbLIZ2));
                C15O7.LJIIIIZZ(jLongValue).LJ(new C20748816He(enumC20643215qA, jSONObject, 1), C15O7.LJI, null);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("pull directly delaySeconds:");
            sbLIZ3.append(j);
            sbLIZ3.append(' ');
            C19290510dT.LIZLLL("InnerPushPuller", C2188811AlT.LIZIZ(sbLIZ3));
            if (((Boolean) C261040AKw.LIZ.getValue()).booleanValue()) {
                C15O7.LIZIZ(new ACallableS256S0200000_31(enumC20643215qA, jSONObject, 1), C15O7.LJI, null);
                return;
            } else {
                LIZJ(enumC20643215qA, jSONObject);
                return;
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("pull delay delaySeconds:");
        sbLIZ4.append(j);
        sbLIZ4.append(' ');
        C19290510dT.LIZLLL("InnerPushPuller", C2188811AlT.LIZIZ(sbLIZ4));
        C15O7.LJIIIIZZ(j * 1000).LJ(new C20748816He(enumC20643215qA, jSONObject, 2), C15O7.LJI, null);
    }

    public static void LIZIZ(C20643115q9 c20643115q9, EnumC20643215qA enumC20643215qA, int i) {
        long jLongValue = 0;
        if ((i & 2) != 0) {
            int i2 = C20643315qB.LIZ[enumC20643215qA.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            jLongValue = PullSettings.LIZ().accountSwitchDelaySeconds;
                        }
                    } else {
                        jLongValue = PullSettings.LIZ().hotStartDelaySeconds;
                    }
                } else {
                    jLongValue = PullSettings.LIZ().warmStartDelaySeconds;
                }
            } else {
                jLongValue = ((Boolean) InnerPushColdStartExp.LIZLLL.getValue()).booleanValue() ? ((Number) InnerPushColdStartExp.LJ.getValue()).longValue() : PullSettings.LIZ().coldStartDelaySeconds;
            }
        }
        c20643115q9.getClass();
        LIZ(enumC20643215qA, jLongValue, null);
    }
}
