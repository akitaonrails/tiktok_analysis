package X;

import X.InterfaceC975780bV2;
import android.os.Looper;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostLayoutExtra;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchEndFlashFixSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchLayoutIdConfig;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.MultiGuestLayoutNonSeiExtra;

/* JADX INFO: renamed from: X.0bV4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C975800bV4<T extends InterfaceC975780bV2> extends C976040bVS<T> {
    @Override // X.InterfaceC975690bUt
    public void LIZ(AbstractC1136060ffY abstractC1136060ffY) {
    }

    @InterfaceC1294060jmO
    public static void LJJIFFI() {
        String layoutId;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL2;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<String> listLJIIIZ;
        LinkUser next;
        Long l;
        if (!C963580bBM.LIZ()) {
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ == null || (interfaceC937900aVwLLIIJLIL2 = interfaceC954180awCLJIIIZ.LLIIJLIL()) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL2.LJJJJZ()) == null || (layoutId = interfaceC937820aVoLJJJJZ.getLayoutId()) == null) {
                layoutId = "-1";
            }
            String strLIZ = C954500awi.LIZ(C915980Zwa.LJII());
            if (strLIZ == null || strLIZ.length() == 0) {
                strLIZ = C1ACJ.LIZIZ() ? String.valueOf(LiveMatchLayoutIdConfig.INSTANCE.matchNvNCropLayoutId()) : String.valueOf(LiveMatchLayoutIdConfig.INSTANCE.matchNvNLayoutId());
            }
            if (!LiveMatchEndFlashFixSettings.INSTANCE.getValue() || (!a0.LJJIIZI(layoutId, strLIZ, false) && !a0.LJJIIZI(strLIZ, layoutId, false))) {
                InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
                if (interfaceC954180awCLJIIIZ2 == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ2.LLIIJLIL()) == null) {
                    return;
                }
                interfaceC937900aVwLLIIJLIL.LJJJJIZL(strLIZ, false, false, true, false, AFwS203S0000000_15.get$arr$(330));
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current layoutId is ");
            sbLIZ.append(layoutId);
            sbLIZ.append(",targetId = ");
            sbLIZ.append(strLIZ);
            sbLIZ.append(" , no need to switch");
            C20441214yg.LIZIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (C915980Zwa.LJFF().xB0() != EnumC919170a1j.MATCH_TYPE_2V2) {
            C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
            if (c955010axXI30 != null) {
                c955010axXI30.LJJI(new AbstractC957950b2H() { // from class: X.0b2A
                    @Override // X.AbstractC957950b2H
                    public final C955270axx LIZ(List<Long> list) {
                        List listLJIIIIZZ;
                        Pair pairLJI = C957830b25.LJI();
                        if (C500260Jjc.LJJIJIIJI(list)) {
                            listLJIIIIZZ = C957830b25.LJII(list);
                        } else {
                            listLJIIIIZZ = C957830b25.LJIIIIZZ();
                        }
                        String str = (String) pairLJI.getSecond();
                        String str2 = (String) pairLJI.getFirst();
                        CohostLayoutExtra cohostLayoutExtra = new CohostLayoutExtra();
                        cohostLayoutExtra.offsetY = 0;
                        cohostLayoutExtra.isZoomLayout = 0;
                        cohostLayoutExtra.scene = 5;
                        return new C955270axx(new C955320ay2(str, str2, (MultiGuestLayoutExtra) null, C957830b25.LIZ(cohostLayoutExtra), (MultiGuestLayoutNonSeiExtra) null, 48), listLJIIIIZZ, C957830b25.LJIIJ(listLJIIIIZZ));
                    }
                });
                return;
            }
            return;
        }
        List<LinkUser> listLLLLIILL = C915980Zwa.LJII().LLLLIILL();
        ArrayList arrayList = new ArrayList();
        C955010axX c955010axXI302 = C915980Zwa.LJII().i30();
        if (c955010axXI302 != null && (listLJIIIZ = c955010axXI302.LJIIIZ()) != null) {
            for (String str : listLJIIIZ) {
                Iterator<LinkUser> it2 = listLLLLIILL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.linkMicId, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                LinkUser linkUser = next;
                if (linkUser != null && (l = linkUser.userId) != null) {
                    arrayList.add(l);
                }
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("resetLayoutId finalUserIdList = ");
        sbLIZ2.append(arrayList);
        C20441214yg.LIZIZ("BaseMultiMatchState", C2188811AlT.LIZIZ(sbLIZ2));
        C955010axX c955010axXI303 = C915980Zwa.LJII().i30();
        if (c955010axXI303 != null) {
            c955010axXI303.LJJII(new AbstractC957950b2H() { // from class: X.0b2A
                @Override // X.AbstractC957950b2H
                public final C955270axx LIZ(List<Long> list) {
                    List listLJIIIIZZ;
                    Pair pairLJI = C957830b25.LJI();
                    if (C500260Jjc.LJJIJIIJI(list)) {
                        listLJIIIIZZ = C957830b25.LJII(list);
                    } else {
                        listLJIIIIZZ = C957830b25.LJIIIIZZ();
                    }
                    String str2 = (String) pairLJI.getSecond();
                    String str22 = (String) pairLJI.getFirst();
                    CohostLayoutExtra cohostLayoutExtra = new CohostLayoutExtra();
                    cohostLayoutExtra.offsetY = 0;
                    cohostLayoutExtra.isZoomLayout = 0;
                    cohostLayoutExtra.scene = 5;
                    return new C955270axx(new C955320ay2(str2, str22, (MultiGuestLayoutExtra) null, C957830b25.LIZ(cohostLayoutExtra), (MultiGuestLayoutNonSeiExtra) null, 48), listLJIIIIZZ, C957830b25.LJIIJ(listLJIIIIZZ));
                }
            }, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(X.AbstractC1136060ffY r12) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975800bV4.LJJI(X.0ffY):void");
    }

    @Override // X.InterfaceC975690bUt
    public void b3(Function0<Unit> function0) {
        C20441214yg.LIZIZ("BaseMultiMatchState", "onEndTriggeredExternal");
    }

    @Override // X.InterfaceC975690bUt
    public void h3(String str) {
        EnumC964170bCJ enumC964170bCJY2;
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc == null || (enumC964170bCJY2 = interfaceC975520bUc.Y2()) == null) {
            enumC964170bCJY2 = EnumC964170bCJ.NONE;
        }
        int i = C975760bV0.LIZ[enumC964170bCJY2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C974540bT2.LIZ.LJJJ(EnumC974360bSk.HADREPLY);
                    return;
                }
                return;
            }
            C974540bT2.LIZ.LJJJ(EnumC974360bSk.INVITING);
            return;
        }
        C974540bT2.LIZ.LJJJ(EnumC974360bSk.OPEN_MODE_PANEL);
    }

    @Override // X.InterfaceC975690bUt
    public void i3(C974230bSX c974230bSX) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStartMatchExternal, matchType: ");
        sbLIZ.append(c974230bSX.LIZ);
        C20441214yg.LIZIZ("BaseMultiMatchState", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJJIIJ(C975800bV4 c975800bV4, EnumC975850bV9 enumC975850bV9) {
        c975800bV4.getClass();
        c975800bV4.LJIJ(EnumC964170bCJ.NONE, enumC975850bV9, null, null);
    }

    public static void LJJIIJZLJL(C975800bV4 c975800bV4, EnumC975850bV9 enumC975850bV9) {
        c975800bV4.getClass();
        c975800bV4.LJIJ(EnumC964170bCJ.PREPARING, enumC975850bV9, null, null);
    }

    @Override // X.InterfaceC975690bUt
    public void f3(int i, boolean z) {
        EnumC964170bCJ enumC964170bCJY2;
        boolean z2;
        if (!z) {
            InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
            if (interfaceC975520bUc == null || (enumC964170bCJY2 = interfaceC975520bUc.Y2()) == null) {
                enumC964170bCJY2 = EnumC964170bCJ.NONE;
            }
            InterfaceC977310bXV interfaceC977310bXV = this.LIZJ;
            if (interfaceC977310bXV != null) {
                String value = EnumC973640bRa.PK_GUIDE.getValue();
                boolean z3 = true;
                if (C915980Zwa.LJII().LLILZLL(true).size() == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (enumC964170bCJY2 != EnumC964170bCJ.NONE && enumC964170bCJY2 != EnumC964170bCJ.PREPARING) {
                    z3 = false;
                }
                interfaceC977310bXV.LIZ(value, z2, z3);
            }
        }
    }

    public /* synthetic */ C975800bV4(EnumC964170bCJ enumC964170bCJ, InterfaceC975520bUc interfaceC975520bUc, InterfaceC977310bXV interfaceC977310bXV, LinkMicBattleMessage linkMicBattleMessage) {
        this(enumC964170bCJ, interfaceC975520bUc, interfaceC977310bXV, linkMicBattleMessage, null);
    }

    public static void LJJII(C975800bV4 c975800bV4, BattleInfoResponse battleInfoResponse, EnumC975850bV9 enumC975850bV9, int i) {
        if ((i & 2) != 0) {
            battleInfoResponse = null;
        }
        c975800bV4.getClass();
        c975800bV4.LJIJ(EnumC964170bCJ.MATCH_END, enumC975850bV9, null, battleInfoResponse);
    }

    public static void LJJIII(C975800bV4 c975800bV4, LinkMicBattleMessage linkMicBattleMessage, EnumC975850bV9 enumC975850bV9, int i) {
        if ((i & 1) != 0) {
            linkMicBattleMessage = null;
        }
        c975800bV4.getClass();
        c975800bV4.LJIJ(EnumC964170bCJ.INVITED, enumC975850bV9, linkMicBattleMessage, null);
    }

    public C975800bV4(EnumC964170bCJ enumC964170bCJ, InterfaceC975520bUc interfaceC975520bUc, InterfaceC977310bXV interfaceC977310bXV, LinkMicBattleMessage linkMicBattleMessage, EnumC975850bV9 enumC975850bV9) {
        super(enumC964170bCJ, interfaceC975520bUc, interfaceC977310bXV, linkMicBattleMessage, enumC975850bV9);
        new BPEAHandler(Looper.getMainLooper());
    }

    public static void LJJIIZ(C975800bV4 c975800bV4, LinkMicBattleMessage linkMicBattleMessage, BattleInfoResponse battleInfoResponse, EnumC975850bV9 enumC975850bV9, int i) {
        if ((i & 1) != 0) {
            linkMicBattleMessage = null;
        }
        if ((i & 2) != 0) {
            battleInfoResponse = null;
        }
        c975800bV4.getClass();
        c975800bV4.LJIJ(EnumC964170bCJ.SETTLE_START, enumC975850bV9, linkMicBattleMessage, battleInfoResponse);
    }

    public static void LJJIIZI(C975800bV4 c975800bV4, LinkMicBattleMessage linkMicBattleMessage, BattleInfoResponse battleInfoResponse, EnumC975850bV9 enumC975850bV9, int i) {
        if ((i & 1) != 0) {
            linkMicBattleMessage = null;
        }
        if ((i & 2) != 0) {
            battleInfoResponse = null;
        }
        c975800bV4.getClass();
        c975800bV4.LJIJ(EnumC964170bCJ.MATCH_START, enumC975850bV9, linkMicBattleMessage, battleInfoResponse);
    }
}
