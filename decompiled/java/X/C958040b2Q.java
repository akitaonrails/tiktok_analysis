package X;

import Y.AComparatorS34S0000000_15;
import com.bytedance.android.live.liveinteract.competition.takestage.event.TakeStageSwitchTurnEvent;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostLayoutExtra;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicTakeStageLayoutAnimation;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostLayoutIdConfigSetting;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS30S0000100_15;
import kotlin.jvm.internal.AwS37S1400000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import tikcast.linkmic.common.CohostTypeLayoutExtra;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.MultiGuestLayoutNonSeiExtra;

/* JADX INFO: renamed from: X.0b2Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958040b2Q {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(236));

    public static boolean LIZLLL() {
        C956040azC c956040azCLJI;
        C956040azC c956040azCLJI2;
        CohostTypeLayoutExtra cohostTypeLayoutExtra;
        if (C955010axX.LJIIJ) {
            C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
            return (c955010axXI30 == null || (c956040azCLJI2 = c955010axXI30.LJI()) == null || (cohostTypeLayoutExtra = c956040azCLJI2.LIZLLL) == null || cohostTypeLayoutExtra.isZoomLayout != 1) ? false : true;
        }
        if (!C963580bBM.LIZ()) {
            String strLJ = LJ();
            LiveCoHostLayoutIdConfigSetting liveCoHostLayoutIdConfigSetting = LiveCoHostLayoutIdConfigSetting.INSTANCE;
            return LJIIIIZZ(strLJ, liveCoHostLayoutIdConfigSetting.getValue().selfAnchorZoomed_v2) || LJIIIIZZ(strLJ, liveCoHostLayoutIdConfigSetting.getValue().otherAnchorZoomed_v2);
        }
        C955010axX c955010axXI302 = C915980Zwa.LJII().i30();
        if (c955010axXI302 == null || (c956040azCLJI = c955010axXI302.LJI()) == null) {
            return false;
        }
        return LJIIIZ(c956040azCLJI) || LJII(c956040azCLJI);
    }

    public static boolean LJFF() {
        C981480beE c981480beEM91;
        List<C954460awe> list;
        C981480beE c981480beEM912;
        C981480beE c981480beEM913;
        C981500beG c981500beG;
        List<Long> list2;
        if (!((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() || (c981480beEM91 = C915980Zwa.LIZIZ().M91(false)) == null || (list = c981480beEM91.LJI) == null || list.size() <= 2 || (c981480beEM912 = C915980Zwa.LIZIZ().M91(false)) == null || c981480beEM912.LJJIJIIJI == null || (c981480beEM913 = C915980Zwa.LIZIZ().M91(false)) == null || (c981500beG = c981480beEM913.LJJIJIIJI) == null || (list2 = c981500beG.LJI) == null) {
            return false;
        }
        Long l = (Long) C13LP.LJJJLZIJ(0, list2);
        return l != null && l.longValue() == C950220apo.LJ();
    }

    public static boolean LIZ() {
        C956040azC c956040azCLJI;
        CohostLayoutExtra cohostLayoutExtra;
        if (!C963580bBM.LIZ()) {
            return LJIIIIZZ(LJ(), (String) LIZ.getValue());
        }
        C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
        return (c955010axXI30 == null || (c956040azCLJI = c955010axXI30.LJI()) == null || (cohostLayoutExtra = c956040azCLJI.LIZJ) == null || cohostLayoutExtra.isZoomLayout == 1) ? false : true;
    }

    public static boolean LIZIZ() {
        C956040azC c956040azCLJI;
        if (!C963580bBM.LIZ()) {
            return LJI(LJ());
        }
        C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
        return (c955010axXI30 == null || (c956040azCLJI = c955010axXI30.LJI()) == null || !LJII(c956040azCLJI)) ? false : true;
    }

    public static boolean LIZJ() {
        C956040azC c956040azCLJI;
        if (!C963580bBM.LIZ()) {
            return LJIIIIZZ(LJ(), LiveCoHostLayoutIdConfigSetting.INSTANCE.getValue().selfAnchorZoomed_v2);
        }
        C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
        return (c955010axXI30 == null || (c956040azCLJI = c955010axXI30.LJI()) == null || !LJIIIZ(c956040azCLJI)) ? false : true;
    }

    public static String LJ() {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        String layoutId;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        return (interfaceC954180awCLJIIIZ == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL()) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) == null || (layoutId = interfaceC937820aVoLJJJJZ.getLayoutId()) == null) ? "" : layoutId;
    }

    public static boolean LJI(String str) {
        if (!LJIIIIZZ(str, LiveCoHostLayoutIdConfigSetting.INSTANCE.getValue().otherAnchorZoomed_v2) && !LJIIIIZZ(str, "2105") && !LJIIIIZZ(str, "2106")) {
            return false;
        }
        return true;
    }

    public static boolean LJII(C956040azC c956040azC) {
        String str;
        C955080axe next;
        C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(C950220apo.LJFF());
        String str2 = null;
        if (c954460aweLLILL != null) {
            str = c954460aweLLILL.LJIIJJI;
        } else {
            str = null;
        }
        CohostLayoutExtra cohostLayoutExtra = c956040azC.LIZJ;
        if (cohostLayoutExtra != null && cohostLayoutExtra.isZoomLayout == 1) {
            List<C955080axe> list = c956040azC.LIZ;
            if (list != null) {
                Iterator<C955080axe> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.LJ == 0) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C955080axe c955080axe = next;
                if (c955080axe != null) {
                    str2 = c955080axe.LJIIIIZZ;
                }
            }
            if (!Intrinsics.LJFF(str2, str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIIIZ(C956040azC c956040azC) {
        String str;
        C955080axe next;
        C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(C950220apo.LJFF());
        String str2 = null;
        if (c954460aweLLILL != null) {
            str = c954460aweLLILL.LJIIJJI;
        } else {
            str = null;
        }
        CohostLayoutExtra cohostLayoutExtra = c956040azC.LIZJ;
        if (cohostLayoutExtra != null && cohostLayoutExtra.isZoomLayout == 1) {
            List<C955080axe> list = c956040azC.LIZ;
            if (list != null) {
                Iterator<C955080axe> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.LJ == 0) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C955080axe c955080axe = next;
                if (c955080axe != null) {
                    str2 = c955080axe.LJIIIIZZ;
                }
            }
            if (Intrinsics.LJFF(str2, str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIIIIZZ(String str, String str2) {
        if (Intrinsics.LJFF(str, str2)) {
            return true;
        }
        if (str != null && str.length() > 0 && u.LJJIIJZLJL(str2, str, false)) {
            return true;
        }
        if (str2.length() > 0 && str != null && u.LJJIIJZLJL(str, str2, false)) {
            return true;
        }
        return false;
    }

    public static void LJIILIIL(String str, C981480beE c981480beE) {
        if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(c981480beE.LIZIZ))) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSeiForNormalStream");
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("TakeStageLayoutUtil", C2188811AlT.LIZIZ(sbLIZ));
        C914770Zud.LIZJ(0L, true);
        C914770Zud.LIZ("match_info", C2097608Jq.LJIIJ(new Pair("match_type", String.valueOf(c981480beE.LJIIIIZZ.getType())), new Pair("competition_id", String.valueOf(c981480beE.LJIIIZ)), new Pair("match_stage", String.valueOf(C973850bRv.LIZ())), new Pair("enlarged_infos", C1516000pYM.LIZJ(Collections.singletonList(C2097608Jq.LJIIIIZZ(new Pair("enlarged_linkmic_id", "-1"), new Pair("enlarged_start_ts", "-1")))))), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0312  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(java.lang.String r40, com.bytedance.ies.sdk.datachannel.DataChannel r41, X.C981480beE r42, boolean r43) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C958040b2Q.LJIIJ(java.lang.String, com.bytedance.ies.sdk.datachannel.DataChannel, X.0beE, boolean):void");
    }

    public static void LJIIJJI(String str, DataChannel dataChannel, C981480beE c981480beE, EnumC958080b2U enumC958080b2U) {
        Object next;
        AbstractC957950b2H abstractC957950b2H;
        InterfaceC954180awC interfaceC954180awCLJIIIZ;
        if (C963580bBM.LIZ()) {
            if (C915980Zwa.LJII().isAnchor() && (enumC958080b2U == EnumC958080b2U.TAKE_STAGE_FINAL_CALL || enumC958080b2U == EnumC958080b2U.TAKE_STAGE_RESULT)) {
                abstractC957950b2H = new AbstractC957950b2H() { // from class: X.0b2G
                    @Override // X.AbstractC957950b2H
                    public final C955270axx LIZ(List<Long> list) {
                        Pair pairLJ = C957830b25.LJ();
                        List listLJIIIIZZ = C957830b25.LJIIIIZZ();
                        String str2 = (String) pairLJ.getSecond();
                        String str3 = (String) pairLJ.getFirst();
                        CohostLayoutExtra cohostLayoutExtra = new CohostLayoutExtra();
                        cohostLayoutExtra.offsetY = 40;
                        cohostLayoutExtra.isZoomLayout = 0;
                        cohostLayoutExtra.scene = 9;
                        return new C955270axx(new C955320ay2(str2, str3, (MultiGuestLayoutExtra) null, C957830b25.LIZ(cohostLayoutExtra), (MultiGuestLayoutNonSeiExtra) null, 48), listLJIIIIZZ, C957830b25.LJIIJ(listLJIIIIZZ));
                    }
                };
            } else {
                abstractC957950b2H = new AbstractC957950b2H() { // from class: X.0b2D
                    @Override // X.AbstractC957950b2H
                    public final C955270axx LIZ(List<Long> list) {
                        Pair pairLJ = C957830b25.LJ();
                        List listLJIIIIZZ = C957830b25.LJIIIIZZ();
                        String str2 = (String) pairLJ.getSecond();
                        String str3 = (String) pairLJ.getFirst();
                        CohostLayoutExtra cohostLayoutExtra = new CohostLayoutExtra();
                        cohostLayoutExtra.offsetY = 0;
                        cohostLayoutExtra.isZoomLayout = 0;
                        cohostLayoutExtra.scene = 9;
                        return new C955270axx(new C955320ay2(str2, str3, (MultiGuestLayoutExtra) null, C957830b25.LIZ(cohostLayoutExtra), (MultiGuestLayoutNonSeiExtra) null, 48), listLJIIIIZZ, C957830b25.LJIIJ(listLJIIIIZZ));
                    }
                };
            }
            if (LinkMicTakeStageLayoutAnimation.isEnable(C950220apo.LJI()) && (interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ()) != null) {
                interfaceC954180awCLJIIIZ.LJJLIIIJJI(EnumC952680atm.DEFAULT, enumC958080b2U.name());
            }
            C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
            if (c955010axXI30 != null) {
                c955010axXI30.LJJI(abstractC957950b2H);
            }
            LJIILIIL(str, c981480beE);
            if (dataChannel != null) {
                dataChannel.zW(TakeStageSwitchTurnEvent.class, new C958090b2V());
                return;
            }
            return;
        }
        boolean zLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchLayoutToNormalMode");
        sbLIZ.append(" source = ");
        sbLIZ.append(str);
        sbLIZ.append(", isCohostNormalLayout=");
        sbLIZ.append(zLIZ);
        C20441214yg.LJIIIZ("TakeStageLayoutUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (zLIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("switchLayoutToNormalMode");
            sbLIZ2.append(" source = ");
            sbLIZ2.append(str);
            sbLIZ2.append(", return by, isCohostNormalLayout=true");
            C20441214yg.LJ("TakeStageLayoutUtil", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ2 == null) {
            return;
        }
        long j = c981480beE.LJFF;
        ArrayList arrayList = new ArrayList(C915980Zwa.LJII().LJJIJ());
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Long l = ((LinkUser) next).userId;
                if (l != null && l.longValue() == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C19719612Di.LJJIIJ(arrayList, new AwS30S0000100_15(j, 11), true);
        ArrayList arrayList2 = new ArrayList(C13LP.LJLLLL(new AComparatorS34S0000000_15(8), arrayList));
        if (next != null) {
            ListProtector.add(arrayList2, 0, next);
        } else {
            C20441214yg.LJ("TakeStageLayoutUtil", "roomOwnerInMap is null");
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("switchLayoutToNormalMode");
        sbLIZ3.append(" source = ");
        sbLIZ3.append(str);
        sbLIZ3.append(": self perform, sdkLinkedList=");
        sbLIZ3.append(arrayList);
        sbLIZ3.append(", newList=");
        sbLIZ3.append(arrayList2);
        sbLIZ3.append(", sdkLinkedMap=");
        sbLIZ3.append(arrayList);
        C20441214yg.LJIIIZ("TakeStageLayoutUtil", C2188811AlT.LIZIZ(sbLIZ3));
        if (LinkMicTakeStageLayoutAnimation.isEnable(C950220apo.LJI())) {
            interfaceC954180awCLJIIIZ2.LJJLIIIJJI(EnumC952680atm.DEFAULT, enumC958080b2U.name());
        }
        interfaceC954180awCLJIIIZ2.LLIIJLIL().LJJJJIZL((String) LIZ.getValue(), false, false, true, false, new AwS37S1400000_15(interfaceC954180awCLJIIIZ2, (InterfaceC954180awC) arrayList2, (List<LinkUser>) str, (String) dataChannel, (DataChannel) c981480beE, (C981480beE) 0));
    }

    public static void LJIIL(String str, C981480beE c981480beE, long j, boolean z) {
        String str2;
        if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(c981480beE.LIZIZ))) {
            return;
        }
        C914770Zud.LIZJ(0L, z);
        C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(j);
        if (c954460aweLLILL == null || (str2 = c954460aweLLILL.LJIIJJI) == null) {
            str2 = "-1";
        }
        String strValueOf = String.valueOf(c981480beE.LJJIJIIJI.LIZIZ);
        long j2 = c981480beE.LJIIJ.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSeiForBigSmallStream");
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        sbLIZ.append(", performUid=");
        sbLIZ.append(j);
        sbLIZ.append(", performLinkmicId=");
        sbLIZ.append(str2);
        sbLIZ.append(", performStartTs=");
        sbLIZ.append(strValueOf);
        sbLIZ.append(" performEndTs:");
        sbLIZ.append(j2);
        C20441214yg.LJIIIZ("TakeStageLayoutUtil", C2188811AlT.LIZIZ(sbLIZ));
        c981480beE.LJJIJIIJI.LJIIIIZZ = j;
        C914770Zud.LIZ("match_info", C2097608Jq.LJIIJ(new Pair("match_type", String.valueOf(c981480beE.LJIIIIZZ.getType())), new Pair("competition_id", String.valueOf(c981480beE.LJIIIZ)), new Pair("match_stage", String.valueOf(C973850bRv.LIZ())), new Pair("enlarged_infos", C1516000pYM.LIZJ(Collections.singletonList(C2097608Jq.LJIIIIZZ(new Pair("enlarged_linkmic_id", str2), new Pair("enlarged_start_ts", strValueOf), new Pair("enlarged_planned_end_ts", Long.valueOf(j2))))))), z);
    }
}
