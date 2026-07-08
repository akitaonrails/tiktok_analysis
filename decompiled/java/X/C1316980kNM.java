package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kNM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316980kNM implements InterfaceC1317290kNr {
    public AbstractC1317090kNX LIZ;

    @Override // X.InterfaceC1317290kNr
    public final void LIZIZ(AbstractC1317090kNX abstractC1317090kNX) {
        this.LIZ = abstractC1317090kNX;
    }

    @Override // X.InterfaceC1317290kNr
    public final void LIZ(int i, String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        Object c098200Yq;
        String strOptString;
        JSONObject jSONObjectOptJSONObject3;
        String str2;
        JSONObject jSONObjectOptJSONObject4;
        AbstractC1317090kNX abstractC1317090kNX = this.LIZ;
        JSONObject jSONObjectOptJSONObject5 = null;
        if (abstractC1317090kNX == null) {
            abstractC1317090kNX = null;
        }
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject6 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject6.optJSONObject("playParams")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("music_extra")) != null) {
            String strOptString2 = jSONObjectOptJSONObject2.optString("containerID");
            String strOptString3 = jSONObjectOptJSONObject2.optString(FollowStatusChangeMethod.PARAM_UID);
            if (strOptString2 != null) {
                Map<String, C1316970kNL> map = C07L2.LIZ;
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                if (linkedHashMap.get(strOptString2) == null) {
                    map.put(strOptString2, new C1316970kNL(new WeakReference(abstractC1317090kNX)));
                }
                C1316970kNL c1316970kNL = (C1316970kNL) linkedHashMap.get(strOptString2);
                if (c1316970kNL != null) {
                    try {
                        c1316970kNL.LJFF = true;
                        int iLIZ = C1316970kNL.LIZ(abstractC1317090kNX, i);
                        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("data");
                        if (jSONObjectOptJSONObject7 != null && (jSONObjectOptJSONObject4 = jSONObjectOptJSONObject7.optJSONObject("clickMetrics")) != null) {
                            strOptString = jSONObjectOptJSONObject4.optString("eventName");
                            jSONObjectOptJSONObject3 = jSONObjectOptJSONObject4.optJSONObject("params");
                        } else {
                            strOptString = null;
                            jSONObjectOptJSONObject3 = null;
                        }
                        c1316970kNL.LJI.put(strOptString3, Integer.valueOf(iLIZ));
                        if (Intrinsics.LJFF(strOptString3, c1316970kNL.LIZIZ)) {
                            if (jSONObjectOptJSONObject3 != null) {
                                jSONObjectOptJSONObject3.put("button_type", "click_pause_music");
                            }
                            str2 = "pause";
                        } else {
                            if (jSONObjectOptJSONObject3 != null) {
                                jSONObjectOptJSONObject3.put("button_type", "click_play_music");
                            }
                            str2 = "play";
                        }
                        C1297910jsb c1297910jsb = new C1297910jsb();
                        C1297860jsW c1297860jsW = new C1297860jsW();
                        c1297860jsW.put("state", str2);
                        c1297860jsW.put("music_id", strOptString3);
                        c1297860jsW.put("last_music_id", c1316970kNL.LIZIZ);
                        c1297910jsb.pushMap(c1297860jsW);
                        c1316970kNL.LIZLLL.put(strOptString3, jSONObject);
                        if (c1316970kNL.LIZIZ.length() != 0 && Intrinsics.LJFF(strOptString3, c1316970kNL.LIZIZ)) {
                            if (C1317020kNQ.LIZ[c1316970kNL.LIZJ.ordinal()] == 1) {
                                c1316970kNL.LIZJ(iLIZ, EnumC1317010kNP.LOADING);
                            }
                        } else {
                            c1316970kNL.LIZJ(iLIZ, EnumC1317010kNP.LOADING);
                        }
                        JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("data");
                        if (jSONObjectOptJSONObject8 != null) {
                            jSONObjectOptJSONObject5 = jSONObjectOptJSONObject8.optJSONObject("playParams");
                        }
                        C1317210kNj c1317210kNj = abstractC1317090kNX.LLJILLL;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("data", jSONObjectOptJSONObject5);
                        c1317210kNj.LIZ(-1L, "playMusic", C786410Ut5.J3(jSONObject2));
                        c1316970kNL.LIZIZ(strOptString, jSONObjectOptJSONObject3);
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C189200o6.m5exceptionOrNullimpl(c098200Yq);
                }
            }
        }
    }
}
