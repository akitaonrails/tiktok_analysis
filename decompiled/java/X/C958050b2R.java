package X;

import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchLayoutIdConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS46S0000100_2;

/* JADX INFO: renamed from: X.0b2R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958050b2R {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(22));
    public static final long LIZIZ;
    public static final long LIZJ;

    static {
        LiveMatchLayoutIdConfig liveMatchLayoutIdConfig = LiveMatchLayoutIdConfig.INSTANCE;
        LIZIZ = liveMatchLayoutIdConfig.match1vNLayoutId();
        LIZJ = liveMatchLayoutIdConfig.matchNv1LayoutId();
    }

    public static void LIZ(long j, List list) {
        long jLongValue;
        String layoutId;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        List<Long> listLIZLLL;
        InterfaceC958070b2T interfaceC958070b2TLLJJ;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL2;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        InterfaceC958070b2T interfaceC958070b2TLLJJ2;
        if (!C970370bMJ.LJIIIIZZ()) {
            return;
        }
        int i = 0;
        if (C963580bBM.LIZ()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ != null && (interfaceC958070b2TLLJJ2 = interfaceC954180awCLJIIIZ.LLJJ()) != null) {
                interfaceC958070b2TLLJJ2.LJJJJIZL();
            }
            int i2 = 0;
            for (LinkUser linkUser : C915980Zwa.LJII().LJJIJ()) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    Long l = linkUser.userId;
                    if (l != null) {
                        long jLongValue2 = l.longValue();
                        if (list != null && list.contains(Long.valueOf(jLongValue2))) {
                            arrayList.add(Long.valueOf(jLongValue2));
                        } else {
                            arrayList2.add(Long.valueOf(jLongValue2));
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            ArrayList arrayList3 = new ArrayList();
            if (arrayList.size() == 2 && arrayList2.size() == 2) {
                do {
                    arrayList3.add(ListProtector.get(arrayList, i));
                    arrayList3.add(ListProtector.get(arrayList2, i));
                    i++;
                } while (i < 2);
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Long.valueOf(((Number) it2.next()).longValue()));
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Long.valueOf(((Number) it3.next()).longValue()));
                }
            }
            C20441214yg.LIZIZ("MultiMatchLayoutUtil", "switchLayoutIfTeamMatch selfList = " + arrayList + ", rivalList = " + arrayList2 + " finalUserList = " + arrayList3);
            if (arrayList3.isEmpty()) {
                C1AF0.LIZJ("switchLayoutIfTeamMatch, spotList is null");
                C20441214yg.LJ("MultiMatchLayoutUtil", "switchLayoutIfTeamMatch, spotList is null");
                return;
            } else {
                C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
                if (c955010axXI30 != null) {
                    c955010axXI30.LJJII(C957840b26.LIZJ, arrayList3);
                    return;
                }
                return;
            }
        }
        int iLIZJ = C970370bMJ.LIZJ();
        if (iLIZJ != 3 && iLIZJ != 4) {
            if (iLIZJ != 30 && iLIZJ != 40) {
                jLongValue = ((Number) LIZ.getValue()).longValue();
            } else {
                jLongValue = LIZJ;
            }
        } else {
            jLongValue = LIZIZ;
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ2 != null && (interfaceC937900aVwLLIIJLIL2 = interfaceC954180awCLJIIIZ2.LLIIJLIL()) != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL2.LJJJJZ()) != null) {
            layoutId = interfaceC937820aVoLJJJJZ.getLayoutId();
        } else {
            layoutId = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchLayoutTeamMatch, subType = ");
        sbLIZ.append(iLIZJ);
        sbLIZ.append(" targetLayoutId = ");
        sbLIZ.append(jLongValue);
        sbLIZ.append(" currentLayoutId = ");
        sbLIZ.append(layoutId);
        C20441214yg.LIZIZ("MultiMatchLayoutUtil", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("switchLayout callback ---,leftUid = ");
        sbLIZ2.append(j);
        C20441214yg.LIZIZ("MultiMatchLayoutUtil", C2188811AlT.LIZIZ(sbLIZ2));
        if (j > 0) {
            IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null) {
                listLIZLLL = interfaceC973730bRjYf2.LIZLLL();
            } else {
                listLIZLLL = null;
            }
            int i4 = 0;
            for (LinkUser linkUser2 : C915980Zwa.LJII().LJJIJ()) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    LinkUser linkUser3 = linkUser2;
                    Long l2 = linkUser3.userId;
                    if (l2 == null || l2.longValue() != j) {
                        if (listLIZLLL != null && C13LP.LJJJJ(linkUser3.userId, listLIZLLL)) {
                            arrayList4.add(linkUser3);
                        } else {
                            arrayList5.add(linkUser3);
                        }
                    }
                    i4 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (C970370bMJ.LJIIIIZZ()) {
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(it4.next());
                }
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(it5.next());
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("updateLocalLinkedList, self = ");
                sbLIZ3.append(arrayList4);
                sbLIZ3.append(",rival = ");
                sbLIZ3.append(arrayList5);
                sbLIZ3.append(", newList=");
                sbLIZ3.append(arrayList6);
                sbLIZ3.append(", delayTime=1");
                C20441214yg.LJ("MultiMatchLayoutUtil", C2188811AlT.LIZIZ(sbLIZ3));
                InterfaceC954180awC interfaceC954180awCLJIIIZ3 = iMultiHostServiceLJII.LJIIIZ();
                if (interfaceC954180awCLJIIIZ3 != null && (interfaceC958070b2TLLJJ = interfaceC954180awCLJIIIZ3.LLJJ()) != null) {
                    interfaceC958070b2TLLJJ.LJJJJJ(arrayList6, null);
                }
            }
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ4 = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ4 != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ4.LLIIJLIL()) != null) {
            interfaceC937900aVwLLIIJLIL.LJJJJIZL(String.valueOf(jLongValue), false, false, true, false, new AwS46S0000100_2(j, 0));
        }
    }
}
