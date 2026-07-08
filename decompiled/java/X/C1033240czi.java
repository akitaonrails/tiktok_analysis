package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.rich.reward.prerequest.GmtRewardAdPreResponse;
import com.ss.android.ugc.aweme.rich.reward.prerequest.GmtRewardAdPreResponseTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS56S1300000_16;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0czi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033240czi implements InterfaceC1033100czU {
    public static final C1033480d06 Companion = new Object() { // from class: X.0d06
    };
    public final InterfaceC1033070czR LL;

    public C1033240czi(InterfaceC1033070czR interfaceC1033070czR) {
        this.LL = interfaceC1033070czR;
    }

    @Override // X.InterfaceC1033100czU
    public void clearAllWithParams(List<? extends HashMap<String, Object>> list) {
        String string;
        int iIntValue;
        int iIntValue2;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        if (list != null && !list.isEmpty()) {
            ArrayList<C1033320czq> arrayList = new ArrayList();
            for (HashMap<String, Object> map : list) {
                Object obj = map.get("task_id");
                if (obj != null && (string = obj.toString()) != null && (!a0.LJJJIL(string))) {
                    Object obj2 = map.get("completed_times");
                    if (obj2 instanceof Number) {
                        iIntValue = ((Number) obj2).intValue();
                    } else if ((obj2 instanceof String) && (numLJIIJJI2 = C2095008Iq.LJIIJJI((String) obj2)) != null) {
                        iIntValue = numLJIIJJI2.intValue();
                    }
                    Object obj3 = map.get("engagement_type");
                    if (obj3 instanceof Number) {
                        iIntValue2 = ((Number) obj3).intValue();
                    } else if ((obj3 instanceof String) && (numLJIIJJI = C2095008Iq.LJIIJJI((String) obj3)) != null) {
                        iIntValue2 = numLJIIJJI.intValue();
                    }
                    EnumC1033270czl.Companion.getClass();
                    arrayList.add(new C1033320czq(iIntValue, string, C1033360czu.LIZ(iIntValue2)));
                }
            }
            for (C1033320czq c1033320czq : arrayList) {
                boolean zClearWithCacheConfig = clearWithCacheConfig(c1033320czq);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clearAllWithParams, key: ");
                sbLIZ.append(c1033320czq);
                sbLIZ.append(", cleared: ");
                sbLIZ.append(zClearWithCacheConfig);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    @Override // X.InterfaceC1033100czU
    public boolean clearWithCacheConfig(C1033320czq c1033320czq) {
        boolean z;
        synchronized (C1033250czj.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clear key:");
            sbLIZ.append(c1033320czq);
            C2188811AlT.LIZIZ(sbLIZ);
            if (C1033250czj.LIZIZ.remove(c1033320czq.LIZ()) != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void LIZ(C1033280czm c1033280czm, String str) throws JSONException {
        int value = c1033280czm.LIZ.getValue();
        String strLIZ = c1033280czm.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GmtRewardAdPreRequestManager monitorLoadEnter scene:");
        sbLIZ.append(value);
        sbLIZ.append(" tasks:");
        sbLIZ.append(strLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1033070czR interfaceC1033070czR = this.LL;
        if (interfaceC1033070czR != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("tag", "reward_ad");
            jSONObject.putOpt(Scene.SCENE_SERVICE, Integer.valueOf(value));
            jSONObject.putOpt("tasks", strLIZ);
            if (str != null) {
                jSONObject.putOpt("trigger_source", str);
            }
            interfaceC1033070czR.trackUserEvent("reward_coin_pre_req_load_enter", jSONObject);
        }
    }

    public final void LIZIZ(C1033280czm c1033280czm, String str) throws JSONException {
        int value = c1033280czm.LIZ.getValue();
        String strLIZ = c1033280czm.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GmtRewardAdPreRequestManager monitorLoadStart scene:");
        sbLIZ.append(value);
        sbLIZ.append(" tasks:");
        sbLIZ.append(strLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1033070czR interfaceC1033070czR = this.LL;
        C1032900czA.LIZIZ = System.currentTimeMillis();
        if (interfaceC1033070czR != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("tag", "reward_ad");
            jSONObject.putOpt(Scene.SCENE_SERVICE, Integer.valueOf(value));
            jSONObject.putOpt("tasks", strLIZ);
            if (str != null) {
                jSONObject.putOpt("trigger_source", str);
            }
            interfaceC1033070czR.trackUserEvent("reward_coin_pre_req_load_start", jSONObject);
        }
    }

    @Override // X.InterfaceC1033100czU
    public String requestIdWithCacheConfig(C1033320czq c1033320czq, String str) throws JSONException {
        String string;
        C1033350czt c1033350cztLIZ = C1033250czj.LIZ.LIZ(c1033320czq);
        if (!c1033350cztLIZ.LIZ) {
            InterfaceC1033070czR interfaceC1033070czR = this.LL;
            Integer num = c1033350cztLIZ.LJ;
            if (num != null) {
                string = num.toString();
            } else {
                string = null;
            }
            Long l = c1033350cztLIZ.LIZJ;
            Long l2 = c1033350cztLIZ.LIZLLL;
            if (interfaceC1033070czR != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("tag", "reward_ad");
                jSONObject.putOpt("code", string);
                jSONObject.putOpt("expire_time", l);
                jSONObject.putOpt("client_time", l2);
                if (str != null) {
                    jSONObject.putOpt("trigger_source", str);
                }
                interfaceC1033070czR.trackUserEvent("reward_coin_pre_req_cache_get_failed", jSONObject);
            }
        }
        return c1033350cztLIZ.LIZIZ;
    }

    @Override // X.InterfaceC1033100czU
    public synchronized void requestWithConfig(C1033280czm c1033280czm, String str, Function1<? super Integer, Unit> function1) {
        LIZ(c1033280czm, str);
        if (!this.LL.LIZIZ()) {
            if (function1 != null) {
                function1.invoke(9);
            }
            monitorLoadResultFail(c1033280czm, 9, "not hit sdk", str);
            return;
        }
        if (c1033280czm.LIZ.isValid()) {
            List<C1033460d04> list = c1033280czm.LIZIZ;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<C1033460d04> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (a0.LJJJIL(it2.next().LIZ)) {
                    }
                }
            }
            List<C1033460d04> list2 = c1033280czm.LIZIZ;
            ArrayList arrayList = new ArrayList();
            for (C1033460d04 c1033460d04 : list2) {
                C1033460d04 c1033460d042 = c1033460d04;
                if (!C1033250czj.LIZ.LIZ(new C1033320czq(c1033460d042.LIZIZ, c1033460d042.LIZ, c1033280czm.LIZ)).LIZ) {
                    arrayList.add(c1033460d04);
                }
            }
            ArrayList<C1033460d04> arrayList2 = new ArrayList(arrayList);
            if (arrayList2.isEmpty() && (!c1033280czm.LIZIZ.isEmpty())) {
                if (function1 != null) {
                    function1.invoke(7);
                }
                monitorLoadResultFail(c1033280czm, 7, "all hit cache", str);
                return;
            }
            EnumC1033270czl enumC1033270czl = c1033280czm.LIZ;
            C1033280czm c1033280czm2 = new C1033280czm(enumC1033270czl, arrayList2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("incentive_center_scene_type", String.valueOf(enumC1033270czl.getValue()));
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            for (C1033460d04 c1033460d043 : arrayList2) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("task_id", c1033460d043.LIZ);
                linkedHashMap2.put("task_finished_times", Integer.valueOf(c1033460d043.LIZIZ));
                linkedHashMap2.put("ad_num", "1");
                String str2 = c1033460d043.LIZJ;
                if (str2 != null) {
                    linkedHashMap2.put("extra_request_params", str2);
                }
                arrayList3.add(linkedHashMap2);
            }
            Gson gson = this.LL.getGson();
            if (gson != null) {
                linkedHashMap.put("incentive_center_task_list", GsonProtectorUtils.toJson(gson, arrayList3));
            }
            AwS56S1300000_16 awS56S1300000_16 = new AwS56S1300000_16(this, (C1033240czi) c1033280czm2, (C1033280czm) function1, (Function1<? super Integer, Unit>) str, (String) 2);
            LIZIZ(c1033280czm2, str);
            this.LL.LIZ(EnumC1033600d0I.GET, linkedHashMap, awS56S1300000_16);
            return;
        }
        if (function1 != null) {
            function1.invoke(8);
        }
        monitorLoadResultFail(c1033280czm, 8, "task id is blank", str);
    }

    public final void handlePreRequestSuccess(C1033280czm c1033280czm, n nVar, Function1<? super Integer, Unit> function1, String str) throws JSONException {
        Object c098200Yq;
        int iIntValue;
        Object c098200Yq2;
        List<GmtRewardAdPreResponseTask> list;
        Object c098200Yq3;
        Object c098200Yq4;
        try {
            c098200Yq = Integer.valueOf(nVar.LJJIIZ("status_code").LJIIJJI());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        if (iIntValue != 0) {
            try {
                c098200Yq4 = nVar.LJJIIZ("status_msg").LJIL();
                C189200o6.m2constructorimpl(c098200Yq4);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq4 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq4);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq4)) {
                obj = c098200Yq4;
            }
            String str2 = (String) obj;
            if (str2 == null) {
                str2 = "";
            }
            if (function1 != null) {
                function1.invoke(6);
            }
            monitorLoadResultFail(c1033280czm, 6, iIntValue + '-' + str2, str);
            return;
        }
        try {
            Gson gson = this.LL.getGson();
            if (gson != null) {
                c098200Yq2 = (GmtRewardAdPreResponse) gson.LIZJ(nVar, GmtRewardAdPreResponse.class);
            } else {
                c098200Yq2 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq2 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl != null) {
            if (function1 != null) {
                function1.invoke(3);
            }
            monitorLoadResultFail(c1033280czm, 3, C1033260czk.LIZIZ("data parse error", thM5exceptionOrNullimpl), str);
            return;
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        GmtRewardAdPreResponse gmtRewardAdPreResponse = (GmtRewardAdPreResponse) c098200Yq2;
        if (gmtRewardAdPreResponse != null && (list = gmtRewardAdPreResponse.incentiveTaskList) != null && !list.isEmpty()) {
            try {
                List<C1033460d04> list2 = c1033280czm.LIZIZ;
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (C1033460d04 c1033460d04 : list2) {
                    linkedHashMap.put(c1033460d04.LIZ, c1033460d04);
                }
                for (GmtRewardAdPreResponseTask gmtRewardAdPreResponseTask : list) {
                    C1033460d04 c1033460d042 = (C1033460d04) linkedHashMap.get(gmtRewardAdPreResponseTask.taskId);
                    if (c1033460d042 != null && gmtRewardAdPreResponseTask.preReqId.length() > 0) {
                        C1033250czj.LIZ.LIZIZ(new C1033320czq(c1033460d042.LIZIZ, c1033460d042.LIZ, c1033280czm.LIZ), gmtRewardAdPreResponseTask.preReqId, gmtRewardAdPreResponseTask.expireTime);
                    }
                }
                c098200Yq3 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                c098200Yq3 = new C098200Yq(th4);
                C189200o6.m2constructorimpl(c098200Yq3);
            }
            if (C189200o6.m8isSuccessimpl(c098200Yq3)) {
                int value = c1033280czm.LIZ.getValue();
                String strLJJLIIIJ = C13LP.LJJLIIIJ(c1033280czm.LIZIZ, ",", null, null, 0, null, AFwS252S0000000_16.get$arr$(451), 30);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GmtRewardAdPreRequestManager monitorLoadResultSuccess scene:");
                sbLIZ.append(value);
                sbLIZ.append(" tasks:");
                sbLIZ.append(strLJJLIIIJ);
                C2188811AlT.LIZIZ(sbLIZ);
                C1032900czA.LJIIIZ(this.LL, value, strLJJLIIIJ, true, 1, null, str);
                if (function1 != null) {
                    function1.invoke(1);
                }
            }
            Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq3);
            if (thM5exceptionOrNullimpl2 != null) {
                if (function1 != null) {
                    function1.invoke(3);
                }
                monitorLoadResultFail(c1033280czm, 3, C1033260czk.LIZIZ("parse tasks error", thM5exceptionOrNullimpl2), str);
                return;
            }
            return;
        }
        if (function1 != null) {
            function1.invoke(3);
        }
        monitorLoadResultFail(c1033280czm, 3, "data array is null or empty", str);
    }

    public final void monitorLoadResultFail(C1033280czm c1033280czm, int i, String str, String str2) throws JSONException {
        int value = c1033280czm.LIZ.getValue();
        String strLIZ = c1033280czm.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GmtRewardAdPreRequestManager monitorLoadResultFail scene:");
        sbLIZ.append(value);
        sbLIZ.append(" tasks:");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" code:");
        sbLIZ.append(i);
        sbLIZ.append(" failedDetailReason:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1032900czA.LJIIIZ(this.LL, value, strLIZ, false, i, str, str2);
    }
}
