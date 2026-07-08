package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.share.QuickShareCandidate;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.common.model.Flag;
import com.ss.android.ugc.aweme.im.common.model.SharePanelItemInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.service.IAuthorSupporterHelper;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tako.ITakoService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0lfl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@InterfaceC1294060jmO
public final class C1366830lfl implements InterfaceC883330Yl1 {
    public static final C1366830lfl LL;
    public static C1368260li4 LLILLJJLI;
    public static C1368260li4 LLILLL;
    public static List<SharePanelItemInfo> LLILZ;
    public static List<SharePanelItemInfo> LLILZIL;
    public static List<SharePanelItemInfo> LLILZLL;
    public static List<? extends IMContact> LLIZ;
    public static List<IMUser> LLIZLLLIL;
    public static final ConcurrentHashMap<String, C0Y8T> LLJ;
    public static CopyOnWriteArrayList<String> LLJI;
    public static List<SharePanelItemInfo> LLJIJIL;
    public static List<String> LLJILJIL;
    public static final C01GW LLJILJILJ;
    public static boolean LLJILLL;
    public static long LLJJ;
    public static SharePanelItemInfo LLJJI;
    public static final C01GW LLJJIII;
    public static final C1382370m4p LLJJIJI;
    public static volatile boolean LLJJIJIIJIL;
    public static final C01GW LLJJIJIL;
    public static final C01GW LLJJJ;

