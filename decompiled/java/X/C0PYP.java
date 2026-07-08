package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PYP, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PYP {
    public static final C0PYP LIZ = new C0PYP();

    public static boolean LIZ(C2189821An6 c2189821An6) {
        String eventType;
        String eventType2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkFeedParam ");
        if (c2189821An6 != null) {
            eventType = c2189821An6.getEventType();
        } else {
            eventType = null;
        }
        sbLIZ.append(eventType);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c2189821An6 != null && (eventType2 = c2189821An6.getEventType()) != null) {
            if (Intrinsics.LJFF(eventType2, "general_search") || Intrinsics.LJFF(eventType2, "search_result") || C1ER1.LIZIZ.LLJJL(eventType2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(boolean r4) {
        /*
            r3 = 1
            r2 = 0
            if (r4 != 0) goto Le
            com.bytedance.keva.Keva r1 = X.C0PYS.LIZ
            java.lang.String r0 = "has_entered_search_inner_flow"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L21
        Le:
            com.bytedance.keva.Keva r1 = X.C0PYS.LIZ
            java.lang.String r0 = "has_swiped_inner_flow"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L21
            java.lang.String r0 = "has_shown_guide"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L21
        L20:
            return r3
        L21:
            X.01GW r0 = X.C0BCH.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L20
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PYP.LIZJ(boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PYP.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static void LJ(Fragment fragment, int i, SearchMixFeed searchMixFeed, C19EG c19eg) {
        List<DynamicPatch.SearchMultiTabListData> awemeMultiTabList;
        String str;
        List<Aweme> awemeList;
        String str2;
        List<Aweme> awemeCards;
        String str3;
        String str4;
        List<Aweme> list;
        String str5;
        if (LIZJ(true) && ((Boolean) C287950BQj.LIZIZ.getValue()).booleanValue()) {
            Aweme aweme = searchMixFeed.getAweme();
            if (aweme != null) {
                DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
                if (dynamicPatch != null) {
                    str5 = dynamicPatch.schema;
                } else {
                    str5 = null;
                }
                LIZIZ(aweme, i, C649470Pdh.LJ(str5), searchMixFeed.getRank(), fragment, c19eg);
            }
            List<SearchUser> users = searchMixFeed.getUsers();
            if (users != null) {
                ArrayList arrayList = new ArrayList();
                for (SearchUser searchUser : users) {
                    SearchUser searchUser2 = searchUser;
                    if (searchUser2 != null && (list = searchUser2.awemeCards) != null && !list.isEmpty()) {
                        arrayList.add(searchUser);
                    }
                }
                ArrayList<Aweme> arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI(((SearchUser) it2.next()).awemeCards, arrayList2);
                }
                for (Aweme aweme2 : arrayList2) {
                    if (aweme2 != null) {
                        C0PYP c0pyp = LIZ;
                        DynamicPatch dynamicPatch2 = searchMixFeed.getDynamicPatch();
                        if (dynamicPatch2 != null) {
                            str4 = dynamicPatch2.schema;
                        } else {
                            str4 = null;
                        }
                        String strLJ = C649470Pdh.LJ(str4);
                        int rank = searchMixFeed.getRank();
                        c0pyp.getClass();
                        LIZIZ(aweme2, i, strLJ, rank, fragment, c19eg);
                    }
                }
            }
            SearchSpot hotSpot = searchMixFeed.getHotSpot();
            if (hotSpot != null && (awemeCards = hotSpot.getAwemeCards()) != null) {
                for (Aweme aweme3 : awemeCards) {
                    C0PYP c0pyp2 = LIZ;
                    DynamicPatch dynamicPatch3 = searchMixFeed.getDynamicPatch();
                    if (dynamicPatch3 != null) {
                        str3 = dynamicPatch3.schema;
                    } else {
                        str3 = null;
                    }
                    String strLJ2 = C649470Pdh.LJ(str3);
                    int rank2 = searchMixFeed.getRank();
                    c0pyp2.getClass();
                    LIZIZ(aweme3, i, strLJ2, rank2, fragment, c19eg);
                }
            }
            DynamicPatch dynamicPatch4 = searchMixFeed.getDynamicPatch();
            if (dynamicPatch4 != null && (awemeList = dynamicPatch4.getAwemeList()) != null) {
                for (Aweme aweme4 : awemeList) {
                    if (aweme4 != null) {
                        C0PYP c0pyp3 = LIZ;
                        DynamicPatch dynamicPatch5 = searchMixFeed.getDynamicPatch();
                        if (dynamicPatch5 != null) {
                            str2 = dynamicPatch5.schema;
                        } else {
                            str2 = null;
                        }
                        String strLJ3 = C649470Pdh.LJ(str2);
                        int rank3 = searchMixFeed.getRank();
                        c0pyp3.getClass();
                        LIZIZ(aweme4, i, strLJ3, rank3, fragment, c19eg);
                    }
                }
            }
            DynamicPatch dynamicPatch6 = searchMixFeed.getDynamicPatch();
            if (dynamicPatch6 != null && (awemeMultiTabList = dynamicPatch6.getAwemeMultiTabList()) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (DynamicPatch.SearchMultiTabListData searchMultiTabListData : awemeMultiTabList) {
                    List<Aweme> list2 = searchMultiTabListData.tabAwemeList;
                    if (list2 != null && !list2.isEmpty()) {
                        arrayList3.add(searchMultiTabListData);
                    }
                }
                ArrayList<Aweme> arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    C19719612Di.LJJI(((DynamicPatch.SearchMultiTabListData) it3.next()).tabAwemeList, arrayList4);
                }
                for (Aweme aweme5 : arrayList4) {
                    C0PYP c0pyp4 = LIZ;
                    DynamicPatch dynamicPatch7 = searchMixFeed.getDynamicPatch();
                    if (dynamicPatch7 != null) {
                        str = dynamicPatch7.schema;
                    } else {
                        str = null;
                    }
                    String strLJ4 = C649470Pdh.LJ(str);
                    int rank4 = searchMixFeed.getRank();
                    c0pyp4.getClass();
                    LIZIZ(aweme5, i, strLJ4, rank4, fragment, c19eg);
                }
            }
        }
    }

    public static void LIZIZ(Aweme aweme, int i, String str, int i2, Fragment fragment, C19EG c19eg) {
        ISearchContextAbility iSearchContextAbilityLIZJ;
        if (aweme != null && (iSearchContextAbilityLIZJ = C0Q3E.LIZJ(aweme)) != null) {
            iSearchContextAbilityLIZJ.fe(new C0P8M(new C0PYR(C650500PfM.LIZIZ(C640270P9l.LIZJ(fragment, c19eg)), Integer.valueOf(i), Integer.valueOf(i2), str)));
        }
    }
}
