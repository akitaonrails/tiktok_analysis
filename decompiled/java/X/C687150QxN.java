package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.pendant.coin.model.EcSearchCoinData;
import com.ss.android.ugc.aweme.ecommerce.search.pendant.coin.model.EcSearchCoinTaskDoneRequest;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QxN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687150QxN implements InterfaceC1164530gPT {
    public static final C687150QxN LL = new C687150QxN();
    public static volatile int LLILLJJLI;
    public static C2180691AWd LLILLL;
    public static C2180691AWd LLILZ;
    public static Long LLILZIL;
    public static EcSearchCoinData LLILZLL;
    public static CopyOnWriteArrayList<InterfaceC687260QxY> LLIZ;
    public static Integer LLIZLLLIL;
    public static CopyOnWriteArrayList<Integer> LLJ;
    public static boolean LLJI;
    public static JSONObject LLJIJIL;
    public static long LLJILJIL;
    public static C11JF LLJILJILJ;

    public static final boolean LJ() {
        return (LLILLJJLI == EnumC687210QxT.UNKNOWN.getValue() || LLILLJJLI == EnumC687210QxT.STOP.getValue() || LLILLJJLI == EnumC687210QxT.COMPLETE.getValue()) ? false : true;
    }

    public final void LIZIZ() {
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_search_coin_state_event", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("general_search_tab_switch_event", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("mall_back_button_click", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_search_coin_task_finish_toast_show", this);
    }

    public final void LIZ(boolean z, boolean z2) {
        C687170QxP.LIZ = false;
        C687170QxP.LIZJ = false;
        LLIZ = null;
        C2180691AWd c2180691AWd = LLILLL;
        if (c2180691AWd != null) {
            c2180691AWd.LIZ();
        }
        C2180691AWd c2180691AWd2 = LLILZ;
        if (c2180691AWd2 != null) {
            c2180691AWd2.LIZ();
        }
        LLILLL = null;
        LLILZ = null;
        LLIZLLLIL = null;
        LLILZIL = null;
        LLJ = null;
        LLJILJIL = 0L;
        C11JF c11jf = LLJILJILJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        LLJILJILJ = null;
        if (z) {
            LLILZLL = null;
            LLJIJIL = null;
        }
        if (z2) {
            LIZIZ();
        }
        LLJI = true;
    }

    public final void LIZJ(final int i, JSONObject jSONObject) throws JSONException {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finishTaskRequest: retryTime: ");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        if (i < 0) {
            int value = EnumC687210QxT.COMPLETE.getValue();
            if (jSONObject != null) {
                jSONObject.put("is_success", false);
            } else {
                jSONObject = null;
            }
            LJFF(value, jSONObject);
            return;
        }
        ((InterfaceC687250QxX) C679430Qkv.LIZ.getValue()).LIZ(new EcSearchCoinTaskDoneRequest(C687120QxK.LIZ().taskKey)).LJL(C11S5.LIZ()).LJJLL(new C516101zj(i, jSONObject, 13), new C09JN() { // from class: X.00mW
            @Override // X.C09JN
            public final void accept(Object obj) throws JSONException {
                C1C7U.LIZ("EcSearchCoinManager@697c.finishTaskRequest$3");
                C687150QxN.LL.LIZJ(i - 1, null);
                C1C7U.LIZIZ("EcSearchCoinManager@697c.finishTaskRequest$3");
            }
        });
    }

    public final void LIZLLL(EcSearchCoinData ecSearchCoinData, JSONObject jSONObject) {
        Long l;
        if (ecSearchCoinData != null) {
            LLILZLL = ecSearchCoinData;
        }
        LLJIJIL = jSONObject;
        LLIZLLLIL = null;
        EcSearchCoinData ecSearchCoinData2 = LLILZLL;
        if (ecSearchCoinData2 != null && ecSearchCoinData2.countDownTime != null && ecSearchCoinData2 != null && ecSearchCoinData2.coinsCount != null) {
            if (!LLJI) {
                LIZ(false, true);
            }
            LLJI = false;
            LLJILJIL = SystemClock.elapsedRealtime();
            LJFF(EnumC687210QxT.INIT.getValue(), null);
            LLJ = new CopyOnWriteArrayList<>();
            ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_search_coin_state_event", this);
            ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("general_search_tab_switch_event", this);
            ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("mall_back_button_click", this);
            ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_search_coin_task_finish_toast_show", this);
            LLJILJILJ = (C11JF) C1906580ziK.LIZJ().LJIIJ().LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new C09JN() { // from class: X.0QxM
                @Override // X.C09JN
                public final void accept(Object obj) throws JSONException {
                    C1C7U.LIZ("EcSearchCoinManager@697c.registerApplicationLifecycleObserver$1");
                    if (((AbstractC1387200mCc) obj).LIZ instanceof InterfaceC1603190roz) {
                        C687150QxN c687150QxN = C687150QxN.LL;
                        int value = EnumC687210QxT.STOP.getValue();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("pause_type", EnumC687200QxS.CLICK_BACK.getValue());
                        c687150QxN.LJFF(value, jSONObject2);
                    }
                    C1C7U.LIZIZ("EcSearchCoinManager@697c.registerApplicationLifecycleObserver$1");
                }
            });
            EcSearchCoinData ecSearchCoinData3 = LLILZLL;
            if (ecSearchCoinData3 != null && (l = ecSearchCoinData3.countDownTime) != null) {
                final long jLongValue = l.longValue();
                LLILZIL = Long.valueOf(jLongValue);
                long j = jLongValue * 1000;
                LLILLL = new C2180691AWd(j, 1000L, new InterfaceC2180701AWe() { // from class: X.0QxR
                    @Override // X.InterfaceC2180701AWe
                    public final void onStart() {
                    }

                    @Override // X.InterfaceC2180701AWe
                    public final void LIZLLL() throws JSONException {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", "start");
                        C687170QxP.LIZLLL(jSONObject2);
                        C687150QxN.LL.LIZJ(C687120QxK.LIZ().retryTime, new JSONObject());
                    }

                    @Override // X.InterfaceC2180701AWe
                    public final void LJJI(long j2) {
                        CopyOnWriteArrayList<InterfaceC687260QxY> copyOnWriteArrayList = C687150QxN.LLIZ;
                        if (copyOnWriteArrayList != null) {
                            Iterator<InterfaceC687260QxY> it2 = copyOnWriteArrayList.iterator();
                            while (it2.hasNext()) {
                                it2.next().LIZJ(C814420VxA.LIZJ(j2 / 1000.0f));
                                C687150QxN.LLILZIL = Long.valueOf(j2);
                            }
                        }
                    }
                }, "countDownTimerForText-Thread");
                LLILZ = new C2180691AWd(j, 20L, new InterfaceC2180701AWe() { // from class: X.0QxW
                    @Override // X.InterfaceC2180701AWe
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC2180701AWe
                    public final void onStart() {
                    }

                    @Override // X.InterfaceC2180701AWe
                    public final void LJJI(long j2) {
                        CopyOnWriteArrayList<InterfaceC687260QxY> copyOnWriteArrayList = C687150QxN.LLIZ;
                        if (copyOnWriteArrayList != null) {
                            long j3 = jLongValue;
                            Iterator<InterfaceC687260QxY> it2 = copyOnWriteArrayList.iterator();
                            while (it2.hasNext()) {
                                it2.next().LIZIZ(1 - (j2 / (j3 * 1000.0f)));
                            }
                        }
                    }
                }, "countDownTimerForProgressBar-Thread");
            }
        }
    }

    public final synchronized void LJFF(int i, JSONObject jSONObject) {
        boolean z;
        JSONObject jSONObject2 = null;
        String strOptString = null;
        if (C687120QxK.LIZ().useOptStateList.contains(Integer.valueOf(i))) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C687160QxO(i, jSONObject, null), 3);
        } else {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setState start: newState: ");
            sbLIZ.append(i);
            sbLIZ.append(" oldState: ");
            sbLIZ.append(LLILLJJLI);
            sbLIZ.append(" extraInfo: ");
            sbLIZ.append(jSONObject);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            if (i == LLILLJJLI && i != EnumC687210QxT.RUNNING.getValue()) {
                return;
            }
            EnumC687210QxT enumC687210QxT = EnumC687210QxT.INIT;
            boolean z2 = false;
            if (i != enumC687210QxT.getValue()) {
                EnumC687210QxT enumC687210QxT2 = EnumC687210QxT.RUNNING;
                if (i == enumC687210QxT2.getValue()) {
                    if (LLILLJJLI != enumC687210QxT.getValue() && LLILLJJLI != EnumC687210QxT.PAUSE.getValue() && LLILLJJLI != enumC687210QxT2.getValue()) {
                        return;
                    }
                    if (LLILLJJLI == EnumC687210QxT.PAUSE.getValue()) {
                        C2180691AWd c2180691AWd = LLILZ;
                        if (c2180691AWd != null) {
                            c2180691AWd.LIZLLL();
                        }
                        C2180691AWd c2180691AWd2 = LLILLL;
                        if (c2180691AWd2 != null) {
                            c2180691AWd2.LIZLLL();
                        }
                    } else if (LLILLJJLI == enumC687210QxT.getValue()) {
                        C2180691AWd c2180691AWd3 = LLILZ;
                        if (c2180691AWd3 != null) {
                            c2180691AWd3.LJ();
                        }
                        C2180691AWd c2180691AWd4 = LLILLL;
                        if (c2180691AWd4 != null) {
                            c2180691AWd4.LJ();
                        }
                    }
                } else {
                    EnumC687210QxT enumC687210QxT3 = EnumC687210QxT.PAUSE;
                    if (i == enumC687210QxT3.getValue()) {
                        if (LLILLJJLI != enumC687210QxT2.getValue()) {
                            return;
                        }
                        C2180691AWd c2180691AWd5 = LLILLL;
                        if (c2180691AWd5 != null) {
                            c2180691AWd5.LIZJ();
                        }
                        C2180691AWd c2180691AWd6 = LLILZ;
                        if (c2180691AWd6 != null) {
                            c2180691AWd6.LIZJ();
                        }
                        if (jSONObject != null) {
                            strOptString = jSONObject.optString("pause_type");
                        }
                        if (!Intrinsics.LJFF(strOptString, EnumC687200QxS.BACK_PRESS.getValue()) && !Intrinsics.LJFF(strOptString, EnumC687200QxS.CLOSE.getValue())) {
                            C687170QxP.LIZJ(jSONObject);
                        }
                    } else if (i == EnumC687210QxT.STOP.getValue()) {
                        if (LLILLJJLI != enumC687210QxT2.getValue() && LLILLJJLI != enumC687210QxT3.getValue()) {
                            return;
                        } else {
                            C687170QxP.LIZJ(jSONObject);
                        }
                    } else if (i == EnumC687210QxT.COMPLETE.getValue()) {
                        if (LLILLJJLI != enumC687210QxT2.getValue() && LLILLJJLI != enumC687210QxT3.getValue()) {
                            return;
                        }
                        if (jSONObject != null && jSONObject.optBoolean("is_success")) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("pause_type", EnumC687200QxS.FINISH_TASK.getValue());
                            C687170QxP.LIZJ(jSONObject3);
                        }
                        if (jSONObject != null) {
                            jSONObject.put("type", "end");
                            jSONObject2 = jSONObject;
                        }
                        C687170QxP.LIZLLL(jSONObject2);
                    } else {
                        return;
                    }
                }
            }
            LLILLJJLI = i;
            CopyOnWriteArrayList<InterfaceC687260QxY> copyOnWriteArrayList = LLIZ;
            if (copyOnWriteArrayList != null) {
                Iterator<InterfaceC687260QxY> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(LLILLJJLI, jSONObject);
                }
            }
            int i2 = LLILLJJLI;
            EnumC687210QxT enumC687210QxT4 = EnumC687210QxT.STOP;
            if (i2 == enumC687210QxT4.getValue() || LLILLJJLI == EnumC687210QxT.COMPLETE.getValue()) {
                if (LLILLJJLI == EnumC687210QxT.COMPLETE.getValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (LLILLJJLI == enumC687210QxT4.getValue()) {
                    z2 = true;
                }
                LIZ(z, z2);
            }
            C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setState end: newState: ");
            sbLIZ2.append(i);
            sbLIZ2.append(" oldState: ");
            sbLIZ2.append(LLILLJJLI);
            sbLIZ2.append(" extraInfo: ");
            sbLIZ2.append(jSONObject);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c2341109Fh2.getClass();
            C2341109Fh.LIZ(strLIZIZ2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) throws JSONException {
        JSONObject jSONObject;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEvent eventName: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = null;
        }
        switch (str.hashCode()) {
            case -1951367724:
                if (str.equals("ec_search_coin_state_event")) {
                    int iOptInt = -1;
                    if (jSONObject != null) {
                        iOptInt = jSONObject.optInt("state", -1);
                        String strOptString = jSONObject.optString("extra_info");
                        if (strOptString != null) {
                            try {
                                jSONObject2 = new JSONObject(strOptString);
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                    }
                    LJFF(iOptInt, jSONObject2);
                }
                break;
            case -892630744:
                if (str.equals("mall_back_button_click")) {
                    int value = EnumC687210QxT.PAUSE.getValue();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("pause_type", EnumC687200QxS.CLICK_BACK.getValue());
                    LJFF(value, jSONObject3);
                }
                break;
            case 851218841:
                if (str.equals("general_search_tab_switch_event")) {
                    if (jSONObject != null && !jSONObject.optBoolean("is_visible", true)) {
                        int value2 = EnumC687210QxT.PAUSE.getValue();
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("pause_type", EnumC687200QxS.SWITCH_TAB.getValue());
                        LJFF(value2, jSONObject4);
                    } else {
                        LJFF(EnumC687210QxT.RUNNING.getValue(), null);
                    }
                }
                break;
            case 1409744799:
                if (str.equals("ec_search_coin_task_finish_toast_show")) {
                    if (jSONObject != null && jSONObject.optBoolean("is_success")) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        C0LAB c0lab = new C0LAB();
                        C687170QxP.LIZ(c0lab);
                        c0lab.LJ("toast_name", "points_reward");
                        c0lab.LIZIZ(jElapsedRealtime - C687170QxP.LIZIZ, "duration");
                        C1018703yb.LIZIZ("tiktokec_toast_show", c0lab.LIZ);
                        C687170QxP.LIZIZ = 0L;
                    }
                    LIZIZ();
                }
                break;
        }
    }
}