    static {
        C1366830lfl c1366830lfl = new C1366830lfl();
        LL = c1366830lfl;
        InterfaceC866830XzV interfaceC866830XzV = new InterfaceC866830XzV() { // from class: X.0lfk
            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJLJLI(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJLL(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJZZI(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJLI(String str, List<C0YAE> list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJLILLLLZI(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJLL(C1711306n1 c1711306n1) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LLIIII(int i, String str) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LLIILZL(int i, String str, List list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final int LLLIIII() {
                return 0;
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC867280Y0o
            public final void LLLIZZ(Map<String, C0Y8T> map) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJJJJL(C0Y8T c0y8t) {
                C1366830lfl c1366830lfl2 = C1366830lfl.LL;
                C1366830lfl.LJIJJLI(c0y8t);
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJLIIIJ(C0Y8T c0y8t) {
                if (c0y8t != null && c0y8t.getConversationId() != null) {
                    C1366830lfl.LLJ.remove(c0y8t.getConversationId());
                }
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJZI(C0Y8T c0y8t) {
                C1366830lfl c1366830lfl2 = C1366830lfl.LL;
                C1366830lfl.LJIJJLI(c0y8t);
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJLJI(int i, C0Y8T c0y8t) {
                C1366830lfl c1366830lfl2 = C1366830lfl.LL;
                C1366830lfl.LJIJJLI(c0y8t);
            }
        };
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        C883250Ykt.LIZIZ(c1366830lfl);
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJI(interfaceC866830XzV);
        LLILLJJLI = new C1368260li4(0, false);
        LLILZ = new ArrayList();
        LLIZLLLIL = new ArrayList();
        LLJ = new ConcurrentHashMap<>();
        LLJI = new CopyOnWriteArrayList<>();
        LLJILJILJ = C452501pT.LIZIZ(new C15503065d());
        LLJILLL = true;
        LLJJIII = C452501pT.LIZIZ(new C1367020lg4());
        LLJJIJI = new C1382370m4p();
        LLJJIJIL = C452501pT.LIZIZ(new C1367030lg5());
        LLJJJ = C452501pT.LIZIZ(new C15501065b());
    }

    public static void LIZIZ() {
        List<SharePanelItemInfo> arrayList;
        if (C866950Xzh.LIZIZ(LLILZIL)) {
            return;
        }
        Keva keva = (Keva) LLJJJ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("internal_share_last_share_");
        sbLIZ.append(C461720I8s.LIZIZ());
        String string = keva.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        if (C866950Xzh.LIZ(string)) {
            try {
                arrayList = (List) C051M.LIZJ(C2093608Ic.LIZ(string, new Boolean[0]), new TypeToken<List<? extends SharePanelItemInfo>>() { // from class: X.0lg3
                }.getType());
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                arrayList = new ArrayList<>();
            }
            LLILZIL = arrayList;
        }
    }

    public static List LJIIIIZZ() {
        List<? extends IMContact> list = LLIZ;
        return list == null ? C13BV.INSTANCE : list;
    }

    public static final Keva LJIIIZ() {
        return (Keva) LLJJIJIL.getValue();
    }

    public static List LJIIL() {
        Collection arrayList;
        if (((Boolean) C0AL1.LIZ.getValue()).booleanValue()) {
            LIZIZ();
            List<SharePanelItemInfo> list = LLILZIL;
            return list == null ? C13BV.INSTANCE : list;
        }
        if (!C866950Xzh.LIZIZ(LLILZLL)) {
            Keva keva = (Keva) LLJJJ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("internal_share_stacked_item_");
            sbLIZ.append(C461720I8s.LIZIZ());
            String string = keva.getString(C2188811AlT.LIZIZ(sbLIZ), "");
            if (C866950Xzh.LIZ(string)) {
                try {
                    arrayList = (List) C051M.LIZJ(C2093608Ic.LIZ(string, new Boolean[0]), new TypeToken<List<? extends SharePanelItemInfo>>() { // from class: X.04Yj
                    }.getType());
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    arrayList = new ArrayList();
                }
                LLILZLL = new ArrayList(arrayList);
            }
        }
        List<SharePanelItemInfo> list2 = LLILZLL;
        return list2 == null ? C13BV.INSTANCE : list2;
    }

    public static final void LJIJ() {
        if (!C289820BXo.LIZ()) {
            LJIILLIIL(null, EnumC1364450lbv.SOURCE_ACTION_COLD_BOOT.getValue(), null);
        } else {
            if (LLJJIJIIJIL || LLJJIJI.LL == null) {
                return;
            }
            LLJJIJIIJIL = true;
            LJIILLIIL(null, EnumC1364450lbv.SOURCE_ACTION_COLD_BOOT.getValue(), null);
        }
    }

    public static List LJI(List list) {
        int i;
        C796400VLy c796400VLy;
        C1367000lg2.LIZ.getClass();
        int i2 = 0;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_im_share_panel_usability_improvement", true) != 0) {
            C844470XAv.LIZ.getClass();
            InterfaceC805460Vii interfaceC805460ViiLIZ = C797560VQk.LIZIZ(C844470XAv.LIZ()).LIZ();
            ArrayList arrayList = new ArrayList(list);
            int iLIZJ = C1367000lg2.LIZJ();
            int size = arrayList.size();
            SharePanelItemInfo sharePanelItemInfo = LLJJI;
            if (sharePanelItemInfo != null && sharePanelItemInfo.itemType == EnumC1366980lg0.SHARE_PANEL_ITEM_TYPE_RESENT_SEND_TO.getValue()) {
                i = 1;
            } else {
                i = 0;
            }
            if (size + i > iLIZJ) {
                while ((!arrayList.isEmpty()) && (c796400VLy = (C796400VLy) C13LP.LJJLIIIJL(arrayList)) != null) {
                    long j = c796400VLy.LJ;
                    C1367000lg2.LIZ.getClass();
                    if (j >= C1367000lg2.LIZIZ()) {
                        break;
                    }
                    interfaceC805460ViiLIZ.LJ(C461720I8s.LIZIZ(), c796400VLy.LIZ);
                    C19719612Di.LJJIJIIJI(arrayList);
                    i2++;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("filterByUsabilityImprovementExperiment expired=");
                sbLIZ.append(i2);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            return arrayList;
        }
        return list;
    }

    public static List LJIILJJIL(List list) {
        List<SharePanelItemInfo> listLLIIII;
        IMConversation iMConversationLJII;
        List<SharePanelItemInfo> list2 = LLJIJIL;
        if (list2 != null && (listLLIIII = C13LP.LLIIII(list2)) != null && !listLLIIII.isEmpty()) {
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                QuickShareCandidate quickShareCandidate = (QuickShareCandidate) it2.next();
                for (SharePanelItemInfo sharePanelItemInfo : listLLIIII) {
                    if (sharePanelItemInfo.idType == quickShareCandidate.type && (Intrinsics.LJFF(String.valueOf(sharePanelItemInfo.uid), quickShareCandidate.candidateId) || Intrinsics.LJFF(String.valueOf(sharePanelItemInfo.gid), quickShareCandidate.candidateId))) {
                        if (quickShareCandidate.type == 0) {
                            Iterator<IMUser> it3 = LLIZLLLIL.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    IMUser next = it3.next();
                                    if (Intrinsics.LJFF(next.getUid(), quickShareCandidate.candidateId)) {
                                        if (next != null) {
                                            c13dvLIZIZ.add(next);
                                        }
                                    }
                                }
                            }
                        } else {
                            C0Y8T c0y8t = LLJ.get(quickShareCandidate.candidateId);
                            if (c0y8t != null) {
                                IIMContactUtilService.LIZ.getClass();
                                IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
                                if (iIMContactUtilServiceLIZ != null && (iMConversationLJII = iIMContactUtilServiceLIZ.LJII(c0y8t)) != null) {
                                    c13dvLIZIZ.add(iMConversationLJII);
                                }
                            }
                        }
                    }
                }
            }
            return C1697820uHc.LIZ(c13dvLIZIZ);
        }
        return C13BV.INSTANCE;
    }

    public static void LJIJJ(List list) {
        if (LLILLJJLI.LJIILL) {
            return;
        }
        ArrayList arrayList = (ArrayList) list;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            String strLIZ = C1055660dZs.LIZ((IMContact) next);
            LL.getClass();
            if (Intrinsics.LJFF(strLIZ, C461720I8s.LIZIZ())) {
                if (next != null) {
                    return;
                }
            }
        }
        if (arrayList.size() >= 60 || arrayList.size() >= LLILLJJLI.LJJIFFI) {
            C19719612Di.LJJIJIIJI(list);
        }
        C2201941BFw c2201941BFw = IMUser.Companion;
        User userLIZLLL = C461720I8s.LIZLLL();
        c2201941BFw.getClass();
        IMUser iMUserLIZJ = C2201941BFw.LIZJ(userLIZLLL);
        if (iMUserLIZJ != null) {
            C1367140lgG c1367140lgGLIZ = C1367140lgG.LIZ(iMUserLIZJ.getInfo(), EnumC1381990m4D.SERVER, false, C1367080lgA.LIZ, C1367070lg9.LIZ, null, false, null, 114);
            iMUserLIZJ.setShareRelationType("following");
            iMUserLIZJ.setInfo(c1367140lgGLIZ);
            arrayList.add(iMUserLIZJ);
        }
    }

    public static final void LJIJJLI(C0Y8T c0y8t) {
        if (c0y8t != null && c0y8t.getConversationId() != null && c0y8t.isGroupChat()) {
            LLJ.put(c0y8t.getConversationId(), c0y8t);
        }
    }

    public static void LJIL(List list) {
        EnumC1473605pm enumC1473605pm;
        Long lValueOf;
        if (list == null) {
            return;
        }
        List listLJJJJLI = C13LP.LJJJJLI(list);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
        for (IMContact iMContact : (ArrayList) listLJJJJLI) {
            boolean z = iMContact instanceof IMUser;
            if (z) {
                enumC1473605pm = EnumC1473605pm.SHARE_PANEL_ID_TYPE_USER;
            } else {
                enumC1473605pm = EnumC1473605pm.SHARE_PANEL_ID_TYPE_GROUP;
            }
            int value = enumC1473605pm.getValue();
            int value2 = EnumC1366980lg0.SHARE_PANEL_ITEM_TYPE_CLIENT_LAST_SHARE.getValue();
            Long lValueOf2 = null;
            if (z) {
                lValueOf = Long.valueOf(C866950Xzh.LIZLLL(iMContact.getUid()));
            } else {
                lValueOf = null;
            }
            if (iMContact instanceof IMConversation) {
                lValueOf2 = Long.valueOf(C866950Xzh.LIZLLL(((IMConversation) iMContact).getConversationId()));
            }
            arrayList.add(new SharePanelItemInfo(value, value2, "last multi share", lValueOf, lValueOf2, null, Long.valueOf(System.currentTimeMillis()), null));
        }
        LLILZIL = arrayList;
        String strLIZIZ = C2093608Ic.LIZIZ(C051M.LJ(arrayList, false));
        Keva keva = (Keva) LLJJJ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("internal_share_last_share_");
        sbLIZ.append(C461720I8s.LIZIZ());
        keva.storeString(C2188811AlT.LIZIZ(sbLIZ), strLIZIZ);
    }

    public final List<SharePanelItemInfo> LJIIJ(int i) {
        String strLIZIZ;
        ArrayList arrayList;
        List<SharePanelItemInfo> list = LLILZ;
        if (C866950Xzh.LIZIZ(list)) {
            return list;
        }
        if (i != EnumC1364450lbv.SOURCE_ACTION_MINIS_PANEL.getValue()) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('_');
            sbLIZ.append(i);
            sbLIZ.append("+_");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        Keva kevaLJIIIZ = LJIIIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("internal_share_sort_new");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(C461720I8s.LIZIZ());
        String string = kevaLJIIIZ.getString(C2188811AlT.LIZIZ(sbLIZ2), "");
        if (C866950Xzh.LIZ(string)) {
            try {
                List list2 = (List) C051M.LIZJ(C2093608Ic.LIZ(string, new Boolean[0]), new TypeToken<List<? extends SharePanelItemInfo>>() { // from class: X.0leN
                }.getType());
                if (list2 != null) {
                    arrayList = new ArrayList(list2);
                } else {
                    arrayList = new ArrayList();
                }
                LLILZ = arrayList;
                return arrayList;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return new ArrayList();
            }
        }
        Keva kevaLJIIIZ2 = LJIIIZ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("internal_share_sort_");
        sbLIZ3.append(C461720I8s.LIZIZ());
        C089E c089e = new C089E(kevaLJIIIZ2.getStringArray(C2188811AlT.LIZIZ(sbLIZ3), new String[0]));
        while (c089e.hasNext()) {
            Object objLIZIZ = C051M.LIZIZ(SharePanelItemInfo.class, C2093608Ic.LIZ((String) c089e.next(), new Boolean[0]));
            if (objLIZIZ != null) {
                list.add((SharePanelItemInfo) objLIZIZ);
            }
        }
        LLILZ = list;
        return list;
    }

    public static void LIZ(List list, SharePanelItemInfo sharePanelItemInfo) {
        int iLJFF = C1697810uHb.LJFF(list, sharePanelItemInfo, new Comparator() { // from class: X.0lg1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                long jLongValue;
                SharePanelItemInfo sharePanelItemInfo2 = (SharePanelItemInfo) obj;
                Long l = ((SharePanelItemInfo) obj2).timestamp;
                if (l != null) {
                    long jLongValue2 = l.longValue();
                    Long l2 = sharePanelItemInfo2.timestamp;
                    if (l2 != null) {
                        jLongValue = l2.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    return Intrinsics.LJII(jLongValue2, jLongValue);
                }
                return 1;
            }
        }, 0, list.size());
        if (iLJFF < 0) {
            ListProtector.add(list, (-iLJFF) - 1, sharePanelItemInfo);
        } else {
            ListProtector.add(list, iLJFF, sharePanelItemInfo);
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [X.0m4G] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.0m4G] */
    public static List LJJIFFI(InterfaceC1366180lei interfaceC1366180lei, boolean z) {
        ArrayList arrayList;
        C1366860lfo c1366860lfo;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String string;
        String uid;
        ArrayList arrayList4;
        IMContact iMContactLJII;
        C0Y8T c0y8t;
        IMContact iMContactLJII2;
        List<Flag> list;
        Flag next;
        String str;
        IMUser iMUser;
        C0Y8T c0y8t2;
        C1363660lae c1363660laeLJIJI;
        String string2;
        if (interfaceC1366180lei != null) {
            interfaceC1366180lei.LIZIZ("start_filter_data");
        }
        List<SharePanelItemInfo> list2 = LLJIJIL;
        if (list2 != null && !list2.isEmpty()) {
            if (LLILLJJLI.LJJIJIIJIL && !z) {
                c1366860lfo = new C1366860lfo();
                c1366860lfo.LIZ = list2.size();
                c1366860lfo.LJIIIIZZ = LLILLJJLI.LJJIFFI;
            } else {
                c1366860lfo = null;
            }
            List<IMUser> list3 = LLIZLLLIL;
            int i = 16;
            if (list3 == null) {
                arrayList3 = new ArrayList();
            } else {
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                for (IMUser iMUser2 : list3) {
                    IMUser iMUser3 = iMUser2;
                    if (iMUser3 == null || (uid = iMUser3.getUid()) == null) {
                        uid = "";
                    }
                    if (hashSet.add(uid)) {
                        arrayList5.add(iMUser2);
                    }
                }
                if (c1366860lfo != null) {
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                    for (SharePanelItemInfo sharePanelItemInfo : list2) {
                        Long l = sharePanelItemInfo.uid;
                        if (l == null || (string = l.toString()) == null) {
                            string = "";
                        }
                        Pair pair = new Pair(string, sharePanelItemInfo.sortReason);
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    arrayList2 = new ArrayList();
                    for (Object obj : arrayList5) {
                        IMUser iMUser4 = (IMUser) obj;
                        C1382010m4F c1382010m4F = C1382010m4F.LIZ;
                        C1368260li4 c1368260li4 = LLILLJJLI;
                        String str2 = (String) linkedHashMap.get(iMUser4.getUid());
                        c1382010m4F.getClass();
                        if (C1382010m4F.LIZIZ(iMUser4, c1368260li4, c1366860lfo, str2)) {
                            arrayList2.add(obj);
                        }
                    }
                } else {
                    C1381900m44 c1381900m44 = new C1381900m44(LLILLJJLI);
                    arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList5) {
                        if (c1381900m44.LIZ((IMUser) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                }
                arrayList3 = new ArrayList(arrayList2);
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (((BaseContact) obj3).getUid() != null) {
                    arrayList6.add(obj3);
                }
            }
            if (c1366860lfo != null) {
                int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
                if (iLIZIZ2 < 16) {
                    iLIZIZ2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ2);
                for (SharePanelItemInfo sharePanelItemInfo2 : list2) {
                    Long l2 = sharePanelItemInfo2.gid;
                    if (l2 == null || (string2 = l2.toString()) == null) {
                        string2 = "";
                    }
                    Pair pair2 = new Pair(string2, sharePanelItemInfo2.sortReason);
                    linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
                }
                Collection<C0Y8T> collectionValues = LLJ.values();
                arrayList4 = new ArrayList();
                for (Object obj4 : collectionValues) {
                    C0Y8T c0y8t3 = (C0Y8T) obj4;
                    C1382010m4F c1382010m4F2 = C1382010m4F.LIZ;
                    C1368260li4 c1368260li42 = LLILLJJLI;
                    String str3 = (String) linkedHashMap2.get(c0y8t3.getConversationId());
                    c1382010m4F2.getClass();
                    if (C1382010m4F.LIZ(c0y8t3, c1368260li42, c1366860lfo, str3)) {
                        arrayList4.add(obj4);
                    }
                }
            } else {
                final C1368260li4 c1368260li43 = LLILLJJLI;
                ?? r6 = new AbstractC1382150m4T<C0Y8T>(c1368260li43) { // from class: X.0m4G
                    public static final /* synthetic */ int LIZIZ = 0;

                    public final boolean LIZ(C0Y8T c0y8t4) {
                        Integer num;
                        if (c0y8t4 == null) {
                            return false;
                        }
                        if (C1336205Ku.LIZ(false).getBulletinBoardService().f0(c0y8t4.getConversationId())) {
                            C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t4, 1240), false);
                            return false;
                        }
                        if (c0y8t4.isGroupChat()) {
                            C0ZFW c0zfw = C0ZFW.LIZ;
                            if (!this.LIZ.LJIIL && c0zfw != null && c0zfw.LJIIIZ(c0y8t4)) {
                                if (this.LIZ.LJJ && !C0ZNY.LIZ.LIZLLL(c0y8t4.getConversationId(), true)) {
                                    C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t4, 1242), false);
                                    return false;
                                }
                            } else {
                                C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t4, 1241), false);
                                return false;
                            }
                        }
                        if (((IAuthorSupporterHelper) ServiceManager.get().getService(IAuthorSupporterHelper.class)).LJ(c0y8t4)) {
                            C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t4, 1243), false);
                            return false;
                        }
                        if (c0y8t4.getLastShowMessage() == null) {
                            C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t4, 1244), false);
                            return false;
                        }
                        if (c0y8t4.getMemberCount() == 0) {
                            C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t4, 1245), false);
                            return false;
                        }
                        if (c0y8t4.getInboxType() == 5 && c0y8t4.getConversationTags().contains("_remix_")) {
                            C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t4, 1246), false);
                            return false;
                        }
                        Function1<? super List<String>, ? extends Map<String, Integer>> function1 = this.LIZ.LJIILJJIL;
                        if (function1 == null) {
                            return true;
                        }
                        String conversationId = c0y8t4.getConversationId();
                        if (conversationId == null || (num = function1.invoke(Collections.singletonList(conversationId)).get(conversationId)) == null || num.intValue() != 1) {
                            return false;
                        }
                        return true;
                    }
                };
                Collection<C0Y8T> collectionValues2 = LLJ.values();
                arrayList4 = new ArrayList();
                for (Object obj5 : collectionValues2) {
                    if (r6.LIZ((C0Y8T) obj5)) {
                        arrayList4.add(obj5);
                    }
                }
            }
            ArrayList arrayList7 = new ArrayList();
            for (Object obj6 : arrayList4) {
                if (((C0Y8T) obj6).getConversationId() != null) {
                    arrayList7.add(obj6);
                }
            }
            arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            ArrayList arrayList8 = new ArrayList();
            int iLIZIZ3 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList6, 10));
            if (iLIZIZ3 < 16) {
                iLIZIZ3 = 16;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(iLIZIZ3);
            for (Object obj7 : arrayList6) {
                linkedHashMap3.put(String.valueOf(((BaseContact) obj7).getUid()), obj7);
            }
            int iLIZIZ4 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList7, 10));
            if (iLIZIZ4 >= 16) {
                i = iLIZIZ4;
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(i);
            for (Object obj8 : arrayList7) {
                linkedHashMap4.put(((C0Y8T) obj8).getConversationId(), obj8);
            }
            List<? extends IMContact> list4 = LLILLJJLI.LJJIII;
            if (list4 != null) {
                C1381900m44 c1381900m442 = new C1381900m44(LLILLJJLI);
                final C1368260li4 c1368260li44 = LLILLJJLI;
                ?? r2 = new AbstractC1382150m4T<C0Y8T>(c1368260li44) { // from class: X.0m4G
                    public static final /* synthetic */ int LIZIZ = 0;

                    public final boolean LIZ(C0Y8T c0y8t4) {
                        Integer num;
                        if (c0y8t4 == null) {
                            return false;
                        }
                        if (C1336205Ku.LIZ(false).getBulletinBoardService().f0(c0y8t4.getConversationId())) {
                            C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t4, 1240), false);
                            return false;
                        }
                        if (c0y8t4.isGroupChat()) {
                            C0ZFW c0zfw = C0ZFW.LIZ;
                            if (!this.LIZ.LJIIL && c0zfw != null && c0zfw.LJIIIZ(c0y8t4)) {
                                if (this.LIZ.LJJ && !C0ZNY.LIZ.LIZLLL(c0y8t4.getConversationId(), true)) {
                                    C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t4, 1242), false);
                                    return false;
                                }
                            } else {
                                C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t4, 1241), false);
                                return false;
                            }
                        }
                        if (((IAuthorSupporterHelper) ServiceManager.get().getService(IAuthorSupporterHelper.class)).LJ(c0y8t4)) {
                            C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t4, 1243), false);
                            return false;
                        }
                        if (c0y8t4.getLastShowMessage() == null) {
                            C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t4, 1244), false);
                            return false;
                        }
                        if (c0y8t4.getMemberCount() == 0) {
                            C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t4, 1245), false);
                            return false;
                        }
                        if (c0y8t4.getInboxType() == 5 && c0y8t4.getConversationTags().contains("_remix_")) {
                            C1720006oQ.LIZLLL(new AwS565S0100000_21(c0y8t4, 1246), false);
                            return false;
                        }
                        Function1<? super List<String>, ? extends Map<String, Integer>> function1 = this.LIZ.LJIILJJIL;
                        if (function1 == null) {
                            return true;
                        }
                        String conversationId = c0y8t4.getConversationId();
                        if (conversationId == null || (num = function1.invoke(Collections.singletonList(conversationId)).get(conversationId)) == null || num.intValue() != 1) {
                            return false;
                        }
                        return true;
                    }
                };
                for (IMContact iMContact : list4) {
                    if (arrayList.size() >= LLILLJJLI.LJJIFFI) {
                        break;
                    }
                    if (iMContact instanceof IMUser) {
                        if (c1381900m442.LIZ((IMUser) iMContact)) {
                            String uid2 = iMContact.getUid();
                            if (uid2 == null) {
                                uid2 = "";
                            }
                            linkedHashSet.add(uid2);
                            arrayList.add(iMContact);
                        }
                    } else if (iMContact instanceof IMConversation) {
                        IMConversation iMConversation = (IMConversation) iMContact;
                        if (r2.LIZ(LLJ.get(iMConversation.getConversationId()))) {
                            String conversationId = iMConversation.getConversationId();
                            if (conversationId == null) {
                                conversationId = "";
                            }
                            linkedHashSet2.add(conversationId);
                            arrayList.add(iMContact);
                        }
                    }
                }
            }
            for (SharePanelItemInfo sharePanelItemInfo3 : list2) {
                if (arrayList.size() >= LLILLJJLI.LJJIFFI) {
                    break;
                }
                int i2 = sharePanelItemInfo3.idType;
                if (i2 == EnumC1473605pm.SHARE_PANEL_ID_TYPE_USER.getValue()) {
                    String strValueOf = String.valueOf(sharePanelItemInfo3.uid);
                    if (!linkedHashSet.contains(strValueOf)) {
                        if (C0C64.LJIILLIIL().LJIIIZ(31744, "si_share_filter_msg_request", true, false) && (iMUser = (IMUser) linkedHashMap3.get(strValueOf)) != null && iMUser.getFollowStatus() != 2) {
                            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(C0YNP.LIZLLL(sharePanelItemInfo3.uid));
                            if (c0y8tLIZ == null || (!C882340YjQ.LJIIIIZZ(c0y8tLIZ) && !C882340YjQ.LJII(c0y8tLIZ))) {
                            }
                        }
                        if (((Boolean) LLJILJILJ.getValue()).booleanValue() && (list = sharePanelItemInfo3.flags) != null) {
                            Iterator<Flag> it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (Intrinsics.LJFF(next.key, "enable_quick_share_button_reverse_experiment")) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            Flag flag = next;
                            if (flag != null && (str = flag.value) != null && Boolean.parseBoolean(str)) {
                                arrayList8.add(strValueOf);
                            }
                        }
                        iMContactLJII2 = (IMContact) linkedHashMap3.get(strValueOf);
                        if (iMContactLJII2 != null) {
                            String uid3 = iMContactLJII2.getUid();
                            if (uid3 == null) {
                                uid3 = "";
                            }
                            linkedHashSet.add(uid3);
                            C1366870lfp.LIZ(iMContactLJII2, sharePanelItemInfo3, arrayList.size(), LLJI, false);
                            arrayList.add(iMContactLJII2);
                        }
                    }
                } else if (i2 == EnumC1473605pm.SHARE_PANEL_ID_TYPE_GROUP.getValue()) {
                    String strValueOf2 = String.valueOf(sharePanelItemInfo3.gid);
                    if (!linkedHashSet2.contains(strValueOf2) && (c0y8t2 = (C0Y8T) linkedHashMap4.get(strValueOf2)) != null) {
                        String conversationId2 = c0y8t2.getConversationId();
                        if (conversationId2 != null) {
                            linkedHashSet2.add(conversationId2);
                        }
                        IIMContactUtilService.LIZ.getClass();
                        IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
                        if (iIMContactUtilServiceLIZ != null && (iMContactLJII2 = iIMContactUtilServiceLIZ.LJII(c0y8t2)) != null) {
                            C1366870lfp.LIZ(iMContactLJII2, sharePanelItemInfo3, arrayList.size(), LLJI, false);
                            arrayList.add(iMContactLJII2);
                        }
                    }
                } else if (i2 == EnumC1473605pm.SHARE_PANEL_ID_TYPE_TAKO.getValue() && !LLILLJJLI.LJIILLIIL && (c1363660laeLJIJI = ((ITakoService) ServiceManager.get().getService(ITakoService.class)).LJIJI()) != null) {
                    iMContactLJII2 = new C1363710laj(c1363660laeLJIJI);
                    C1366870lfp.LIZ(iMContactLJII2, sharePanelItemInfo3, arrayList.size(), LLJI, false);
                    arrayList.add(iMContactLJII2);
                }
            }
            LJIJJ(arrayList);
            if (((Boolean) LLJILJILJ.getValue()).booleanValue()) {
                LLJILJIL = arrayList8;
            }
            if (c1366860lfo != null) {
                c1366860lfo.LIZIZ = arrayList.size();
                C1366860lfo.LIZJ(c1366860lfo);
            }
            ArrayList arrayList9 = new ArrayList();
            List<SharePanelItemInfo> listLJIIL = LJIIL();
            if (listLJIIL != null) {
                for (SharePanelItemInfo sharePanelItemInfo4 : listLJIIL) {
                    int i3 = sharePanelItemInfo4.idType;
                    if (i3 == EnumC1473605pm.SHARE_PANEL_ID_TYPE_USER.getValue()) {
                        iMContactLJII = (IMContact) linkedHashMap3.get(String.valueOf(sharePanelItemInfo4.uid));
                    } else if (i3 == EnumC1473605pm.SHARE_PANEL_ID_TYPE_GROUP.getValue() && (c0y8t = (C0Y8T) linkedHashMap4.get(String.valueOf(sharePanelItemInfo4.gid))) != null) {
                        IIMContactUtilService.LIZ.getClass();
                        IIMContactUtilService iIMContactUtilServiceLIZ2 = C913380ZsO.LIZ();
                        if (iIMContactUtilServiceLIZ2 != null) {
                            iMContactLJII = iIMContactUtilServiceLIZ2.LJII(c0y8t);
                        }
                    }
                    if (iMContactLJII != null) {
                        C1366870lfp.LIZ(iMContactLJII, sharePanelItemInfo4, arrayList9.size(), LLJI, true);
                        arrayList9.add(iMContactLJII);
                    }
                }
            }
            LLIZ = arrayList9;
            C1368260li4 c1368260li45 = LLILLL;
            if (c1368260li45 != null) {
                LLILLJJLI = c1368260li45;
            }
            LLILLL = null;
        } else {
            arrayList = new ArrayList();
            LJIJJ(arrayList);
        }
        if (interfaceC1366180lei != null) {
            interfaceC1366180lei.LIZIZ("end_filter_data");
            interfaceC1366180lei.LIZIZ("end_load_data");
        }
        return arrayList;
    }

    @Override // X.InterfaceC883330Yl1
    public final void LJII(EnumC883280Ykw enumC883280Ykw, C883460YlE c883460YlE) {
        LLILLJJLI = new C1368260li4(0, false);
        LLILZ.clear();
        LLIZLLLIL.clear();
        LLJ.clear();
        LLJI.clear();
        LLJIJIL = null;
        LLJILLL = true;
        LLJJ = 0L;
        if (!C289820BXo.LIZ()) {
            LJIILLIIL(null, EnumC1364450lbv.SOURCE_ACTION_COLD_BOOT.getValue(), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(int r22, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.im.common.model.SharePanelItemInfo>> r23) {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1366830lfl.LJIIJJI(int, X.05Vn):java.lang.Object");
    }

    public static void LJIILLIIL(String str, int i, InterfaceC1366080leY interfaceC1366080leY) {
        C1DFB c1dfb = C0PEM.LIZJ;
        C23250099c.LIZLLL(C2296808zG.LIZ(c1dfb), c1dfb.plus(new C1402360mb4(CoroutineExceptionHandler.LJJLIL, 1)), null, new C1366060leW(str, i, interfaceC1366080leY, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.List<com.ss.android.ugc.aweme.im.common.model.SharePanelItemInfo> r16, X.InterfaceC1366180lei r17, X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1366830lfl.LIZJ(java.util.List, X.0lei, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Type inference failed for: r27v0, types: [X.0lfl] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(int r28, java.lang.String r29, X.InterfaceC1364105Vn r30) {
        /*
            Method dump skipped, instruction units count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1366830lfl.LJFF(int, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LJIJI(int i, int i2, List list) {
        String strLIZIZ;
        if (i2 != 0) {
            Keva kevaLJIIIZ = LJIIIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("internal_share_sort_new");
            sbLIZ.append(i);
            sbLIZ.append("+_");
            sbLIZ.append(C461720I8s.LIZIZ());
            sbLIZ.append("+_fetch_failed");
            kevaLJIIIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        } else {
            Keva kevaLJIIIZ2 = LJIIIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("internal_share_sort_new");
            sbLIZ2.append(i);
            sbLIZ2.append("+_");
            sbLIZ2.append(C461720I8s.LIZIZ());
            sbLIZ2.append("+_fetch_failed");
            kevaLJIIIZ2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), false);
        }
        String strLIZIZ2 = C2093608Ic.LIZIZ(C051M.LJ(list, false));
        if (i == EnumC1364450lbv.SOURCE_ACTION_MINIS_PANEL.getValue()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('_');
            sbLIZ3.append(i);
            sbLIZ3.append("+_");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        } else {
            strLIZIZ = "";
        }
        Keva kevaLJIIIZ3 = LJIIIZ();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("internal_share_sort_new");
        sbLIZ4.append(strLIZIZ);
        sbLIZ4.append(C461720I8s.LIZIZ());
        kevaLJIIIZ3.storeString(C2188811AlT.LIZIZ(sbLIZ4), strLIZIZ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJ(java.util.List<com.ss.android.ugc.aweme.im.common.model.SharePanelItemInfo> r6, X.InterfaceC1366180lei r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1366950lfx
            if (r0 == 0) goto L4a
            r4 = r8
            X.0lfx r4 = (X.C1366950lfx) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L50
            X.0lei r7 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            if (r7 == 0) goto L2b
            java.lang.String r0 = "end_fetch_contact"
            r7.LIZIZ(r0)
        L2b:
            boolean r0 = X.C1366830lfl.LLJILLL
            if (r0 == 0) goto L32
            r0 = 0
            X.C1366830lfl.LLJILLL = r0
        L32:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L35:
            X.C155000ia.LIZIZ(r3)
            if (r7 == 0) goto L3f
            java.lang.String r0 = "start_fetch_contact"
            r7.LIZIZ(r0)
        L3f:
            r4.LL = r7
            r4.LLILZ = r1
            java.lang.Object r0 = r5.LIZJ(r6, r7, r4)
            if (r0 != r2) goto L24
            return r2
        L4a:
            X.0lfx r4 = new X.0lfx
            r4.<init>(r5, r8)
            goto L12
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1366830lfl.LJJ(java.util.List, X.0lei, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(int r6, boolean r7, X.InterfaceC1366180lei r8, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMContact>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C1366940lfw
            if (r0 == 0) goto L54
            r4 = r9
            X.0lfw r4 = (X.C1366940lfw) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r1 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 != r2) goto L5a
            boolean r7 = r4.LL
            X.0lei r8 = r4.LLILLJJLI
            X.C155000ia.LIZIZ(r1)
        L26:
            java.util.List r0 = LJJIFFI(r8, r7)
            return r0
        L2b:
            X.C155000ia.LIZIZ(r1)
            if (r8 == 0) goto L35
            java.lang.String r0 = "start_local_data"
            r8.LIZIZ(r0)
        L35:
            java.util.List r0 = r5.LJIIJ(r6)
            java.util.List r1 = X.C13LP.LLIIII(r0)
            LJIIL()
            if (r8 == 0) goto L47
            java.lang.String r0 = "end_local_data"
            r8.LIZIZ(r0)
        L47:
            r4.LLILLJJLI = r8
            r4.LL = r7
            r4.LLILZIL = r2
            java.lang.Object r0 = r5.LJJ(r1, r8, r4)
            if (r0 != r3) goto L26
            return r3
        L54:
            X.0lfw r4 = new X.0lfw
            r4.<init>(r5, r9)
            goto L12
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1366830lfl.LJIILIIL(int, boolean, X.0lei, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
    
        r1 = com.ss.android.ugc.aweme.im.contacts.api.model.IMUser.Companion;
        r0 = X.C461720I8s.LIZLLL();
        r1.getClass();
        r0 = X.C2201941BFw.LIZJ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c3, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        java.lang.Boolean.valueOf(r4.add(r0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[LOOP:0: B:16:0x0046->B:18:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128 A[LOOP:1: B:55:0x0122->B:57:0x0128, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMUser>] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJI(java.util.List<java.lang.String> r9, boolean r10, X.InterfaceC1366180lei r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1366830lfl.LJJI(java.util.List, boolean, X.0lei, X.05Vn):java.lang.Object");
    }

    public static Object LJIILL(C1366830lfl c1366830lfl, C1368260li4 c1368260li4, EnumC1364450lbv enumC1364450lbv, C1366160leg c1366160leg, InterfaceC1364105Vn interfaceC1364105Vn, int i) {
        int value;
        if ((i & 1) != 0) {
            c1368260li4 = null;
        }
        if ((i & 2) != 0) {
            enumC1364450lbv = null;
        }
        if ((i & 4) != 0) {
            c1366160leg = null;
        }
        c1366830lfl.getClass();
        if (c1366160leg != null) {
            c1366160leg.LIZIZ("start_load_data");
        }
        if (c1368260li4 != null) {
            LLILLL = LLILLJJLI;
            LLILLJJLI = c1368260li4;
        }
        if (!LLJILLL && !LLILLJJLI.LJJII) {
            if (c1366160leg != null) {
                c1366160leg.LIZ("hit_cache", "1");
            }
            return LJJIFFI(c1366160leg, false);
        }
        if (c1366160leg != null) {
            c1366160leg.LIZ("hit_cache", CardStruct.IStatusCode.DEFAULT);
        }
        if (enumC1364450lbv != null) {
            value = enumC1364450lbv.getValue();
        } else {
            value = EnumC1364450lbv.SOURCE_ACTION_UNKNOWN.getValue();
        }
        return c1366830lfl.LJIILIIL(value, false, c1366160leg, interfaceC1364105Vn);
    }
}
