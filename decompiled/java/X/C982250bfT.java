package X;

import Y.AfS151S0200000_15;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicTakeStageLayoutAnimation;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageSettlementClockDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageV2FixEndTimeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bfT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982250bfT implements InterfaceC1141530foN {
    public final DataChannel LL;
    public final Function0<InterfaceC978000bYc> LLILLJJLI;
    public C954460awe LLILZLL;
    public boolean LLIZLLLIL;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final Map<Long, Long> LLILLL = new LinkedHashMap();
    public final Map<Long, Long> LLILZ = new LinkedHashMap();
    public EnumC982500bfs LLILZIL = EnumC982500bfs.UNKNOWN;
    public boolean LLIZ = true;
    public EnumC982400bfi LLJ = EnumC982400bfi.UNKNOWN;
    public final C11NJ LLJILJILJ = new C11NJ();

    public final void LIZIZ(C981480beE c981480beE) {
        if (this.LLJIJIL) {
            C20441214yg.LJ("TakeTheStageLedFEPresenter", "doInitOnce return.");
            return;
        }
        this.LLJIJIL = true;
        C1548820qPI.LIZLLL("pop_up_take_the_stage_management_panel_event", this);
        this.LLJILJILJ.LIZ(C784440Upu.LIZ().LJ(C257100z3.class).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS151S0200000_15(this, c981480beE, 59), new C09JN() { // from class: X.0bh4
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("TakeTheStageLedFEPresenter@2958.doInitOnce$2");
                C1C7U.LIZIZ("TakeTheStageLedFEPresenter@2958.doInitOnce$2");
            }
        }));
    }

    public final Map<String, String> LIZJ(boolean z) {
        boolean zLJIJI;
        long jLJJLIIIJ;
        String string;
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            zLJIJI = C500260Jjc.LJIJI(dataChannel);
        } else {
            zLJIJI = false;
        }
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel2);
        } else {
            jLJJLIIIJ = 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C973690bRf.LIZIZ(linkedHashMap, zLJIJI);
        String str = "";
        C973690bRf.LJIIJJI("", linkedHashMap);
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 != null && (string = Long.valueOf(c981480beEM91.LJIIIZ).toString()) != null) {
            str = string;
        }
        linkedHashMap.put("pk_id", str);
        linkedHashMap.put("to_room_id", String.valueOf(jLJJLIIIJ));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("genGlobalPropertiesToFE isInit:");
        sbLIZ.append(z);
        sbLIZ.append(" params:");
        sbLIZ.append(linkedHashMap);
        C20441214yg.LJIIIZ("TakeTheStageLedFEPresenter", C2188811AlT.LIZIZ(sbLIZ));
        return linkedHashMap;
    }

    public final void LJ(C981480beE c981480beE) {
        List<C982390bfh> list;
        long jLongValue;
        if (c981480beE != null && (list = c981480beE.LJIILJJIL) != null) {
            for (C982390bfh c982390bfh : list) {
                for (C982710bgD c982710bgD : c982390bfh.LJI) {
                    long j = c982710bgD.LIZ;
                    long j2 = c982390bfh.LIZIZ;
                    Long l = (Long) ((LinkedHashMap) this.LLILLL).get(Long.valueOf(j));
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    if (jLongValue < j2) {
                        this.LLILLL.put(Long.valueOf(j), Long.valueOf(j2));
                    }
                    this.LLILZ.put(Long.valueOf(c982710bgD.LIZ), Long.valueOf(c982390bfh.LIZJ));
                }
            }
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC978000bYc interfaceC978000bYcInvoke;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveJsEvent:");
        sbLIZ.append(c262100zr.LIZ);
        C20441214yg.LIZIZ("TakeTheStageLedFEPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(c262100zr.LIZ, "pop_up_take_the_stage_management_panel_event") && (interfaceC978000bYcInvoke = this.LLILLJJLI.invoke()) != null) {
            interfaceC978000bYcInvoke.onClick(EnumC973950bS5.INFO_BAR.getValue());
        }
    }

    public C982250bfT(DataChannel dataChannel, AwS559S0100000_15 awS559S0100000_15) {
        this.LL = dataChannel;
        this.LLILLJJLI = awS559S0100000_15;
    }

    public static long LIZ(long j, String str, Function0 function0) {
        boolean z;
        long jLIZJ = C158B.LIZJ();
        long jLongValue = 0;
        if (j == 0 || j <= jLIZJ) {
            if (LiveCoHostTakeTheStageV2FixEndTimeSetting.INSTANCE.getValue() && j == 0) {
                z = true;
                if (function0 != null) {
                    jLongValue = ((Number) function0.invoke()).longValue();
                }
            } else {
                z = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkEndTime error, ");
            sbLIZ.append(j);
            sbLIZ.append(" currentTime:");
            sbLIZ.append(jLIZJ);
            sbLIZ.append(" source:");
            sbLIZ.append(str);
            sbLIZ.append(" defaultValue:");
            sbLIZ.append(jLongValue);
            sbLIZ.append(" enableDefault:");
            sbLIZ.append(z);
            C20441214yg.LJ("TakeTheStageLedFEPresenter", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                return jLongValue;
            }
        }
        return j;
    }

    public static void LIZLLL(C982250bfT c982250bfT, EnumC982400bfi enumC982400bfi, C981480beE c981480beE, long j, EnumC982770bgJ enumC982770bgJ, int i) {
        long j2;
        List<C954460awe> listLJJLI;
        Integer numValueOf;
        long value;
        Object string;
        Long lValueOf;
        C981540beK c981540beK;
        C981540beK c981540beK2;
        Object string2;
        C981540beK c981540beK3;
        String str;
        boolean z;
        int iLIZJ;
        C981500beG c981500beG;
        ImageModel imageModel;
        long jLongValue;
        long jLongValue2;
        List<C954460awe> list;
        long j3 = j;
        if ((i & 4) != 0) {
            j3 = 0;
        }
        if ((i & 8) != 0) {
            enumC982770bgJ = EnumC982770bgJ.NORMAL;
        }
        c982250bfT.getClass();
        if (enumC982400bfi != EnumC982400bfi.UNKNOWN && enumC982400bfi.getIndex() >= c982250bfT.LLJ.getIndex()) {
            c982250bfT.LLJ = enumC982400bfi;
            long jLIZIZ = C158B.LIZIZ();
            if (c981480beE == null) {
                C20441214yg.LJIIL("TakeTheStageLedFEPresenter", "model should not be null");
                j2 = 2;
            } else {
                j2 = c981480beE.LJJIJIIJI.LJIILLIIL;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Take the stage version:");
            sbLIZ.append(j2);
            C20441214yg.LIZIZ("TakeTheStageLedFEPresenter", C2188811AlT.LIZIZ(sbLIZ));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, enumC982400bfi.getValue());
            if (enumC982400bfi == EnumC982400bfi.PERFORMING) {
                jSONObject.put("is_start_show", c982250bfT.LLIZ);
                if (LinkMicTakeStageLayoutAnimation.isEnable(C950220apo.LJI())) {
                    jSONObject.put("is_sweep_show", 1);
                }
            }
            Map<Long, Long> map = c982250bfT.LLILLL;
            Map<Long, Long> map2 = c982250bfT.LLILZ;
            JSONArray jSONArray = new JSONArray();
            Long lValueOf2 = null;
            if (c981480beE != null && (list = c981480beE.LJI) != null && !list.isEmpty()) {
                if (c981480beE != null) {
                    listLJJLI = c981480beE.LJI;
                } else {
                    listLJJLI = null;
                }
            } else {
                C20441214yg.LIZIZ("TakeTheStageLedFEPresenter", "generateUserList model list is empty, use service list");
                listLJJLI = C915980Zwa.LJII().LJJLI();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("generateUserList userList size: ");
            if (listLJJLI != null) {
                numValueOf = Integer.valueOf(listLJJLI.size());
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            C20441214yg.LIZIZ("TakeTheStageLedFEPresenter", C2188811AlT.LIZIZ(sbLIZ2));
            if (listLJJLI != null) {
                for (C954460awe c954460awe : listLJJLI) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("user_id", String.valueOf(c954460awe.LJ));
                    C754570Tip c754570Tip = c954460awe.LJIJJ;
                    if (c754570Tip != null) {
                        str = c754570Tip.LIZIZ;
                    } else {
                        str = null;
                    }
                    jSONObject2.put("nickname", str);
                    long j4 = c954460awe.LJIJJLI;
                    if (j4 != -1 && j4 != 2 && j4 != 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jSONObject2.put("need_follow", z);
                    if (map != null) {
                        Long l = (Long) ((LinkedHashMap) map).get(Long.valueOf(c954460awe.LJ));
                        if (l != null) {
                            jLongValue2 = l.longValue();
                        } else {
                            jLongValue2 = 0;
                        }
                        jSONObject2.put("score", jLongValue2);
                    }
                    if (map2 != null) {
                        Long l2 = (Long) ((LinkedHashMap) map2).get(Long.valueOf(c954460awe.LJ));
                        if (l2 != null) {
                            jLongValue = l2.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        jSONObject2.put("current_rank", jLongValue);
                    }
                    C754570Tip c754570Tip2 = c954460awe.LJIJJ;
                    if (c754570Tip2 != null && (imageModel = c754570Tip2.LIZJ) != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("url_list", jSONArray2);
                        Iterator it2 = imageModel.getUrls().iterator();
                        while (it2.hasNext()) {
                            jSONArray2.put(it2.next());
                        }
                        jSONObject2.put("icon", jSONObject3);
                    }
                    JSONObject jSONObject4 = new JSONObject();
                    if (c981480beE != null && (c981500beG = c981480beE.LJJIJIIJI) != null) {
                        iLIZJ = (int) c981500beG.LIZJ(c954460awe.LJ);
                    } else {
                        iLIZJ = 0;
                    }
                    jSONObject4.put("color_name", C982410bfj.LIZLLL(iLIZJ));
                    jSONObject2.put("color", jSONObject4);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("user_list", jSONArray);
            jSONObject.put("end_time", j3);
            jSONObject.put("server_time", jLIZIZ);
            if (c981480beE != null && (c981540beK3 = c981480beE.LJIIJ) != null) {
                value = c981540beK3.LJII;
                if (value <= 0) {
                    value = LiveCoHostTakeTheStageSettlementClockDurationSetting.INSTANCE.getValue();
                }
            } else {
                value = 0;
            }
            jSONObject.put("alarm_duration", value * 1000);
            jSONObject.put("take_the_stage_version", j2);
            if (enumC982400bfi == EnumC982400bfi.FINAL_RESULT) {
                jSONObject.put("final_result_status", c982250bfT.LLILZIL.getString());
            }
            if (enumC982400bfi == EnumC982400bfi.PERFORMING) {
                C954460awe c954460awe2 = c982250bfT.LLILZLL;
                if (c954460awe2 != null) {
                    string2 = Long.valueOf(c954460awe2.LJ).toString();
                } else {
                    string2 = null;
                }
                jSONObject.put("current_user_id", string2);
            }
            if (c981480beE != null) {
                string = Long.valueOf(c981480beE.LJFF).toString();
            } else {
                string = null;
            }
            jSONObject.put("anchor_id", string);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("type", enumC982770bgJ.getValue());
            jSONObject5.put("data", jSONObject);
            jSONObject5.put("time_stamp", System.currentTimeMillis());
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("generateNormalStatusJson status=");
            sbLIZ3.append(enumC982400bfi.getValue());
            sbLIZ3.append(" type=");
            sbLIZ3.append(enumC982770bgJ.getValue());
            sbLIZ3.append(" end_time=");
            sbLIZ3.append(j3);
            sbLIZ3.append(" server_time=");
            sbLIZ3.append(jLIZIZ);
            sbLIZ3.append(" remain_ms=");
            sbLIZ3.append(j3 - jLIZIZ);
            sbLIZ3.append(" playingPerformingEndTime=");
            if (c981480beE != null && (c981540beK2 = c981480beE.LJIIJ) != null) {
                lValueOf = Long.valueOf(c981540beK2.LIZLLL);
            } else {
                lValueOf = null;
            }
            sbLIZ3.append(lValueOf);
            sbLIZ3.append(" playingPlannedEndTime=");
            if (c981480beE != null && (c981540beK = c981480beE.LJIIJ) != null) {
                lValueOf2 = Long.valueOf(c981540beK.LJFF);
            }
            sbLIZ3.append(lValueOf2);
            C20441214yg.LIZIZ("TakeTheStageLedFEPresenter", C2188811AlT.LIZIZ(sbLIZ3));
            boolean z2 = !c982250bfT.LLJI;
            C389001fE.LIZ("update_take_the_stage_led_top_bar", jSONObject5, System.currentTimeMillis() + 10000, z2);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("notifyStatusChangeToFE isSticky: ");
            sbLIZ4.append(z2);
            sbLIZ4.append(" isJsbReady:");
            sbLIZ4.append(c982250bfT.LLJI);
            sbLIZ4.append(", ");
            sbLIZ4.append(jSONObject5);
            C20441214yg.LIZIZ("TakeTheStageLedFEPresenter", C2188811AlT.LIZIZ(sbLIZ4));
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("notifyStatusChangeToFE return, status:");
        sbLIZ5.append(enumC982400bfi);
        sbLIZ5.append(" oldStatus:");
        sbLIZ5.append(c982250bfT.LLJ);
        C20441214yg.LJ("TakeTheStageLedFEPresenter", C2188811AlT.LIZIZ(sbLIZ5));
    }
}
