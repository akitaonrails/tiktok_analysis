package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.saas.host.api.chatlist.IMChatListBridgeApi;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS44S1300000_2;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS87S1200000_2;
import kotlin.jvm.internal.AwS89S0201000_2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06Bk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1566606Bk implements InterfaceC1566906Bn {
    public static final C1566606Bk LIZ = new C1566606Bk();
    public static final List<InterfaceC1566906Bn> LIZIZ = C1697810uHb.LJIIJJI(new InterfaceC1566906Bn() { // from class: X.06B5
        @Override // X.InterfaceC884050YmB
        public final String LIZ() {
            return "streak_single_inline_trigger";
        }

        @Override // X.InterfaceC1566906Bn
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC1566906Bn, X.InterfaceC884050YmB
        public final void LIZJ(InterfaceC884020Ym8 interfaceC884020Ym8, List<? extends InterfaceC884440Ymo> list, boolean z, String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LIZLLL(String str, StreakData streakData, StreakData streakData2) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJFF(String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJI(EnumC1578206Fw enumC1578206Fw, String str, StreakData streakData, EnumC1578706Gb enumC1578706Gb) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LLLIILIL(C1574906Ep c1574906Ep) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LLLJIL(String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void g(String str) {
            if (C06BY.LIZ()) {
                C1564306An.LIZ.getClass();
                if (C06FS.LIZ().enableInlineMsg) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C066Q(4, str, null), 3);
                }
            }
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJ(C06BD c06bd, EnumC1567006Bo enumC1567006Bo, String str, StreakData streakData, StreakData streakData2, Map<String, String> map) {
            if (streakData2.convType != AbstractC1711506n3.LIZ) {
                return;
            }
            String strLIZ = C1566206Bg.LIZ(streakData2);
            int i = C06BC.LIZ[c06bd.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C1564306An.LIZ.getClass();
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1564606Aq(streakData2, null), 3);
                        return;
                    }
                    return;
                }
                C1564306An c1564306An = C1564306An.LIZ;
                List listSingletonList = Collections.singletonList(strLIZ);
                c1564306An.getClass();
                C1564306An.LIZLLL(2, listSingletonList);
                C06B8 c06b8 = C06B8.LIZIZ;
                C06BK c06bk = new C06BK(strLIZ, C06BT.REMIND_IN_APP_PUSH, streakData2);
                C06BR c06br = new C06BR(streakData2, c06bd, enumC1567006Bo, strLIZ, map, null);
                c06b8.getClass();
                C06B8.LIZ(c06bk, c06br);
                return;
            }
            C1564306An.LIZ.getClass();
            if (!C06FS.LIZ().enableInlineMsg) {
                return;
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1564506Ap(streakData2, streakData, null), 3);
        }
    }, new InterfaceC1566906Bn() { // from class: X.06B4
        public final String LIZ = "streak_group_inline_trigger";
        public final ConcurrentHashMap<String, Boolean> LIZIZ = new ConcurrentHashMap<>();

        @Override // X.InterfaceC1566906Bn
        public final void LIZLLL(String str, StreakData streakData, StreakData streakData2) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJFF(String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJI(EnumC1578206Fw enumC1578206Fw, String str, StreakData streakData, EnumC1578706Gb enumC1578706Gb) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LLLJIL(String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LIZIZ() {
            this.LIZIZ.clear();
        }

        @Override // X.InterfaceC884050YmB
        public final String LIZ() {
            return this.LIZ;
        }

        @Override // X.InterfaceC1566906Bn
        public final void LLLIILIL(C1574906Ep c1574906Ep) {
            int i = c1574906Ep.LIZIZ;
            if (i != 1) {
                if (i == 2) {
                    C1564306An c1564306An = C1564306An.LIZ;
                    List listLLIIII = C13LP.LLIIII(c1574906Ep.LIZJ);
                    c1564306An.getClass();
                    C1564306An.LIZLLL(1, listLLIIII);
                    return;
                }
                return;
            }
            LJII(1, C13LP.LLIIII(c1574906Ep.LIZJ));
        }

        @Override // X.InterfaceC1566906Bn
        public final void g(String str) {
            LJII(4, Collections.singletonList(str));
            C1564306An c1564306An = C1564306An.LIZ;
            List listSingletonList = Collections.singletonList(str);
            c1564306An.getClass();
            C1564306An.LIZLLL(4, listSingletonList);
        }

        public final void LJII(int i, List<String> list) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C06B1(i, list, this, null), 3);
        }

        @Override // X.InterfaceC1566906Bn, X.InterfaceC884050YmB
        public final void LIZJ(InterfaceC884020Ym8 interfaceC884020Ym8, List<? extends InterfaceC884440Ymo> list, boolean z, String str) {
            List<String> listLIZIZ;
            IMChatListBridgeApi.LIZ.getClass();
            IMChatListBridgeApi value = C1566306Bh.LIZIZ.getValue();
            if (value != null && (listLIZIZ = value.LIZIZ(list)) != null) {
                ArrayList arrayList = new ArrayList();
                for (String str2 : listLIZIZ) {
                    if (this.LIZIZ.putIfAbsent(str2, Boolean.TRUE) == null) {
                        arrayList.add(str2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                LJII(3, arrayList);
                C1564306An.LIZ.getClass();
                C1564306An.LIZLLL(3, arrayList);
            }
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJ(C06BD c06bd, EnumC1567006Bo enumC1567006Bo, String str, StreakData streakData, StreakData streakData2, Map<String, String> map) {
            String str2;
            int i = streakData2.convType;
            int i2 = AbstractC1711506n3.LIZIZ;
            if (i != i2 || (str2 = streakData2.convId) == null) {
                return;
            }
            boolean z = C1590906Kt.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StreakGroupInlineTrigger onReceiveCmdMsg ");
            sbLIZ.append(str2);
            sbLIZ.append(' ');
            sbLIZ.append(c06bd);
            C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            int i3 = C06BB.LIZ[c06bd.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        C1564306An c1564306An = C1564306An.LIZ;
                        List listSingletonList = Collections.singletonList(str2);
                        c1564306An.getClass();
                        C1564306An.LIZLLL(2, listSingletonList);
                        C06B8 c06b8 = C06B8.LIZIZ;
                        C06BK c06bk = new C06BK(str2, C06BT.REMIND_IN_APP_PUSH, streakData2);
                        C06BQ c06bq = new C06BQ(streakData2, c06bd, enumC1567006Bo, str2, map, null);
                        c06b8.getClass();
                        C06B8.LIZ(c06bk, c06bq);
                        return;
                    }
                    return;
                }
                String str3 = streakData2.convId;
                if (str3 == null) {
                    str3 = "";
                }
                C1564306An.LIZ.getClass();
                if (C1567806Bw.LIZIZ(str3) == i2) {
                    InterfaceC1564806As.LIZIZ.getClass();
                    C1575806Ey.LIZJ.getClass();
                    StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str3);
                    if (streakDataLJIIIIZZ == null) {
                        C1590906Kt.LIZ("InlineMsgHelper: tryRemoveEndInlineMsg, streak data is null");
                    } else {
                        Pair pairLIZ = C1564306An.LIZ(str3);
                        if (pairLIZ != null && ((CharSequence) pairLIZ.getSecond()).length() > 0) {
                            if (C1567806Bw.LIZ(streakDataLJIIIIZZ) <= ((Number) pairLIZ.getFirst()).longValue()) {
                                C1590906Kt.LIZ("InlineMsgHelper: tryRemoveEndInlineMsg, new streakData has same end time, don't need to remove");
                            } else if (((CharSequence) pairLIZ.getSecond()).length() == 0) {
                                C1590906Kt.LIZ("InlineMsgHelper: tryRemoveEndInlineMsg, uuid is empty");
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("InlineMsgHelper: tryRemoveEndInlineMsg, end inline removed, last end time=");
                                sbLIZ2.append(((Number) pairLIZ.getFirst()).longValue());
                                C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                String str4 = (String) pairLIZ.getSecond();
                                FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpiForReal(FakeMsgOperatorService.class);
                                if (fakeMsgOperatorService != null) {
                                    C1684506ih c1684506ih = new C1684506ih();
                                    c1684506ih.LIZLLL(21);
                                    c1684506ih.LIZJ = str4;
                                    fakeMsgOperatorService.LIZ(str3, c1684506ih, null, null);
                                }
                                C1564306An.LIZIZ(0L, str3, "");
                            }
                        } else {
                            C1590906Kt.LIZ("InlineMsgHelper: tryRemoveEndInlineMsg, end msg info is null");
                        }
                    }
                }
                C1564306An.LIZJ(Collections.singletonList(str3), 2, new C06B3(this));
                return;
            }
            C1564306An.LIZ.getClass();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C066C(str2, null), 3);
        }
    }, new C06BM(), new InterfaceC1566906Bn() { // from class: X.06E3
        @Override // X.InterfaceC884050YmB
        public final String LIZ() {
            return "streak_psp_and_monitor_trigger";
        }

        @Override // X.InterfaceC1566906Bn
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC1566906Bn, X.InterfaceC884050YmB
        public final void LIZJ(InterfaceC884020Ym8 interfaceC884020Ym8, List<? extends InterfaceC884440Ymo> list, boolean z, String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJFF(String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LLLIILIL(C1574906Ep c1574906Ep) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LLLJIL(String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void g(String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LIZLLL(String str, StreakData streakData, StreakData streakData2) {
            C06E4.LIZ.getClass();
            if (Intrinsics.LJFF(streakData2.source, "fake_write")) {
                int i = streakData2.streak;
                int iLJII = C1567806Bw.LJII(streakData2);
                C06G2 c06g2 = EnumC1578706Gb.Companion;
                EnumC1579606Gk enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(streakData2, false);
                c06g2.getClass();
                TTMStrategyCenterManager.asyncEmitEventToGlobalStrategyEventStream("im_psp_fake_streak_written", new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("streakDays", Integer.valueOf(i)), new Pair("streakLevel", Integer.valueOf(iLJII)), new Pair("streakStatus", C06G2.LIZ(enumC1579606GkLJIIIIZZ).getValue()), new Pair("convId", streakData2.convId), new Pair("convType", Integer.valueOf(streakData2.convType)))), (ExecutorService) null);
            }
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJI(EnumC1578206Fw enumC1578206Fw, String str, StreakData streakData, EnumC1578706Gb enumC1578706Gb) {
            int i;
            int iLJII;
            C06E4.LIZ.getClass();
            if (streakData != null) {
                i = streakData.streak;
                iLJII = C1567806Bw.LJII(streakData);
            } else {
                i = 0;
                iLJII = 0;
            }
            Pair[] pairArr = new Pair[6];
            pairArr[0] = new Pair("streakDays", Integer.valueOf(i));
            pairArr[1] = new Pair("streakLevel", Integer.valueOf(iLJII));
            pairArr[2] = new Pair("streakStatus", enumC1578706Gb.getValue());
            pairArr[3] = new Pair(Scene.SCENE_SERVICE, enumC1578206Fw.toString());
            pairArr[4] = new Pair("convId", str);
            if (str == null) {
                str = "";
            }
            pairArr[5] = new Pair("convType", Integer.valueOf(C1567806Bw.LIZIZ(str)));
            TTMStrategyCenterManager.asyncEmitEventToGlobalStrategyEventStream("im_psp_streak_badge_update", new JSONObject(C2097608Jq.LJIIIIZZ(pairArr)), (ExecutorService) null);
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJ(C06BD c06bd, EnumC1567006Bo enumC1567006Bo, String str, StreakData streakData, StreakData streakData2, Map<String, String> map) {
            String strLIZ = C1566206Bg.LIZ(streakData2);
            if (c06bd == C06BD.StreakCmdStart) {
                C06EC.LIZIZ.getClass();
                if (streakData != null && streakData2.remainRestoreCnt < streakData.remainRestoreCnt) {
                    C23250099c.LIZLLL(C06EC.LJFF, null, null, new C06E9(streakData2, System.currentTimeMillis(), null), 3);
                }
            }
            C06E4.LIZ.getClass();
            C06E4.LIZ(strLIZ, c06bd, streakData, streakData2);
        }
    }, new InterfaceC1566906Bn() { // from class: X.06B6
        @Override // X.InterfaceC884050YmB
        public final String LIZ() {
            return "streak_update_trigger";
        }

        @Override // X.InterfaceC1566906Bn
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC1566906Bn, X.InterfaceC884050YmB
        public final void LIZJ(InterfaceC884020Ym8 interfaceC884020Ym8, List<? extends InterfaceC884440Ymo> list, boolean z, String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LIZLLL(String str, StreakData streakData, StreakData streakData2) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJ(C06BD c06bd, EnumC1567006Bo enumC1567006Bo, String str, StreakData streakData, StreakData streakData2, Map<String, String> map) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJFF(String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJI(EnumC1578206Fw enumC1578206Fw, String str, StreakData streakData, EnumC1578706Gb enumC1578706Gb) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LLLJIL(String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void g(String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LLLIILIL(C1574906Ep c1574906Ep) {
            if (c1574906Ep.LIZIZ == 1) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C066S(c1574906Ep.LIZJ, null), 3);
            }
        }
    }, new InterfaceC1566906Bn() { // from class: X.06B9
        @Override // X.InterfaceC884050YmB
        public final String LIZ() {
            return "streak_pet_streak_trigger";
        }

        @Override // X.InterfaceC1566906Bn
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC1566906Bn, X.InterfaceC884050YmB
        public final void LIZJ(InterfaceC884020Ym8 interfaceC884020Ym8, List<? extends InterfaceC884440Ymo> list, boolean z, String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LIZLLL(String str, StreakData streakData, StreakData streakData2) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJFF(String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJI(EnumC1578206Fw enumC1578206Fw, String str, StreakData streakData, EnumC1578706Gb enumC1578706Gb) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LLLIILIL(C1574906Ep c1574906Ep) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LLLJIL(String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void g(String str) {
            C066E c066e = C066E.LIZ;
            List listSingletonList = Collections.singletonList(str);
            c066e.getClass();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C066D(4, listSingletonList, null), 3);
            C06BG.LIZ.evictAll();
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJ(C06BD c06bd, EnumC1567006Bo enumC1567006Bo, String str, StreakData streakData, StreakData streakData2, Map<String, String> map) {
            String strLIZ = C1566206Bg.LIZ(streakData2);
            if (C06BA.LIZ[c06bd.ordinal()] == 1 && !Intrinsics.LJFF(str, "streak_restore")) {
                C06BE.LL.ec(streakData2, strLIZ);
                if (streakData2.convType != AbstractC1711506n3.LIZIZ) {
                    C1569106Cj.LJ.getClass();
                    C1569106Cj c1569106Cj = C1569106Cj.LJI;
                    C23250099c.LIZLLL(c1569106Cj.LIZ, null, null, new C06C5(c1569106Cj, strLIZ, false, null), 3);
                }
            }
        }
    }, new C06BZ(), new InterfaceC1566906Bn() { // from class: X.06Bq
        @Override // X.InterfaceC884050YmB
        public final String LIZ() {
            return "streak_cmd_compensation_trigger";
        }

        @Override // X.InterfaceC1566906Bn
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC1566906Bn, X.InterfaceC884050YmB
        public final void LIZJ(InterfaceC884020Ym8 interfaceC884020Ym8, List<? extends InterfaceC884440Ymo> list, boolean z, String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LIZLLL(String str, StreakData streakData, StreakData streakData2) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJ(C06BD c06bd, EnumC1567006Bo enumC1567006Bo, String str, StreakData streakData, StreakData streakData2, Map<String, String> map) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJFF(String str) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LJI(EnumC1578206Fw enumC1578206Fw, String str, StreakData streakData, EnumC1578706Gb enumC1578706Gb) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LLLIILIL(C1574906Ep c1574906Ep) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        }

        @Override // X.InterfaceC1566906Bn
        public final void LLLJIL(String str) {
            boolean z = C1590906Kt.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StreakCmdCompensationTrigger onExitChatRoom convId: ");
            sbLIZ.append(str);
            C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC1566906Bn
        public final void g(String str) {
            boolean z = C1590906Kt.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StreakCmdCompensationTrigger onEnterChatRoom convId: ");
            sbLIZ.append(str);
            C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C06F5.LIZ.getClass();
            C06F4.LIZIZ.LIZIZ(str, "chat_page", null);
        }
    });

    @Override // X.InterfaceC884050YmB
    public final String LIZ() {
        return "streak_triggers";
    }

    @Override // X.InterfaceC1566906Bn
    public final void LIZIZ() {
        IMChatListBridgeApi.LIZ.getClass();
        IMChatListBridgeApi value = C1566306Bh.LIZIZ.getValue();
        if (value != null) {
            value.LJ(this);
        }
        LJII(AFwS229S0000000_2.get$arr$(890));
    }

    public static void LJII(Function1 function1) {
        Iterator<InterfaceC1566906Bn> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }

    @Override // X.InterfaceC1566906Bn
    public final void LJFF(String str) {
        LJII(new AwS53S1000000_2(str, 36));
    }

    @Override // X.InterfaceC1566906Bn
    public final void LLLIILIL(C1574906Ep c1574906Ep) {
        LJII(new AwS581S0100000_2(c1574906Ep, 666));
    }

    @Override // X.InterfaceC1566906Bn
    public final void LLLJIL(String str) {
        LJII(new AwS53S1000000_2(str, 38));
    }

    @Override // X.InterfaceC1566906Bn
    public final void g(String str) {
        LJII(new AwS53S1000000_2(str, 37));
    }

    @Override // X.InterfaceC1566906Bn
    public final void LIZLLL(String str, StreakData streakData, StreakData streakData2) {
        LJII(new AwS87S1200000_2(str, streakData, streakData2, 14));
    }

    @Override // X.InterfaceC1566906Bn
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        LJII(new AwS89S0201000_2((List) list, (List<C869590Y9l>) i, (int) c0y7p, (C0Y7P) 8));
    }

    @Override // X.InterfaceC1566906Bn, X.InterfaceC884050YmB
    public final void LIZJ(InterfaceC884020Ym8 interfaceC884020Ym8, List<? extends InterfaceC884440Ymo> list, boolean z, String str) {
        LJII(new C1566806Bm(interfaceC884020Ym8, list, z, str));
    }

    @Override // X.InterfaceC1566906Bn
    public final void LJI(EnumC1578206Fw enumC1578206Fw, String str, StreakData streakData, EnumC1578706Gb enumC1578706Gb) {
        LJII(new AwS44S1300000_2(enumC1578206Fw, str, streakData, enumC1578706Gb, 4));
    }

    @Override // X.InterfaceC1566906Bn
    public final void LJ(C06BD c06bd, EnumC1567006Bo enumC1567006Bo, String str, StreakData streakData, StreakData streakData2, Map<String, String> map) {
        LJII(new C1566706Bl(c06bd, enumC1567006Bo, str, streakData, streakData2, map));
    }
}
