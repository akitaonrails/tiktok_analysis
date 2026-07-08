package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.im.common.model.SharePanelItemInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0lfm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366840lfm implements InterfaceC1366150lef {
    public final InterfaceC1366120lec LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(512));

    public final Keva LJ() {
        return (Keva) this.LLILLJJLI.getValue();
    }

    public C1366840lfm(C1382360m4o c1382360m4o) {
        this.LL = c1382360m4o;
    }

    @Override // X.InterfaceC1366150lef
    public final List<SharePanelItemInfo> LIZ(String str) {
        boolean z;
        Long lValueOf;
        Long lValueOf2;
        boolean z2;
        IMUser iMUserLJIIJJI;
        ArrayList arrayList = new ArrayList();
        try {
            C844470XAv.LIZ.getClass();
            InterfaceC805460Vii interfaceC805460ViiLIZ = C797560VQk.LIZIZ(C844470XAv.LIZ()).LIZ();
            List<C796400VLy> listLIZLLL = LIZLLL(interfaceC805460ViiLIZ, interfaceC805460ViiLIZ.LJIIJ(C461720I8s.LIZIZ()));
            List<C0Y8T> listLIZIZ = this.LL.LIZIZ();
            C1367000lg2.LIZ.getClass();
            boolean zLIZ = C1367000lg2.LIZ();
            boolean z3 = true;
            boolean z4 = false;
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_im_share_panel_usability_improvement", true) != 0) {
                z = true;
            } else {
                z = false;
            }
            for (C796400VLy c796400VLy : listLIZLLL) {
                Iterator<C0Y8T> it2 = listLIZIZ.iterator();
                int value = -1;
                while (true) {
                    lValueOf = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    C0Y8T next = it2.next();
                    if (Intrinsics.LJFF(c796400VLy.LIZIZ, next.getConversationId())) {
                        value = EnumC1473605pm.SHARE_PANEL_ID_TYPE_GROUP.getValue();
                    } else {
                        String conversationId = next.getConversationId();
                        if (conversationId != null && a0.LJJIIZI(conversationId, c796400VLy.LIZIZ, z4) == z3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            IIMContactUtilService.LIZ.getClass();
                            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
                            if (iIMContactUtilServiceLIZ != null) {
                                iMUserLJIIJJI = iIMContactUtilServiceLIZ.LJIIJJI(next);
                            } else {
                                iMUserLJIIJJI = null;
                            }
                            if (iMUserLJIIJJI == null) {
                                break;
                            }
                            if (z) {
                                if (zLIZ || !iMUserLJIIJJI.getInfo().LIZIZ) {
                                    value = EnumC1473605pm.SHARE_PANEL_ID_TYPE_USER.getValue();
                                }
                            } else {
                                value = EnumC1473605pm.SHARE_PANEL_ID_TYPE_USER.getValue();
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (value != -1) {
                    int value2 = EnumC1366980lg0.SHARE_PANEL_ITEM_TYPE_RESENT_SEND_TO.getValue();
                    if (value == EnumC1473605pm.SHARE_PANEL_ID_TYPE_USER.getValue()) {
                        lValueOf2 = Long.valueOf(CastLongProtector.parseLong(c796400VLy.LIZIZ));
                    } else {
                        lValueOf2 = null;
                    }
                    if (value == EnumC1473605pm.SHARE_PANEL_ID_TYPE_GROUP.getValue()) {
                        lValueOf = Long.valueOf(CastLongProtector.parseLong(c796400VLy.LIZIZ));
                    }
                    arrayList.add(new SharePanelItemInfo(value, value2, "recent send to", lValueOf2, lValueOf, null, Long.valueOf(c796400VLy.LJ / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), null));
                    z3 = true;
                    z4 = false;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return arrayList;
    }

    @Override // X.InterfaceC1366150lef
    public final List<SharePanelItemInfo> LIZJ(String str) {
        ArrayList arrayList = new ArrayList(this.LL.LIZIZ());
        C08XD.LJJ(arrayList, new Comparator() { // from class: X.0Yjs
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                long sortOrder = ((C0Y8T) obj2).getSortOrder() - ((C0Y8T) obj).getSortOrder();
                if (sortOrder > 0) {
                    return 1;
                }
                if (sortOrder < 0) {
                    return -1;
                }
                return 0;
            }
        });
        return C09RB.LJJIII(new C08LY(C09RB.LJJI(C09RB.LJIIIZ(new C1939607ik(arrayList), AFwS248S0000000_14.get$arr$(459)), 100), AFwS259S0000000_21.get$arr$(382)));
    }

    public static String LIZIZ(String str, String str2) {
        if (str2.length() != 0 && !Intrinsics.LJFF(str2, "default")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append('_');
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static List LIZLLL(InterfaceC805460Vii interfaceC805460Vii, List list) {
        C796400VLy c796400VLy;
        C1367000lg2.LIZ.getClass();
        int i = 0;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_im_share_panel_usability_improvement", true) != 0) {
            ArrayList arrayList = new ArrayList(list);
            if (arrayList.size() > C1367000lg2.LIZJ()) {
                while ((!arrayList.isEmpty()) && (c796400VLy = (C796400VLy) C13LP.LJJLIIIJL(arrayList)) != null) {
                    long j = c796400VLy.LJ;
                    C1367000lg2.LIZ.getClass();
                    if (j >= C1367000lg2.LIZIZ()) {
                        break;
                    }
                    interfaceC805460Vii.LJ(C461720I8s.LIZIZ(), c796400VLy.LIZ);
                    C19719612Di.LJJIJIIJI(arrayList);
                    i++;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("filterByUsabilityImprovementExperiment expired=");
                sbLIZ.append(i);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            return arrayList;
        }
        return list;
    }

    public final List LJFF(int i, String str) {
        String string;
        boolean z;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        if (i == EnumC1364450lbv.SOURCE_ACTION_MINIS_PANEL.getValue()) {
            Keva kevaLJ = LJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("internal_share_sort_new_");
            sbLIZ.append(i);
            sbLIZ.append("+_");
            sbLIZ.append(curUserId);
            string = kevaLJ.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("internal_share_sort_new");
            sbLIZ2.append(curUserId);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            string = LJ().getString(LIZIZ(strLIZIZ, str), "");
            if (string.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                string = null;
            }
            if (string == null) {
                string = LJ().getString(strLIZIZ, "");
            }
        }
        if (C866950Xzh.LIZ(string)) {
            try {
                List list = (List) C051M.LIZJ(C2093608Ic.LIZ(string, new Boolean[0]), new TypeToken<List<? extends SharePanelItemInfo>>() { // from class: X.04Yl
                }.getType());
                if (list != null) {
                    return new ArrayList(list);
                }
                return new ArrayList();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return new ArrayList();
            }
        }
        return new ArrayList();
    }

    public static String LJII(int i, String str, String str2) {
        String strLIZIZ;
        if (i == EnumC1364450lbv.SOURCE_ACTION_MINIS_PANEL.getValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('_');
            sbLIZ.append(i);
            sbLIZ.append("+_");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("internal_share_sort_new");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(str2);
        sbLIZ2.append("_net_write_ts");
        return LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(int r21, java.lang.String r22, X.InterfaceC1364105Vn r23) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1366840lfm.LJI(int, java.lang.String, X.05Vn):java.lang.Object");
    }
}
